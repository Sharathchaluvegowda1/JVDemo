package com.cgi.adv.connect.jv.common;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

// WebServicesResponseFilter filter will be used for multiple things: a) CORS; b) setting http status for 202/204 success scenarios.
@Component
@Provider
public class WebServicesResponseFilter implements ContainerResponseFilter {

	private static final String ACCEPTEDHTTPSTATUS = String.valueOf(Status.ACCEPTED.getStatusCode());
	private static final String BADREQUESTHTTPSTATUS = String.valueOf(Status.BAD_REQUEST.getStatusCode());
	private static final String INTERNALSERVERERRORHTTPSTATUS = String.valueOf(Status.INTERNAL_SERVER_ERROR.getStatusCode());
	private static final String GATEWAYTIMEOUTHTTPSTATUS = String.valueOf(Status.GATEWAY_TIMEOUT.getStatusCode());
	private static final String ADVCONNRESPHTTPSTATUS = "adv-conn-resp-httpstatus";

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {

    	// This requestContext property is set specifically by WS Impl classes to handle "non 200" success scenarios. 

    	System.out.println("Inside Filter class.......");
    	if (requestContext.getProperty(ADVCONNRESPHTTPSTATUS) != null) {

        	// This is because JAXRS web services do not normally "return a response xml/json and also set 202 http resp status". 
    		// We need to do that since we always try to return ModelApiResponse json. 
    		if (requestContext.getProperty(ADVCONNRESPHTTPSTATUS).equals(ACCEPTEDHTTPSTATUS)) {
    			responseContext.setStatus(Status.ACCEPTED.getStatusCode());
    		}
    		
    		// in case of "bad data", sometimes return value is an empty list/array. So, in that case, we still need to return 204 as HTTP response. 
    		if (requestContext.getProperty(ADVCONNRESPHTTPSTATUS).equals(BADREQUESTHTTPSTATUS)) {
    			responseContext.setStatus(Status.BAD_REQUEST.getStatusCode());
    		}
    		
    		// in case of "internal server error", sometimes return value is an empty list/array. So, in that case, we still need to return 204 as HTTP response. 
    		if (requestContext.getProperty(ADVCONNRESPHTTPSTATUS).equals(INTERNALSERVERERRORHTTPSTATUS)) {
    			responseContext.setStatus(Status.INTERNAL_SERVER_ERROR.getStatusCode());
    		}
    		
    		// in case of "gateway timeout", sometimes return value is an empty list/array. So, in that case, we still need to return 204 as HTTP response. 
    		if (requestContext.getProperty(ADVCONNRESPHTTPSTATUS).equals(GATEWAYTIMEOUTHTTPSTATUS)) {
    			responseContext.setStatus(Status.GATEWAY_TIMEOUT.getStatusCode());
    		}
    	}

    	// take care of CORS also here. Right now, it is hard-coded; we will use configuration later on. 
    	responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");

    }
}
