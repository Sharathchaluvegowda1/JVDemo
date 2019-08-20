
package abi.sbs.doc.financial.jvrequestresponse;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import abi.sbs.codedvaluelist.cvl_doc_sta_cd.CVLDOCSTACD;
import abi.sbs.ecm.attachment.AttachmentResponseType;


/**
 * <p>Java class for JVResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JVResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionDept" type="{http://abi/sbs/GlobalAttribute/DOC_DEPT_CD}DOC_DEPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_ACT_FL" minOccurs="0"/&gt;
 *         &lt;element name="CreatedOn" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_CREA_DT" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_CREA_USID" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedOn" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_LAST_DT" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_LAST_USID" minOccurs="0"/&gt;
 *         &lt;element name="TransactionStatus" type="{http://abi/sbs/CodedValueList/CVL_DOC_STA_CD}CVL_DOC_STA_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionUnit" type="{http://abi/sbs/GlobalAttribute/DOC_UNIT_CD}DOC_UNIT_CD" minOccurs="0"/&gt;
 *         &lt;element name="OverrideErrorCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}OV_ERR_CD" minOccurs="0"/&gt;
 *         &lt;element name="WorkflowBypassApprovalIndicator" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_BYPS_APRV_IND" minOccurs="0"/&gt;
 *         &lt;element name="ObjectAttachmentPrimaryGroupTotal" type="{http://abi/sbs/doc/financial/JVRequestResponse}OBJ_ATT_PG_TOT" minOccurs="0"/&gt;
 *         &lt;element name="ObjectAttachmentPrimaryGroupUniqueIdentifier" type="{http://abi/sbs/doc/financial/JVRequestResponse}OBJ_ATT_PG_UNID" minOccurs="0"/&gt;
 *         &lt;element name="ObjectAttachmentSecondaryGroupTotal" type="{http://abi/sbs/doc/financial/JVRequestResponse}OBJ_ATT_SG_TOT" minOccurs="0"/&gt;
 *         &lt;element name="ObjectAttachmentSecondaryGroupUniqueIdentifier" type="{http://abi/sbs/doc/financial/JVRequestResponse}OBJ_ATT_SG_UNID" minOccurs="0"/&gt;
 *         &lt;element name="PacketDept" type="{http://abi/sbs/GlobalAttribute/PAC_DEPT_CD}PAC_DEPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionDept1" type="{http://abi/sbs/GlobalAttribute/DOC_DEPT_CD}DOC_DEPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="RecordDate" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_REC_DT_DC" minOccurs="0"/&gt;
 *         &lt;element name="BudgetFY" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_BFY" minOccurs="0"/&gt;
 *         &lt;element name="FiscalYear" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_FY_DC" minOccurs="0"/&gt;
 *         &lt;element name="Period" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_PER_DC" minOccurs="0"/&gt;
 *         &lt;element name="FiscalQuarter" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_FQTR" minOccurs="0"/&gt;
 *         &lt;element name="TransactionDescription" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_DSCR" minOccurs="0"/&gt;
 *         &lt;element name="TransactionName" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_NM" minOccurs="0"/&gt;
 *         &lt;element name="ReversalDate" type="{http://abi/sbs/doc/financial/JVRequestResponse}RVRSL_DT" minOccurs="0"/&gt;
 *         &lt;element name="ReversalHold" type="{http://abi/sbs/doc/financial/JVRequestResponse}RVRSL_HLD_FL" minOccurs="0"/&gt;
 *         &lt;element name="BudgetControlReduction" type="{http://abi/sbs/doc/financial/JVRequestResponse}BUD_ED_SKP_ALW_FL" minOccurs="0"/&gt;
 *         &lt;element name="FundBalanceControlReduction" type="{http://abi/sbs/doc/financial/JVRequestResponse}FBAL_ED_SKP_ALW_FL" minOccurs="0"/&gt;
 *         &lt;element name="CashBalanceControlReduction" type="{http://abi/sbs/doc/financial/JVRequestResponse}CBAL_ED_SKP_ALW_FL" minOccurs="0"/&gt;
 *         &lt;element name="TotalCredits" type="{http://abi/sbs/doc/financial/JVRequestResponse}CR_TOT_AM" minOccurs="0"/&gt;
 *         &lt;element name="TotalDebits" type="{http://abi/sbs/doc/financial/JVRequestResponse}DR_TOT_AM" minOccurs="0"/&gt;
 *         &lt;element name="LineGroupCount" type="{http://abi/sbs/doc/financial/JVRequestResponse}TOT_LNGRP_CT" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedDescription" type="{http://abi/sbs/doc/financial/JVRequestResponse}EXT_JV_DESC" minOccurs="0"/&gt;
 *         &lt;element name="OverrideUserID" type="{http://abi/sbs/doc/financial/JVRequestResponse}OV_ERR_USID" minOccurs="0"/&gt;
 *         &lt;element name="CreatedOn1" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_APPL_CREA_DT" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedOn1" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_APPL_LAST_DT" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy1" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_APPL_LAST_USID" minOccurs="0"/&gt;
 *         &lt;element name="ContactCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}CNTAC_CD" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://abi/sbs/doc/financial/JVRequestResponse}EMAIL_AD" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://abi/sbs/doc/financial/JVRequestResponse}PH_NO" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://abi/sbs/doc/financial/JVRequestResponse}LAST_NM" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://abi/sbs/doc/financial/JVRequestResponse}FRST_NM" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://abi/sbs/doc/financial/JVRequestResponse}USER_NM" minOccurs="0"/&gt;
 *         &lt;element name="PayDate" type="{http://abi/sbs/doc/financial/JVRequestResponse}PY_DT" minOccurs="0"/&gt;
 *         &lt;element name="PayPeriodEndDate" type="{http://abi/sbs/doc/financial/JVRequestResponse}PY_PER_END_DT" minOccurs="0"/&gt;
 *         &lt;element name="LastPayrollMonth" type="{http://abi/sbs/doc/financial/JVRequestResponse}LAST_PYRL_MO_FL" minOccurs="0"/&gt;
 *         &lt;element name="PayCycle" type="{http://abi/sbs/doc/financial/JVRequestResponse}PY_CYC" minOccurs="0"/&gt;
 *         &lt;element name="EscrowID" type="{http://abi/sbs/doc/financial/JVRequestResponse}ESCROW_ID" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalTransactionInformation" type="{http://abi/sbs/doc/financial/JVRequestResponse}ADD_INFO_FL" minOccurs="0"/&gt;
 *         &lt;element name="ExtensionStorageUniqueID" type="{http://abi/sbs/doc/financial/JVRequestResponse}EXT_STOR_UNID" minOccurs="0"/&gt;
 *         &lt;element name="Attachment" type="{http://abi/sbs/ecm/Attachment}AttachmentResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JVResponseLngrp" type="{http://abi/sbs/doc/financial/JVRequestResponse}JVResponseLngrpType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JVResponseType", propOrder = {
    "transactionDept",
    "active",
    "createdOn",
    "createdBy",
    "modifiedOn",
    "modifiedBy",
    "transactionStatus",
    "transactionUnit",
    "overrideErrorCode",
    "workflowBypassApprovalIndicator",
    "objectAttachmentPrimaryGroupTotal",
    "objectAttachmentPrimaryGroupUniqueIdentifier",
    "objectAttachmentSecondaryGroupTotal",
    "objectAttachmentSecondaryGroupUniqueIdentifier",
    "packetDept",
    "transactionDept1",
    "recordDate",
    "budgetFY",
    "fiscalYear",
    "period",
    "fiscalQuarter",
    "transactionDescription",
    "transactionName",
    "reversalDate",
    "reversalHold",
    "budgetControlReduction",
    "fundBalanceControlReduction",
    "cashBalanceControlReduction",
    "totalCredits",
    "totalDebits",
    "lineGroupCount",
    "extendedDescription",
    "overrideUserID",
    "createdOn1",
    "modifiedOn1",
    "modifiedBy1",
    "contactCode",
    "email",
    "phoneNumber",
    "lastName",
    "firstName",
    "user",
    "payDate",
    "payPeriodEndDate",
    "lastPayrollMonth",
    "payCycle",
    "escrowID",
    "additionalTransactionInformation",
    "extensionStorageUniqueID",
    "attachment",
    "jvResponseLngrp"
})
public class JVResponseType {

    @XmlElement(name = "TransactionDept")
    protected String transactionDept;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "CreatedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdOn;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "ModifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedOn;
    @XmlElement(name = "ModifiedBy")
    protected String modifiedBy;
    @XmlElement(name = "TransactionStatus")
    @XmlSchemaType(name = "string")
    protected CVLDOCSTACD transactionStatus;
    @XmlElement(name = "TransactionUnit")
    protected String transactionUnit;
    @XmlElement(name = "OverrideErrorCode")
    protected BigInteger overrideErrorCode;
    @XmlElement(name = "WorkflowBypassApprovalIndicator")
    protected Boolean workflowBypassApprovalIndicator;
    @XmlElement(name = "ObjectAttachmentPrimaryGroupTotal")
    protected BigInteger objectAttachmentPrimaryGroupTotal;
    @XmlElement(name = "ObjectAttachmentPrimaryGroupUniqueIdentifier")
    protected String objectAttachmentPrimaryGroupUniqueIdentifier;
    @XmlElement(name = "ObjectAttachmentSecondaryGroupTotal")
    protected BigInteger objectAttachmentSecondaryGroupTotal;
    @XmlElement(name = "ObjectAttachmentSecondaryGroupUniqueIdentifier")
    protected Long objectAttachmentSecondaryGroupUniqueIdentifier;
    @XmlElement(name = "PacketDept")
    protected String packetDept;
    @XmlElement(name = "TransactionDept1")
    protected String transactionDept1;
    @XmlElement(name = "RecordDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recordDate;
    @XmlElement(name = "BudgetFY")
    protected BigInteger budgetFY;
    @XmlElement(name = "FiscalYear")
    protected BigInteger fiscalYear;
    @XmlElement(name = "Period")
    protected Byte period;
    @XmlElement(name = "FiscalQuarter")
    protected BigInteger fiscalQuarter;
    @XmlElement(name = "TransactionDescription")
    protected String transactionDescription;
    @XmlElement(name = "TransactionName")
    protected String transactionName;
    @XmlElement(name = "ReversalDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reversalDate;
    @XmlElement(name = "ReversalHold")
    protected Boolean reversalHold;
    @XmlElement(name = "BudgetControlReduction")
    protected Boolean budgetControlReduction;
    @XmlElement(name = "FundBalanceControlReduction")
    protected Boolean fundBalanceControlReduction;
    @XmlElement(name = "CashBalanceControlReduction")
    protected Boolean cashBalanceControlReduction;
    @XmlElement(name = "TotalCredits")
    protected BigDecimal totalCredits;
    @XmlElement(name = "TotalDebits")
    protected BigDecimal totalDebits;
    @XmlElement(name = "LineGroupCount")
    protected BigInteger lineGroupCount;
    @XmlElement(name = "ExtendedDescription")
    protected String extendedDescription;
    @XmlElement(name = "OverrideUserID")
    protected String overrideUserID;
    @XmlElement(name = "CreatedOn1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createdOn1;
    @XmlElement(name = "ModifiedOn1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar modifiedOn1;
    @XmlElement(name = "ModifiedBy1")
    protected String modifiedBy1;
    @XmlElement(name = "ContactCode")
    protected Long contactCode;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "User")
    protected String user;
    @XmlElement(name = "PayDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar payDate;
    @XmlElement(name = "PayPeriodEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar payPeriodEndDate;
    @XmlElement(name = "LastPayrollMonth")
    protected Boolean lastPayrollMonth;
    @XmlElement(name = "PayCycle")
    protected String payCycle;
    @XmlElement(name = "EscrowID")
    protected String escrowID;
    @XmlElement(name = "AdditionalTransactionInformation")
    protected Boolean additionalTransactionInformation;
    @XmlElement(name = "ExtensionStorageUniqueID")
    protected Long extensionStorageUniqueID;
    @XmlElement(name = "Attachment")
    protected List<AttachmentResponseType> attachment;
    @XmlElement(name = "JVResponseLngrp")
    protected List<JVResponseLngrpType> jvResponseLngrp;

    /**
     * Gets the value of the transactionDept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDept() {
        return transactionDept;
    }

    /**
     * Sets the value of the transactionDept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDept(String value) {
        this.transactionDept = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the createdOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the value of the createdOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedOn(XMLGregorianCalendar value) {
        this.createdOn = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the modifiedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedOn() {
        return modifiedOn;
    }

    /**
     * Sets the value of the modifiedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedOn(XMLGregorianCalendar value) {
        this.modifiedOn = value;
    }

    /**
     * Gets the value of the modifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the value of the modifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedBy(String value) {
        this.modifiedBy = value;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CVLDOCSTACD }
     *     
     */
    public CVLDOCSTACD getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVLDOCSTACD }
     *     
     */
    public void setTransactionStatus(CVLDOCSTACD value) {
        this.transactionStatus = value;
    }

    /**
     * Gets the value of the transactionUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionUnit() {
        return transactionUnit;
    }

    /**
     * Sets the value of the transactionUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionUnit(String value) {
        this.transactionUnit = value;
    }

    /**
     * Gets the value of the overrideErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOverrideErrorCode() {
        return overrideErrorCode;
    }

    /**
     * Sets the value of the overrideErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOverrideErrorCode(BigInteger value) {
        this.overrideErrorCode = value;
    }

    /**
     * Gets the value of the workflowBypassApprovalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkflowBypassApprovalIndicator() {
        return workflowBypassApprovalIndicator;
    }

    /**
     * Sets the value of the workflowBypassApprovalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkflowBypassApprovalIndicator(Boolean value) {
        this.workflowBypassApprovalIndicator = value;
    }

    /**
     * Gets the value of the objectAttachmentPrimaryGroupTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getObjectAttachmentPrimaryGroupTotal() {
        return objectAttachmentPrimaryGroupTotal;
    }

    /**
     * Sets the value of the objectAttachmentPrimaryGroupTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setObjectAttachmentPrimaryGroupTotal(BigInteger value) {
        this.objectAttachmentPrimaryGroupTotal = value;
    }

    /**
     * Gets the value of the objectAttachmentPrimaryGroupUniqueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectAttachmentPrimaryGroupUniqueIdentifier() {
        return objectAttachmentPrimaryGroupUniqueIdentifier;
    }

    /**
     * Sets the value of the objectAttachmentPrimaryGroupUniqueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectAttachmentPrimaryGroupUniqueIdentifier(String value) {
        this.objectAttachmentPrimaryGroupUniqueIdentifier = value;
    }

    /**
     * Gets the value of the objectAttachmentSecondaryGroupTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getObjectAttachmentSecondaryGroupTotal() {
        return objectAttachmentSecondaryGroupTotal;
    }

    /**
     * Sets the value of the objectAttachmentSecondaryGroupTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setObjectAttachmentSecondaryGroupTotal(BigInteger value) {
        this.objectAttachmentSecondaryGroupTotal = value;
    }

    /**
     * Gets the value of the objectAttachmentSecondaryGroupUniqueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getObjectAttachmentSecondaryGroupUniqueIdentifier() {
        return objectAttachmentSecondaryGroupUniqueIdentifier;
    }

    /**
     * Sets the value of the objectAttachmentSecondaryGroupUniqueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setObjectAttachmentSecondaryGroupUniqueIdentifier(Long value) {
        this.objectAttachmentSecondaryGroupUniqueIdentifier = value;
    }

    /**
     * Gets the value of the packetDept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacketDept() {
        return packetDept;
    }

    /**
     * Sets the value of the packetDept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacketDept(String value) {
        this.packetDept = value;
    }

    /**
     * Gets the value of the transactionDept1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDept1() {
        return transactionDept1;
    }

    /**
     * Sets the value of the transactionDept1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDept1(String value) {
        this.transactionDept1 = value;
    }

    /**
     * Gets the value of the recordDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecordDate() {
        return recordDate;
    }

    /**
     * Sets the value of the recordDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecordDate(XMLGregorianCalendar value) {
        this.recordDate = value;
    }

    /**
     * Gets the value of the budgetFY property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBudgetFY() {
        return budgetFY;
    }

    /**
     * Sets the value of the budgetFY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBudgetFY(BigInteger value) {
        this.budgetFY = value;
    }

    /**
     * Gets the value of the fiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFiscalYear() {
        return fiscalYear;
    }

    /**
     * Sets the value of the fiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFiscalYear(BigInteger value) {
        this.fiscalYear = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPeriod(Byte value) {
        this.period = value;
    }

    /**
     * Gets the value of the fiscalQuarter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFiscalQuarter() {
        return fiscalQuarter;
    }

    /**
     * Sets the value of the fiscalQuarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFiscalQuarter(BigInteger value) {
        this.fiscalQuarter = value;
    }

    /**
     * Gets the value of the transactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDescription() {
        return transactionDescription;
    }

    /**
     * Sets the value of the transactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDescription(String value) {
        this.transactionDescription = value;
    }

    /**
     * Gets the value of the transactionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionName() {
        return transactionName;
    }

    /**
     * Sets the value of the transactionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionName(String value) {
        this.transactionName = value;
    }

    /**
     * Gets the value of the reversalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReversalDate() {
        return reversalDate;
    }

    /**
     * Sets the value of the reversalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReversalDate(XMLGregorianCalendar value) {
        this.reversalDate = value;
    }

    /**
     * Gets the value of the reversalHold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversalHold() {
        return reversalHold;
    }

    /**
     * Sets the value of the reversalHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversalHold(Boolean value) {
        this.reversalHold = value;
    }

    /**
     * Gets the value of the budgetControlReduction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBudgetControlReduction() {
        return budgetControlReduction;
    }

    /**
     * Sets the value of the budgetControlReduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBudgetControlReduction(Boolean value) {
        this.budgetControlReduction = value;
    }

    /**
     * Gets the value of the fundBalanceControlReduction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFundBalanceControlReduction() {
        return fundBalanceControlReduction;
    }

    /**
     * Sets the value of the fundBalanceControlReduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFundBalanceControlReduction(Boolean value) {
        this.fundBalanceControlReduction = value;
    }

    /**
     * Gets the value of the cashBalanceControlReduction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCashBalanceControlReduction() {
        return cashBalanceControlReduction;
    }

    /**
     * Sets the value of the cashBalanceControlReduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCashBalanceControlReduction(Boolean value) {
        this.cashBalanceControlReduction = value;
    }

    /**
     * Gets the value of the totalCredits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCredits() {
        return totalCredits;
    }

    /**
     * Sets the value of the totalCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCredits(BigDecimal value) {
        this.totalCredits = value;
    }

    /**
     * Gets the value of the totalDebits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDebits() {
        return totalDebits;
    }

    /**
     * Sets the value of the totalDebits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDebits(BigDecimal value) {
        this.totalDebits = value;
    }

    /**
     * Gets the value of the lineGroupCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineGroupCount() {
        return lineGroupCount;
    }

    /**
     * Sets the value of the lineGroupCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineGroupCount(BigInteger value) {
        this.lineGroupCount = value;
    }

    /**
     * Gets the value of the extendedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedDescription() {
        return extendedDescription;
    }

    /**
     * Sets the value of the extendedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedDescription(String value) {
        this.extendedDescription = value;
    }

    /**
     * Gets the value of the overrideUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideUserID() {
        return overrideUserID;
    }

    /**
     * Sets the value of the overrideUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideUserID(String value) {
        this.overrideUserID = value;
    }

    /**
     * Gets the value of the createdOn1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedOn1() {
        return createdOn1;
    }

    /**
     * Sets the value of the createdOn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedOn1(XMLGregorianCalendar value) {
        this.createdOn1 = value;
    }

    /**
     * Gets the value of the modifiedOn1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedOn1() {
        return modifiedOn1;
    }

    /**
     * Sets the value of the modifiedOn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedOn1(XMLGregorianCalendar value) {
        this.modifiedOn1 = value;
    }

    /**
     * Gets the value of the modifiedBy1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedBy1() {
        return modifiedBy1;
    }

    /**
     * Sets the value of the modifiedBy1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedBy1(String value) {
        this.modifiedBy1 = value;
    }

    /**
     * Gets the value of the contactCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactCode() {
        return contactCode;
    }

    /**
     * Sets the value of the contactCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactCode(Long value) {
        this.contactCode = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the payDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDate() {
        return payDate;
    }

    /**
     * Sets the value of the payDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDate(XMLGregorianCalendar value) {
        this.payDate = value;
    }

    /**
     * Gets the value of the payPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayPeriodEndDate() {
        return payPeriodEndDate;
    }

    /**
     * Sets the value of the payPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayPeriodEndDate(XMLGregorianCalendar value) {
        this.payPeriodEndDate = value;
    }

    /**
     * Gets the value of the lastPayrollMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastPayrollMonth() {
        return lastPayrollMonth;
    }

    /**
     * Sets the value of the lastPayrollMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastPayrollMonth(Boolean value) {
        this.lastPayrollMonth = value;
    }

    /**
     * Gets the value of the payCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayCycle() {
        return payCycle;
    }

    /**
     * Sets the value of the payCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayCycle(String value) {
        this.payCycle = value;
    }

    /**
     * Gets the value of the escrowID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscrowID() {
        return escrowID;
    }

    /**
     * Sets the value of the escrowID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscrowID(String value) {
        this.escrowID = value;
    }

    /**
     * Gets the value of the additionalTransactionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalTransactionInformation() {
        return additionalTransactionInformation;
    }

    /**
     * Sets the value of the additionalTransactionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalTransactionInformation(Boolean value) {
        this.additionalTransactionInformation = value;
    }

    /**
     * Gets the value of the extensionStorageUniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExtensionStorageUniqueID() {
        return extensionStorageUniqueID;
    }

    /**
     * Sets the value of the extensionStorageUniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExtensionStorageUniqueID(Long value) {
        this.extensionStorageUniqueID = value;
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

    /**
     * Gets the value of the jvResponseLngrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jvResponseLngrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJVResponseLngrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JVResponseLngrpType }
     * 
     * 
     */
    public List<JVResponseLngrpType> getJVResponseLngrp() {
        if (jvResponseLngrp == null) {
            jvResponseLngrp = new ArrayList<JVResponseLngrpType>();
        }
        return this.jvResponseLngrp;
    }

}
