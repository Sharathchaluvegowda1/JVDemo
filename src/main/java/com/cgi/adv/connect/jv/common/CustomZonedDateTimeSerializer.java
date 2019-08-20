/*
* $Id: CustomZonedDateTimeSerializer.java 2019-07-18 14:15:16 a.anand $
*
* Copyright (C) 2019, CGI Group Inc. All rights reserved.
*/

package com.cgi.adv.connect.jv.common;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.datatype.jsr310.ser.ZonedDateTimeSerializer;

public class CustomZonedDateTimeSerializer extends ZonedDateTimeSerializer {

	private static final long serialVersionUID = 1L;
	
	private static final DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ISO_INSTANT;

	@Override
	public void serialize(ZonedDateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException {

		gen.writeString(customDateTimeFormatter.format(value));
	}

}
