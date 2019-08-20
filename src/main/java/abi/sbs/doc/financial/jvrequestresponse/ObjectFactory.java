
package abi.sbs.doc.financial.jvrequestresponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the abi.sbs.doc.financial.jvrequestresponse package. 
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

    private final static QName _JVResponse_QNAME = new QName("http://abi/sbs/doc/financial/JVRequestResponse", "JVResponse");
    private final static QName _JVRequest_QNAME = new QName("http://abi/sbs/doc/financial/JVRequestResponse", "JVRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: abi.sbs.doc.financial.jvrequestresponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JVResponseType }
     * 
     */
    public JVResponseType createJVResponseType() {
        return new JVResponseType();
    }

    /**
     * Create an instance of {@link JVRequestType }
     * 
     */
    public JVRequestType createJVRequestType() {
        return new JVRequestType();
    }

    /**
     * Create an instance of {@link JVResponseActgType }
     * 
     */
    public JVResponseActgType createJVResponseActgType() {
        return new JVResponseActgType();
    }

    /**
     * Create an instance of {@link JVResponseLngrpType }
     * 
     */
    public JVResponseLngrpType createJVResponseLngrpType() {
        return new JVResponseLngrpType();
    }

    /**
     * Create an instance of {@link JVRequestLngrpType }
     * 
     */
    public JVRequestLngrpType createJVRequestLngrpType() {
        return new JVRequestLngrpType();
    }

    /**
     * Create an instance of {@link JVRequestActgType }
     * 
     */
    public JVRequestActgType createJVRequestActgType() {
        return new JVRequestActgType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JVResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JVRequestResponse", name = "JVResponse")
    public JAXBElement<JVResponseType> createJVResponse(JVResponseType value) {
        return new JAXBElement<JVResponseType>(_JVResponse_QNAME, JVResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JVRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JVRequestResponse", name = "JVRequest")
    public JAXBElement<JVRequestType> createJVRequest(JVRequestType value) {
        return new JAXBElement<JVRequestType>(_JVRequest_QNAME, JVRequestType.class, null, value);
    }

}
