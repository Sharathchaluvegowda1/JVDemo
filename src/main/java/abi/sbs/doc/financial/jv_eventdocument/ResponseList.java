
package abi.sbs.doc.financial.jv_eventdocument;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventResponse" type="{http://abi/sbs/doc/financial/JV_eventDocument}EventResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseList", propOrder = {
    "eventResponse"
})
public class ResponseList {

    @XmlElement(name = "EventResponse")
    protected List<EventResponse> eventResponse;

    /**
     * Gets the value of the eventResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventResponse }
     * 
     * 
     */
    public List<EventResponse> getEventResponse() {
        if (eventResponse == null) {
            eventResponse = new ArrayList<EventResponse>();
        }
        return this.eventResponse;
    }

}
