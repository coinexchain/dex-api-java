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
import org.coinex.dex.client.model.InlineResponse200ApplicationVersion;
import org.coinex.dex.client.model.InlineResponse200NodeInfo;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-28T12:10:24.313+08:00")
public class InlineResponse200 {
  @SerializedName("application_version")
  private InlineResponse200ApplicationVersion applicationVersion = null;

  @SerializedName("node_info")
  private InlineResponse200NodeInfo nodeInfo = null;

  public InlineResponse200 applicationVersion(InlineResponse200ApplicationVersion applicationVersion) {
    this.applicationVersion = applicationVersion;
    return this;
  }

   /**
   * Get applicationVersion
   * @return applicationVersion
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200ApplicationVersion getApplicationVersion() {
    return applicationVersion;
  }

  public void setApplicationVersion(InlineResponse200ApplicationVersion applicationVersion) {
    this.applicationVersion = applicationVersion;
  }

  public InlineResponse200 nodeInfo(InlineResponse200NodeInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
    return this;
  }

   /**
   * Get nodeInfo
   * @return nodeInfo
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200NodeInfo getNodeInfo() {
    return nodeInfo;
  }

  public void setNodeInfo(InlineResponse200NodeInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.applicationVersion, inlineResponse200.applicationVersion) &&
        Objects.equals(this.nodeInfo, inlineResponse200.nodeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationVersion, nodeInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    applicationVersion: ").append(toIndentedString(applicationVersion)).append("\n");
    sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
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

