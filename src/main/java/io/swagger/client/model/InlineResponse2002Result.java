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
import io.swagger.client.model.TendermintValidator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2002Result
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-27T01:19:45.029Z")
public class InlineResponse2002Result {
  @SerializedName("block_height")
  private String blockHeight = null;

  @SerializedName("validators")
  private List<TendermintValidator> validators = new ArrayList<TendermintValidator>();

  public InlineResponse2002Result blockHeight(String blockHeight) {
    this.blockHeight = blockHeight;
    return this;
  }

   /**
   * Get blockHeight
   * @return blockHeight
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBlockHeight() {
    return blockHeight;
  }

  public void setBlockHeight(String blockHeight) {
    this.blockHeight = blockHeight;
  }

  public InlineResponse2002Result validators(List<TendermintValidator> validators) {
    this.validators = validators;
    return this;
  }

  public InlineResponse2002Result addValidatorsItem(TendermintValidator validatorsItem) {
    this.validators.add(validatorsItem);
    return this;
  }

   /**
   * Get validators
   * @return validators
  **/
  @ApiModelProperty(required = true, value = "")
  public List<TendermintValidator> getValidators() {
    return validators;
  }

  public void setValidators(List<TendermintValidator> validators) {
    this.validators = validators;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002Result inlineResponse2002Result = (InlineResponse2002Result) o;
    return Objects.equals(this.blockHeight, inlineResponse2002Result.blockHeight) &&
        Objects.equals(this.validators, inlineResponse2002Result.validators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockHeight, validators);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002Result {\n");
    
    sb.append("    blockHeight: ").append(toIndentedString(blockHeight)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
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

