package com.cgi.adv.connect.jv.model;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class TranRequestHeaderEntity  {
  
  @ApiModelProperty(value = "")
  private String tranCode = null;

  @ApiModelProperty(value = "")
  private String tranDepartmentCode = null;

  @ApiModelProperty(value = "")
  private String tranID = null;

  @ApiModelProperty(value = "")
  private Boolean applyOverrides = null;

  @ApiModelProperty(value = "")
  private Boolean bypassApprovals = null;

  @ApiModelProperty(value = "")
  private Boolean validateTransaction = null;

  @ApiModelProperty(value = "")
  private Boolean submitTransaction = null;

  @ApiModelProperty(value = "")
  private Boolean discardDraftTransaction = null;

  @ApiModelProperty(value = "")
  private Boolean updateIntegrationLog = null;

  @ApiModelProperty(value = "")
  private Boolean updateMessageLog = null;

  @ApiModelProperty(value = "")
  private Boolean assignTranID = null;

  @ApiModelProperty(value = "")
  private String tranIDPrefix = null;
 /**
   * Get tranCode
   * @return tranCode
  **/
  @JsonProperty("tranCode")
 @Size(max=8)  public String getTranCode() {
    return tranCode;
  }

  public void setTranCode(String tranCode) {
    this.tranCode = tranCode;
  }

  public TranRequestHeaderEntity tranCode(String tranCode) {
    this.tranCode = tranCode;
    return this;
  }

 /**
   * Get tranDepartmentCode
   * @return tranDepartmentCode
  **/
  @JsonProperty("tranDepartmentCode")
 @Size(max=10)  public String getTranDepartmentCode() {
    return tranDepartmentCode;
  }

  public void setTranDepartmentCode(String tranDepartmentCode) {
    this.tranDepartmentCode = tranDepartmentCode;
  }

  public TranRequestHeaderEntity tranDepartmentCode(String tranDepartmentCode) {
    this.tranDepartmentCode = tranDepartmentCode;
    return this;
  }

 /**
   * Get tranID
   * @return tranID
  **/
  @JsonProperty("tranID")
 @Size(max=20)  public String getTranID() {
    return tranID;
  }

  public void setTranID(String tranID) {
    this.tranID = tranID;
  }

  public TranRequestHeaderEntity tranID(String tranID) {
    this.tranID = tranID;
    return this;
  }

 /**
   * Get applyOverrides
   * @return applyOverrides
  **/
  @JsonProperty("applyOverrides")
  public Boolean isApplyOverrides() {
    return applyOverrides;
  }

  public void setApplyOverrides(Boolean applyOverrides) {
    this.applyOverrides = applyOverrides;
  }

  public TranRequestHeaderEntity applyOverrides(Boolean applyOverrides) {
    this.applyOverrides = applyOverrides;
    return this;
  }

 /**
   * Get bypassApprovals
   * @return bypassApprovals
  **/
  @JsonProperty("bypassApprovals")
  public Boolean isBypassApprovals() {
    return bypassApprovals;
  }

  public void setBypassApprovals(Boolean bypassApprovals) {
    this.bypassApprovals = bypassApprovals;
  }

  public TranRequestHeaderEntity bypassApprovals(Boolean bypassApprovals) {
    this.bypassApprovals = bypassApprovals;
    return this;
  }

 /**
   * Get validateTransaction
   * @return validateTransaction
  **/
  @JsonProperty("validateTransaction")
  public Boolean isValidateTransaction() {
    return validateTransaction;
  }

  public void setValidateTransaction(Boolean validateTransaction) {
    this.validateTransaction = validateTransaction;
  }

  public TranRequestHeaderEntity validateTransaction(Boolean validateTransaction) {
    this.validateTransaction = validateTransaction;
    return this;
  }

 /**
   * Get submitTransaction
   * @return submitTransaction
  **/
  @JsonProperty("submitTransaction")
  public Boolean isSubmitTransaction() {
    return submitTransaction;
  }

  public void setSubmitTransaction(Boolean submitTransaction) {
    this.submitTransaction = submitTransaction;
  }

  public TranRequestHeaderEntity submitTransaction(Boolean submitTransaction) {
    this.submitTransaction = submitTransaction;
    return this;
  }

 /**
   * Get discardDraftTransaction
   * @return discardDraftTransaction
  **/
  @JsonProperty("discardDraftTransaction")
  public Boolean isDiscardDraftTransaction() {
    return discardDraftTransaction;
  }

  public void setDiscardDraftTransaction(Boolean discardDraftTransaction) {
    this.discardDraftTransaction = discardDraftTransaction;
  }

  public TranRequestHeaderEntity discardDraftTransaction(Boolean discardDraftTransaction) {
    this.discardDraftTransaction = discardDraftTransaction;
    return this;
  }

 /**
   * Get updateIntegrationLog
   * @return updateIntegrationLog
  **/
  @JsonProperty("updateIntegrationLog")
  public Boolean isUpdateIntegrationLog() {
    return updateIntegrationLog;
  }

  public void setUpdateIntegrationLog(Boolean updateIntegrationLog) {
    this.updateIntegrationLog = updateIntegrationLog;
  }

  public TranRequestHeaderEntity updateIntegrationLog(Boolean updateIntegrationLog) {
    this.updateIntegrationLog = updateIntegrationLog;
    return this;
  }

 /**
   * Get updateMessageLog
   * @return updateMessageLog
  **/
  @JsonProperty("updateMessageLog")
  public Boolean isUpdateMessageLog() {
    return updateMessageLog;
  }

  public void setUpdateMessageLog(Boolean updateMessageLog) {
    this.updateMessageLog = updateMessageLog;
  }

  public TranRequestHeaderEntity updateMessageLog(Boolean updateMessageLog) {
    this.updateMessageLog = updateMessageLog;
    return this;
  }

 /**
   * Get assignTranID
   * @return assignTranID
  **/
  @JsonProperty("assignTranID")
  public Boolean isAssignTranID() {
    return assignTranID;
  }

  public void setAssignTranID(Boolean assignTranID) {
    this.assignTranID = assignTranID;
  }

  public TranRequestHeaderEntity assignTranID(Boolean assignTranID) {
    this.assignTranID = assignTranID;
    return this;
  }

 /**
   * Get tranIDPrefix
   * @return tranIDPrefix
  **/
  @JsonProperty("tranIDPrefix")
 @Size(max=10)  public String getTranIDPrefix() {
    return tranIDPrefix;
  }

  public void setTranIDPrefix(String tranIDPrefix) {
    this.tranIDPrefix = tranIDPrefix;
  }

  public TranRequestHeaderEntity tranIDPrefix(String tranIDPrefix) {
    this.tranIDPrefix = tranIDPrefix;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranRequestHeaderEntity {\n");
    
    sb.append("    tranCode: ").append(toIndentedString(tranCode)).append("\n");
    sb.append("    tranDepartmentCode: ").append(toIndentedString(tranDepartmentCode)).append("\n");
    sb.append("    tranID: ").append(toIndentedString(tranID)).append("\n");
    sb.append("    applyOverrides: ").append(toIndentedString(applyOverrides)).append("\n");
    sb.append("    bypassApprovals: ").append(toIndentedString(bypassApprovals)).append("\n");
    sb.append("    validateTransaction: ").append(toIndentedString(validateTransaction)).append("\n");
    sb.append("    submitTransaction: ").append(toIndentedString(submitTransaction)).append("\n");
    sb.append("    discardDraftTransaction: ").append(toIndentedString(discardDraftTransaction)).append("\n");
    sb.append("    updateIntegrationLog: ").append(toIndentedString(updateIntegrationLog)).append("\n");
    sb.append("    updateMessageLog: ").append(toIndentedString(updateMessageLog)).append("\n");
    sb.append("    assignTranID: ").append(toIndentedString(assignTranID)).append("\n");
    sb.append("    tranIDPrefix: ").append(toIndentedString(tranIDPrefix)).append("\n");
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

