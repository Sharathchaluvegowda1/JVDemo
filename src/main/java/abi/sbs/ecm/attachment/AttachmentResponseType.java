
package abi.sbs.ecm.attachment;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttachmentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AttachmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocCode" type="{http://abi/sbs/ecm/Attachment}DOC_CD"/&gt;
 *         &lt;element name="Department" type="{http://abi/sbs/ecm/Attachment}DOC_DEPT_CD"/&gt;
 *         &lt;element name="DocID" type="{http://abi/sbs/ecm/Attachment}DOC_ID" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AttachmentData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="ECMReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="RevisedECMReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "AttachmentResponseType", propOrder = {
    "attachmentName",
    "attachmentDescription",
    "docCode",
    "department",
    "docID",
    "attachmentData",
    "ecmReference",
    "revisedECMReference"
})
public class AttachmentResponseType {

    @XmlElement(name = "AttachmentName", required = true)
    protected String attachmentName;
    @XmlElement(name = "AttachmentDescription")
    protected String attachmentDescription;
    @XmlElement(name = "DocCode", required = true)
    protected String docCode;
    @XmlElement(name = "Department", required = true)
    protected String department;
    @XmlElement(name = "DocID")
    protected String docID;
    @XmlElement(name = "AttachmentData")
    @XmlMimeType("application/octet-stream")
    protected DataHandler attachmentData;
    @XmlElement(name = "ECMReference")
    protected String ecmReference;
    @XmlElement(name = "RevisedECMReference")
    protected String revisedECMReference;

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
     * Gets the value of the docCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocCode() {
        return docCode;
    }

    /**
     * Sets the value of the docCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocCode(String value) {
        this.docCode = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the docID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocID() {
        return docID;
    }

    /**
     * Sets the value of the docID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocID(String value) {
        this.docID = value;
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

    /**
     * Gets the value of the revisedECMReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisedECMReference() {
        return revisedECMReference;
    }

    /**
     * Sets the value of the revisedECMReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisedECMReference(String value) {
        this.revisedECMReference = value;
    }

}
