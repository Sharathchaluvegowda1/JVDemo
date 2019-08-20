
package abi.sbs.doc.financial.jv_eventdocument;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import abi.sbs.doc.eventrequestresponse.EventRequestHeader;
import abi.sbs.doc.financial.jvrequestresponse.JVRequestType;


/**
 * <p>Java class for EventRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://abi/sbs/doc/eventRequestResponse}eventRequestHeader"/&gt;
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
@XmlType(name = "EventRequest", propOrder = {
    "eventRequestHeader",
    "jvRequest"
})
public class EventRequest {

    @XmlElement(namespace = "http://abi/sbs/doc/eventRequestResponse", required = true)
    protected EventRequestHeader eventRequestHeader;
    @XmlElement(name = "JVRequest", namespace = "http://abi/sbs/doc/financial/JVRequestResponse")
    protected JVRequestType jvRequest;

    /**
     * Gets the value of the eventRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link EventRequestHeader }
     *     
     */
    public EventRequestHeader getEventRequestHeader() {
        return eventRequestHeader;
    }

    /**
     * Sets the value of the eventRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventRequestHeader }
     *     
     */
    public void setEventRequestHeader(EventRequestHeader value) {
        this.eventRequestHeader = value;
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
