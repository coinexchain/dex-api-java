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


package org.coinex.dex.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * NewOwner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-27T01:19:45.029Z")
public class NewOwner {
  @SerializedName("base_req")
  private BaseReq baseReq = null;

  @SerializedName("new_owner")
  private String newOwner = null;

  public NewOwner baseReq(BaseReq baseReq) {
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

  public NewOwner newOwner(String newOwner) {
    this.newOwner = newOwner;
    return this;
  }

   /**
   * Get newOwner
   * @return newOwner
  **/
  @ApiModelProperty(value = "")
  public String getNewOwner() {
    return newOwner;
  }

  public void setNewOwner(String newOwner) {
    this.newOwner = newOwner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewOwner newOwner = (NewOwner) o;
    return Objects.equals(this.baseReq, newOwner.baseReq) &&
        Objects.equals(this.newOwner, newOwner.newOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseReq, newOwner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOwner {\n");
    
    sb.append("    baseReq: ").append(toIndentedString(baseReq)).append("\n");
    sb.append("    newOwner: ").append(toIndentedString(newOwner)).append("\n");
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
