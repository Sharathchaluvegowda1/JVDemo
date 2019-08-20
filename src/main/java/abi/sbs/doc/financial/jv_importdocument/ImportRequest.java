
package abi.sbs.doc.financial.jv_importdocument;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import abi.sbs.doc.financial.jvrequestresponse.JVRequestType;
import abi.sbs.doc.importrequestresponse.ImportRequestHeader;


/**
 * <p>Java class for ImportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://abi/sbs/doc/importRequestResponse}importRequestHeader"/&gt;
 *         &lt;element ref="{http://abi/sbs/doc/financial/JVRequestResponse}JVRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportRequest", propOrder = {
    "importRequestHeader",
    "jvRequest"
})
public class ImportRequest {

    @XmlElement(namespace = "http://abi/sbs/doc/importRequestResponse", required = true)
    protected ImportRequestHeader importRequestHeader;
    @XmlElement(name = "JVRequest", namespace = "http://abi/sbs/doc/financial/JVRequestResponse")
    protected JVRequestType jvRequest;

    /**
     * Gets the value of the importRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ImportRequestHeader }
     *     
     */
    public ImportRequestHeader getImportRequestHeader() {
        return importRequestHeader;
    }

    /**
     * Sets the value of the importRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportRequestHeader }
     *     
     */
    public void setImportRequestHeader(ImportRequestHeader value) {
        this.importRequestHeader = value;
    }

    /**
     * Gets the value of the jvRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JVRequestType }
     *     
     */
    public JVRequestType getJVRequest() {
        return jvRequest;
    }

    /**
     * Sets the value of the jvRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JVRequestType }
     *     
     */
    public void setJVRequest(JVRequestType value) {
        this.jvRequest = value;
    }

}
