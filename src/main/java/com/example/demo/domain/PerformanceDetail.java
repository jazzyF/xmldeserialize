package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@NoArgsConstructor
@JsonPropertyOrder({
		"PerformanceDetailNumber", "ReferenceDetailNumber", "ReferenceDetailNumber",
		"LineNumber", "OrderScheduleNumber", "FinalIndicator", "Quantity", "UnitofMeasure",
		"UnitofMeasureDescription", "UnitPriceAmount"
})
public class PerformanceDetail {
	@JacksonXmlProperty(localName = "PerformanceDetailNumber", namespace = "ns0")
	private BigInteger PerformanceDetailNumber;
	@JacksonXmlProperty(localName = "ReferenceDetailNumber", namespace = "ns0")
	private BigInteger ReferenceDetailNumber;
	@JacksonXmlProperty(localName = "LineNumber", namespace = "ns0")
	private Integer LineNumber;
	@JacksonXmlProperty(localName = "OrderScheduleNumber", namespace = "ns0")
	private BigInteger OrderScheduleNumber;
	@JacksonXmlProperty(localName = "FinalIndicator", namespace = "ns0")
	private String FinalIndicator;
	@JacksonXmlProperty(localName = "Quantity", namespace = "ns0")
	private Integer Quantity;
	@JacksonXmlProperty(localName = "UnitofMeasure", namespace = "ns0")
	private String UnitofMeasure;
	@JacksonXmlProperty(localName = "UnitofMeasureDescription", namespace = "ns0")
	private String UnitofMeasureDescription;
	@JacksonXmlProperty(localName = "UnitPriceAmount", namespace = "ns0")
	private Double UnitPriceAmount;
}
