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
import io.swagger.client.model.BaseReq;
import java.io.IOException;

/**
 * AliasUpdateReq
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-27T01:19:45.029Z")
public class AliasUpdateReq {
  @SerializedName("base_req")
  private BaseReq baseReq = null;

  @SerializedName("alias")
  private String alias = null;

  @SerializedName("is_add")
  private Boolean isAdd = null;

  @SerializedName("as_default")
  private Boolean asDefault = null;

  public AliasUpdateReq baseReq(BaseReq baseReq) {
    this.baseReq = baseReq;
    return this;
  }

   /**
   * Get baseReq
   * @return baseReq
  **/
  @ApiModelProperty(value = "")
  public BaseReq getBaseReq() {
    return baseReq;
  }

  public void setBaseReq(BaseReq baseReq) {
    this.baseReq = baseReq;
  }

  public AliasUpdateReq alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @ApiModelProperty(example = "superman", value = "")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public AliasUpdateReq isAdd(Boolean isAdd) {
    this.isAdd = isAdd;
    return this;
  }

   /**
   * Get isAdd
   * @return isAdd
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsAdd() {
    return isAdd;
  }

  public void setIsAdd(Boolean isAdd) {
    this.isAdd = isAdd;
  }

  public AliasUpdateReq asDefault(Boolean asDefault) {
    this.asDefault = asDefault;
    return this;
  }

   /**
   * Get asDefault
   * @return asDefault
  **/
  @ApiModelProperty(value = "")
  public Boolean isAsDefault() {
    return asDefault;
  }

  public void setAsDefault(Boolean asDefault) {
    this.asDefault = asDefault;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AliasUpdateReq aliasUpdateReq = (AliasUpdateReq) o;
    return Objects.equals(this.baseReq, aliasUpdateReq.baseReq) &&
        Objects.equals(this.alias, aliasUpdateReq.alias) &&
        Objects.equals(this.isAdd, aliasUpdateReq.isAdd) &&
        Objects.equals(this.asDefault, aliasUpdateReq.asDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseReq, alias, isAdd, asDefault);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AliasUpdateReq {\n");
    
    sb.append("    baseReq: ").append(toIndentedString(baseReq)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    isAdd: ").append(toIndentedString(isAdd)).append("\n");
    sb.append("    asDefault: ").append(toIndentedString(asDefault)).append("\n");
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

