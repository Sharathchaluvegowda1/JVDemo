
package abi.sbs.doc.actionrequestresponse;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import abi.im.integrationmanager.IntegrationManagerResponseType;
import abi.sbs.codedvaluelist.cvl_doc_phase_cd.CVLDOCPHASECD;
import abi.sbs.codedvaluelist.cvl_doc_sta_cd.CVLDOCSTACD;
import abi.sbs.ecm.attachment.AttachmentResponseType;
import abi.sbs.msg.message.MESSAGE;


/**
 * <p>Java class for ActionResponseHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionResponseHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocCode" type="{http://abi/sbs/doc/actionRequestResponse}DOC_CD"/&gt;
 *         &lt;element name="Department" type="{http://abi/sbs/doc/actionRequestResponse}DOC_DEPT_CD"/&gt;
 *         &lt;element name="DocID" type="{http://abi/sbs/doc/actionRequestResponse}DOC_ID" minOccurs="0"/&gt;
 *         &lt;element name="DocVersion" type="{http://abi/sbs/doc/actionRequestResponse}DOC_VERS_NO" minOccurs="0"/&gt;
 *         &lt;element name="Unit" type="{http://abi/sbs/doc/actionRequestResponse}DOC_UNIT_CD" minOccurs="0"/&gt;
 *         &lt;element name="DocPhase" type="{http://abi/sbs/CodedValueList/CVL_DOC_PHASE_CD}CVL_DOC_PHASE_CD" minOccurs="0"/&gt;
 *         &lt;element name="DocStatus" type="{http://abi/sbs/CodedValueList/CVL_DOC_STA_CD}CVL_DOC_STA_CD" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://abi/sbs/msg/MESSAGE}MESSAGE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationManager" type="{http://abi/im/IntegrationManager}IntegrationManagerResponseType" minOccurs="0"/&gt;
 *         &lt;element name="Attachment" type="{http://abi/sbs/ecm/Attachment}AttachmentResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionResponseHeader", propOrder = {
    "docCode",
    "department",
    "docID",
    "docVersion",
    "unit",
    "docPhase",
    "docStatus",
    "message",
    "integrationManager",
    "attachment"
})
public class ActionResponseHeader {

    @XmlElement(name = "DocCode", required = true)
    protected String docCode;
    @XmlElement(name = "Department", required = true)
    protected String department;
    @XmlElement(name = "DocID")
    protected String docID;
    @XmlElement(name = "DocVersion")
    protected BigInteger docVersion;
    @XmlElement(name = "Unit")
    protected String unit;
    @XmlElement(name = "DocPhase")
    @XmlSchemaType(name = "string")
    protected CVLDOCPHASECD docPhase;
    @XmlElement(name = "DocStatus")
    @XmlSchemaType(name = "string")
    protected CVLDOCSTACD docStatus;
    @XmlElement(name = "Message")
    protected List<MESSAGE> message;
    @XmlElement(name = "IntegrationManager")
    protected IntegrationManagerResponseType integrationManager;
    @XmlElement(name = "Attachment")
    protected List<AttachmentResponseType> attachment;

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
     * Gets the value of the docVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocVersion() {
        return docVersion;
    }

    /**
     * Sets the value of the docVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocVersion(BigInteger value) {
        this.docVersion = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the docPhase property.
     * 
     * @return
     *     possible object is
     *     {@link CVLDOCPHASECD }
     *     
     */
    public CVLDOCPHASECD getDocPhase() {
        return docPhase;
    }

    /**
     * Sets the value of the docPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVLDOCPHASECD }
     *     
     */
    public void setDocPhase(CVLDOCPHASECD value) {
        this.docPhase = value;
    }

    /**
     * Gets the value of the docStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CVLDOCSTACD }
     *     
     */
    public CVLDOCSTACD getDocStatus() {
        return docStatus;
    }

    /**
     * Sets the value of the docStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVLDOCSTACD }
     *     
     */
    public void setDocStatus(CVLDOCSTACD value) {
        this.docStatus = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MESSAGE }
     * 
     * 
     */
    public List<MESSAGE> getMessage() {
        if (message == null) {
            message = new ArrayList<MESSAGE>();
        }
        return this.message;
    }

    /**
     * Gets the value of the integrationManager property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationManagerResponseType }
     *     
     */
    public IntegrationManagerResponseType getIntegrationManager() {
        return integrationManager;
    }

    /**
     * Sets the value of the integrationManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationManagerResponseType }
     *     
     */
    public void setIntegrationManager(IntegrationManagerResponseType value) {
        this.integrationManager = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentResponseType }
     * 
     * 
     */
    public List<AttachmentResponseType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<AttachmentResponseType>();
        }
        return this.attachment;
    }

}
