
package abi.sbs.doc.financial.jv_actiondocument;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the abi.sbs.doc.financial.jv_actiondocument package. 
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

    private final static QName _JVDiscardDocument_QNAME = new QName("http://abi/sbs/doc/financial/JV_actionDocument", "JV_discardDocument");
    private final static QName _JVDiscardResponse_QNAME = new QName("http://abi/sbs/doc/financial/JV_actionDocument", "JV_discardResponse");
    private final static QName _JVOtherDocument_QNAME = new QName("http://abi/sbs/doc/financial/JV_actionDocument", "JV_otherDocument");
    private final static QName _JVOtherResponse_QNAME = new QName("http://abi/sbs/doc/financial/JV_actionDocument", "JV_otherResponse");
    private final static QName _JVSubmitDocument_QNAME = new QName("http://abi/sbs/doc/financial/JV_actionDocument", "JV_submitDocument");
    private final static QName _JVSubmitResponse_QNAME = new QName("http://abi/sbs/doc/financial/JV_actionDocument", "JV_submitResponse");
    private final static QName _JVEcmexportDocument_QNAME = new QName("http://abi/sbs/doc/financial/JV_actionDocument", "JV_ecmexportDocument");
    private final static QName _JVEcmexportResponse_QNAME = new QName("http://abi/sbs/doc/financial/JV_actionDocument", "JV_ecmexportResponse");
    private final static QName _JVEcmimportDocument_QNAME = new QName("http://abi/sbs/doc/financial/JV_actionDocument", "JV_ecmimportDocument");
    private final static QName _JVEcmimportResponse_QNAME = new QName("http://abi/sbs/doc/financial/JV_actionDocument", "JV_ecmimportResponse");
    private final static QName _JVValidateDocument_QNAME = new QName("http://abi/sbs/doc/financial/JV_actionDocument", "JV_validateDocument");
    private final static QName _JVValidateResponse_QNAME = new QName("http://abi/sbs/doc/financial/JV_actionDocument", "JV_validateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: abi.sbs.doc.financial.jv_actiondocument
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JVActionDocumentType }
     * 
     */
    public JVActionDocumentType createJVActionDocumentType() {
        return new JVActionDocumentType();
    }

    /**
     * Create an instance of {@link JVActionResponseType }
     * 
     */
    public JVActionResponseType createJVActionResponseType() {
        return new JVActionResponseType();
    }

    /**
     * Create an instance of {@link ActionRequest }
     * 
     */
    public ActionRequest createActionRequest() {
        return new ActionRequest();
    }

    /**
     * Create an instance of {@link ActionResponse }
     * 
     */
    public ActionResponse createActionResponse() {
        return new ActionResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link JVActionDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_actionDocument", name = "JV_discardDocument")
    public JAXBElement<JVActionDocumentType> createJVDiscardDocument(JVActionDocumentType value) {
        return new JAXBElement<JVActionDocumentType>(_JVDiscardDocument_QNAME, JVActionDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JVActionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_actionDocument", name = "JV_discardResponse")
    public JAXBElement<JVActionResponseType> createJVDiscardResponse(JVActionResponseType value) {
        return new JAXBElement<JVActionResponseType>(_JVDiscardResponse_QNAME, JVActionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JVActionDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_actionDocument", name = "JV_otherDocument")
    public JAXBElement<JVActionDocumentType> createJVOtherDocument(JVActionDocumentType value) {
        return new JAXBElement<JVActionDocumentType>(_JVOtherDocument_QNAME, JVActionDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JVActionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_actionDocument", name = "JV_otherResponse")
    public JAXBElement<JVActionResponseType> createJVOtherResponse(JVActionResponseType value) {
        return new JAXBElement<JVActionResponseType>(_JVOtherResponse_QNAME, JVActionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JVActionDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_actionDocument", name = "JV_submitDocument")
    public JAXBElement<JVActionDocumentType> createJVSubmitDocument(JVActionDocumentType value) {
        return new JAXBElement<JVActionDocumentType>(_JVSubmitDocument_QNAME, JVActionDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JVActionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_actionDocument", name = "JV_submitResponse")
    public JAXBElement<JVActionResponseType> createJVSubmitResponse(JVActionResponseType value) {
        return new JAXBElement<JVActionResponseType>(_JVSubmitResponse_QNAME, JVActionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JVActionDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_actionDocument", name = "JV_ecmexportDocument")
    public JAXBElement<JVActionDocumentType> createJVEcmexportDocument(JVActionDocumentType value) {
        return new JAXBElement<JVActionDocumentType>(_JVEcmexportDocument_QNAME, JVActionDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JVActionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_actionDocument", name = "JV_ecmexportResponse")
    public JAXBElement<JVActionResponseType> createJVEcmexportResponse(JVActionResponseType value) {
        return new JAXBElement<JVActionResponseType>(_JVEcmexportResponse_QNAME, JVActionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JVActionDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_actionDocument", name = "JV_ecmimportDocument")
    public JAXBElement<JVActionDocumentType> createJVEcmimportDocument(JVActionDocumentType value) {
        return new JAXBElement<JVActionDocumentType>(_JVEcmimportDocument_QNAME, JVActionDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JVActionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_actionDocument", name = "JV_ecmimportResponse")
    public JAXBElement<JVActionResponseType> createJVEcmimportResponse(JVActionResponseType value) {
        return new JAXBElement<JVActionResponseType>(_JVEcmimportResponse_QNAME, JVActionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JVActionDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_actionDocument", name = "JV_validateDocument")
    public JAXBElement<JVActionDocumentType> createJVValidateDocument(JVActionDocumentType value) {
        return new JAXBElement<JVActionDocumentType>(_JVValidateDocument_QNAME, JVActionDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JVActionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_actionDocument", name = "JV_validateResponse")
    public JAXBElement<JVActionResponseType> createJVValidateResponse(JVActionResponseType value) {
        return new JAXBElement<JVActionResponseType>(_JVValidateResponse_QNAME, JVActionResponseType.class, null, value);
    }

}
