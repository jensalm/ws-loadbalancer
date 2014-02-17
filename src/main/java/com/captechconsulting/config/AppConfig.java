package com.captechconsulting.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

@Configuration
@ComponentScan(basePackages = {"com.captechconsulting"})
@ImportResource("classpath:/spring-ws.xml")
@EnableTransactionManagement
public class AppConfig {

    @Bean
    public Jaxb2Marshaller createMarshaller() {
        final Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan(new String[]{"com.captechconsulting.webservice.generated.packages"});
        return marshaller;
    }

}
