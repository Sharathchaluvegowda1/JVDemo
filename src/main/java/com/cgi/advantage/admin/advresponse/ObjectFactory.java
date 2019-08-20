
package com.cgi.advantage.admin.advresponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cgi.advantage.admin.advresponse package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResponseHeader_QNAME = new QName("http://www.cgi.com/Advantage/Admin/AdvResponse", "ResponseHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cgi.advantage.admin.advresponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseHeader }
     * 
     */
    public ResponseHeader createResponseHeader() {
        return new ResponseHeader();
    }

    /**
     * Create an instance of {@link ResponseMessages }
     * 
     */
    public ResponseMessages createResponseMessages() {
        return new ResponseMessages();
    }

    /**
     * Create an instance of {@link ReturnStatus }
     * 
     */
    public ReturnStatus createReturnStatus() {
        return new ReturnStatus();
    }

    /**
     * Create an instance of {@link ReturnMessage }
     * 
     */
    public ReturnMessage createReturnMessage() {
        return new ReturnMessage();
    }

    /**
     * Create an instance of {@link Parameter }
     * 
     */
    public Parameter createParameter() {
        return new Parameter();
    }

    /**
     * Create an instance of {@link RelatesTo }
     * 
     */
    public RelatesTo createRelatesTo() {
        return new RelatesTo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cgi.com/Advantage/Admin/AdvResponse", name = "ResponseHeader")
    public JAXBElement<ResponseHeader> createResponseHeader(ResponseHeader value) {
        return new JAXBElement<ResponseHeader>(_ResponseHeader_QNAME, ResponseHeader.class, null, value);
    }

}
