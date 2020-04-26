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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ValidatorDistInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-26T10:53:15.911+08:00[Asia/Shanghai]")
public class ValidatorDistInfo {
  @SerializedName("operator_address")
  private String operatorAddress = null;

  @SerializedName("self_bond_rewards")
  private List<Coin> selfBondRewards = new ArrayList<Coin>();

  @SerializedName("val_commission")
  private List<Coin> valCommission = new ArrayList<Coin>();

  public ValidatorDistInfo operatorAddress(String operatorAddress) {
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

  public ValidatorDistInfo selfBondRewards(List<Coin> selfBondRewards) {
    this.selfBondRewards = selfBondRewards;
    return this;
  }

  public ValidatorDistInfo addSelfBondRewardsItem(Coin selfBondRewardsItem) {
    this.selfBondRewards.add(selfBondRewardsItem);
    return this;
  }

   /**
   * Get selfBondRewards
   * @return selfBondRewards
  **/
  @Schema(required = true, description = "")
  public List<Coin> getSelfBondRewards() {
    return selfBondRewards;
  }

  public void setSelfBondRewards(List<Coin> selfBondRewards) {
    this.selfBondRewards = selfBondRewards;
  }

  public ValidatorDistInfo valCommission(List<Coin> valCommission) {
    this.valCommission = valCommission;
    return this;
  }

  public ValidatorDistInfo addValCommissionItem(Coin valCommissionItem) {
    this.valCommission.add(valCommissionItem);
    return this;
  }

   /**
   * Get valCommission
   * @return valCommission
  **/
  @Schema(required = true, description = "")
  public List<Coin> getValCommission() {
    return valCommission;
  }

  public void setValCommission(List<Coin> valCommission) {
    this.valCommission = valCommission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidatorDistInfo validatorDistInfo = (ValidatorDistInfo) o;
    return Objects.equals(this.operatorAddress, validatorDistInfo.operatorAddress) &&
        Objects.equals(this.selfBondRewards, validatorDistInfo.selfBondRewards) &&
        Objects.equals(this.valCommission, validatorDistInfo.valCommission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatorAddress, selfBondRewards, valCommission);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidatorDistInfo {\n");
    
    sb.append("    operatorAddress: ").append(toIndentedString(operatorAddress)).append("\n");
    sb.append("    selfBondRewards: ").append(toIndentedString(selfBondRewards)).append("\n");
    sb.append("    valCommission: ").append(toIndentedString(valCommission)).append("\n");
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
