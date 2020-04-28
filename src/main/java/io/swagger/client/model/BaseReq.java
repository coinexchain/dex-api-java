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
import io.swagger.client.model.Coin;
import io.swagger.annotations.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * BaseReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-26T10:53:15.911+08:00[Asia/Shanghai]")
public class BaseReq {
  @SerializedName("from")
  private String from = null;

  @SerializedName("memo")
  private String memo = null;

  @SerializedName("chain_id")
  private String chainId = null;

  @SerializedName("account_number")
  private String accountNumber = null;

  @SerializedName("sequence")
  private String sequence = null;

  @SerializedName("gas")
  private String gas = null;

  @SerializedName("gas_adjustment")
  private String gasAdjustment = null;

  @SerializedName("fees")
  private List<Coin> fees = null;

  @SerializedName("simulate")
  private Boolean simulate = null;

  public BaseReq from(String from) {
    this.from = from;
    return this;
  }

  /**
   * Sender address or Keybase name to generate a transaction
   * @return from
   **/
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public BaseReq memo(String memo) {
    this.memo = memo;
    return this;
  }

  /**
   * Get memo
   * @return memo
   **/
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public BaseReq chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

  /**
   * Get chainId
   * @return chainId
   **/
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }

  public BaseReq accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
   **/
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public BaseReq sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * Get sequence
   * @return sequence
   **/
  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  public BaseReq gas(String gas) {
    this.gas = gas;
    return this;
  }

  /**
   * Get gas
   * @return gas
   **/
  public String getGas() {
    return gas;
  }

  public void setGas(String gas) {
    this.gas = gas;
  }

  public BaseReq gasAdjustment(String gasAdjustment) {
    this.gasAdjustment = gasAdjustment;
    return this;
  }

  /**
   * Get gasAdjustment
   * @return gasAdjustment
   **/
  public String getGasAdjustment() {
    return gasAdjustment;
  }

  public void setGasAdjustment(String gasAdjustment) {
    this.gasAdjustment = gasAdjustment;
  }

  public BaseReq fees(List<Coin> fees) {
    this.fees = fees;
    return this;
  }

  public BaseReq addFeesItem(Coin feesItem) {
    if (this.fees == null) {
      this.fees = new ArrayList<Coin>();
    }
    this.fees.add(feesItem);
    return this;
  }

  /**
   * Get fees
   * @return fees
   **/
  public List<Coin> getFees() {
    return fees;
  }

  public void setFees(List<Coin> fees) {
    this.fees = fees;
  }

  public BaseReq simulate(Boolean simulate) {
    this.simulate = simulate;
    return this;
  }

  /**
   * Estimate gas for a transaction (cannot be used in conjunction with generate_only)
   * @return simulate
   **/
  public Boolean isSimulate() {
    return simulate;
  }

  public void setSimulate(Boolean simulate) {
    this.simulate = simulate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseReq baseReq = (BaseReq) o;
    return Objects.equals(this.from, baseReq.from) &&
            Objects.equals(this.memo, baseReq.memo) &&
            Objects.equals(this.chainId, baseReq.chainId) &&
            Objects.equals(this.accountNumber, baseReq.accountNumber) &&
            Objects.equals(this.sequence, baseReq.sequence) &&
            Objects.equals(this.gas, baseReq.gas) &&
            Objects.equals(this.gasAdjustment, baseReq.gasAdjustment) &&
            Objects.equals(this.fees, baseReq.fees) &&
            Objects.equals(this.simulate, baseReq.simulate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, memo, chainId, accountNumber, sequence, gas, gasAdjustment, fees, simulate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseReq {\n");

    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    gas: ").append(toIndentedString(gas)).append("\n");
    sb.append("    gasAdjustment: ").append(toIndentedString(gasAdjustment)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    simulate: ").append(toIndentedString(simulate)).append("\n");
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
