package com.cgi.adv.connect.jv.model;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;


public class JVrequestWrapper  {
  
  @ApiModelProperty(value = "")
  @Valid
  private JVrequestRootEntity jvrequestRootEntity = null;
 /**
   * Get jvrequestRootEntity
   * @return jvrequestRootEntity
  **/
  @JsonProperty("JVrequestRootEntity")
  public JVrequestRootEntity getJvrequestRootEntity() {
    return jvrequestRootEntity;
  }

  public void setJvrequestRootEntity(JVrequestRootEntity jvrequestRootEntity) {
    this.jvrequestRootEntity = jvrequestRootEntity;
  }

  public JVrequestWrapper jvrequestRootEntity(JVrequestRootEntity jvrequestRootEntity) {
    this.jvrequestRootEntity = jvrequestRootEntity;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JVrequestWrapper {\n");
    
    sb.append("    jvrequestRootEntity: ").append(toIndentedString(jvrequestRootEntity)).append("\n");
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

