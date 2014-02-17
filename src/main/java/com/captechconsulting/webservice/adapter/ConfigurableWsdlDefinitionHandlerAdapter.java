package com.captechconsulting.webservice.adapter;

import org.springframework.ws.transport.http.WsdlDefinitionHandlerAdapter;

import javax.servlet.http.HttpServletRequest;

public class ConfigurableWsdlDefinitionHandlerAdapter extends WsdlDefinitionHandlerAdapter {

    private String endpointUrl;

    @Override
    protected String transformLocation(String location, HttpServletRequest request) {

        StringBuilder url = new StringBuilder(endpointUrl);
        if (location.startsWith("/") && endpointUrl.endsWith("/")) {
            url.append(location.substring(1));
        } else {
            url.append(location);
        }
        return url.toString();
    }

    public void setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }
}
