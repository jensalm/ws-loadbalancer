package com.captechconsulting.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
@ComponentScan(basePackages = {"com.captechconsulting"})
public class AppConfig {

    @Bean
    public Jaxb2Marshaller createMarshaller() {
        final Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan(new String[]{"com.captechconsulting.webservice.generated.packages"});
        return marshaller;
    }

}
