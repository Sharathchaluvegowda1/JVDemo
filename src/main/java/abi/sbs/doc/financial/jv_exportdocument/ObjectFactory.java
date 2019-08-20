
package abi.sbs.doc.financial.jv_exportdocument;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the abi.sbs.doc.financial.jv_exportdocument package. 
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

    private final static QName _JVExportDocument_QNAME = new QName("http://abi/sbs/doc/financial/JV_exportDocument", "JV_exportDocument");
    private final static QName _JVExportResponse_QNAME = new QName("http://abi/sbs/doc/financial/JV_exportDocument", "JV_exportResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: abi.sbs.doc.financial.jv_exportdocument
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JVExportDocumentType }
     * 
     */
    public JVExportDocumentType createJVExportDocumentType() {
        return new JVExportDocumentType();
    }

    /**
     * Create an instance of {@link JVExportResponseType }
     * 
     */
    public JVExportResponseType createJVExportResponseType() {
        return new JVExportResponseType();
    }

    /**
     * Create an instance of {@link ExportRequest }
     * 
     */
    public ExportRequest createExportRequest() {
        return new ExportRequest();
    }

    /**
     * Create an instance of {@link ExportResponse }
     * 
     */
    public ExportResponse createExportResponse() {
        return new ExportResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link JVExportDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_exportDocument", name = "JV_exportDocument")
    public JAXBElement<JVExportDocumentType> createJVExportDocument(JVExportDocumentType value) {
        return new JAXBElement<JVExportDocumentType>(_JVExportDocument_QNAME, JVExportDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JVExportResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/financial/JV_exportDocument", name = "JV_exportResponse")
    public JAXBElement<JVExportResponseType> createJVExportResponse(JVExportResponseType value) {
        return new JAXBElement<JVExportResponseType>(_JVExportResponse_QNAME, JVExportResponseType.class, null, value);
    }

}
