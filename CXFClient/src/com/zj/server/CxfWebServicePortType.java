
package com.zj.server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CxfWebServicePortType", targetNamespace = "http://server.zj.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CxfWebServicePortType {


    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://server.zj.com/", className = "com.zj.server.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://server.zj.com/", className = "com.zj.server.SayHelloResponse")
    public void sayHello();

}