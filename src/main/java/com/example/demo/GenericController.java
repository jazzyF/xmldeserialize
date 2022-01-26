package com.example.demo;

import com.example.demo.domain.Performance;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping(value = "/perf", produces = { "application/xml" })
public class GenericController {

    private final XmlMapper xmlMapper;

    public GenericController(XmlMapper xmlMapper) {
        this.xmlMapper = xmlMapper;
    }

    @GetMapping
    public Performance getPerformance() throws XMLStreamException, IOException {
        InputStream xmlResource = GenericController.class.getClassLoader().getResourceAsStream("perf.xml");
        XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
        XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(xmlResource);
        return xmlMapper.readValue(xmlStreamReader, Performance.class);
    }

}
