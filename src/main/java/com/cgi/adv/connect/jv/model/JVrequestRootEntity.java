package com.cgi.adv.connect.jv.model;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlRootElement
@XmlType(propOrder={"tranRequestHeaderEntity", "jvrequestEntity"})
public class JVrequestRootEntity  {
  
  @ApiModelProperty(value = "")
  @Valid
  private TranRequestHeaderEntity tranRequestHeaderEntity = null;

  @ApiModelProperty(value = "")
  @Valid
  private JVrequestEntity jvrequestEntity = null;
 /**
   * Get tranRequestHeaderEntity
   * @return tranRequestHeaderEntity
  **/
  @JsonProperty("tranRequestHeaderEntity")
  public TranRequestHeaderEntity getTranRequestHeaderEntity() {
    return tranRequestHeaderEntity;
  }

  public void setTranRequestHeaderEntity(TranRequestHeaderEntity tranRequestHeaderEntity) {
    this.tranRequestHeaderEntity = tranRequestHeaderEntity;
  }

  public JVrequestRootEntity tranRequestHeaderEntity(TranRequestHeaderEntity tranRequestHeaderEntity) {
    this.tranRequestHeaderEntity = tranRequestHeaderEntity;
    return this;
  }

 /**
   * Get jvrequestEntity
   * @return jvrequestEntity
  **/
  @JsonProperty("JVrequestEntity")
  public JVrequestEntity getJvrequestEntity() {
    return jvrequestEntity;
  }

  public void setJvrequestEntity(JVrequestEntity jvrequestEntity) {
    this.jvrequestEntity = jvrequestEntity;
  }

  public JVrequestRootEntity jvrequestEntity(JVrequestEntity jvrequestEntity) {
    this.jvrequestEntity = jvrequestEntity;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JVrequestRootEntity {\n");
    
    sb.append("    tranRequestHeaderEntity: ").append(toIndentedString(tranRequestHeaderEntity)).append("\n");
    sb.append("    jvrequestEntity: ").append(toIndentedString(jvrequestEntity)).append("\n");
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

