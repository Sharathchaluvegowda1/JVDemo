package com.cgi.adv.connect.jv.model;

import java.util.Date;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class JVresponseAccountingEntity  {
  
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
  private Integer transactionVersionNumber = null;

  @ApiModelProperty(value = "")
  private Long transactionAccountingNumber = null;

  @ApiModelProperty(value = "")
  private Long accountingLine = null;

  @ApiModelProperty(value = "")
  private Long transactionActionCode = null;

  @ApiModelProperty(value = "")
  private Long transactionSubActionCode = null;

  @ApiModelProperty(value = "")
  private Date transactionCreationDate = null;

  @ApiModelProperty(value = "")
  private String transactionCreationUserID = null;

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
  private Long objectAttachmentSecondaryGroupTotal = null;

  @ApiModelProperty(value = "")
  private Long objectAttachmentSecondaryUniqueIdentifier = null;

  @ApiModelProperty(value = "")
  private Long budgetFY = null;

  @ApiModelProperty(value = "")
  private Long fiscalYear = null;

  @ApiModelProperty(value = "")
  private String period = null;

  @ApiModelProperty(value = "")
  private Integer fiscalQuarter = null;

  @ApiModelProperty(value = "")
  private Integer creditAmount = null;

  @ApiModelProperty(value = "")
  private String accountingTemplate = null;

  @ApiModelProperty(value = "")
  private Long lineFunction = null;

  @ApiModelProperty(value = "")
  private String referencedTransactionCode = null;

  @ApiModelProperty(value = "")
  private String referencedTransactionDepartment = null;

  @ApiModelProperty(value = "")
  private String referencedTransactionID = null;

  @ApiModelProperty(value = "")
  private Long referencedVendorLine = null;

  @ApiModelProperty(value = "")
  private Long referencedCommodityLine = null;

  @ApiModelProperty(value = "")
  private Long referencedAccountingLine = null;

  @ApiModelProperty(value = "")
  private String vendorOrCustomer = null;

  @ApiModelProperty(value = "")
  private String legalName = null;

  @ApiModelProperty(value = "")
  private Long customerActiveStatus = null;

  @ApiModelProperty(value = "")
  private Long customerApprovalStatus = null;

  @ApiModelProperty(value = "")
  private Long vendorActiveStatus = null;

  @ApiModelProperty(value = "")
  private Long vendorApprovalStatus = null;

  @ApiModelProperty(value = "")
  private Integer debitAmount = null;

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
  private String majorCAFRExpenseType = null;

  @ApiModelProperty(value = "")
  private String minorCAFRExpenseType = null;

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
  private String governmentBranch = null;

  @ApiModelProperty(value = "")
  private String cabinet = null;

  @ApiModelProperty(value = "")
  private String department = null;

  @ApiModelProperty(value = "")
  private String division = null;

  @ApiModelProperty(value = "")
  private String group = null;

  @ApiModelProperty(value = "")
  private String section = null;

  @ApiModelProperty(value = "")
  private String district = null;

  @ApiModelProperty(value = "")
  private String bureau = null;

  @ApiModelProperty(value = "")
  private String unit = null;

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
  private String county = null;

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
  private String fundingProfile = null;

  @ApiModelProperty(value = "")
  private String performanceUnitOfMeasure = null;

  @ApiModelProperty(value = "")
  private String lineDescription = null;

  @ApiModelProperty(value = "")
  private String eventType = null;

  @ApiModelProperty(value = "")
  private String postingPair = null;

  @ApiModelProperty(value = "")
  private String postingCode = null;

  @ApiModelProperty(value = "")
  private String internalFund = null;

  @ApiModelProperty(value = "")
  private String internalSubFund = null;

  @ApiModelProperty(value = "")
  private String internalDept = null;

  @ApiModelProperty(value = "")
  private Long lineGroup = null;

  @ApiModelProperty(value = "")
  private String referenceType1 = null;

  @ApiModelProperty(value = "")
  private String postingCodeName = null;

  @ApiModelProperty(value = "")
  private Boolean cashAccount1 = null;

  @ApiModelProperty(value = "")
  private Boolean memoAccount1 = null;

  @ApiModelProperty(value = "")
  private Long accountType1 = null;

  @ApiModelProperty(value = "")
  private String postingPairName = null;

  @ApiModelProperty(value = "")
  private Long lineGroupLineNumber = null;

  @ApiModelProperty(value = "")
  private Boolean offsetFlag = null;

  @ApiModelProperty(value = "")
  private String subUnit = null;

  @ApiModelProperty(value = "")
  private String bank = null;

  @ApiModelProperty(value = "")
  private String fundingPriority = null;

  @ApiModelProperty(value = "")
  private String fundingLine = null;

  @ApiModelProperty(value = "")
  private Long accountingClassification = null;

  @ApiModelProperty(value = "")
  private Integer quantity = null;

  @ApiModelProperty(value = "")
  private String humanResourceMeasure = null;

  @ApiModelProperty(value = "")
  private String taxpayerIDNumber = null;

  @ApiModelProperty(value = "")
  private String taxpayerIDType = null;

  @ApiModelProperty(value = "")
  private String batchLoaded = null;

  @ApiModelProperty(value = "")
  private String debtID = null;

  @ApiModelProperty(value = "")
  private String authorizationDebtInstrument = null;

  @ApiModelProperty(value = "")
  private Long extensionStorageUniqueID = null;
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

  public JVresponseAccountingEntity transactionCategory(String transactionCategory) {
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

  public JVresponseAccountingEntity transactionType(String transactionType) {
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

  public JVresponseAccountingEntity transactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
    return this;
  }

 /**
   * Get transactionDept
   * @return transactionDept
  **/
  @JsonProperty("transactionDept")
  public String getTransactionDept() {
    return transactionDept;
  }

  public void setTransactionDept(String transactionDept) {
    this.transactionDept = transactionDept;
  }

  public JVresponseAccountingEntity transactionDept(String transactionDept) {
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

  public JVresponseAccountingEntity transactionIdentifier(String transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
    return this;
  }

 /**
   * Get transactionVersionNumber
   * @return transactionVersionNumber
  **/
  @JsonProperty("transactionVersionNumber")
  public Integer getTransactionVersionNumber() {
    return transactionVersionNumber;
  }

  public void setTransactionVersionNumber(Integer transactionVersionNumber) {
    this.transactionVersionNumber = transactionVersionNumber;
  }

  public JVresponseAccountingEntity transactionVersionNumber(Integer transactionVersionNumber) {
    this.transactionVersionNumber = transactionVersionNumber;
    return this;
  }

 /**
   * Get transactionAccountingNumber
   * @return transactionAccountingNumber
  **/
  @JsonProperty("transactionAccountingNumber")
  public Long getTransactionAccountingNumber() {
    return transactionAccountingNumber;
  }

  public void setTransactionAccountingNumber(Long transactionAccountingNumber) {
    this.transactionAccountingNumber = transactionAccountingNumber;
  }

  public JVresponseAccountingEntity transactionAccountingNumber(Long transactionAccountingNumber) {
    this.transactionAccountingNumber = transactionAccountingNumber;
    return this;
  }

 /**
   * Get accountingLine
   * @return accountingLine
  **/
  @JsonProperty("accountingLine")
  public Long getAccountingLine() {
    return accountingLine;
  }

  public void setAccountingLine(Long accountingLine) {
    this.accountingLine = accountingLine;
  }

  public JVresponseAccountingEntity accountingLine(Long accountingLine) {
    this.accountingLine = accountingLine;
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

  public JVresponseAccountingEntity transactionActionCode(Long transactionActionCode) {
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

  public JVresponseAccountingEntity transactionSubActionCode(Long transactionSubActionCode) {
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

  public JVresponseAccountingEntity transactionCreationDate(Date transactionCreationDate) {
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

  public JVresponseAccountingEntity transactionCreationUserID(String transactionCreationUserID) {
    this.transactionCreationUserID = transactionCreationUserID;
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

  public JVresponseAccountingEntity transactionSubFunctionCode(Long transactionSubFunctionCode) {
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

  public JVresponseAccountingEntity transactionLastDate(Date transactionLastDate) {
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

  public JVresponseAccountingEntity transactionLastUserID(String transactionLastUserID) {
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

  public JVresponseAccountingEntity transactionPhaseCode(String transactionPhaseCode) {
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

  public JVresponseAccountingEntity transactionPreviousVersionNumber(Long transactionPreviousVersionNumber) {
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

  public JVresponseAccountingEntity transactionUnit(String transactionUnit) {
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

  public JVresponseAccountingEntity objectAttachmentPrimaryGroupUniqueIdentifier(String objectAttachmentPrimaryGroupUniqueIdentifier) {
    this.objectAttachmentPrimaryGroupUniqueIdentifier = objectAttachmentPrimaryGroupUniqueIdentifier;
    return this;
  }

 /**
   * Get objectAttachmentSecondaryGroupTotal
   * @return objectAttachmentSecondaryGroupTotal
  **/
  @JsonProperty("objectAttachmentSecondaryGroupTotal")
  public Long getObjectAttachmentSecondaryGroupTotal() {
    return objectAttachmentSecondaryGroupTotal;
  }

  public void setObjectAttachmentSecondaryGroupTotal(Long objectAttachmentSecondaryGroupTotal) {
    this.objectAttachmentSecondaryGroupTotal = objectAttachmentSecondaryGroupTotal;
  }

  public JVresponseAccountingEntity objectAttachmentSecondaryGroupTotal(Long objectAttachmentSecondaryGroupTotal) {
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

  public JVresponseAccountingEntity objectAttachmentSecondaryUniqueIdentifier(Long objectAttachmentSecondaryUniqueIdentifier) {
    this.objectAttachmentSecondaryUniqueIdentifier = objectAttachmentSecondaryUniqueIdentifier;
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

  public JVresponseAccountingEntity budgetFY(Long budgetFY) {
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

  public JVresponseAccountingEntity fiscalYear(Long fiscalYear) {
    this.fiscalYear = fiscalYear;
    return this;
  }

 /**
   * Get period
   * @return period
  **/
  @JsonProperty("period")
 @Size(max=8)  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public JVresponseAccountingEntity period(String period) {
    this.period = period;
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

  public JVresponseAccountingEntity fiscalQuarter(Integer fiscalQuarter) {
    this.fiscalQuarter = fiscalQuarter;
    return this;
  }

 /**
   * Get creditAmount
   * @return creditAmount
  **/
  @JsonProperty("creditAmount")
  public Integer getCreditAmount() {
    return creditAmount;
  }

  public void setCreditAmount(Integer creditAmount) {
    this.creditAmount = creditAmount;
  }

  public JVresponseAccountingEntity creditAmount(Integer creditAmount) {
    this.creditAmount = creditAmount;
    return this;
  }

 /**
   * Get accountingTemplate
   * @return accountingTemplate
  **/
  @JsonProperty("accountingTemplate")
  public String getAccountingTemplate() {
    return accountingTemplate;
  }

  public void setAccountingTemplate(String accountingTemplate) {
    this.accountingTemplate = accountingTemplate;
  }

  public JVresponseAccountingEntity accountingTemplate(String accountingTemplate) {
    this.accountingTemplate = accountingTemplate;
    return this;
  }

 /**
   * Get lineFunction
   * @return lineFunction
  **/
  @JsonProperty("lineFunction")
  public Long getLineFunction() {
    return lineFunction;
  }

  public void setLineFunction(Long lineFunction) {
    this.lineFunction = lineFunction;
  }

  public JVresponseAccountingEntity lineFunction(Long lineFunction) {
    this.lineFunction = lineFunction;
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

  public JVresponseAccountingEntity referencedTransactionCode(String referencedTransactionCode) {
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

  public JVresponseAccountingEntity referencedTransactionDepartment(String referencedTransactionDepartment) {
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

  public JVresponseAccountingEntity referencedTransactionID(String referencedTransactionID) {
    this.referencedTransactionID = referencedTransactionID;
    return this;
  }

 /**
   * Get referencedVendorLine
   * @return referencedVendorLine
  **/
  @JsonProperty("referencedVendorLine")
  public Long getReferencedVendorLine() {
    return referencedVendorLine;
  }

  public void setReferencedVendorLine(Long referencedVendorLine) {
    this.referencedVendorLine = referencedVendorLine;
  }

  public JVresponseAccountingEntity referencedVendorLine(Long referencedVendorLine) {
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

  public JVresponseAccountingEntity referencedCommodityLine(Long referencedCommodityLine) {
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

  public JVresponseAccountingEntity referencedAccountingLine(Long referencedAccountingLine) {
    this.referencedAccountingLine = referencedAccountingLine;
    return this;
  }

 /**
   * Get vendorOrCustomer
   * @return vendorOrCustomer
  **/
  @JsonProperty("vendorOrCustomer")
 @Size(max=1)  public String getVendorOrCustomer() {
    return vendorOrCustomer;
  }

  public void setVendorOrCustomer(String vendorOrCustomer) {
    this.vendorOrCustomer = vendorOrCustomer;
  }

  public JVresponseAccountingEntity vendorOrCustomer(String vendorOrCustomer) {
    this.vendorOrCustomer = vendorOrCustomer;
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

  public JVresponseAccountingEntity legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

 /**
   * Get customerActiveStatus
   * @return customerActiveStatus
  **/
  @JsonProperty("customerActiveStatus")
  public Long getCustomerActiveStatus() {
    return customerActiveStatus;
  }

  public void setCustomerActiveStatus(Long customerActiveStatus) {
    this.customerActiveStatus = customerActiveStatus;
  }

  public JVresponseAccountingEntity customerActiveStatus(Long customerActiveStatus) {
    this.customerActiveStatus = customerActiveStatus;
    return this;
  }

 /**
   * Get customerApprovalStatus
   * @return customerApprovalStatus
  **/
  @JsonProperty("customerApprovalStatus")
  public Long getCustomerApprovalStatus() {
    return customerApprovalStatus;
  }

  public void setCustomerApprovalStatus(Long customerApprovalStatus) {
    this.customerApprovalStatus = customerApprovalStatus;
  }

  public JVresponseAccountingEntity customerApprovalStatus(Long customerApprovalStatus) {
    this.customerApprovalStatus = customerApprovalStatus;
    return this;
  }

 /**
   * Get vendorActiveStatus
   * @return vendorActiveStatus
  **/
  @JsonProperty("vendorActiveStatus")
  public Long getVendorActiveStatus() {
    return vendorActiveStatus;
  }

  public void setVendorActiveStatus(Long vendorActiveStatus) {
    this.vendorActiveStatus = vendorActiveStatus;
  }

  public JVresponseAccountingEntity vendorActiveStatus(Long vendorActiveStatus) {
    this.vendorActiveStatus = vendorActiveStatus;
    return this;
  }

 /**
   * Get vendorApprovalStatus
   * @return vendorApprovalStatus
  **/
  @JsonProperty("vendorApprovalStatus")
  public Long getVendorApprovalStatus() {
    return vendorApprovalStatus;
  }

  public void setVendorApprovalStatus(Long vendorApprovalStatus) {
    this.vendorApprovalStatus = vendorApprovalStatus;
  }

  public JVresponseAccountingEntity vendorApprovalStatus(Long vendorApprovalStatus) {
    this.vendorApprovalStatus = vendorApprovalStatus;
    return this;
  }

 /**
   * Get debitAmount
   * @return debitAmount
  **/
  @JsonProperty("debitAmount")
  public Integer getDebitAmount() {
    return debitAmount;
  }

  public void setDebitAmount(Integer debitAmount) {
    this.debitAmount = debitAmount;
  }

  public JVresponseAccountingEntity debitAmount(Integer debitAmount) {
    this.debitAmount = debitAmount;
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

  public JVresponseAccountingEntity fund(String fund) {
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

  public JVresponseAccountingEntity subFund(String subFund) {
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

  public JVresponseAccountingEntity fundClass(String fundClass) {
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

  public JVresponseAccountingEntity fundCategory(String fundCategory) {
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

  public JVresponseAccountingEntity fundType(String fundType) {
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

  public JVresponseAccountingEntity fundGroup(String fundGroup) {
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

  public JVresponseAccountingEntity cafrFundGroup(String cafrFundGroup) {
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

  public JVresponseAccountingEntity cafrFundType(String cafrFundType) {
    this.cafrFundType = cafrFundType;
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

  public JVresponseAccountingEntity object(String object) {
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

  public JVresponseAccountingEntity subObject(String subObject) {
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

  public JVresponseAccountingEntity objectClass(String objectClass) {
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

  public JVresponseAccountingEntity objectCategory(String objectCategory) {
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

  public JVresponseAccountingEntity objectType(String objectType) {
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

  public JVresponseAccountingEntity objectGroup(String objectGroup) {
    this.objectGroup = objectGroup;
    return this;
  }

 /**
   * Get majorCAFRExpenseType
   * @return majorCAFRExpenseType
  **/
  @JsonProperty("majorCAFRExpenseType")
  public String getMajorCAFRExpenseType() {
    return majorCAFRExpenseType;
  }

  public void setMajorCAFRExpenseType(String majorCAFRExpenseType) {
    this.majorCAFRExpenseType = majorCAFRExpenseType;
  }

  public JVresponseAccountingEntity majorCAFRExpenseType(String majorCAFRExpenseType) {
    this.majorCAFRExpenseType = majorCAFRExpenseType;
    return this;
  }

 /**
   * Get minorCAFRExpenseType
   * @return minorCAFRExpenseType
  **/
  @JsonProperty("minorCAFRExpenseType")
  public String getMinorCAFRExpenseType() {
    return minorCAFRExpenseType;
  }

  public void setMinorCAFRExpenseType(String minorCAFRExpenseType) {
    this.minorCAFRExpenseType = minorCAFRExpenseType;
  }

  public JVresponseAccountingEntity minorCAFRExpenseType(String minorCAFRExpenseType) {
    this.minorCAFRExpenseType = minorCAFRExpenseType;
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

  public JVresponseAccountingEntity revenue(String revenue) {
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

  public JVresponseAccountingEntity subRevenue(String subRevenue) {
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

  public JVresponseAccountingEntity revenueClass(String revenueClass) {
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

  public JVresponseAccountingEntity revenueCategory(String revenueCategory) {
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

  public JVresponseAccountingEntity revenueGroup(String revenueGroup) {
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

  public JVresponseAccountingEntity revenueType(String revenueType) {
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

  public JVresponseAccountingEntity majorCAFRRevenueType(String majorCAFRRevenueType) {
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

  public JVresponseAccountingEntity minorCAFRRevenueType(String minorCAFRRevenueType) {
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

  public JVresponseAccountingEntity bsa(String bsa) {
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

  public JVresponseAccountingEntity cashAccount(String cashAccount) {
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

  public JVresponseAccountingEntity memoAccount(Boolean memoAccount) {
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

  public JVresponseAccountingEntity accountType(Long accountType) {
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

  public JVresponseAccountingEntity subBSA(String subBSA) {
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

  public JVresponseAccountingEntity bsaClass(String bsaClass) {
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

  public JVresponseAccountingEntity bsaCategory(String bsaCategory) {
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

  public JVresponseAccountingEntity bsaGroup(String bsaGroup) {
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

  public JVresponseAccountingEntity bsaType(String bsaType) {
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

  public JVresponseAccountingEntity cafrMajorBSAGroup(String cafrMajorBSAGroup) {
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

  public JVresponseAccountingEntity cafrMinorBSAGroup(String cafrMinorBSAGroup) {
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

  public JVresponseAccountingEntity obsa(String obsa) {
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

  public JVresponseAccountingEntity subOBSA(String subOBSA) {
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

  public JVresponseAccountingEntity obsaClass(String obsaClass) {
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

  public JVresponseAccountingEntity obsaCategory(String obsaCategory) {
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

  public JVresponseAccountingEntity obsaGroup(String obsaGroup) {
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

  public JVresponseAccountingEntity obsaType(String obsaType) {
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

  public JVresponseAccountingEntity cmjrobsaGroup(String cmjrobsaGroup) {
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

  public JVresponseAccountingEntity cmnrobsaGroup(String cmnrobsaGroup) {
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

  public JVresponseAccountingEntity obsaType1(String obsaType1) {
    this.obsaType1 = obsaType1;
    return this;
  }

 /**
   * Get governmentBranch
   * @return governmentBranch
  **/
  @JsonProperty("governmentBranch")
 @Size(max=4)  public String getGovernmentBranch() {
    return governmentBranch;
  }

  public void setGovernmentBranch(String governmentBranch) {
    this.governmentBranch = governmentBranch;
  }

  public JVresponseAccountingEntity governmentBranch(String governmentBranch) {
    this.governmentBranch = governmentBranch;
    return this;
  }

 /**
   * Get cabinet
   * @return cabinet
  **/
  @JsonProperty("cabinet")
 @Size(max=4)  public String getCabinet() {
    return cabinet;
  }

  public void setCabinet(String cabinet) {
    this.cabinet = cabinet;
  }

  public JVresponseAccountingEntity cabinet(String cabinet) {
    this.cabinet = cabinet;
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

  public JVresponseAccountingEntity department(String department) {
    this.department = department;
    return this;
  }

 /**
   * Get division
   * @return division
  **/
  @JsonProperty("division")
  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public JVresponseAccountingEntity division(String division) {
    this.division = division;
    return this;
  }

 /**
   * Get group
   * @return group
  **/
  @JsonProperty("group")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public JVresponseAccountingEntity group(String group) {
    this.group = group;
    return this;
  }

 /**
   * Get section
   * @return section
  **/
  @JsonProperty("section")
  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public JVresponseAccountingEntity section(String section) {
    this.section = section;
    return this;
  }

 /**
   * Get district
   * @return district
  **/
  @JsonProperty("district")
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public JVresponseAccountingEntity district(String district) {
    this.district = district;
    return this;
  }

 /**
   * Get bureau
   * @return bureau
  **/
  @JsonProperty("bureau")
  public String getBureau() {
    return bureau;
  }

  public void setBureau(String bureau) {
    this.bureau = bureau;
  }

  public JVresponseAccountingEntity bureau(String bureau) {
    this.bureau = bureau;
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

  public JVresponseAccountingEntity unit(String unit) {
    this.unit = unit;
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

  public JVresponseAccountingEntity apprUnit(String apprUnit) {
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

  public JVresponseAccountingEntity apprClass(String apprClass) {
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

  public JVresponseAccountingEntity apprCategory(String apprCategory) {
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

  public JVresponseAccountingEntity apprType(String apprType) {
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

  public JVresponseAccountingEntity apprGroup(String apprGroup) {
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

  public JVresponseAccountingEntity location(String location) {
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

  public JVresponseAccountingEntity subLocation(String subLocation) {
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

  public JVresponseAccountingEntity locationClass(String locationClass) {
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

  public JVresponseAccountingEntity locationCategory(String locationCategory) {
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

  public JVresponseAccountingEntity locationType(String locationType) {
    this.locationType = locationType;
    return this;
  }

 /**
   * Get county
   * @return county
  **/
  @JsonProperty("county")
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public JVresponseAccountingEntity county(String county) {
    this.county = county;
    return this;
  }

 /**
   * Get activity
   * @return activity
  **/
  @JsonProperty("activity")
 @Size(max=4)  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }

  public JVresponseAccountingEntity activity(String activity) {
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

  public JVresponseAccountingEntity subActivity(String subActivity) {
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

  public JVresponseAccountingEntity activityClass(String activityClass) {
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

  public JVresponseAccountingEntity activityCategory(String activityCategory) {
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

  public JVresponseAccountingEntity activityType(String activityType) {
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

  public JVresponseAccountingEntity activityGroup(String activityGroup) {
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

  public JVresponseAccountingEntity cafrActivityUnit(String cafrActivityUnit) {
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

  public JVresponseAccountingEntity majorCAFRActivityType(String majorCAFRActivityType) {
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

  public JVresponseAccountingEntity minorCAFRActivityType(String minorCAFRActivityType) {
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

  public JVresponseAccountingEntity function(String function) {
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

  public JVresponseAccountingEntity subFunction(String subFunction) {
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

  public JVresponseAccountingEntity functionClass(String functionClass) {
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

  public JVresponseAccountingEntity functionCategory(String functionCategory) {
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

  public JVresponseAccountingEntity functionType(String functionType) {
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

  public JVresponseAccountingEntity functionGroup(String functionGroup) {
    this.functionGroup = functionGroup;
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

  public JVresponseAccountingEntity reporting(String reporting) {
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

  public JVresponseAccountingEntity subReporting(String subReporting) {
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

  public JVresponseAccountingEntity reportingClass(String reportingClass) {
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

  public JVresponseAccountingEntity reportingCategory(String reportingCategory) {
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

  public JVresponseAccountingEntity reportingType(String reportingType) {
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

  public JVresponseAccountingEntity reportingGroup(String reportingGroup) {
    this.reportingGroup = reportingGroup;
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

  public JVresponseAccountingEntity deptObject(String deptObject) {
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

  public JVresponseAccountingEntity deptObjectClass(String deptObjectClass) {
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

  public JVresponseAccountingEntity deptObjectCategory(String deptObjectCategory) {
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

  public JVresponseAccountingEntity deptObjectType(String deptObjectType) {
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

  public JVresponseAccountingEntity deptObjectGroup(String deptObjectGroup) {
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

  public JVresponseAccountingEntity deptRevenue(String deptRevenue) {
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

  public JVresponseAccountingEntity deptRevenueClass(String deptRevenueClass) {
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

  public JVresponseAccountingEntity deptRevenueCategory(String deptRevenueCategory) {
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

  public JVresponseAccountingEntity deptRevenueType(String deptRevenueType) {
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

  public JVresponseAccountingEntity deptRevenueGroup(String deptRevenueGroup) {
    this.deptRevenueGroup = deptRevenueGroup;
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

  public JVresponseAccountingEntity task(String task) {
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

  public JVresponseAccountingEntity subTask(String subTask) {
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

  public JVresponseAccountingEntity taskOrder(String taskOrder) {
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

  public JVresponseAccountingEntity majorProgram(String majorProgram) {
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

  public JVresponseAccountingEntity majorProgramClass(String majorProgramClass) {
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

  public JVresponseAccountingEntity majorProgramCategory(String majorProgramCategory) {
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

  public JVresponseAccountingEntity majorProgramGroup(String majorProgramGroup) {
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

  public JVresponseAccountingEntity majorProgramType(String majorProgramType) {
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

  public JVresponseAccountingEntity program(String program) {
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

  public JVresponseAccountingEntity phase(String phase) {
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

  public JVresponseAccountingEntity programClass(String programClass) {
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

  public JVresponseAccountingEntity programCategory(String programCategory) {
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

  public JVresponseAccountingEntity programType(String programType) {
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

  public JVresponseAccountingEntity programGroup(String programGroup) {
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

  public JVresponseAccountingEntity programPeriod(String programPeriod) {
    this.programPeriod = programPeriod;
    return this;
  }

 /**
   * Get fundingProfile
   * @return fundingProfile
  **/
  @JsonProperty("fundingProfile")
  public String getFundingProfile() {
    return fundingProfile;
  }

  public void setFundingProfile(String fundingProfile) {
    this.fundingProfile = fundingProfile;
  }

  public JVresponseAccountingEntity fundingProfile(String fundingProfile) {
    this.fundingProfile = fundingProfile;
    return this;
  }

 /**
   * Get performanceUnitOfMeasure
   * @return performanceUnitOfMeasure
  **/
  @JsonProperty("performanceUnitOfMeasure")
  public String getPerformanceUnitOfMeasure() {
    return performanceUnitOfMeasure;
  }

  public void setPerformanceUnitOfMeasure(String performanceUnitOfMeasure) {
    this.performanceUnitOfMeasure = performanceUnitOfMeasure;
  }

  public JVresponseAccountingEntity performanceUnitOfMeasure(String performanceUnitOfMeasure) {
    this.performanceUnitOfMeasure = performanceUnitOfMeasure;
    return this;
  }

 /**
   * Get lineDescription
   * @return lineDescription
  **/
  @JsonProperty("lineDescription")
 @Size(max=100)  public String getLineDescription() {
    return lineDescription;
  }

  public void setLineDescription(String lineDescription) {
    this.lineDescription = lineDescription;
  }

  public JVresponseAccountingEntity lineDescription(String lineDescription) {
    this.lineDescription = lineDescription;
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

  public JVresponseAccountingEntity eventType(String eventType) {
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

  public JVresponseAccountingEntity postingPair(String postingPair) {
    this.postingPair = postingPair;
    return this;
  }

 /**
   * Get postingCode
   * @return postingCode
  **/
  @JsonProperty("postingCode")
 @Size(max=4)  public String getPostingCode() {
    return postingCode;
  }

  public void setPostingCode(String postingCode) {
    this.postingCode = postingCode;
  }

  public JVresponseAccountingEntity postingCode(String postingCode) {
    this.postingCode = postingCode;
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

  public JVresponseAccountingEntity internalFund(String internalFund) {
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

  public JVresponseAccountingEntity internalSubFund(String internalSubFund) {
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

  public JVresponseAccountingEntity internalDept(String internalDept) {
    this.internalDept = internalDept;
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

  public JVresponseAccountingEntity lineGroup(Long lineGroup) {
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

  public JVresponseAccountingEntity referenceType1(String referenceType1) {
    this.referenceType1 = referenceType1;
    return this;
  }

 /**
   * Get postingCodeName
   * @return postingCodeName
  **/
  @JsonProperty("postingCodeName")
  public String getPostingCodeName() {
    return postingCodeName;
  }

  public void setPostingCodeName(String postingCodeName) {
    this.postingCodeName = postingCodeName;
  }

  public JVresponseAccountingEntity postingCodeName(String postingCodeName) {
    this.postingCodeName = postingCodeName;
    return this;
  }

 /**
   * Get cashAccount1
   * @return cashAccount1
  **/
  @JsonProperty("cashAccount1")
  public Boolean isCashAccount1() {
    return cashAccount1;
  }

  public void setCashAccount1(Boolean cashAccount1) {
    this.cashAccount1 = cashAccount1;
  }

  public JVresponseAccountingEntity cashAccount1(Boolean cashAccount1) {
    this.cashAccount1 = cashAccount1;
    return this;
  }

 /**
   * Get memoAccount1
   * @return memoAccount1
  **/
  @JsonProperty("memoAccount1")
  public Boolean isMemoAccount1() {
    return memoAccount1;
  }

  public void setMemoAccount1(Boolean memoAccount1) {
    this.memoAccount1 = memoAccount1;
  }

  public JVresponseAccountingEntity memoAccount1(Boolean memoAccount1) {
    this.memoAccount1 = memoAccount1;
    return this;
  }

 /**
   * Get accountType1
   * @return accountType1
  **/
  @JsonProperty("accountType1")
  public Long getAccountType1() {
    return accountType1;
  }

  public void setAccountType1(Long accountType1) {
    this.accountType1 = accountType1;
  }

  public JVresponseAccountingEntity accountType1(Long accountType1) {
    this.accountType1 = accountType1;
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

  public JVresponseAccountingEntity postingPairName(String postingPairName) {
    this.postingPairName = postingPairName;
    return this;
  }

 /**
   * Get lineGroupLineNumber
   * @return lineGroupLineNumber
  **/
  @JsonProperty("lineGroupLineNumber")
  public Long getLineGroupLineNumber() {
    return lineGroupLineNumber;
  }

  public void setLineGroupLineNumber(Long lineGroupLineNumber) {
    this.lineGroupLineNumber = lineGroupLineNumber;
  }

  public JVresponseAccountingEntity lineGroupLineNumber(Long lineGroupLineNumber) {
    this.lineGroupLineNumber = lineGroupLineNumber;
    return this;
  }

 /**
   * Get offsetFlag
   * @return offsetFlag
  **/
  @JsonProperty("offsetFlag")
  public Boolean isOffsetFlag() {
    return offsetFlag;
  }

  public void setOffsetFlag(Boolean offsetFlag) {
    this.offsetFlag = offsetFlag;
  }

  public JVresponseAccountingEntity offsetFlag(Boolean offsetFlag) {
    this.offsetFlag = offsetFlag;
    return this;
  }

 /**
   * Get subUnit
   * @return subUnit
  **/
  @JsonProperty("subUnit")
  public String getSubUnit() {
    return subUnit;
  }

  public void setSubUnit(String subUnit) {
    this.subUnit = subUnit;
  }

  public JVresponseAccountingEntity subUnit(String subUnit) {
    this.subUnit = subUnit;
    return this;
  }

 /**
   * Get bank
   * @return bank
  **/
  @JsonProperty("bank")
  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public JVresponseAccountingEntity bank(String bank) {
    this.bank = bank;
    return this;
  }

 /**
   * Get fundingPriority
   * @return fundingPriority
  **/
  @JsonProperty("fundingPriority")
  public String getFundingPriority() {
    return fundingPriority;
  }

  public void setFundingPriority(String fundingPriority) {
    this.fundingPriority = fundingPriority;
  }

  public JVresponseAccountingEntity fundingPriority(String fundingPriority) {
    this.fundingPriority = fundingPriority;
    return this;
  }

 /**
   * Get fundingLine
   * @return fundingLine
  **/
  @JsonProperty("fundingLine")
  public String getFundingLine() {
    return fundingLine;
  }

  public void setFundingLine(String fundingLine) {
    this.fundingLine = fundingLine;
  }

  public JVresponseAccountingEntity fundingLine(String fundingLine) {
    this.fundingLine = fundingLine;
    return this;
  }

 /**
   * Get accountingClassification
   * @return accountingClassification
  **/
  @JsonProperty("accountingClassification")
  public Long getAccountingClassification() {
    return accountingClassification;
  }

  public void setAccountingClassification(Long accountingClassification) {
    this.accountingClassification = accountingClassification;
  }

  public JVresponseAccountingEntity accountingClassification(Long accountingClassification) {
    this.accountingClassification = accountingClassification;
    return this;
  }

 /**
   * Get quantity
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public JVresponseAccountingEntity quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
   * Get humanResourceMeasure
   * @return humanResourceMeasure
  **/
  @JsonProperty("humanResourceMeasure")
  public String getHumanResourceMeasure() {
    return humanResourceMeasure;
  }

  public void setHumanResourceMeasure(String humanResourceMeasure) {
    this.humanResourceMeasure = humanResourceMeasure;
  }

  public JVresponseAccountingEntity humanResourceMeasure(String humanResourceMeasure) {
    this.humanResourceMeasure = humanResourceMeasure;
    return this;
  }

 /**
   * Get taxpayerIDNumber
   * @return taxpayerIDNumber
  **/
  @JsonProperty("taxpayerIDNumber")
  public String getTaxpayerIDNumber() {
    return taxpayerIDNumber;
  }

  public void setTaxpayerIDNumber(String taxpayerIDNumber) {
    this.taxpayerIDNumber = taxpayerIDNumber;
  }

  public JVresponseAccountingEntity taxpayerIDNumber(String taxpayerIDNumber) {
    this.taxpayerIDNumber = taxpayerIDNumber;
    return this;
  }

 /**
   * Get taxpayerIDType
   * @return taxpayerIDType
  **/
  @JsonProperty("taxpayerIDType")
  public String getTaxpayerIDType() {
    return taxpayerIDType;
  }

  public void setTaxpayerIDType(String taxpayerIDType) {
    this.taxpayerIDType = taxpayerIDType;
  }

  public JVresponseAccountingEntity taxpayerIDType(String taxpayerIDType) {
    this.taxpayerIDType = taxpayerIDType;
    return this;
  }

 /**
   * Get batchLoaded
   * @return batchLoaded
  **/
  @JsonProperty("batchLoaded")
  public String getBatchLoaded() {
    return batchLoaded;
  }

  public void setBatchLoaded(String batchLoaded) {
    this.batchLoaded = batchLoaded;
  }

  public JVresponseAccountingEntity batchLoaded(String batchLoaded) {
    this.batchLoaded = batchLoaded;
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

  public JVresponseAccountingEntity debtID(String debtID) {
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

  public JVresponseAccountingEntity authorizationDebtInstrument(String authorizationDebtInstrument) {
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

  public JVresponseAccountingEntity extensionStorageUniqueID(Long extensionStorageUniqueID) {
    this.extensionStorageUniqueID = extensionStorageUniqueID;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JVresponseAccountingEntity {\n");
    
    sb.append("    transactionCategory: ").append(toIndentedString(transactionCategory)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
    sb.append("    transactionDept: ").append(toIndentedString(transactionDept)).append("\n");
    sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
    sb.append("    transactionVersionNumber: ").append(toIndentedString(transactionVersionNumber)).append("\n");
    sb.append("    transactionAccountingNumber: ").append(toIndentedString(transactionAccountingNumber)).append("\n");
    sb.append("    accountingLine: ").append(toIndentedString(accountingLine)).append("\n");
    sb.append("    transactionActionCode: ").append(toIndentedString(transactionActionCode)).append("\n");
    sb.append("    transactionSubActionCode: ").append(toIndentedString(transactionSubActionCode)).append("\n");
    sb.append("    transactionCreationDate: ").append(toIndentedString(transactionCreationDate)).append("\n");
    sb.append("    transactionCreationUserID: ").append(toIndentedString(transactionCreationUserID)).append("\n");
    sb.append("    transactionSubFunctionCode: ").append(toIndentedString(transactionSubFunctionCode)).append("\n");
    sb.append("    transactionLastDate: ").append(toIndentedString(transactionLastDate)).append("\n");
    sb.append("    transactionLastUserID: ").append(toIndentedString(transactionLastUserID)).append("\n");
    sb.append("    transactionPhaseCode: ").append(toIndentedString(transactionPhaseCode)).append("\n");
    sb.append("    transactionPreviousVersionNumber: ").append(toIndentedString(transactionPreviousVersionNumber)).append("\n");
    sb.append("    transactionUnit: ").append(toIndentedString(transactionUnit)).append("\n");
    sb.append("    objectAttachmentPrimaryGroupUniqueIdentifier: ").append(toIndentedString(objectAttachmentPrimaryGroupUniqueIdentifier)).append("\n");
    sb.append("    objectAttachmentSecondaryGroupTotal: ").append(toIndentedString(objectAttachmentSecondaryGroupTotal)).append("\n");
    sb.append("    objectAttachmentSecondaryUniqueIdentifier: ").append(toIndentedString(objectAttachmentSecondaryUniqueIdentifier)).append("\n");
    sb.append("    budgetFY: ").append(toIndentedString(budgetFY)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    fiscalQuarter: ").append(toIndentedString(fiscalQuarter)).append("\n");
    sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
    sb.append("    accountingTemplate: ").append(toIndentedString(accountingTemplate)).append("\n");
    sb.append("    lineFunction: ").append(toIndentedString(lineFunction)).append("\n");
    sb.append("    referencedTransactionCode: ").append(toIndentedString(referencedTransactionCode)).append("\n");
    sb.append("    referencedTransactionDepartment: ").append(toIndentedString(referencedTransactionDepartment)).append("\n");
    sb.append("    referencedTransactionID: ").append(toIndentedString(referencedTransactionID)).append("\n");
    sb.append("    referencedVendorLine: ").append(toIndentedString(referencedVendorLine)).append("\n");
    sb.append("    referencedCommodityLine: ").append(toIndentedString(referencedCommodityLine)).append("\n");
    sb.append("    referencedAccountingLine: ").append(toIndentedString(referencedAccountingLine)).append("\n");
    sb.append("    vendorOrCustomer: ").append(toIndentedString(vendorOrCustomer)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    customerActiveStatus: ").append(toIndentedString(customerActiveStatus)).append("\n");
    sb.append("    customerApprovalStatus: ").append(toIndentedString(customerApprovalStatus)).append("\n");
    sb.append("    vendorActiveStatus: ").append(toIndentedString(vendorActiveStatus)).append("\n");
    sb.append("    vendorApprovalStatus: ").append(toIndentedString(vendorApprovalStatus)).append("\n");
    sb.append("    debitAmount: ").append(toIndentedString(debitAmount)).append("\n");
    sb.append("    fund: ").append(toIndentedString(fund)).append("\n");
    sb.append("    subFund: ").append(toIndentedString(subFund)).append("\n");
    sb.append("    fundClass: ").append(toIndentedString(fundClass)).append("\n");
    sb.append("    fundCategory: ").append(toIndentedString(fundCategory)).append("\n");
    sb.append("    fundType: ").append(toIndentedString(fundType)).append("\n");
    sb.append("    fundGroup: ").append(toIndentedString(fundGroup)).append("\n");
    sb.append("    cafrFundGroup: ").append(toIndentedString(cafrFundGroup)).append("\n");
    sb.append("    cafrFundType: ").append(toIndentedString(cafrFundType)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    subObject: ").append(toIndentedString(subObject)).append("\n");
    sb.append("    objectClass: ").append(toIndentedString(objectClass)).append("\n");
    sb.append("    objectCategory: ").append(toIndentedString(objectCategory)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    objectGroup: ").append(toIndentedString(objectGroup)).append("\n");
    sb.append("    majorCAFRExpenseType: ").append(toIndentedString(majorCAFRExpenseType)).append("\n");
    sb.append("    minorCAFRExpenseType: ").append(toIndentedString(minorCAFRExpenseType)).append("\n");
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
    sb.append("    governmentBranch: ").append(toIndentedString(governmentBranch)).append("\n");
    sb.append("    cabinet: ").append(toIndentedString(cabinet)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    bureau: ").append(toIndentedString(bureau)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
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
    sb.append("    reporting: ").append(toIndentedString(reporting)).append("\n");
    sb.append("    subReporting: ").append(toIndentedString(subReporting)).append("\n");
    sb.append("    reportingClass: ").append(toIndentedString(reportingClass)).append("\n");
    sb.append("    reportingCategory: ").append(toIndentedString(reportingCategory)).append("\n");
    sb.append("    reportingType: ").append(toIndentedString(reportingType)).append("\n");
    sb.append("    reportingGroup: ").append(toIndentedString(reportingGroup)).append("\n");
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
    sb.append("    fundingProfile: ").append(toIndentedString(fundingProfile)).append("\n");
    sb.append("    performanceUnitOfMeasure: ").append(toIndentedString(performanceUnitOfMeasure)).append("\n");
    sb.append("    lineDescription: ").append(toIndentedString(lineDescription)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    postingPair: ").append(toIndentedString(postingPair)).append("\n");
    sb.append("    postingCode: ").append(toIndentedString(postingCode)).append("\n");
    sb.append("    internalFund: ").append(toIndentedString(internalFund)).append("\n");
    sb.append("    internalSubFund: ").append(toIndentedString(internalSubFund)).append("\n");
    sb.append("    internalDept: ").append(toIndentedString(internalDept)).append("\n");
    sb.append("    lineGroup: ").append(toIndentedString(lineGroup)).append("\n");
    sb.append("    referenceType1: ").append(toIndentedString(referenceType1)).append("\n");
    sb.append("    postingCodeName: ").append(toIndentedString(postingCodeName)).append("\n");
    sb.append("    cashAccount1: ").append(toIndentedString(cashAccount1)).append("\n");
    sb.append("    memoAccount1: ").append(toIndentedString(memoAccount1)).append("\n");
    sb.append("    accountType1: ").append(toIndentedString(accountType1)).append("\n");
    sb.append("    postingPairName: ").append(toIndentedString(postingPairName)).append("\n");
    sb.append("    lineGroupLineNumber: ").append(toIndentedString(lineGroupLineNumber)).append("\n");
    sb.append("    offsetFlag: ").append(toIndentedString(offsetFlag)).append("\n");
    sb.append("    subUnit: ").append(toIndentedString(subUnit)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    fundingPriority: ").append(toIndentedString(fundingPriority)).append("\n");
    sb.append("    fundingLine: ").append(toIndentedString(fundingLine)).append("\n");
    sb.append("    accountingClassification: ").append(toIndentedString(accountingClassification)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    humanResourceMeasure: ").append(toIndentedString(humanResourceMeasure)).append("\n");
    sb.append("    taxpayerIDNumber: ").append(toIndentedString(taxpayerIDNumber)).append("\n");
    sb.append("    taxpayerIDType: ").append(toIndentedString(taxpayerIDType)).append("\n");
    sb.append("    batchLoaded: ").append(toIndentedString(batchLoaded)).append("\n");
    sb.append("    debtID: ").append(toIndentedString(debtID)).append("\n");
    sb.append("    authorizationDebtInstrument: ").append(toIndentedString(authorizationDebtInstrument)).append("\n");
    sb.append("    extensionStorageUniqueID: ").append(toIndentedString(extensionStorageUniqueID)).append("\n");
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

