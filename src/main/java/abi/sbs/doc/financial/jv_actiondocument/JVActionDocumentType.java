
package abi.sbs.doc.financial.jv_actiondocument;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JV_ActionDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JV_ActionDocumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdvMessage" type="{http://abi/sbs/doc/financial/JV_actionDocument}AdvMessage"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JV_ActionDocumentType", propOrder = {
    "advMessage"
})
public class JVActionDocumentType {

    @XmlElement(name = "AdvMessage", required = true)
    protected AdvMessage advMessage;

    /**
     * Gets the value of the advMessage property.
     * 
     * @return
     *     possible object is
     *     {@link AdvMessage }
     *     
     */
    public AdvMessage getAdvMessage() {
        return advMessage;
    }

    /**
     * Sets the value of the advMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvMessage }
     *     
     */
    public void setAdvMessage(AdvMessage value) {
        this.advMessage = value;
    }

}
