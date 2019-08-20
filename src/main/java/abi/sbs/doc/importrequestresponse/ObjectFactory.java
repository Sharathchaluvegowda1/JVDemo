
package abi.sbs.doc.importrequestresponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the abi.sbs.doc.importrequestresponse package. 
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

    private final static QName _ImportRequestHeader_QNAME = new QName("http://abi/sbs/doc/importRequestResponse", "importRequestHeader");
    private final static QName _ImportResponseHeader_QNAME = new QName("http://abi/sbs/doc/importRequestResponse", "importResponseHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: abi.sbs.doc.importrequestresponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ImportRequestHeader }
     * 
     */
    public ImportRequestHeader createImportRequestHeader() {
        return new ImportRequestHeader();
    }

    /**
     * Create an instance of {@link ImportResponseHeader }
     * 
     */
    public ImportResponseHeader createImportResponseHeader() {
        return new ImportResponseHeader();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportRequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/importRequestResponse", name = "importRequestHeader")
    public JAXBElement<ImportRequestHeader> createImportRequestHeader(ImportRequestHeader value) {
        return new JAXBElement<ImportRequestHeader>(_ImportRequestHeader_QNAME, ImportRequestHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/doc/importRequestResponse", name = "importResponseHeader")
    public JAXBElement<ImportResponseHeader> createImportResponseHeader(ImportResponseHeader value) {
        return new JAXBElement<ImportResponseHeader>(_ImportResponseHeader_QNAME, ImportResponseHeader.class, null, value);
    }

}
