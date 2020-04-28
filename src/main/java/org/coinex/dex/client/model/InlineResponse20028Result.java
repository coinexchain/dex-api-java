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
 * InlineResponse20028Result
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-28T12:10:24.313+08:00")
public class InlineResponse20028Result {
  @SerializedName("voting_period")
  private String votingPeriod = null;

  public InlineResponse20028Result votingPeriod(String votingPeriod) {
    this.votingPeriod = votingPeriod;
    return this;
  }

   /**
   * Get votingPeriod
   * @return votingPeriod
  **/
  @ApiModelProperty(example = "86400000000000", value = "")
  public String getVotingPeriod() {
    return votingPeriod;
  }

  public void setVotingPeriod(String votingPeriod) {
    this.votingPeriod = votingPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20028Result inlineResponse20028Result = (InlineResponse20028Result) o;
    return Objects.equals(this.votingPeriod, inlineResponse20028Result.votingPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(votingPeriod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20028Result {\n");
    
    sb.append("    votingPeriod: ").append(toIndentedString(votingPeriod)).append("\n");
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

