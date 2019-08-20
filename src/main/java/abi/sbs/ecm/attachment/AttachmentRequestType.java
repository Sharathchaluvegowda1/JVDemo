
package abi.sbs.ecm.attachment;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttachmentAction" type="{http://abi/sbs/ecm/Attachment}ATTACH_ACTN"/&gt;
 *         &lt;element name="AttachmentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AttachmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AttachmentData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *           &lt;element name="ECMReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentRequestType", propOrder = {
    "attachmentAction",
    "attachmentName",
    "attachmentDescription",
    "attachmentData",
    "ecmReference"
})
public class AttachmentRequestType {

    @XmlElement(name = "AttachmentAction", required = true)
    @XmlSchemaType(name = "string")
    protected ATTACHACTN attachmentAction;
    @XmlElement(name = "AttachmentName", required = true)
    protected String attachmentName;
    @XmlElement(name = "AttachmentDescription")
    protected String attachmentDescription;
    @XmlElement(name = "AttachmentData")
    @XmlMimeType("application/octet-stream")
    protected DataHandler attachmentData;
    @XmlElement(name = "ECMReference")
    protected String ecmReference;

    /**
     * Gets the value of the attachmentAction property.
     * 
     * @return
     *     possible object is
     *     {@link ATTACHACTN }
     *     
     */
    public ATTACHACTN getAttachmentAction() {
        return attachmentAction;
    }

    /**
     * Sets the value of the attachmentAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATTACHACTN }
     *     
     */
    public void setAttachmentAction(ATTACHACTN value) {
        this.attachmentAction = value;
    }

    /**
     * Gets the value of the attachmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentName() {
        return attachmentName;
    }

    /**
     * Sets the value of the attachmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentName(String value) {
        this.attachmentName = value;
    }

    /**
     * Gets the value of the attachmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentDescription() {
        return attachmentDescription;
    }

    /**
     * Sets the value of the attachmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentDescription(String value) {
        this.attachmentDescription = value;
    }

    /**
     * Gets the value of the attachmentData property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getAttachmentData() {
        return attachmentData;
    }

    /**
     * Sets the value of the attachmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setAttachmentData(DataHandler value) {
        this.attachmentData = value;
    }

    /**
     * Gets the value of the ecmReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECMReference() {
        return ecmReference;
    }

    /**
     * Sets the value of the ecmReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECMReference(String value) {
        this.ecmReference = value;
    }

}
