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
import io.swagger.client.model.BaseReq;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Whitelist
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-26T10:53:15.911+08:00[Asia/Shanghai]")
public class Whitelist {
  @SerializedName("base_req")
  private BaseReq baseReq = null;

  @SerializedName("whitelist")
  private List<String> whitelist = new ArrayList<String>();

  public Whitelist baseReq(BaseReq baseReq) {
    this.baseReq = baseReq;
    return this;
  }

   /**
   * Get baseReq
   * @return baseReq
  **/
  @Schema(required = true, description = "")
  public BaseReq getBaseReq() {
    return baseReq;
  }

  public void setBaseReq(BaseReq baseReq) {
    this.baseReq = baseReq;
  }

  public Whitelist whitelist(List<String> whitelist) {
    this.whitelist = whitelist;
    return this;
  }

  public Whitelist addWhitelistItem(String whitelistItem) {
    this.whitelist.add(whitelistItem);
    return this;
  }

   /**
   * Get whitelist
   * @return whitelist
  **/
  @Schema(required = true, description = "")
  public List<String> getWhitelist() {
    return whitelist;
  }

  public void setWhitelist(List<String> whitelist) {
    this.whitelist = whitelist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Whitelist whitelist = (Whitelist) o;
    return Objects.equals(this.baseReq, whitelist.baseReq) &&
        Objects.equals(this.whitelist, whitelist.whitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseReq, whitelist);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Whitelist {\n");
    
    sb.append("    baseReq: ").append(toIndentedString(baseReq)).append("\n");
    sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
