package com.cgi.adv.connect.jv.transform;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import com.cgi.adv.connect.jv.model.ErrorMessages;
import com.cgi.adv.connect.jv.model.JVrequestRootEntity;
import com.cgi.adv.connect.jv.model.JVrequestWrapper;
import com.cgi.adv.connect.jv.model.ModelApiResponse;
import com.cgi.adv.connect.jv.model.TranDetail;
import com.cgi.advantage.admin.advresponse.ReturnMessage;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

import abi.sbs.doc.financial.jv_importdocument.JVImportResponseType;

public class JournalVoucherTransform {

	private String userID;
	private String pwd;
	private String soapUrl;
	private String soapAction;

	public JournalVoucherTransform(String userIDVal, String passwordVal, String urlVal, String soapActionVal) {

		userID = userIDVal;
		pwd = passwordVal;
		soapUrl = urlVal;
		soapAction = soapActionVal;
	}

	public static void main(String[] args) {
		ModelApiResponse apiResponse = new ModelApiResponse();
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			FileInputStream input = new FileInputStream("C:\\Users\\sharath.chaluvegowda\\Desktop\\xslt\\JVRequest_ver2.json");
			JVrequestWrapper jvrequestRootEntity = objectMapper.readValue(input, JVrequestWrapper.class);
			System.out.println("JSON Root: " + jvrequestRootEntity.toString());

			JournalVoucherTransform jvtransform = new JournalVoucherTransform("sa", "advantage",
					"http://CUST-INTFIN40:8280/SBSWebServices/GADocumentServices",
					"http://abi/sbs/doc/financial/GADocumentServices#JV_import");

			// Serialize the JSON request into XML
			final ByteArrayOutputStream loByteArrayOutputStream = new ByteArrayOutputStream();
			Result jvrequestroot = new StreamResult(loByteArrayOutputStream);
			JAXBContext jaxbContext = JAXBContext.newInstance(JVrequestRootEntity.class);
			Marshaller loJAXBMarshaller = jaxbContext.createMarshaller();
			loJAXBMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
			// loJAXBMarshaller.setProperty(
			// Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			loJAXBMarshaller.marshal(jvrequestRootEntity.getJvrequestRootEntity(), jvrequestroot);
			System.out.println("Initial XML: " + loByteArrayOutputStream.toString());

			/*********************************************************************************/
			// take the copy of the OutputStream and re-write it to an InputStream

			PipedInputStream loPipedInputStream = new PipedInputStream();
			final PipedOutputStream loPipedOutputStream = new PipedOutputStream(loPipedInputStream);
			new Thread(new Runnable() {
				public void run() {
					try {
						// write the original OutputStream to the PipedOutputStream
						loByteArrayOutputStream.writeTo(loPipedOutputStream);
						loPipedOutputStream.close();
					} catch (IOException e) {
						// logging and exception handling should go here
					}
				}
			}).start();

			// Transform the XML into UpperCamelCase
			final ByteArrayOutputStream loByteArrayOutputStream2 = new ByteArrayOutputStream();
			Result jvrequestroot2 = new StreamResult(loByteArrayOutputStream2);
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory
					.newTransformer(new StreamSource("src\\main\\resources\\styleSheet\\UpperCamelCase.xslt"));
			transformer.transform(new StreamSource(loPipedInputStream), jvrequestroot2);
			String xmlContent = loByteArrayOutputStream2.toString();
			System.err.println("xmlContent after tranformation = " + xmlContent);

			StringBuilder jvrequestXML = new StringBuilder();
			jvrequestXML = jvtransform.generateSoapEnv();
			jvrequestXML.append("<jv:JV_importDocument>");
			jvrequestXML.append(jvtransform.generateHeader());
			xmlContent = xmlContent.replaceAll("<JVrequestRootEntity>", "<Payload><RequestList><ImportRequest>");
			xmlContent = xmlContent.replaceAll("</JVrequestRootEntity>", "</ImportRequest></RequestList></Payload>");
			xmlContent = xmlContent.replaceAll("<TranRequestHeaderEntity>", "<imp:importRequestHeader>");
			xmlContent = xmlContent.replaceAll("</TranRequestHeaderEntity>", "</imp:importRequestHeader>");
			xmlContent = xmlContent.replaceAll("<JvrequestEntity>", "<jv1:JVRequest>");
			xmlContent = xmlContent.replaceAll("</JvrequestEntity>", "</jv1:JVRequest>");
			xmlContent = xmlContent.replaceAll("<JvrequestLineGroupEntity>", "<JVRequestLngrp>");
			xmlContent = xmlContent.replaceAll("<TranCode>", "<DocCode>");
			xmlContent = xmlContent.replaceAll("</TranCode>", "</DocCode>");

			// ImportRequestHeader changes
			xmlContent = xmlContent.replaceAll("<TranDepartmentCode>", "<Department>");
			xmlContent = xmlContent.replaceAll("</TranDepartmentCode>", "</Department>");
			xmlContent = xmlContent.replaceAll("<TranID>", "<DocID>");
			xmlContent = xmlContent.replaceAll("</TranID>", "</DocID>");
			xmlContent = xmlContent.replaceAll("<ValidateTransaction>", "<ValidateDocument>");
			xmlContent = xmlContent.replaceAll("</ValidateTransaction>", "</ValidateDocument>");
			xmlContent = xmlContent.replaceAll("<SubmitTransaction>", "<SubmitDocument>");
			xmlContent = xmlContent.replaceAll("</SubmitTransaction>", "</SubmitDocument>");
			xmlContent = xmlContent.replaceAll("<DiscardDraftTransaction>", "<DiscardDraftDocument>");
			xmlContent = xmlContent.replaceAll("</DiscardDraftTransaction>", "</DiscardDraftDocument>");
			xmlContent = xmlContent.replaceAll("<AssignTranID>", "<AssignDocID>");
			xmlContent = xmlContent.replaceAll("</AssignTranID>", "</AssignDocID>");
			xmlContent = xmlContent.replaceAll("<TranIDPrefix>", "<DocIDPrefix>");
			xmlContent = xmlContent.replaceAll("</TranIDPrefix>", "</DocIDPrefix>");
			// End ImportRequestHeader changes

			xmlContent = xmlContent.replaceAll("</JvrequestLineGroupEntity>", "</JVRequestLngrp>");
			xmlContent = xmlContent.replaceAll("<JvrequestAccountingEntity>", "<JVRequestActg>");
			xmlContent = xmlContent.replaceAll("</JvrequestAccountingEntity>", "</JVRequestActg>");
			/*******************************************************************************/
			jvrequestXML.append(xmlContent);
			jvrequestXML.append("</AdvMessage></jv:JV_importDocument>");
			jvrequestXML.append(jvtransform.generateSoapEnvEnd());
			System.out.println(jvrequestXML.toString());
			apiResponse = jvtransform.callSBSService(jvrequestXML.toString());

			/*** Only for test will be removed ***/
			ObjectMapper loObjectMapper = new ObjectMapper();
			loObjectMapper.setSerializationInclusion(Include.NON_EMPTY);
			loObjectMapper.setSerializationInclusion(Include.NON_NULL);
			// DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			// loObjectMapper.setDateFormat(df);
			String lsJSONResponse = loObjectMapper.writeValueAsString(apiResponse);

			System.err.println("loAdvResponse = " + lsJSONResponse);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public ModelApiResponse transformJV(JVrequestWrapper jvrequestWrapper) {
		ModelApiResponse apiResponse = new ModelApiResponse();
		try {
			System.out.println("JSON Root: " + jvrequestWrapper.toString());

			// Serialize the JSON request into XML
			final ByteArrayOutputStream loByteArrayOutputStream = new ByteArrayOutputStream();
			Result jvrequestroot = new StreamResult(loByteArrayOutputStream);
			JAXBContext jaxbContext = JAXBContext.newInstance(JVrequestRootEntity.class);
			Marshaller loJAXBMarshaller = jaxbContext.createMarshaller();
			loJAXBMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
			// loJAXBMarshaller.setProperty(
			// Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			loJAXBMarshaller.marshal(jvrequestWrapper.getJvrequestRootEntity(), jvrequestroot);
			System.out.println("Initial XML: " + loByteArrayOutputStream.toString());

			// take the copy of the OutputStream and re-write it to an InputStream
			PipedInputStream loPipedInputStream = new PipedInputStream();
			final PipedOutputStream loPipedOutputStream = new PipedOutputStream(loPipedInputStream);
			new Thread(new Runnable() {
				public void run() {
					try {
						// write the original OutputStream to the PipedOutputStream
						loByteArrayOutputStream.writeTo(loPipedOutputStream);
						loPipedOutputStream.close();
					} catch (IOException e) {
						// logging and exception handling should go here
					}
				}
			}).start();

			// Transform the XML into UpperCamelCase
			final ByteArrayOutputStream loByteArrayOutputStream2 = new ByteArrayOutputStream();
			Result jvrequestroot2 = new StreamResult(loByteArrayOutputStream2);
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			InputStream input = classLoader.getResourceAsStream("UpperCamelCase.xslt");
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory
					.newTransformer( new StreamSource(input));
			transformer.transform(new StreamSource(loPipedInputStream), jvrequestroot2);
			String xmlContent = loByteArrayOutputStream2.toString();
			System.err.println("xmlContent after tranformation = " + xmlContent);

			StringBuilder jvrequestXML = new StringBuilder();
			jvrequestXML = generateSoapEnv();
			jvrequestXML.append("<jv:JV_importDocument>");
			jvrequestXML.append(generateHeader());
			/*********************************************************************************/

			xmlContent = xmlContent.replaceAll("<JVrequestRootEntity>", "<Payload><RequestList><ImportRequest>");
			xmlContent = xmlContent.replaceAll("</JVrequestRootEntity>", "</ImportRequest></RequestList></Payload>");
			xmlContent = xmlContent.replaceAll("<TranRequestHeaderEntity>", "<imp:importRequestHeader>");
			xmlContent = xmlContent.replaceAll("</TranRequestHeaderEntity>", "</imp:importRequestHeader>");
			xmlContent = xmlContent.replaceAll("<JvrequestEntity>", "<jv1:JVRequest>");
			xmlContent = xmlContent.replaceAll("</JvrequestEntity>", "</jv1:JVRequest>");
			xmlContent = xmlContent.replaceAll("<JvrequestLineGroupEntity>", "<JVRequestLngrp>");
			xmlContent = xmlContent.replaceAll("<TranCode>", "<DocCode>");
			xmlContent = xmlContent.replaceAll("</TranCode>", "</DocCode>");

			// ImportRequestHeader changes
			xmlContent = xmlContent.replaceAll("<TranDepartmentCode>", "<Department>");
			xmlContent = xmlContent.replaceAll("</TranDepartmentCode>", "</Department>");
			xmlContent = xmlContent.replaceAll("<TranID>", "<DocID>");
			xmlContent = xmlContent.replaceAll("</TranID>", "</DocID>");
			xmlContent = xmlContent.replaceAll("<ValidateTransaction>", "<ValidateDocument>");
			xmlContent = xmlContent.replaceAll("</ValidateTransaction>", "</ValidateDocument>");
			xmlContent = xmlContent.replaceAll("<SubmitTransaction>", "<SubmitDocument>");
			xmlContent = xmlContent.replaceAll("</SubmitTransaction>", "</SubmitDocument>");
			xmlContent = xmlContent.replaceAll("<DiscardDraftTransaction>", "<DiscardDraftDocument>");
			xmlContent = xmlContent.replaceAll("</DiscardDraftTransaction>", "</DiscardDraftDocument>");
			xmlContent = xmlContent.replaceAll("<AssignTranID>", "<AssignDocID>");
			xmlContent = xmlContent.replaceAll("</AssignTranID>", "</AssignDocID>");
			xmlContent = xmlContent.replaceAll("<TranIDPrefix>", "<DocIDPrefix>");
			xmlContent = xmlContent.replaceAll("</TranIDPrefix>", "</DocIDPrefix>");
			// End ImportRequestHeader changes

			xmlContent = xmlContent.replaceAll("</JvrequestLineGroupEntity>", "</JVRequestLngrp>");
			xmlContent = xmlContent.replaceAll("<JvrequestAccountingEntity>", "<JVRequestActg>");
			xmlContent = xmlContent.replaceAll("</JvrequestAccountingEntity>", "</JVRequestActg>");
			/*******************************************************************************/
			jvrequestXML.append(xmlContent);
			jvrequestXML.append("</AdvMessage></jv:JV_importDocument>");
			jvrequestXML.append(generateSoapEnvEnd());
			System.out.println(jvrequestXML.toString());
			apiResponse = callSBSService(jvrequestXML.toString());
		} catch (Exception e1) {

			e1.printStackTrace();
		}
		return apiResponse;
	}

	private StringBuilder generateHeader() {
		StringBuilder header = new StringBuilder();
		header.append("<AdvMessage>");
		header.append("<adv:Header><adv:Subject><adv:UserID>");
		header.append(userID); // to be read from property
		header.append("</adv:UserID><adv:Password>");
		header.append(pwd); // to be read from property
		header.append("</adv:Password></adv:Subject></adv:Header>");
		System.out.println("header: " + header);
		return header;
	}

	private StringBuilder generateSoapEnv() {
		StringBuilder soapEnv = new StringBuilder();
		soapEnv.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"");
		soapEnv.append(" xmlns:jv=\"http://abi/sbs/doc/financial/JV_importDocument\"");
		soapEnv.append(" xmlns:adv=\"http://www.cgi.com/Advantage/Admin/AdvServiceHeader\"");
		soapEnv.append(" xmlns:imp=\"http://abi/sbs/doc/importRequestResponse\"");
		soapEnv.append(" xmlns:jv1=\"http://abi/sbs/doc/financial/JVRequestResponse\">");
		soapEnv.append("<soapenv:Header/><soapenv:Body>");
		System.out.println("soapEnv: " + soapEnv);
		return soapEnv;
	}

