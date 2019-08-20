package com.cgi.adv.connect.jv.model;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;


public class JVresponseWrapper  {
  
  @ApiModelProperty(value = "")
  @Valid
  private JVresponseRootEntity jvresponseRootEntity = null;
 /**
   * Get jvresponseRootEntity
   * @return jvresponseRootEntity
  **/
  @JsonProperty("JVresponseRootEntity")
  public JVresponseRootEntity getJvresponseRootEntity() {
    return jvresponseRootEntity;
  }

  public void setJvresponseRootEntity(JVresponseRootEntity jvresponseRootEntity) {
    this.jvresponseRootEntity = jvresponseRootEntity;
  }

  public JVresponseWrapper jvresponseRootEntity(JVresponseRootEntity jvresponseRootEntity) {
    this.jvresponseRootEntity = jvresponseRootEntity;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JVresponseWrapper {\n");
    
    sb.append("    jvresponseRootEntity: ").append(toIndentedString(jvresponseRootEntity)).append("\n");
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

