
package com.inflectra.spiratest.addons.testnglistener.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="remoteRelease" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects}RemoteRelease" minOccurs="0"/>
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
    "remoteRelease"
})
@XmlRootElement(name = "Release_Update")
public class ReleaseUpdate {

    @XmlElementRef(name = "remoteRelease", namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", type = JAXBElement.class)
    protected JAXBElement<RemoteRelease> remoteRelease;

    /**
     * Gets the value of the remoteRelease property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemoteRelease }{@code >}
     *     
     */
    public JAXBElement<RemoteRelease> getRemoteRelease() {
        return remoteRelease;
    }

    /**
     * Sets the value of the remoteRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemoteRelease }{@code >}
     *     
     */
    public void setRemoteRelease(JAXBElement<RemoteRelease> value) {
        this.remoteRelease = ((JAXBElement<RemoteRelease> ) value);
    }

}
