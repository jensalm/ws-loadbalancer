
package com.captechconsulting.webservice.generated.packages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="locations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="location" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="locationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="error" type="{http://captechconsulting.com/xmlschema/package}error" minOccurs="0"/>
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
    "locations",
    "error"
})
@XmlRootElement(name = "PackageResponse", namespace = "http://captechconsulting.com/xmlschema/package")
public class PackageResponse {

    @XmlElement(namespace = "http://captechconsulting.com/xmlschema/package")
    protected PackageResponse.Locations locations;
    @XmlElement(namespace = "http://captechconsulting.com/xmlschema/package")
    protected Error error;

    /**
     * Gets the value of the locations property.
     * 
     * @return
     *     possible object is
     *     {@link PackageResponse.Locations }
     *     
     */
    public PackageResponse.Locations getLocations() {
        return locations;
    }

    /**
     * Sets the value of the locations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageResponse.Locations }
     *     
     */
    public void setLocations(PackageResponse.Locations value) {
        this.locations = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }


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
     *         &lt;element name="location" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="locationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "location"
    })
    public static class Locations {

        @XmlElement(namespace = "http://captechconsulting.com/xmlschema/package")
        protected List<PackageResponse.Locations.Location> location;

        /**
         * Gets the value of the location property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the location property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PackageResponse.Locations.Location }
         * 
         * 
         */
        public List<PackageResponse.Locations.Location> getLocation() {
            if (location == null) {
                location = new ArrayList<PackageResponse.Locations.Location>();
            }
            return this.location;
        }


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
         *         &lt;element name="locationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "locationId",
            "date",
            "origin"
        })
        public static class Location {

            @XmlElement(namespace = "http://captechconsulting.com/xmlschema/package")
            protected long locationId;
            @XmlElement(namespace = "http://captechconsulting.com/xmlschema/package", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar date;
            @XmlElement(namespace = "http://captechconsulting.com/xmlschema/package")
            protected boolean origin;

            /**
             * Gets the value of the locationId property.
             * 
             */
            public long getLocationId() {
                return locationId;
            }

            /**
             * Sets the value of the locationId property.
             * 
             */
            public void setLocationId(long value) {
                this.locationId = value;
            }

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDate() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDate(XMLGregorianCalendar value) {
                this.date = value;
            }

            /**
             * Gets the value of the origin property.
             * 
             */
            public boolean isOrigin() {
                return origin;
            }

            /**
             * Sets the value of the origin property.
             * 
             */
            public void setOrigin(boolean value) {
                this.origin = value;
            }

        }

    }

}
