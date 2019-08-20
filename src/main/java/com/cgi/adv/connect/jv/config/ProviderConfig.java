/*
* $Id: ACOrchRequestMetaData.java 2019-08-06 10:15:16 a.anand $
*
* Copyright (C) 2019, CGI Group Inc. All rights reserved.
*/
package com.cgi.adv.connect.jv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@Component
@Configuration
public class ProviderConfig {

            // This creates a singleton bean using name "jsonProvider" that is used by CXF.
            @Bean
            public JacksonJsonProvider jsonProvider() {
                        return new JacksonJsonProvider();
            }
}
