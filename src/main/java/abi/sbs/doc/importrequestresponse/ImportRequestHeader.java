
package abi.sbs.doc.importrequestresponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import abi.im.integrationmanager.IntegrationManagerRequestType;
import abi.sbs.ecm.attachment.AttachmentRequestType;


/**
 * <p>Java class for ImportRequestHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportRequestHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocCode" type="{http://abi/sbs/doc/importRequestResponse}DOC_CD"/&gt;
 *         &lt;element name="Department" type="{http://abi/sbs/doc/importRequestResponse}DOC_DEPT_CD"/&gt;
 *         &lt;element name="DocID" type="{http://abi/sbs/doc/importRequestResponse}DOC_ID" minOccurs="0"/&gt;
 *         &lt;element name="Unit" type="{http://abi/sbs/doc/importRequestResponse}DOC_UNIT_CD" minOccurs="0"/&gt;
 *         &lt;element name="AssignDocID" type="{http://abi/sbs/doc/importRequestResponse}AUTONUM_FL"/&gt;
 *         &lt;element name="DocIDPrefix" type="{http://abi/sbs/doc/importRequestResponse}DOC_ID_PREFIX" minOccurs="0"/&gt;
 *         &lt;element name="ApplyOverrides" type="{http://abi/sbs/doc/importRequestResponse}DOC_ACTION_FL"/&gt;
 *         &lt;element name="BypassApprovals" type="{http://abi/sbs/doc/importRequestResponse}DOC_ACTION_FL"/&gt;
 *         &lt;element name="ValidateDocument" type="{http://abi/sbs/doc/importRequestResponse}DOC_ACTION_FL"/&gt;
 *         &lt;element name="SubmitDocument" type="{http://abi/sbs/doc/importRequestResponse}DOC_ACTION_FL"/&gt;
 *         &lt;element name="DiscardDraftDocument" type="{http://abi/sbs/doc/importRequestResponse}DOC_ACTION_FL"/&gt;
 *         &lt;element name="UpdateIntegrationLog" type="{http://abi/sbs/doc/importRequestResponse}DOC_ACTION_FL"/&gt;
 *         &lt;element name="UpdateMessageLog" type="{http://abi/sbs/doc/importRequestResponse}DOC_ACTION_FL"/&gt;
 *         &lt;element name="ImportECMAttachments" type="{http://abi/sbs/doc/importRequestResponse}DOC_ACTION_FL"/&gt;
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
@XmlType(name = "ImportRequestHeader", propOrder = {
    "docCode",
    "department",
    "docID",
    "unit",
    "assignDocID",
    "docIDPrefix",
    "applyOverrides",
    "bypassApprovals",
    "validateDocument",
    "submitDocument",
    "discardDraftDocument",
    "updateIntegrationLog",
    "updateMessageLog",
    "importECMAttachments",
    "integrationManager",
    "attachment"
})
public class ImportRequestHeader {

    @XmlElement(name = "DocCode", required = true)
    protected String docCode;
    @XmlElement(name = "Department", required = true)
    protected String department;
    @XmlElement(name = "DocID")
    protected String docID;
    @XmlElement(name = "Unit")
    protected String unit;
    @XmlElement(name = "AssignDocID", defaultValue = "false")
    protected boolean assignDocID;
    @XmlElement(name = "DocIDPrefix")
    protected String docIDPrefix;
    @XmlElement(name = "ApplyOverrides", defaultValue = "false")
    protected boolean applyOverrides;
    @XmlElement(name = "BypassApprovals", defaultValue = "false")
    protected boolean bypassApprovals;
    @XmlElement(name = "ValidateDocument", defaultValue = "false")
    protected boolean validateDocument;
    @XmlElement(name = "SubmitDocument", defaultValue = "false")
    protected boolean submitDocument;
    @XmlElement(name = "DiscardDraftDocument", defaultValue = "false")
    protected boolean discardDraftDocument;
    @XmlElement(name = "UpdateIntegrationLog", defaultValue = "false")
    protected boolean updateIntegrationLog;
    @XmlElement(name = "UpdateMessageLog", defaultValue = "false")
    protected boolean updateMessageLog;
    @XmlElement(name = "ImportECMAttachments", defaultValue = "false")
    protected boolean importECMAttachments;
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
     * Gets the value of the assignDocID property.
     * 
     */
    public boolean isAssignDocID() {
        return assignDocID;
    }

    /**
     * Sets the value of the assignDocID property.
     * 
     */
    public void setAssignDocID(boolean value) {
        this.assignDocID = value;
    }

    /**
     * Gets the value of the docIDPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIDPrefix() {
        return docIDPrefix;
    }

    /**
     * Sets the value of the docIDPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIDPrefix(String value) {
        this.docIDPrefix = value;
    }

    /**
     * Gets the value of the applyOverrides property.
     * 
     */
    public boolean isApplyOverrides() {
        return applyOverrides;
    }

    /**
     * Sets the value of the applyOverrides property.
     * 
     */
    public void setApplyOverrides(boolean value) {
        this.applyOverrides = value;
    }

    /**
     * Gets the value of the bypassApprovals property.
     * 
     */
    public boolean isBypassApprovals() {
        return bypassApprovals;
    }

    /**
     * Sets the value of the bypassApprovals property.
     * 
     */
    public void setBypassApprovals(boolean value) {
        this.bypassApprovals = value;
    }

    /**
     * Gets the value of the validateDocument property.
     * 
     */
    public boolean isValidateDocument() {
        return validateDocument;
    }

    /**
     * Sets the value of the validateDocument property.
     * 
     */
    public void setValidateDocument(boolean value) {
        this.validateDocument = value;
    }

    /**
     * Gets the value of the submitDocument property.
     * 
     */
    public boolean isSubmitDocument() {
        return submitDocument;
    }

    /**
     * Sets the value of the submitDocument property.
     * 
     */
    public void setSubmitDocument(boolean value) {
        this.submitDocument = value;
    }

    /**
     * Gets the value of the discardDraftDocument property.
     * 
     */
    public boolean isDiscardDraftDocument() {
        return discardDraftDocument;
    }

    /**
     * Sets the value of the discardDraftDocument property.
     * 
     */
    public void setDiscardDraftDocument(boolean value) {
        this.discardDraftDocument = value;
    }

    /**
     * Gets the value of the updateIntegrationLog property.
     * 
     */
    public boolean isUpdateIntegrationLog() {
        return updateIntegrationLog;
    }

    /**
     * Sets the value of the updateIntegrationLog property.
     * 
     */
    public void setUpdateIntegrationLog(boolean value) {
        this.updateIntegrationLog = value;
    }

    /**
     * Gets the value of the updateMessageLog property.
     * 
     */
    public boolean isUpdateMessageLog() {
        return updateMessageLog;
    }

    /**
     * Sets the value of the updateMessageLog property.
     * 
     */
    public void setUpdateMessageLog(boolean value) {
        this.updateMessageLog = value;
    }

    /**
     * Gets the value of the importECMAttachments property.
     * 
     */
    public boolean isImportECMAttachments() {
        return importECMAttachments;
    }

    /**
     * Sets the value of the importECMAttachments property.
     * 
     */
    public void setImportECMAttachments(boolean value) {
        this.importECMAttachments = value;
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