	private StringBuilder generateSoapEnvEnd() {
		StringBuilder soapEnvEnd = new StringBuilder();
		soapEnvEnd.append("</soapenv:Body>");
		soapEnvEnd.append("</soapenv:Envelope>");
		System.out.println("soapEnvEnd: " + soapEnvEnd);
		return soapEnvEnd;
	}

	private ModelApiResponse callSBSService(String soapRequest) {
		// Create the connection with http
		URL url;
		String inputLine;
		try {
			url = new URL(soapUrl);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
			con.setRequestProperty("SOAPAction", soapAction);
			con.setDoOutput(true);
			DataOutputStream out = new DataOutputStream(con.getOutputStream());
			out.writeBytes(soapRequest);
			out.flush();
			out.close();

			int responseCode = con.getResponseCode();
			System.out.println(responseCode);
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			switch (responseCode) {
			case 200:
			case 201:
			case 202:{
				System.out.println("response:" + response.toString());
				return buildResponse(response.toString());
			}
			case 404:{
				return buildErrroResponse(responseCode, con.getResponseMessage());
			}
			default: {
				System.err.println("Post Event call has failed");
				return buildErrroResponse(500, "Internal Exception");
			}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return buildErrroResponse(500, "Internal Exception = "+e.getMessage());
		}
	}

	private ModelApiResponse buildResponse(String foResultSource) {
		String aifErrorCode = null;
		String statusCode = null;
		String statusText = null;
		ModelApiResponse responseObj = new ModelApiResponse();

		try {
			foResultSource = foResultSource.replaceAll("JV_importResponse", "JVImportResponseType");
			SOAPMessage message = MessageFactory.newInstance().createMessage(null,
					new ByteArrayInputStream(foResultSource.getBytes()));

			Unmarshaller loUnmarshaller = JAXBContext.newInstance(JVImportResponseType.class).createUnmarshaller();

			JVImportResponseType loAdvResponse = (JVImportResponseType) loUnmarshaller
					.unmarshal(message.getSOAPBody().extractContentAsDocument());
			if (loAdvResponse != null && loAdvResponse.getResponseHeader() != null) {
				List<ReturnMessage> errorMessages = loAdvResponse.getResponseHeader().getResponseMessages()
						.getMessage();

				responseObj.setRequestId(String.valueOf(System.currentTimeMillis()));
				String responseCode = loAdvResponse.getResponseHeader().getStatus().getCode();

				responseObj.setHttpStatusCode(Integer.valueOf(loAdvResponse.getResponseHeader().getStatus().getCode()));

				if (responseCode.equals("400")) {
					aifErrorCode = "AIF-00101";
					statusCode = "FAILURE";
					statusText = loAdvResponse.getResponseHeader().getStatus().getMessage();
				} else if (responseCode.equals("200") || responseCode.equals("201")) {
					statusCode = "SUCCESS";
					statusText = "Import Successful";
				} else if (responseCode.equals("202")) {
					statusCode = "ACCEPTED";
					statusText = "Transaction Accepted";
				}
				responseObj.setErrorId(aifErrorCode);
				responseObj.setStatusCode(statusCode);
				responseObj.setStatusText(statusText);
				// Get the Advantage generated error messages
				List<ErrorMessages> respErrorList = new ArrayList<>();
				if (!responseCode.equals("200")) {
					for (ReturnMessage retMessage : errorMessages) {
						ErrorMessages respError = new ErrorMessages();
						respError.setErrorCode(retMessage.getCode());
						respError.setErrorMessage(retMessage.getMessage());
						respError.setErrorSeverity(retMessage.getSeverity());
						// respError.setSource(retMessage.getSource());
						// respError.setType(retMessage.getType());
						respErrorList.add(respError);
					}
				}
				responseObj.setErrorMessages(respErrorList);

				if (loAdvResponse.getResponsePayload() != null && loAdvResponse.getResponsePayload().getResponseList() != null
						&& !loAdvResponse.getResponsePayload().getResponseList().getImportResponse().isEmpty() )
				{
					// Get the Advantage Document Details
					TranDetail tranDetail = new TranDetail();
					//tranDetail.setTranCode("JV");
					tranDetail.setTranCode(loAdvResponse.getResponsePayload().getResponseList().getImportResponse().get(0)
							.getImportResponseHeader().getDocCode());
					//tranDetail.setDepartment("001");
					tranDetail.setDepartment(loAdvResponse.getResponsePayload().getResponseList().getImportResponse().get(0)
							.getImportResponseHeader().getDepartment());
					//tranDetail.setTranID("Dtest1");
					tranDetail.setTranID(loAdvResponse.getResponsePayload().getResponseList().getImportResponse().get(0)
							.getImportResponseHeader().getDocID());
					//tranDetail.setTranStatus("Rejected");
					tranDetail.setTranStatus(loAdvResponse.getResponsePayload().getResponseList().getImportResponse().get(0)
							.getImportResponseHeader().getDocStatus().value());
					responseObj.setTranDetail(tranDetail);
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return responseObj;
	}

	private ModelApiResponse buildErrroResponse(int responeCd, String responseMesg) {
		ModelApiResponse responseObj = new ModelApiResponse();

		try {
			responseObj.setRequestId(String.valueOf(System.currentTimeMillis()));
			responseObj.setHttpStatusCode(responeCd);
			responseObj.setStatusCode("FAILURE");
			responseObj.setStatusText(responseMesg);
			responseObj.setErrorId("AIF-00201");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responseObj;
	}


}
