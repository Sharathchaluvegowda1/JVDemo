
package abi.sbs.doc.eventrequestresponse;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import abi.im.integrationmanager.IntegrationManagerRequestType;
import abi.sbs.codedvaluelist.cvl_doc_phase_cd.CVLDOCPHASECD;
import abi.sbs.codedvaluelist.cvl_doc_sta_cd.CVLDOCSTACD;
import abi.sbs.ecm.attachment.AttachmentRequestType;


/**
 * <p>Java class for EventRequestHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventRequestHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocCode" type="{http://abi/sbs/doc/eventRequestResponse}DOC_CD"/&gt;
 *         &lt;element name="Department" type="{http://abi/sbs/doc/eventRequestResponse}DOC_DEPT_CD"/&gt;
 *         &lt;element name="DocID" type="{http://abi/sbs/doc/eventRequestResponse}DOC_ID" minOccurs="0"/&gt;
 *         &lt;element name="DocVersion" type="{http://abi/sbs/doc/eventRequestResponse}DOC_VERS_NO" minOccurs="0"/&gt;
 *         &lt;element name="Unit" type="{http://abi/sbs/doc/eventRequestResponse}DOC_UNIT_CD" minOccurs="0"/&gt;
 *         &lt;element name="DocPhase" type="{http://abi/sbs/CodedValueList/CVL_DOC_PHASE_CD}CVL_DOC_PHASE_CD" minOccurs="0"/&gt;
 *         &lt;element name="DocStatus" type="{http://abi/sbs/CodedValueList/CVL_DOC_STA_CD}CVL_DOC_STA_CD" minOccurs="0"/&gt;
 *         &lt;element name="DocEvent" type="{http://abi/sbs/doc/eventRequestResponse}CVL_DOC_EVNT"/&gt;
 *         &lt;element name="DocSubEvent" type="{http://abi/sbs/doc/eventRequestResponse}DOC_S_EVNT_CD"/&gt;
 *         &lt;element name="IntegrationManager" type="{http://abi/im/IntegrationManager}IntegrationManagerRequestType" minOccurs="0"/&gt;
 *         &lt;element name="Attachment" type="{http://abi/sbs/ecm/Attachment}AttachmentRequestType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventRequestHeader", propOrder = {
    "docCode",
    "department",
    "docID",
    "docVersion",
    "unit",
    "docPhase",
    "docStatus",
    "docEvent",
    "docSubEvent",
    "integrationManager",
    "attachment"
})
public class EventRequestHeader {

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
    @XmlElement(name = "DocEvent", required = true)
    @XmlSchemaType(name = "string")
    protected CVLDOCEVNT docEvent;
    @XmlElement(name = "DocSubEvent", required = true)
    protected BigInteger docSubEvent;
    @XmlElement(name = "IntegrationManager")
    protected IntegrationManagerRequestType integrationManager;
    @XmlElement(name = "Attachment")
    protected List<AttachmentRequestType> attachment;

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
     * Gets the value of the docEvent property.
     * 
     * @return
     *     possible object is
     *     {@link CVLDOCEVNT }
     *     
     */
    public CVLDOCEVNT getDocEvent() {
        return docEvent;
    }

    /**
     * Sets the value of the docEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVLDOCEVNT }
     *     
     */
    public void setDocEvent(CVLDOCEVNT value) {
        this.docEvent = value;
    }

    /**
     * Gets the value of the docSubEvent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocSubEvent() {
        return docSubEvent;
    }

    /**
     * Sets the value of the docSubEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocSubEvent(BigInteger value) {
        this.docSubEvent = value;
    }

    /**
     * Gets the value of the integrationManager property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationManagerRequestType }
     *     
     */
    public IntegrationManagerRequestType getIntegrationManager() {
        return integrationManager;
    }

    /**
     * Sets the value of the integrationManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationManagerRequestType }
     *     
     */
    public void setIntegrationManager(IntegrationManagerRequestType value) {
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
     * {@link AttachmentRequestType }
     * 
     * 
     */
    public List<AttachmentRequestType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<AttachmentRequestType>();
        }
        return this.attachment;
    }

}
