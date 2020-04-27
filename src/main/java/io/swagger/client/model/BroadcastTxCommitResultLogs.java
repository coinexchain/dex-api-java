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

/**
 * BroadcastTxCommitResultLogs
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-27T01:19:45.029Z")
public class BroadcastTxCommitResultLogs {
  @SerializedName("msg_index")
  private Integer msgIndex = null;

  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("log")
  private String log = null;

  public BroadcastTxCommitResultLogs msgIndex(Integer msgIndex) {
    this.msgIndex = msgIndex;
    return this;
  }

   /**
   * Get msgIndex
   * @return msgIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getMsgIndex() {
    return msgIndex;
  }

  public void setMsgIndex(Integer msgIndex) {
    this.msgIndex = msgIndex;
  }

  public BroadcastTxCommitResultLogs success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(value = "")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public BroadcastTxCommitResultLogs log(String log) {
    this.log = log;
    return this;
  }

   /**
   * Get log
   * @return log
  **/
  @ApiModelProperty(value = "")
  public String getLog() {
    return log;
  }

  public void setLog(String log) {
    this.log = log;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastTxCommitResultLogs broadcastTxCommitResultLogs = (BroadcastTxCommitResultLogs) o;
    return Objects.equals(this.msgIndex, broadcastTxCommitResultLogs.msgIndex) &&
        Objects.equals(this.success, broadcastTxCommitResultLogs.success) &&
        Objects.equals(this.log, broadcastTxCommitResultLogs.log);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgIndex, success, log);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastTxCommitResultLogs {\n");
    
    sb.append("    msgIndex: ").append(toIndentedString(msgIndex)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
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

