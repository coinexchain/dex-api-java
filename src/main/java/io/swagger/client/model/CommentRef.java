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
import java.util.ArrayList;
import java.util.List;

/**
 * CommentRef
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-27T01:19:45.029Z")
public class CommentRef {
  @SerializedName("id")
  private String id = null;

  @SerializedName("reward_target")
  private String rewardTarget = null;

  @SerializedName("reward_token")
  private String rewardToken = null;

  @SerializedName("reward_amount")
  private String rewardAmount = null;

  @SerializedName("attitudes")
  private List<Integer> attitudes = new ArrayList<Integer>();

  public CommentRef id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "9883409", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CommentRef rewardTarget(String rewardTarget) {
    this.rewardTarget = rewardTarget;
    return this;
  }

   /**
   * Get rewardTarget
   * @return rewardTarget
  **/
  @ApiModelProperty(example = "coinex1qwl879nx9t6kef4supyazayf7vjhennyjqwjgr", required = true, value = "")
  public String getRewardTarget() {
    return rewardTarget;
  }

  public void setRewardTarget(String rewardTarget) {
    this.rewardTarget = rewardTarget;
  }

  public CommentRef rewardToken(String rewardToken) {
    this.rewardToken = rewardToken;
    return this;
  }

   /**
   * Get rewardToken
   * @return rewardToken
  **/
  @ApiModelProperty(example = "cet", required = true, value = "")
  public String getRewardToken() {
    return rewardToken;
  }

  public void setRewardToken(String rewardToken) {
    this.rewardToken = rewardToken;
  }

  public CommentRef rewardAmount(String rewardAmount) {
    this.rewardAmount = rewardAmount;
    return this;
  }

   /**
   * Get rewardAmount
   * @return rewardAmount
  **/
  @ApiModelProperty(example = "200000000", required = true, value = "")
  public String getRewardAmount() {
    return rewardAmount;
  }

  public void setRewardAmount(String rewardAmount) {
    this.rewardAmount = rewardAmount;
  }

  public CommentRef attitudes(List<Integer> attitudes) {
    this.attitudes = attitudes;
    return this;
  }

  public CommentRef addAttitudesItem(Integer attitudesItem) {
    this.attitudes.add(attitudesItem);
    return this;
  }

   /**
   * Get attitudes
   * @return attitudes
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Integer> getAttitudes() {
    return attitudes;
  }

  public void setAttitudes(List<Integer> attitudes) {
    this.attitudes = attitudes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentRef commentRef = (CommentRef) o;
    return Objects.equals(this.id, commentRef.id) &&
        Objects.equals(this.rewardTarget, commentRef.rewardTarget) &&
        Objects.equals(this.rewardToken, commentRef.rewardToken) &&
        Objects.equals(this.rewardAmount, commentRef.rewardAmount) &&
        Objects.equals(this.attitudes, commentRef.attitudes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rewardTarget, rewardToken, rewardAmount, attitudes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rewardTarget: ").append(toIndentedString(rewardTarget)).append("\n");
    sb.append("    rewardToken: ").append(toIndentedString(rewardToken)).append("\n");
    sb.append("    rewardAmount: ").append(toIndentedString(rewardAmount)).append("\n");
    sb.append("    attitudes: ").append(toIndentedString(attitudes)).append("\n");
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
