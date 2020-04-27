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
import io.swagger.client.model.BlockIDParts;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * BlockID
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-27T01:19:45.029Z")
public class BlockID extends HashMap<String, Object> {
  @SerializedName("hash")
  private String hash = null;

  @SerializedName("parts")
  private BlockIDParts parts = null;

  public BlockID hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @ApiModelProperty(required = true, value = "")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public BlockID parts(BlockIDParts parts) {
    this.parts = parts;
    return this;
  }

   /**
   * Get parts
   * @return parts
  **/
  @ApiModelProperty(required = true, value = "")
  public BlockIDParts getParts() {
    return parts;
  }

  public void setParts(BlockIDParts parts) {
    this.parts = parts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockID blockID = (BlockID) o;
    return Objects.equals(this.hash, blockID.hash) &&
        Objects.equals(this.parts, blockID.parts) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, parts, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockID {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
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

