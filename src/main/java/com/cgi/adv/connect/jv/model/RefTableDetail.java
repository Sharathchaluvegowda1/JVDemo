package com.cgi.adv.connect.jv.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class RefTableDetail  {
  
  @ApiModelProperty(example = "Name of the Entity corresponding to ref data table", value = "")
  private String entityName = null;

  @ApiModelProperty(example = "key name 1", value = "")
  private String keyName1 = null;

  @ApiModelProperty(example = "key value 1", value = "")
  private String keyValue1 = null;

  @ApiModelProperty(example = "key name 2", value = "")
  private String keyName2 = null;

  @ApiModelProperty(example = "key value 2", value = "")
  private String keyValue2 = null;

  @ApiModelProperty(example = "key name 3", value = "")
  private String keyName3 = null;

  @ApiModelProperty(example = "key value 3", value = "")
  private Object keyValue3 = null;
 /**
   * Get entityName
   * @return entityName
  **/
  @JsonProperty("entityName")
  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public RefTableDetail entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

 /**
   * Get keyName1
   * @return keyName1
  **/
  @JsonProperty("keyName1")
  public String getKeyName1() {
    return keyName1;
  }

  public void setKeyName1(String keyName1) {
    this.keyName1 = keyName1;
  }

  public RefTableDetail keyName1(String keyName1) {
    this.keyName1 = keyName1;
    return this;
  }

 /**
   * Get keyValue1
   * @return keyValue1
  **/
  @JsonProperty("keyValue1")
  public String getKeyValue1() {
    return keyValue1;
  }

  public void setKeyValue1(String keyValue1) {
    this.keyValue1 = keyValue1;
  }

  public RefTableDetail keyValue1(String keyValue1) {
    this.keyValue1 = keyValue1;
    return this;
  }

 /**
   * Get keyName2
   * @return keyName2
  **/
  @JsonProperty("keyName2")
  public String getKeyName2() {
    return keyName2;
  }

  public void setKeyName2(String keyName2) {
    this.keyName2 = keyName2;
  }

  public RefTableDetail keyName2(String keyName2) {
    this.keyName2 = keyName2;
    return this;
  }

 /**
   * Get keyValue2
   * @return keyValue2
  **/
  @JsonProperty("keyValue2")
  public String getKeyValue2() {
    return keyValue2;
  }

  public void setKeyValue2(String keyValue2) {
    this.keyValue2 = keyValue2;
  }

  public RefTableDetail keyValue2(String keyValue2) {
    this.keyValue2 = keyValue2;
    return this;
  }

 /**
   * Get keyName3
   * @return keyName3
  **/
  @JsonProperty("keyName3")
  public String getKeyName3() {
    return keyName3;
  }

  public void setKeyName3(String keyName3) {
    this.keyName3 = keyName3;
  }

  public RefTableDetail keyName3(String keyName3) {
    this.keyName3 = keyName3;
    return this;
  }

 /**
   * Get keyValue3
   * @return keyValue3
  **/
  @JsonProperty("keyValue3")
  public Object getKeyValue3() {
    return keyValue3;
  }

  public void setKeyValue3(Object keyValue3) {
    this.keyValue3 = keyValue3;
  }

  public RefTableDetail keyValue3(Object keyValue3) {
    this.keyValue3 = keyValue3;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefTableDetail {\n");
    
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    keyName1: ").append(toIndentedString(keyName1)).append("\n");
    sb.append("    keyValue1: ").append(toIndentedString(keyValue1)).append("\n");
    sb.append("    keyName2: ").append(toIndentedString(keyName2)).append("\n");
    sb.append("    keyValue2: ").append(toIndentedString(keyValue2)).append("\n");
    sb.append("    keyName3: ").append(toIndentedString(keyName3)).append("\n");
    sb.append("    keyValue3: ").append(toIndentedString(keyValue3)).append("\n");
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

