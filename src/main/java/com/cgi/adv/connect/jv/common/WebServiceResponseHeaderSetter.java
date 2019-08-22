package com.cgi.adv.connect.jv.common;

import javax.servlet.http.HttpServletRequest;

import com.cgi.adv.connect.jv.model.ModelApiResponse;

public class WebServiceResponseHeaderSetter {

	public void setNon200SuccessRespHeader(HttpServletRequest httpReq, ModelApiResponse responseModel) {
		
		System.out.println("Inside setNon200SuccessRespHeader method  befor if condition status Code= "+responseModel.getHttpStatusCode());

		// In respModel, HTTP Status Code should be an integer. assuming
		if (responseModel.getHttpStatusCode() == 202 || responseModel.getHttpStatusCode() == 400
				|| responseModel.getHttpStatusCode() == 500 || responseModel.getHttpStatusCode() == 504) {
			
			System.out.println("Inside setNon200SuccessRespHeader method if condition");

			// set specific headers only for 202/400/500/504 SUCCESS scenario
			// In this case, we are setting this attribute/property in Request
			// so that Response Filter can check this property value and set Response HTTP
			// status
			// accordingly.
			// 202 - This is because when we need to set 202 Accepted http resp status and
			// also return ModelAPIResponse json. valid for POST/PATCH.
			// 204 - This is because when we need to set 204 No Data Found http resp status
			// and also might have to return an empty array. valid for GET.
			// // check data type of httpstatuscode in respModel and change accordingly here
			// and in Filter class.
			httpReq.setAttribute("adv-conn-resp-httpstatus", String.valueOf(responseModel.getHttpStatusCode()));
		}
	}

}
