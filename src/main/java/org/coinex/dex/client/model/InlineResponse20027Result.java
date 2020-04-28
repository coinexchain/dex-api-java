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

/**
 * InlineResponse20027Result
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-28T12:10:24.313+08:00")
public class InlineResponse20027Result {
  @SerializedName("threshold")
  private String threshold = null;

  @SerializedName("veto")
  private String veto = null;

  @SerializedName("governance_penalty")
  private String governancePenalty = null;

  public InlineResponse20027Result threshold(String threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @ApiModelProperty(example = "0.5000000000", value = "")
  public String getThreshold() {
    return threshold;
  }

  public void setThreshold(String threshold) {
    this.threshold = threshold;
  }

  public InlineResponse20027Result veto(String veto) {
    this.veto = veto;
    return this;
  }

   /**
   * Get veto
   * @return veto
  **/
  @ApiModelProperty(example = "0.3340000000", value = "")
  public String getVeto() {
    return veto;
  }

  public void setVeto(String veto) {
    this.veto = veto;
  }

  public InlineResponse20027Result governancePenalty(String governancePenalty) {
    this.governancePenalty = governancePenalty;
    return this;
  }

   /**
   * Get governancePenalty
   * @return governancePenalty
  **/
  @ApiModelProperty(example = "0.0100000000", value = "")
  public String getGovernancePenalty() {
    return governancePenalty;
  }

  public void setGovernancePenalty(String governancePenalty) {
    this.governancePenalty = governancePenalty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20027Result inlineResponse20027Result = (InlineResponse20027Result) o;
    return Objects.equals(this.threshold, inlineResponse20027Result.threshold) &&
        Objects.equals(this.veto, inlineResponse20027Result.veto) &&
        Objects.equals(this.governancePenalty, inlineResponse20027Result.governancePenalty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threshold, veto, governancePenalty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20027Result {\n");
    
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    veto: ").append(toIndentedString(veto)).append("\n");
    sb.append("    governancePenalty: ").append(toIndentedString(governancePenalty)).append("\n");
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

