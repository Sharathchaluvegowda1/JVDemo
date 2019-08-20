
package abi.sbs.doc.actionrequestresponse;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for MESSAGE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MESSAGE"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="Component" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Context" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Attribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Severity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RequiredOverrideLevel" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="AppliedOverrideLevel" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MESSAGE", propOrder = {
    "value"
})
public class MESSAGE {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Component")
    protected String component;
    @XmlAttribute(name = "Context")
    protected String context;
    @XmlAttribute(name = "Attribute")
    protected String attribute;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Severity")
    protected String severity;
    @XmlAttribute(name = "RequiredOverrideLevel")
    protected BigInteger requiredOverrideLevel;
    @XmlAttribute(name = "AppliedOverrideLevel")
    protected BigInteger appliedOverrideLevel;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

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
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
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
