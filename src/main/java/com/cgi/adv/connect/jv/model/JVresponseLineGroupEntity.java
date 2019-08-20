package com.cgi.adv.connect.jv.model;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class JVresponseLineGroupEntity  {
  
  @ApiModelProperty(value = "")
  private Long transactionComponentModificationFlag = null;

  @ApiModelProperty(value = "")
  private String transactionCategory = null;

  @ApiModelProperty(value = "")
  private String transactionType = null;

  @ApiModelProperty(value = "")
  private String transactionCode = null;

  @ApiModelProperty(value = "")
  private String transactionDept = null;

  @ApiModelProperty(value = "")
  private String transactionIdentifier = null;

  @ApiModelProperty(value = "")
  private Long transactionVersionNumber = null;

  @ApiModelProperty(value = "")
  private Long transactionLineGroupNumber = null;

  @ApiModelProperty(value = "")
  private Long transactionActionCode = null;

  @ApiModelProperty(value = "")
  private Long transactionSubActionCode = null;

  @ApiModelProperty(value = "")
  private Date transactionCreationDate = null;

  @ApiModelProperty(value = "")
  private String transactionCreationUserID = null;

  @ApiModelProperty(value = "")
  private String transactionFunctionCode = null;

  @ApiModelProperty(value = "")
  private Long transactionSubFunctionCode = null;

  @ApiModelProperty(value = "")
  private Date transactionLastDate = null;

  @ApiModelProperty(value = "")
  private String transactionLastUserID = null;

  @ApiModelProperty(value = "")
  private String transactionPhaseCode = null;

  @ApiModelProperty(value = "")
  private Long transactionPreviousVersionNumber = null;

  @ApiModelProperty(value = "")
  private String transactionUnit = null;

  @ApiModelProperty(value = "")
  private String objectAttachmentPrimaryGroupUniqueIdentifier = null;

  @ApiModelProperty(value = "")
  private String objectAttachmentSecondaryGroupTotal = null;

  @ApiModelProperty(value = "")
  private Long objectAttachmentSecondaryUniqueIdentifier = null;

  @ApiModelProperty(value = "")
  private LocalDate recordDate = null;

  @ApiModelProperty(value = "")
  private Long budgetFY = null;

  @ApiModelProperty(value = "")
  private Long fiscalYear = null;

  @ApiModelProperty(value = "")
  private String fiscalPeriod = null;

  @ApiModelProperty(value = "")
  private Integer fiscalQuarter = null;

  @ApiModelProperty(value = "")
  private String description = null;

  @ApiModelProperty(value = "")
  private Boolean budgetControlReduction = null;

  @ApiModelProperty(value = "")
  private Boolean fundBalanceControlReduction = null;

  @ApiModelProperty(value = "")
  private Boolean cashBalanceControlReduction = null;

  @ApiModelProperty(value = "")
  private String eventType = null;

  @ApiModelProperty(value = "")
  private String postingPair = null;

  @ApiModelProperty(value = "")
  private Long referenceType = null;

  @ApiModelProperty(value = "")
  private Integer referencedLineOpenAmount = null;

  @ApiModelProperty(value = "")
  private String referencedTransactionCategory = null;

  @ApiModelProperty(value = "")
  private String referencedTransactionType = null;

  @ApiModelProperty(value = "")
  private String referencedTransactionCode = null;

  @ApiModelProperty(value = "")
  private String referencedTransactionDepartment = null;

  @ApiModelProperty(value = "")
  private String referencedTransactionID = null;

  @ApiModelProperty(value = "")
  private Long referencedTransactionVersion = null;

  @ApiModelProperty(value = "")
  private Integer referencedVendorLine = null;

  @ApiModelProperty(value = "")
  private Long referencedCommodityLine = null;

  @ApiModelProperty(value = "")
  private Long referencedAccountingLine = null;

  @ApiModelProperty(value = "")
  private Long refAmendment = null;

  @ApiModelProperty(value = "")
  private String vendorCustomer = null;

  @ApiModelProperty(value = "")
  private String legalName = null;

  @ApiModelProperty(value = "")
  private String aliasOrDBA = null;

  @ApiModelProperty(value = "")
  private String addressLine1 = null;

  @ApiModelProperty(value = "")
  private String addressLine2 = null;

  @ApiModelProperty(value = "")
  private String city = null;

  @ApiModelProperty(value = "")
  private String state = null;

  @ApiModelProperty(value = "")
  private String zip = null;

  @ApiModelProperty(value = "")
  private String country = null;

  @ApiModelProperty(value = "")
  private String vendorContactPhone = null;

  @ApiModelProperty(value = "")
  private String vendorContactPhoneExtension = null;

  @ApiModelProperty(value = "")
  private String fax = null;

  @ApiModelProperty(value = "")
  private String faxExtension = null;

  @ApiModelProperty(value = "")
  private String vendorContactEmail = null;

  @ApiModelProperty(value = "")
  private String webAddress = null;

  @ApiModelProperty(value = "")
  private String vendorContactName = null;

  @ApiModelProperty(value = "")
  private Boolean miscAccount = null;

  @ApiModelProperty(value = "")
  private Integer debitTotal = null;

  @ApiModelProperty(value = "")
  private Integer creditTotal = null;

  @ApiModelProperty(value = "")
  private String lineGroupDescription = null;

  @ApiModelProperty(value = "")
  private Integer performanceUnits = null;

  @ApiModelProperty(value = "")
  private String unitOfMeasure = null;

  @ApiModelProperty(value = "")
  private Long transactionLineGroupLineNumber = null;

  @ApiModelProperty(value = "")
  private Long transactionChildMaximumLineNumber = null;

  @ApiModelProperty(value = "")
  private Long amsRowVersionNumber = null;

  @ApiModelProperty(value = "")
  private Long lineGroup = null;

  @ApiModelProperty(value = "")
  private String referenceType1 = null;

  @ApiModelProperty(value = "")
  private String postingPairName = null;

  @ApiModelProperty(value = "")
  private Integer eventCategory = null;

  @ApiModelProperty(value = "")
  private Long accountingLineCount = null;

  @ApiModelProperty(value = "")
  private Boolean accountingLinesCrossAppropriations = null;

  @ApiModelProperty(value = "")
  private String fund = null;

  @ApiModelProperty(value = "")
  private String subFund = null;

  @ApiModelProperty(value = "")
  private String fundClass = null;

  @ApiModelProperty(value = "")
  private String fundCategory = null;

  @ApiModelProperty(value = "")
  private String fundType = null;

  @ApiModelProperty(value = "")
  private String fundGroup = null;

  @ApiModelProperty(value = "")
  private String cafrFundGroup = null;

  @ApiModelProperty(value = "")
  private String cafrFundType = null;

  @ApiModelProperty(value = "")
  private String department = null;

  @ApiModelProperty(value = "")
  private String unit = null;

  @ApiModelProperty(value = "")
  private String subUnit = null;

  @ApiModelProperty(value = "")
  private String apprUnit = null;

  @ApiModelProperty(value = "")
  private String apprClass = null;

  @ApiModelProperty(value = "")
  private String apprCategory = null;

  @ApiModelProperty(value = "")
  private String apprType = null;

  @ApiModelProperty(value = "")
  private String apprGroup = null;

  @ApiModelProperty(value = "")
  private String location = null;

  @ApiModelProperty(value = "")
  private String subLocation = null;

  @ApiModelProperty(value = "")
  private String locationClass = null;

  @ApiModelProperty(value = "")
  private String locationCategory = null;

  @ApiModelProperty(value = "")
  private String locationType = null;

  @ApiModelProperty(value = "")
  private String county1 = null;

  @ApiModelProperty(value = "")
  private String activity = null;

  @ApiModelProperty(value = "")
  private String subActivity = null;

  @ApiModelProperty(value = "")
  private String activityClass = null;

  @ApiModelProperty(value = "")
  private String activityCategory = null;

  @ApiModelProperty(value = "")
  private String activityType = null;

  @ApiModelProperty(value = "")
  private String activityGroup = null;

  @ApiModelProperty(value = "")
  private String cafrActivityUnit = null;

  @ApiModelProperty(value = "")
  private String majorCAFRActivityType = null;

  @ApiModelProperty(value = "")
  private String minorCAFRActivityType = null;

  @ApiModelProperty(value = "")
  private String function = null;

  @ApiModelProperty(value = "")
  private String subFunction = null;

  @ApiModelProperty(value = "")
  private String functionClass = null;

  @ApiModelProperty(value = "")
  private String functionCategory = null;

  @ApiModelProperty(value = "")
  private String functionType = null;

  @ApiModelProperty(value = "")
  private String functionGroup = null;

  @ApiModelProperty(value = "")
  private String object = null;

  @ApiModelProperty(value = "")
  private String subObject = null;

  @ApiModelProperty(value = "")
  private String objectClass = null;

  @ApiModelProperty(value = "")
  private String objectCategory = null;

  @ApiModelProperty(value = "")
  private String objectType = null;

  @ApiModelProperty(value = "")
  private String objectGroup = null;

  @ApiModelProperty(value = "")
  private String revenue = null;

  @ApiModelProperty(value = "")
  private String subRevenue = null;

  @ApiModelProperty(value = "")
  private String revenueClass = null;

  @ApiModelProperty(value = "")
  private String revenueCategory = null;

  @ApiModelProperty(value = "")
  private String revenueGroup = null;

  @ApiModelProperty(value = "")
  private String revenueType = null;

  @ApiModelProperty(value = "")
  private String majorCAFRRevenueType = null;

  @ApiModelProperty(value = "")
  private String minorCAFRRevenueType = null;

  @ApiModelProperty(value = "")
  private String bsa = null;

  @ApiModelProperty(value = "")
  private String cashAccount = null;

  @ApiModelProperty(value = "")
  private Boolean memoAccount = null;

  @ApiModelProperty(value = "")
  private Long accountType = null;

  @ApiModelProperty(value = "")
  private String subBSA = null;

  @ApiModelProperty(value = "")
  private String bsaClass = null;

  @ApiModelProperty(value = "")
  private String bsaCategory = null;

  @ApiModelProperty(value = "")
  private String bsaGroup = null;

  @ApiModelProperty(value = "")
  private String bsaType = null;

  @ApiModelProperty(value = "")
  private String cafrMajorBSAGroup = null;

  @ApiModelProperty(value = "")
  private String cafrMinorBSAGroup = null;

  @ApiModelProperty(value = "")
  private String obsa = null;

  @ApiModelProperty(value = "")
  private String subOBSA = null;

  @ApiModelProperty(value = "")
  private String obsaClass = null;

  @ApiModelProperty(value = "")
  private String obsaCategory = null;

  @ApiModelProperty(value = "")
  private String obsaGroup = null;

  @ApiModelProperty(value = "")
  private String obsaType = null;

  @ApiModelProperty(value = "")
  private String cmjrobsaGroup = null;

  @ApiModelProperty(value = "")
  private String cmnrobsaGroup = null;

  @ApiModelProperty(value = "")
  private String obsaType1 = null;

  @ApiModelProperty(value = "")
  private String deptObject = null;

  @ApiModelProperty(value = "")
  private String deptObjectClass = null;

  @ApiModelProperty(value = "")
  private String deptObjectCategory = null;

  @ApiModelProperty(value = "")
  private String deptObjectType = null;

  @ApiModelProperty(value = "")
  private String deptObjectGroup = null;

  @ApiModelProperty(value = "")
  private String deptRevenue = null;

  @ApiModelProperty(value = "")
  private String deptRevenueClass = null;

  @ApiModelProperty(value = "")
  private String deptRevenueCategory = null;

  @ApiModelProperty(value = "")
  private String deptRevenueType = null;

  @ApiModelProperty(value = "")
  private String deptRevenueGroup = null;

  @ApiModelProperty(value = "")
  private String internalFund = null;

  @ApiModelProperty(value = "")
  private String internalSubFund = null;

  @ApiModelProperty(value = "")
  private String internalDept = null;

  @ApiModelProperty(value = "")
  private String reporting = null;

  @ApiModelProperty(value = "")
  private String subReporting = null;

  @ApiModelProperty(value = "")
  private String reportingClass = null;

  @ApiModelProperty(value = "")
  private String reportingCategory = null;

  @ApiModelProperty(value = "")
  private String reportingType = null;

  @ApiModelProperty(value = "")
  private String reportingGroup = null;

  @ApiModelProperty(value = "")
  private String task = null;

  @ApiModelProperty(value = "")
  private String subTask = null;

  @ApiModelProperty(value = "")
  private String taskOrder = null;

  @ApiModelProperty(value = "")
  private String majorProgram = null;

  @ApiModelProperty(value = "")
  private String majorProgramClass = null;

  @ApiModelProperty(value = "")
  private String majorProgramCategory = null;

  @ApiModelProperty(value = "")
  private String majorProgramGroup = null;

  @ApiModelProperty(value = "")
  private String majorProgramType = null;

  @ApiModelProperty(value = "")
  private String program = null;

  @ApiModelProperty(value = "")
  private String phase = null;

  @ApiModelProperty(value = "")
  private String programClass = null;

  @ApiModelProperty(value = "")
  private String programCategory = null;

  @ApiModelProperty(value = "")
  private String programType = null;

  @ApiModelProperty(value = "")
  private String programGroup = null;

  @ApiModelProperty(value = "")
  private String programPeriod = null;

  @ApiModelProperty(value = "")
  private String addressCode = null;

  @ApiModelProperty(value = "")
  private String vendorContactID = null;

  @ApiModelProperty(value = "")
  private String taxpayerID = null;

  @ApiModelProperty(value = "")
  private String taxpayerIDType = null;

  @ApiModelProperty(value = "")
  private String addressType = null;

  @ApiModelProperty(value = "")
  private String debtID = null;

  @ApiModelProperty(value = "")
  private String authorizationDebtInstrument = null;

  @ApiModelProperty(value = "")
  private Long extensionStorageUniqueID = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<JVresponseAccountingEntity> jvresponseAccountingEntity = null;
 /**
   * Get transactionComponentModificationFlag
   * @return transactionComponentModificationFlag
  **/
  @JsonProperty("transactionComponentModificationFlag")
  public Long getTransactionComponentModificationFlag() {
    return transactionComponentModificationFlag;
  }

  public void setTransactionComponentModificationFlag(Long transactionComponentModificationFlag) {
    this.transactionComponentModificationFlag = transactionComponentModificationFlag;
  }

  public JVresponseLineGroupEntity transactionComponentModificationFlag(Long transactionComponentModificationFlag) {
    this.transactionComponentModificationFlag = transactionComponentModificationFlag;
    return this;
  }

 /**
   * Get transactionCategory
   * @return transactionCategory
  **/
  @JsonProperty("transactionCategory")
  public String getTransactionCategory() {
    return transactionCategory;
  }

  public void setTransactionCategory(String transactionCategory) {
    this.transactionCategory = transactionCategory;
  }

  public JVresponseLineGroupEntity transactionCategory(String transactionCategory) {
    this.transactionCategory = transactionCategory;
    return this;
  }

 /**
   * Get transactionType
   * @return transactionType
  **/
  @JsonProperty("transactionType")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public JVresponseLineGroupEntity transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

 /**
   * Get transactionCode
   * @return transactionCode
  **/
  @JsonProperty("transactionCode")
  public String getTransactionCode() {
    return transactionCode;
  }

  public void setTransactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
  }

  public JVresponseLineGroupEntity transactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
    return this;
  }

 /**
   * Get transactionDept
   * @return transactionDept
  **/
  @JsonProperty("transactionDept")
 @Size(max=8)  public String getTransactionDept() {
    return transactionDept;
  }

  public void setTransactionDept(String transactionDept) {
    this.transactionDept = transactionDept;
  }

  public JVresponseLineGroupEntity transactionDept(String transactionDept) {
    this.transactionDept = transactionDept;
    return this;
  }

 /**
   * Get transactionIdentifier
   * @return transactionIdentifier
  **/
  @JsonProperty("transactionIdentifier")
  public String getTransactionIdentifier() {
    return transactionIdentifier;
  }

  public void setTransactionIdentifier(String transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
  }

  public JVresponseLineGroupEntity transactionIdentifier(String transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
    return this;
  }

 /**
   * Get transactionVersionNumber
   * @return transactionVersionNumber
  **/
  @JsonProperty("transactionVersionNumber")
  public Long getTransactionVersionNumber() {
    return transactionVersionNumber;
  }

  public void setTransactionVersionNumber(Long transactionVersionNumber) {
    this.transactionVersionNumber = transactionVersionNumber;
  }

  public JVresponseLineGroupEntity transactionVersionNumber(Long transactionVersionNumber) {
    this.transactionVersionNumber = transactionVersionNumber;
    return this;
  }

 /**
   * Get transactionLineGroupNumber
   * @return transactionLineGroupNumber
  **/
  @JsonProperty("transactionLineGroupNumber")
  public Long getTransactionLineGroupNumber() {
    return transactionLineGroupNumber;
  }

  public void setTransactionLineGroupNumber(Long transactionLineGroupNumber) {
    this.transactionLineGroupNumber = transactionLineGroupNumber;
  }

  public JVresponseLineGroupEntity transactionLineGroupNumber(Long transactionLineGroupNumber) {
    this.transactionLineGroupNumber = transactionLineGroupNumber;
    return this;
  }

 /**
   * Get transactionActionCode
   * @return transactionActionCode
  **/
  @JsonProperty("transactionActionCode")
  public Long getTransactionActionCode() {
    return transactionActionCode;
  }

  public void setTransactionActionCode(Long transactionActionCode) {
    this.transactionActionCode = transactionActionCode;
  }

  public JVresponseLineGroupEntity transactionActionCode(Long transactionActionCode) {
    this.transactionActionCode = transactionActionCode;
    return this;
  }

 /**
   * Get transactionSubActionCode
   * @return transactionSubActionCode
  **/
  @JsonProperty("transactionSubActionCode")
  public Long getTransactionSubActionCode() {
    return transactionSubActionCode;
  }

  public void setTransactionSubActionCode(Long transactionSubActionCode) {
    this.transactionSubActionCode = transactionSubActionCode;
  }

  public JVresponseLineGroupEntity transactionSubActionCode(Long transactionSubActionCode) {
    this.transactionSubActionCode = transactionSubActionCode;
    return this;
  }

 /**
   * Get transactionCreationDate
   * @return transactionCreationDate
  **/
  @JsonProperty("transactionCreationDate")
  public Date getTransactionCreationDate() {
    return transactionCreationDate;
  }

  public void setTransactionCreationDate(Date transactionCreationDate) {
    this.transactionCreationDate = transactionCreationDate;
  }

  public JVresponseLineGroupEntity transactionCreationDate(Date transactionCreationDate) {
    this.transactionCreationDate = transactionCreationDate;
    return this;
  }

 /**
   * Get transactionCreationUserID
   * @return transactionCreationUserID
  **/
  @JsonProperty("transactionCreationUserID")
  public String getTransactionCreationUserID() {
    return transactionCreationUserID;
  }

  public void setTransactionCreationUserID(String transactionCreationUserID) {
    this.transactionCreationUserID = transactionCreationUserID;
  }

  public JVresponseLineGroupEntity transactionCreationUserID(String transactionCreationUserID) {
    this.transactionCreationUserID = transactionCreationUserID;
    return this;
  }

 /**
   * Get transactionFunctionCode
   * @return transactionFunctionCode
  **/
  @JsonProperty("transactionFunctionCode")
 @Size(max=1)  public String getTransactionFunctionCode() {
    return transactionFunctionCode;
  }

  public void setTransactionFunctionCode(String transactionFunctionCode) {
    this.transactionFunctionCode = transactionFunctionCode;
  }

  public JVresponseLineGroupEntity transactionFunctionCode(String transactionFunctionCode) {
    this.transactionFunctionCode = transactionFunctionCode;
    return this;
  }

 /**
   * Get transactionSubFunctionCode
   * @return transactionSubFunctionCode
  **/
  @JsonProperty("transactionSubFunctionCode")
  public Long getTransactionSubFunctionCode() {
    return transactionSubFunctionCode;
  }

  public void setTransactionSubFunctionCode(Long transactionSubFunctionCode) {
    this.transactionSubFunctionCode = transactionSubFunctionCode;
  }

  public JVresponseLineGroupEntity transactionSubFunctionCode(Long transactionSubFunctionCode) {
    this.transactionSubFunctionCode = transactionSubFunctionCode;
    return this;
  }

 /**
   * Get transactionLastDate
   * @return transactionLastDate
  **/
  @JsonProperty("transactionLastDate")
  public Date getTransactionLastDate() {
    return transactionLastDate;
  }

  public void setTransactionLastDate(Date transactionLastDate) {
    this.transactionLastDate = transactionLastDate;
  }

  public JVresponseLineGroupEntity transactionLastDate(Date transactionLastDate) {
    this.transactionLastDate = transactionLastDate;
    return this;
  }

 /**
   * Get transactionLastUserID
   * @return transactionLastUserID
  **/
  @JsonProperty("transactionLastUserID")
  public String getTransactionLastUserID() {
    return transactionLastUserID;
  }

  public void setTransactionLastUserID(String transactionLastUserID) {
    this.transactionLastUserID = transactionLastUserID;
  }

  public JVresponseLineGroupEntity transactionLastUserID(String transactionLastUserID) {
    this.transactionLastUserID = transactionLastUserID;
    return this;
  }

 /**
   * Get transactionPhaseCode
   * @return transactionPhaseCode
  **/
  @JsonProperty("transactionPhaseCode")
 @Size(max=1)  public String getTransactionPhaseCode() {
    return transactionPhaseCode;
  }

  public void setTransactionPhaseCode(String transactionPhaseCode) {
    this.transactionPhaseCode = transactionPhaseCode;
  }

  public JVresponseLineGroupEntity transactionPhaseCode(String transactionPhaseCode) {
    this.transactionPhaseCode = transactionPhaseCode;
    return this;
  }

 /**
   * Get transactionPreviousVersionNumber
   * @return transactionPreviousVersionNumber
  **/
  @JsonProperty("transactionPreviousVersionNumber")
  public Long getTransactionPreviousVersionNumber() {
    return transactionPreviousVersionNumber;
  }

  public void setTransactionPreviousVersionNumber(Long transactionPreviousVersionNumber) {
    this.transactionPreviousVersionNumber = transactionPreviousVersionNumber;
  }

  public JVresponseLineGroupEntity transactionPreviousVersionNumber(Long transactionPreviousVersionNumber) {
    this.transactionPreviousVersionNumber = transactionPreviousVersionNumber;
    return this;
  }

 /**
   * Get transactionUnit
   * @return transactionUnit
  **/
  @JsonProperty("transactionUnit")
  public String getTransactionUnit() {
    return transactionUnit;
  }

  public void setTransactionUnit(String transactionUnit) {
    this.transactionUnit = transactionUnit;
  }

  public JVresponseLineGroupEntity transactionUnit(String transactionUnit) {
    this.transactionUnit = transactionUnit;
    return this;
  }

 /**
   * Get objectAttachmentPrimaryGroupUniqueIdentifier
   * @return objectAttachmentPrimaryGroupUniqueIdentifier
  **/
  @JsonProperty("objectAttachmentPrimaryGroupUniqueIdentifier")
  public String getObjectAttachmentPrimaryGroupUniqueIdentifier() {
    return objectAttachmentPrimaryGroupUniqueIdentifier;
  }

  public void setObjectAttachmentPrimaryGroupUniqueIdentifier(String objectAttachmentPrimaryGroupUniqueIdentifier) {
    this.objectAttachmentPrimaryGroupUniqueIdentifier = objectAttachmentPrimaryGroupUniqueIdentifier;
  }

  public JVresponseLineGroupEntity objectAttachmentPrimaryGroupUniqueIdentifier(String objectAttachmentPrimaryGroupUniqueIdentifier) {
    this.objectAttachmentPrimaryGroupUniqueIdentifier = objectAttachmentPrimaryGroupUniqueIdentifier;
    return this;
  }

 /**
   * Get objectAttachmentSecondaryGroupTotal
   * @return objectAttachmentSecondaryGroupTotal
  **/
  @JsonProperty("objectAttachmentSecondaryGroupTotal")
  public String getObjectAttachmentSecondaryGroupTotal() {
    return objectAttachmentSecondaryGroupTotal;
  }

  public void setObjectAttachmentSecondaryGroupTotal(String objectAttachmentSecondaryGroupTotal) {
    this.objectAttachmentSecondaryGroupTotal = objectAttachmentSecondaryGroupTotal;
  }

  public JVresponseLineGroupEntity objectAttachmentSecondaryGroupTotal(String objectAttachmentSecondaryGroupTotal) {
    this.objectAttachmentSecondaryGroupTotal = objectAttachmentSecondaryGroupTotal;
    return this;
  }

 /**
   * Get objectAttachmentSecondaryUniqueIdentifier
   * @return objectAttachmentSecondaryUniqueIdentifier
  **/
  @JsonProperty("objectAttachmentSecondaryUniqueIdentifier")
  public Long getObjectAttachmentSecondaryUniqueIdentifier() {
    return objectAttachmentSecondaryUniqueIdentifier;
  }

  public void setObjectAttachmentSecondaryUniqueIdentifier(Long objectAttachmentSecondaryUniqueIdentifier) {
    this.objectAttachmentSecondaryUniqueIdentifier = objectAttachmentSecondaryUniqueIdentifier;
  }

  public JVresponseLineGroupEntity objectAttachmentSecondaryUniqueIdentifier(Long objectAttachmentSecondaryUniqueIdentifier) {
    this.objectAttachmentSecondaryUniqueIdentifier = objectAttachmentSecondaryUniqueIdentifier;
    return this;
  }

 /**
   * Get recordDate
   * @return recordDate
  **/
  @JsonProperty("recordDate")
  public LocalDate getRecordDate() {
    return recordDate;
  }

  public void setRecordDate(LocalDate recordDate) {
    this.recordDate = recordDate;
  }

  public JVresponseLineGroupEntity recordDate(LocalDate recordDate) {
    this.recordDate = recordDate;
    return this;
  }

 /**
   * Get budgetFY
   * @return budgetFY
  **/
  @JsonProperty("budgetFY")
  public Long getBudgetFY() {
    return budgetFY;
  }

  public void setBudgetFY(Long budgetFY) {
    this.budgetFY = budgetFY;
  }

  public JVresponseLineGroupEntity budgetFY(Long budgetFY) {
    this.budgetFY = budgetFY;
    return this;
  }

 /**
   * Get fiscalYear
   * @return fiscalYear
  **/
  @JsonProperty("fiscalYear")
  public Long getFiscalYear() {
    return fiscalYear;
  }

  public void setFiscalYear(Long fiscalYear) {
    this.fiscalYear = fiscalYear;
  }

  public JVresponseLineGroupEntity fiscalYear(Long fiscalYear) {
    this.fiscalYear = fiscalYear;
    return this;
  }

 /**
   * Get fiscalPeriod
   * @return fiscalPeriod
  **/
  @JsonProperty("fiscalPeriod")
 @Size(max=1)  public String getFiscalPeriod() {
    return fiscalPeriod;
  }

  public void setFiscalPeriod(String fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
  }

  public JVresponseLineGroupEntity fiscalPeriod(String fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
    return this;
  }

 /**
   * Get fiscalQuarter
   * @return fiscalQuarter
  **/
  @JsonProperty("fiscalQuarter")
  public Integer getFiscalQuarter() {
    return fiscalQuarter;
  }

  public void setFiscalQuarter(Integer fiscalQuarter) {
    this.fiscalQuarter = fiscalQuarter;
  }

  public JVresponseLineGroupEntity fiscalQuarter(Integer fiscalQuarter) {
    this.fiscalQuarter = fiscalQuarter;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JVresponseLineGroupEntity description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get budgetControlReduction
   * @return budgetControlReduction
  **/
  @JsonProperty("budgetControlReduction")
  public Boolean isBudgetControlReduction() {
    return budgetControlReduction;
  }

  public void setBudgetControlReduction(Boolean budgetControlReduction) {
    this.budgetControlReduction = budgetControlReduction;
  }

  public JVresponseLineGroupEntity budgetControlReduction(Boolean budgetControlReduction) {
    this.budgetControlReduction = budgetControlReduction;
    return this;
  }

 /**
   * Get fundBalanceControlReduction
   * @return fundBalanceControlReduction
  **/
  @JsonProperty("fundBalanceControlReduction")
  public Boolean isFundBalanceControlReduction() {
    return fundBalanceControlReduction;
  }

  public void setFundBalanceControlReduction(Boolean fundBalanceControlReduction) {
    this.fundBalanceControlReduction = fundBalanceControlReduction;
  }

  public JVresponseLineGroupEntity fundBalanceControlReduction(Boolean fundBalanceControlReduction) {
    this.fundBalanceControlReduction = fundBalanceControlReduction;
    return this;
  }

 /**
   * Get cashBalanceControlReduction
   * @return cashBalanceControlReduction
  **/
  @JsonProperty("cashBalanceControlReduction")
  public Boolean isCashBalanceControlReduction() {
    return cashBalanceControlReduction;
  }

  public void setCashBalanceControlReduction(Boolean cashBalanceControlReduction) {
    this.cashBalanceControlReduction = cashBalanceControlReduction;
  }

  public JVresponseLineGroupEntity cashBalanceControlReduction(Boolean cashBalanceControlReduction) {
    this.cashBalanceControlReduction = cashBalanceControlReduction;
    return this;
  }

 /**
   * Get eventType
   * @return eventType
  **/
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public JVresponseLineGroupEntity eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

 /**
   * Get postingPair
   * @return postingPair
  **/
  @JsonProperty("postingPair")
 @Size(max=1)  public String getPostingPair() {
    return postingPair;
  }

  public void setPostingPair(String postingPair) {
    this.postingPair = postingPair;
  }

  public JVresponseLineGroupEntity postingPair(String postingPair) {
    this.postingPair = postingPair;
    return this;
  }

 /**
   * Get referenceType
   * @return referenceType
  **/
  @JsonProperty("referenceType")
  public Long getReferenceType() {
    return referenceType;
  }

  public void setReferenceType(Long referenceType) {
    this.referenceType = referenceType;
  }

  public JVresponseLineGroupEntity referenceType(Long referenceType) {
    this.referenceType = referenceType;
    return this;
  }

 /**
   * Get referencedLineOpenAmount
   * @return referencedLineOpenAmount
  **/
  @JsonProperty("referencedLineOpenAmount")
  public Integer getReferencedLineOpenAmount() {
    return referencedLineOpenAmount;
  }

  public void setReferencedLineOpenAmount(Integer referencedLineOpenAmount) {
    this.referencedLineOpenAmount = referencedLineOpenAmount;
  }

  public JVresponseLineGroupEntity referencedLineOpenAmount(Integer referencedLineOpenAmount) {
    this.referencedLineOpenAmount = referencedLineOpenAmount;
    return this;
  }

 /**
   * Get referencedTransactionCategory
   * @return referencedTransactionCategory
  **/
  @JsonProperty("referencedTransactionCategory")
  public String getReferencedTransactionCategory() {
    return referencedTransactionCategory;
  }

  public void setReferencedTransactionCategory(String referencedTransactionCategory) {
    this.referencedTransactionCategory = referencedTransactionCategory;
  }

  public JVresponseLineGroupEntity referencedTransactionCategory(String referencedTransactionCategory) {
    this.referencedTransactionCategory = referencedTransactionCategory;
    return this;
  }

 /**
   * Get referencedTransactionType
   * @return referencedTransactionType
  **/
  @JsonProperty("referencedTransactionType")
  public String getReferencedTransactionType() {
    return referencedTransactionType;
  }

  public void setReferencedTransactionType(String referencedTransactionType) {
    this.referencedTransactionType = referencedTransactionType;
  }

  public JVresponseLineGroupEntity referencedTransactionType(String referencedTransactionType) {
    this.referencedTransactionType = referencedTransactionType;
    return this;
  }

 /**
   * Get referencedTransactionCode
   * @return referencedTransactionCode
  **/
  @JsonProperty("referencedTransactionCode")
  public String getReferencedTransactionCode() {
    return referencedTransactionCode;
  }

  public void setReferencedTransactionCode(String referencedTransactionCode) {
    this.referencedTransactionCode = referencedTransactionCode;
  }

  public JVresponseLineGroupEntity referencedTransactionCode(String referencedTransactionCode) {
    this.referencedTransactionCode = referencedTransactionCode;
    return this;
  }

 /**
   * Get referencedTransactionDepartment
   * @return referencedTransactionDepartment
  **/
  @JsonProperty("referencedTransactionDepartment")
  public String getReferencedTransactionDepartment() {
    return referencedTransactionDepartment;
  }

  public void setReferencedTransactionDepartment(String referencedTransactionDepartment) {
    this.referencedTransactionDepartment = referencedTransactionDepartment;
  }

  public JVresponseLineGroupEntity referencedTransactionDepartment(String referencedTransactionDepartment) {
    this.referencedTransactionDepartment = referencedTransactionDepartment;
    return this;
  }

 /**
   * Get referencedTransactionID
   * @return referencedTransactionID
  **/
  @JsonProperty("referencedTransactionID")
  public String getReferencedTransactionID() {
    return referencedTransactionID;
  }

  public void setReferencedTransactionID(String referencedTransactionID) {
    this.referencedTransactionID = referencedTransactionID;
  }

  public JVresponseLineGroupEntity referencedTransactionID(String referencedTransactionID) {
    this.referencedTransactionID = referencedTransactionID;
    return this;
  }

 /**
   * Get referencedTransactionVersion
   * @return referencedTransactionVersion
  **/
  @JsonProperty("referencedTransactionVersion")
  public Long getReferencedTransactionVersion() {
    return referencedTransactionVersion;
  }

  public void setReferencedTransactionVersion(Long referencedTransactionVersion) {
    this.referencedTransactionVersion = referencedTransactionVersion;
  }

  public JVresponseLineGroupEntity referencedTransactionVersion(Long referencedTransactionVersion) {
    this.referencedTransactionVersion = referencedTransactionVersion;
    return this;
  }

 /**
   * Get referencedVendorLine
   * @return referencedVendorLine
  **/
  @JsonProperty("referencedVendorLine")
  public Integer getReferencedVendorLine() {
    return referencedVendorLine;
  }

  public void setReferencedVendorLine(Integer referencedVendorLine) {
    this.referencedVendorLine = referencedVendorLine;
  }

  public JVresponseLineGroupEntity referencedVendorLine(Integer referencedVendorLine) {
    this.referencedVendorLine = referencedVendorLine;
    return this;
  }

 /**
   * Get referencedCommodityLine
   * @return referencedCommodityLine
  **/
  @JsonProperty("referencedCommodityLine")
  public Long getReferencedCommodityLine() {
    return referencedCommodityLine;
  }

  public void setReferencedCommodityLine(Long referencedCommodityLine) {
    this.referencedCommodityLine = referencedCommodityLine;
  }

  public JVresponseLineGroupEntity referencedCommodityLine(Long referencedCommodityLine) {
    this.referencedCommodityLine = referencedCommodityLine;
    return this;
  }

 /**
   * Get referencedAccountingLine
   * @return referencedAccountingLine
  **/
  @JsonProperty("referencedAccountingLine")
  public Long getReferencedAccountingLine() {
    return referencedAccountingLine;
  }

  public void setReferencedAccountingLine(Long referencedAccountingLine) {
    this.referencedAccountingLine = referencedAccountingLine;
  }

  public JVresponseLineGroupEntity referencedAccountingLine(Long referencedAccountingLine) {
    this.referencedAccountingLine = referencedAccountingLine;
    return this;
  }

 /**
   * Get refAmendment
   * @return refAmendment
  **/
  @JsonProperty("refAmendment")
  public Long getRefAmendment() {
    return refAmendment;
  }

  public void setRefAmendment(Long refAmendment) {
    this.refAmendment = refAmendment;
  }

  public JVresponseLineGroupEntity refAmendment(Long refAmendment) {
    this.refAmendment = refAmendment;
    return this;
  }

 /**
   * Get vendorCustomer
   * @return vendorCustomer
  **/
  @JsonProperty("vendorCustomer")
  public String getVendorCustomer() {
    return vendorCustomer;
  }

  public void setVendorCustomer(String vendorCustomer) {
    this.vendorCustomer = vendorCustomer;
  }

  public JVresponseLineGroupEntity vendorCustomer(String vendorCustomer) {
    this.vendorCustomer = vendorCustomer;
    return this;
  }

 /**
   * Get legalName
   * @return legalName
  **/
  @JsonProperty("legalName")
  public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  public JVresponseLineGroupEntity legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

 /**
   * Get aliasOrDBA
   * @return aliasOrDBA
  **/
  @JsonProperty("aliasOrDBA")
  public String getAliasOrDBA() {
    return aliasOrDBA;
  }

  public void setAliasOrDBA(String aliasOrDBA) {
    this.aliasOrDBA = aliasOrDBA;
  }

  public JVresponseLineGroupEntity aliasOrDBA(String aliasOrDBA) {
    this.aliasOrDBA = aliasOrDBA;
    return this;
  }

 /**
   * Get addressLine1
   * @return addressLine1
  **/
  @JsonProperty("addressLine1")
 @Size(max=100)  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public JVresponseLineGroupEntity addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

 /**
   * Get addressLine2
   * @return addressLine2
  **/
  @JsonProperty("addressLine2")
 @Size(max=100)  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public JVresponseLineGroupEntity addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

 /**
   * Get city
   * @return city
  **/
  @JsonProperty("city")
 @Size(max=60)  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public JVresponseLineGroupEntity city(String city) {
    this.city = city;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
 @Size(max=2)  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public JVresponseLineGroupEntity state(String state) {
    this.state = state;
    return this;
  }

 /**
   * Get zip
   * @return zip
  **/
  @JsonProperty("zip")
 @Size(max=10)  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public JVresponseLineGroupEntity zip(String zip) {
    this.zip = zip;
    return this;
  }

 /**
   * Get country
   * @return country
  **/
  @JsonProperty("country")
 @Size(max=3)  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public JVresponseLineGroupEntity country(String country) {
    this.country = country;
    return this;
  }

 /**
   * Get vendorContactPhone
   * @return vendorContactPhone
  **/
  @JsonProperty("vendorContactPhone")
 @Size(max=12)  public String getVendorContactPhone() {
    return vendorContactPhone;
  }

  public void setVendorContactPhone(String vendorContactPhone) {
    this.vendorContactPhone = vendorContactPhone;
  }

  public JVresponseLineGroupEntity vendorContactPhone(String vendorContactPhone) {
    this.vendorContactPhone = vendorContactPhone;
    return this;
  }

 /**
   * Get vendorContactPhoneExtension
   * @return vendorContactPhoneExtension
  **/
  @JsonProperty("vendorContactPhoneExtension")
  public String getVendorContactPhoneExtension() {
    return vendorContactPhoneExtension;
  }

  public void setVendorContactPhoneExtension(String vendorContactPhoneExtension) {
    this.vendorContactPhoneExtension = vendorContactPhoneExtension;
  }

  public JVresponseLineGroupEntity vendorContactPhoneExtension(String vendorContactPhoneExtension) {
    this.vendorContactPhoneExtension = vendorContactPhoneExtension;
    return this;
  }

 /**
   * Get fax
   * @return fax
  **/
  @JsonProperty("fax")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public JVresponseLineGroupEntity fax(String fax) {
    this.fax = fax;
    return this;
  }

 /**
   * Get faxExtension
   * @return faxExtension
  **/
  @JsonProperty("faxExtension")
  public String getFaxExtension() {
    return faxExtension;
  }

  public void setFaxExtension(String faxExtension) {
    this.faxExtension = faxExtension;
  }

  public JVresponseLineGroupEntity faxExtension(String faxExtension) {
    this.faxExtension = faxExtension;
    return this;
  }

 /**
   * Get vendorContactEmail
   * @return vendorContactEmail
  **/
  @JsonProperty("vendorContactEmail")
 @Size(max=100)  public String getVendorContactEmail() {
    return vendorContactEmail;
  }

  public void setVendorContactEmail(String vendorContactEmail) {
    this.vendorContactEmail = vendorContactEmail;
  }

  public JVresponseLineGroupEntity vendorContactEmail(String vendorContactEmail) {
    this.vendorContactEmail = vendorContactEmail;
    return this;
  }

 /**
   * Get webAddress
   * @return webAddress
  **/
  @JsonProperty("webAddress")
  public String getWebAddress() {
    return webAddress;
  }

  public void setWebAddress(String webAddress) {
    this.webAddress = webAddress;
  }

  public JVresponseLineGroupEntity webAddress(String webAddress) {
    this.webAddress = webAddress;
    return this;
  }

 /**
   * Get vendorContactName
   * @return vendorContactName
  **/
  @JsonProperty("vendorContactName")
  public String getVendorContactName() {
    return vendorContactName;
  }

  public void setVendorContactName(String vendorContactName) {
    this.vendorContactName = vendorContactName;
  }

  public JVresponseLineGroupEntity vendorContactName(String vendorContactName) {
    this.vendorContactName = vendorContactName;
    return this;
  }

 /**
   * Get miscAccount
   * @return miscAccount
  **/
  @JsonProperty("miscAccount")
  public Boolean isMiscAccount() {
    return miscAccount;
  }

  public void setMiscAccount(Boolean miscAccount) {
    this.miscAccount = miscAccount;
  }

  public JVresponseLineGroupEntity miscAccount(Boolean miscAccount) {
    this.miscAccount = miscAccount;
    return this;
  }

 /**
   * Get debitTotal
   * @return debitTotal
  **/
  @JsonProperty("debitTotal")
  public Integer getDebitTotal() {
    return debitTotal;
  }

  public void setDebitTotal(Integer debitTotal) {
    this.debitTotal = debitTotal;
  }

  public JVresponseLineGroupEntity debitTotal(Integer debitTotal) {
    this.debitTotal = debitTotal;
    return this;
  }

 /**
   * Get creditTotal
   * @return creditTotal
  **/
  @JsonProperty("creditTotal")
  public Integer getCreditTotal() {
    return creditTotal;
  }

  public void setCreditTotal(Integer creditTotal) {
    this.creditTotal = creditTotal;
  }

  public JVresponseLineGroupEntity creditTotal(Integer creditTotal) {
    this.creditTotal = creditTotal;
    return this;
  }

 /**
   * Get lineGroupDescription
   * @return lineGroupDescription
  **/
  @JsonProperty("lineGroupDescription")
  public String getLineGroupDescription() {
    return lineGroupDescription;
  }

  public void setLineGroupDescription(String lineGroupDescription) {
    this.lineGroupDescription = lineGroupDescription;
  }

  public JVresponseLineGroupEntity lineGroupDescription(String lineGroupDescription) {
    this.lineGroupDescription = lineGroupDescription;
    return this;
  }

 /**
   * Get performanceUnits
   * @return performanceUnits
  **/
  @JsonProperty("performanceUnits")
  public Integer getPerformanceUnits() {
    return performanceUnits;
  }

  public void setPerformanceUnits(Integer performanceUnits) {
    this.performanceUnits = performanceUnits;
  }

  public JVresponseLineGroupEntity performanceUnits(Integer performanceUnits) {
    this.performanceUnits = performanceUnits;
    return this;
  }

 /**
   * Get unitOfMeasure
   * @return unitOfMeasure
  **/
  @JsonProperty("unitOfMeasure")
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public JVresponseLineGroupEntity unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

 /**
   * Get transactionLineGroupLineNumber
   * @return transactionLineGroupLineNumber
  **/
  @JsonProperty("transactionLineGroupLineNumber")
  public Long getTransactionLineGroupLineNumber() {
    return transactionLineGroupLineNumber;
  }

  public void setTransactionLineGroupLineNumber(Long transactionLineGroupLineNumber) {
    this.transactionLineGroupLineNumber = transactionLineGroupLineNumber;
  }

  public JVresponseLineGroupEntity transactionLineGroupLineNumber(Long transactionLineGroupLineNumber) {
    this.transactionLineGroupLineNumber = transactionLineGroupLineNumber;
    return this;
  }

 /**
   * Get transactionChildMaximumLineNumber
   * @return transactionChildMaximumLineNumber
  **/
  @JsonProperty("transactionChildMaximumLineNumber")
  public Long getTransactionChildMaximumLineNumber() {
    return transactionChildMaximumLineNumber;
  }

  public void setTransactionChildMaximumLineNumber(Long transactionChildMaximumLineNumber) {
    this.transactionChildMaximumLineNumber = transactionChildMaximumLineNumber;
  }

  public JVresponseLineGroupEntity transactionChildMaximumLineNumber(Long transactionChildMaximumLineNumber) {
    this.transactionChildMaximumLineNumber = transactionChildMaximumLineNumber;
    return this;
  }

 /**
   * Get amsRowVersionNumber
   * @return amsRowVersionNumber
  **/
  @JsonProperty("amsRowVersionNumber")
  public Long getAmsRowVersionNumber() {
    return amsRowVersionNumber;
  }

  public void setAmsRowVersionNumber(Long amsRowVersionNumber) {
    this.amsRowVersionNumber = amsRowVersionNumber;
  }

  public JVresponseLineGroupEntity amsRowVersionNumber(Long amsRowVersionNumber) {
    this.amsRowVersionNumber = amsRowVersionNumber;
    return this;
  }

 /**
   * Get lineGroup
   * @return lineGroup
  **/
  @JsonProperty("lineGroup")
  public Long getLineGroup() {
    return lineGroup;
  }

  public void setLineGroup(Long lineGroup) {
    this.lineGroup = lineGroup;
  }

  public JVresponseLineGroupEntity lineGroup(Long lineGroup) {
    this.lineGroup = lineGroup;
    return this;
  }

 /**
   * Get referenceType1
   * @return referenceType1
  **/
  @JsonProperty("referenceType1")
  public String getReferenceType1() {
    return referenceType1;
  }

  public void setReferenceType1(String referenceType1) {
    this.referenceType1 = referenceType1;
  }

  public JVresponseLineGroupEntity referenceType1(String referenceType1) {
    this.referenceType1 = referenceType1;
    return this;
  }

 /**
   * Get postingPairName
   * @return postingPairName
  **/
  @JsonProperty("postingPairName")
  public String getPostingPairName() {
    return postingPairName;
  }

  public void setPostingPairName(String postingPairName) {
    this.postingPairName = postingPairName;
  }

  public JVresponseLineGroupEntity postingPairName(String postingPairName) {
    this.postingPairName = postingPairName;
    return this;
  }

 /**
   * Get eventCategory
   * @return eventCategory
  **/
  @JsonProperty("eventCategory")
  public Integer getEventCategory() {
    return eventCategory;
  }

  public void setEventCategory(Integer eventCategory) {
    this.eventCategory = eventCategory;
  }

  public JVresponseLineGroupEntity eventCategory(Integer eventCategory) {
    this.eventCategory = eventCategory;
    return this;
  }

 /**
   * Get accountingLineCount
   * @return accountingLineCount
  **/
  @JsonProperty("accountingLineCount")
  public Long getAccountingLineCount() {
    return accountingLineCount;
  }

  public void setAccountingLineCount(Long accountingLineCount) {
    this.accountingLineCount = accountingLineCount;
  }

  public JVresponseLineGroupEntity accountingLineCount(Long accountingLineCount) {
    this.accountingLineCount = accountingLineCount;
    return this;
  }

 /**
   * Get accountingLinesCrossAppropriations
   * @return accountingLinesCrossAppropriations
  **/
  @JsonProperty("accountingLinesCrossAppropriations")
  public Boolean isAccountingLinesCrossAppropriations() {
    return accountingLinesCrossAppropriations;
  }

  public void setAccountingLinesCrossAppropriations(Boolean accountingLinesCrossAppropriations) {
    this.accountingLinesCrossAppropriations = accountingLinesCrossAppropriations;
  }

  public JVresponseLineGroupEntity accountingLinesCrossAppropriations(Boolean accountingLinesCrossAppropriations) {
    this.accountingLinesCrossAppropriations = accountingLinesCrossAppropriations;
    return this;
  }

 /**
   * Get fund
   * @return fund
  **/
  @JsonProperty("fund")
 @Size(max=4)  public String getFund() {
    return fund;
  }

  public void setFund(String fund) {
    this.fund = fund;
  }

  public JVresponseLineGroupEntity fund(String fund) {
    this.fund = fund;
    return this;
  }

 /**
   * Get subFund
   * @return subFund
  **/
  @JsonProperty("subFund")
 @Size(max=4)  public String getSubFund() {
    return subFund;
  }

  public void setSubFund(String subFund) {
    this.subFund = subFund;
  }

  public JVresponseLineGroupEntity subFund(String subFund) {
    this.subFund = subFund;
    return this;
  }

 /**
   * Get fundClass
   * @return fundClass
  **/
  @JsonProperty("fundClass")
  public String getFundClass() {
    return fundClass;
  }

  public void setFundClass(String fundClass) {
    this.fundClass = fundClass;
  }

  public JVresponseLineGroupEntity fundClass(String fundClass) {
    this.fundClass = fundClass;
    return this;
  }

 /**
   * Get fundCategory
   * @return fundCategory
  **/
  @JsonProperty("fundCategory")
  public String getFundCategory() {
    return fundCategory;
  }

  public void setFundCategory(String fundCategory) {
    this.fundCategory = fundCategory;
  }

  public JVresponseLineGroupEntity fundCategory(String fundCategory) {
    this.fundCategory = fundCategory;
    return this;
  }

 /**
   * Get fundType
   * @return fundType
  **/
  @JsonProperty("fundType")
  public String getFundType() {
    return fundType;
  }

  public void setFundType(String fundType) {
    this.fundType = fundType;
  }

  public JVresponseLineGroupEntity fundType(String fundType) {
    this.fundType = fundType;
    return this;
  }

 /**
   * Get fundGroup
   * @return fundGroup
  **/
  @JsonProperty("fundGroup")
  public String getFundGroup() {
    return fundGroup;
  }

  public void setFundGroup(String fundGroup) {
    this.fundGroup = fundGroup;
  }

  public JVresponseLineGroupEntity fundGroup(String fundGroup) {
    this.fundGroup = fundGroup;
    return this;
  }

 /**
   * Get cafrFundGroup
   * @return cafrFundGroup
  **/
  @JsonProperty("cafrFundGroup")
  public String getCafrFundGroup() {
    return cafrFundGroup;
  }

  public void setCafrFundGroup(String cafrFundGroup) {
    this.cafrFundGroup = cafrFundGroup;
  }

  public JVresponseLineGroupEntity cafrFundGroup(String cafrFundGroup) {
    this.cafrFundGroup = cafrFundGroup;
    return this;
  }

 /**
   * Get cafrFundType
   * @return cafrFundType
  **/
  @JsonProperty("cafrFundType")
  public String getCafrFundType() {
    return cafrFundType;
  }

  public void setCafrFundType(String cafrFundType) {
    this.cafrFundType = cafrFundType;
  }

  public JVresponseLineGroupEntity cafrFundType(String cafrFundType) {
    this.cafrFundType = cafrFundType;
    return this;
  }

 /**
   * Get department
   * @return department
  **/
  @JsonProperty("department")
 @Size(max=4)  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public JVresponseLineGroupEntity department(String department) {
    this.department = department;
    return this;
  }

 /**
   * Get unit
   * @return unit
  **/
  @JsonProperty("unit")
 @Size(max=4)  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public JVresponseLineGroupEntity unit(String unit) {
    this.unit = unit;
    return this;
  }

 /**
   * Get subUnit
   * @return subUnit
  **/
  @JsonProperty("subUnit")
 @Size(max=4)  public String getSubUnit() {
    return subUnit;
  }

  public void setSubUnit(String subUnit) {
    this.subUnit = subUnit;
  }

  public JVresponseLineGroupEntity subUnit(String subUnit) {
    this.subUnit = subUnit;
    return this;
  }

 /**
   * Get apprUnit
   * @return apprUnit
  **/
  @JsonProperty("apprUnit")
 @Size(max=9)  public String getApprUnit() {
    return apprUnit;
  }

  public void setApprUnit(String apprUnit) {
    this.apprUnit = apprUnit;
  }

  public JVresponseLineGroupEntity apprUnit(String apprUnit) {
    this.apprUnit = apprUnit;
    return this;
  }

 /**
   * Get apprClass
   * @return apprClass
  **/
  @JsonProperty("apprClass")
  public String getApprClass() {
    return apprClass;
  }

  public void setApprClass(String apprClass) {
    this.apprClass = apprClass;
  }

  public JVresponseLineGroupEntity apprClass(String apprClass) {
    this.apprClass = apprClass;
    return this;
  }

 /**
   * Get apprCategory
   * @return apprCategory
  **/
  @JsonProperty("apprCategory")
  public String getApprCategory() {
    return apprCategory;
  }

  public void setApprCategory(String apprCategory) {
    this.apprCategory = apprCategory;
  }

  public JVresponseLineGroupEntity apprCategory(String apprCategory) {
    this.apprCategory = apprCategory;
    return this;
  }

 /**
   * Get apprType
   * @return apprType
  **/
  @JsonProperty("apprType")
  public String getApprType() {
    return apprType;
  }

  public void setApprType(String apprType) {
    this.apprType = apprType;
  }

  public JVresponseLineGroupEntity apprType(String apprType) {
    this.apprType = apprType;
    return this;
  }

 /**
   * Get apprGroup
   * @return apprGroup
  **/
  @JsonProperty("apprGroup")
  public String getApprGroup() {
    return apprGroup;
  }

  public void setApprGroup(String apprGroup) {
    this.apprGroup = apprGroup;
  }

  public JVresponseLineGroupEntity apprGroup(String apprGroup) {
    this.apprGroup = apprGroup;
    return this;
  }

 /**
   * Get location
   * @return location
  **/
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public JVresponseLineGroupEntity location(String location) {
    this.location = location;
    return this;
  }

 /**
   * Get subLocation
   * @return subLocation
  **/
  @JsonProperty("subLocation")
  public String getSubLocation() {
    return subLocation;
  }

  public void setSubLocation(String subLocation) {
    this.subLocation = subLocation;
  }

  public JVresponseLineGroupEntity subLocation(String subLocation) {
    this.subLocation = subLocation;
    return this;
  }

 /**
   * Get locationClass
   * @return locationClass
  **/
  @JsonProperty("locationClass")
  public String getLocationClass() {
    return locationClass;
  }

  public void setLocationClass(String locationClass) {
    this.locationClass = locationClass;
  }

  public JVresponseLineGroupEntity locationClass(String locationClass) {
    this.locationClass = locationClass;
    return this;
  }

 /**
   * Get locationCategory
   * @return locationCategory
  **/
  @JsonProperty("locationCategory")
  public String getLocationCategory() {
    return locationCategory;
  }

  public void setLocationCategory(String locationCategory) {
    this.locationCategory = locationCategory;
  }

  public JVresponseLineGroupEntity locationCategory(String locationCategory) {
    this.locationCategory = locationCategory;
    return this;
  }

 /**
   * Get locationType
   * @return locationType
  **/
  @JsonProperty("locationType")
  public String getLocationType() {
    return locationType;
  }

  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }

  public JVresponseLineGroupEntity locationType(String locationType) {
    this.locationType = locationType;
    return this;
  }

 /**
   * Get county1
   * @return county1
  **/
  @JsonProperty("county1")
  public String getCounty1() {
    return county1;
  }

  public void setCounty1(String county1) {
    this.county1 = county1;
  }

  public JVresponseLineGroupEntity county1(String county1) {
    this.county1 = county1;
    return this;
  }

 /**
   * Get activity
   * @return activity
  **/
  @JsonProperty("activity")
  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }

  public JVresponseLineGroupEntity activity(String activity) {
    this.activity = activity;
    return this;
  }

 /**
   * Get subActivity
   * @return subActivity
  **/
  @JsonProperty("subActivity")
  public String getSubActivity() {
    return subActivity;
  }

  public void setSubActivity(String subActivity) {
    this.subActivity = subActivity;
  }

  public JVresponseLineGroupEntity subActivity(String subActivity) {
    this.subActivity = subActivity;
    return this;
  }

 /**
   * Get activityClass
   * @return activityClass
  **/
  @JsonProperty("activityClass")
  public String getActivityClass() {
    return activityClass;
  }

  public void setActivityClass(String activityClass) {
    this.activityClass = activityClass;
  }

  public JVresponseLineGroupEntity activityClass(String activityClass) {
    this.activityClass = activityClass;
    return this;
  }

 /**
   * Get activityCategory
   * @return activityCategory
  **/
  @JsonProperty("activityCategory")
  public String getActivityCategory() {
    return activityCategory;
  }

  public void setActivityCategory(String activityCategory) {
    this.activityCategory = activityCategory;
  }

  public JVresponseLineGroupEntity activityCategory(String activityCategory) {
    this.activityCategory = activityCategory;
    return this;
  }

 /**
   * Get activityType
   * @return activityType
  **/
  @JsonProperty("activityType")
  public String getActivityType() {
    return activityType;
  }

  public void setActivityType(String activityType) {
    this.activityType = activityType;
  }

  public JVresponseLineGroupEntity activityType(String activityType) {
    this.activityType = activityType;
    return this;
  }

 /**
   * Get activityGroup
   * @return activityGroup
  **/
  @JsonProperty("activityGroup")
  public String getActivityGroup() {
    return activityGroup;
  }

  public void setActivityGroup(String activityGroup) {
    this.activityGroup = activityGroup;
  }

  public JVresponseLineGroupEntity activityGroup(String activityGroup) {
    this.activityGroup = activityGroup;
    return this;
  }

 /**
   * Get cafrActivityUnit
   * @return cafrActivityUnit
  **/
  @JsonProperty("cafrActivityUnit")
  public String getCafrActivityUnit() {
    return cafrActivityUnit;
  }

  public void setCafrActivityUnit(String cafrActivityUnit) {
    this.cafrActivityUnit = cafrActivityUnit;
  }

  public JVresponseLineGroupEntity cafrActivityUnit(String cafrActivityUnit) {
    this.cafrActivityUnit = cafrActivityUnit;
    return this;
  }

 /**
   * Get majorCAFRActivityType
   * @return majorCAFRActivityType
  **/
  @JsonProperty("majorCAFRActivityType")
  public String getMajorCAFRActivityType() {
    return majorCAFRActivityType;
  }

  public void setMajorCAFRActivityType(String majorCAFRActivityType) {
    this.majorCAFRActivityType = majorCAFRActivityType;
  }

  public JVresponseLineGroupEntity majorCAFRActivityType(String majorCAFRActivityType) {
    this.majorCAFRActivityType = majorCAFRActivityType;
    return this;
  }

 /**
   * Get minorCAFRActivityType
   * @return minorCAFRActivityType
  **/
  @JsonProperty("minorCAFRActivityType")
  public String getMinorCAFRActivityType() {
    return minorCAFRActivityType;
  }

  public void setMinorCAFRActivityType(String minorCAFRActivityType) {
    this.minorCAFRActivityType = minorCAFRActivityType;
  }

  public JVresponseLineGroupEntity minorCAFRActivityType(String minorCAFRActivityType) {
    this.minorCAFRActivityType = minorCAFRActivityType;
    return this;
  }

 /**
   * Get function
   * @return function
  **/
  @JsonProperty("function")
  public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }

  public JVresponseLineGroupEntity function(String function) {
    this.function = function;
    return this;
  }

 /**
   * Get subFunction
   * @return subFunction
  **/
  @JsonProperty("subFunction")
  public String getSubFunction() {
    return subFunction;
  }

  public void setSubFunction(String subFunction) {
    this.subFunction = subFunction;
  }

  public JVresponseLineGroupEntity subFunction(String subFunction) {
    this.subFunction = subFunction;
    return this;
  }

 /**
   * Get functionClass
   * @return functionClass
  **/
  @JsonProperty("functionClass")
  public String getFunctionClass() {
    return functionClass;
  }

  public void setFunctionClass(String functionClass) {
    this.functionClass = functionClass;
  }

  public JVresponseLineGroupEntity functionClass(String functionClass) {
    this.functionClass = functionClass;
    return this;
  }

 /**
   * Get functionCategory
   * @return functionCategory
  **/
  @JsonProperty("functionCategory")
  public String getFunctionCategory() {
    return functionCategory;
  }

  public void setFunctionCategory(String functionCategory) {
    this.functionCategory = functionCategory;
  }

  public JVresponseLineGroupEntity functionCategory(String functionCategory) {
    this.functionCategory = functionCategory;
    return this;
  }

 /**
   * Get functionType
   * @return functionType
  **/
  @JsonProperty("functionType")
  public String getFunctionType() {
    return functionType;
  }

  public void setFunctionType(String functionType) {
    this.functionType = functionType;
  }

  public JVresponseLineGroupEntity functionType(String functionType) {
    this.functionType = functionType;
    return this;
  }

 /**
   * Get functionGroup
   * @return functionGroup
  **/
  @JsonProperty("functionGroup")
  public String getFunctionGroup() {
    return functionGroup;
  }

  public void setFunctionGroup(String functionGroup) {
    this.functionGroup = functionGroup;
  }

  public JVresponseLineGroupEntity functionGroup(String functionGroup) {
    this.functionGroup = functionGroup;
    return this;
  }

 /**
   * Get object
   * @return object
  **/
  @JsonProperty("object")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public JVresponseLineGroupEntity object(String object) {
    this.object = object;
    return this;
  }

 /**
   * Get subObject
   * @return subObject
  **/
  @JsonProperty("subObject")
  public String getSubObject() {
    return subObject;
  }

  public void setSubObject(String subObject) {
    this.subObject = subObject;
  }

  public JVresponseLineGroupEntity subObject(String subObject) {
    this.subObject = subObject;
    return this;
  }

 /**
   * Get objectClass
   * @return objectClass
  **/
  @JsonProperty("objectClass")
  public String getObjectClass() {
    return objectClass;
  }

  public void setObjectClass(String objectClass) {
    this.objectClass = objectClass;
  }

  public JVresponseLineGroupEntity objectClass(String objectClass) {
    this.objectClass = objectClass;
    return this;
  }

 /**
   * Get objectCategory
   * @return objectCategory
  **/
  @JsonProperty("objectCategory")
  public String getObjectCategory() {
    return objectCategory;
  }

  public void setObjectCategory(String objectCategory) {
    this.objectCategory = objectCategory;
  }

  public JVresponseLineGroupEntity objectCategory(String objectCategory) {
    this.objectCategory = objectCategory;
    return this;
  }

 /**
   * Get objectType
   * @return objectType
  **/
  @JsonProperty("objectType")
  public String getObjectType() {
    return objectType;
  }

  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }

  public JVresponseLineGroupEntity objectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

 /**
   * Get objectGroup
   * @return objectGroup
  **/
  @JsonProperty("objectGroup")
  public String getObjectGroup() {
    return objectGroup;
  }

  public void setObjectGroup(String objectGroup) {
    this.objectGroup = objectGroup;
  }

  public JVresponseLineGroupEntity objectGroup(String objectGroup) {
    this.objectGroup = objectGroup;
    return this;
  }

 /**
   * Get revenue
   * @return revenue
  **/
  @JsonProperty("revenue")
  public String getRevenue() {
    return revenue;
  }

  public void setRevenue(String revenue) {
    this.revenue = revenue;
  }

  public JVresponseLineGroupEntity revenue(String revenue) {
    this.revenue = revenue;
    return this;
  }

 /**
   * Get subRevenue
   * @return subRevenue
  **/
  @JsonProperty("subRevenue")
  public String getSubRevenue() {
    return subRevenue;
  }

  public void setSubRevenue(String subRevenue) {
    this.subRevenue = subRevenue;
  }

  public JVresponseLineGroupEntity subRevenue(String subRevenue) {
    this.subRevenue = subRevenue;
    return this;
  }

 /**
   * Get revenueClass
   * @return revenueClass
  **/
  @JsonProperty("revenueClass")
  public String getRevenueClass() {
    return revenueClass;
  }

  public void setRevenueClass(String revenueClass) {
    this.revenueClass = revenueClass;
  }

  public JVresponseLineGroupEntity revenueClass(String revenueClass) {
    this.revenueClass = revenueClass;
    return this;
  }

 /**
   * Get revenueCategory
   * @return revenueCategory
  **/
  @JsonProperty("revenueCategory")
  public String getRevenueCategory() {
    return revenueCategory;
  }

  public void setRevenueCategory(String revenueCategory) {
    this.revenueCategory = revenueCategory;
  }

  public JVresponseLineGroupEntity revenueCategory(String revenueCategory) {
    this.revenueCategory = revenueCategory;
    return this;
  }

 /**
   * Get revenueGroup
   * @return revenueGroup
  **/
  @JsonProperty("revenueGroup")
  public String getRevenueGroup() {
    return revenueGroup;
  }

  public void setRevenueGroup(String revenueGroup) {
    this.revenueGroup = revenueGroup;
  }

  public JVresponseLineGroupEntity revenueGroup(String revenueGroup) {
    this.revenueGroup = revenueGroup;
    return this;
  }

 /**
   * Get revenueType
   * @return revenueType
  **/
  @JsonProperty("revenueType")
  public String getRevenueType() {
    return revenueType;
  }

  public void setRevenueType(String revenueType) {
    this.revenueType = revenueType;
  }

  public JVresponseLineGroupEntity revenueType(String revenueType) {
    this.revenueType = revenueType;
    return this;
  }

 /**
   * Get majorCAFRRevenueType
   * @return majorCAFRRevenueType
  **/
  @JsonProperty("majorCAFRRevenueType")
  public String getMajorCAFRRevenueType() {
    return majorCAFRRevenueType;
  }

  public void setMajorCAFRRevenueType(String majorCAFRRevenueType) {
    this.majorCAFRRevenueType = majorCAFRRevenueType;
  }

  public JVresponseLineGroupEntity majorCAFRRevenueType(String majorCAFRRevenueType) {
    this.majorCAFRRevenueType = majorCAFRRevenueType;
    return this;
  }

 /**
   * Get minorCAFRRevenueType
   * @return minorCAFRRevenueType
  **/
  @JsonProperty("minorCAFRRevenueType")
  public String getMinorCAFRRevenueType() {
    return minorCAFRRevenueType;
  }

  public void setMinorCAFRRevenueType(String minorCAFRRevenueType) {
    this.minorCAFRRevenueType = minorCAFRRevenueType;
  }

  public JVresponseLineGroupEntity minorCAFRRevenueType(String minorCAFRRevenueType) {
    this.minorCAFRRevenueType = minorCAFRRevenueType;
    return this;
  }

 /**
   * Get bsa
   * @return bsa
  **/
  @JsonProperty("bsa")
  public String getBsa() {
    return bsa;
  }

  public void setBsa(String bsa) {
    this.bsa = bsa;
  }

  public JVresponseLineGroupEntity bsa(String bsa) {
    this.bsa = bsa;
    return this;
  }

 /**
   * Get cashAccount
   * @return cashAccount
  **/
  @JsonProperty("cashAccount")
  public String getCashAccount() {
    return cashAccount;
  }

  public void setCashAccount(String cashAccount) {
    this.cashAccount = cashAccount;
  }

  public JVresponseLineGroupEntity cashAccount(String cashAccount) {
    this.cashAccount = cashAccount;
    return this;
  }

 /**
   * Get memoAccount
   * @return memoAccount
  **/
  @JsonProperty("memoAccount")
  public Boolean isMemoAccount() {
    return memoAccount;
  }

  public void setMemoAccount(Boolean memoAccount) {
    this.memoAccount = memoAccount;
  }

  public JVresponseLineGroupEntity memoAccount(Boolean memoAccount) {
    this.memoAccount = memoAccount;
    return this;
  }

 /**
   * Get accountType
   * @return accountType
  **/
  @JsonProperty("accountType")
  public Long getAccountType() {
    return accountType;
  }

  public void setAccountType(Long accountType) {
    this.accountType = accountType;
  }

  public JVresponseLineGroupEntity accountType(Long accountType) {
    this.accountType = accountType;
    return this;
  }

 /**
   * Get subBSA
   * @return subBSA
  **/
  @JsonProperty("subBSA")
  public String getSubBSA() {
    return subBSA;
  }

  public void setSubBSA(String subBSA) {
    this.subBSA = subBSA;
  }

  public JVresponseLineGroupEntity subBSA(String subBSA) {
    this.subBSA = subBSA;
    return this;
  }

 /**
   * Get bsaClass
   * @return bsaClass
  **/
  @JsonProperty("bsaClass")
  public String getBsaClass() {
    return bsaClass;
  }

  public void setBsaClass(String bsaClass) {
    this.bsaClass = bsaClass;
  }

  public JVresponseLineGroupEntity bsaClass(String bsaClass) {
    this.bsaClass = bsaClass;
    return this;
  }

 /**
   * Get bsaCategory
   * @return bsaCategory
  **/
  @JsonProperty("bsaCategory")
  public String getBsaCategory() {
    return bsaCategory;
  }

  public void setBsaCategory(String bsaCategory) {
    this.bsaCategory = bsaCategory;
  }

  public JVresponseLineGroupEntity bsaCategory(String bsaCategory) {
    this.bsaCategory = bsaCategory;
    return this;
  }

 /**
   * Get bsaGroup
   * @return bsaGroup
  **/
  @JsonProperty("bsaGroup")
  public String getBsaGroup() {
    return bsaGroup;
  }

  public void setBsaGroup(String bsaGroup) {
    this.bsaGroup = bsaGroup;
  }

  public JVresponseLineGroupEntity bsaGroup(String bsaGroup) {
    this.bsaGroup = bsaGroup;
    return this;
  }

 /**
   * Get bsaType
   * @return bsaType
  **/
  @JsonProperty("bsaType")
  public String getBsaType() {
    return bsaType;
  }

  public void setBsaType(String bsaType) {
    this.bsaType = bsaType;
  }

  public JVresponseLineGroupEntity bsaType(String bsaType) {
    this.bsaType = bsaType;
    return this;
  }

 /**
   * Get cafrMajorBSAGroup
   * @return cafrMajorBSAGroup
  **/
  @JsonProperty("cafrMajorBSAGroup")
  public String getCafrMajorBSAGroup() {
    return cafrMajorBSAGroup;
  }

  public void setCafrMajorBSAGroup(String cafrMajorBSAGroup) {
    this.cafrMajorBSAGroup = cafrMajorBSAGroup;
  }

  public JVresponseLineGroupEntity cafrMajorBSAGroup(String cafrMajorBSAGroup) {
    this.cafrMajorBSAGroup = cafrMajorBSAGroup;
    return this;
  }

 /**
   * Get cafrMinorBSAGroup
   * @return cafrMinorBSAGroup
  **/
  @JsonProperty("cafrMinorBSAGroup")
  public String getCafrMinorBSAGroup() {
    return cafrMinorBSAGroup;
  }

  public void setCafrMinorBSAGroup(String cafrMinorBSAGroup) {
    this.cafrMinorBSAGroup = cafrMinorBSAGroup;
  }

  public JVresponseLineGroupEntity cafrMinorBSAGroup(String cafrMinorBSAGroup) {
    this.cafrMinorBSAGroup = cafrMinorBSAGroup;
    return this;
  }

 /**
   * Get obsa
   * @return obsa
  **/
  @JsonProperty("obsa")
  public String getObsa() {
    return obsa;
  }

  public void setObsa(String obsa) {
    this.obsa = obsa;
  }

  public JVresponseLineGroupEntity obsa(String obsa) {
    this.obsa = obsa;
    return this;
  }

 /**
   * Get subOBSA
   * @return subOBSA
  **/
  @JsonProperty("subOBSA")
  public String getSubOBSA() {
    return subOBSA;
  }

  public void setSubOBSA(String subOBSA) {
    this.subOBSA = subOBSA;
  }

  public JVresponseLineGroupEntity subOBSA(String subOBSA) {
    this.subOBSA = subOBSA;
    return this;
  }

 /**
   * Get obsaClass
   * @return obsaClass
  **/
  @JsonProperty("obsaClass")
  public String getObsaClass() {
    return obsaClass;
  }

  public void setObsaClass(String obsaClass) {
    this.obsaClass = obsaClass;
  }

  public JVresponseLineGroupEntity obsaClass(String obsaClass) {
    this.obsaClass = obsaClass;
    return this;
  }

 /**
   * Get obsaCategory
   * @return obsaCategory
  **/
  @JsonProperty("obsaCategory")
  public String getObsaCategory() {
    return obsaCategory;
  }

  public void setObsaCategory(String obsaCategory) {
    this.obsaCategory = obsaCategory;
  }

  public JVresponseLineGroupEntity obsaCategory(String obsaCategory) {
    this.obsaCategory = obsaCategory;
    return this;
  }

 /**
   * Get obsaGroup
   * @return obsaGroup
  **/
  @JsonProperty("obsaGroup")
  public String getObsaGroup() {
    return obsaGroup;
  }

  public void setObsaGroup(String obsaGroup) {
    this.obsaGroup = obsaGroup;
  }

  public JVresponseLineGroupEntity obsaGroup(String obsaGroup) {
    this.obsaGroup = obsaGroup;
    return this;
  }

 /**
   * Get obsaType
   * @return obsaType
  **/
  @JsonProperty("obsaType")
  public String getObsaType() {
    return obsaType;
  }

  public void setObsaType(String obsaType) {
    this.obsaType = obsaType;
  }

  public JVresponseLineGroupEntity obsaType(String obsaType) {
    this.obsaType = obsaType;
    return this;
  }

 /**
   * Get cmjrobsaGroup
   * @return cmjrobsaGroup
  **/
  @JsonProperty("cmjrobsaGroup")
  public String getCmjrobsaGroup() {
    return cmjrobsaGroup;
  }

  public void setCmjrobsaGroup(String cmjrobsaGroup) {
    this.cmjrobsaGroup = cmjrobsaGroup;
  }

  public JVresponseLineGroupEntity cmjrobsaGroup(String cmjrobsaGroup) {
    this.cmjrobsaGroup = cmjrobsaGroup;
    return this;
  }

 /**
   * Get cmnrobsaGroup
   * @return cmnrobsaGroup
  **/
  @JsonProperty("cmnrobsaGroup")
  public String getCmnrobsaGroup() {
    return cmnrobsaGroup;
  }

  public void setCmnrobsaGroup(String cmnrobsaGroup) {
    this.cmnrobsaGroup = cmnrobsaGroup;
  }

  public JVresponseLineGroupEntity cmnrobsaGroup(String cmnrobsaGroup) {
    this.cmnrobsaGroup = cmnrobsaGroup;
    return this;
  }

 /**
   * Get obsaType1
   * @return obsaType1
  **/
  @JsonProperty("obsaType1")
  public String getObsaType1() {
    return obsaType1;
  }

  public void setObsaType1(String obsaType1) {
    this.obsaType1 = obsaType1;
  }

  public JVresponseLineGroupEntity obsaType1(String obsaType1) {
    this.obsaType1 = obsaType1;
    return this;
  }

 /**
   * Get deptObject
   * @return deptObject
  **/
  @JsonProperty("deptObject")
  public String getDeptObject() {
    return deptObject;
  }

  public void setDeptObject(String deptObject) {
    this.deptObject = deptObject;
  }

  public JVresponseLineGroupEntity deptObject(String deptObject) {
    this.deptObject = deptObject;
    return this;
  }

 /**
   * Get deptObjectClass
   * @return deptObjectClass
  **/
  @JsonProperty("deptObjectClass")
  public String getDeptObjectClass() {
    return deptObjectClass;
  }

  public void setDeptObjectClass(String deptObjectClass) {
    this.deptObjectClass = deptObjectClass;
  }

  public JVresponseLineGroupEntity deptObjectClass(String deptObjectClass) {
    this.deptObjectClass = deptObjectClass;
    return this;
  }

 /**
   * Get deptObjectCategory
   * @return deptObjectCategory
  **/
  @JsonProperty("deptObjectCategory")
  public String getDeptObjectCategory() {
    return deptObjectCategory;
  }

  public void setDeptObjectCategory(String deptObjectCategory) {
    this.deptObjectCategory = deptObjectCategory;
  }

  public JVresponseLineGroupEntity deptObjectCategory(String deptObjectCategory) {
    this.deptObjectCategory = deptObjectCategory;
    return this;
  }

 /**
   * Get deptObjectType
   * @return deptObjectType
  **/
  @JsonProperty("deptObjectType")
  public String getDeptObjectType() {
    return deptObjectType;
  }

  public void setDeptObjectType(String deptObjectType) {
    this.deptObjectType = deptObjectType;
  }

  public JVresponseLineGroupEntity deptObjectType(String deptObjectType) {
    this.deptObjectType = deptObjectType;
    return this;
  }

 /**
   * Get deptObjectGroup
   * @return deptObjectGroup
  **/
  @JsonProperty("deptObjectGroup")
  public String getDeptObjectGroup() {
    return deptObjectGroup;
  }

  public void setDeptObjectGroup(String deptObjectGroup) {
    this.deptObjectGroup = deptObjectGroup;
  }

  public JVresponseLineGroupEntity deptObjectGroup(String deptObjectGroup) {
    this.deptObjectGroup = deptObjectGroup;
    return this;
  }

 /**
   * Get deptRevenue
   * @return deptRevenue
  **/
  @JsonProperty("deptRevenue")
  public String getDeptRevenue() {
    return deptRevenue;
  }

  public void setDeptRevenue(String deptRevenue) {
    this.deptRevenue = deptRevenue;
  }

  public JVresponseLineGroupEntity deptRevenue(String deptRevenue) {
    this.deptRevenue = deptRevenue;
    return this;
  }

 /**
   * Get deptRevenueClass
   * @return deptRevenueClass
  **/
  @JsonProperty("deptRevenueClass")
  public String getDeptRevenueClass() {
    return deptRevenueClass;
  }

  public void setDeptRevenueClass(String deptRevenueClass) {
    this.deptRevenueClass = deptRevenueClass;
  }

  public JVresponseLineGroupEntity deptRevenueClass(String deptRevenueClass) {
    this.deptRevenueClass = deptRevenueClass;
    return this;
  }

 /**
   * Get deptRevenueCategory
   * @return deptRevenueCategory
  **/
  @JsonProperty("deptRevenueCategory")
  public String getDeptRevenueCategory() {
    return deptRevenueCategory;
  }

  public void setDeptRevenueCategory(String deptRevenueCategory) {
    this.deptRevenueCategory = deptRevenueCategory;
  }

  public JVresponseLineGroupEntity deptRevenueCategory(String deptRevenueCategory) {
    this.deptRevenueCategory = deptRevenueCategory;
    return this;
  }

 /**
   * Get deptRevenueType
   * @return deptRevenueType
  **/
  @JsonProperty("deptRevenueType")
  public String getDeptRevenueType() {
    return deptRevenueType;
  }

  public void setDeptRevenueType(String deptRevenueType) {
    this.deptRevenueType = deptRevenueType;
  }

  public JVresponseLineGroupEntity deptRevenueType(String deptRevenueType) {
    this.deptRevenueType = deptRevenueType;
    return this;
  }

 /**
   * Get deptRevenueGroup
   * @return deptRevenueGroup
  **/
  @JsonProperty("deptRevenueGroup")
  public String getDeptRevenueGroup() {
    return deptRevenueGroup;
  }

  public void setDeptRevenueGroup(String deptRevenueGroup) {
    this.deptRevenueGroup = deptRevenueGroup;
  }

  public JVresponseLineGroupEntity deptRevenueGroup(String deptRevenueGroup) {
    this.deptRevenueGroup = deptRevenueGroup;
    return this;
  }

 /**
   * Get internalFund
   * @return internalFund
  **/
  @JsonProperty("internalFund")
  public String getInternalFund() {
    return internalFund;
  }

  public void setInternalFund(String internalFund) {
    this.internalFund = internalFund;
  }

  public JVresponseLineGroupEntity internalFund(String internalFund) {
    this.internalFund = internalFund;
    return this;
  }

 /**
   * Get internalSubFund
   * @return internalSubFund
  **/
  @JsonProperty("internalSubFund")
  public String getInternalSubFund() {
    return internalSubFund;
  }

  public void setInternalSubFund(String internalSubFund) {
    this.internalSubFund = internalSubFund;
  }

  public JVresponseLineGroupEntity internalSubFund(String internalSubFund) {
    this.internalSubFund = internalSubFund;
    return this;
  }

 /**
   * Get internalDept
   * @return internalDept
  **/
  @JsonProperty("internalDept")
  public String getInternalDept() {
    return internalDept;
  }

  public void setInternalDept(String internalDept) {
    this.internalDept = internalDept;
  }

  public JVresponseLineGroupEntity internalDept(String internalDept) {
    this.internalDept = internalDept;
    return this;
  }

 /**
   * Get reporting
   * @return reporting
  **/
  @JsonProperty("reporting")
  public String getReporting() {
    return reporting;
  }

  public void setReporting(String reporting) {
    this.reporting = reporting;
  }

  public JVresponseLineGroupEntity reporting(String reporting) {
    this.reporting = reporting;
    return this;
  }

 /**
   * Get subReporting
   * @return subReporting
  **/
  @JsonProperty("subReporting")
  public String getSubReporting() {
    return subReporting;
  }

  public void setSubReporting(String subReporting) {
    this.subReporting = subReporting;
  }

  public JVresponseLineGroupEntity subReporting(String subReporting) {
    this.subReporting = subReporting;
    return this;
  }

 /**
   * Get reportingClass
   * @return reportingClass
  **/
  @JsonProperty("reportingClass")
  public String getReportingClass() {
    return reportingClass;
  }

  public void setReportingClass(String reportingClass) {
    this.reportingClass = reportingClass;
  }

  public JVresponseLineGroupEntity reportingClass(String reportingClass) {
    this.reportingClass = reportingClass;
    return this;
  }

 /**
   * Get reportingCategory
   * @return reportingCategory
  **/
  @JsonProperty("reportingCategory")
  public String getReportingCategory() {
    return reportingCategory;
  }

  public void setReportingCategory(String reportingCategory) {
    this.reportingCategory = reportingCategory;
  }

  public JVresponseLineGroupEntity reportingCategory(String reportingCategory) {
    this.reportingCategory = reportingCategory;
    return this;
  }

 /**
   * Get reportingType
   * @return reportingType
  **/
  @JsonProperty("reportingType")
  public String getReportingType() {
    return reportingType;
  }

  public void setReportingType(String reportingType) {
    this.reportingType = reportingType;
  }

  public JVresponseLineGroupEntity reportingType(String reportingType) {
    this.reportingType = reportingType;
    return this;
  }

 /**
   * Get reportingGroup
   * @return reportingGroup
  **/
  @JsonProperty("reportingGroup")
  public String getReportingGroup() {
    return reportingGroup;
  }

  public void setReportingGroup(String reportingGroup) {
    this.reportingGroup = reportingGroup;
  }

  public JVresponseLineGroupEntity reportingGroup(String reportingGroup) {
    this.reportingGroup = reportingGroup;
    return this;
  }

 /**
   * Get task
   * @return task
  **/
  @JsonProperty("task")
  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public JVresponseLineGroupEntity task(String task) {
    this.task = task;
    return this;
  }

 /**
   * Get subTask
   * @return subTask
  **/
  @JsonProperty("subTask")
  public String getSubTask() {
    return subTask;
  }

  public void setSubTask(String subTask) {
    this.subTask = subTask;
  }

  public JVresponseLineGroupEntity subTask(String subTask) {
    this.subTask = subTask;
    return this;
  }

 /**
   * Get taskOrder
   * @return taskOrder
  **/
  @JsonProperty("taskOrder")
  public String getTaskOrder() {
    return taskOrder;
  }

  public void setTaskOrder(String taskOrder) {
    this.taskOrder = taskOrder;
  }

  public JVresponseLineGroupEntity taskOrder(String taskOrder) {
    this.taskOrder = taskOrder;
    return this;
  }

 /**
   * Get majorProgram
   * @return majorProgram
  **/
  @JsonProperty("majorProgram")
  public String getMajorProgram() {
    return majorProgram;
  }

  public void setMajorProgram(String majorProgram) {
    this.majorProgram = majorProgram;
  }

  public JVresponseLineGroupEntity majorProgram(String majorProgram) {
    this.majorProgram = majorProgram;
    return this;
  }

 /**
   * Get majorProgramClass
   * @return majorProgramClass
  **/
  @JsonProperty("majorProgramClass")
  public String getMajorProgramClass() {
    return majorProgramClass;
  }

  public void setMajorProgramClass(String majorProgramClass) {
    this.majorProgramClass = majorProgramClass;
  }

  public JVresponseLineGroupEntity majorProgramClass(String majorProgramClass) {
    this.majorProgramClass = majorProgramClass;
    return this;
  }

 /**
   * Get majorProgramCategory
   * @return majorProgramCategory
  **/
  @JsonProperty("majorProgramCategory")
  public String getMajorProgramCategory() {
    return majorProgramCategory;
  }

  public void setMajorProgramCategory(String majorProgramCategory) {
    this.majorProgramCategory = majorProgramCategory;
  }

  public JVresponseLineGroupEntity majorProgramCategory(String majorProgramCategory) {
    this.majorProgramCategory = majorProgramCategory;
    return this;
  }

 /**
   * Get majorProgramGroup
   * @return majorProgramGroup
  **/
  @JsonProperty("majorProgramGroup")
  public String getMajorProgramGroup() {
    return majorProgramGroup;
  }

  public void setMajorProgramGroup(String majorProgramGroup) {
    this.majorProgramGroup = majorProgramGroup;
  }

  public JVresponseLineGroupEntity majorProgramGroup(String majorProgramGroup) {
    this.majorProgramGroup = majorProgramGroup;
    return this;
  }

 /**
   * Get majorProgramType
   * @return majorProgramType
  **/
  @JsonProperty("majorProgramType")
  public String getMajorProgramType() {
    return majorProgramType;
  }

  public void setMajorProgramType(String majorProgramType) {
    this.majorProgramType = majorProgramType;
  }

  public JVresponseLineGroupEntity majorProgramType(String majorProgramType) {
    this.majorProgramType = majorProgramType;
    return this;
  }

 /**
   * Get program
   * @return program
  **/
  @JsonProperty("program")
  public String getProgram() {
    return program;
  }

  public void setProgram(String program) {
    this.program = program;
  }

  public JVresponseLineGroupEntity program(String program) {
    this.program = program;
    return this;
  }

 /**
   * Get phase
   * @return phase
  **/
  @JsonProperty("phase")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public JVresponseLineGroupEntity phase(String phase) {
    this.phase = phase;
    return this;
  }

 /**
   * Get programClass
   * @return programClass
  **/
  @JsonProperty("programClass")
  public String getProgramClass() {
    return programClass;
  }

  public void setProgramClass(String programClass) {
    this.programClass = programClass;
  }

  public JVresponseLineGroupEntity programClass(String programClass) {
    this.programClass = programClass;
    return this;
  }

 /**
   * Get programCategory
   * @return programCategory
  **/
  @JsonProperty("programCategory")
  public String getProgramCategory() {
    return programCategory;
  }

  public void setProgramCategory(String programCategory) {
    this.programCategory = programCategory;
  }

  public JVresponseLineGroupEntity programCategory(String programCategory) {
    this.programCategory = programCategory;
    return this;
  }

 /**
   * Get programType
   * @return programType
  **/
  @JsonProperty("programType")
  public String getProgramType() {
    return programType;
  }

  public void setProgramType(String programType) {
    this.programType = programType;
  }

  public JVresponseLineGroupEntity programType(String programType) {
    this.programType = programType;
    return this;
  }

 /**
   * Get programGroup
   * @return programGroup
  **/
  @JsonProperty("programGroup")
  public String getProgramGroup() {
    return programGroup;
  }

  public void setProgramGroup(String programGroup) {
    this.programGroup = programGroup;
  }

  public JVresponseLineGroupEntity programGroup(String programGroup) {
    this.programGroup = programGroup;
    return this;
  }

 /**
   * Get programPeriod
   * @return programPeriod
  **/
  @JsonProperty("programPeriod")
  public String getProgramPeriod() {
    return programPeriod;
  }

  public void setProgramPeriod(String programPeriod) {
    this.programPeriod = programPeriod;
  }

  public JVresponseLineGroupEntity programPeriod(String programPeriod) {
    this.programPeriod = programPeriod;
    return this;
  }

 /**
   * Get addressCode
   * @return addressCode
  **/
  @JsonProperty("addressCode")
 @Size(max=20)  public String getAddressCode() {
    return addressCode;
  }

  public void setAddressCode(String addressCode) {
    this.addressCode = addressCode;
  }

  public JVresponseLineGroupEntity addressCode(String addressCode) {
    this.addressCode = addressCode;
    return this;
  }

 /**
   * Get vendorContactID
   * @return vendorContactID
  **/
  @JsonProperty("vendorContactID")
 @Size(max=20)  public String getVendorContactID() {
    return vendorContactID;
  }

  public void setVendorContactID(String vendorContactID) {
    this.vendorContactID = vendorContactID;
  }

  public JVresponseLineGroupEntity vendorContactID(String vendorContactID) {
    this.vendorContactID = vendorContactID;
    return this;
  }

 /**
   * Get taxpayerID
   * @return taxpayerID
  **/
  @JsonProperty("taxpayerID")
 @Size(max=1)  public String getTaxpayerID() {
    return taxpayerID;
  }

  public void setTaxpayerID(String taxpayerID) {
    this.taxpayerID = taxpayerID;
  }

  public JVresponseLineGroupEntity taxpayerID(String taxpayerID) {
    this.taxpayerID = taxpayerID;
    return this;
  }

 /**
   * Get taxpayerIDType
   * @return taxpayerIDType
  **/
  @JsonProperty("taxpayerIDType")
 @Size(max=1)  public String getTaxpayerIDType() {
    return taxpayerIDType;
  }

  public void setTaxpayerIDType(String taxpayerIDType) {
    this.taxpayerIDType = taxpayerIDType;
  }

  public JVresponseLineGroupEntity taxpayerIDType(String taxpayerIDType) {
    this.taxpayerIDType = taxpayerIDType;
    return this;
  }

 /**
   * Get addressType
   * @return addressType
  **/
  @JsonProperty("addressType")
  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public JVresponseLineGroupEntity addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

 /**
   * Get debtID
   * @return debtID
  **/
  @JsonProperty("debtID")
  public String getDebtID() {
    return debtID;
  }

  public void setDebtID(String debtID) {
    this.debtID = debtID;
  }

  public JVresponseLineGroupEntity debtID(String debtID) {
    this.debtID = debtID;
    return this;
  }

 /**
   * Get authorizationDebtInstrument
   * @return authorizationDebtInstrument
  **/
  @JsonProperty("authorizationDebtInstrument")
 @Size(max=1)  public String getAuthorizationDebtInstrument() {
    return authorizationDebtInstrument;
  }

  public void setAuthorizationDebtInstrument(String authorizationDebtInstrument) {
    this.authorizationDebtInstrument = authorizationDebtInstrument;
  }

  public JVresponseLineGroupEntity authorizationDebtInstrument(String authorizationDebtInstrument) {
    this.authorizationDebtInstrument = authorizationDebtInstrument;
    return this;
  }

 /**
   * Get extensionStorageUniqueID
   * @return extensionStorageUniqueID
  **/
  @JsonProperty("extensionStorageUniqueID")
  public Long getExtensionStorageUniqueID() {
    return extensionStorageUniqueID;
  }

  public void setExtensionStorageUniqueID(Long extensionStorageUniqueID) {
    this.extensionStorageUniqueID = extensionStorageUniqueID;
  }

  public JVresponseLineGroupEntity extensionStorageUniqueID(Long extensionStorageUniqueID) {
    this.extensionStorageUniqueID = extensionStorageUniqueID;
    return this;
  }

 /**
   * Get jvresponseAccountingEntity
   * @return jvresponseAccountingEntity
  **/
  @JsonProperty("JVresponseAccountingEntity")
  public List<JVresponseAccountingEntity> getJvresponseAccountingEntity() {
    return jvresponseAccountingEntity;
  }

  public void setJvresponseAccountingEntity(List<JVresponseAccountingEntity> jvresponseAccountingEntity) {
    this.jvresponseAccountingEntity = jvresponseAccountingEntity;
  }

  public JVresponseLineGroupEntity jvresponseAccountingEntity(List<JVresponseAccountingEntity> jvresponseAccountingEntity) {
    this.jvresponseAccountingEntity = jvresponseAccountingEntity;
    return this;
  }

  public JVresponseLineGroupEntity addJvresponseAccountingEntityItem(JVresponseAccountingEntity jvresponseAccountingEntityItem) {
    this.jvresponseAccountingEntity.add(jvresponseAccountingEntityItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JVresponseLineGroupEntity {\n");
    
    sb.append("    transactionComponentModificationFlag: ").append(toIndentedString(transactionComponentModificationFlag)).append("\n");
    sb.append("    transactionCategory: ").append(toIndentedString(transactionCategory)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
    sb.append("    transactionDept: ").append(toIndentedString(transactionDept)).append("\n");
    sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
    sb.append("    transactionVersionNumber: ").append(toIndentedString(transactionVersionNumber)).append("\n");
    sb.append("    transactionLineGroupNumber: ").append(toIndentedString(transactionLineGroupNumber)).append("\n");
    sb.append("    transactionActionCode: ").append(toIndentedString(transactionActionCode)).append("\n");
    sb.append("    transactionSubActionCode: ").append(toIndentedString(transactionSubActionCode)).append("\n");
    sb.append("    transactionCreationDate: ").append(toIndentedString(transactionCreationDate)).append("\n");
    sb.append("    transactionCreationUserID: ").append(toIndentedString(transactionCreationUserID)).append("\n");
    sb.append("    transactionFunctionCode: ").append(toIndentedString(transactionFunctionCode)).append("\n");
    sb.append("    transactionSubFunctionCode: ").append(toIndentedString(transactionSubFunctionCode)).append("\n");
    sb.append("    transactionLastDate: ").append(toIndentedString(transactionLastDate)).append("\n");
    sb.append("    transactionLastUserID: ").append(toIndentedString(transactionLastUserID)).append("\n");
    sb.append("    transactionPhaseCode: ").append(toIndentedString(transactionPhaseCode)).append("\n");
    sb.append("    transactionPreviousVersionNumber: ").append(toIndentedString(transactionPreviousVersionNumber)).append("\n");
    sb.append("    transactionUnit: ").append(toIndentedString(transactionUnit)).append("\n");
    sb.append("    objectAttachmentPrimaryGroupUniqueIdentifier: ").append(toIndentedString(objectAttachmentPrimaryGroupUniqueIdentifier)).append("\n");
    sb.append("    objectAttachmentSecondaryGroupTotal: ").append(toIndentedString(objectAttachmentSecondaryGroupTotal)).append("\n");
    sb.append("    objectAttachmentSecondaryUniqueIdentifier: ").append(toIndentedString(objectAttachmentSecondaryUniqueIdentifier)).append("\n");
    sb.append("    recordDate: ").append(toIndentedString(recordDate)).append("\n");
    sb.append("    budgetFY: ").append(toIndentedString(budgetFY)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    fiscalPeriod: ").append(toIndentedString(fiscalPeriod)).append("\n");
    sb.append("    fiscalQuarter: ").append(toIndentedString(fiscalQuarter)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    budgetControlReduction: ").append(toIndentedString(budgetControlReduction)).append("\n");
    sb.append("    fundBalanceControlReduction: ").append(toIndentedString(fundBalanceControlReduction)).append("\n");
    sb.append("    cashBalanceControlReduction: ").append(toIndentedString(cashBalanceControlReduction)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    postingPair: ").append(toIndentedString(postingPair)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    referencedLineOpenAmount: ").append(toIndentedString(referencedLineOpenAmount)).append("\n");
    sb.append("    referencedTransactionCategory: ").append(toIndentedString(referencedTransactionCategory)).append("\n");
    sb.append("    referencedTransactionType: ").append(toIndentedString(referencedTransactionType)).append("\n");
    sb.append("    referencedTransactionCode: ").append(toIndentedString(referencedTransactionCode)).append("\n");
    sb.append("    referencedTransactionDepartment: ").append(toIndentedString(referencedTransactionDepartment)).append("\n");
    sb.append("    referencedTransactionID: ").append(toIndentedString(referencedTransactionID)).append("\n");
    sb.append("    referencedTransactionVersion: ").append(toIndentedString(referencedTransactionVersion)).append("\n");
    sb.append("    referencedVendorLine: ").append(toIndentedString(referencedVendorLine)).append("\n");
    sb.append("    referencedCommodityLine: ").append(toIndentedString(referencedCommodityLine)).append("\n");
    sb.append("    referencedAccountingLine: ").append(toIndentedString(referencedAccountingLine)).append("\n");
    sb.append("    refAmendment: ").append(toIndentedString(refAmendment)).append("\n");
    sb.append("    vendorCustomer: ").append(toIndentedString(vendorCustomer)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    aliasOrDBA: ").append(toIndentedString(aliasOrDBA)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    vendorContactPhone: ").append(toIndentedString(vendorContactPhone)).append("\n");
    sb.append("    vendorContactPhoneExtension: ").append(toIndentedString(vendorContactPhoneExtension)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    faxExtension: ").append(toIndentedString(faxExtension)).append("\n");
    sb.append("    vendorContactEmail: ").append(toIndentedString(vendorContactEmail)).append("\n");
    sb.append("    webAddress: ").append(toIndentedString(webAddress)).append("\n");
    sb.append("    vendorContactName: ").append(toIndentedString(vendorContactName)).append("\n");
    sb.append("    miscAccount: ").append(toIndentedString(miscAccount)).append("\n");
    sb.append("    debitTotal: ").append(toIndentedString(debitTotal)).append("\n");
    sb.append("    creditTotal: ").append(toIndentedString(creditTotal)).append("\n");
    sb.append("    lineGroupDescription: ").append(toIndentedString(lineGroupDescription)).append("\n");
    sb.append("    performanceUnits: ").append(toIndentedString(performanceUnits)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    transactionLineGroupLineNumber: ").append(toIndentedString(transactionLineGroupLineNumber)).append("\n");
    sb.append("    transactionChildMaximumLineNumber: ").append(toIndentedString(transactionChildMaximumLineNumber)).append("\n");
    sb.append("    amsRowVersionNumber: ").append(toIndentedString(amsRowVersionNumber)).append("\n");
    sb.append("    lineGroup: ").append(toIndentedString(lineGroup)).append("\n");
    sb.append("    referenceType1: ").append(toIndentedString(referenceType1)).append("\n");
    sb.append("    postingPairName: ").append(toIndentedString(postingPairName)).append("\n");
    sb.append("    eventCategory: ").append(toIndentedString(eventCategory)).append("\n");
    sb.append("    accountingLineCount: ").append(toIndentedString(accountingLineCount)).append("\n");
    sb.append("    accountingLinesCrossAppropriations: ").append(toIndentedString(accountingLinesCrossAppropriations)).append("\n");
    sb.append("    fund: ").append(toIndentedString(fund)).append("\n");
    sb.append("    subFund: ").append(toIndentedString(subFund)).append("\n");
    sb.append("    fundClass: ").append(toIndentedString(fundClass)).append("\n");
    sb.append("    fundCategory: ").append(toIndentedString(fundCategory)).append("\n");
    sb.append("    fundType: ").append(toIndentedString(fundType)).append("\n");
    sb.append("    fundGroup: ").append(toIndentedString(fundGroup)).append("\n");
    sb.append("    cafrFundGroup: ").append(toIndentedString(cafrFundGroup)).append("\n");
    sb.append("    cafrFundType: ").append(toIndentedString(cafrFundType)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    subUnit: ").append(toIndentedString(subUnit)).append("\n");
    sb.append("    apprUnit: ").append(toIndentedString(apprUnit)).append("\n");
    sb.append("    apprClass: ").append(toIndentedString(apprClass)).append("\n");
    sb.append("    apprCategory: ").append(toIndentedString(apprCategory)).append("\n");
    sb.append("    apprType: ").append(toIndentedString(apprType)).append("\n");
    sb.append("    apprGroup: ").append(toIndentedString(apprGroup)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    subLocation: ").append(toIndentedString(subLocation)).append("\n");
    sb.append("    locationClass: ").append(toIndentedString(locationClass)).append("\n");
    sb.append("    locationCategory: ").append(toIndentedString(locationCategory)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    county1: ").append(toIndentedString(county1)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    subActivity: ").append(toIndentedString(subActivity)).append("\n");
    sb.append("    activityClass: ").append(toIndentedString(activityClass)).append("\n");
    sb.append("    activityCategory: ").append(toIndentedString(activityCategory)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    activityGroup: ").append(toIndentedString(activityGroup)).append("\n");
    sb.append("    cafrActivityUnit: ").append(toIndentedString(cafrActivityUnit)).append("\n");
    sb.append("    majorCAFRActivityType: ").append(toIndentedString(majorCAFRActivityType)).append("\n");
    sb.append("    minorCAFRActivityType: ").append(toIndentedString(minorCAFRActivityType)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    subFunction: ").append(toIndentedString(subFunction)).append("\n");
    sb.append("    functionClass: ").append(toIndentedString(functionClass)).append("\n");
    sb.append("    functionCategory: ").append(toIndentedString(functionCategory)).append("\n");
    sb.append("    functionType: ").append(toIndentedString(functionType)).append("\n");
    sb.append("    functionGroup: ").append(toIndentedString(functionGroup)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    subObject: ").append(toIndentedString(subObject)).append("\n");
    sb.append("    objectClass: ").append(toIndentedString(objectClass)).append("\n");
    sb.append("    objectCategory: ").append(toIndentedString(objectCategory)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    objectGroup: ").append(toIndentedString(objectGroup)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    subRevenue: ").append(toIndentedString(subRevenue)).append("\n");
    sb.append("    revenueClass: ").append(toIndentedString(revenueClass)).append("\n");
    sb.append("    revenueCategory: ").append(toIndentedString(revenueCategory)).append("\n");
    sb.append("    revenueGroup: ").append(toIndentedString(revenueGroup)).append("\n");
    sb.append("    revenueType: ").append(toIndentedString(revenueType)).append("\n");
    sb.append("    majorCAFRRevenueType: ").append(toIndentedString(majorCAFRRevenueType)).append("\n");
    sb.append("    minorCAFRRevenueType: ").append(toIndentedString(minorCAFRRevenueType)).append("\n");
    sb.append("    bsa: ").append(toIndentedString(bsa)).append("\n");
    sb.append("    cashAccount: ").append(toIndentedString(cashAccount)).append("\n");
    sb.append("    memoAccount: ").append(toIndentedString(memoAccount)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    subBSA: ").append(toIndentedString(subBSA)).append("\n");
    sb.append("    bsaClass: ").append(toIndentedString(bsaClass)).append("\n");
    sb.append("    bsaCategory: ").append(toIndentedString(bsaCategory)).append("\n");
    sb.append("    bsaGroup: ").append(toIndentedString(bsaGroup)).append("\n");
    sb.append("    bsaType: ").append(toIndentedString(bsaType)).append("\n");
    sb.append("    cafrMajorBSAGroup: ").append(toIndentedString(cafrMajorBSAGroup)).append("\n");
    sb.append("    cafrMinorBSAGroup: ").append(toIndentedString(cafrMinorBSAGroup)).append("\n");
    sb.append("    obsa: ").append(toIndentedString(obsa)).append("\n");
    sb.append("    subOBSA: ").append(toIndentedString(subOBSA)).append("\n");
    sb.append("    obsaClass: ").append(toIndentedString(obsaClass)).append("\n");
    sb.append("    obsaCategory: ").append(toIndentedString(obsaCategory)).append("\n");
    sb.append("    obsaGroup: ").append(toIndentedString(obsaGroup)).append("\n");
    sb.append("    obsaType: ").append(toIndentedString(obsaType)).append("\n");
    sb.append("    cmjrobsaGroup: ").append(toIndentedString(cmjrobsaGroup)).append("\n");
    sb.append("    cmnrobsaGroup: ").append(toIndentedString(cmnrobsaGroup)).append("\n");
    sb.append("    obsaType1: ").append(toIndentedString(obsaType1)).append("\n");
    sb.append("    deptObject: ").append(toIndentedString(deptObject)).append("\n");
    sb.append("    deptObjectClass: ").append(toIndentedString(deptObjectClass)).append("\n");
    sb.append("    deptObjectCategory: ").append(toIndentedString(deptObjectCategory)).append("\n");
    sb.append("    deptObjectType: ").append(toIndentedString(deptObjectType)).append("\n");
    sb.append("    deptObjectGroup: ").append(toIndentedString(deptObjectGroup)).append("\n");
    sb.append("    deptRevenue: ").append(toIndentedString(deptRevenue)).append("\n");
    sb.append("    deptRevenueClass: ").append(toIndentedString(deptRevenueClass)).append("\n");
    sb.append("    deptRevenueCategory: ").append(toIndentedString(deptRevenueCategory)).append("\n");
    sb.append("    deptRevenueType: ").append(toIndentedString(deptRevenueType)).append("\n");
    sb.append("    deptRevenueGroup: ").append(toIndentedString(deptRevenueGroup)).append("\n");
    sb.append("    internalFund: ").append(toIndentedString(internalFund)).append("\n");
    sb.append("    internalSubFund: ").append(toIndentedString(internalSubFund)).append("\n");
    sb.append("    internalDept: ").append(toIndentedString(internalDept)).append("\n");
    sb.append("    reporting: ").append(toIndentedString(reporting)).append("\n");
    sb.append("    subReporting: ").append(toIndentedString(subReporting)).append("\n");
    sb.append("    reportingClass: ").append(toIndentedString(reportingClass)).append("\n");
    sb.append("    reportingCategory: ").append(toIndentedString(reportingCategory)).append("\n");
    sb.append("    reportingType: ").append(toIndentedString(reportingType)).append("\n");
    sb.append("    reportingGroup: ").append(toIndentedString(reportingGroup)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    subTask: ").append(toIndentedString(subTask)).append("\n");
    sb.append("    taskOrder: ").append(toIndentedString(taskOrder)).append("\n");
    sb.append("    majorProgram: ").append(toIndentedString(majorProgram)).append("\n");
    sb.append("    majorProgramClass: ").append(toIndentedString(majorProgramClass)).append("\n");
    sb.append("    majorProgramCategory: ").append(toIndentedString(majorProgramCategory)).append("\n");
    sb.append("    majorProgramGroup: ").append(toIndentedString(majorProgramGroup)).append("\n");
    sb.append("    majorProgramType: ").append(toIndentedString(majorProgramType)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    programClass: ").append(toIndentedString(programClass)).append("\n");
    sb.append("    programCategory: ").append(toIndentedString(programCategory)).append("\n");
    sb.append("    programType: ").append(toIndentedString(programType)).append("\n");
    sb.append("    programGroup: ").append(toIndentedString(programGroup)).append("\n");
    sb.append("    programPeriod: ").append(toIndentedString(programPeriod)).append("\n");
    sb.append("    addressCode: ").append(toIndentedString(addressCode)).append("\n");
    sb.append("    vendorContactID: ").append(toIndentedString(vendorContactID)).append("\n");
    sb.append("    taxpayerID: ").append(toIndentedString(taxpayerID)).append("\n");
    sb.append("    taxpayerIDType: ").append(toIndentedString(taxpayerIDType)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    debtID: ").append(toIndentedString(debtID)).append("\n");
    sb.append("    authorizationDebtInstrument: ").append(toIndentedString(authorizationDebtInstrument)).append("\n");
    sb.append("    extensionStorageUniqueID: ").append(toIndentedString(extensionStorageUniqueID)).append("\n");
    sb.append("    jvresponseAccountingEntity: ").append(toIndentedString(jvresponseAccountingEntity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

