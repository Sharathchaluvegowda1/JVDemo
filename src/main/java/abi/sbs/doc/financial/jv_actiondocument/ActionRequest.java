
package abi.sbs.doc.financial.jv_actiondocument;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import abi.sbs.doc.actionrequestresponse.ActionRequestHeader;
import abi.sbs.doc.financial.jvrequestresponse.JVRequestType;


/**
 * <p>Java class for ActionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://abi/sbs/doc/actionRequestResponse}actionRequestHeader"/&gt;
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
@XmlType(name = "ActionRequest", propOrder = {
    "actionRequestHeader",
    "jvRequest"
})
public class ActionRequest {

    @XmlElement(namespace = "http://abi/sbs/doc/actionRequestResponse", required = true)
    protected ActionRequestHeader actionRequestHeader;
    @XmlElement(name = "JVRequest", namespace = "http://abi/sbs/doc/financial/JVRequestResponse")
    protected JVRequestType jvRequest;

    /**
     * Gets the value of the actionRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ActionRequestHeader }
     *     
     */
    public ActionRequestHeader getActionRequestHeader() {
        return actionRequestHeader;
    }

    /**
     * Sets the value of the actionRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionRequestHeader }
     *     
     */
    public void setActionRequestHeader(ActionRequestHeader value) {
        this.actionRequestHeader = value;
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
