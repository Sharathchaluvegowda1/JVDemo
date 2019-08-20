package com.cgi.adv.connect.jv.model;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class TranDetail  {
  
  @ApiModelProperty(example = "JV", value = "")
  private String tranCode = null;

  @ApiModelProperty(example = "10", value = "")
  private String department = null;

  @ApiModelProperty(example = "0615000000DP2", value = "")
  private String tranID = null;

  @ApiModelProperty(example = "some advantage status", value = "")
  private String tranStatus = null;

  @ApiModelProperty(example = "http://server:portal/api/jv/tranCode/dept/tranid", value = "")
  private String tranGetURL = null;
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

  public TranDetail tranCode(String tranCode) {
    this.tranCode = tranCode;
    return this;
  }

 /**
   * Get department
   * @return department
  **/
  @JsonProperty("department")
 @Size(max=10)  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public TranDetail department(String department) {
    this.department = department;
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

  public TranDetail tranID(String tranID) {
    this.tranID = tranID;
    return this;
  }

 /**
   * Get tranStatus
   * @return tranStatus
  **/
  @JsonProperty("tranStatus")
 @Size(max=20)  public String getTranStatus() {
    return tranStatus;
  }

  public void setTranStatus(String tranStatus) {
    this.tranStatus = tranStatus;
  }

  public TranDetail tranStatus(String tranStatus) {
    this.tranStatus = tranStatus;
    return this;
  }

 /**
   * Get tranGetURL
   * @return tranGetURL
  **/
  @JsonProperty("tranGetURL")
 @Size(max=100)  public String getTranGetURL() {
    return tranGetURL;
  }

  public void setTranGetURL(String tranGetURL) {
    this.tranGetURL = tranGetURL;
  }

  public TranDetail tranGetURL(String tranGetURL) {
    this.tranGetURL = tranGetURL;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranDetail {\n");
    
    sb.append("    tranCode: ").append(toIndentedString(tranCode)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    tranID: ").append(toIndentedString(tranID)).append("\n");
    sb.append("    tranStatus: ").append(toIndentedString(tranStatus)).append("\n");
    sb.append("    tranGetURL: ").append(toIndentedString(tranGetURL)).append("\n");
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

