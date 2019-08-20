package com.cgi.adv.connect.jv.model;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import java.time.LocalDate;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.swagger.annotations.ApiModelProperty;

public class JVrequestEntity  {
  
  @ApiModelProperty(value = "")
  private Date createdOn = null;

  @ApiModelProperty(value = "")
  private Long overrideErrorCode = null;

  @ApiModelProperty(value = "")
  private String objectAttachmentPrimaryGroupUniqueIdentifier = null;

  @ApiModelProperty(value = "")
  private String packetDept = null;

  @ApiModelProperty(value = "")
  private String transactionDept = null;

  @ApiModelProperty(value = "")
  @JsonDeserialize(using = LocalDateDeserializer.class)  
  @JsonSerialize(using = LocalDateSerializer.class)
  private LocalDate recordDate = null;

  @ApiModelProperty(value = "")
  private Integer budgetFY = null;

  @ApiModelProperty(value = "")
  private Integer fiscalYear = null;

  @ApiModelProperty(value = "")
  private String period = null;

  @ApiModelProperty(value = "")
  private Integer fiscalQuarter = null;

  @ApiModelProperty(value = "")
  private String transactionDescription = null;

  @ApiModelProperty(value = "")
  private String transactionName = null;

  @ApiModelProperty(value = "")
  @JsonDeserialize(using = LocalDateDeserializer.class)  
  @JsonSerialize(using = LocalDateSerializer.class)
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
  private String extendedDescription = null;

  @ApiModelProperty(value = "")
  private Long contactCode = null;

  @ApiModelProperty(value = "")
  @JsonDeserialize(using = LocalDateDeserializer.class)  
  @JsonSerialize(using = LocalDateSerializer.class)
  private LocalDate payDate = null;

  @ApiModelProperty(value = "")
  private Boolean lastPayrollMonth = null;

  @ApiModelProperty(value = "")
  private String payCycle = null;

  @ApiModelProperty(value = "")
  private String escrowID = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<JVrequestLineGroupEntity> jvrequestLineGroupEntity = null;
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

