
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
import abi.sbs.codedvaluelist.cvl_authdi_ind.CVLAUTHDIIND;
import abi.sbs.ecm.attachment.AttachmentRequestType;


/**
 * <p>Java class for JVRequestActgType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JVRequestActgType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountingLine" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_ACTG_LN_NO" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCreationDate" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_CREA_DT" minOccurs="0"/&gt;
 *         &lt;element name="BudgetFY" type="{http://abi/sbs/doc/financial/JVRequestResponse}BFY" minOccurs="0"/&gt;
 *         &lt;element name="FiscalYear" type="{http://abi/sbs/doc/financial/JVRequestResponse}FY_DC" minOccurs="0"/&gt;
 *         &lt;element name="Period" type="{http://abi/sbs/doc/financial/JVRequestResponse}PER_DC" minOccurs="0"/&gt;
 *         &lt;element name="FiscalQuarter" type="{http://abi/sbs/doc/financial/JVRequestResponse}FQTR" minOccurs="0"/&gt;
 *         &lt;element name="CreditAmount" type="{http://abi/sbs/doc/financial/JVRequestResponse}CR_AM" minOccurs="0"/&gt;
 *         &lt;element name="AccountingTemplate" type="{http://abi/sbs/GlobalAttribute/ACTG_TMPL_ID}ACTG_TMPL_ID" minOccurs="0"/&gt;
 *         &lt;element name="LineFunction" type="{http://abi/sbs/doc/financial/JVRequestResponse}LN_FUNC_CD" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedTransactionCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}RFED_DOC_CD" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedTransactionDepartment" type="{http://abi/sbs/GlobalAttribute/DOC_DEPT_CD}DOC_DEPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedTransactionID" type="{http://abi/sbs/doc/financial/JVRequestResponse}RFED_DOC_ID" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedVendorLine" type="{http://abi/sbs/doc/financial/JVRequestResponse}RFED_VEND_LN_NO" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedCommodityLine" type="{http://abi/sbs/doc/financial/JVRequestResponse}RFED_COMM_LN_NO" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedAccountingLine" type="{http://abi/sbs/doc/financial/JVRequestResponse}RFED_ACTG_LN_NO" minOccurs="0"/&gt;
 *         &lt;element name="VendorOrCustomer" type="{http://abi/sbs/doc/financial/JVRequestResponse}VEND_CUST_IND" minOccurs="0"/&gt;
 *         &lt;element name="DebitAmount" type="{http://abi/sbs/doc/financial/JVRequestResponse}DR_AM" minOccurs="0"/&gt;
 *         &lt;element name="Fund" type="{http://abi/sbs/GlobalAttribute/FUND_CD}FUND_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubFund" type="{http://abi/sbs/GlobalAttribute/SFUND_CD}SFUND_CD" minOccurs="0"/&gt;
 *         &lt;element name="Object" type="{http://abi/sbs/GlobalAttribute/OBJ_CD}OBJ_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubObject" type="{http://abi/sbs/GlobalAttribute/SOBJ_CD}SOBJ_CD" minOccurs="0"/&gt;
 *         &lt;element name="Revenue" type="{http://abi/sbs/GlobalAttribute/RSRC_CD}RSRC_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubRevenue" type="{http://abi/sbs/GlobalAttribute/SRSRC_CD}SRSRC_CD" minOccurs="0"/&gt;
 *         &lt;element name="BSA" type="{http://abi/sbs/GlobalAttribute/BSA_CD}BSA_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubBSA" type="{http://abi/sbs/GlobalAttribute/SBSA_CD}SBSA_CD" minOccurs="0"/&gt;
 *         &lt;element name="OBSA" type="{http://abi/sbs/GlobalAttribute/OBSA_CD}OBSA_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubOBSA" type="{http://abi/sbs/GlobalAttribute/OSBSA_CD}OSBSA_CD" minOccurs="0"/&gt;
 *         &lt;element name="GovernmentBranch" type="{http://abi/sbs/GlobalAttribute/GOVT_BRN_CD}GOVT_BRN_CD" minOccurs="0"/&gt;
 *         &lt;element name="Cabinet" type="{http://abi/sbs/GlobalAttribute/CAB_CD}CAB_CD" minOccurs="0"/&gt;
 *         &lt;element name="Department" type="{http://abi/sbs/GlobalAttribute/DEPT_CD}DEPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="Division" type="{http://abi/sbs/GlobalAttribute/DIV_CD}DIV_CD" minOccurs="0"/&gt;
 *         &lt;element name="Group" type="{http://abi/sbs/GlobalAttribute/GP_CD}GP_CD" minOccurs="0"/&gt;
 *         &lt;element name="Section" type="{http://abi/sbs/GlobalAttribute/SECT_CD}SECT_CD" minOccurs="0"/&gt;
 *         &lt;element name="District" type="{http://abi/sbs/GlobalAttribute/DSTC_CD}DSTC_CD" minOccurs="0"/&gt;
 *         &lt;element name="Bureau" type="{http://abi/sbs/GlobalAttribute/BUR_CD}BUR_CD" minOccurs="0"/&gt;
 *         &lt;element name="Unit" type="{http://abi/sbs/GlobalAttribute/UNIT_CD}UNIT_CD" minOccurs="0"/&gt;
 *         &lt;element name="ApprUnit" type="{http://abi/sbs/GlobalAttribute/APPR_CD}APPR_CD" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://abi/sbs/GlobalAttribute/LOC_CD}LOC_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubLocation" type="{http://abi/sbs/GlobalAttribute/SLOC_CD}SLOC_CD" minOccurs="0"/&gt;
 *         &lt;element name="County" type="{http://abi/sbs/GlobalAttribute/CNTY_CD}CNTY_CD" minOccurs="0"/&gt;
 *         &lt;element name="Activity" type="{http://abi/sbs/GlobalAttribute/ACTV_CD}ACTV_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubActivity" type="{http://abi/sbs/GlobalAttribute/SACTV_CD}SACTV_CD" minOccurs="0"/&gt;
 *         &lt;element name="Function" type="{http://abi/sbs/GlobalAttribute/FUNC_CD}FUNC_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubFunction" type="{http://abi/sbs/GlobalAttribute/SFUNC_CD}SFUNC_CD" minOccurs="0"/&gt;
 *         &lt;element name="Reporting" type="{http://abi/sbs/GlobalAttribute/RPT_CD}RPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubReporting" type="{http://abi/sbs/GlobalAttribute/SRPT_CD}SRPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="DeptObject" type="{http://abi/sbs/GlobalAttribute/DOBJ_CD}DOBJ_CD" minOccurs="0"/&gt;
 *         &lt;element name="DeptRevenue" type="{http://abi/sbs/GlobalAttribute/DRSRC_CD}DRSRC_CD" minOccurs="0"/&gt;
 *         &lt;element name="Task" type="{http://abi/sbs/GlobalAttribute/TASK_CD}TASK_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubTask" type="{http://abi/sbs/GlobalAttribute/STASK_CD}STASK_CD" minOccurs="0"/&gt;
 *         &lt;element name="TaskOrder" type="{http://abi/sbs/GlobalAttribute/TASK_ORD_CD}TASK_ORD_CD" minOccurs="0"/&gt;
 *         &lt;element name="Program" type="{http://abi/sbs/GlobalAttribute/PROG_CD}PROG_CD" minOccurs="0"/&gt;
 *         &lt;element name="Phase" type="{http://abi/sbs/GlobalAttribute/PHASE_CD}PHASE_CD" minOccurs="0"/&gt;
 *         &lt;element name="ProgramPeriod" type="{http://abi/sbs/GlobalAttribute/PPC_CD}PPC_CD" minOccurs="0"/&gt;
 *         &lt;element name="FundingProfile" type="{http://abi/sbs/GlobalAttribute/FPRFL_CD}FPRFL_CD" minOccurs="0"/&gt;
 *         &lt;element name="PerformanceUnitOfMeasure" type="{http://abi/sbs/doc/financial/JVRequestResponse}PERF_UNIT_MEAS_CD" minOccurs="0"/&gt;
 *         &lt;element name="LineDescription" type="{http://abi/sbs/doc/financial/JVRequestResponse}ACTG_LN_DSCR" minOccurs="0"/&gt;
 *         &lt;element name="PostingCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}PSCD_ID" minOccurs="0"/&gt;
 *         &lt;element name="InternalFund" type="{http://abi/sbs/GlobalAttribute/IG_FUND_CD}IG_FUND_CD" minOccurs="0"/&gt;
 *         &lt;element name="InternalSubFund" type="{http://abi/sbs/GlobalAttribute/IG_SFUND_CD}IG_SFUND_CD" minOccurs="0"/&gt;
 *         &lt;element name="InternalDept" type="{http://abi/sbs/GlobalAttribute/IG_DEPT_CD}IG_DEPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="LineGroupLineNumber" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_LNGRP_LN_NO" minOccurs="0"/&gt;
 *         &lt;element name="SubUnit" type="{http://abi/sbs/GlobalAttribute/SUNIT_CD}SUNIT_CD" minOccurs="0"/&gt;
 *         &lt;element name="Bank" type="{http://abi/sbs/doc/financial/JVRequestResponse}BANK_ACCT_CD" minOccurs="0"/&gt;
 *         &lt;element name="FundingPriority" type="{http://abi/sbs/GlobalAttribute/FPRTY_CD}FPRTY_CD" minOccurs="0"/&gt;
 *         &lt;element name="FundingLine" type="{http://abi/sbs/GlobalAttribute/FLINE_CD}FLINE_CD" minOccurs="0"/&gt;
 *         &lt;element name="AccountingClassification" type="{http://abi/sbs/doc/financial/JVRequestResponse}ACCT_CLASS_IND" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://abi/sbs/doc/financial/JVRequestResponse}PY_UNIT" minOccurs="0"/&gt;
 *         &lt;element name="HumanResourceMeasure" type="{http://abi/sbs/doc/financial/JVRequestResponse}HR_MSR_CD" minOccurs="0"/&gt;
 *         &lt;element name="BatchLoaded" type="{http://abi/sbs/doc/financial/JVRequestResponse}BAT_LOAD_FL" minOccurs="0"/&gt;
 *         &lt;element name="DebtID" type="{http://abi/sbs/doc/financial/JVRequestResponse}DEBT_ID" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizationDebtInstrument" type="{http://abi/sbs/CodedValueList/CVL_AUTHDI_IND}CVL_AUTHDI_IND" minOccurs="0"/&gt;
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
@XmlType(name = "JVRequestActgType", propOrder = {
    "accountingLine",
    "transactionCreationDate",
    "budgetFY",
    "fiscalYear",
    "period",
    "fiscalQuarter",
    "creditAmount",
    "accountingTemplate",
    "lineFunction",
    "referencedTransactionCode",
    "referencedTransactionDepartment",
    "referencedTransactionID",
    "referencedVendorLine",
    "referencedCommodityLine",
    "referencedAccountingLine",
    "vendorOrCustomer",
    "debitAmount",
    "fund",
    "subFund",
    "object",
    "subObject",
    "revenue",
    "subRevenue",
    "bsa",
    "subBSA",
    "obsa",
    "subOBSA",
    "governmentBranch",
    "cabinet",
    "department",
    "division",
    "group",
    "section",
    "district",
    "bureau",
    "unit",
    "apprUnit",
    "location",
    "subLocation",
    "county",
    "activity",
    "subActivity",
    "function",
    "subFunction",
    "reporting",
    "subReporting",
    "deptObject",
    "deptRevenue",
    "task",
    "subTask",
    "taskOrder",
    "program",
    "phase",
    "programPeriod",
    "fundingProfile",
    "performanceUnitOfMeasure",
    "lineDescription",
    "postingCode",
    "internalFund",
    "internalSubFund",
    "internalDept",
    "lineGroupLineNumber",
    "subUnit",
    "bank",
    "fundingPriority",
    "fundingLine",
    "accountingClassification",
    "quantity",
    "humanResourceMeasure",
    "batchLoaded",
    "debtID",
    "authorizationDebtInstrument",
    "attachment"
})
public class JVRequestActgType {

    @XmlElement(name = "AccountingLine")
    protected BigInteger accountingLine;
    @XmlElement(name = "TransactionCreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionCreationDate;
    @XmlElement(name = "BudgetFY")
    protected BigInteger budgetFY;
    @XmlElement(name = "FiscalYear")
    protected BigInteger fiscalYear;
    @XmlElement(name = "Period")
    protected Byte period;
    @XmlElement(name = "FiscalQuarter")
    protected BigInteger fiscalQuarter;
    @XmlElement(name = "CreditAmount")
    protected BigDecimal creditAmount;
    @XmlElement(name = "AccountingTemplate")
    protected String accountingTemplate;
    @XmlElement(name = "LineFunction")
    protected BigInteger lineFunction;
    @XmlElement(name = "ReferencedTransactionCode")
    protected String referencedTransactionCode;
    @XmlElement(name = "ReferencedTransactionDepartment")
    protected String referencedTransactionDepartment;
    @XmlElement(name = "ReferencedTransactionID")
    protected String referencedTransactionID;
    @XmlElement(name = "ReferencedVendorLine")
    protected BigInteger referencedVendorLine;
    @XmlElement(name = "ReferencedCommodityLine")
    protected BigInteger referencedCommodityLine;
    @XmlElement(name = "ReferencedAccountingLine")
    protected BigInteger referencedAccountingLine;
    @XmlElement(name = "VendorOrCustomer")
    protected String vendorOrCustomer;
    @XmlElement(name = "DebitAmount")
    protected BigDecimal debitAmount;
    @XmlElement(name = "Fund")
    protected String fund;
    @XmlElement(name = "SubFund")
    protected String subFund;
    @XmlElement(name = "Object")
    protected String object;
    @XmlElement(name = "SubObject")
    protected String subObject;
    @XmlElement(name = "Revenue")
    protected String revenue;
    @XmlElement(name = "SubRevenue")
    protected String subRevenue;
    @XmlElement(name = "BSA")
    protected String bsa;
    @XmlElement(name = "SubBSA")
    protected String subBSA;
    @XmlElement(name = "OBSA")
    protected String obsa;
    @XmlElement(name = "SubOBSA")
    protected String subOBSA;
    @XmlElement(name = "GovernmentBranch")
    protected String governmentBranch;
    @XmlElement(name = "Cabinet")
    protected String cabinet;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "Division")
    protected String division;
    @XmlElement(name = "Group")
    protected String group;
    @XmlElement(name = "Section")
    protected String section;
    @XmlElement(name = "District")
    protected String district;
    @XmlElement(name = "Bureau")
    protected String bureau;
    @XmlElement(name = "Unit")
    protected String unit;
    @XmlElement(name = "ApprUnit")
    protected String apprUnit;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "SubLocation")
    protected String subLocation;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "Activity")
    protected String activity;
    @XmlElement(name = "SubActivity")
    protected String subActivity;
    @XmlElement(name = "Function")
    protected String function;
    @XmlElement(name = "SubFunction")
    protected String subFunction;
    @XmlElement(name = "Reporting")
    protected String reporting;
    @XmlElement(name = "SubReporting")
    protected String subReporting;
    @XmlElement(name = "DeptObject")
    protected String deptObject;
    @XmlElement(name = "DeptRevenue")
    protected String deptRevenue;
    @XmlElement(name = "Task")
    protected String task;
    @XmlElement(name = "SubTask")
    protected String subTask;
    @XmlElement(name = "TaskOrder")
    protected String taskOrder;
    @XmlElement(name = "Program")
    protected String program;
    @XmlElement(name = "Phase")
    protected String phase;
    @XmlElement(name = "ProgramPeriod")
    protected String programPeriod;
    @XmlElement(name = "FundingProfile")
    protected String fundingProfile;
    @XmlElement(name = "PerformanceUnitOfMeasure")
    protected String performanceUnitOfMeasure;
    @XmlElement(name = "LineDescription")
    protected String lineDescription;
    @XmlElement(name = "PostingCode")
    protected String postingCode;
    @XmlElement(name = "InternalFund")
    protected String internalFund;
    @XmlElement(name = "InternalSubFund")
    protected String internalSubFund;
    @XmlElement(name = "InternalDept")
    protected String internalDept;
    @XmlElement(name = "LineGroupLineNumber")
    protected BigInteger lineGroupLineNumber;
    @XmlElement(name = "SubUnit")
    protected String subUnit;
    @XmlElement(name = "Bank")
    protected String bank;
    @XmlElement(name = "FundingPriority")
    protected String fundingPriority;
    @XmlElement(name = "FundingLine")
    protected String fundingLine;
    @XmlElement(name = "AccountingClassification")
    protected BigInteger accountingClassification;
    @XmlElement(name = "Quantity")
    protected BigDecimal quantity;
    @XmlElement(name = "HumanResourceMeasure")
    protected String humanResourceMeasure;
    @XmlElement(name = "BatchLoaded")
    protected Boolean batchLoaded;
    @XmlElement(name = "DebtID")
    protected String debtID;
    @XmlElement(name = "AuthorizationDebtInstrument")
    @XmlSchemaType(name = "string")
    protected CVLAUTHDIIND authorizationDebtInstrument;
    @XmlElement(name = "Attachment")
    protected List<AttachmentRequestType> attachment;

    /**
     * Gets the value of the accountingLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountingLine() {
        return accountingLine;
    }

    /**
     * Sets the value of the accountingLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountingLine(BigInteger value) {
        this.accountingLine = value;
    }

    /**
     * Gets the value of the transactionCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionCreationDate() {
        return transactionCreationDate;
    }

    /**
     * Sets the value of the transactionCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionCreationDate(XMLGregorianCalendar value) {
        this.transactionCreationDate = value;
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
     * Gets the value of the creditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    /**
     * Sets the value of the creditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditAmount(BigDecimal value) {
        this.creditAmount = value;
    }

    /**
     * Gets the value of the accountingTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingTemplate() {
        return accountingTemplate;
    }

    /**
     * Sets the value of the accountingTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingTemplate(String value) {
        this.accountingTemplate = value;
    }

    /**
     * Gets the value of the lineFunction property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineFunction() {
        return lineFunction;
    }

    /**
     * Sets the value of the lineFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineFunction(BigInteger value) {
        this.lineFunction = value;
    }

    /**
     * Gets the value of the referencedTransactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencedTransactionCode() {
        return referencedTransactionCode;
    }

    /**
     * Sets the value of the referencedTransactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencedTransactionCode(String value) {
        this.referencedTransactionCode = value;
    }

    /**
     * Gets the value of the referencedTransactionDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencedTransactionDepartment() {
        return referencedTransactionDepartment;
    }

    /**
     * Sets the value of the referencedTransactionDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencedTransactionDepartment(String value) {
        this.referencedTransactionDepartment = value;
    }

    /**
     * Gets the value of the referencedTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencedTransactionID() {
        return referencedTransactionID;
    }

    /**
     * Sets the value of the referencedTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencedTransactionID(String value) {
        this.referencedTransactionID = value;
    }

    /**
     * Gets the value of the referencedVendorLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReferencedVendorLine() {
        return referencedVendorLine;
    }

    /**
     * Sets the value of the referencedVendorLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReferencedVendorLine(BigInteger value) {
        this.referencedVendorLine = value;
    }

    /**
     * Gets the value of the referencedCommodityLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReferencedCommodityLine() {
        return referencedCommodityLine;
    }

    /**
     * Sets the value of the referencedCommodityLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReferencedCommodityLine(BigInteger value) {
        this.referencedCommodityLine = value;
    }

    /**
     * Gets the value of the referencedAccountingLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReferencedAccountingLine() {
        return referencedAccountingLine;
    }

    /**
     * Sets the value of the referencedAccountingLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReferencedAccountingLine(BigInteger value) {
        this.referencedAccountingLine = value;
    }

    /**
     * Gets the value of the vendorOrCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorOrCustomer() {
        return vendorOrCustomer;
    }

    /**
     * Sets the value of the vendorOrCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorOrCustomer(String value) {
        this.vendorOrCustomer = value;
    }

    /**
     * Gets the value of the debitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebitAmount() {
        return debitAmount;
    }

    /**
     * Sets the value of the debitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebitAmount(BigDecimal value) {
        this.debitAmount = value;
    }

    /**
     * Gets the value of the fund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFund() {
        return fund;
    }

    /**
     * Sets the value of the fund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFund(String value) {
        this.fund = value;
    }

    /**
     * Gets the value of the subFund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubFund() {
        return subFund;
    }

    /**
     * Sets the value of the subFund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubFund(String value) {
        this.subFund = value;
    }

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObject(String value) {
        this.object = value;
    }

    /**
     * Gets the value of the subObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubObject() {
        return subObject;
    }

    /**
     * Sets the value of the subObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubObject(String value) {
        this.subObject = value;
    }

    /**
     * Gets the value of the revenue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenue() {
        return revenue;
    }

    /**
     * Sets the value of the revenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenue(String value) {
        this.revenue = value;
    }

    /**
     * Gets the value of the subRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubRevenue() {
        return subRevenue;
    }

    /**
     * Sets the value of the subRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubRevenue(String value) {
        this.subRevenue = value;
    }

    /**
     * Gets the value of the bsa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSA() {
        return bsa;
    }

    /**
     * Sets the value of the bsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSA(String value) {
        this.bsa = value;
    }

    /**
     * Gets the value of the subBSA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBSA() {
        return subBSA;
    }

    /**
     * Sets the value of the subBSA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBSA(String value) {
        this.subBSA = value;
    }

    /**
     * Gets the value of the obsa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBSA() {
        return obsa;
    }

    /**
     * Sets the value of the obsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBSA(String value) {
        this.obsa = value;
    }

    /**
     * Gets the value of the subOBSA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubOBSA() {
        return subOBSA;
    }

    /**
     * Sets the value of the subOBSA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubOBSA(String value) {
        this.subOBSA = value;
    }

    /**
     * Gets the value of the governmentBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentBranch() {
        return governmentBranch;
    }

    /**
     * Sets the value of the governmentBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentBranch(String value) {
        this.governmentBranch = value;
    }

    /**
     * Gets the value of the cabinet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinet() {
        return cabinet;
    }

    /**
     * Sets the value of the cabinet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinet(String value) {
        this.cabinet = value;
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
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the bureau property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBureau() {
        return bureau;
    }

    /**
     * Sets the value of the bureau property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBureau(String value) {
        this.bureau = value;
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
     * Gets the value of the apprUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprUnit() {
        return apprUnit;
    }

    /**
     * Sets the value of the apprUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprUnit(String value) {
        this.apprUnit = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the subLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubLocation() {
        return subLocation;
    }

    /**
     * Sets the value of the subLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubLocation(String value) {
        this.subLocation = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity(String value) {
        this.activity = value;
    }

    /**
     * Gets the value of the subActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubActivity() {
        return subActivity;
    }

    /**
     * Sets the value of the subActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubActivity(String value) {
        this.subActivity = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the subFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubFunction() {
        return subFunction;
    }

    /**
     * Sets the value of the subFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubFunction(String value) {
        this.subFunction = value;
    }

    /**
     * Gets the value of the reporting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReporting() {
        return reporting;
    }

    /**
     * Sets the value of the reporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReporting(String value) {
        this.reporting = value;
    }

    /**
     * Gets the value of the subReporting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubReporting() {
        return subReporting;
    }

    /**
     * Sets the value of the subReporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubReporting(String value) {
        this.subReporting = value;
    }

    /**
     * Gets the value of the deptObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptObject() {
        return deptObject;
    }

    /**
     * Sets the value of the deptObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptObject(String value) {
        this.deptObject = value;
    }

    /**
     * Gets the value of the deptRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptRevenue() {
        return deptRevenue;
    }

    /**
     * Sets the value of the deptRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptRevenue(String value) {
        this.deptRevenue = value;
    }

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTask(String value) {
        this.task = value;
    }

    /**
     * Gets the value of the subTask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTask() {
        return subTask;
    }

    /**
     * Sets the value of the subTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTask(String value) {
        this.subTask = value;
    }

    /**
     * Gets the value of the taskOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskOrder() {
        return taskOrder;
    }

    /**
     * Sets the value of the taskOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskOrder(String value) {
        this.taskOrder = value;
    }

    /**
     * Gets the value of the program property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgram() {
        return program;
    }

    /**
     * Sets the value of the program property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgram(String value) {
        this.program = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhase(String value) {
        this.phase = value;
    }

    /**
     * Gets the value of the programPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramPeriod() {
        return programPeriod;
    }

    /**
     * Sets the value of the programPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramPeriod(String value) {
        this.programPeriod = value;
    }

    /**
     * Gets the value of the fundingProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundingProfile() {
        return fundingProfile;
    }

    /**
     * Sets the value of the fundingProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundingProfile(String value) {
        this.fundingProfile = value;
    }

    /**
     * Gets the value of the performanceUnitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformanceUnitOfMeasure() {
        return performanceUnitOfMeasure;
    }

    /**
     * Sets the value of the performanceUnitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformanceUnitOfMeasure(String value) {
        this.performanceUnitOfMeasure = value;
    }

    /**
     * Gets the value of the lineDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineDescription() {
        return lineDescription;
    }

    /**
     * Sets the value of the lineDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineDescription(String value) {
        this.lineDescription = value;
    }

    /**
     * Gets the value of the postingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingCode() {
        return postingCode;
    }

    /**
     * Sets the value of the postingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingCode(String value) {
        this.postingCode = value;
    }

    /**
     * Gets the value of the internalFund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalFund() {
        return internalFund;
    }

    /**
     * Sets the value of the internalFund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalFund(String value) {
        this.internalFund = value;
    }

    /**
     * Gets the value of the internalSubFund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalSubFund() {
        return internalSubFund;
    }

    /**
     * Sets the value of the internalSubFund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalSubFund(String value) {
        this.internalSubFund = value;
    }

    /**
     * Gets the value of the internalDept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalDept() {
        return internalDept;
    }

    /**
     * Sets the value of the internalDept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalDept(String value) {
        this.internalDept = value;
    }

    /**
     * Gets the value of the lineGroupLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineGroupLineNumber() {
        return lineGroupLineNumber;
    }

    /**
     * Sets the value of the lineGroupLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineGroupLineNumber(BigInteger value) {
        this.lineGroupLineNumber = value;
    }

    /**
     * Gets the value of the subUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubUnit() {
        return subUnit;
    }

    /**
     * Sets the value of the subUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubUnit(String value) {
        this.subUnit = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBank(String value) {
        this.bank = value;
    }

    /**
     * Gets the value of the fundingPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundingPriority() {
        return fundingPriority;
    }

    /**
     * Sets the value of the fundingPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundingPriority(String value) {
        this.fundingPriority = value;
    }

    /**
     * Gets the value of the fundingLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundingLine() {
        return fundingLine;
    }

    /**
     * Sets the value of the fundingLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundingLine(String value) {
        this.fundingLine = value;
    }

    /**
     * Gets the value of the accountingClassification property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountingClassification() {
        return accountingClassification;
    }

    /**
     * Sets the value of the accountingClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountingClassification(BigInteger value) {
        this.accountingClassification = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the humanResourceMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHumanResourceMeasure() {
        return humanResourceMeasure;
    }

    /**
     * Sets the value of the humanResourceMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHumanResourceMeasure(String value) {
        this.humanResourceMeasure = value;
    }

    /**
     * Gets the value of the batchLoaded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBatchLoaded() {
        return batchLoaded;
    }

    /**
     * Sets the value of the batchLoaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBatchLoaded(Boolean value) {
        this.batchLoaded = value;
    }

    /**
     * Gets the value of the debtID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtID() {
        return debtID;
    }

    /**
     * Sets the value of the debtID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtID(String value) {
        this.debtID = value;
    }

    /**
     * Gets the value of the authorizationDebtInstrument property.
     * 
     * @return
     *     possible object is
     *     {@link CVLAUTHDIIND }
     *     
     */
    public CVLAUTHDIIND getAuthorizationDebtInstrument() {
        return authorizationDebtInstrument;
    }

    /**
     * Sets the value of the authorizationDebtInstrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVLAUTHDIIND }
     *     
     */
    public void setAuthorizationDebtInstrument(CVLAUTHDIIND value) {
        this.authorizationDebtInstrument = value;
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
