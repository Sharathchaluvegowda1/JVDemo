
package abi.sbs.doc.financial.jvrequestresponse;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import abi.sbs.ecm.attachment.AttachmentRequestType;


/**
 * <p>Java class for JVRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JVRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreatedOn" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_CREA_DT" minOccurs="0"/&gt;
 *         &lt;element name="OverrideErrorCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}OV_ERR_CD" minOccurs="0"/&gt;
 *         &lt;element name="ObjectAttachmentPrimaryGroupUniqueIdentifier" type="{http://abi/sbs/doc/financial/JVRequestResponse}OBJ_ATT_PG_UNID" minOccurs="0"/&gt;
 *         &lt;element name="PacketDept" type="{http://abi/sbs/GlobalAttribute/PAC_DEPT_CD}PAC_DEPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionDept" type="{http://abi/sbs/GlobalAttribute/DOC_DEPT_CD}DOC_DEPT_CD" minOccurs="0"/&gt;
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
 *         &lt;element name="ExtendedDescription" type="{http://abi/sbs/doc/financial/JVRequestResponse}EXT_JV_DESC" minOccurs="0"/&gt;
 *         &lt;element name="ContactCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}CNTAC_CD" minOccurs="0"/&gt;
 *         &lt;element name="PayDate" type="{http://abi/sbs/doc/financial/JVRequestResponse}PY_DT" minOccurs="0"/&gt;
 *         &lt;element name="PayPeriodEndDate" type="{http://abi/sbs/doc/financial/JVRequestResponse}PY_PER_END_DT" minOccurs="0"/&gt;
 *         &lt;element name="LastPayrollMonth" type="{http://abi/sbs/doc/financial/JVRequestResponse}LAST_PYRL_MO_FL" minOccurs="0"/&gt;
 *         &lt;element name="PayCycle" type="{http://abi/sbs/doc/financial/JVRequestResponse}PY_CYC" minOccurs="0"/&gt;
 *         &lt;element name="EscrowID" type="{http://abi/sbs/doc/financial/JVRequestResponse}ESCROW_ID" minOccurs="0"/&gt;
 *         &lt;element name="Attachment" type="{http://abi/sbs/ecm/Attachment}AttachmentRequestType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JVRequestLngrp" type="{http://abi/sbs/doc/financial/JVRequestResponse}JVRequestLngrpType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JVRequestType", propOrder = {
    "createdOn",
    "overrideErrorCode",
    "objectAttachmentPrimaryGroupUniqueIdentifier",
    "packetDept",
    "transactionDept",
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
    "extendedDescription",
    "contactCode",
    "payDate",
    "payPeriodEndDate",
    "lastPayrollMonth",
    "payCycle",
    "escrowID",
    "attachment",
    "jvRequestLngrp"
})
public class JVRequestType {

    @XmlElement(name = "CreatedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdOn;
    @XmlElement(name = "OverrideErrorCode")
    protected BigInteger overrideErrorCode;
    @XmlElement(name = "ObjectAttachmentPrimaryGroupUniqueIdentifier")
    protected String objectAttachmentPrimaryGroupUniqueIdentifier;
    @XmlElement(name = "PacketDept")
    protected String packetDept;
    @XmlElement(name = "TransactionDept")
    protected String transactionDept;
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
    @XmlElement(name = "ExtendedDescription")
    protected String extendedDescription;
    @XmlElement(name = "ContactCode")
    protected Long contactCode;
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
    @XmlElement(name = "Attachment")
    protected List<AttachmentRequestType> attachment;
    @XmlElement(name = "JVRequestLngrp")
    protected List<JVRequestLngrpType> jvRequestLngrp;

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

    /**
     * Gets the value of the jvRequestLngrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jvRequestLngrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJVRequestLngrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JVRequestLngrpType }
     * 
     * 
     */
    public List<JVRequestLngrpType> getJVRequestLngrp() {
        if (jvRequestLngrp == null) {
            jvRequestLngrp = new ArrayList<JVRequestLngrpType>();
        }
        return this.jvRequestLngrp;
    }

}
