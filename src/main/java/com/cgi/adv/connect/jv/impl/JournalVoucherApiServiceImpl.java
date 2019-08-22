package com.cgi.adv.connect.jv.impl;

import org.apache.cxf.jaxrs.ext.MessageContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cgi.adv.connect.jv.api.JournalVoucherApi;
import com.cgi.adv.connect.jv.common.WebServiceResponseHeaderSetter;
import com.cgi.adv.connect.jv.model.JVrequestWrapper;
import com.cgi.adv.connect.jv.model.JVresponseWrapper;
import com.cgi.adv.connect.jv.model.ModelApiResponse;
import com.cgi.adv.connect.jv.model.TranDetail;
import com.cgi.adv.connect.jv.transform.JournalVoucherTransform;

/**
 * AC-FIN-JV_RequestResponse
 *
 * <p>
 * This is Advantage FIN Transaction Journal Voucher Web Service. Currently it
 * has GET, POST & PATCH method to allow export,import,submit,validate,discard a
 * transaction respectively.
 *
 */
@Component("journalVoucherApiServiceImpl")
public class JournalVoucherApiServiceImpl implements JournalVoucherApi {
	/**
	 * Import a JV transaction into Advantage
	 *
	 * The jv/transaction/import endpoint adds a Journal Voucher to Advantage.
	 * Imported transaction can be validated and submitted automatically.
	 * Transaction failing to validate can be automatically discarded or retained as
	 * drafts on the Advantage transaction catalog.
	 *
	 */

	private static final Logger LOGGER = LoggerFactory.getLogger(JournalVoucherApiServiceImpl.class);

	@Value("${sbs.service.username}")
	private String userName;

	@Value("${sbs.service.password}")
	private String password;

	@Value("${sbs.service.url}")
	private String soapEndpointURL;

	@javax.ws.rs.core.Context
	MessageContext messageContext;
	
	@Value("${gtwin.service.url}")
	private String gatewayInUrl;

	public ModelApiResponse callImport(JVrequestWrapper jvrequestWrapper) {

		ModelApiResponse apiResponse = null;
	
		String requestUrl = messageContext.getHttpServletRequest().getRequestURL().toString();
		gatewayInUrl =  requestUrl.substring(0, (requestUrl.length()-3));

		LOGGER.info("Inside callImport method ....");

		System.out.println("Username is = " + userName);
		System.out.println("password is = " + password);
		System.out.println("soapEndpointURL is = " + soapEndpointURL);

		// ModelApiResponse apiResponse
		try {
			JournalVoucherTransform jvTransform = new JournalVoucherTransform(userName, password, soapEndpointURL,
					ACCommonConstants.IMPORT_ACTION);
			apiResponse = jvTransform.transformJV(jvrequestWrapper);

			System.out.println("apiResponse is : " + apiResponse);

		} catch (Exception excp) {

			apiResponse.setStatusCode("500");
			apiResponse.setStatusText("Internal Exception is :" + excp.toString());

		}
		TranDetail transDetail = apiResponse.getTranDetail();
		apiResponse.setCorrelationId(messageContext.getHttpHeaders().getHeaderString(ACCommonConstants.CORRELATION_ID));
		apiResponse.setIntrospectionURL(gatewayInUrl+"introspection/"+apiResponse.getRequestId());
		if (transDetail != null)
			apiResponse.setTranDetail(transDetail.tranGetURL(gatewayInUrl+"jv/transCode/"+transDetail.getTranCode()+"/dept/"+transDetail.getDepartment()+"/transId/"+transDetail.getTranID()));
		WebServiceResponseHeaderSetter responseHeaderSetter = new WebServiceResponseHeaderSetter();
		responseHeaderSetter.setNon200SuccessRespHeader(messageContext.getHttpServletRequest(), apiResponse);

		return apiResponse;
	}

	/**
	 * Discards selected Transaction
	 *
	 * The jv/transaction/discard endpoint discards the specified transaction.
	 *
	 */
	public ModelApiResponse discard(String tranCode, String deptId, String tranId, JVrequestWrapper jvrequestWrapper) {
		// TODO: Implement...

		return null;
	}

	/**
	 * Export copies of selected transaction
	 *
	 * The jv/transaction/export endpoint exports a copy of Journal Voucher from
	 * Advantage.
	 *
	 */
	public JVresponseWrapper export(String tranCode, String deptId, String tranId, String includelinegroup,
			String includelinegroupaccounting, String includelinegroupaccountingposting) {
		// TODO: Implement...

		return null;
	}

	/**
	 * Submit a transaction into Advantage
	 *
	 * The jv/transaction/submit endpoint submits the specified transaction.
	 *
	 */
	public ModelApiResponse submit(String tranCode, String deptId, String tranId, JVrequestWrapper jvrequestWrapper) {
		// TODO: Implement...

		return null;
	}

	/**
	 * Validate selected Transaction
	 *
	 * The jv/transaction/validate endpoint validates the specified transaction.
	 *
	 */
	public ModelApiResponse validate(String tranCode, String deptId, String tranId, JVrequestWrapper jvrequestWrapper) {
		// TODO: Implement...

		return null;
	}

}
