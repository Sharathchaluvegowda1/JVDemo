
package abi.sbs.doc.actionrequestresponse;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import abi.im.integrationmanager.IntegrationManagerRequestType;
import abi.sbs.ecm.attachment.AttachmentRequestType;


/**
 * <p>Java class for ActionRequestHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionRequestHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocCode" type="{http://abi/sbs/doc/actionRequestResponse}DOC_CD"/&gt;
 *         &lt;element name="Department" type="{http://abi/sbs/doc/actionRequestResponse}DOC_DEPT_CD"/&gt;
 *         &lt;element name="DocID" type="{http://abi/sbs/doc/actionRequestResponse}DOC_ID" minOccurs="0"/&gt;
 *         &lt;element name="AssignDocID" type="{http://abi/sbs/doc/actionRequestResponse}AUTONUM_FL"/&gt;
 *         &lt;element name="DocIDPrefix" type="{http://abi/sbs/doc/actionRequestResponse}DOC_ID_PREFIX" minOccurs="0"/&gt;
 *         &lt;element name="ApplyOverrides" type="{http://abi/sbs/doc/actionRequestResponse}APPLY_OVERRIDES"/&gt;
 *         &lt;element name="BypassApprovals" type="{http://abi/sbs/doc/actionRequestResponse}BYPASS_APPROVAL"/&gt;
 *         &lt;element name="DocAction" type="{http://abi/sbs/doc/actionRequestResponse}CVL_DOC_ACTN" minOccurs="0"/&gt;
 *         &lt;element name="DocSubAction" type="{http://abi/sbs/doc/actionRequestResponse}DOC_S_ACTN_CD" minOccurs="0"/&gt;
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
@XmlType(name = "ActionRequestHeader", propOrder = {
    "docCode",
    "department",
    "docID",
    "assignDocID",
    "docIDPrefix",
    "applyOverrides",
    "bypassApprovals",
    "docAction",
    "docSubAction",
    "integrationManager",
    "attachment"
})
public class ActionRequestHeader {

    @XmlElement(name = "DocCode", required = true)
    protected String docCode;
    @XmlElement(name = "Department", required = true)
    protected String department;
    @XmlElement(name = "DocID")
    protected String docID;
    @XmlElement(name = "AssignDocID", defaultValue = "false")
    protected boolean assignDocID;
    @XmlElement(name = "DocIDPrefix")
    protected String docIDPrefix;
    @XmlElement(name = "ApplyOverrides", defaultValue = "false")
    protected boolean applyOverrides;
    @XmlElement(name = "BypassApprovals", defaultValue = "false")
    protected boolean bypassApprovals;
    @XmlElement(name = "DocAction")
    @XmlSchemaType(name = "string")
    protected CVLDOCACTN docAction;
    @XmlElement(name = "DocSubAction")
    protected BigInteger docSubAction;
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
     * Gets the value of the docAction property.
     * 
     * @return
     *     possible object is
     *     {@link CVLDOCACTN }
     *     
     */
    public CVLDOCACTN getDocAction() {
        return docAction;
    }

    /**
     * Sets the value of the docAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVLDOCACTN }
     *     
     */
    public void setDocAction(CVLDOCACTN value) {
        this.docAction = value;
    }

    /**
     * Gets the value of the docSubAction property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocSubAction() {
        return docSubAction;
    }

    /**
     * Sets the value of the docSubAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocSubAction(BigInteger value) {
        this.docSubAction = value;
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
