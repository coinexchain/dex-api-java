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
import io.swagger.client.model.Validator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20010
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-27T01:19:45.029Z")
public class InlineResponse20010 {
  @SerializedName("height")
  private String height = null;

  @SerializedName("result")
  private List<Validator> result = null;

  public InlineResponse20010 height(String height) {
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

  public InlineResponse20010 result(List<Validator> result) {
    this.result = result;
    return this;
  }

  public InlineResponse20010 addResultItem(Validator resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<Validator>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public List<Validator> getResult() {
    return result;
  }

  public void setResult(List<Validator> result) {
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
    InlineResponse20010 inlineResponse20010 = (InlineResponse20010) o;
    return Objects.equals(this.height, inlineResponse20010.height) &&
        Objects.equals(this.result, inlineResponse20010.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010 {\n");
    
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

