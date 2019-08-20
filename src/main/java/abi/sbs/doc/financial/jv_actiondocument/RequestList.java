
package abi.sbs.doc.financial.jv_actiondocument;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionRequest" type="{http://abi/sbs/doc/financial/JV_actionDocument}ActionRequest" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestList", propOrder = {
    "actionRequest"
})
public class RequestList {

    @XmlElement(name = "ActionRequest", required = true)
    protected List<ActionRequest> actionRequest;

    /**
     * Gets the value of the actionRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionRequest }
     * 
     * 
     */
    public List<ActionRequest> getActionRequest() {
        if (actionRequest == null) {
            actionRequest = new ArrayList<ActionRequest>();
        }
        return this.actionRequest;
    }

}
