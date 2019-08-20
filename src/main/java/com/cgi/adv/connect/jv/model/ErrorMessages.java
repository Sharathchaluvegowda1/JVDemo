package com.cgi.adv.connect.jv.model;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorMessages  {
  
  @ApiModelProperty(example = "ServiceException", value = "")
  private String errorCode = null;

  @ApiModelProperty(example = "Transaction validation failed because of some ref integrity", value = "")
  private String errorMessage = null;

  @ApiModelProperty(example = "ERROR", value = "")
  private String errorSeverity = null;

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal source = null;

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal type = null;
 /**
   * Get errorCode
   * @return errorCode
  **/
  @JsonProperty("errorCode")
 @Size(max=20)  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ErrorMessages errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get errorMessage
   * @return errorMessage
  **/
  @JsonProperty("errorMessage")
 @Size(max=100)  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ErrorMessages errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

 /**
   * Get errorSeverity
   * @return errorSeverity
  **/
  @JsonProperty("errorSeverity")
 @Size(max=8)  public String getErrorSeverity() {
    return errorSeverity;
  }

  public void setErrorSeverity(String errorSeverity) {
    this.errorSeverity = errorSeverity;
  }

  public ErrorMessages errorSeverity(String errorSeverity) {
    this.errorSeverity = errorSeverity;
    return this;
  }

 /**
   * Get source
   * @return source
  **/
  @JsonProperty("source")
  public BigDecimal getSource() {
    return source;
  }

  public void setSource(BigDecimal source) {
    this.source = source;
  }

  public ErrorMessages source(BigDecimal source) {
    this.source = source;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public BigDecimal getType() {
    return type;
  }

  public void setType(BigDecimal type) {
    this.type = type;
  }

  public ErrorMessages type(BigDecimal type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorMessages {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorSeverity: ").append(toIndentedString(errorSeverity)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

