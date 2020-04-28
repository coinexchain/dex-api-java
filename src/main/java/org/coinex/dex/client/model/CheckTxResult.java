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
import org.coinex.dex.client.model.KVPair;

/**
 * CheckTxResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-28T12:10:24.313+08:00")
public class CheckTxResult {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("data")
  private String data = null;

  @SerializedName("gas_used")
  private Integer gasUsed = null;

  @SerializedName("gas_wanted")
  private Integer gasWanted = null;

  @SerializedName("info")
  private String info = null;

  @SerializedName("log")
  private String log = null;

  @SerializedName("tags")
  private List<KVPair> tags = null;

  public CheckTxResult code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public CheckTxResult data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public CheckTxResult gasUsed(Integer gasUsed) {
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Get gasUsed
   * @return gasUsed
  **/
  @ApiModelProperty(value = "")
  public Integer getGasUsed() {
    return gasUsed;
  }

  public void setGasUsed(Integer gasUsed) {
    this.gasUsed = gasUsed;
  }

  public CheckTxResult gasWanted(Integer gasWanted) {
    this.gasWanted = gasWanted;
    return this;
  }

   /**
   * Get gasWanted
   * @return gasWanted
  **/
  @ApiModelProperty(value = "")
  public Integer getGasWanted() {
    return gasWanted;
  }

  public void setGasWanted(Integer gasWanted) {
    this.gasWanted = gasWanted;
  }

  public CheckTxResult info(String info) {
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(value = "")
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public CheckTxResult log(String log) {
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

  public CheckTxResult tags(List<KVPair> tags) {
    this.tags = tags;
    return this;
  }

  public CheckTxResult addTagsItem(KVPair tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<KVPair> getTags() {
    return tags;
  }

  public void setTags(List<KVPair> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckTxResult checkTxResult = (CheckTxResult) o;
    return Objects.equals(this.code, checkTxResult.code) &&
        Objects.equals(this.data, checkTxResult.data) &&
        Objects.equals(this.gasUsed, checkTxResult.gasUsed) &&
        Objects.equals(this.gasWanted, checkTxResult.gasWanted) &&
        Objects.equals(this.info, checkTxResult.info) &&
        Objects.equals(this.log, checkTxResult.log) &&
        Objects.equals(this.tags, checkTxResult.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, gasUsed, gasWanted, info, log, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckTxResult {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    gasWanted: ").append(toIndentedString(gasWanted)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

