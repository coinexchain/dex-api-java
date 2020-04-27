/*
 * CET-Lite for CoinEx Chain
 * A REST interface for state queries, transaction generation and broadcasting.
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * ParamChange
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-27T01:19:45.029Z")
public class ParamChange extends HashMap<String, Object> {
  @SerializedName("subspace")
  private String subspace = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("subkey")
  private String subkey = null;

  @SerializedName("value")
  private Object value = null;

  public ParamChange subspace(String subspace) {
    this.subspace = subspace;
    return this;
  }

   /**
   * Get subspace
   * @return subspace
  **/
  @ApiModelProperty(example = "staking", required = true, value = "")
  public String getSubspace() {
    return subspace;
  }

  public void setSubspace(String subspace) {
    this.subspace = subspace;
  }

  public ParamChange key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(example = "MaxValidators", required = true, value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ParamChange subkey(String subkey) {
    this.subkey = subkey;
    return this;
  }

   /**
   * Get subkey
   * @return subkey
  **/
  @ApiModelProperty(example = "", required = true, value = "")
  public String getSubkey() {
    return subkey;
  }

  public void setSubkey(String subkey) {
    this.subkey = subkey;
  }

  public ParamChange value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParamChange paramChange = (ParamChange) o;
    return Objects.equals(this.subspace, paramChange.subspace) &&
        Objects.equals(this.key, paramChange.key) &&
        Objects.equals(this.subkey, paramChange.subkey) &&
        Objects.equals(this.value, paramChange.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subspace, key, subkey, value, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParamChange {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subspace: ").append(toIndentedString(subspace)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    subkey: ").append(toIndentedString(subkey)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

