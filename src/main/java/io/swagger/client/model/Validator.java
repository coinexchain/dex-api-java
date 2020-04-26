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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Validator
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-26T10:53:15.911+08:00[Asia/Shanghai]")
public class Validator {
  @SerializedName("operator_address")
  private String operatorAddress = null;

  @SerializedName("consensus_pubkey")
  private String consensusPubkey = null;

  @SerializedName("jailed")
  private Boolean jailed = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("tokens")
  private String tokens = null;

  @SerializedName("delegator_shares")
  private String delegatorShares = null;

  @SerializedName("description")
  private Object description = null;

  @SerializedName("unbonding_height")
  private String unbondingHeight = null;

  @SerializedName("unbonding_time")
  private String unbondingTime = null;

  @SerializedName("commission")
  private Object commission = null;

  @SerializedName("min_self_delegation")
  private String minSelfDelegation = null;

  public Validator operatorAddress(String operatorAddress) {
    this.operatorAddress = operatorAddress;
    return this;
  }

   /**
   * Get operatorAddress
   * @return operatorAddress
  **/
  @Schema(required = true, description = "")
  public String getOperatorAddress() {
    return operatorAddress;
  }

  public void setOperatorAddress(String operatorAddress) {
    this.operatorAddress = operatorAddress;
  }

  public Validator consensusPubkey(String consensusPubkey) {
    this.consensusPubkey = consensusPubkey;
    return this;
  }

   /**
   * Get consensusPubkey
   * @return consensusPubkey
  **/
  @Schema(example = "coinexvalconspub1zcjduepq7sjfglw7ra4mjxpw4ph7dtdhdheh7nz8dfgl6t8u2n5szuuql9mqsrwquu", required = true, description = "")
  public String getConsensusPubkey() {
    return consensusPubkey;
  }

  public void setConsensusPubkey(String consensusPubkey) {
    this.consensusPubkey = consensusPubkey;
  }

  public Validator jailed(Boolean jailed) {
    this.jailed = jailed;
    return this;
  }

   /**
   * Get jailed
   * @return jailed
  **/
  @Schema(required = true, description = "")
  public Boolean isJailed() {
    return jailed;
  }

  public void setJailed(Boolean jailed) {
    this.jailed = jailed;
  }

  public Validator status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Validator tokens(String tokens) {
    this.tokens = tokens;
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  @Schema(required = true, description = "")
  public String getTokens() {
    return tokens;
  }

  public void setTokens(String tokens) {
    this.tokens = tokens;
  }

  public Validator delegatorShares(String delegatorShares) {
    this.delegatorShares = delegatorShares;
    return this;
  }

   /**
   * Get delegatorShares
   * @return delegatorShares
  **/
  @Schema(required = true, description = "")
  public String getDelegatorShares() {
    return delegatorShares;
  }

  public void setDelegatorShares(String delegatorShares) {
    this.delegatorShares = delegatorShares;
  }

  public Validator description(Object description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(required = true, description = "")
  public Object getDescription() {
    return description;
  }

  public void setDescription(Object description) {
    this.description = description;
  }

  public Validator unbondingHeight(String unbondingHeight) {
    this.unbondingHeight = unbondingHeight;
    return this;
  }

   /**
   * Get unbondingHeight
   * @return unbondingHeight
  **/
  @Schema(example = "0", required = true, description = "")
  public String getUnbondingHeight() {
    return unbondingHeight;
  }

  public void setUnbondingHeight(String unbondingHeight) {
    this.unbondingHeight = unbondingHeight;
  }

  public Validator unbondingTime(String unbondingTime) {
    this.unbondingTime = unbondingTime;
    return this;
  }

   /**
   * Get unbondingTime
   * @return unbondingTime
  **/
  @Schema(example = "1970-01-01T00:00:00Z", required = true, description = "")
  public String getUnbondingTime() {
    return unbondingTime;
  }

  public void setUnbondingTime(String unbondingTime) {
    this.unbondingTime = unbondingTime;
  }

  public Validator commission(Object commission) {
    this.commission = commission;
    return this;
  }

   /**
   * Get commission
   * @return commission
  **/
  @Schema(required = true, description = "")
  public Object getCommission() {
    return commission;
  }

  public void setCommission(Object commission) {
    this.commission = commission;
  }

  public Validator minSelfDelegation(String minSelfDelegation) {
    this.minSelfDelegation = minSelfDelegation;
    return this;
  }

   /**
   * Get minSelfDelegation
   * @return minSelfDelegation
  **/
  @Schema(required = true, description = "")
  public String getMinSelfDelegation() {
    return minSelfDelegation;
  }

  public void setMinSelfDelegation(String minSelfDelegation) {
    this.minSelfDelegation = minSelfDelegation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Validator validator = (Validator) o;
    return Objects.equals(this.operatorAddress, validator.operatorAddress) &&
        Objects.equals(this.consensusPubkey, validator.consensusPubkey) &&
        Objects.equals(this.jailed, validator.jailed) &&
        Objects.equals(this.status, validator.status) &&
        Objects.equals(this.tokens, validator.tokens) &&
        Objects.equals(this.delegatorShares, validator.delegatorShares) &&
        Objects.equals(this.description, validator.description) &&
        Objects.equals(this.unbondingHeight, validator.unbondingHeight) &&
        Objects.equals(this.unbondingTime, validator.unbondingTime) &&
        Objects.equals(this.commission, validator.commission) &&
        Objects.equals(this.minSelfDelegation, validator.minSelfDelegation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatorAddress, consensusPubkey, jailed, status, tokens, delegatorShares, description, unbondingHeight, unbondingTime, commission, minSelfDelegation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Validator {\n");
    
    sb.append("    operatorAddress: ").append(toIndentedString(operatorAddress)).append("\n");
    sb.append("    consensusPubkey: ").append(toIndentedString(consensusPubkey)).append("\n");
    sb.append("    jailed: ").append(toIndentedString(jailed)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    delegatorShares: ").append(toIndentedString(delegatorShares)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    unbondingHeight: ").append(toIndentedString(unbondingHeight)).append("\n");
    sb.append("    unbondingTime: ").append(toIndentedString(unbondingTime)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    minSelfDelegation: ").append(toIndentedString(minSelfDelegation)).append("\n");
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