  public JVrequestEntity createdOn(Date createdOn) {
    this.createdOn = createdOn;
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

  public JVrequestEntity overrideErrorCode(Long overrideErrorCode) {
    this.overrideErrorCode = overrideErrorCode;
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

  public JVrequestEntity objectAttachmentPrimaryGroupUniqueIdentifier(String objectAttachmentPrimaryGroupUniqueIdentifier) {
    this.objectAttachmentPrimaryGroupUniqueIdentifier = objectAttachmentPrimaryGroupUniqueIdentifier;
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

  public JVrequestEntity packetDept(String packetDept) {
    this.packetDept = packetDept;
    return this;
  }

 /**
   * Get transactionDept
   * @return transactionDept
  **/
  @JsonProperty("transactionDept")
 @Size(max=12)  public String getTransactionDept() {
    return transactionDept;
  }

  public void setTransactionDept(String transactionDept) {
    this.transactionDept = transactionDept;
  }

  public JVrequestEntity transactionDept(String transactionDept) {
    this.transactionDept = transactionDept;
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

  public JVrequestEntity recordDate(LocalDate recordDate) {
    this.recordDate = recordDate;
    return this;
  }

 /**
   * Get budgetFY
   * @return budgetFY
  **/
  @JsonProperty("budgetFY")
  public Integer getBudgetFY() {
    return budgetFY;
  }

  public void setBudgetFY(Integer budgetFY) {
    this.budgetFY = budgetFY;
  }

  public JVrequestEntity budgetFY(Integer budgetFY) {
    this.budgetFY = budgetFY;
    return this;
  }

 /**
   * Get fiscalYear
   * @return fiscalYear
  **/
  @JsonProperty("fiscalYear")
  public Integer getFiscalYear() {
    return fiscalYear;
  }

  public void setFiscalYear(Integer fiscalYear) {
    this.fiscalYear = fiscalYear;
  }

  public JVrequestEntity fiscalYear(Integer fiscalYear) {
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

  public JVrequestEntity period(String period) {
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

  public JVrequestEntity fiscalQuarter(Integer fiscalQuarter) {
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

  public JVrequestEntity transactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
    return this;
  }

 /**
   * Get transactionName
   * @return transactionName
  **/
  @JsonProperty("transactionName")
  public String getTransactionName() {
    return transactionName;
  }

  public void setTransactionName(String transactionName) {
    this.transactionName = transactionName;
  }

  public JVrequestEntity transactionName(String transactionName) {
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

  public JVrequestEntity reversalDate(LocalDate reversalDate) {
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

  public JVrequestEntity reversalHold(Boolean reversalHold) {
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

  public JVrequestEntity budgetControlReduction(Boolean budgetControlReduction) {
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

  public JVrequestEntity fundBalanceControlReduction(Boolean fundBalanceControlReduction) {
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

  public JVrequestEntity cashBalanceControlReduction(Boolean cashBalanceControlReduction) {
    this.cashBalanceControlReduction = cashBalanceControlReduction;
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

  public JVrequestEntity extendedDescription(String extendedDescription) {
    this.extendedDescription = extendedDescription;
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

  public JVrequestEntity contactCode(Long contactCode) {
    this.contactCode = contactCode;
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

  public JVrequestEntity payDate(LocalDate payDate) {
    this.payDate = payDate;
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

  public JVrequestEntity lastPayrollMonth(Boolean lastPayrollMonth) {
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

  public JVrequestEntity payCycle(String payCycle) {
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

  public JVrequestEntity escrowID(String escrowID) {
    this.escrowID = escrowID;
    return this;
  }

 /**
   * Get jvrequestLineGroupEntity
   * @return jvrequestLineGroupEntity
  **/
  @JsonProperty("JVrequestLineGroupEntity")
  public List<JVrequestLineGroupEntity> getJvrequestLineGroupEntity() {
    return jvrequestLineGroupEntity;
  }

  public void setJvrequestLineGroupEntity(List<JVrequestLineGroupEntity> jvrequestLineGroupEntity) {
    this.jvrequestLineGroupEntity = jvrequestLineGroupEntity;
  }

  public JVrequestEntity jvrequestLineGroupEntity(List<JVrequestLineGroupEntity> jvrequestLineGroupEntity) {
    this.jvrequestLineGroupEntity = jvrequestLineGroupEntity;
    return this;
  }

  public JVrequestEntity addJvrequestLineGroupEntityItem(JVrequestLineGroupEntity jvrequestLineGroupEntityItem) {
    this.jvrequestLineGroupEntity.add(jvrequestLineGroupEntityItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JVrequestEntity {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    overrideErrorCode: ").append(toIndentedString(overrideErrorCode)).append("\n");
    sb.append("    objectAttachmentPrimaryGroupUniqueIdentifier: ").append(toIndentedString(objectAttachmentPrimaryGroupUniqueIdentifier)).append("\n");
    sb.append("    packetDept: ").append(toIndentedString(packetDept)).append("\n");
    sb.append("    transactionDept: ").append(toIndentedString(transactionDept)).append("\n");
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
    sb.append("    extendedDescription: ").append(toIndentedString(extendedDescription)).append("\n");
    sb.append("    contactCode: ").append(toIndentedString(contactCode)).append("\n");
    sb.append("    payDate: ").append(toIndentedString(payDate)).append("\n");
    sb.append("    lastPayrollMonth: ").append(toIndentedString(lastPayrollMonth)).append("\n");
    sb.append("    payCycle: ").append(toIndentedString(payCycle)).append("\n");
    sb.append("    escrowID: ").append(toIndentedString(escrowID)).append("\n");
    sb.append("    jvrequestLineGroupEntity: ").append(toIndentedString(jvrequestLineGroupEntity)).append("\n");
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

