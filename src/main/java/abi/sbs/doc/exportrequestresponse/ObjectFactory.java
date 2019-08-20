
package abi.sbs.doc.exportrequestresponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the abi.sbs.doc.exportrequestresponse package. 
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

    private final static QName _ExportRequestHeader_QNAME = new QName("http://abi/sbs/doc/exportRequestResponse", "exportRequestHeader");
    private final static QName _ExportResponseHeader_QNAME = new QName("http://abi/sbs/doc/exportRequestResponse", "exportResponseHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: abi.sbs.doc.exportrequestresponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExportRequestHeader }
     * 
     */
    public ExportRequestHeader createExportRequestHeader() {
        return new ExportRequestHeader();
    }

    /**
     * Create an instance of {@link ExportResponseHeader }
     * 
     */
    public ExportResponseHeader createExportResponseHeader() {
        return new ExportResponseHeader();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportRequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/exportRequestResponse", name = "exportRequestHeader")
    public JAXBElement<ExportRequestHeader> createExportRequestHeader(ExportRequestHeader value) {
        return new JAXBElement<ExportRequestHeader>(_ExportRequestHeader_QNAME, ExportRequestHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/exportRequestResponse", name = "exportResponseHeader")
    public JAXBElement<ExportResponseHeader> createExportResponseHeader(ExportResponseHeader value) {
        return new JAXBElement<ExportResponseHeader>(_ExportResponseHeader_QNAME, ExportResponseHeader.class, null, value);
    }

}
