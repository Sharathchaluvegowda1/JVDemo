
package abi.sbs.msg.message;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the abi.sbs.msg.message package. 
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

    private final static QName _Message_QNAME = new QName("http://abi/sbs/msg/MESSAGE", "message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: abi.sbs.msg.message
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MESSAGE }
     * 
     */
    public MESSAGE createMESSAGE() {
        return new MESSAGE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MESSAGE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abi/sbs/msg/MESSAGE", name = "message")
    public JAXBElement<MESSAGE> createMessage(MESSAGE value) {
        return new JAXBElement<MESSAGE>(_Message_QNAME, MESSAGE.class, null, value);
    }

}
