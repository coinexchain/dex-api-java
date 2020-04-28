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
import org.coinex.dex.client.model.BlockEvidence;
import org.coinex.dex.client.model.BlockHeader;
import org.coinex.dex.client.model.BlockLastCommit;

/**
 * Block
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-28T12:10:24.313+08:00")
public class Block {
  @SerializedName("header")
  private BlockHeader header = null;

  @SerializedName("txs")
  private List<String> txs = null;

  @SerializedName("evidence")
  private BlockEvidence evidence = null;

  @SerializedName("last_commit")
  private BlockLastCommit lastCommit = null;

  public Block header(BlockHeader header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(value = "")
  public BlockHeader getHeader() {
    return header;
  }

  public void setHeader(BlockHeader header) {
    this.header = header;
  }

  public Block txs(List<String> txs) {
    this.txs = txs;
    return this;
  }

  public Block addTxsItem(String txsItem) {
    if (this.txs == null) {
      this.txs = new ArrayList<>();
    }
    this.txs.add(txsItem);
    return this;
  }

   /**
   * Get txs
   * @return txs
  **/
  @ApiModelProperty(value = "")
  public List<String> getTxs() {
    return txs;
  }

  public void setTxs(List<String> txs) {
    this.txs = txs;
  }

  public Block evidence(BlockEvidence evidence) {
    this.evidence = evidence;
    return this;
  }

   /**
   * Get evidence
   * @return evidence
  **/
  @ApiModelProperty(value = "")
  public BlockEvidence getEvidence() {
    return evidence;
  }

  public void setEvidence(BlockEvidence evidence) {
    this.evidence = evidence;
  }

  public Block lastCommit(BlockLastCommit lastCommit) {
    this.lastCommit = lastCommit;
    return this;
  }

   /**
   * Get lastCommit
   * @return lastCommit
  **/
  @ApiModelProperty(value = "")
  public BlockLastCommit getLastCommit() {
    return lastCommit;
  }

  public void setLastCommit(BlockLastCommit lastCommit) {
    this.lastCommit = lastCommit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Block block = (Block) o;
    return Objects.equals(this.header, block.header) &&
        Objects.equals(this.txs, block.txs) &&
        Objects.equals(this.evidence, block.evidence) &&
        Objects.equals(this.lastCommit, block.lastCommit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, txs, evidence, lastCommit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Block {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    txs: ").append(toIndentedString(txs)).append("\n");
    sb.append("    evidence: ").append(toIndentedString(evidence)).append("\n");
    sb.append("    lastCommit: ").append(toIndentedString(lastCommit)).append("\n");
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

