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
import java.util.ArrayList;
import java.util.List;
import org.coinex.dex.client.model.Msg;
import org.coinex.dex.client.model.StdTxCoreFee;
import org.coinex.dex.client.model.StdTxCoreSignatures;

/**
 * StdTxCore
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class StdTxCore {
  @SerializedName("msg")
  private List<Msg> msg = null;

  @SerializedName("fee")
  private StdTxCoreFee fee = null;

  @SerializedName("memo")
  private String memo = null;

  @SerializedName("signatures")
  private List<StdTxCoreSignatures> signatures = new ArrayList<>();

  public StdTxCore msg(List<Msg> msg) {
    this.msg = msg;
    return this;
  }

  public StdTxCore addMsgItem(Msg msgItem) {
    if (this.msg == null) {
      this.msg = new ArrayList<>();
    }
    this.msg.add(msgItem);
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @ApiModelProperty(value = "")
  public List<Msg> getMsg() {
    return msg;
  }

  public void setMsg(List<Msg> msg) {
    this.msg = msg;
  }

  public StdTxCore fee(StdTxCoreFee fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @ApiModelProperty(required = true, value = "")
  public StdTxCoreFee getFee() {
    return fee;
  }

  public void setFee(StdTxCoreFee fee) {
    this.fee = fee;
  }

  public StdTxCore memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * Get memo
   * @return memo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public StdTxCore signatures(List<StdTxCoreSignatures> signatures) {
    this.signatures = signatures;
    return this;
  }

  public StdTxCore addSignaturesItem(StdTxCoreSignatures signaturesItem) {
    this.signatures.add(signaturesItem);
    return this;
  }

   /**
   * Get signatures
   * @return signatures
  **/
  @ApiModelProperty(required = true, value = "")
  public List<StdTxCoreSignatures> getSignatures() {
    return signatures;
  }

  public void setSignatures(List<StdTxCoreSignatures> signatures) {
    this.signatures = signatures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StdTxCore stdTxCore = (StdTxCore) o;
    return Objects.equals(this.msg, stdTxCore.msg) &&
        Objects.equals(this.fee, stdTxCore.fee) &&
        Objects.equals(this.memo, stdTxCore.memo) &&
        Objects.equals(this.signatures, stdTxCore.signatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msg, fee, memo, signatures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StdTxCore {\n");
    
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
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

