
package abi.sbs.msg.message;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MESSAGE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MESSAGE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Component" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Context" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Attribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Severity" type="{http://abi/sbs/msg/MESSAGE}CVL_SEV_LVL" minOccurs="0"/&gt;
 *         &lt;element name="RequiredOverrideLevel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="AppliedOverrideLevel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MESSAGE", propOrder = {
    "component",
    "context",
    "attribute",
    "code",
    "message",
    "severity",
    "requiredOverrideLevel",
    "appliedOverrideLevel"
})
public class MESSAGE {

    @XmlElement(name = "Component")
    protected String component;
    @XmlElement(name = "Context")
    protected String context;
    @XmlElement(name = "Attribute")
    protected String attribute;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Message", required = true)
    protected String message;
    @XmlElement(name = "Severity")
    @XmlSchemaType(name = "string")
    protected CVLSEVLVL severity;
    @XmlElement(name = "RequiredOverrideLevel")
    protected BigInteger requiredOverrideLevel;
    @XmlElement(name = "AppliedOverrideLevel")
    protected BigInteger appliedOverrideLevel;

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponent(String value) {
        this.component = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute(String value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link CVLSEVLVL }
     *     
     */
    public CVLSEVLVL getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVLSEVLVL }
     *     
     */
    public void setSeverity(CVLSEVLVL value) {
        this.severity = value;
    }

    /**
     * Gets the value of the requiredOverrideLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequiredOverrideLevel() {
        return requiredOverrideLevel;
    }

    /**
     * Sets the value of the requiredOverrideLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequiredOverrideLevel(BigInteger value) {
        this.requiredOverrideLevel = value;
    }

    /**
     * Gets the value of the appliedOverrideLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAppliedOverrideLevel() {
        return appliedOverrideLevel;
    }

    /**
     * Sets the value of the appliedOverrideLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAppliedOverrideLevel(BigInteger value) {
        this.appliedOverrideLevel = value;
    }

}
