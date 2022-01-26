package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@JsonPropertyOrder({
        "PerformanceNumber", "ReferencePerformanceNumber", "OrderNumber", "AgencyTransactionID", "PerformanceDate", "TransactionDate",
        "AccountingPeriod", "Comments", "PreparedByFullName", "PreparedByPhoneNumber", "PreparedByEmailAddressText", "PerformanceType",
        "BuySellIndicator", "PerformanceDetails", "DisbursingOfficeSymbol", "DocumentReferenceNumber", "TransferDate", "DocumentStatusCode"
})
public class PerformanceHeader {
    @JacksonXmlProperty(localName = "PerformanceNumber", namespace = "ns0")
    private String PerformanceNumber;
    @JacksonXmlProperty(localName = "ReferencePerformanceNumber", namespace = "ns0")
    private String ReferencePerformanceNumber;
    @JacksonXmlProperty(localName = "OrderNumber", namespace = "ns0")
    private String OrderNumber;
    @JacksonXmlProperty(localName = "AgencyTransactionID", namespace = "ns0")
    private String AgencyTransactionID;
    @JacksonXmlProperty(localName = "PerformanceDate", namespace = "ns0")
    private Date PerformanceDate;
    @JacksonXmlProperty(localName = "TransactionDate", namespace = "ns0")
    private Date TransactionDate;
    @JacksonXmlProperty(localName = "AccountingPeriod", namespace = "ns0")
    private String AccountingPeriod;
    @JacksonXmlProperty(localName = "Comments", namespace = "ns0")
    private String Comments;
    @JacksonXmlProperty(localName = "PreparedByFullName", namespace = "ns0")
    private String PreparedByFullName;
    @JacksonXmlProperty(localName = "PreparedByPhoneNumber", namespace = "ns0")
    private String PreparedByPhoneNumber;
    @JacksonXmlProperty(localName = "PreparedByEmailAddressText", namespace = "ns0")
    private String PreparedByEmailAddressText;
    @JacksonXmlProperty(localName = "PerformanceType", namespace = "ns0")
    private String PerformanceType;
    @JacksonXmlProperty(localName = "BuySellIndicator", namespace = "ns0")
    private String BuySellIndicator;
    @JacksonXmlElementWrapper(localName = "PerformanceDetails", namespace = "ns0")
    @JacksonXmlProperty(localName = "PerformanceDetail", namespace = "ns0")
    private List<PerformanceDetail> PerformanceDetails;
    @JacksonXmlProperty(localName = "DisbursingOfficeSymbol", namespace = "ns0")
    private String DisbursingOfficeSymbol;
    @JacksonXmlProperty(localName = "DocumentReferenceNumber", namespace = "ns0")
    private String DocumentReferenceNumber;
    @JacksonXmlProperty(localName = "TransferDate", namespace = "ns0")
    private Date TransferDate;
    @JacksonXmlProperty(localName = "DocumentStatusCode", namespace = "ns0")
    private String DocumentStatusCode;
}
