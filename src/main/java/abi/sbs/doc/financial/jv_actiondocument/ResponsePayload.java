
package abi.sbs.doc.financial.jv_actiondocument;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponsePayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsePayload"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseList" type="{http://abi/sbs/doc/financial/JV_actionDocument}ResponseList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsePayload", propOrder = {
    "responseList"
})
public class ResponsePayload {

    @XmlElement(name = "ResponseList")
    protected ResponseList responseList;

    /**
     * Gets the value of the responseList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseList }
     *     
     */
    public ResponseList getResponseList() {
        return responseList;
    }

    /**
     * Sets the value of the responseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseList }
     *     
     */
    public void setResponseList(ResponseList value) {
        this.responseList = value;
    }

}
