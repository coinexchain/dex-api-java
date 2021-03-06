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
 * PostTxBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class PostTxBody {
  @SerializedName("base_req")
  private BaseReq baseReq = null;

  @SerializedName("amount")
  private Coin amount = null;

  @SerializedName("unlock_time")
  private String unlockTime = null;

  @SerializedName("sender")
  private String sender = null;

  @SerializedName("supervisor")
  private String supervisor = null;

  @SerializedName("reward")
  private String reward = null;

  @SerializedName("operation")
  private Integer operation = null;

  public PostTxBody baseReq(BaseReq baseReq) {
    this.baseReq = baseReq;
    return this;
  }

   /**
   * Get baseReq
   * @return baseReq
  **/
  @ApiModelProperty(required = true, value = "")
  public BaseReq getBaseReq() {
    return baseReq;
  }

  public void setBaseReq(BaseReq baseReq) {
    this.baseReq = baseReq;
  }

  public PostTxBody amount(Coin amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  public Coin getAmount() {
    return amount;
  }

  public void setAmount(Coin amount) {
    this.amount = amount;
  }

  public PostTxBody unlockTime(String unlockTime) {
    this.unlockTime = unlockTime;
    return this;
  }

   /**
   * Get unlockTime
   * @return unlockTime
  **/
  @ApiModelProperty(example = "675132000", required = true, value = "")
  public String getUnlockTime() {
    return unlockTime;
  }

  public void setUnlockTime(String unlockTime) {
    this.unlockTime = unlockTime;
  }

  public PostTxBody sender(String sender) {
    this.sender = sender;
    return this;
  }

   /**
   * The supervised amount sender&#39;s address (required when return or unlock-by-supervisor)
   * @return sender
  **/
  @ApiModelProperty(value = "The supervised amount sender's address (required when return or unlock-by-supervisor)")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public PostTxBody supervisor(String supervisor) {
    this.supervisor = supervisor;
    return this;
  }

   /**
   * The supervisor&#39;s address (required when create or unlock-by-sender if there is a supervisor)
   * @return supervisor
  **/
  @ApiModelProperty(value = "The supervisor's address (required when create or unlock-by-sender if there is a supervisor)")
  public String getSupervisor() {
    return supervisor;
  }

  public void setSupervisor(String supervisor) {
    this.supervisor = supervisor;
  }

  public PostTxBody reward(String reward) {
    this.reward = reward;
    return this;
  }

   /**
   * Get reward
   * @return reward
  **/
  @ApiModelProperty(example = "1000000000", value = "")
  public String getReward() {
    return reward;
  }

  public void setReward(String reward) {
    this.reward = reward;
  }

  public PostTxBody operation(Integer operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Operation type (create: 0; return: 1; unlock-by-sender: 2; unlock-by-supervisor: 3)
   * @return operation
  **/
  @ApiModelProperty(example = "1", required = true, value = "Operation type (create: 0; return: 1; unlock-by-sender: 2; unlock-by-supervisor: 3)")
  public Integer getOperation() {
    return operation;
  }

  public void setOperation(Integer operation) {
    this.operation = operation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostTxBody postTxBody = (PostTxBody) o;
    return Objects.equals(this.baseReq, postTxBody.baseReq) &&
        Objects.equals(this.amount, postTxBody.amount) &&
        Objects.equals(this.unlockTime, postTxBody.unlockTime) &&
        Objects.equals(this.sender, postTxBody.sender) &&
        Objects.equals(this.supervisor, postTxBody.supervisor) &&
        Objects.equals(this.reward, postTxBody.reward) &&
        Objects.equals(this.operation, postTxBody.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseReq, amount, unlockTime, sender, supervisor, reward, operation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTxBody {\n");
    
    sb.append("    baseReq: ").append(toIndentedString(baseReq)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    unlockTime: ").append(toIndentedString(unlockTime)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    supervisor: ").append(toIndentedString(supervisor)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

