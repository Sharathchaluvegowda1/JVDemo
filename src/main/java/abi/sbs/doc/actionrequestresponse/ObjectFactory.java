
package abi.sbs.doc.actionrequestresponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the abi.sbs.doc.actionrequestresponse package. 
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

    private final static QName _ActionRequestHeader_QNAME = new QName("http://abi/sbs/doc/actionRequestResponse", "actionRequestHeader");
    private final static QName _ActionResponseHeader_QNAME = new QName("http://abi/sbs/doc/actionRequestResponse", "actionResponseHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: abi.sbs.doc.actionrequestresponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActionRequestHeader }
     * 
     */
    public ActionRequestHeader createActionRequestHeader() {
        return new ActionRequestHeader();
    }

    /**
     * Create an instance of {@link ActionResponseHeader }
     * 
     */
    public ActionResponseHeader createActionResponseHeader() {
        return new ActionResponseHeader();
    }

    /**
     * Create an instance of {@link MESSAGE }
     * 
     */
    public MESSAGE createMESSAGE() {
        return new MESSAGE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionRequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/actionRequestResponse", name = "actionRequestHeader")
    public JAXBElement<ActionRequestHeader> createActionRequestHeader(ActionRequestHeader value) {
        return new JAXBElement<ActionRequestHeader>(_ActionRequestHeader_QNAME, ActionRequestHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/actionRequestResponse", name = "actionResponseHeader")
    public JAXBElement<ActionResponseHeader> createActionResponseHeader(ActionResponseHeader value) {
        return new JAXBElement<ActionResponseHeader>(_ActionResponseHeader_QNAME, ActionResponseHeader.class, null, value);
    }

}
