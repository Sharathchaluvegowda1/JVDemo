
package abi.sbs.doc.financial.jv_exportdocument;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import abi.sbs.doc.exportrequestresponse.ExportResponseHeader;
import abi.sbs.doc.financial.jvrequestresponse.JVResponseType;


/**
 * <p>Java class for ExportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://abi/sbs/doc/exportRequestResponse}exportResponseHeader"/&gt;
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
@XmlType(name = "ExportResponse", propOrder = {
    "exportResponseHeader",
    "jvResponse"
})
public class ExportResponse {

    @XmlElement(namespace = "http://abi/sbs/doc/exportRequestResponse", required = true)
    protected ExportResponseHeader exportResponseHeader;
    @XmlElement(name = "JVResponse", namespace = "http://abi/sbs/doc/financial/JVRequestResponse")
    protected JVResponseType jvResponse;

    /**
     * Gets the value of the exportResponseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ExportResponseHeader }
     *     
     */
    public ExportResponseHeader getExportResponseHeader() {
        return exportResponseHeader;
    }

    /**
     * Sets the value of the exportResponseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportResponseHeader }
     *     
     */
    public void setExportResponseHeader(ExportResponseHeader value) {
        this.exportResponseHeader = value;
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
