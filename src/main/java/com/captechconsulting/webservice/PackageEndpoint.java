package com.captechconsulting.webservice;

import com.captechconsulting.webservice.generated.packages.*;
import com.captechconsulting.webservice.generated.packages.Error;
import org.joda.time.DateTime;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

@Endpoint
public class PackageEndpoint {

    private static final String NAMESPACE = "http://captechconsulting.com/xmlschema/package";

    @PayloadRoot(localPart = "PackageRequest", namespace = NAMESPACE)
    @ResponsePayload
    public PackageResponse storePackage(@RequestPayload PackageRequest packageRequest) {

        try {
            if (packageRequest.getPackageId() == 1) {
                return createPackage1Response();
            } else if (packageRequest.getPackageId() == 2) {
                return createPackage2Response();
            } else {
                return createErrorResponse(2, "No package Id in request");
            }
        } catch (DatatypeConfigurationException e) {
            return createErrorResponse(1, "Unexpected exception");
        }

    }

    private PackageResponse createPackage1Response() throws DatatypeConfigurationException {
        PackageResponse response = new PackageResponse();
        response.setLocations(new PackageResponse.Locations());
        response.getLocations().getLocation().add(createLocation(1021, new DateTime(), false));
        response.getLocations().getLocation().add(createLocation(1010, new DateTime().minusDays(1), false));
        response.getLocations().getLocation().add(createLocation(1001, new DateTime().minusDays(2), true));
        return response;
    }

    private PackageResponse createPackage2Response() throws DatatypeConfigurationException {
        PackageResponse response = new PackageResponse();
        response.setLocations(new PackageResponse.Locations());
        response.getLocations().getLocation().add(createLocation(2132, new DateTime(), false));
        response.getLocations().getLocation().add(createLocation(2011, new DateTime().minusDays(1), false));
        response.getLocations().getLocation().add(createLocation(2101, new DateTime().minusDays(2), false));
        response.getLocations().getLocation().add(createLocation(2211, new DateTime().minusDays(3), false));
        response.getLocations().getLocation().add(createLocation(1202, new DateTime().minusDays(4), true));
        return response;
    }

    private PackageResponse.Locations.Location createLocation(int locationId, DateTime scanDateTime, boolean origin) throws DatatypeConfigurationException {
        final PackageResponse.Locations.Location location = new PackageResponse.Locations.Location();
        location.setLocationId(locationId);
        location.setDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(scanDateTime.toGregorianCalendar()));
        location.setOrigin(origin);
        return location;
    }

    private PackageResponse createErrorResponse(int code, String message) {
        PackageResponse response = new PackageResponse();
        response.setError(new Error());
        response.getError().setCode(code);
        response.getError().setMessage(message);
        return response;

    }

}
