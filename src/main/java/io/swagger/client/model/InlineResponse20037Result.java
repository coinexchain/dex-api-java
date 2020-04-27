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
 * InlineResponse20037Result
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-27T01:19:45.029Z")
public class InlineResponse20037Result {
  @SerializedName("issue_token_fee")
  private String issueTokenFee = null;

  @SerializedName("issue_rare_token_fee")
  private String issueRareTokenFee = null;

  @SerializedName("issue_3char_token_fee")
  private String issue3charTokenFee = null;

  @SerializedName("issue_4char_token_fee")
  private String issue4charTokenFee = null;

  @SerializedName("issue_5char_token_fee")
  private String issue5charTokenFee = null;

  @SerializedName("issue_6char_token_fee")
  private String issue6charTokenFee = null;

  public InlineResponse20037Result issueTokenFee(String issueTokenFee) {
    this.issueTokenFee = issueTokenFee;
    return this;
  }

   /**
   * Get issueTokenFee
   * @return issueTokenFee
  **/
  @ApiModelProperty(value = "")
  public String getIssueTokenFee() {
    return issueTokenFee;
  }

  public void setIssueTokenFee(String issueTokenFee) {
    this.issueTokenFee = issueTokenFee;
  }

  public InlineResponse20037Result issueRareTokenFee(String issueRareTokenFee) {
    this.issueRareTokenFee = issueRareTokenFee;
    return this;
  }

   /**
   * Get issueRareTokenFee
   * @return issueRareTokenFee
  **/
  @ApiModelProperty(value = "")
  public String getIssueRareTokenFee() {
    return issueRareTokenFee;
  }

  public void setIssueRareTokenFee(String issueRareTokenFee) {
    this.issueRareTokenFee = issueRareTokenFee;
  }

  public InlineResponse20037Result issue3charTokenFee(String issue3charTokenFee) {
    this.issue3charTokenFee = issue3charTokenFee;
    return this;
  }

   /**
   * Get issue3charTokenFee
   * @return issue3charTokenFee
  **/
  @ApiModelProperty(value = "")
  public String getIssue3charTokenFee() {
    return issue3charTokenFee;
  }

  public void setIssue3charTokenFee(String issue3charTokenFee) {
    this.issue3charTokenFee = issue3charTokenFee;
  }

  public InlineResponse20037Result issue4charTokenFee(String issue4charTokenFee) {
    this.issue4charTokenFee = issue4charTokenFee;
    return this;
  }

   /**
   * Get issue4charTokenFee
   * @return issue4charTokenFee
  **/
  @ApiModelProperty(value = "")
  public String getIssue4charTokenFee() {
    return issue4charTokenFee;
  }

  public void setIssue4charTokenFee(String issue4charTokenFee) {
    this.issue4charTokenFee = issue4charTokenFee;
  }

  public InlineResponse20037Result issue5charTokenFee(String issue5charTokenFee) {
    this.issue5charTokenFee = issue5charTokenFee;
    return this;
  }

   /**
   * Get issue5charTokenFee
   * @return issue5charTokenFee
  **/
  @ApiModelProperty(value = "")
  public String getIssue5charTokenFee() {
    return issue5charTokenFee;
  }

  public void setIssue5charTokenFee(String issue5charTokenFee) {
    this.issue5charTokenFee = issue5charTokenFee;
  }

  public InlineResponse20037Result issue6charTokenFee(String issue6charTokenFee) {
    this.issue6charTokenFee = issue6charTokenFee;
    return this;
  }

   /**
   * Get issue6charTokenFee
   * @return issue6charTokenFee
  **/
  @ApiModelProperty(value = "")
  public String getIssue6charTokenFee() {
    return issue6charTokenFee;
  }

  public void setIssue6charTokenFee(String issue6charTokenFee) {
    this.issue6charTokenFee = issue6charTokenFee;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20037Result inlineResponse20037Result = (InlineResponse20037Result) o;
    return Objects.equals(this.issueTokenFee, inlineResponse20037Result.issueTokenFee) &&
        Objects.equals(this.issueRareTokenFee, inlineResponse20037Result.issueRareTokenFee) &&
        Objects.equals(this.issue3charTokenFee, inlineResponse20037Result.issue3charTokenFee) &&
        Objects.equals(this.issue4charTokenFee, inlineResponse20037Result.issue4charTokenFee) &&
        Objects.equals(this.issue5charTokenFee, inlineResponse20037Result.issue5charTokenFee) &&
        Objects.equals(this.issue6charTokenFee, inlineResponse20037Result.issue6charTokenFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTokenFee, issueRareTokenFee, issue3charTokenFee, issue4charTokenFee, issue5charTokenFee, issue6charTokenFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20037Result {\n");
    
    sb.append("    issueTokenFee: ").append(toIndentedString(issueTokenFee)).append("\n");
    sb.append("    issueRareTokenFee: ").append(toIndentedString(issueRareTokenFee)).append("\n");
    sb.append("    issue3charTokenFee: ").append(toIndentedString(issue3charTokenFee)).append("\n");
    sb.append("    issue4charTokenFee: ").append(toIndentedString(issue4charTokenFee)).append("\n");
    sb.append("    issue5charTokenFee: ").append(toIndentedString(issue5charTokenFee)).append("\n");
    sb.append("    issue6charTokenFee: ").append(toIndentedString(issue6charTokenFee)).append("\n");
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

