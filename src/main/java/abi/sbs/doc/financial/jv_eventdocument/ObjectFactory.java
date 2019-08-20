
package abi.sbs.doc.financial.jv_eventdocument;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the abi.sbs.doc.financial.jv_eventdocument package. 
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

    private final static QName _JVNotifyDocument_QNAME = new QName("http://abi/sbs/doc/financial/JV_eventDocument", "JV_notifyDocument");
    private final static QName _JVNotifyResponse_QNAME = new QName("http://abi/sbs/doc/financial/JV_eventDocument", "JV_notifyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: abi.sbs.doc.financial.jv_eventdocument
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JVEventDocumentType }
     * 
     */
    public JVEventDocumentType createJVEventDocumentType() {
        return new JVEventDocumentType();
    }

    /**
     * Create an instance of {@link JVEventResponseType }
     * 
     */
    public JVEventResponseType createJVEventResponseType() {
        return new JVEventResponseType();
    }

    /**
     * Create an instance of {@link EventRequest }
     * 
     */
    public EventRequest createEventRequest() {
        return new EventRequest();
    }

    /**
     * Create an instance of {@link EventResponse }
     * 
     */
    public EventResponse createEventResponse() {
        return new EventResponse();
    }

    /**
     * Create an instance of {@link AdvMessage }
     * 
     */
    public AdvMessage createAdvMessage() {
        return new AdvMessage();
    }

    /**
     * Create an instance of {@link Payload }
     * 
     */
    public Payload createPayload() {
        return new Payload();
    }

    /**
     * Create an instance of {@link RequestList }
     * 
     */
    public RequestList createRequestList() {
        return new RequestList();
    }

    /**
     * Create an instance of {@link ResponsePayload }
     * 
     */
    public ResponsePayload createResponsePayload() {
        return new ResponsePayload();
    }

    /**
     * Create an instance of {@link ResponseList }
     * 
     */
    public ResponseList createResponseList() {
        return new ResponseList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JVEventDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_eventDocument", name = "JV_notifyDocument")
    public JAXBElement<JVEventDocumentType> createJVNotifyDocument(JVEventDocumentType value) {
        return new JAXBElement<JVEventDocumentType>(_JVNotifyDocument_QNAME, JVEventDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JVEventResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_eventDocument", name = "JV_notifyResponse")
    public JAXBElement<JVEventResponseType> createJVNotifyResponse(JVEventResponseType value) {
        return new JAXBElement<JVEventResponseType>(_JVNotifyResponse_QNAME, JVEventResponseType.class, null, value);
    }

}
