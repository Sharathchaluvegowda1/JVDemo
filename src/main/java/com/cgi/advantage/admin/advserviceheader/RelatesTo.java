
package com.cgi.advantage.admin.advserviceheader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatesTo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatesTo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelatesTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RelationshipType" type="{http://www.w3.org/2001/XMLSchema}string" default="Reply" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatesTo", propOrder = {
    "relatesTo"
})
public class RelatesTo {

    @XmlElement(name = "RelatesTo", required = true)
    protected String relatesTo;
    @XmlAttribute(name = "RelationshipType")
    protected String relationshipType;

    /**
     * Gets the value of the relatesTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatesTo() {
        return relatesTo;
    }

    /**
     * Sets the value of the relatesTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatesTo(String value) {
        this.relatesTo = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipType() {
        if (relationshipType == null) {
            return "Reply";
        } else {
            return relationshipType;
        }
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipType(String value) {
        this.relationshipType = value;
    }

}
