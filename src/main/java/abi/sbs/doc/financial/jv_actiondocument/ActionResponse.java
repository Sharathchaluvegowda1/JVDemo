
package abi.sbs.doc.financial.jv_actiondocument;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import abi.sbs.doc.actionrequestresponse.ActionResponseHeader;
import abi.sbs.doc.financial.jvrequestresponse.JVResponseType;


/**
 * <p>Java class for ActionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://abi/sbs/doc/actionRequestResponse}actionResponseHeader"/&gt;
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
@XmlType(name = "ActionResponse", propOrder = {
    "actionResponseHeader",
    "jvResponse"
})
public class ActionResponse {

    @XmlElement(namespace = "http://abi/sbs/doc/actionRequestResponse", required = true)
    protected ActionResponseHeader actionResponseHeader;
    @XmlElement(name = "JVResponse", namespace = "http://abi/sbs/doc/financial/JVRequestResponse")
    protected JVResponseType jvResponse;

    /**
     * Gets the value of the actionResponseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ActionResponseHeader }
     *     
     */
    public ActionResponseHeader getActionResponseHeader() {
        return actionResponseHeader;
    }

    /**
     * Sets the value of the actionResponseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionResponseHeader }
     *     
     */
    public void setActionResponseHeader(ActionResponseHeader value) {
        this.actionResponseHeader = value;
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
