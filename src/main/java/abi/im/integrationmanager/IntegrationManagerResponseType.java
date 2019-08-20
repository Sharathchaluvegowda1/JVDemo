
package abi.im.integrationmanager;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntegrationManagerResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegrationManagerResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntegrationService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationFlow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationResoure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationCrossReference" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrationManagerResponseType", propOrder = {
    "integrationService",
    "integrationFlow",
    "integrationResoure",
    "integrationCrossReference"
})
public class IntegrationManagerResponseType {

    @XmlElement(name = "IntegrationService")
    protected String integrationService;
    @XmlElement(name = "IntegrationFlow")
    protected String integrationFlow;
    @XmlElement(name = "IntegrationResoure")
    protected String integrationResoure;
    @XmlElement(name = "IntegrationCrossReference")
    protected List<String> integrationCrossReference;

    /**
     * Gets the value of the integrationService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationService() {
        return integrationService;
    }

    /**
     * Sets the value of the integrationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationService(String value) {
        this.integrationService = value;
    }

    /**
     * Gets the value of the integrationFlow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationFlow() {
        return integrationFlow;
    }

    /**
     * Sets the value of the integrationFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationFlow(String value) {
        this.integrationFlow = value;
    }

    /**
     * Gets the value of the integrationResoure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationResoure() {
        return integrationResoure;
    }

    /**
     * Sets the value of the integrationResoure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationResoure(String value) {
        this.integrationResoure = value;
    }

    /**
     * Gets the value of the integrationCrossReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integrationCrossReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegrationCrossReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIntegrationCrossReference() {
        if (integrationCrossReference == null) {
            integrationCrossReference = new ArrayList<String>();
        }
        return this.integrationCrossReference;
    }

}
