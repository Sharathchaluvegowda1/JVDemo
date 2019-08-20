/*
* $Id: CustomZonedDateTimeDeser.java 2019-07-18 14:15:16 a.anand $
*
* Copyright (C) 2019, CGI Group Inc. All rights reserved.
*/
package com.cgi.adv.connect.jv.common;

import java.io.IOException;
import java.time.ZonedDateTime;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class CustomZonedDateTimeDeser extends JsonDeserializer<ZonedDateTime> {

    @Override
    public ZonedDateTime deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext) throws IOException {
        String data = jsonparser.getText();
        return ZonedDateTime.parse(data);
    }
    
  }