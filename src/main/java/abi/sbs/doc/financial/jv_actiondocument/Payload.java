
package abi.sbs.doc.financial.jv_actiondocument;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Payload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payload"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestList" type="{http://abi/sbs/doc/financial/JV_actionDocument}RequestList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payload", propOrder = {
    "requestList"
})
public class Payload {

    @XmlElement(name = "RequestList", required = true)
    protected RequestList requestList;

    /**
     * Gets the value of the requestList property.
     * 
     * @return
     *     possible object is
     *     {@link RequestList }
     *     
     */
    public RequestList getRequestList() {
        return requestList;
    }

    /**
     * Sets the value of the requestList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestList }
     *     
     */
    public void setRequestList(RequestList value) {
        this.requestList = value;
    }

}
