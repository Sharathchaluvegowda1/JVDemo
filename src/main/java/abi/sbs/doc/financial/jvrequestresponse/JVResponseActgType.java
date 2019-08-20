
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
import abi.sbs.codedvaluelist.cvl_doc_phase_cd.CVLDOCPHASECD;
import abi.sbs.ecm.attachment.AttachmentResponseType;


/**
 * <p>Java class for JVResponseActgType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JVResponseActgType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionCategory" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_CAT" minOccurs="0"/&gt;
 *         &lt;element name="TransactionType" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_TYP" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionDept" type="{http://abi/sbs/GlobalAttribute/DOC_DEPT_CD}DOC_DEPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionIdentifier" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_ID" minOccurs="0"/&gt;
 *         &lt;element name="TransactionVersionNumber" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_VERS_NO" minOccurs="0"/&gt;
 *         &lt;element name="TransactionAccountingNumber" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_ACTG_NO" minOccurs="0"/&gt;
 *         &lt;element name="AccountingLine" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_ACTG_LN_NO" minOccurs="0"/&gt;
 *         &lt;element name="TransactionActionCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_ACTN_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionSubActionCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_S_ACTN_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCreationDate" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_CREA_DT" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCreationUserID" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_CREA_USID" minOccurs="0"/&gt;
 *         &lt;element name="TransactionSubFunctionCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_S_FUNC_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionLastDate" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_LAST_DT" minOccurs="0"/&gt;
 *         &lt;element name="TransactionLastUserID" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_LAST_USID" minOccurs="0"/&gt;
 *         &lt;element name="TransactionPhaseCode" type="{http://abi/sbs/CodedValueList/CVL_DOC_PHASE_CD}CVL_DOC_PHASE_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionPreviousVersionNumber" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_PREV_VERS_NO" minOccurs="0"/&gt;
 *         &lt;element name="TransactionUnit" type="{http://abi/sbs/GlobalAttribute/DOC_UNIT_CD}DOC_UNIT_CD" minOccurs="0"/&gt;
 *         &lt;element name="ObjectAttachmentPrimaryGroupUniqueIdentifier" type="{http://abi/sbs/doc/financial/JVRequestResponse}OBJ_ATT_PG_UNID" minOccurs="0"/&gt;
 *         &lt;element name="ObjectAttachmentSecondaryGroupTotal" type="{http://abi/sbs/doc/financial/JVRequestResponse}OBJ_ATT_SG_TOT" minOccurs="0"/&gt;
 *         &lt;element name="ObjectAttachmentSecondaryUniqueIdentifier" type="{http://abi/sbs/doc/financial/JVRequestResponse}OBJ_ATT_SG_UNID" minOccurs="0"/&gt;
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
 *         &lt;element name="LegalName" type="{http://abi/sbs/doc/financial/JVRequestResponse}LGL_NM" minOccurs="0"/&gt;
 *         &lt;element name="CustomerActiveStatus" type="{http://abi/sbs/doc/financial/JVRequestResponse}CUST_ACT_STA" minOccurs="0"/&gt;
 *         &lt;element name="CustomerApprovalStatus" type="{http://abi/sbs/doc/financial/JVRequestResponse}CUST_APRV_STA" minOccurs="0"/&gt;
 *         &lt;element name="VendorActiveStatus" type="{http://abi/sbs/doc/financial/JVRequestResponse}VEND_ACT_STA" minOccurs="0"/&gt;
 *         &lt;element name="VendorApprovalStatus" type="{http://abi/sbs/doc/financial/JVRequestResponse}VEND_APRV_STA" minOccurs="0"/&gt;
 *         &lt;element name="DebitAmount" type="{http://abi/sbs/doc/financial/JVRequestResponse}DR_AM" minOccurs="0"/&gt;
 *         &lt;element name="Fund" type="{http://abi/sbs/GlobalAttribute/FUND_CD}FUND_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubFund" type="{http://abi/sbs/GlobalAttribute/SFUND_CD}SFUND_CD" minOccurs="0"/&gt;
 *         &lt;element name="FundClass" type="{http://abi/sbs/GlobalAttribute/FCLS_CD}FCLS_CD" minOccurs="0"/&gt;
 *         &lt;element name="FundCategory" type="{http://abi/sbs/GlobalAttribute/FCAT_CD}FCAT_CD" minOccurs="0"/&gt;
 *         &lt;element name="FundType" type="{http://abi/sbs/GlobalAttribute/FTYP_CD}FTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="FundGroup" type="{http://abi/sbs/GlobalAttribute/FGRP_CD}FGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="CAFRFundGroup" type="{http://abi/sbs/GlobalAttribute/CAFRFGRP_CD}CAFRFGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="CAFRFundType" type="{http://abi/sbs/GlobalAttribute/CAFRFTYP_CD}CAFRFTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="Object" type="{http://abi/sbs/GlobalAttribute/OBJ_CD}OBJ_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubObject" type="{http://abi/sbs/GlobalAttribute/SOBJ_CD}SOBJ_CD" minOccurs="0"/&gt;
 *         &lt;element name="ObjectClass" type="{http://abi/sbs/GlobalAttribute/OCLS_CD}OCLS_CD" minOccurs="0"/&gt;
 *         &lt;element name="ObjectCategory" type="{http://abi/sbs/GlobalAttribute/OCAT_CD}OCAT_CD" minOccurs="0"/&gt;
 *         &lt;element name="ObjectType" type="{http://abi/sbs/GlobalAttribute/OTYP_CD}OTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="ObjectGroup" type="{http://abi/sbs/GlobalAttribute/OGRP_CD}OGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="MajorCAFRExpenseType" type="{http://abi/sbs/GlobalAttribute/MJR_CETYP_CD}MJR_CETYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="MinorCAFRExpenseType" type="{http://abi/sbs/GlobalAttribute/MNR_CETYP_CD}MNR_CETYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="Revenue" type="{http://abi/sbs/GlobalAttribute/RSRC_CD}RSRC_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubRevenue" type="{http://abi/sbs/GlobalAttribute/SRSRC_CD}SRSRC_CD" minOccurs="0"/&gt;
 *         &lt;element name="RevenueClass" type="{http://abi/sbs/GlobalAttribute/RSCLS_CD}RSCLS_CD" minOccurs="0"/&gt;
 *         &lt;element name="RevenueCategory" type="{http://abi/sbs/GlobalAttribute/RSCAT_CD}RSCAT_CD" minOccurs="0"/&gt;
 *         &lt;element name="RevenueGroup" type="{http://abi/sbs/GlobalAttribute/RSGRP_CD}RSGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="RevenueType" type="{http://abi/sbs/GlobalAttribute/RSTYP_CD}RSTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="MajorCAFRRevenueType" type="{http://abi/sbs/GlobalAttribute/MJR_CRTYP_CD}MJR_CRTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="MinorCAFRRevenueType" type="{http://abi/sbs/GlobalAttribute/MNR_CRTYP_CD}MNR_CRTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="BSA" type="{http://abi/sbs/GlobalAttribute/BSA_CD}BSA_CD" minOccurs="0"/&gt;
 *         &lt;element name="CashAccount" type="{http://abi/sbs/doc/financial/JVRequestResponse}CASH_ACCT_FL" minOccurs="0"/&gt;
 *         &lt;element name="MemoAccount" type="{http://abi/sbs/doc/financial/JVRequestResponse}MMO_ACCT_FL" minOccurs="0"/&gt;
 *         &lt;element name="AccountType" type="{http://abi/sbs/doc/financial/JVRequestResponse}BSA_TYP_IND" minOccurs="0"/&gt;
 *         &lt;element name="SubBSA" type="{http://abi/sbs/GlobalAttribute/SBSA_CD}SBSA_CD" minOccurs="0"/&gt;
 *         &lt;element name="BSAClass" type="{http://abi/sbs/GlobalAttribute/BSCL_CD}BSCL_CD" minOccurs="0"/&gt;
 *         &lt;element name="BSACategory" type="{http://abi/sbs/GlobalAttribute/BSCT_CD}BSCT_CD" minOccurs="0"/&gt;
 *         &lt;element name="BSAGroup" type="{http://abi/sbs/GlobalAttribute/BSG_CD}BSG_CD" minOccurs="0"/&gt;
 *         &lt;element name="BSAType" type="{http://abi/sbs/GlobalAttribute/BST_CD}BST_CD" minOccurs="0"/&gt;
 *         &lt;element name="CAFRMajorBSAGroup" type="{http://abi/sbs/GlobalAttribute/CMJRBGRP_CD}CMJRBGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="CAFRMinorBSAGroup" type="{http://abi/sbs/GlobalAttribute/CMNRBGRP_CD}CMNRBGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="OBSA" type="{http://abi/sbs/GlobalAttribute/OBSA_CD}OBSA_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubOBSA" type="{http://abi/sbs/GlobalAttribute/OSBSA_CD}OSBSA_CD" minOccurs="0"/&gt;
 *         &lt;element name="OBSAClass" type="{http://abi/sbs/GlobalAttribute/OBSCL_CD}OBSCL_CD" minOccurs="0"/&gt;
 *         &lt;element name="OBSACategory" type="{http://abi/sbs/GlobalAttribute/OBSCT_CD}OBSCT_CD" minOccurs="0"/&gt;
 *         &lt;element name="OBSAGroup" type="{http://abi/sbs/GlobalAttribute/OBSG_CD}OBSG_CD" minOccurs="0"/&gt;
 *         &lt;element name="OBSAType" type="{http://abi/sbs/GlobalAttribute/OBST_CD}OBST_CD" minOccurs="0"/&gt;
 *         &lt;element name="CMJROBSAGroup" type="{http://abi/sbs/GlobalAttribute/OCMJRBGRP_CD}OCMJRBGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="CMNROBSAGroup" type="{http://abi/sbs/GlobalAttribute/OCMNRBGRP_CD}OCMNRBGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="OBSAType1" type="{http://abi/sbs/doc/financial/JVRequestResponse}OBSA_TYP_IND" minOccurs="0"/&gt;
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
 *         &lt;element name="ApprClass" type="{http://abi/sbs/GlobalAttribute/APCLS_CD}APCLS_CD" minOccurs="0"/&gt;
 *         &lt;element name="ApprCategory" type="{http://abi/sbs/GlobalAttribute/APCAT_CD}APCAT_CD" minOccurs="0"/&gt;
 *         &lt;element name="ApprType" type="{http://abi/sbs/GlobalAttribute/APTYP_CD}APTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="ApprGroup" type="{http://abi/sbs/GlobalAttribute/APGRP_CD}APGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://abi/sbs/GlobalAttribute/LOC_CD}LOC_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubLocation" type="{http://abi/sbs/GlobalAttribute/SLOC_CD}SLOC_CD" minOccurs="0"/&gt;
 *         &lt;element name="LocationClass" type="{http://abi/sbs/GlobalAttribute/LCLS_CD}LCLS_CD" minOccurs="0"/&gt;
 *         &lt;element name="LocationCategory" type="{http://abi/sbs/GlobalAttribute/LCAT_CD}LCAT_CD" minOccurs="0"/&gt;
 *         &lt;element name="LocationType" type="{http://abi/sbs/GlobalAttribute/LTYP_CD}LTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="County" type="{http://abi/sbs/GlobalAttribute/CNTY_CD}CNTY_CD" minOccurs="0"/&gt;
 *         &lt;element name="Activity" type="{http://abi/sbs/GlobalAttribute/ACTV_CD}ACTV_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubActivity" type="{http://abi/sbs/GlobalAttribute/SACTV_CD}SACTV_CD" minOccurs="0"/&gt;
 *         &lt;element name="ActivityClass" type="{http://abi/sbs/GlobalAttribute/ACLS_CD}ACLS_CD" minOccurs="0"/&gt;
 *         &lt;element name="ActivityCategory" type="{http://abi/sbs/GlobalAttribute/ACAT_CD}ACAT_CD" minOccurs="0"/&gt;
 *         &lt;element name="ActivityType" type="{http://abi/sbs/GlobalAttribute/ATYP_CD}ATYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="ActivityGroup" type="{http://abi/sbs/GlobalAttribute/AGRP_CD}AGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="CAFRActivityUnit" type="{http://abi/sbs/GlobalAttribute/CAUNIT_CD}CAUNIT_CD" minOccurs="0"/&gt;
 *         &lt;element name="MajorCAFRActivityType" type="{http://abi/sbs/GlobalAttribute/MJR_CATYP_CD}MJR_CATYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="MinorCAFRActivityType" type="{http://abi/sbs/GlobalAttribute/MNR_CATYP_CD}MNR_CATYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="Function" type="{http://abi/sbs/GlobalAttribute/FUNC_CD}FUNC_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubFunction" type="{http://abi/sbs/GlobalAttribute/SFUNC_CD}SFUNC_CD" minOccurs="0"/&gt;
 *         &lt;element name="FunctionClass" type="{http://abi/sbs/GlobalAttribute/FNCLS_CD}FNCLS_CD" minOccurs="0"/&gt;
 *         &lt;element name="FunctionCategory" type="{http://abi/sbs/GlobalAttribute/FNCAT_CD}FNCAT_CD" minOccurs="0"/&gt;
 *         &lt;element name="FunctionType" type="{http://abi/sbs/GlobalAttribute/FNTYP_CD}FNTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="FunctionGroup" type="{http://abi/sbs/GlobalAttribute/FNGRP_CD}FNGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="Reporting" type="{http://abi/sbs/GlobalAttribute/RPT_CD}RPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubReporting" type="{http://abi/sbs/GlobalAttribute/SRPT_CD}SRPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="ReportingClass" type="{http://abi/sbs/GlobalAttribute/RCLS_CD}RCLS_CD" minOccurs="0"/&gt;
 *         &lt;element name="ReportingCategory" type="{http://abi/sbs/GlobalAttribute/RCAT_CD}RCAT_CD" minOccurs="0"/&gt;
 *         &lt;element name="ReportingType" type="{http://abi/sbs/GlobalAttribute/RTYP_CD}RTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="ReportingGroup" type="{http://abi/sbs/GlobalAttribute/RGRP_CD}RGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="DeptObject" type="{http://abi/sbs/GlobalAttribute/DOBJ_CD}DOBJ_CD" minOccurs="0"/&gt;
 *         &lt;element name="DeptObjectClass" type="{http://abi/sbs/GlobalAttribute/DOCLS_CD}DOCLS_CD" minOccurs="0"/&gt;
 *         &lt;element name="DeptObjectCategory" type="{http://abi/sbs/GlobalAttribute/DOCAT_CD}DOCAT_CD" minOccurs="0"/&gt;
 *         &lt;element name="DeptObjectType" type="{http://abi/sbs/GlobalAttribute/DOTYP_CD}DOTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="DeptObjectGroup" type="{http://abi/sbs/GlobalAttribute/DOGRP_CD}DOGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="DeptRevenue" type="{http://abi/sbs/GlobalAttribute/DRSRC_CD}DRSRC_CD" minOccurs="0"/&gt;
 *         &lt;element name="DeptRevenueClass" type="{http://abi/sbs/GlobalAttribute/DRSCLS_CD}DRSCLS_CD" minOccurs="0"/&gt;
 *         &lt;element name="DeptRevenueCategory" type="{http://abi/sbs/GlobalAttribute/DRSCAT_CD}DRSCAT_CD" minOccurs="0"/&gt;
 *         &lt;element name="DeptRevenueType" type="{http://abi/sbs/GlobalAttribute/DRSTYP_CD}DRSTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="DeptRevenueGroup" type="{http://abi/sbs/GlobalAttribute/DRSGRP_CD}DRSGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="Task" type="{http://abi/sbs/GlobalAttribute/TASK_CD}TASK_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubTask" type="{http://abi/sbs/GlobalAttribute/STASK_CD}STASK_CD" minOccurs="0"/&gt;
 *         &lt;element name="TaskOrder" type="{http://abi/sbs/GlobalAttribute/TASK_ORD_CD}TASK_ORD_CD" minOccurs="0"/&gt;
 *         &lt;element name="MajorProgram" type="{http://abi/sbs/GlobalAttribute/MJR_PROG_CD}MJR_PROG_CD" minOccurs="0"/&gt;
 *         &lt;element name="MajorProgramClass" type="{http://abi/sbs/GlobalAttribute/MJR_PCLS_CD}MJR_PCLS_CD" minOccurs="0"/&gt;
 *         &lt;element name="MajorProgramCategory" type="{http://abi/sbs/GlobalAttribute/MJR_PCAT_CD}MJR_PCAT_CD" minOccurs="0"/&gt;
 *         &lt;element name="MajorProgramGroup" type="{http://abi/sbs/GlobalAttribute/MJR_PGRP_CD}MJR_PGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="MajorProgramType" type="{http://abi/sbs/GlobalAttribute/MJR_PTYP_CD}MJR_PTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="Program" type="{http://abi/sbs/GlobalAttribute/PROG_CD}PROG_CD" minOccurs="0"/&gt;
 *         &lt;element name="Phase" type="{http://abi/sbs/GlobalAttribute/PHASE_CD}PHASE_CD" minOccurs="0"/&gt;
 *         &lt;element name="ProgramClass" type="{http://abi/sbs/GlobalAttribute/PCLS_CD}PCLS_CD" minOccurs="0"/&gt;
 *         &lt;element name="ProgramCategory" type="{http://abi/sbs/GlobalAttribute/PCAT_CD}PCAT_CD" minOccurs="0"/&gt;
 *         &lt;element name="ProgramType" type="{http://abi/sbs/GlobalAttribute/PTYP_CD}PTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="ProgramGroup" type="{http://abi/sbs/GlobalAttribute/PGRP_CD}PGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="ProgramPeriod" type="{http://abi/sbs/GlobalAttribute/PPC_CD}PPC_CD" minOccurs="0"/&gt;
 *         &lt;element name="FundingProfile" type="{http://abi/sbs/GlobalAttribute/FPRFL_CD}FPRFL_CD" minOccurs="0"/&gt;
 *         &lt;element name="PerformanceUnitOfMeasure" type="{http://abi/sbs/doc/financial/JVRequestResponse}PERF_UNIT_MEAS_CD" minOccurs="0"/&gt;
 *         &lt;element name="LineDescription" type="{http://abi/sbs/doc/financial/JVRequestResponse}ACTG_LN_DSCR" minOccurs="0"/&gt;
 *         &lt;element name="EventType" type="{http://abi/sbs/doc/financial/JVRequestResponse}EVNT_TYP_ID" minOccurs="0"/&gt;
 *         &lt;element name="PostingPair" type="{http://abi/sbs/doc/financial/JVRequestResponse}PSTNG_PR_TYP" minOccurs="0"/&gt;
 *         &lt;element name="PostingCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}PSCD_ID" minOccurs="0"/&gt;
 *         &lt;element name="InternalFund" type="{http://abi/sbs/GlobalAttribute/IG_FUND_CD}IG_FUND_CD" minOccurs="0"/&gt;
 *         &lt;element name="InternalSubFund" type="{http://abi/sbs/GlobalAttribute/IG_SFUND_CD}IG_SFUND_CD" minOccurs="0"/&gt;
 *         &lt;element name="InternalDept" type="{http://abi/sbs/GlobalAttribute/IG_DEPT_CD}IG_DEPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="LineGroup" type="{http://abi/sbs/doc/financial/JVRequestResponse}LNGRP_ID" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceType" type="{http://abi/sbs/doc/financial/JVRequestResponse}RF_TYP" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceType1" type="{http://abi/sbs/doc/financial/JVRequestResponse}RF_TYP_DV" minOccurs="0"/&gt;
 *         &lt;element name="PostingCodeName" type="{http://abi/sbs/doc/financial/JVRequestResponse}PSTNG_CD_NM" minOccurs="0"/&gt;
 *         &lt;element name="CashAccount1" type="{http://abi/sbs/doc/financial/JVRequestResponse}CASH_ACCT_RSTRC_FL" minOccurs="0"/&gt;
 *         &lt;element name="MemoAccount1" type="{http://abi/sbs/doc/financial/JVRequestResponse}MMO_ACCT_RSTRC_FL" minOccurs="0"/&gt;
 *         &lt;element name="AccountType1" type="{http://abi/sbs/doc/financial/JVRequestResponse}ACCT_TYP_RSTRC_IND" minOccurs="0"/&gt;
 *         &lt;element name="PostingPairName" type="{http://abi/sbs/doc/financial/JVRequestResponse}PST_PR_NM" minOccurs="0"/&gt;
 *         &lt;element name="LineGroupLineNumber" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_LNGRP_LN_NO" minOccurs="0"/&gt;
 *         &lt;element name="OffsetFlag" type="{http://abi/sbs/doc/financial/JVRequestResponse}OFST_FL" minOccurs="0"/&gt;
 *         &lt;element name="SubUnit" type="{http://abi/sbs/GlobalAttribute/SUNIT_CD}SUNIT_CD" minOccurs="0"/&gt;
 *         &lt;element name="Bank" type="{http://abi/sbs/doc/financial/JVRequestResponse}BANK_ACCT_CD" minOccurs="0"/&gt;
 *         &lt;element name="FundingPriority" type="{http://abi/sbs/GlobalAttribute/FPRTY_CD}FPRTY_CD" minOccurs="0"/&gt;
 *         &lt;element name="FundingLine" type="{http://abi/sbs/GlobalAttribute/FLINE_CD}FLINE_CD" minOccurs="0"/&gt;
 *         &lt;element name="AccountingClassification" type="{http://abi/sbs/doc/financial/JVRequestResponse}ACCT_CLASS_IND" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://abi/sbs/doc/financial/JVRequestResponse}PY_UNIT" minOccurs="0"/&gt;
 *         &lt;element name="HumanResourceMeasure" type="{http://abi/sbs/doc/financial/JVRequestResponse}HR_MSR_CD" minOccurs="0"/&gt;
 *         &lt;element name="TaxpayerIDNumber" type="{http://abi/sbs/doc/financial/JVRequestResponse}TIN" minOccurs="0"/&gt;
 *         &lt;element name="TaxpayerIDType" type="{http://abi/sbs/doc/financial/JVRequestResponse}TIN_TYP" minOccurs="0"/&gt;
 *         &lt;element name="BatchLoaded" type="{http://abi/sbs/doc/financial/JVRequestResponse}BAT_LOAD_FL" minOccurs="0"/&gt;
 *         &lt;element name="DebtID" type="{http://abi/sbs/doc/financial/JVRequestResponse}DEBT_ID" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizationDebtInstrument" type="{http://abi/sbs/CodedValueList/CVL_AUTHDI_IND}CVL_AUTHDI_IND" minOccurs="0"/&gt;
 *         &lt;element name="ExtensionStorageUniqueID" type="{http://abi/sbs/doc/financial/JVRequestResponse}EXT_STOR_UNID" minOccurs="0"/&gt;
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
@XmlType(name = "JVResponseActgType", propOrder = {
    "transactionCategory",
    "transactionType",
    "transactionCode",
    "transactionDept",
    "transactionIdentifier",
    "transactionVersionNumber",
    "transactionAccountingNumber",
    "accountingLine",
    "transactionActionCode",
    "transactionSubActionCode",
    "transactionCreationDate",
    "transactionCreationUserID",
    "transactionSubFunctionCode",
    "transactionLastDate",
    "transactionLastUserID",
    "transactionPhaseCode",
    "transactionPreviousVersionNumber",
    "transactionUnit",
    "objectAttachmentPrimaryGroupUniqueIdentifier",
    "objectAttachmentSecondaryGroupTotal",
    "objectAttachmentSecondaryUniqueIdentifier",
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
    "legalName",
    "customerActiveStatus",
    "customerApprovalStatus",
    "vendorActiveStatus",
    "vendorApprovalStatus",
    "debitAmount",
    "fund",
    "subFund",
    "fundClass",
    "fundCategory",
    "fundType",
    "fundGroup",
    "cafrFundGroup",
    "cafrFundType",
    "object",
    "subObject",
    "objectClass",
    "objectCategory",
    "objectType",
    "objectGroup",
    "majorCAFRExpenseType",
    "minorCAFRExpenseType",
    "revenue",
    "subRevenue",
    "revenueClass",
    "revenueCategory",
    "revenueGroup",
    "revenueType",
    "majorCAFRRevenueType",
    "minorCAFRRevenueType",
    "bsa",
    "cashAccount",
    "memoAccount",
    "accountType",
    "subBSA",
    "bsaClass",
    "bsaCategory",
    "bsaGroup",
    "bsaType",
    "cafrMajorBSAGroup",
    "cafrMinorBSAGroup",
    "obsa",
    "subOBSA",
    "obsaClass",
    "obsaCategory",
    "obsaGroup",
    "obsaType",
    "cmjrobsaGroup",
    "cmnrobsaGroup",
    "obsaType1",
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
    "apprClass",
    "apprCategory",
    "apprType",
    "apprGroup",
    "location",
    "subLocation",
    "locationClass",
    "locationCategory",
    "locationType",
    "county",
    "activity",
    "subActivity",
    "activityClass",
    "activityCategory",
    "activityType",
    "activityGroup",
    "cafrActivityUnit",
    "majorCAFRActivityType",
    "minorCAFRActivityType",
    "function",
    "subFunction",
    "functionClass",
    "functionCategory",
    "functionType",
    "functionGroup",
    "reporting",
    "subReporting",
    "reportingClass",
    "reportingCategory",
    "reportingType",
    "reportingGroup",
    "deptObject",
    "deptObjectClass",
    "deptObjectCategory",
    "deptObjectType",
    "deptObjectGroup",
    "deptRevenue",
    "deptRevenueClass",
    "deptRevenueCategory",
    "deptRevenueType",
    "deptRevenueGroup",
    "task",
    "subTask",
    "taskOrder",
    "majorProgram",
    "majorProgramClass",
    "majorProgramCategory",
    "majorProgramGroup",
    "majorProgramType",
    "program",
    "phase",
    "programClass",
    "programCategory",
    "programType",
    "programGroup",
    "programPeriod",
    "fundingProfile",
    "performanceUnitOfMeasure",
    "lineDescription",
    "eventType",
    "postingPair",
    "postingCode",
    "internalFund",
    "internalSubFund",
    "internalDept",
    "lineGroup",
    "referenceType",
    "referenceType1",
    "postingCodeName",
    "cashAccount1",
    "memoAccount1",
    "accountType1",
    "postingPairName",
    "lineGroupLineNumber",
    "offsetFlag",
    "subUnit",
    "bank",
    "fundingPriority",
    "fundingLine",
    "accountingClassification",
    "quantity",
    "humanResourceMeasure",
    "taxpayerIDNumber",
    "taxpayerIDType",
    "batchLoaded",
    "debtID",
    "authorizationDebtInstrument",
    "extensionStorageUniqueID",
    "attachment"
})
public class JVResponseActgType {

    @XmlElement(name = "TransactionCategory")
    protected String transactionCategory;
    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlElement(name = "TransactionCode")
    protected String transactionCode;
    @XmlElement(name = "TransactionDept")
    protected String transactionDept;
    @XmlElement(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlElement(name = "TransactionVersionNumber")
    protected BigInteger transactionVersionNumber;
    @XmlElement(name = "TransactionAccountingNumber")
    protected Long transactionAccountingNumber;
    @XmlElement(name = "AccountingLine")
    protected BigInteger accountingLine;
    @XmlElement(name = "TransactionActionCode")
    protected BigInteger transactionActionCode;
    @XmlElement(name = "TransactionSubActionCode")
    protected BigInteger transactionSubActionCode;
    @XmlElement(name = "TransactionCreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionCreationDate;
    @XmlElement(name = "TransactionCreationUserID")
    protected String transactionCreationUserID;
    @XmlElement(name = "TransactionSubFunctionCode")
    protected BigInteger transactionSubFunctionCode;
    @XmlElement(name = "TransactionLastDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionLastDate;
    @XmlElement(name = "TransactionLastUserID")
    protected String transactionLastUserID;
    @XmlElement(name = "TransactionPhaseCode")
    @XmlSchemaType(name = "string")
    protected CVLDOCPHASECD transactionPhaseCode;
    @XmlElement(name = "TransactionPreviousVersionNumber")
    protected BigInteger transactionPreviousVersionNumber;
    @XmlElement(name = "TransactionUnit")
    protected String transactionUnit;
    @XmlElement(name = "ObjectAttachmentPrimaryGroupUniqueIdentifier")
    protected String objectAttachmentPrimaryGroupUniqueIdentifier;
    @XmlElement(name = "ObjectAttachmentSecondaryGroupTotal")
    protected BigInteger objectAttachmentSecondaryGroupTotal;
    @XmlElement(name = "ObjectAttachmentSecondaryUniqueIdentifier")
    protected Long objectAttachmentSecondaryUniqueIdentifier;
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
    @XmlElement(name = "LegalName")
    protected String legalName;
    @XmlElement(name = "CustomerActiveStatus")
    protected BigInteger customerActiveStatus;
    @XmlElement(name = "CustomerApprovalStatus")
    protected BigInteger customerApprovalStatus;
    @XmlElement(name = "VendorActiveStatus")
    protected BigInteger vendorActiveStatus;
    @XmlElement(name = "VendorApprovalStatus")
    protected BigInteger vendorApprovalStatus;
    @XmlElement(name = "DebitAmount")
    protected BigDecimal debitAmount;
    @XmlElement(name = "Fund")
    protected String fund;
    @XmlElement(name = "SubFund")
    protected String subFund;
    @XmlElement(name = "FundClass")
    protected String fundClass;
    @XmlElement(name = "FundCategory")
    protected String fundCategory;
    @XmlElement(name = "FundType")
    protected String fundType;
    @XmlElement(name = "FundGroup")
    protected String fundGroup;
    @XmlElement(name = "CAFRFundGroup")
    protected String cafrFundGroup;
    @XmlElement(name = "CAFRFundType")
    protected String cafrFundType;
    @XmlElement(name = "Object")
    protected String object;
    @XmlElement(name = "SubObject")
    protected String subObject;
    @XmlElement(name = "ObjectClass")
    protected String objectClass;
    @XmlElement(name = "ObjectCategory")
    protected String objectCategory;
    @XmlElement(name = "ObjectType")
    protected String objectType;
    @XmlElement(name = "ObjectGroup")
    protected String objectGroup;
    @XmlElement(name = "MajorCAFRExpenseType")
    protected String majorCAFRExpenseType;
    @XmlElement(name = "MinorCAFRExpenseType")
    protected String minorCAFRExpenseType;
    @XmlElement(name = "Revenue")
    protected String revenue;
    @XmlElement(name = "SubRevenue")
    protected String subRevenue;
    @XmlElement(name = "RevenueClass")
    protected String revenueClass;
    @XmlElement(name = "RevenueCategory")
    protected String revenueCategory;
    @XmlElement(name = "RevenueGroup")
    protected String revenueGroup;
    @XmlElement(name = "RevenueType")
    protected String revenueType;
    @XmlElement(name = "MajorCAFRRevenueType")
    protected String majorCAFRRevenueType;
    @XmlElement(name = "MinorCAFRRevenueType")
    protected String minorCAFRRevenueType;
    @XmlElement(name = "BSA")
    protected String bsa;
    @XmlElement(name = "CashAccount")
    protected Boolean cashAccount;
    @XmlElement(name = "MemoAccount")
    protected Boolean memoAccount;
    @XmlElement(name = "AccountType")
    protected BigInteger accountType;
    @XmlElement(name = "SubBSA")
    protected String subBSA;
    @XmlElement(name = "BSAClass")
    protected String bsaClass;
    @XmlElement(name = "BSACategory")
    protected String bsaCategory;
    @XmlElement(name = "BSAGroup")
    protected String bsaGroup;
    @XmlElement(name = "BSAType")
    protected String bsaType;
    @XmlElement(name = "CAFRMajorBSAGroup")
    protected String cafrMajorBSAGroup;
    @XmlElement(name = "CAFRMinorBSAGroup")
    protected String cafrMinorBSAGroup;
    @XmlElement(name = "OBSA")
    protected String obsa;
    @XmlElement(name = "SubOBSA")
    protected String subOBSA;
    @XmlElement(name = "OBSAClass")
    protected String obsaClass;
    @XmlElement(name = "OBSACategory")
    protected String obsaCategory;
    @XmlElement(name = "OBSAGroup")
    protected String obsaGroup;
    @XmlElement(name = "OBSAType")
    protected String obsaType;
    @XmlElement(name = "CMJROBSAGroup")
    protected String cmjrobsaGroup;
    @XmlElement(name = "CMNROBSAGroup")
    protected String cmnrobsaGroup;
    @XmlElement(name = "OBSAType1")
    protected BigInteger obsaType1;
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
    @XmlElement(name = "ApprClass")
    protected String apprClass;
    @XmlElement(name = "ApprCategory")
    protected String apprCategory;
    @XmlElement(name = "ApprType")
    protected String apprType;
    @XmlElement(name = "ApprGroup")
    protected String apprGroup;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "SubLocation")
    protected String subLocation;
    @XmlElement(name = "LocationClass")
    protected String locationClass;
    @XmlElement(name = "LocationCategory")
    protected String locationCategory;
    @XmlElement(name = "LocationType")
    protected String locationType;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "Activity")
    protected String activity;
    @XmlElement(name = "SubActivity")
    protected String subActivity;
    @XmlElement(name = "ActivityClass")
    protected String activityClass;
    @XmlElement(name = "ActivityCategory")
    protected String activityCategory;
    @XmlElement(name = "ActivityType")
    protected String activityType;
    @XmlElement(name = "ActivityGroup")
    protected String activityGroup;
    @XmlElement(name = "CAFRActivityUnit")
    protected String cafrActivityUnit;
    @XmlElement(name = "MajorCAFRActivityType")
    protected String majorCAFRActivityType;
    @XmlElement(name = "MinorCAFRActivityType")
    protected String minorCAFRActivityType;
    @XmlElement(name = "Function")
    protected String function;
    @XmlElement(name = "SubFunction")
    protected String subFunction;
    @XmlElement(name = "FunctionClass")
    protected String functionClass;
    @XmlElement(name = "FunctionCategory")
    protected String functionCategory;
    @XmlElement(name = "FunctionType")
    protected String functionType;
    @XmlElement(name = "FunctionGroup")
    protected String functionGroup;
    @XmlElement(name = "Reporting")
    protected String reporting;
    @XmlElement(name = "SubReporting")
    protected String subReporting;
    @XmlElement(name = "ReportingClass")
    protected String reportingClass;
    @XmlElement(name = "ReportingCategory")
    protected String reportingCategory;
    @XmlElement(name = "ReportingType")
    protected String reportingType;
    @XmlElement(name = "ReportingGroup")
    protected String reportingGroup;
    @XmlElement(name = "DeptObject")
    protected String deptObject;
    @XmlElement(name = "DeptObjectClass")
    protected String deptObjectClass;
    @XmlElement(name = "DeptObjectCategory")
    protected String deptObjectCategory;
    @XmlElement(name = "DeptObjectType")
    protected String deptObjectType;
    @XmlElement(name = "DeptObjectGroup")
    protected String deptObjectGroup;
    @XmlElement(name = "DeptRevenue")
    protected String deptRevenue;
    @XmlElement(name = "DeptRevenueClass")
    protected String deptRevenueClass;
    @XmlElement(name = "DeptRevenueCategory")
    protected String deptRevenueCategory;
    @XmlElement(name = "DeptRevenueType")
    protected String deptRevenueType;
    @XmlElement(name = "DeptRevenueGroup")
    protected String deptRevenueGroup;
    @XmlElement(name = "Task")
    protected String task;
    @XmlElement(name = "SubTask")
    protected String subTask;
    @XmlElement(name = "TaskOrder")
    protected String taskOrder;
    @XmlElement(name = "MajorProgram")
    protected String majorProgram;
    @XmlElement(name = "MajorProgramClass")
    protected String majorProgramClass;
    @XmlElement(name = "MajorProgramCategory")
    protected String majorProgramCategory;
    @XmlElement(name = "MajorProgramGroup")
    protected String majorProgramGroup;
    @XmlElement(name = "MajorProgramType")
    protected String majorProgramType;
    @XmlElement(name = "Program")
    protected String program;
    @XmlElement(name = "Phase")
    protected String phase;
    @XmlElement(name = "ProgramClass")
    protected String programClass;
    @XmlElement(name = "ProgramCategory")
    protected String programCategory;
    @XmlElement(name = "ProgramType")
    protected String programType;
    @XmlElement(name = "ProgramGroup")
    protected String programGroup;
    @XmlElement(name = "ProgramPeriod")
    protected String programPeriod;
    @XmlElement(name = "FundingProfile")
    protected String fundingProfile;
    @XmlElement(name = "PerformanceUnitOfMeasure")
    protected String performanceUnitOfMeasure;
    @XmlElement(name = "LineDescription")
    protected String lineDescription;
    @XmlElement(name = "EventType")
    protected String eventType;
    @XmlElement(name = "PostingPair")
    protected String postingPair;
    @XmlElement(name = "PostingCode")
    protected String postingCode;
    @XmlElement(name = "InternalFund")
    protected String internalFund;
    @XmlElement(name = "InternalSubFund")
    protected String internalSubFund;
    @XmlElement(name = "InternalDept")
    protected String internalDept;
    @XmlElement(name = "LineGroup")
    protected BigInteger lineGroup;
    @XmlElement(name = "ReferenceType")
    protected BigInteger referenceType;
    @XmlElement(name = "ReferenceType1")
    protected String referenceType1;
    @XmlElement(name = "PostingCodeName")
    protected String postingCodeName;
    @XmlElement(name = "CashAccount1")
    protected Boolean cashAccount1;
    @XmlElement(name = "MemoAccount1")
    protected Boolean memoAccount1;
    @XmlElement(name = "AccountType1")
    protected BigInteger accountType1;
    @XmlElement(name = "PostingPairName")
    protected String postingPairName;
    @XmlElement(name = "LineGroupLineNumber")
    protected BigInteger lineGroupLineNumber;
    @XmlElement(name = "OffsetFlag")
    protected Boolean offsetFlag;
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
    @XmlElement(name = "TaxpayerIDNumber")
    protected String taxpayerIDNumber;
    @XmlElement(name = "TaxpayerIDType")
    protected String taxpayerIDType;
    @XmlElement(name = "BatchLoaded")
    protected Boolean batchLoaded;
    @XmlElement(name = "DebtID")
    protected String debtID;
    @XmlElement(name = "AuthorizationDebtInstrument")
    @XmlSchemaType(name = "string")
    protected CVLAUTHDIIND authorizationDebtInstrument;
    @XmlElement(name = "ExtensionStorageUniqueID")
    protected Long extensionStorageUniqueID;
    @XmlElement(name = "Attachment")
    protected List<AttachmentResponseType> attachment;

    /**
     * Gets the value of the transactionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCategory() {
        return transactionCategory;
    }

    /**
     * Sets the value of the transactionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCategory(String value) {
        this.transactionCategory = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
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
     * Gets the value of the transactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets the value of the transactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * Gets the value of the transactionVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransactionVersionNumber() {
        return transactionVersionNumber;
    }

    /**
     * Sets the value of the transactionVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransactionVersionNumber(BigInteger value) {
        this.transactionVersionNumber = value;
    }

    /**
     * Gets the value of the transactionAccountingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransactionAccountingNumber() {
        return transactionAccountingNumber;
    }

    /**
     * Sets the value of the transactionAccountingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransactionAccountingNumber(Long value) {
        this.transactionAccountingNumber = value;
    }

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
     * Gets the value of the transactionActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransactionActionCode() {
        return transactionActionCode;
    }

    /**
     * Sets the value of the transactionActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransactionActionCode(BigInteger value) {
        this.transactionActionCode = value;
    }

    /**
     * Gets the value of the transactionSubActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransactionSubActionCode() {
        return transactionSubActionCode;
    }

    /**
     * Sets the value of the transactionSubActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransactionSubActionCode(BigInteger value) {
        this.transactionSubActionCode = value;
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
     * Gets the value of the transactionCreationUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCreationUserID() {
        return transactionCreationUserID;
    }

    /**
     * Sets the value of the transactionCreationUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCreationUserID(String value) {
        this.transactionCreationUserID = value;
    }

    /**
     * Gets the value of the transactionSubFunctionCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransactionSubFunctionCode() {
        return transactionSubFunctionCode;
    }

    /**
     * Sets the value of the transactionSubFunctionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransactionSubFunctionCode(BigInteger value) {
        this.transactionSubFunctionCode = value;
    }

    /**
     * Gets the value of the transactionLastDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionLastDate() {
        return transactionLastDate;
    }

    /**
     * Sets the value of the transactionLastDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionLastDate(XMLGregorianCalendar value) {
        this.transactionLastDate = value;
    }

    /**
     * Gets the value of the transactionLastUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionLastUserID() {
        return transactionLastUserID;
    }

    /**
     * Sets the value of the transactionLastUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionLastUserID(String value) {
        this.transactionLastUserID = value;
    }

    /**
     * Gets the value of the transactionPhaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link CVLDOCPHASECD }
     *     
     */
    public CVLDOCPHASECD getTransactionPhaseCode() {
        return transactionPhaseCode;
    }

    /**
     * Sets the value of the transactionPhaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVLDOCPHASECD }
     *     
     */
    public void setTransactionPhaseCode(CVLDOCPHASECD value) {
        this.transactionPhaseCode = value;
    }

    /**
     * Gets the value of the transactionPreviousVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransactionPreviousVersionNumber() {
        return transactionPreviousVersionNumber;
    }

    /**
     * Sets the value of the transactionPreviousVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransactionPreviousVersionNumber(BigInteger value) {
        this.transactionPreviousVersionNumber = value;
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
     * Gets the value of the objectAttachmentSecondaryUniqueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getObjectAttachmentSecondaryUniqueIdentifier() {
        return objectAttachmentSecondaryUniqueIdentifier;
    }

    /**
     * Sets the value of the objectAttachmentSecondaryUniqueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setObjectAttachmentSecondaryUniqueIdentifier(Long value) {
        this.objectAttachmentSecondaryUniqueIdentifier = value;
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
     * Gets the value of the customerActiveStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerActiveStatus() {
        return customerActiveStatus;
    }

    /**
     * Sets the value of the customerActiveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerActiveStatus(BigInteger value) {
        this.customerActiveStatus = value;
    }

    /**
     * Gets the value of the customerApprovalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerApprovalStatus() {
        return customerApprovalStatus;
    }

    /**
     * Sets the value of the customerApprovalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerApprovalStatus(BigInteger value) {
        this.customerApprovalStatus = value;
    }

    /**
     * Gets the value of the vendorActiveStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVendorActiveStatus() {
        return vendorActiveStatus;
    }

    /**
     * Sets the value of the vendorActiveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVendorActiveStatus(BigInteger value) {
        this.vendorActiveStatus = value;
    }

    /**
     * Gets the value of the vendorApprovalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVendorApprovalStatus() {
        return vendorApprovalStatus;
    }

    /**
     * Sets the value of the vendorApprovalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVendorApprovalStatus(BigInteger value) {
        this.vendorApprovalStatus = value;
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
     * Gets the value of the fundClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundClass() {
        return fundClass;
    }

    /**
     * Sets the value of the fundClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundClass(String value) {
        this.fundClass = value;
    }

    /**
     * Gets the value of the fundCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundCategory() {
        return fundCategory;
    }

    /**
     * Sets the value of the fundCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundCategory(String value) {
        this.fundCategory = value;
    }

    /**
     * Gets the value of the fundType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundType() {
        return fundType;
    }

    /**
     * Sets the value of the fundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundType(String value) {
        this.fundType = value;
    }

    /**
     * Gets the value of the fundGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundGroup() {
        return fundGroup;
    }

    /**
     * Sets the value of the fundGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundGroup(String value) {
        this.fundGroup = value;
    }

    /**
     * Gets the value of the cafrFundGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAFRFundGroup() {
        return cafrFundGroup;
    }

    /**
     * Sets the value of the cafrFundGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAFRFundGroup(String value) {
        this.cafrFundGroup = value;
    }

    /**
     * Gets the value of the cafrFundType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAFRFundType() {
        return cafrFundType;
    }

    /**
     * Sets the value of the cafrFundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAFRFundType(String value) {
        this.cafrFundType = value;
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
     * Gets the value of the objectClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectClass() {
        return objectClass;
    }

    /**
     * Sets the value of the objectClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectClass(String value) {
        this.objectClass = value;
    }

    /**
     * Gets the value of the objectCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectCategory() {
        return objectCategory;
    }

    /**
     * Sets the value of the objectCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectCategory(String value) {
        this.objectCategory = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the objectGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectGroup() {
        return objectGroup;
    }

    /**
     * Sets the value of the objectGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectGroup(String value) {
        this.objectGroup = value;
    }

    /**
     * Gets the value of the majorCAFRExpenseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorCAFRExpenseType() {
        return majorCAFRExpenseType;
    }

    /**
     * Sets the value of the majorCAFRExpenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorCAFRExpenseType(String value) {
        this.majorCAFRExpenseType = value;
    }

    /**
     * Gets the value of the minorCAFRExpenseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorCAFRExpenseType() {
        return minorCAFRExpenseType;
    }

    /**
     * Sets the value of the minorCAFRExpenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorCAFRExpenseType(String value) {
        this.minorCAFRExpenseType = value;
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
     * Gets the value of the revenueClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueClass() {
        return revenueClass;
    }

    /**
     * Sets the value of the revenueClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueClass(String value) {
        this.revenueClass = value;
    }

    /**
     * Gets the value of the revenueCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueCategory() {
        return revenueCategory;
    }

    /**
     * Sets the value of the revenueCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueCategory(String value) {
        this.revenueCategory = value;
    }

    /**
     * Gets the value of the revenueGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueGroup() {
        return revenueGroup;
    }

    /**
     * Sets the value of the revenueGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueGroup(String value) {
        this.revenueGroup = value;
    }

    /**
     * Gets the value of the revenueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueType() {
        return revenueType;
    }

    /**
     * Sets the value of the revenueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueType(String value) {
        this.revenueType = value;
    }

    /**
     * Gets the value of the majorCAFRRevenueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorCAFRRevenueType() {
        return majorCAFRRevenueType;
    }

    /**
     * Sets the value of the majorCAFRRevenueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorCAFRRevenueType(String value) {
        this.majorCAFRRevenueType = value;
    }

    /**
     * Gets the value of the minorCAFRRevenueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorCAFRRevenueType() {
        return minorCAFRRevenueType;
    }

    /**
     * Sets the value of the minorCAFRRevenueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorCAFRRevenueType(String value) {
        this.minorCAFRRevenueType = value;
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
     * Gets the value of the cashAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCashAccount() {
        return cashAccount;
    }

    /**
     * Sets the value of the cashAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCashAccount(Boolean value) {
        this.cashAccount = value;
    }

    /**
     * Gets the value of the memoAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMemoAccount() {
        return memoAccount;
    }

    /**
     * Sets the value of the memoAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMemoAccount(Boolean value) {
        this.memoAccount = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountType(BigInteger value) {
        this.accountType = value;
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
     * Gets the value of the bsaClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSAClass() {
        return bsaClass;
    }

    /**
     * Sets the value of the bsaClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSAClass(String value) {
        this.bsaClass = value;
    }

    /**
     * Gets the value of the bsaCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSACategory() {
        return bsaCategory;
    }

    /**
     * Sets the value of the bsaCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSACategory(String value) {
        this.bsaCategory = value;
    }

    /**
     * Gets the value of the bsaGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSAGroup() {
        return bsaGroup;
    }

    /**
     * Sets the value of the bsaGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSAGroup(String value) {
        this.bsaGroup = value;
    }

    /**
     * Gets the value of the bsaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSAType() {
        return bsaType;
    }

    /**
     * Sets the value of the bsaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSAType(String value) {
        this.bsaType = value;
    }

    /**
     * Gets the value of the cafrMajorBSAGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAFRMajorBSAGroup() {
        return cafrMajorBSAGroup;
    }

    /**
     * Sets the value of the cafrMajorBSAGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAFRMajorBSAGroup(String value) {
        this.cafrMajorBSAGroup = value;
    }

    /**
     * Gets the value of the cafrMinorBSAGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAFRMinorBSAGroup() {
        return cafrMinorBSAGroup;
    }

    /**
     * Sets the value of the cafrMinorBSAGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAFRMinorBSAGroup(String value) {
        this.cafrMinorBSAGroup = value;
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
     * Gets the value of the obsaClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBSAClass() {
        return obsaClass;
    }

    /**
     * Sets the value of the obsaClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBSAClass(String value) {
        this.obsaClass = value;
    }

    /**
     * Gets the value of the obsaCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBSACategory() {
        return obsaCategory;
    }

    /**
     * Sets the value of the obsaCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBSACategory(String value) {
        this.obsaCategory = value;
    }

    /**
     * Gets the value of the obsaGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBSAGroup() {
        return obsaGroup;
    }

    /**
     * Sets the value of the obsaGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBSAGroup(String value) {
        this.obsaGroup = value;
    }

    /**
     * Gets the value of the obsaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBSAType() {
        return obsaType;
    }

    /**
     * Sets the value of the obsaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBSAType(String value) {
        this.obsaType = value;
    }

    /**
     * Gets the value of the cmjrobsaGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMJROBSAGroup() {
        return cmjrobsaGroup;
    }

    /**
     * Sets the value of the cmjrobsaGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMJROBSAGroup(String value) {
        this.cmjrobsaGroup = value;
    }

    /**
     * Gets the value of the cmnrobsaGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMNROBSAGroup() {
        return cmnrobsaGroup;
    }

    /**
     * Sets the value of the cmnrobsaGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMNROBSAGroup(String value) {
        this.cmnrobsaGroup = value;
    }

    /**
     * Gets the value of the obsaType1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOBSAType1() {
        return obsaType1;
    }

    /**
     * Sets the value of the obsaType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOBSAType1(BigInteger value) {
        this.obsaType1 = value;
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
     * Gets the value of the apprClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprClass() {
        return apprClass;
    }

    /**
     * Sets the value of the apprClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprClass(String value) {
        this.apprClass = value;
    }

    /**
     * Gets the value of the apprCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprCategory() {
        return apprCategory;
    }

    /**
     * Sets the value of the apprCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprCategory(String value) {
        this.apprCategory = value;
    }

    /**
     * Gets the value of the apprType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprType() {
        return apprType;
    }

    /**
     * Sets the value of the apprType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprType(String value) {
        this.apprType = value;
    }

    /**
     * Gets the value of the apprGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprGroup() {
        return apprGroup;
    }

    /**
     * Sets the value of the apprGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprGroup(String value) {
        this.apprGroup = value;
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
     * Gets the value of the locationClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationClass() {
        return locationClass;
    }

    /**
     * Sets the value of the locationClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationClass(String value) {
        this.locationClass = value;
    }

    /**
     * Gets the value of the locationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCategory() {
        return locationCategory;
    }

    /**
     * Sets the value of the locationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCategory(String value) {
        this.locationCategory = value;
    }

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationType(String value) {
        this.locationType = value;
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
     * Gets the value of the activityClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityClass() {
        return activityClass;
    }

    /**
     * Sets the value of the activityClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityClass(String value) {
        this.activityClass = value;
    }

    /**
     * Gets the value of the activityCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityCategory() {
        return activityCategory;
    }

    /**
     * Sets the value of the activityCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityCategory(String value) {
        this.activityCategory = value;
    }

    /**
     * Gets the value of the activityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityType() {
        return activityType;
    }

    /**
     * Sets the value of the activityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityType(String value) {
        this.activityType = value;
    }

    /**
     * Gets the value of the activityGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityGroup() {
        return activityGroup;
    }

    /**
     * Sets the value of the activityGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityGroup(String value) {
        this.activityGroup = value;
    }

    /**
     * Gets the value of the cafrActivityUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAFRActivityUnit() {
        return cafrActivityUnit;
    }

    /**
     * Sets the value of the cafrActivityUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAFRActivityUnit(String value) {
        this.cafrActivityUnit = value;
    }

    /**
     * Gets the value of the majorCAFRActivityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorCAFRActivityType() {
        return majorCAFRActivityType;
    }

    /**
     * Sets the value of the majorCAFRActivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorCAFRActivityType(String value) {
        this.majorCAFRActivityType = value;
    }

    /**
     * Gets the value of the minorCAFRActivityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorCAFRActivityType() {
        return minorCAFRActivityType;
    }

    /**
     * Sets the value of the minorCAFRActivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorCAFRActivityType(String value) {
        this.minorCAFRActivityType = value;
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
     * Gets the value of the functionClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionClass() {
        return functionClass;
    }

    /**
     * Sets the value of the functionClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionClass(String value) {
        this.functionClass = value;
    }

    /**
     * Gets the value of the functionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionCategory() {
        return functionCategory;
    }

    /**
     * Sets the value of the functionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionCategory(String value) {
        this.functionCategory = value;
    }

    /**
     * Gets the value of the functionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionType() {
        return functionType;
    }

    /**
     * Sets the value of the functionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionType(String value) {
        this.functionType = value;
    }

    /**
     * Gets the value of the functionGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionGroup() {
        return functionGroup;
    }

    /**
     * Sets the value of the functionGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionGroup(String value) {
        this.functionGroup = value;
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
     * Gets the value of the reportingClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingClass() {
        return reportingClass;
    }

    /**
     * Sets the value of the reportingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingClass(String value) {
        this.reportingClass = value;
    }

    /**
     * Gets the value of the reportingCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingCategory() {
        return reportingCategory;
    }

    /**
     * Sets the value of the reportingCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingCategory(String value) {
        this.reportingCategory = value;
    }

    /**
     * Gets the value of the reportingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingType() {
        return reportingType;
    }

    /**
     * Sets the value of the reportingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingType(String value) {
        this.reportingType = value;
    }

    /**
     * Gets the value of the reportingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingGroup() {
        return reportingGroup;
    }

    /**
     * Sets the value of the reportingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingGroup(String value) {
        this.reportingGroup = value;
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
     * Gets the value of the deptObjectClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptObjectClass() {
        return deptObjectClass;
    }

    /**
     * Sets the value of the deptObjectClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptObjectClass(String value) {
        this.deptObjectClass = value;
    }

    /**
     * Gets the value of the deptObjectCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptObjectCategory() {
        return deptObjectCategory;
    }

    /**
     * Sets the value of the deptObjectCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptObjectCategory(String value) {
        this.deptObjectCategory = value;
    }

    /**
     * Gets the value of the deptObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptObjectType() {
        return deptObjectType;
    }

    /**
     * Sets the value of the deptObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptObjectType(String value) {
        this.deptObjectType = value;
    }

    /**
     * Gets the value of the deptObjectGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptObjectGroup() {
        return deptObjectGroup;
    }

    /**
     * Sets the value of the deptObjectGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptObjectGroup(String value) {
        this.deptObjectGroup = value;
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
     * Gets the value of the deptRevenueClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptRevenueClass() {
        return deptRevenueClass;
    }

    /**
     * Sets the value of the deptRevenueClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptRevenueClass(String value) {
        this.deptRevenueClass = value;
    }

    /**
     * Gets the value of the deptRevenueCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptRevenueCategory() {
        return deptRevenueCategory;
    }

    /**
     * Sets the value of the deptRevenueCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptRevenueCategory(String value) {
        this.deptRevenueCategory = value;
    }

    /**
     * Gets the value of the deptRevenueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptRevenueType() {
        return deptRevenueType;
    }

    /**
     * Sets the value of the deptRevenueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptRevenueType(String value) {
        this.deptRevenueType = value;
    }

    /**
     * Gets the value of the deptRevenueGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptRevenueGroup() {
        return deptRevenueGroup;
    }

    /**
     * Sets the value of the deptRevenueGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptRevenueGroup(String value) {
        this.deptRevenueGroup = value;
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
     * Gets the value of the majorProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorProgram() {
        return majorProgram;
    }

    /**
     * Sets the value of the majorProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorProgram(String value) {
        this.majorProgram = value;
    }

    /**
     * Gets the value of the majorProgramClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorProgramClass() {
        return majorProgramClass;
    }

    /**
     * Sets the value of the majorProgramClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorProgramClass(String value) {
        this.majorProgramClass = value;
    }

    /**
     * Gets the value of the majorProgramCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorProgramCategory() {
        return majorProgramCategory;
    }

    /**
     * Sets the value of the majorProgramCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorProgramCategory(String value) {
        this.majorProgramCategory = value;
    }

    /**
     * Gets the value of the majorProgramGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorProgramGroup() {
        return majorProgramGroup;
    }

    /**
     * Sets the value of the majorProgramGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorProgramGroup(String value) {
        this.majorProgramGroup = value;
    }

    /**
     * Gets the value of the majorProgramType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorProgramType() {
        return majorProgramType;
    }

    /**
     * Sets the value of the majorProgramType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorProgramType(String value) {
        this.majorProgramType = value;
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
     * Gets the value of the programClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramClass() {
        return programClass;
    }

    /**
     * Sets the value of the programClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramClass(String value) {
        this.programClass = value;
    }

    /**
     * Gets the value of the programCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramCategory() {
        return programCategory;
    }

    /**
     * Sets the value of the programCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramCategory(String value) {
        this.programCategory = value;
    }

    /**
     * Gets the value of the programType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramType() {
        return programType;
    }

    /**
     * Sets the value of the programType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramType(String value) {
        this.programType = value;
    }

    /**
     * Gets the value of the programGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramGroup() {
        return programGroup;
    }

    /**
     * Sets the value of the programGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramGroup(String value) {
        this.programGroup = value;
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
     *     {@link String }
     *     
     */
    public String getPostingPair() {
        return postingPair;
    }

    /**
     * Sets the value of the postingPair property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingPair(String value) {
        this.postingPair = value;
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
     * Gets the value of the referenceType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceType1() {
        return referenceType1;
    }

    /**
     * Sets the value of the referenceType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceType1(String value) {
        this.referenceType1 = value;
    }

    /**
     * Gets the value of the postingCodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingCodeName() {
        return postingCodeName;
    }

    /**
     * Sets the value of the postingCodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingCodeName(String value) {
        this.postingCodeName = value;
    }

    /**
     * Gets the value of the cashAccount1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCashAccount1() {
        return cashAccount1;
    }

    /**
     * Sets the value of the cashAccount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCashAccount1(Boolean value) {
        this.cashAccount1 = value;
    }

    /**
     * Gets the value of the memoAccount1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMemoAccount1() {
        return memoAccount1;
    }

    /**
     * Sets the value of the memoAccount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMemoAccount1(Boolean value) {
        this.memoAccount1 = value;
    }

    /**
     * Gets the value of the accountType1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountType1() {
        return accountType1;
    }

    /**
     * Sets the value of the accountType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountType1(BigInteger value) {
        this.accountType1 = value;
    }

    /**
     * Gets the value of the postingPairName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingPairName() {
        return postingPairName;
    }

    /**
     * Sets the value of the postingPairName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingPairName(String value) {
        this.postingPairName = value;
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
     * Gets the value of the offsetFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffsetFlag() {
        return offsetFlag;
    }

    /**
     * Sets the value of the offsetFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOffsetFlag(Boolean value) {
        this.offsetFlag = value;
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
     * Gets the value of the taxpayerIDNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxpayerIDNumber() {
        return taxpayerIDNumber;
    }

    /**
     * Sets the value of the taxpayerIDNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxpayerIDNumber(String value) {
        this.taxpayerIDNumber = value;
    }

    /**
     * Gets the value of the taxpayerIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxpayerIDType() {
        return taxpayerIDType;
    }

    /**
     * Sets the value of the taxpayerIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxpayerIDType(String value) {
        this.taxpayerIDType = value;
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

}
