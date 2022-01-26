package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JacksonXmlRootElement(localName = "ns1:Performance")
@JsonPropertyOrder({"PerformanceHeader"})
public class Performance {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns0")
    private String ns0 = "urn:my:com:perf";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns1")
    private String ns1 = "urn:my:com:perf:inv:Performance";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:xsi")
    private String xsi = "http://www.w3.org/2001/XMLSchema-instance";
    @JacksonXmlProperty(isAttribute = true, localName = "schemaLocation", namespace = "xsi")
    public String schemaLocation = "urn:my:com:perf:inv:Performance Performance.xsd";
    @JacksonXmlProperty(localName = "PerformanceHeader", namespace = "ns0")
    private PerformanceHeader PerformanceHeader;
}
