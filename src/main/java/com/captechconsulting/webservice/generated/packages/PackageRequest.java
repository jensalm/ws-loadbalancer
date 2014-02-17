
package com.captechconsulting.webservice.generated.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "packageId"
})
@XmlRootElement(name = "PackageRequest", namespace = "http://captechconsulting.com/xmlschema/package")
public class PackageRequest {

    @XmlElement(namespace = "http://captechconsulting.com/xmlschema/package")
    protected long packageId;

    /**
     * Gets the value of the packageId property.
     * 
     */
    public long getPackageId() {
        return packageId;
    }

    /**
     * Sets the value of the packageId property.
     * 
     */
    public void setPackageId(long value) {
        this.packageId = value;
    }

}
