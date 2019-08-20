package com.cgi.adv.connect.jv.model;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;


public class TranResponseHeaderEntity  {
  
  @ApiModelProperty(value = "")
  private String tranCode = null;

  @ApiModelProperty(value = "")
  private String tranDepartmentCode = null;

  @ApiModelProperty(value = "")
  private String tranID = null;

  @ApiModelProperty(value = "")
  private String tranPhaseCode = null;

  @ApiModelProperty(value = "")
  private String tranStatusCode = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<Message> message = null;
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

  public TranResponseHeaderEntity tranCode(String tranCode) {
    this.tranCode = tranCode;
    return this;
  }

 /**
   * Get department
   * @return department
  **/
  @JsonProperty("tranDepartmentCode")
 @Size(max=10)  public String getTranDepartmentCode() {
    return tranDepartmentCode;
  }

  public void setTranDepartmentCode(String tranDepartmentCode) {
    this.tranDepartmentCode = tranDepartmentCode;
  }

  public TranResponseHeaderEntity tranDepartmentCode(String tranDepartmentCode) {
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

  public TranResponseHeaderEntity tranID(String tranID) {
    this.tranID = tranID;
    return this;
  }

 /**
   * Get tranPhase
   * @return tranPhase
  **/
  @JsonProperty("tranPhaseCode")
 @Size(max=20)  public String getTranPhaseCode() {
    return tranPhaseCode;
  }

  public void setTranPhaseCode(String tranPhaseCode) {
    this.tranPhaseCode = tranPhaseCode;
  }

  public TranResponseHeaderEntity tranPhaseCode(String tranPhaseCode) {
    this.tranPhaseCode = tranPhaseCode;
    return this;
  }

 /**
   * Get tranStatus
   * @return tranStatus
  **/
  @JsonProperty("tranStatusCode")
 @Size(max=20)  public String getTranStatusCode() {
    return tranStatusCode;
  }

  public void setTranStatusCode(String tranStatusCode) {
    this.tranStatusCode = tranStatusCode;
  }

  public TranResponseHeaderEntity tranStatusCode(String tranStatusCode) {
    this.tranStatusCode = tranStatusCode;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public List<Message> getMessage() {
    return message;
  }

  public void setMessage(List<Message> message) {
    this.message = message;
  }

  public TranResponseHeaderEntity message(List<Message> message) {
    this.message = message;
    return this;
  }

  public TranResponseHeaderEntity addMessageItem(Message messageItem) {
    this.message.add(messageItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranResponseHeaderEntity {\n");
    
    sb.append("    tranCode: ").append(toIndentedString(tranCode)).append("\n");
    sb.append("    tranDepartmentCode: ").append(toIndentedString(tranDepartmentCode)).append("\n");
    sb.append("    tranID: ").append(toIndentedString(tranID)).append("\n");
    sb.append("    tranPhaseCode: ").append(toIndentedString(tranPhaseCode)).append("\n");
    sb.append("    tranStatusCode: ").append(toIndentedString(tranStatusCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

