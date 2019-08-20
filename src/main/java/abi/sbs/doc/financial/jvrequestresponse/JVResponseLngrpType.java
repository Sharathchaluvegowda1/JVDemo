
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
import abi.sbs.codedvaluelist.cvl_doc_func_cd.CVLDOCFUNCCD;
import abi.sbs.codedvaluelist.cvl_doc_phase_cd.CVLDOCPHASECD;
import abi.sbs.codedvaluelist.cvl_pst_pr_id.CVLPSTPRID;
import abi.sbs.codedvaluelist.cvl_tin_typ.CVLTINTYP;
import abi.sbs.ecm.attachment.AttachmentResponseType;


/**
 * <p>Java class for JVResponseLngrpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JVResponseLngrpType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionComponentModificationFlag" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_COMP_MOD_FL" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCategory" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_CAT" minOccurs="0"/&gt;
 *         &lt;element name="TransactionType" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_TYP" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionDept" type="{http://abi/sbs/GlobalAttribute/DOC_DEPT_CD}DOC_DEPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionIdentifier" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_ID" minOccurs="0"/&gt;
 *         &lt;element name="TransactionVersionNumber" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_VERS_NO" minOccurs="0"/&gt;
 *         &lt;element name="TransactionLineGroupNumber" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_LNGRP_NO" minOccurs="0"/&gt;
 *         &lt;element name="TransactionActionCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_ACTN_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionSubActionCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_S_ACTN_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCreationDate" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_CREA_DT" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCreationUserID" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_CREA_USID" minOccurs="0"/&gt;
 *         &lt;element name="TransactionFunctionCode" type="{http://abi/sbs/CodedValueList/CVL_DOC_FUNC_CD}CVL_DOC_FUNC_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionSubFunctionCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_S_FUNC_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionLastDate" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_LAST_DT" minOccurs="0"/&gt;
 *         &lt;element name="TransactionLastUserID" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_LAST_USID" minOccurs="0"/&gt;
 *         &lt;element name="TransactionPhaseCode" type="{http://abi/sbs/CodedValueList/CVL_DOC_PHASE_CD}CVL_DOC_PHASE_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionPreviousVersionNumber" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_PREV_VERS_NO" minOccurs="0"/&gt;
 *         &lt;element name="TransactionUnit" type="{http://abi/sbs/GlobalAttribute/DOC_UNIT_CD}DOC_UNIT_CD" minOccurs="0"/&gt;
 *         &lt;element name="ObjectAttachmentPrimaryGroupUniqueIdentifier" type="{http://abi/sbs/doc/financial/JVRequestResponse}OBJ_ATT_PG_UNID" minOccurs="0"/&gt;
 *         &lt;element name="ObjectAttachmentSecondaryGroupTotal" type="{http://abi/sbs/doc/financial/JVRequestResponse}OBJ_ATT_SG_TOT" minOccurs="0"/&gt;
 *         &lt;element name="ObjectAttachmentSecondaryUniqueIdentifier" type="{http://abi/sbs/doc/financial/JVRequestResponse}OBJ_ATT_SG_UNID" minOccurs="0"/&gt;
 *         &lt;element name="RecordDate" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_REC_DT_DC" minOccurs="0"/&gt;
 *         &lt;element name="BudgetFY" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_BFY" minOccurs="0"/&gt;
 *         &lt;element name="FiscalYear" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_FY_DC" minOccurs="0"/&gt;
 *         &lt;element name="FiscalPeriod" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_PER_DC" minOccurs="0"/&gt;
 *         &lt;element name="FiscalQuarter" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_FQTR" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_DSCR" minOccurs="0"/&gt;
 *         &lt;element name="BudgetControlReduction" type="{http://abi/sbs/doc/financial/JVRequestResponse}BUD_ED_SKP_ALW_FL" minOccurs="0"/&gt;
 *         &lt;element name="FundBalanceControlReduction" type="{http://abi/sbs/doc/financial/JVRequestResponse}FBAL_ED_SKP_ALW_FL" minOccurs="0"/&gt;
 *         &lt;element name="CashBalanceControlReduction" type="{http://abi/sbs/doc/financial/JVRequestResponse}CBAL_ED_SKP_ALW_FL" minOccurs="0"/&gt;
 *         &lt;element name="EventType" type="{http://abi/sbs/doc/financial/JVRequestResponse}EVNT_TYP_ID" minOccurs="0"/&gt;
 *         &lt;element name="PostingPair" type="{http://abi/sbs/CodedValueList/CVL_PST_PR_ID}CVL_PST_PR_ID" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceType" type="{http://abi/sbs/doc/financial/JVRequestResponse}RF_TYP" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedLineOpenAmount" type="{http://abi/sbs/doc/financial/JVRequestResponse}RFED_OPN_LN_AM" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedTransactionCategory" type="{http://abi/sbs/doc/financial/JVRequestResponse}RFED_DOC_CAT" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedTransactionType" type="{http://abi/sbs/doc/financial/JVRequestResponse}RFED_DOC_TYP" minOccurs="0"/&gt;
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
 *         &lt;element name="MiscAccount" type="{http://abi/sbs/doc/financial/JVRequestResponse}MISC_ACCT_FL" minOccurs="0"/&gt;
 *         &lt;element name="DebitTotal" type="{http://abi/sbs/doc/financial/JVRequestResponse}LNGRP_DR_TOT_AM" minOccurs="0"/&gt;
 *         &lt;element name="CreditTotal" type="{http://abi/sbs/doc/financial/JVRequestResponse}LNGRP_CR_TOT_AM" minOccurs="0"/&gt;
 *         &lt;element name="LineGroupDescription" type="{http://abi/sbs/doc/financial/JVRequestResponse}LNGRP_DSCR" minOccurs="0"/&gt;
 *         &lt;element name="PerformanceUnits" type="{http://abi/sbs/doc/financial/JVRequestResponse}PERF_UNIT" minOccurs="0"/&gt;
 *         &lt;element name="UnitOfMeasure" type="{http://abi/sbs/doc/financial/JVRequestResponse}UNIT_MEAS_CD" minOccurs="0"/&gt;
 *         &lt;element name="TransactionLineGroupLineNumber" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_LNGRP_LN_NO" minOccurs="0"/&gt;
 *         &lt;element name="TransactionChildMaximumLineNumber" type="{http://abi/sbs/doc/financial/JVRequestResponse}DOC_CHLD_MAX_LN_NO" minOccurs="0"/&gt;
 *         &lt;element name="AMSRowVersionNumber" type="{http://abi/sbs/doc/financial/JVRequestResponse}AMS_ROW_VERS_NO" minOccurs="0"/&gt;
 *         &lt;element name="LineGroup" type="{http://abi/sbs/doc/financial/JVRequestResponse}LNGRP_ID" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceType1" type="{http://abi/sbs/doc/financial/JVRequestResponse}RF_TYP_DV" minOccurs="0"/&gt;
 *         &lt;element name="PostingPairName" type="{http://abi/sbs/doc/financial/JVRequestResponse}PST_PR_NM" minOccurs="0"/&gt;
 *         &lt;element name="EventCategory" type="{http://abi/sbs/doc/financial/JVRequestResponse}EVNT_CAT_ID" minOccurs="0"/&gt;
 *         &lt;element name="AccountingLineCount" type="{http://abi/sbs/doc/financial/JVRequestResponse}TOT_ACTG_LN_CT" minOccurs="0"/&gt;
 *         &lt;element name="AccountingLinesCrossAppropriations" type="{http://abi/sbs/doc/financial/JVRequestResponse}XAPPR_FL" minOccurs="0"/&gt;
 *         &lt;element name="Fund" type="{http://abi/sbs/GlobalAttribute/FUND_CD}FUND_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubFund" type="{http://abi/sbs/GlobalAttribute/SFUND_CD}SFUND_CD" minOccurs="0"/&gt;
 *         &lt;element name="FundClass" type="{http://abi/sbs/GlobalAttribute/FCLS_CD}FCLS_CD" minOccurs="0"/&gt;
 *         &lt;element name="FundCategory" type="{http://abi/sbs/GlobalAttribute/FCAT_CD}FCAT_CD" minOccurs="0"/&gt;
 *         &lt;element name="FundType" type="{http://abi/sbs/GlobalAttribute/FTYP_CD}FTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="FundGroup" type="{http://abi/sbs/GlobalAttribute/FGRP_CD}FGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="CAFRFundGroup" type="{http://abi/sbs/GlobalAttribute/CAFRFGRP_CD}CAFRFGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="CAFRFundType" type="{http://abi/sbs/GlobalAttribute/CAFRFTYP_CD}CAFRFTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="Department" type="{http://abi/sbs/GlobalAttribute/DEPT_CD}DEPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="Unit" type="{http://abi/sbs/GlobalAttribute/UNIT_CD}UNIT_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubUnit" type="{http://abi/sbs/GlobalAttribute/SUNIT_CD}SUNIT_CD" minOccurs="0"/&gt;
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
 *         &lt;element name="County1" type="{http://abi/sbs/GlobalAttribute/CNTY_CD}CNTY_CD" minOccurs="0"/&gt;
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
 *         &lt;element name="Object" type="{http://abi/sbs/GlobalAttribute/OBJ_CD}OBJ_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubObject" type="{http://abi/sbs/GlobalAttribute/SOBJ_CD}SOBJ_CD" minOccurs="0"/&gt;
 *         &lt;element name="ObjectClass" type="{http://abi/sbs/GlobalAttribute/OCLS_CD}OCLS_CD" minOccurs="0"/&gt;
 *         &lt;element name="ObjectCategory" type="{http://abi/sbs/GlobalAttribute/OCAT_CD}OCAT_CD" minOccurs="0"/&gt;
 *         &lt;element name="ObjectType" type="{http://abi/sbs/GlobalAttribute/OTYP_CD}OTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="ObjectGroup" type="{http://abi/sbs/GlobalAttribute/OGRP_CD}OGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="Revenue" type="{http://abi/sbs/GlobalAttribute/RSRC_CD}RSRC_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubRevenue" type="{http://abi/sbs/GlobalAttribute/SRSRC_CD}SRSRC_CD" minOccurs="0"/&gt;
 *         &lt;element name="RevenueClass" type="{http://abi/sbs/GlobalAttribute/RSCLS_CD}RSCLS_CD" minOccurs="0"/&gt;
 *         &lt;element name="RevenueCategory" type="{http://abi/sbs/GlobalAttribute/RSCAT_CD}RSCAT_CD" minOccurs="0"/&gt;
 *         &lt;element name="RevenueGroup" type="{http://abi/sbs/GlobalAttribute/RSGRP_CD}RSGRP_CD" minOccurs="0"/&gt;
 *         &lt;element name="RevenueType" type="{http://abi/sbs/GlobalAttribute/RSTYP_CD}RSTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="MajorCAFRRevenueType" type="{http://abi/sbs/GlobalAttribute/MJR_CRTYP_CD}MJR_CRTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="MinorCAFRRevenueType" type="{http://abi/sbs/GlobalAttribute/MNR_CRTYP_CD}MNR_CRTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="BSA" type="{http://abi/sbs/GlobalAttribute/BSA_CD}BSA_CD" minOccurs="0"/&gt;
 *         &lt;element name="CashAccount" type="{http://abi/sbs/doc/financial/JVRequestResponse}CASH_ACCT_FL_LG" minOccurs="0"/&gt;
 *         &lt;element name="MemoAccount" type="{http://abi/sbs/doc/financial/JVRequestResponse}MMO_ACCT_FL_LG" minOccurs="0"/&gt;
 *         &lt;element name="AccountType" type="{http://abi/sbs/doc/financial/JVRequestResponse}BSA_TYP_IND_LG" minOccurs="0"/&gt;
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
 *         &lt;element name="OBSAType1" type="{http://abi/sbs/doc/financial/JVRequestResponse}OBSA_TYP_IND_LG" minOccurs="0"/&gt;
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
 *         &lt;element name="InternalFund" type="{http://abi/sbs/GlobalAttribute/IG_FUND_CD}IG_FUND_CD" minOccurs="0"/&gt;
 *         &lt;element name="InternalSubFund" type="{http://abi/sbs/GlobalAttribute/IG_SFUND_CD}IG_SFUND_CD" minOccurs="0"/&gt;
 *         &lt;element name="InternalDept" type="{http://abi/sbs/GlobalAttribute/IG_DEPT_CD}IG_DEPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="Reporting" type="{http://abi/sbs/GlobalAttribute/RPT_CD}RPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="SubReporting" type="{http://abi/sbs/GlobalAttribute/SRPT_CD}SRPT_CD" minOccurs="0"/&gt;
 *         &lt;element name="ReportingClass" type="{http://abi/sbs/GlobalAttribute/RCLS_CD}RCLS_CD" minOccurs="0"/&gt;
 *         &lt;element name="ReportingCategory" type="{http://abi/sbs/GlobalAttribute/RCAT_CD}RCAT_CD" minOccurs="0"/&gt;
 *         &lt;element name="ReportingType" type="{http://abi/sbs/GlobalAttribute/RTYP_CD}RTYP_CD" minOccurs="0"/&gt;
 *         &lt;element name="ReportingGroup" type="{http://abi/sbs/GlobalAttribute/RGRP_CD}RGRP_CD" minOccurs="0"/&gt;
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
 *         &lt;element name="AddressCode" type="{http://abi/sbs/doc/financial/JVRequestResponse}AD_ID" minOccurs="0"/&gt;
 *         &lt;element name="VendorContactID" type="{http://abi/sbs/doc/financial/JVRequestResponse}CNTAC_NO" minOccurs="0"/&gt;
 *         &lt;element name="TaxpayerID" type="{http://abi/sbs/doc/financial/JVRequestResponse}TIN" minOccurs="0"/&gt;
 *         &lt;element name="TaxpayerIDType" type="{http://abi/sbs/CodedValueList/CVL_TIN_TYP}CVL_TIN_TYP" minOccurs="0"/&gt;
 *         &lt;element name="AddressType" type="{http://abi/sbs/doc/financial/JVRequestResponse}AD_TYP" minOccurs="0"/&gt;
 *         &lt;element name="DebtID" type="{http://abi/sbs/doc/financial/JVRequestResponse}DEBT_ID" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizationDebtInstrument" type="{http://abi/sbs/CodedValueList/CVL_AUTHDI_IND}CVL_AUTHDI_IND" minOccurs="0"/&gt;
 *         &lt;element name="ExtensionStorageUniqueID" type="{http://abi/sbs/doc/financial/JVRequestResponse}EXT_STOR_UNID" minOccurs="0"/&gt;
 *         &lt;element name="Attachment" type="{http://abi/sbs/ecm/Attachment}AttachmentResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JVResponseActg" type="{http://abi/sbs/doc/financial/JVRequestResponse}JVResponseActgType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JVResponseLngrpType", propOrder = {
    "transactionComponentModificationFlag",
    "transactionCategory",
    "transactionType",
    "transactionCode",
    "transactionDept",
    "transactionIdentifier",
    "transactionVersionNumber",
    "transactionLineGroupNumber",
    "transactionActionCode",
    "transactionSubActionCode",
    "transactionCreationDate",
    "transactionCreationUserID",
    "transactionFunctionCode",
    "transactionSubFunctionCode",
    "transactionLastDate",
    "transactionLastUserID",
    "transactionPhaseCode",
    "transactionPreviousVersionNumber",
    "transactionUnit",
    "objectAttachmentPrimaryGroupUniqueIdentifier",
    "objectAttachmentSecondaryGroupTotal",
    "objectAttachmentSecondaryUniqueIdentifier",
    "recordDate",
    "budgetFY",
    "fiscalYear",
    "fiscalPeriod",
    "fiscalQuarter",
    "description",
    "budgetControlReduction",
    "fundBalanceControlReduction",
    "cashBalanceControlReduction",
    "eventType",
    "postingPair",
    "referenceType",
    "referencedLineOpenAmount",
    "referencedTransactionCategory",
    "referencedTransactionType",
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
    "miscAccount",
    "debitTotal",
    "creditTotal",
    "lineGroupDescription",
    "performanceUnits",
    "unitOfMeasure",
    "transactionLineGroupLineNumber",
    "transactionChildMaximumLineNumber",
    "amsRowVersionNumber",
    "lineGroup",
    "referenceType1",
    "postingPairName",
    "eventCategory",
    "accountingLineCount",
    "accountingLinesCrossAppropriations",
    "fund",
    "subFund",
    "fundClass",
    "fundCategory",
    "fundType",
    "fundGroup",
    "cafrFundGroup",
    "cafrFundType",
    "department",
    "unit",
    "subUnit",
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
    "county1",
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
    "object",
    "subObject",
    "objectClass",
    "objectCategory",
    "objectType",
    "objectGroup",
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
    "internalFund",
    "internalSubFund",
    "internalDept",
    "reporting",
    "subReporting",
    "reportingClass",
    "reportingCategory",
    "reportingType",
    "reportingGroup",
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
    "addressCode",
    "vendorContactID",
    "taxpayerID",
    "taxpayerIDType",
    "addressType",
    "debtID",
    "authorizationDebtInstrument",
    "extensionStorageUniqueID",
    "attachment",
    "jvResponseActg"
})
public class JVResponseLngrpType {

    @XmlElement(name = "TransactionComponentModificationFlag")
    protected BigInteger transactionComponentModificationFlag;
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
    @XmlElement(name = "TransactionLineGroupNumber")
    protected Long transactionLineGroupNumber;
    @XmlElement(name = "TransactionActionCode")
    protected BigInteger transactionActionCode;
    @XmlElement(name = "TransactionSubActionCode")
    protected BigInteger transactionSubActionCode;
    @XmlElement(name = "TransactionCreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionCreationDate;
    @XmlElement(name = "TransactionCreationUserID")
    protected String transactionCreationUserID;
    @XmlElement(name = "TransactionFunctionCode")
    @XmlSchemaType(name = "string")
    protected CVLDOCFUNCCD transactionFunctionCode;
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
    @XmlElement(name = "RecordDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recordDate;
    @XmlElement(name = "BudgetFY")
    protected BigInteger budgetFY;
    @XmlElement(name = "FiscalYear")
    protected BigInteger fiscalYear;
    @XmlElement(name = "FiscalPeriod")
    protected Byte fiscalPeriod;
    @XmlElement(name = "FiscalQuarter")
    protected BigInteger fiscalQuarter;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "BudgetControlReduction")
    protected Boolean budgetControlReduction;
    @XmlElement(name = "FundBalanceControlReduction")
    protected Boolean fundBalanceControlReduction;
    @XmlElement(name = "CashBalanceControlReduction")
    protected Boolean cashBalanceControlReduction;
    @XmlElement(name = "EventType")
    protected String eventType;
    @XmlElement(name = "PostingPair")
    @XmlSchemaType(name = "string")
    protected CVLPSTPRID postingPair;
    @XmlElement(name = "ReferenceType")
    protected BigInteger referenceType;
    @XmlElement(name = "ReferencedLineOpenAmount")
    protected BigDecimal referencedLineOpenAmount;
    @XmlElement(name = "ReferencedTransactionCategory")
    protected String referencedTransactionCategory;
    @XmlElement(name = "ReferencedTransactionType")
    protected String referencedTransactionType;
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
    @XmlElement(name = "MiscAccount")
    protected Boolean miscAccount;
    @XmlElement(name = "DebitTotal")
    protected BigDecimal debitTotal;
    @XmlElement(name = "CreditTotal")
    protected BigDecimal creditTotal;
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
    @XmlElement(name = "AMSRowVersionNumber")
    protected Long amsRowVersionNumber;
    @XmlElement(name = "LineGroup")
    protected BigInteger lineGroup;
    @XmlElement(name = "ReferenceType1")
    protected String referenceType1;
    @XmlElement(name = "PostingPairName")
    protected String postingPairName;
    @XmlElement(name = "EventCategory")
    protected String eventCategory;
    @XmlElement(name = "AccountingLineCount")
    protected BigInteger accountingLineCount;
    @XmlElement(name = "AccountingLinesCrossAppropriations")
    protected Boolean accountingLinesCrossAppropriations;
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
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "Unit")
    protected String unit;
    @XmlElement(name = "SubUnit")
    protected String subUnit;
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
    @XmlElement(name = "County1")
    protected String county1;
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
    @XmlElement(name = "ReportingClass")
    protected String reportingClass;
    @XmlElement(name = "ReportingCategory")
    protected String reportingCategory;
    @XmlElement(name = "ReportingType")
    protected String reportingType;
    @XmlElement(name = "ReportingGroup")
    protected String reportingGroup;
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
    @XmlElement(name = "AddressCode")
    protected String addressCode;
    @XmlElement(name = "VendorContactID")
    protected String vendorContactID;
    @XmlElement(name = "TaxpayerID")
    protected String taxpayerID;
    @XmlElement(name = "TaxpayerIDType")
    @XmlSchemaType(name = "string")
    protected CVLTINTYP taxpayerIDType;
    @XmlElement(name = "AddressType")
    protected String addressType;
    @XmlElement(name = "DebtID")
    protected String debtID;
    @XmlElement(name = "AuthorizationDebtInstrument")
    @XmlSchemaType(name = "string")
    protected CVLAUTHDIIND authorizationDebtInstrument;
    @XmlElement(name = "ExtensionStorageUniqueID")
    protected Long extensionStorageUniqueID;
    @XmlElement(name = "Attachment")
    protected List<AttachmentResponseType> attachment;
    @XmlElement(name = "JVResponseActg")
    protected List<JVResponseActgType> jvResponseActg;

    /**
     * Gets the value of the transactionComponentModificationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransactionComponentModificationFlag() {
        return transactionComponentModificationFlag;
    }

    /**
     * Sets the value of the transactionComponentModificationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransactionComponentModificationFlag(BigInteger value) {
        this.transactionComponentModificationFlag = value;
    }

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
     * Gets the value of the transactionLineGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransactionLineGroupNumber() {
        return transactionLineGroupNumber;
    }

    /**
     * Sets the value of the transactionLineGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransactionLineGroupNumber(Long value) {
        this.transactionLineGroupNumber = value;
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
     * Gets the value of the transactionFunctionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CVLDOCFUNCCD }
     *     
     */
    public CVLDOCFUNCCD getTransactionFunctionCode() {
        return transactionFunctionCode;
    }

    /**
     * Sets the value of the transactionFunctionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVLDOCFUNCCD }
     *     
     */
    public void setTransactionFunctionCode(CVLDOCFUNCCD value) {
        this.transactionFunctionCode = value;
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
     * Gets the value of the fiscalPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getFiscalPeriod() {
        return fiscalPeriod;
    }

    /**
     * Sets the value of the fiscalPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setFiscalPeriod(Byte value) {
        this.fiscalPeriod = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the referencedTransactionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencedTransactionCategory() {
        return referencedTransactionCategory;
    }

    /**
     * Sets the value of the referencedTransactionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencedTransactionCategory(String value) {
        this.referencedTransactionCategory = value;
    }

    /**
     * Gets the value of the referencedTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencedTransactionType() {
        return referencedTransactionType;
    }

    /**
     * Sets the value of the referencedTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencedTransactionType(String value) {
        this.referencedTransactionType = value;
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
     * Gets the value of the miscAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMiscAccount() {
        return miscAccount;
    }

    /**
     * Sets the value of the miscAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMiscAccount(Boolean value) {
        this.miscAccount = value;
    }

    /**
     * Gets the value of the debitTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebitTotal() {
        return debitTotal;
    }

    /**
     * Sets the value of the debitTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebitTotal(BigDecimal value) {
        this.debitTotal = value;
    }

    /**
     * Gets the value of the creditTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditTotal() {
        return creditTotal;
    }

    /**
     * Sets the value of the creditTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditTotal(BigDecimal value) {
        this.creditTotal = value;
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
     * Gets the value of the amsRowVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAMSRowVersionNumber() {
        return amsRowVersionNumber;
    }

    /**
     * Sets the value of the amsRowVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAMSRowVersionNumber(Long value) {
        this.amsRowVersionNumber = value;
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
     * Gets the value of the eventCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventCategory() {
        return eventCategory;
    }

    /**
     * Sets the value of the eventCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventCategory(String value) {
        this.eventCategory = value;
    }

    /**
     * Gets the value of the accountingLineCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountingLineCount() {
        return accountingLineCount;
    }

    /**
     * Sets the value of the accountingLineCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountingLineCount(BigInteger value) {
        this.accountingLineCount = value;
    }

    /**
     * Gets the value of the accountingLinesCrossAppropriations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountingLinesCrossAppropriations() {
        return accountingLinesCrossAppropriations;
    }

    /**
     * Sets the value of the accountingLinesCrossAppropriations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountingLinesCrossAppropriations(Boolean value) {
        this.accountingLinesCrossAppropriations = value;
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
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
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

    /**
     * Gets the value of the jvResponseActg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jvResponseActg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJVResponseActg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JVResponseActgType }
     * 
     * 
     */
    public List<JVResponseActgType> getJVResponseActg() {
        if (jvResponseActg == null) {
            jvResponseActg = new ArrayList<JVResponseActgType>();
        }
        return this.jvResponseActg;
    }

}
