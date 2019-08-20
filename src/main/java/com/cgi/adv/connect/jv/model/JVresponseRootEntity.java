package com.cgi.adv.connect.jv.model;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;


public class JVresponseRootEntity  {
  
  @ApiModelProperty(value = "")
  @Valid
  private TranResponseHeaderEntity tranResponseHeaderEntity = null;

  @ApiModelProperty(value = "")
  @Valid
  private JVresponseEntity jvresponseEntity = null;
 /**
   * Get tranResponseHeaderEntity
   * @return tranResponseHeaderEntity
  **/
  @JsonProperty("tranResponseHeaderEntity")
  public TranResponseHeaderEntity getTranResponseHeaderEntity() {
    return tranResponseHeaderEntity;
  }

  public void setTranResponseHeaderEntity(TranResponseHeaderEntity tranResponseHeaderEntity) {
    this.tranResponseHeaderEntity = tranResponseHeaderEntity;
  }

  public JVresponseRootEntity tranResponseHeaderEntity(TranResponseHeaderEntity tranResponseHeaderEntity) {
    this.tranResponseHeaderEntity = tranResponseHeaderEntity;
    return this;
  }

 /**
   * Get jvresponseEntity
   * @return jvresponseEntity
  **/
  @JsonProperty("JVresponseEntity")
  public JVresponseEntity getJvresponseEntity() {
    return jvresponseEntity;
  }

  public void setJvresponseEntity(JVresponseEntity jvresponseEntity) {
    this.jvresponseEntity = jvresponseEntity;
  }

  public JVresponseRootEntity jvresponseEntity(JVresponseEntity jvresponseEntity) {
    this.jvresponseEntity = jvresponseEntity;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JVresponseRootEntity {\n");
    
    sb.append("    tranResponseHeaderEntity: ").append(toIndentedString(tranResponseHeaderEntity)).append("\n");
    sb.append("    jvresponseEntity: ").append(toIndentedString(jvresponseEntity)).append("\n");
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

