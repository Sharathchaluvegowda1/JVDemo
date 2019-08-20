
package abi.sbs.doc.financial.jv_importdocument;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import abi.sbs.doc.financial.jvrequestresponse.JVResponseType;
import abi.sbs.doc.importrequestresponse.ImportResponseHeader;


/**
 * <p>Java class for ImportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://abi/sbs/doc/importRequestResponse}importResponseHeader"/&gt;
 *         &lt;element ref="{http://abi/sbs/doc/financial/JVRequestResponse}JVResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportResponse", propOrder = {
    "importResponseHeader",
    "jvResponse"
})
public class ImportResponse {

    @XmlElement(namespace = "http://abi/sbs/doc/importRequestResponse", required = true)
    protected ImportResponseHeader importResponseHeader;
    @XmlElement(name = "JVResponse", namespace = "http://abi/sbs/doc/financial/JVRequestResponse")
    protected JVResponseType jvResponse;

    /**
     * Gets the value of the importResponseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ImportResponseHeader }
     *     
     */
    public ImportResponseHeader getImportResponseHeader() {
        return importResponseHeader;
    }

    /**
     * Sets the value of the importResponseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportResponseHeader }
     *     
     */
    public void setImportResponseHeader(ImportResponseHeader value) {
        this.importResponseHeader = value;
    }

    /**
     * Gets the value of the jvResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JVResponseType }
     *     
     */
    public JVResponseType getJVResponse() {
        return jvResponse;
    }

    /**
     * Sets the value of the jvResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JVResponseType }
     *     
     */
    public void setJVResponse(JVResponseType value) {
        this.jvResponse = value;
    }

}
