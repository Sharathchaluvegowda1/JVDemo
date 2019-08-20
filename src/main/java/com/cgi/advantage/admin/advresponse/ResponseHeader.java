
package com.cgi.advantage.admin.advresponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.cgi.com/Advantage/Admin/AdvResponse}ReturnStatus"/&gt;
 *         &lt;element name="Messages" type="{http://www.cgi.com/Advantage/Admin/AdvResponse}ReturnMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Parameters" type="{http://www.cgi.com/Advantage/Admin/AdvResponse}Parameter" minOccurs="0"/&gt;
 *         &lt;element name="ResponseMessages" type="{http://www.cgi.com/Advantage/Admin/AdvResponse}ResponseMessages"/&gt;
 *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelatesTo" type="{http://www.cgi.com/Advantage/Admin/AdvResponse}RelatesTo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseHeader", propOrder = {
    "status",
    "messages",
    "parameters",
    "responseMessages",
    "messageID",
    "relatesTo"
})
public class ResponseHeader {

    @XmlElement(name = "Status", required = true)
    protected ReturnStatus status;
    @XmlElement(name = "Messages")
    protected List<ReturnMessage> messages;
    @XmlElement(name = "Parameters")
    protected Parameter parameters;
    @XmlElement(name = "ResponseMessages", required = true)
    protected ResponseMessages responseMessages;
    @XmlElement(name = "MessageID")
    protected String messageID;
    @XmlElement(name = "RelatesTo")
    protected RelatesTo relatesTo;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnStatus }
     *     
     */
    public ReturnStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnStatus }
     *     
     */
    public void setStatus(ReturnStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnMessage }
     * 
     * 
     */
    public List<ReturnMessage> getMessages() {
        if (messages == null) {
            messages = new ArrayList<ReturnMessage>();
        }
        return this.messages;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link Parameter }
     *     
     */
    public Parameter getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameter }
     *     
     */
    public void setParameters(Parameter value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the responseMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMessages }
     *     
     */
    public ResponseMessages getResponseMessages() {
        return responseMessages;
    }

    /**
     * Sets the value of the responseMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMessages }
     *     
     */
    public void setResponseMessages(ResponseMessages value) {
        this.responseMessages = value;
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

}
