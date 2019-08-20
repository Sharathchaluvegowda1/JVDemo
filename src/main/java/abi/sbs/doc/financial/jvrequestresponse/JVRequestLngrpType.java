
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
import abi.sbs.codedvaluelist.cvl_pst_pr_id.CVLPSTPRID;
import abi.sbs.codedvaluelist.cvl_tin_typ.CVLTINTYP;
import abi.sbs.ecm.attachment.AttachmentRequestType;


/**
 * <p>Java class for JVRequestLngrpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JVRequestLngrpType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionCreationDate" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_CREA_DT" minOccurs="0"/&gt;
 *         &lt;element name="EventType" type="{http://abi/sbs/doc/financial/JVRequestResponse}EVNT_TYP_ID" minOccurs="0"/&gt;
 *         &lt;element name="PostingPair" type="{http://abi/sbs/CodedValueList/CVL_PST_PR_ID}CVL_PST_PR_ID" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceType" type="{http://abi/sbs/doc/financial/JVRequestResponse}RF_TYP" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedLineOpenAmount" type="{http://abi/sbs/doc/financial/JVRequestResponse}RFED_OPN_LN_AM" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedTransactionCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}RFED_DOC_CD" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedTransactionDepartment" type="{http://abi/sbs/GlobalAttribute/DOC_DEPT_CD}DOC_DEPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedTransactionID" type="{http://abi/sbs/doc/financial/JVRequestResponse}RFED_DOC_ID" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedTransactionVersion" type="{http://abi/sbs/doc/financial/JVRequestResponse}RFED_DOC_VERS_NO" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedVendorLine" type="{http://abi/sbs/doc/financial/JVRequestResponse}RFED_VEND_LN_NO" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedCommodityLine" type="{http://abi/sbs/doc/financial/JVRequestResponse}RFED_COMM_LN_NO" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedAccountingLine" type="{http://abi/sbs/doc/financial/JVRequestResponse}RFED_ACTG_LN_NO" minOccurs="0"/&gt;
 *         &lt;element name="RefAmendment" type="{http://abi/sbs/doc/financial/JVRequestResponse}RFED_AMND_NO" minOccurs="0"/&gt;
 *         &lt;element name="VendorCustomer" type="{http://abi/sbs/doc/financial/JVRequestResponse}VEND_CUST_CD" minOccurs="0"/&gt;
 *         &lt;element name="LegalName" type="{http://abi/sbs/doc/financial/JVRequestResponse}LGL_NM" minOccurs="0"/&gt;
 *         &lt;element name="AliasOrDBA" type="{http://abi/sbs/doc/financial/JVRequestResponse}ALIAS_NM" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine1" type="{http://abi/sbs/doc/financial/JVRequestResponse}AD_LN_1" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine2" type="{http://abi/sbs/doc/financial/JVRequestResponse}AD_LN_2" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://abi/sbs/doc/financial/JVRequestResponse}CITY" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://abi/sbs/doc/financial/JVRequestResponse}ST" minOccurs="0"/&gt;
 *         &lt;element name="Zip" type="{http://abi/sbs/doc/financial/JVRequestResponse}ZIP" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://abi/sbs/doc/financial/JVRequestResponse}CTRY" minOccurs="0"/&gt;
 *         &lt;element name="County" type="{http://abi/sbs/doc/financial/JVRequestResponse}CNTY" minOccurs="0"/&gt;
 *         &lt;element name="VendorContactPhone" type="{http://abi/sbs/doc/financial/JVRequestResponse}VOICE_PH_NO" minOccurs="0"/&gt;
 *         &lt;element name="VendorContactPhoneExtension" type="{http://abi/sbs/doc/financial/JVRequestResponse}VOICE_PH_EXT" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://abi/sbs/doc/financial/JVRequestResponse}FAX_PH_NO" minOccurs="0"/&gt;
 *         &lt;element name="FaxExtension" type="{http://abi/sbs/doc/financial/JVRequestResponse}FAX_PH_EXT" minOccurs="0"/&gt;
 *         &lt;element name="VendorContactEmail" type="{http://abi/sbs/doc/financial/JVRequestResponse}EMAIL_AD" minOccurs="0"/&gt;
 *         &lt;element name="WebAddress" type="{http://abi/sbs/doc/financial/JVRequestResponse}WEB_AD" minOccurs="0"/&gt;
 *         &lt;element name="VendorContactName" type="{http://abi/sbs/doc/financial/JVRequestResponse}PRIN_CNTAC" minOccurs="0"/&gt;
 *         &lt;element name="LineGroupDescription" type="{http://abi/sbs/doc/financial/JVRequestResponse}LNGRP_DSCR" minOccurs="0"/&gt;
 *         &lt;element name="PerformanceUnits" type="{http://abi/sbs/doc/financial/JVRequestResponse}PERF_UNIT" minOccurs="0"/&gt;
 *         &lt;element name="UnitOfMeasure" type="{http://abi/sbs/doc/financial/JVRequestResponse}UNIT_MEAS_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionLineGroupLineNumber" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_LNGRP_LN_NO" minOccurs="0"/&gt;
 *         &lt;element name="TransactionChildMaximumLineNumber" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_CHLD_MAX_LN_NO" minOccurs="0"/&gt;
 *         &lt;element name="LineGroup" type="{http://abi/sbs/doc/financial/JVRequestResponse}LNGRP_ID" minOccurs="0"/&gt;
 *         &lt;element name="Fund" type="{http://abi/sbs/GlobalAttribute/FUND_CD}FUND_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubFund" type="{http://abi/sbs/GlobalAttribute/SFUND_CD}SFUND_CD" minOccurs="0"/&gt;
 *         &lt;element name="Department" type="{http://abi/sbs/GlobalAttribute/DEPT_CD}DEPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="Unit" type="{http://abi/sbs/GlobalAttribute/UNIT_CD}UNIT_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubUnit" type="{http://abi/sbs/GlobalAttribute/SUNIT_CD}SUNIT_CD" minOccurs="0"/&gt;
 *         &lt;element name="ApprUnit" type="{http://abi/sbs/GlobalAttribute/APPR_CD}APPR_CD" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://abi/sbs/GlobalAttribute/LOC_CD}LOC_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubLocation" type="{http://abi/sbs/GlobalAttribute/SLOC_CD}SLOC_CD" minOccurs="0"/&gt;
 *         &lt;element name="County1" type="{http://abi/sbs/GlobalAttribute/CNTY_CD}CNTY_CD" minOccurs="0"/&gt;
 *         &lt;element name="Activity" type="{http://abi/sbs/GlobalAttribute/ACTV_CD}ACTV_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubActivity" type="{http://abi/sbs/GlobalAttribute/SACTV_CD}SACTV_CD" minOccurs="0"/&gt;
 *         &lt;element name="Function" type="{http://abi/sbs/GlobalAttribute/FUNC_CD}FUNC_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubFunction" type="{http://abi/sbs/GlobalAttribute/SFUNC_CD}SFUNC_CD" minOccurs="0"/&gt;
 *         &lt;element name="Object" type="{http://abi/sbs/GlobalAttribute/OBJ_CD}OBJ_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubObject" type="{http://abi/sbs/GlobalAttribute/SOBJ_CD}SOBJ_CD" minOccurs="0"/&gt;
 *         &lt;element name="Revenue" type="{http://abi/sbs/GlobalAttribute/RSRC_CD}RSRC_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubRevenue" type="{http://abi/sbs/GlobalAttribute/SRSRC_CD}SRSRC_CD" minOccurs="0"/&gt;
 *         &lt;element name="BSA" type="{http://abi/sbs/GlobalAttribute/BSA_CD}BSA_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubBSA" type="{http://abi/sbs/GlobalAttribute/SBSA_CD}SBSA_CD" minOccurs="0"/&gt;
 *         &lt;element name="OBSA" type="{http://abi/sbs/GlobalAttribute/OBSA_CD}OBSA_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubOBSA" type="{http://abi/sbs/GlobalAttribute/OSBSA_CD}OSBSA_CD" minOccurs="0"/&gt;
 *         &lt;element name="DeptObject" type="{http://abi/sbs/GlobalAttribute/DOBJ_CD}DOBJ_CD" minOccurs="0"/&gt;
 *         &lt;element name="DeptRevenue" type="{http://abi/sbs/GlobalAttribute/DRSRC_CD}DRSRC_CD" minOccurs="0"/&gt;
 *         &lt;element name="InternalFund" type="{http://abi/sbs/GlobalAttribute/IG_FUND_CD}IG_FUND_CD" minOccurs="0"/&gt;
 *         &lt;element name="InternalSubFund" type="{http://abi/sbs/GlobalAttribute/IG_SFUND_CD}IG_SFUND_CD" minOccurs="0"/&gt;
 *         &lt;element name="InternalDept" type="{http://abi/sbs/GlobalAttribute/IG_DEPT_CD}IG_DEPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="Reporting" type="{http://abi/sbs/GlobalAttribute/RPT_CD}RPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubReporting" type="{http://abi/sbs/GlobalAttribute/SRPT_CD}SRPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="Task" type="{http://abi/sbs/GlobalAttribute/TASK_CD}TASK_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubTask" type="{http://abi/sbs/GlobalAttribute/STASK_CD}STASK_CD" minOccurs="0"/&gt;
 *         &lt;element name="TaskOrder" type="{http://abi/sbs/GlobalAttribute/TASK_ORD_CD}TASK_ORD_CD" minOccurs="0"/&gt;
 *         &lt;element name="Program" type="{http://abi/sbs/GlobalAttribute/PROG_CD}PROG_CD" minOccurs="0"/&gt;
 *         &lt;element name="Phase" type="{http://abi/sbs/GlobalAttribute/PHASE_CD}PHASE_CD" minOccurs="0"/&gt;
 *         &lt;element name="ProgramPeriod" type="{http://abi/sbs/GlobalAttribute/PPC_CD}PPC_CD" minOccurs="0"/&gt;
 *         &lt;element name="AddressCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}AD_ID" minOccurs="0"/&gt;
 *         &lt;element name="VendorContactID" type="{http://abi/sbs/doc/financial/JVRequestResponse}CNTAC_NO" minOccurs="0"/&gt;
 *         &lt;element name="TaxpayerID" type="{http://abi/sbs/doc/financial/JVRequestResponse}TIN" minOccurs="0"/&gt;
 *         &lt;element name="TaxpayerIDType" type="{http://abi/sbs/CodedValueList/CVL_TIN_TYP}CVL_TIN_TYP" minOccurs="0"/&gt;
 *         &lt;element name="DebtID" type="{http://abi/sbs/doc/financial/JVRequestResponse}DEBT_ID" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizationDebtInstrument" type="{http://abi/sbs/CodedValueList/CVL_AUTHDI_IND}CVL_AUTHDI_IND" minOccurs="0"/&gt;
 *         &lt;element name="Attachment" type="{http://abi/sbs/ecm/Attachment}AttachmentRequestType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JVRequestActg" type="{http://abi/sbs/doc/financial/JVRequestResponse}JVRequestActgType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JVRequestLngrpType", propOrder = {
    "transactionCreationDate",
    "eventType",
    "postingPair",
    "referenceType",
    "referencedLineOpenAmount",
    "referencedTransactionCode",
    "referencedTransactionDepartment",
    "referencedTransactionID",
    "referencedTransactionVersion",
    "referencedVendorLine",
    "referencedCommodityLine",
    "referencedAccountingLine",
    "refAmendment",
    "vendorCustomer",
    "legalName",
    "aliasOrDBA",
    "addressLine1",
    "addressLine2",
    "city",
    "state",
    "zip",
    "country",
    "county",
    "vendorContactPhone",
    "vendorContactPhoneExtension",
    "fax",
    "faxExtension",
    "vendorContactEmail",
    "webAddress",
    "vendorContactName",
    "lineGroupDescription",
    "performanceUnits",
    "unitOfMeasure",
    "transactionLineGroupLineNumber",
    "transactionChildMaximumLineNumber",
    "lineGroup",
    "fund",
    "subFund",
    "department",
    "unit",
    "subUnit",
    "apprUnit",
    "location",
    "subLocation",
    "county1",
    "activity",
    "subActivity",
    "function",
    "subFunction",
    "object",
    "subObject",
    "revenue",
    "subRevenue",
    "bsa",
    "subBSA",
    "obsa",
    "subOBSA",
    "deptObject",
    "deptRevenue",
    "internalFund",
    "internalSubFund",
    "internalDept",
    "reporting",
    "subReporting",
    "task",
    "subTask",
    "taskOrder",
    "program",
    "phase",
    "programPeriod",
    "addressCode",
    "vendorContactID",
    "taxpayerID",
    "taxpayerIDType",
    "debtID",
    "authorizationDebtInstrument",
    "attachment",
    "jvRequestActg"
})
public class JVRequestLngrpType {

    @XmlElement(name = "TransactionCreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionCreationDate;
    @XmlElement(name = "EventType")
    protected String eventType;
    @XmlElement(name = "PostingPair")
    @XmlSchemaType(name = "string")
    protected CVLPSTPRID postingPair;
    @XmlElement(name = "ReferenceType")
    protected BigInteger referenceType;
    @XmlElement(name = "ReferencedLineOpenAmount")
    protected BigDecimal referencedLineOpenAmount;
    @XmlElement(name = "ReferencedTransactionCode")
    protected String referencedTransactionCode;
    @XmlElement(name = "ReferencedTransactionDepartment")
    protected String referencedTransactionDepartment;
    @XmlElement(name = "ReferencedTransactionID")
    protected String referencedTransactionID;
    @XmlElement(name = "ReferencedTransactionVersion")
    protected Long referencedTransactionVersion;
    @XmlElement(name = "ReferencedVendorLine")
    protected BigInteger referencedVendorLine;
    @XmlElement(name = "ReferencedCommodityLine")
    protected BigInteger referencedCommodityLine;
    @XmlElement(name = "ReferencedAccountingLine")
    protected BigInteger referencedAccountingLine;
    @XmlElement(name = "RefAmendment")
    protected Long refAmendment;
    @XmlElement(name = "VendorCustomer")
    protected String vendorCustomer;
    @XmlElement(name = "LegalName")
    protected String legalName;
    @XmlElement(name = "AliasOrDBA")
    protected String aliasOrDBA;
    @XmlElement(name = "AddressLine1")
    protected String addressLine1;
    @XmlElement(name = "AddressLine2")
    protected String addressLine2;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Zip")
    protected String zip;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "VendorContactPhone")
    protected String vendorContactPhone;
    @XmlElement(name = "VendorContactPhoneExtension")
    protected String vendorContactPhoneExtension;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "FaxExtension")
    protected String faxExtension;
    @XmlElement(name = "VendorContactEmail")
    protected String vendorContactEmail;
    @XmlElement(name = "WebAddress")
    protected String webAddress;
    @XmlElement(name = "VendorContactName")
    protected String vendorContactName;
    @XmlElement(name = "LineGroupDescription")
    protected String lineGroupDescription;
    @XmlElement(name = "PerformanceUnits")
    protected BigDecimal performanceUnits;
    @XmlElement(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlElement(name = "TransactionLineGroupLineNumber")
    protected BigInteger transactionLineGroupLineNumber;
    @XmlElement(name = "TransactionChildMaximumLineNumber")
    protected BigInteger transactionChildMaximumLineNumber;
    @XmlElement(name = "LineGroup")
    protected BigInteger lineGroup;
    @XmlElement(name = "Fund")
    protected String fund;
    @XmlElement(name = "SubFund")
    protected String subFund;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "Unit")
    protected String unit;
    @XmlElement(name = "SubUnit")
    protected String subUnit;
    @XmlElement(name = "ApprUnit")
    protected String apprUnit;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "SubLocation")
    protected String subLocation;
    @XmlElement(name = "County1")
    protected String county1;
    @XmlElement(name = "Activity")
    protected String activity;
    @XmlElement(name = "SubActivity")
    protected String subActivity;
    @XmlElement(name = "Function")
    protected String function;
    @XmlElement(name = "SubFunction")
    protected String subFunction;
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
    @XmlElement(name = "DeptObject")
    protected String deptObject;
    @XmlElement(name = "DeptRevenue")
    protected String deptRevenue;
    @XmlElement(name = "InternalFund")
    protected String internalFund;
    @XmlElement(name = "InternalSubFund")
    protected String internalSubFund;
    @XmlElement(name = "InternalDept")
    protected String internalDept;
    @XmlElement(name = "Reporting")
    protected String reporting;
    @XmlElement(name = "SubReporting")
    protected String subReporting;
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
    @XmlElement(name = "AddressCode")
    protected String addressCode;
    @XmlElement(name = "VendorContactID")
    protected String vendorContactID;
    @XmlElement(name = "TaxpayerID")
    protected String taxpayerID;
    @XmlElement(name = "TaxpayerIDType")
    @XmlSchemaType(name = "string")
    protected CVLTINTYP taxpayerIDType;
    @XmlElement(name = "DebtID")
    protected String debtID;
    @XmlElement(name = "AuthorizationDebtInstrument")
    @XmlSchemaType(name = "string")
    protected CVLAUTHDIIND authorizationDebtInstrument;
    @XmlElement(name = "Attachment")
    protected List<AttachmentRequestType> attachment;
    @XmlElement(name = "JVRequestActg")
    protected List<JVRequestActgType> jvRequestActg;

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
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the postingPair property.
     * 
     * @return
     *     possible object is
     *     {@link CVLPSTPRID }
     *     
     */
    public CVLPSTPRID getPostingPair() {
        return postingPair;
    }

    /**
     * Sets the value of the postingPair property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVLPSTPRID }
     *     
     */
    public void setPostingPair(CVLPSTPRID value) {
        this.postingPair = value;
    }

    /**
     * Gets the value of the referenceType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReferenceType() {
        return referenceType;
    }

    /**
     * Sets the value of the referenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReferenceType(BigInteger value) {
        this.referenceType = value;
    }

    /**
     * Gets the value of the referencedLineOpenAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReferencedLineOpenAmount() {
        return referencedLineOpenAmount;
    }

    /**
     * Sets the value of the referencedLineOpenAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReferencedLineOpenAmount(BigDecimal value) {
        this.referencedLineOpenAmount = value;
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
     * Gets the value of the referencedTransactionVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReferencedTransactionVersion() {
        return referencedTransactionVersion;
    }

    /**
     * Sets the value of the referencedTransactionVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReferencedTransactionVersion(Long value) {
        this.referencedTransactionVersion = value;
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
     * Gets the value of the refAmendment property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRefAmendment() {
        return refAmendment;
    }

    /**
     * Sets the value of the refAmendment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRefAmendment(Long value) {
        this.refAmendment = value;
    }

    /**
     * Gets the value of the vendorCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCustomer() {
        return vendorCustomer;
    }

    /**
     * Sets the value of the vendorCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCustomer(String value) {
        this.vendorCustomer = value;
    }

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the aliasOrDBA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasOrDBA() {
        return aliasOrDBA;
    }

    /**
     * Sets the value of the aliasOrDBA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasOrDBA(String value) {
        this.aliasOrDBA = value;
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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
     * Gets the value of the vendorContactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorContactPhone() {
        return vendorContactPhone;
    }

    /**
     * Sets the value of the vendorContactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorContactPhone(String value) {
        this.vendorContactPhone = value;
    }

    /**
     * Gets the value of the vendorContactPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorContactPhoneExtension() {
        return vendorContactPhoneExtension;
    }

    /**
     * Sets the value of the vendorContactPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorContactPhoneExtension(String value) {
        this.vendorContactPhoneExtension = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the faxExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxExtension() {
        return faxExtension;
    }

    /**
     * Sets the value of the faxExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxExtension(String value) {
        this.faxExtension = value;
    }

    /**
     * Gets the value of the vendorContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorContactEmail() {
        return vendorContactEmail;
    }

    /**
     * Sets the value of the vendorContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorContactEmail(String value) {
        this.vendorContactEmail = value;
    }

    /**
     * Gets the value of the webAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddress() {
        return webAddress;
    }

    /**
     * Sets the value of the webAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAddress(String value) {
        this.webAddress = value;
    }

    /**
     * Gets the value of the vendorContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorContactName() {
        return vendorContactName;
    }

    /**
     * Sets the value of the vendorContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorContactName(String value) {
        this.vendorContactName = value;
    }

    /**
     * Gets the value of the lineGroupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineGroupDescription() {
        return lineGroupDescription;
    }

    /**
     * Sets the value of the lineGroupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineGroupDescription(String value) {
        this.lineGroupDescription = value;
    }

    /**
     * Gets the value of the performanceUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerformanceUnits() {
        return performanceUnits;
    }

    /**
     * Sets the value of the performanceUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerformanceUnits(BigDecimal value) {
        this.performanceUnits = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the transactionLineGroupLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransactionLineGroupLineNumber() {
        return transactionLineGroupLineNumber;
    }

    /**
     * Sets the value of the transactionLineGroupLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransactionLineGroupLineNumber(BigInteger value) {
        this.transactionLineGroupLineNumber = value;
    }

    /**
     * Gets the value of the transactionChildMaximumLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransactionChildMaximumLineNumber() {
        return transactionChildMaximumLineNumber;
    }

    /**
     * Sets the value of the transactionChildMaximumLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransactionChildMaximumLineNumber(BigInteger value) {
        this.transactionChildMaximumLineNumber = value;
    }

    /**
     * Gets the value of the lineGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineGroup() {
        return lineGroup;
    }

    /**
     * Sets the value of the lineGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineGroup(BigInteger value) {
        this.lineGroup = value;
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
     * Gets the value of the county1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty1() {
        return county1;
    }

    /**
     * Sets the value of the county1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty1(String value) {
        this.county1 = value;
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
     * Gets the value of the addressCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCode() {
        return addressCode;
    }

    /**
     * Sets the value of the addressCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCode(String value) {
        this.addressCode = value;
    }

    /**
     * Gets the value of the vendorContactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorContactID() {
        return vendorContactID;
    }

    /**
     * Sets the value of the vendorContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorContactID(String value) {
        this.vendorContactID = value;
    }

    /**
     * Gets the value of the taxpayerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxpayerID() {
        return taxpayerID;
    }

    /**
     * Sets the value of the taxpayerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxpayerID(String value) {
        this.taxpayerID = value;
    }

    /**
     * Gets the value of the taxpayerIDType property.
     * 
     * @return
     *     possible object is
     *     {@link CVLTINTYP }
     *     
     */
    public CVLTINTYP getTaxpayerIDType() {
        return taxpayerIDType;
    }

    /**
     * Sets the value of the taxpayerIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVLTINTYP }
     *     
     */
    public void setTaxpayerIDType(CVLTINTYP value) {
        this.taxpayerIDType = value;
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

    /**
     * Gets the value of the jvRequestActg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jvRequestActg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJVRequestActg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JVRequestActgType }
     * 
     * 
     */
    public List<JVRequestActgType> getJVRequestActg() {
        if (jvRequestActg == null) {
            jvRequestActg = new ArrayList<JVRequestActgType>();
        }
        return this.jvRequestActg;
    }

}
