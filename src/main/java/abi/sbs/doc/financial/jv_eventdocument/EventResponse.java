
package abi.sbs.doc.financial.jv_eventdocument;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import abi.sbs.doc.eventrequestresponse.EventResponseHeader;


/**
 * <p>Java class for EventResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://abi/sbs/doc/eventRequestResponse}eventResponseHeader"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventResponse", propOrder = {
    "eventResponseHeader"
})
public class EventResponse {

    @XmlElement(namespace = "http://abi/sbs/doc/eventRequestResponse", required = true)
    protected EventResponseHeader eventResponseHeader;

    /**
     * Gets the value of the eventResponseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link EventResponseHeader }
     *     
     */
    public EventResponseHeader getEventResponseHeader() {
        return eventResponseHeader;
    }

    /**
     * Sets the value of the eventResponseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResponseHeader }
     *     
     */
    public void setEventResponseHeader(EventResponseHeader value) {
        this.eventResponseHeader = value;
    }

}
