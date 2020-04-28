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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.coinex.dex.client.model.BaseReq;
import org.coinex.dex.client.model.Coin;

/**
 * Delegation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-28T12:10:24.313+08:00")
public class Delegation {
  @SerializedName("base_req")
  private BaseReq baseReq = null;

  @SerializedName("delegator_address")
  private String delegatorAddress = null;

  @SerializedName("validator_address")
  private String validatorAddress = null;

  @SerializedName("amount")
  private Coin amount = null;

  public Delegation baseReq(BaseReq baseReq) {
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

  public Delegation delegatorAddress(String delegatorAddress) {
    this.delegatorAddress = delegatorAddress;
    return this;
  }

   /**
   * Get delegatorAddress
   * @return delegatorAddress
  **/
  @ApiModelProperty(value = "")
  public String getDelegatorAddress() {
    return delegatorAddress;
  }

  public void setDelegatorAddress(String delegatorAddress) {
    this.delegatorAddress = delegatorAddress;
  }

  public Delegation validatorAddress(String validatorAddress) {
    this.validatorAddress = validatorAddress;
    return this;
  }

   /**
   * Get validatorAddress
   * @return validatorAddress
  **/
  @ApiModelProperty(value = "")
  public String getValidatorAddress() {
    return validatorAddress;
  }

  public void setValidatorAddress(String validatorAddress) {
    this.validatorAddress = validatorAddress;
  }

  public Delegation amount(Coin amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Coin getAmount() {
    return amount;
  }

  public void setAmount(Coin amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Delegation delegation = (Delegation) o;
    return Objects.equals(this.baseReq, delegation.baseReq) &&
        Objects.equals(this.delegatorAddress, delegation.delegatorAddress) &&
        Objects.equals(this.validatorAddress, delegation.validatorAddress) &&
        Objects.equals(this.amount, delegation.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseReq, delegatorAddress, validatorAddress, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Delegation {\n");
    
    sb.append("    baseReq: ").append(toIndentedString(baseReq)).append("\n");
    sb.append("    delegatorAddress: ").append(toIndentedString(delegatorAddress)).append("\n");
    sb.append("    validatorAddress: ").append(toIndentedString(validatorAddress)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

