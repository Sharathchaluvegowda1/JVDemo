
package abi.sbs.doc.financial.jv_importdocument;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.cgi.advantage.admin.advresponse.ResponseHeader;


/**
 * <p>Java class for JV_ImportResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JV_ImportResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cgi.com/Advantage/Admin/AdvResponse}ResponseHeader"/&gt;
 *         &lt;element name="ResponsePayload" type="{http://abi/sbs/doc/financial/JV_importDocument}ResponsePayload"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "JVImportResponseType")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JV_ImportResponseType", propOrder = {
    "responseHeader",
    "responsePayload"
})
public class JVImportResponseType {

    @XmlElement(name = "ResponseHeader", namespace = "http://www.cgi.com/Advantage/Admin/AdvResponse", required = true)
    protected ResponseHeader responseHeader;
    @XmlElement(name = "ResponsePayload", required = true)
    protected ResponsePayload responsePayload;

    /**
     * Gets the value of the responseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeader }
     *     
     */
    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the value of the responseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeader }
     *     
     */
    public void setResponseHeader(ResponseHeader value) {
        this.responseHeader = value;
    }

    /**
     * Gets the value of the responsePayload property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePayload }
     *     
     */
    public ResponsePayload getResponsePayload() {
        return responsePayload;
    }

    /**
     * Sets the value of the responsePayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePayload }
     *     
     */
    public void setResponsePayload(ResponsePayload value) {
        this.responsePayload = value;
    }

}
