package com.cgi.adv.connect.jv.model;

import java.util.List;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;


public class ModelApiResponse  {
  
  @ApiModelProperty(example = "12345678", value = "")
  private String requestId = null;

  @ApiModelProperty(example = "EXT-1234", value = "")
  private String correlationId = null;

  @ApiModelProperty(example = "http:server:port/aifgateway/api/introspection/12345678", value = "")
  private String introspectionURL = null;

  @ApiModelProperty(example = "200/202/400/500/504", value = "")
  private Integer httpStatusCode = null;

  @ApiModelProperty(example = "SUCCESS/FAILURE/PARTIAL-FAILURE/ACCEPTED", value = "")
  private String statusCode = null;

  @ApiModelProperty(example = "this text can be either generic failure or success text", value = "")
  private String statusText = null;

  @ApiModelProperty(example = "AIF-00101 <A unique AIF Error Code>", value = "")
  private String errorId = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<ErrorMessages> errorMessages = null;

  @ApiModelProperty(value = "")
  @Valid
  private TranDetail tranDetail = null;

  @ApiModelProperty(value = "")
  @Valid
  private RefTableDetail refTableDetail = null;
 /**
   * Get requestId
   * @return requestId
  **/
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ModelApiResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

 /**
   * Get correlationId
   * @return correlationId
  **/
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public ModelApiResponse correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

 /**
   * Get introspectionURL
   * @return introspectionURL
  **/
  @JsonProperty("introspectionURL")
  public String getIntrospectionURL() {
    return introspectionURL;
  }

  public void setIntrospectionURL(String introspectionURL) {
    this.introspectionURL = introspectionURL;
  }

  public ModelApiResponse introspectionURL(String introspectionURL) {
    this.introspectionURL = introspectionURL;
    return this;
  }

 /**
   * Get httpStatusCode
   * @return httpStatusCode
  **/
  @JsonProperty("httpStatusCode")
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  public ModelApiResponse httpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
    return this;
  }

 /**
   * Get statusCode
   * @return statusCode
  **/
  @JsonProperty("statusCode")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public ModelApiResponse statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

 /**
   * Get statusText
   * @return statusText
  **/
  @JsonProperty("statusText")
  public String getStatusText() {
    return statusText;
  }

  public void setStatusText(String statusText) {
    this.statusText = statusText;
  }

  public ModelApiResponse statusText(String statusText) {
    this.statusText = statusText;
    return this;
  }

 /**
   * Get errorId
   * @return errorId
  **/
  @JsonProperty("errorId")
  public String getErrorId() {
    return errorId;
  }

  public void setErrorId(String errorId) {
    this.errorId = errorId;
  }

  public ModelApiResponse errorId(String errorId) {
    this.errorId = errorId;
    return this;
  }

 /**
   * Get errorMessages
   * @return errorMessages
  **/
  @JsonProperty("errorMessages")
  public List<ErrorMessages> getErrorMessages() {
    return errorMessages;
  }

  public void setErrorMessages(List<ErrorMessages> errorMessages) {
    this.errorMessages = errorMessages;
  }

  public ModelApiResponse errorMessages(List<ErrorMessages> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public ModelApiResponse addErrorMessagesItem(ErrorMessages errorMessagesItem) {
    this.errorMessages.add(errorMessagesItem);
    return this;
  }

 /**
   * Get tranDetail
   * @return tranDetail
  **/
  @JsonProperty("tranDetail")
  public TranDetail getTranDetail() {
    return tranDetail;
  }

  public void setTranDetail(TranDetail tranDetail) {
    this.tranDetail = tranDetail;
  }

  public ModelApiResponse tranDetail(TranDetail tranDetail) {
    this.tranDetail = tranDetail;
    return this;
  }

 /**
   * Get refTableDetail
   * @return refTableDetail
  **/
  @JsonProperty("refTableDetail")
  public RefTableDetail getRefTableDetail() {
    return refTableDetail;
  }

  public void setRefTableDetail(RefTableDetail refTableDetail) {
    this.refTableDetail = refTableDetail;
  }

  public ModelApiResponse refTableDetail(RefTableDetail refTableDetail) {
    this.refTableDetail = refTableDetail;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelApiResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    introspectionURL: ").append(toIndentedString(introspectionURL)).append("\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
    sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
    sb.append("    tranDetail: ").append(toIndentedString(tranDetail)).append("\n");
    sb.append("    refTableDetail: ").append(toIndentedString(refTableDetail)).append("\n");
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

