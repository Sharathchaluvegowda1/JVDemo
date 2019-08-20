package com.cgi.adv.connect.jv.model;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class JVresponseEntity  {
  
  @ApiModelProperty(value = "")
  private String transactionDept = null;

  @ApiModelProperty(value = "")
  private Boolean active = null;

  @ApiModelProperty(value = "")
  private Date createdOn = null;

  @ApiModelProperty(value = "")
  private Date modifiedOn = null;

  @ApiModelProperty(value = "")
  private String modifiedBy = null;

  @ApiModelProperty(value = "")
  private String transactionStatus = null;

  @ApiModelProperty(value = "")
  private String transactionUnit = null;

  @ApiModelProperty(value = "")
  private Long overrideErrorCode = null;

  @ApiModelProperty(value = "")
  private Boolean workflowBypassApprovalIndicator = null;

  @ApiModelProperty(value = "")
  private Long objectAttachmentPrimaryGroupTotal = null;

  @ApiModelProperty(value = "")
  private String objectAttachmentPrimaryGroupUniqueIdentifier = null;

  @ApiModelProperty(value = "")
  private Long objectAttachmentSecondaryGroupTotal = null;

  @ApiModelProperty(value = "")
  private Long objectAttachmentSecondaryGroupUniqueIdentifier = null;

  @ApiModelProperty(value = "")
  private String packetDept = null;

  @ApiModelProperty(value = "")
  private String transactionDept1 = null;

  @ApiModelProperty(value = "")
  private LocalDate recordDate = null;

  @ApiModelProperty(value = "")
  private Long budgetFY = null;

  @ApiModelProperty(value = "")
  private Long fiscalYear = null;

  @ApiModelProperty(value = "")
  private String period = null;

  @ApiModelProperty(value = "")
  private Integer fiscalQuarter = null;

  @ApiModelProperty(value = "")
  private String transactionDescription = null;

  @ApiModelProperty(value = "")
  private String transactionName = null;

  @ApiModelProperty(value = "")
  private LocalDate reversalDate = null;

  @ApiModelProperty(value = "")
  private Boolean reversalHold = null;

  @ApiModelProperty(value = "")
  private Boolean budgetControlReduction = null;

  @ApiModelProperty(value = "")
  private Boolean fundBalanceControlReduction = null;

  @ApiModelProperty(value = "")
  private Boolean cashBalanceControlReduction = null;

  @ApiModelProperty(value = "")
  private Integer totalCredits = null;

  @ApiModelProperty(value = "")
  private Integer totalDebits = null;

  @ApiModelProperty(value = "")
  private Long lineGroupCount = null;

  @ApiModelProperty(value = "")
  private String extendedDescription = null;

  @ApiModelProperty(value = "")
  private String overrideUserID = null;

  @ApiModelProperty(value = "")
  private LocalDate createdOn1 = null;

  @ApiModelProperty(value = "")
  private LocalDate modifiedOn1 = null;

  @ApiModelProperty(value = "")
  private Long contactCode = null;

  @ApiModelProperty(value = "")
  private String email = null;

  @ApiModelProperty(value = "")
  private String phoneNumber = null;

  @ApiModelProperty(value = "")
  private String lastName = null;

  @ApiModelProperty(value = "")
  private String firstName = null;

  @ApiModelProperty(value = "")
  private String user = null;

  @ApiModelProperty(value = "")
  private LocalDate payDate = null;

  @ApiModelProperty(value = "")
  private LocalDate payPeriodEndDate = null;

  @ApiModelProperty(value = "")
  private Boolean lastPayrollMonth = null;

  @ApiModelProperty(value = "")
  private String payCycle = null;

  @ApiModelProperty(value = "")
  private String escrowID = null;

  @ApiModelProperty(value = "")
  private Boolean additionalTransactionInformation = null;

  @ApiModelProperty(value = "")
  private Long extensionStorageUniqueID = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<JVresponseLineGroupEntity> jvresponseLineGroupEntity = null;
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

  public JVresponseEntity transactionDept(String transactionDept) {
    this.transactionDept = transactionDept;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public JVresponseEntity active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get createdOn
   * @return createdOn
  **/
  @JsonProperty("createdOn")
  public Date getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Date createdOn) {
    this.createdOn = createdOn;
  }

  public JVresponseEntity createdOn(Date createdOn) {
    this.createdOn = createdOn;
    return this;
  }

 /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @JsonProperty("modifiedOn")
  public Date getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(Date modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public JVresponseEntity modifiedOn(Date modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

 /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @JsonProperty("modifiedBy")
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public JVresponseEntity modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

 /**
   * Get transactionStatus
   * @return transactionStatus
  **/
  @JsonProperty("transactionStatus")
 @Size(max=1)  public String getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public JVresponseEntity transactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
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

  public JVresponseEntity transactionUnit(String transactionUnit) {
    this.transactionUnit = transactionUnit;
    return this;
  }

 /**
   * Get overrideErrorCode
   * @return overrideErrorCode
  **/
  @JsonProperty("overrideErrorCode")
  public Long getOverrideErrorCode() {
    return overrideErrorCode;
  }

  public void setOverrideErrorCode(Long overrideErrorCode) {
    this.overrideErrorCode = overrideErrorCode;
  }

  public JVresponseEntity overrideErrorCode(Long overrideErrorCode) {
    this.overrideErrorCode = overrideErrorCode;
    return this;
  }

 /**
   * Get workflowBypassApprovalIndicator
   * @return workflowBypassApprovalIndicator
  **/
  @JsonProperty("workflowBypassApprovalIndicator")
  public Boolean isWorkflowBypassApprovalIndicator() {
    return workflowBypassApprovalIndicator;
  }

  public void setWorkflowBypassApprovalIndicator(Boolean workflowBypassApprovalIndicator) {
    this.workflowBypassApprovalIndicator = workflowBypassApprovalIndicator;
  }

  public JVresponseEntity workflowBypassApprovalIndicator(Boolean workflowBypassApprovalIndicator) {
    this.workflowBypassApprovalIndicator = workflowBypassApprovalIndicator;
    return this;
  }

 /**
   * Get objectAttachmentPrimaryGroupTotal
   * @return objectAttachmentPrimaryGroupTotal
  **/
  @JsonProperty("objectAttachmentPrimaryGroupTotal")
  public Long getObjectAttachmentPrimaryGroupTotal() {
    return objectAttachmentPrimaryGroupTotal;
  }

  public void setObjectAttachmentPrimaryGroupTotal(Long objectAttachmentPrimaryGroupTotal) {
    this.objectAttachmentPrimaryGroupTotal = objectAttachmentPrimaryGroupTotal;
  }

  public JVresponseEntity objectAttachmentPrimaryGroupTotal(Long objectAttachmentPrimaryGroupTotal) {
    this.objectAttachmentPrimaryGroupTotal = objectAttachmentPrimaryGroupTotal;
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

  public JVresponseEntity objectAttachmentPrimaryGroupUniqueIdentifier(String objectAttachmentPrimaryGroupUniqueIdentifier) {
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

  public JVresponseEntity objectAttachmentSecondaryGroupTotal(Long objectAttachmentSecondaryGroupTotal) {
    this.objectAttachmentSecondaryGroupTotal = objectAttachmentSecondaryGroupTotal;
    return this;
  }

 /**
   * Get objectAttachmentSecondaryGroupUniqueIdentifier
   * @return objectAttachmentSecondaryGroupUniqueIdentifier
  **/
  @JsonProperty("objectAttachmentSecondaryGroupUniqueIdentifier")
  public Long getObjectAttachmentSecondaryGroupUniqueIdentifier() {
    return objectAttachmentSecondaryGroupUniqueIdentifier;
  }

  public void setObjectAttachmentSecondaryGroupUniqueIdentifier(Long objectAttachmentSecondaryGroupUniqueIdentifier) {
    this.objectAttachmentSecondaryGroupUniqueIdentifier = objectAttachmentSecondaryGroupUniqueIdentifier;
  }

  public JVresponseEntity objectAttachmentSecondaryGroupUniqueIdentifier(Long objectAttachmentSecondaryGroupUniqueIdentifier) {
    this.objectAttachmentSecondaryGroupUniqueIdentifier = objectAttachmentSecondaryGroupUniqueIdentifier;
    return this;
  }

 /**
   * Get packetDept
   * @return packetDept
  **/
  @JsonProperty("packetDept")
  public String getPacketDept() {
    return packetDept;
  }

  public void setPacketDept(String packetDept) {
    this.packetDept = packetDept;
  }

  public JVresponseEntity packetDept(String packetDept) {
    this.packetDept = packetDept;
    return this;
  }

 /**
   * Get transactionDept1
   * @return transactionDept1
  **/
  @JsonProperty("transactionDept1")
  public String getTransactionDept1() {
    return transactionDept1;
  }

  public void setTransactionDept1(String transactionDept1) {
    this.transactionDept1 = transactionDept1;
  }

  public JVresponseEntity transactionDept1(String transactionDept1) {
    this.transactionDept1 = transactionDept1;
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

  public JVresponseEntity recordDate(LocalDate recordDate) {
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

  public JVresponseEntity budgetFY(Long budgetFY) {
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

  public JVresponseEntity fiscalYear(Long fiscalYear) {
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

  public JVresponseEntity period(String period) {
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

  public JVresponseEntity fiscalQuarter(Integer fiscalQuarter) {
    this.fiscalQuarter = fiscalQuarter;
    return this;
  }

 /**
   * Get transactionDescription
   * @return transactionDescription
  **/
  @JsonProperty("transactionDescription")
  public String getTransactionDescription() {
    return transactionDescription;
  }

  public void setTransactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
  }

  public JVresponseEntity transactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
    return this;
  }

 /**
   * Get transactionName
   * @return transactionName
  **/
  @JsonProperty("transactionName")
 @Size(max=20)  public String getTransactionName() {
    return transactionName;
  }

  public void setTransactionName(String transactionName) {
    this.transactionName = transactionName;
  }

  public JVresponseEntity transactionName(String transactionName) {
    this.transactionName = transactionName;
    return this;
  }

 /**
   * Get reversalDate
   * @return reversalDate
  **/
  @JsonProperty("reversalDate")
  public LocalDate getReversalDate() {
    return reversalDate;
  }

  public void setReversalDate(LocalDate reversalDate) {
    this.reversalDate = reversalDate;
  }

  public JVresponseEntity reversalDate(LocalDate reversalDate) {
    this.reversalDate = reversalDate;
    return this;
  }

 /**
   * Get reversalHold
   * @return reversalHold
  **/
  @JsonProperty("reversalHold")
  public Boolean isReversalHold() {
    return reversalHold;
  }

  public void setReversalHold(Boolean reversalHold) {
    this.reversalHold = reversalHold;
  }

  public JVresponseEntity reversalHold(Boolean reversalHold) {
    this.reversalHold = reversalHold;
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

  public JVresponseEntity budgetControlReduction(Boolean budgetControlReduction) {
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

  public JVresponseEntity fundBalanceControlReduction(Boolean fundBalanceControlReduction) {
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

  public JVresponseEntity cashBalanceControlReduction(Boolean cashBalanceControlReduction) {
    this.cashBalanceControlReduction = cashBalanceControlReduction;
    return this;
  }

 /**
   * Get totalCredits
   * @return totalCredits
  **/
  @JsonProperty("totalCredits")
  public Integer getTotalCredits() {
    return totalCredits;
  }

  public void setTotalCredits(Integer totalCredits) {
    this.totalCredits = totalCredits;
  }

  public JVresponseEntity totalCredits(Integer totalCredits) {
    this.totalCredits = totalCredits;
    return this;
  }

 /**
   * Get totalDebits
   * @return totalDebits
  **/
  @JsonProperty("totalDebits")
  public Integer getTotalDebits() {
    return totalDebits;
  }

  public void setTotalDebits(Integer totalDebits) {
    this.totalDebits = totalDebits;
  }

  public JVresponseEntity totalDebits(Integer totalDebits) {
    this.totalDebits = totalDebits;
    return this;
  }

 /**
   * Get lineGroupCount
   * @return lineGroupCount
  **/
  @JsonProperty("lineGroupCount")
  public Long getLineGroupCount() {
    return lineGroupCount;
  }

  public void setLineGroupCount(Long lineGroupCount) {
    this.lineGroupCount = lineGroupCount;
  }

  public JVresponseEntity lineGroupCount(Long lineGroupCount) {
    this.lineGroupCount = lineGroupCount;
    return this;
  }

 /**
   * Get extendedDescription
   * @return extendedDescription
  **/
  @JsonProperty("extendedDescription")
  public String getExtendedDescription() {
    return extendedDescription;
  }

  public void setExtendedDescription(String extendedDescription) {
    this.extendedDescription = extendedDescription;
  }

  public JVresponseEntity extendedDescription(String extendedDescription) {
    this.extendedDescription = extendedDescription;
    return this;
  }

 /**
   * Get overrideUserID
   * @return overrideUserID
  **/
  @JsonProperty("overrideUserID")
  public String getOverrideUserID() {
    return overrideUserID;
  }

  public void setOverrideUserID(String overrideUserID) {
    this.overrideUserID = overrideUserID;
  }

  public JVresponseEntity overrideUserID(String overrideUserID) {
    this.overrideUserID = overrideUserID;
    return this;
  }

 /**
   * Get createdOn1
   * @return createdOn1
  **/
  @JsonProperty("createdOn1")
  public LocalDate getCreatedOn1() {
    return createdOn1;
  }

  public void setCreatedOn1(LocalDate createdOn1) {
    this.createdOn1 = createdOn1;
  }

  public JVresponseEntity createdOn1(LocalDate createdOn1) {
    this.createdOn1 = createdOn1;
    return this;
  }

 /**
   * Get modifiedOn1
   * @return modifiedOn1
  **/
  @JsonProperty("modifiedOn1")
  public LocalDate getModifiedOn1() {
    return modifiedOn1;
  }

  public void setModifiedOn1(LocalDate modifiedOn1) {
    this.modifiedOn1 = modifiedOn1;
  }

  public JVresponseEntity modifiedOn1(LocalDate modifiedOn1) {
    this.modifiedOn1 = modifiedOn1;
    return this;
  }

 /**
   * Get contactCode
   * @return contactCode
  **/
  @JsonProperty("contactCode")
  public Long getContactCode() {
    return contactCode;
  }

  public void setContactCode(Long contactCode) {
    this.contactCode = contactCode;
  }

  public JVresponseEntity contactCode(Long contactCode) {
    this.contactCode = contactCode;
    return this;
  }

 /**
   * Get email
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public JVresponseEntity email(String email) {
    this.email = email;
    return this;
  }

 /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public JVresponseEntity phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

 /**
   * Get lastName
   * @return lastName
  **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public JVresponseEntity lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

 /**
   * Get firstName
   * @return firstName
  **/
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public JVresponseEntity firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

 /**
   * Get user
   * @return user
  **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public JVresponseEntity user(String user) {
    this.user = user;
    return this;
  }

 /**
   * Get payDate
   * @return payDate
  **/
  @JsonProperty("payDate")
  public LocalDate getPayDate() {
    return payDate;
  }

  public void setPayDate(LocalDate payDate) {
    this.payDate = payDate;
  }

  public JVresponseEntity payDate(LocalDate payDate) {
    this.payDate = payDate;
    return this;
  }

 /**
   * Get payPeriodEndDate
   * @return payPeriodEndDate
  **/
  @JsonProperty("payPeriodEndDate")
  public LocalDate getPayPeriodEndDate() {
    return payPeriodEndDate;
  }

  public void setPayPeriodEndDate(LocalDate payPeriodEndDate) {
    this.payPeriodEndDate = payPeriodEndDate;
  }

  public JVresponseEntity payPeriodEndDate(LocalDate payPeriodEndDate) {
    this.payPeriodEndDate = payPeriodEndDate;
    return this;
  }

 /**
   * Get lastPayrollMonth
   * @return lastPayrollMonth
  **/
  @JsonProperty("lastPayrollMonth")
  public Boolean isLastPayrollMonth() {
    return lastPayrollMonth;
  }

  public void setLastPayrollMonth(Boolean lastPayrollMonth) {
    this.lastPayrollMonth = lastPayrollMonth;
  }

  public JVresponseEntity lastPayrollMonth(Boolean lastPayrollMonth) {
    this.lastPayrollMonth = lastPayrollMonth;
    return this;
  }

 /**
   * Get payCycle
   * @return payCycle
  **/
  @JsonProperty("payCycle")
  public String getPayCycle() {
    return payCycle;
  }

  public void setPayCycle(String payCycle) {
    this.payCycle = payCycle;
  }

  public JVresponseEntity payCycle(String payCycle) {
    this.payCycle = payCycle;
    return this;
  }

 /**
   * Get escrowID
   * @return escrowID
  **/
  @JsonProperty("escrowID")
  public String getEscrowID() {
    return escrowID;
  }

  public void setEscrowID(String escrowID) {
    this.escrowID = escrowID;
  }

  public JVresponseEntity escrowID(String escrowID) {
    this.escrowID = escrowID;
    return this;
  }

 /**
   * Get additionalTransactionInformation
   * @return additionalTransactionInformation
  **/
  @JsonProperty("additionalTransactionInformation")
  public Boolean isAdditionalTransactionInformation() {
    return additionalTransactionInformation;
  }

  public void setAdditionalTransactionInformation(Boolean additionalTransactionInformation) {
    this.additionalTransactionInformation = additionalTransactionInformation;
  }

  public JVresponseEntity additionalTransactionInformation(Boolean additionalTransactionInformation) {
    this.additionalTransactionInformation = additionalTransactionInformation;
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

  public JVresponseEntity extensionStorageUniqueID(Long extensionStorageUniqueID) {
    this.extensionStorageUniqueID = extensionStorageUniqueID;
    return this;
  }

 /**
   * Get jvresponseLineGroupEntity
   * @return jvresponseLineGroupEntity
  **/
  @JsonProperty("JVresponseLineGroupEntity")
  public List<JVresponseLineGroupEntity> getJvresponseLineGroupEntity() {
    return jvresponseLineGroupEntity;
  }

  public void setJvresponseLineGroupEntity(List<JVresponseLineGroupEntity> jvresponseLineGroupEntity) {
    this.jvresponseLineGroupEntity = jvresponseLineGroupEntity;
  }

  public JVresponseEntity jvresponseLineGroupEntity(List<JVresponseLineGroupEntity> jvresponseLineGroupEntity) {
    this.jvresponseLineGroupEntity = jvresponseLineGroupEntity;
    return this;
  }

  public JVresponseEntity addJvresponseLineGroupEntityItem(JVresponseLineGroupEntity jvresponseLineGroupEntityItem) {
    this.jvresponseLineGroupEntity.add(jvresponseLineGroupEntityItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JVresponseEntity {\n");
    
    sb.append("    transactionDept: ").append(toIndentedString(transactionDept)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    transactionUnit: ").append(toIndentedString(transactionUnit)).append("\n");
    sb.append("    overrideErrorCode: ").append(toIndentedString(overrideErrorCode)).append("\n");
    sb.append("    workflowBypassApprovalIndicator: ").append(toIndentedString(workflowBypassApprovalIndicator)).append("\n");
    sb.append("    objectAttachmentPrimaryGroupTotal: ").append(toIndentedString(objectAttachmentPrimaryGroupTotal)).append("\n");
    sb.append("    objectAttachmentPrimaryGroupUniqueIdentifier: ").append(toIndentedString(objectAttachmentPrimaryGroupUniqueIdentifier)).append("\n");
    sb.append("    objectAttachmentSecondaryGroupTotal: ").append(toIndentedString(objectAttachmentSecondaryGroupTotal)).append("\n");
    sb.append("    objectAttachmentSecondaryGroupUniqueIdentifier: ").append(toIndentedString(objectAttachmentSecondaryGroupUniqueIdentifier)).append("\n");
    sb.append("    packetDept: ").append(toIndentedString(packetDept)).append("\n");
    sb.append("    transactionDept1: ").append(toIndentedString(transactionDept1)).append("\n");
    sb.append("    recordDate: ").append(toIndentedString(recordDate)).append("\n");
    sb.append("    budgetFY: ").append(toIndentedString(budgetFY)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    fiscalQuarter: ").append(toIndentedString(fiscalQuarter)).append("\n");
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
    sb.append("    transactionName: ").append(toIndentedString(transactionName)).append("\n");
    sb.append("    reversalDate: ").append(toIndentedString(reversalDate)).append("\n");
    sb.append("    reversalHold: ").append(toIndentedString(reversalHold)).append("\n");
    sb.append("    budgetControlReduction: ").append(toIndentedString(budgetControlReduction)).append("\n");
    sb.append("    fundBalanceControlReduction: ").append(toIndentedString(fundBalanceControlReduction)).append("\n");
    sb.append("    cashBalanceControlReduction: ").append(toIndentedString(cashBalanceControlReduction)).append("\n");
    sb.append("    totalCredits: ").append(toIndentedString(totalCredits)).append("\n");
    sb.append("    totalDebits: ").append(toIndentedString(totalDebits)).append("\n");
    sb.append("    lineGroupCount: ").append(toIndentedString(lineGroupCount)).append("\n");
    sb.append("    extendedDescription: ").append(toIndentedString(extendedDescription)).append("\n");
    sb.append("    overrideUserID: ").append(toIndentedString(overrideUserID)).append("\n");
    sb.append("    createdOn1: ").append(toIndentedString(createdOn1)).append("\n");
    sb.append("    modifiedOn1: ").append(toIndentedString(modifiedOn1)).append("\n");
    sb.append("    contactCode: ").append(toIndentedString(contactCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    payDate: ").append(toIndentedString(payDate)).append("\n");
    sb.append("    payPeriodEndDate: ").append(toIndentedString(payPeriodEndDate)).append("\n");
    sb.append("    lastPayrollMonth: ").append(toIndentedString(lastPayrollMonth)).append("\n");
    sb.append("    payCycle: ").append(toIndentedString(payCycle)).append("\n");
    sb.append("    escrowID: ").append(toIndentedString(escrowID)).append("\n");
    sb.append("    additionalTransactionInformation: ").append(toIndentedString(additionalTransactionInformation)).append("\n");
    sb.append("    extensionStorageUniqueID: ").append(toIndentedString(extensionStorageUniqueID)).append("\n");
    sb.append("    jvresponseLineGroupEntity: ").append(toIndentedString(jvresponseLineGroupEntity)).append("\n");
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

