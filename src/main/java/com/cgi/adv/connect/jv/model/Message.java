package com.cgi.adv.connect.jv.model;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class Message  {
  
  @ApiModelProperty(example = "PSTNG_LN_CAT", value = "")
  private String component = null;

  @ApiModelProperty(example = "DOC_CD = JV AND DOC_DEPT_CD = 10 AND DOC_ID = 2018061500000021 AND DOC_VERS_NO = 1 AND DOC_LNGRP_LN_NO = 1 AND DOC_ACTG_LN_NO = 1 AND DOC_PSTNG_LN_NO = 1", value = "")
  private String context = null;

  @ApiModelProperty(example = "", value = "")
  private String attribute = null;

  @ApiModelProperty(example = "A2079", value = "")
  private String code = null;

  @ApiModelProperty(example = "warning", value = "")
  private String severity = null;

  @ApiModelProperty(example = "This posting is not allowed by BFY Profile A, stage 2 (A2079)", value = "")
  private String message = null;

  @ApiModelProperty(example = "0.0", value = "")
  @Valid
  private BigDecimal requiredOverrideLevel = null;

  @ApiModelProperty(example = "0.0", value = "")
  @Valid
  private BigDecimal appliedOverrideLevel = null;
 /**
   * Get component
   * @return component
  **/
  @JsonProperty("component")
 @Size(max=20)  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public Message component(String component) {
    this.component = component;
    return this;
  }

 /**
   * Get context
   * @return context
  **/
  @JsonProperty("context")
 @Size(max=100)  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public Message context(String context) {
    this.context = context;
    return this;
  }

 /**
   * Get attribute
   * @return attribute
  **/
  @JsonProperty("attribute")
 @Size(max=20)  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public Message attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
 @Size(max=8)  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Message code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Get severity
   * @return severity
  **/
  @JsonProperty("severity")
 @Size(max=8)  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public Message severity(String severity) {
    this.severity = severity;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
 @Size(max=100)  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Message message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get requiredOverrideLevel
   * @return requiredOverrideLevel
  **/
  @JsonProperty("requiredOverrideLevel")
  public BigDecimal getRequiredOverrideLevel() {
    return requiredOverrideLevel;
  }

  public void setRequiredOverrideLevel(BigDecimal requiredOverrideLevel) {
    this.requiredOverrideLevel = requiredOverrideLevel;
  }

  public Message requiredOverrideLevel(BigDecimal requiredOverrideLevel) {
    this.requiredOverrideLevel = requiredOverrideLevel;
    return this;
  }

 /**
   * Get appliedOverrideLevel
   * @return appliedOverrideLevel
  **/
  @JsonProperty("appliedOverrideLevel")
  public BigDecimal getAppliedOverrideLevel() {
    return appliedOverrideLevel;
  }

  public void setAppliedOverrideLevel(BigDecimal appliedOverrideLevel) {
    this.appliedOverrideLevel = appliedOverrideLevel;
  }

  public Message appliedOverrideLevel(BigDecimal appliedOverrideLevel) {
    this.appliedOverrideLevel = appliedOverrideLevel;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    requiredOverrideLevel: ").append(toIndentedString(requiredOverrideLevel)).append("\n");
    sb.append("    appliedOverrideLevel: ").append(toIndentedString(appliedOverrideLevel)).append("\n");
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

