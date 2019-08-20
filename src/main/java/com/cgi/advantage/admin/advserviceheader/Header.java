
package com.cgi.advantage.admin.advserviceheader;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Subject" type="{http://www.cgi.com/Advantage/Admin/AdvServiceHeader}Requestor"/&gt;
 *         &lt;element name="Parameters" type="{http://www.cgi.com/Advantage/Admin/AdvServiceHeader}Parameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceContext" type="{http://www.cgi.com/Advantage/Admin/AdvServiceHeader}ServiceContext"/&gt;
 *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RelatesTo" type="{http://www.cgi.com/Advantage/Admin/AdvServiceHeader}RelatesTo"/&gt;
 *         &lt;element name="EXT_REF_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Recipient" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Requestor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subject",
    "parameters",
    "serviceContext",
    "messageID",
    "relatesTo",
    "extrefid"
})
@XmlRootElement(name = "Header")
public class Header {

    @XmlElement(name = "Subject", required = true)
    protected Requestor subject;
    @XmlElement(name = "Parameters")
    protected List<Parameter> parameters;
    @XmlElement(name = "ServiceContext", required = true)
    protected ServiceContext serviceContext;
    @XmlElement(name = "MessageID", required = true)
    protected String messageID;
    @XmlElement(name = "RelatesTo", required = true)
    protected RelatesTo relatesTo;
    @XmlElement(name = "EXT_REF_ID", required = true)
    protected String extrefid;
    @XmlAttribute(name = "Date")
    protected String date;
    @XmlAttribute(name = "Recipient")
    protected String recipient;
    @XmlAttribute(name = "Requestor")
    protected String requestor;
    @XmlAttribute(name = "ReturnCode")
    protected String returnCode;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link Requestor }
     *     
     */
    public Requestor getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Requestor }
     *     
     */
    public void setSubject(Requestor value) {
        this.subject = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parameter }
     * 
     * 
     */
    public List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<Parameter>();
        }
        return this.parameters;
    }

    /**
     * Gets the value of the serviceContext property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceContext }
     *     
     */
    public ServiceContext getServiceContext() {
        return serviceContext;
    }

    /**
     * Sets the value of the serviceContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceContext }
     *     
     */
    public void setServiceContext(ServiceContext value) {
        this.serviceContext = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the relatesTo property.
     * 
     * @return
     *     possible object is
     *     {@link RelatesTo }
     *     
     */
    public RelatesTo getRelatesTo() {
        return relatesTo;
    }

    /**
     * Sets the value of the relatesTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatesTo }
     *     
     */
    public void setRelatesTo(RelatesTo value) {
        this.relatesTo = value;
    }

    /**
     * Gets the value of the extrefid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTREFID() {
        return extrefid;
    }

    /**
     * Sets the value of the extrefid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTREFID(String value) {
        this.extrefid = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipient(String value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestor(String value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
