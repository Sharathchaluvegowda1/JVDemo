
package abi.sbs.doc.financial.jv_exportdocument;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import abi.sbs.doc.exportrequestresponse.ExportRequestHeader;
import abi.sbs.doc.financial.jvrequestresponse.JVRequestType;


/**
 * <p>Java class for ExportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://abi/sbs/doc/exportRequestResponse}exportRequestHeader"/&gt;
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
@XmlType(name = "ExportRequest", propOrder = {
    "exportRequestHeader",
    "jvRequest"
})
public class ExportRequest {

    @XmlElement(namespace = "http://abi/sbs/doc/exportRequestResponse", required = true)
    protected ExportRequestHeader exportRequestHeader;
    @XmlElement(name = "JVRequest", namespace = "http://abi/sbs/doc/financial/JVRequestResponse")
    protected JVRequestType jvRequest;

    /**
     * Gets the value of the exportRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ExportRequestHeader }
     *     
     */
    public ExportRequestHeader getExportRequestHeader() {
        return exportRequestHeader;
    }

    /**
     * Sets the value of the exportRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportRequestHeader }
     *     
     */
    public void setExportRequestHeader(ExportRequestHeader value) {
        this.exportRequestHeader = value;
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
