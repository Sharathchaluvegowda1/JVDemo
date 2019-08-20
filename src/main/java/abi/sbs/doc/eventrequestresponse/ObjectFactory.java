
package abi.sbs.doc.eventrequestresponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the abi.sbs.doc.eventrequestresponse package. 
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

    private final static QName _EventRequestHeader_QNAME = new QName("http://abi/sbs/doc/eventRequestResponse", "eventRequestHeader");
    private final static QName _EventResponseHeader_QNAME = new QName("http://abi/sbs/doc/eventRequestResponse", "eventResponseHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: abi.sbs.doc.eventrequestresponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventRequestHeader }
     * 
     */
    public EventRequestHeader createEventRequestHeader() {
        return new EventRequestHeader();
    }

    /**
     * Create an instance of {@link EventResponseHeader }
     * 
     */
    public EventResponseHeader createEventResponseHeader() {
        return new EventResponseHeader();
    }

    /**
     * Create an instance of {@link MESSAGE }
     * 
     */
    public MESSAGE createMESSAGE() {
        return new MESSAGE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventRequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/eventRequestResponse", name = "eventRequestHeader")
    public JAXBElement<EventRequestHeader> createEventRequestHeader(EventRequestHeader value) {
        return new JAXBElement<EventRequestHeader>(_EventRequestHeader_QNAME, EventRequestHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/eventRequestResponse", name = "eventResponseHeader")
    public JAXBElement<EventResponseHeader> createEventResponseHeader(EventResponseHeader value) {
        return new JAXBElement<EventResponseHeader>(_EventResponseHeader_QNAME, EventResponseHeader.class, null, value);
    }

}
