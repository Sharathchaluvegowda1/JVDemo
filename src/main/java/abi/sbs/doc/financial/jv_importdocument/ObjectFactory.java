
package abi.sbs.doc.financial.jv_importdocument;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the abi.sbs.doc.financial.jv_importdocument package. 
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

    private final static QName _JVImportDocument_QNAME = new QName("http://abi/sbs/doc/financial/JV_importDocument", "JV_importDocument");
    private final static QName _JVImportResponse_QNAME = new QName("http://abi/sbs/doc/financial/JV_importDocument", "JV_importResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: abi.sbs.doc.financial.jv_importdocument
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JVImportDocumentType }
     * 
     */
    public JVImportDocumentType createJVImportDocumentType() {
        return new JVImportDocumentType();
    }

    /**
     * Create an instance of {@link JVImportResponseType }
     * 
     */
    public JVImportResponseType createJVImportResponseType() {
        return new JVImportResponseType();
    }

    /**
     * Create an instance of {@link ImportRequest }
     * 
     */
    public ImportRequest createImportRequest() {
        return new ImportRequest();
    }

    /**
     * Create an instance of {@link ImportResponse }
     * 
     */
    public ImportResponse createImportResponse() {
        return new ImportResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link JVImportDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_importDocument", name = "JV_importDocument")
    public JAXBElement<JVImportDocumentType> createJVImportDocument(JVImportDocumentType value) {
        return new JAXBElement<JVImportDocumentType>(_JVImportDocument_QNAME, JVImportDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JVImportResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_importDocument", name = "JV_importResponse")
    public JAXBElement<JVImportResponseType> createJVImportResponse(JVImportResponseType value) {
        return new JAXBElement<JVImportResponseType>(_JVImportResponse_QNAME, JVImportResponseType.class, null, value);
    }

}
