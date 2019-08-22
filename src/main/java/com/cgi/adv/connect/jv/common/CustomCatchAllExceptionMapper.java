/*
* $Id: CustomCatchAllExceptionMapper.java 2019-07-22 14:15:16 a.anand $
*
* Copyright (C) 2019, CGI Group Inc. All rights reserved.
*/
package com.cgi.adv.connect.jv.common;


import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.beans.factory.annotation.Autowired;

import com.cgi.adv.connect.jv.model.ModelApiResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

@Provider
public class CustomCatchAllExceptionMapper implements ExceptionMapper<Throwable> {

	@Autowired
	ObjectMapper objectMapper;

	@Override
	public Response toResponse(final Throwable exception) {

		final int status;
		ModelApiResponse respModel = new ModelApiResponse();
		
		if (exception instanceof WebApplicationException) {
			WebApplicationException webAppException = (WebApplicationException) exception;
			Response exceptionResponse = webAppException.getResponse();

			status = exceptionResponse.getStatus();
			respModel.setStatusText(exception.getMessage());

		} else if (exception instanceof NullPointerException){

			// any other exception
			status = Response.Status.INTERNAL_SERVER_ERROR.getStatusCode();
			respModel.setStatusText(Response.Status.INTERNAL_SERVER_ERROR.getReasonPhrase() + exception.toString());
		}
		else {
			// any other exception
			status = Response.Status.INTERNAL_SERVER_ERROR.getStatusCode();
			respModel.setStatusText(Response.Status.INTERNAL_SERVER_ERROR.getReasonPhrase() + exception.getMessage());

		}
		
		respModel.setStatusCode(String.valueOf(status));
		respModel.setStatusCode("FAILURE");

		return Response.status(status).entity(respModel).type("application/json").build();
	}
}