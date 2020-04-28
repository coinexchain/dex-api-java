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
import io.swagger.client.model.UnbondingDelegationPair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2007
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-27T01:19:45.029Z")
public class InlineResponse2007 {
  @SerializedName("height")
  private String height = null;

  @SerializedName("result")
  private List<UnbondingDelegationPair> result = null;

  public InlineResponse2007 height(String height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public InlineResponse2007 result(List<UnbondingDelegationPair> result) {
    this.result = result;
    return this;
  }

  public InlineResponse2007 addResultItem(UnbondingDelegationPair resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<UnbondingDelegationPair>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public List<UnbondingDelegationPair> getResult() {
    return result;
  }

  public void setResult(List<UnbondingDelegationPair> result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(this.height, inlineResponse2007.height) &&
        Objects.equals(this.result, inlineResponse2007.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
