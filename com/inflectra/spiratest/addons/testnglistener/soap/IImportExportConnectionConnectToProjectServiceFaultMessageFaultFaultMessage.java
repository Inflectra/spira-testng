
package com.inflectra.spiratest.addons.testnglistener.soap;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "ServiceFaultMessage", targetNamespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0")
public class IImportExportConnectionConnectToProjectServiceFaultMessageFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ServiceFaultMessage faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public IImportExportConnectionConnectToProjectServiceFaultMessageFaultFaultMessage(String message, ServiceFaultMessage faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public IImportExportConnectionConnectToProjectServiceFaultMessageFaultFaultMessage(String message, ServiceFaultMessage faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.inflectra.spiratest.addons.junitextension.soap.ServiceFaultMessage
     */
    public ServiceFaultMessage getFaultInfo() {
        return faultInfo;
    }

}
