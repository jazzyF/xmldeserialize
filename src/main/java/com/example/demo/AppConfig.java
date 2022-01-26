package com.example.demo;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.codehaus.stax2.XMLOutputFactory2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public XmlMapper xmlMapper() {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.getFactory().getXMLOutputFactory().setProperty(XMLOutputFactory2.P_AUTOMATIC_NS_PREFIX, "");
        return xmlMapper;
    }

}
