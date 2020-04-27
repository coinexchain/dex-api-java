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
import io.swagger.client.model.Coin;
import io.swagger.client.model.LockedCoin;
import io.swagger.client.model.PublicKey;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2004Result
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-27T01:19:45.029Z")
public class InlineResponse2004Result {
  @SerializedName("address")
  private String address = null;

  @SerializedName("coins")
  private List<Coin> coins = new ArrayList<Coin>();

  @SerializedName("locked_coins")
  private List<LockedCoin> lockedCoins = new ArrayList<LockedCoin>();

  @SerializedName("frozen_coins")
  private List<Coin> frozenCoins = new ArrayList<Coin>();

  @SerializedName("public_key")
  private PublicKey publicKey = null;

  @SerializedName("account_number")
  private String accountNumber = null;

  @SerializedName("sequence")
  private String sequence = null;

  @SerializedName("memo_required")
  private Boolean memoRequired = null;

  @SerializedName("referee")
  private String referee = null;

  @SerializedName("referee_change_time")
  private String refereeChangeTime = null;

  public InlineResponse2004Result address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public InlineResponse2004Result coins(List<Coin> coins) {
    this.coins = coins;
    return this;
  }

  public InlineResponse2004Result addCoinsItem(Coin coinsItem) {
    this.coins.add(coinsItem);
    return this;
  }

   /**
   * Get coins
   * @return coins
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Coin> getCoins() {
    return coins;
  }

  public void setCoins(List<Coin> coins) {
    this.coins = coins;
  }

  public InlineResponse2004Result lockedCoins(List<LockedCoin> lockedCoins) {
    this.lockedCoins = lockedCoins;
    return this;
  }

  public InlineResponse2004Result addLockedCoinsItem(LockedCoin lockedCoinsItem) {
    this.lockedCoins.add(lockedCoinsItem);
    return this;
  }

   /**
   * Get lockedCoins
   * @return lockedCoins
  **/
  @ApiModelProperty(required = true, value = "")
  public List<LockedCoin> getLockedCoins() {
    return lockedCoins;
  }

  public void setLockedCoins(List<LockedCoin> lockedCoins) {
    this.lockedCoins = lockedCoins;
  }

  public InlineResponse2004Result frozenCoins(List<Coin> frozenCoins) {
    this.frozenCoins = frozenCoins;
    return this;
  }

  public InlineResponse2004Result addFrozenCoinsItem(Coin frozenCoinsItem) {
    this.frozenCoins.add(frozenCoinsItem);
    return this;
  }

   /**
   * Get frozenCoins
   * @return frozenCoins
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Coin> getFrozenCoins() {
    return frozenCoins;
  }

  public void setFrozenCoins(List<Coin> frozenCoins) {
    this.frozenCoins = frozenCoins;
  }

  public InlineResponse2004Result publicKey(PublicKey publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Get publicKey
   * @return publicKey
  **/
  @ApiModelProperty(required = true, value = "")
  public PublicKey getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(PublicKey publicKey) {
    this.publicKey = publicKey;
  }

  public InlineResponse2004Result accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public InlineResponse2004Result sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Get sequence
   * @return sequence
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  public InlineResponse2004Result memoRequired(Boolean memoRequired) {
    this.memoRequired = memoRequired;
    return this;
  }

   /**
   * Get memoRequired
   * @return memoRequired
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isMemoRequired() {
    return memoRequired;
  }

  public void setMemoRequired(Boolean memoRequired) {
    this.memoRequired = memoRequired;
  }

  public InlineResponse2004Result referee(String referee) {
    this.referee = referee;
    return this;
  }

   /**
   * Get referee
   * @return referee
  **/
  @ApiModelProperty(required = true, value = "")
  public String getReferee() {
    return referee;
  }

  public void setReferee(String referee) {
    this.referee = referee;
  }

  public InlineResponse2004Result refereeChangeTime(String refereeChangeTime) {
    this.refereeChangeTime = refereeChangeTime;
    return this;
  }

   /**
   * Get refereeChangeTime
   * @return refereeChangeTime
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRefereeChangeTime() {
    return refereeChangeTime;
  }

  public void setRefereeChangeTime(String refereeChangeTime) {
    this.refereeChangeTime = refereeChangeTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004Result inlineResponse2004Result = (InlineResponse2004Result) o;
    return Objects.equals(this.address, inlineResponse2004Result.address) &&
        Objects.equals(this.coins, inlineResponse2004Result.coins) &&
        Objects.equals(this.lockedCoins, inlineResponse2004Result.lockedCoins) &&
        Objects.equals(this.frozenCoins, inlineResponse2004Result.frozenCoins) &&
        Objects.equals(this.publicKey, inlineResponse2004Result.publicKey) &&
        Objects.equals(this.accountNumber, inlineResponse2004Result.accountNumber) &&
        Objects.equals(this.sequence, inlineResponse2004Result.sequence) &&
        Objects.equals(this.memoRequired, inlineResponse2004Result.memoRequired) &&
        Objects.equals(this.referee, inlineResponse2004Result.referee) &&
        Objects.equals(this.refereeChangeTime, inlineResponse2004Result.refereeChangeTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, coins, lockedCoins, frozenCoins, publicKey, accountNumber, sequence, memoRequired, referee, refereeChangeTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004Result {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    coins: ").append(toIndentedString(coins)).append("\n");
    sb.append("    lockedCoins: ").append(toIndentedString(lockedCoins)).append("\n");
    sb.append("    frozenCoins: ").append(toIndentedString(frozenCoins)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    memoRequired: ").append(toIndentedString(memoRequired)).append("\n");
    sb.append("    referee: ").append(toIndentedString(referee)).append("\n");
    sb.append("    refereeChangeTime: ").append(toIndentedString(refereeChangeTime)).append("\n");
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

