package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EndTotalsErrorResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class EndTotalsErrorResp   {
  @JsonProperty("totalReportSegments")
  private String totalReportSegments = "029";

  @JsonProperty("positiveTradeItems")
  private String positiveTradeItems = "014";

  @JsonProperty("nonEvaluatedTradeItems")
  private String nonEvaluatedTradeItems = "007";

  @JsonProperty("negativeTradeItems")
  private String negativeTradeItems = "010";

  @JsonProperty("nonEvaluatedLegalItems")
  private String nonEvaluatedLegalItems = "001";

  @JsonProperty("negativeLegalItems")
  private String negativeLegalItems = "002";

  public EndTotalsErrorResp totalReportSegments(String totalReportSegments) {
    this.totalReportSegments = totalReportSegments;
    return this;
  }

  /**
   * Number of report segments.
   * @return totalReportSegments
  **/
  @ApiModelProperty(value = "Number of report segments.")
  
    public String getTotalReportSegments() {
    return totalReportSegments;
  }

  public void setTotalReportSegments(String totalReportSegments) {
    this.totalReportSegments = totalReportSegments;
  }

  public EndTotalsErrorResp positiveTradeItems(String positiveTradeItems) {
    this.positiveTradeItems = positiveTradeItems;
    return this;
  }

  /**
   * Number of positive trade segments.
   * @return positiveTradeItems
  **/
  @ApiModelProperty(value = "Number of positive trade segments.")
  
    public String getPositiveTradeItems() {
    return positiveTradeItems;
  }

  public void setPositiveTradeItems(String positiveTradeItems) {
    this.positiveTradeItems = positiveTradeItems;
  }

  public EndTotalsErrorResp nonEvaluatedTradeItems(String nonEvaluatedTradeItems) {
    this.nonEvaluatedTradeItems = nonEvaluatedTradeItems;
    return this;
  }

  /**
   * Number of non-evaluated trade items.
   * @return nonEvaluatedTradeItems
  **/
  @ApiModelProperty(value = "Number of non-evaluated trade items.")
  
    public String getNonEvaluatedTradeItems() {
    return nonEvaluatedTradeItems;
  }

  public void setNonEvaluatedTradeItems(String nonEvaluatedTradeItems) {
    this.nonEvaluatedTradeItems = nonEvaluatedTradeItems;
  }

  public EndTotalsErrorResp negativeTradeItems(String negativeTradeItems) {
    this.negativeTradeItems = negativeTradeItems;
    return this;
  }

  /**
   * Number of negative trade items.
   * @return negativeTradeItems
  **/
  @ApiModelProperty(value = "Number of negative trade items.")
  
    public String getNegativeTradeItems() {
    return negativeTradeItems;
  }

  public void setNegativeTradeItems(String negativeTradeItems) {
    this.negativeTradeItems = negativeTradeItems;
  }

  public EndTotalsErrorResp nonEvaluatedLegalItems(String nonEvaluatedLegalItems) {
    this.nonEvaluatedLegalItems = nonEvaluatedLegalItems;
    return this;
  }

  /**
   * Number of non-evaluated legal items.
   * @return nonEvaluatedLegalItems
  **/
  @ApiModelProperty(value = "Number of non-evaluated legal items.")
  
    public String getNonEvaluatedLegalItems() {
    return nonEvaluatedLegalItems;
  }

  public void setNonEvaluatedLegalItems(String nonEvaluatedLegalItems) {
    this.nonEvaluatedLegalItems = nonEvaluatedLegalItems;
  }

  public EndTotalsErrorResp negativeLegalItems(String negativeLegalItems) {
    this.negativeLegalItems = negativeLegalItems;
    return this;
  }

  /**
   * Number of negative legal items.
   * @return negativeLegalItems
  **/
  @ApiModelProperty(value = "Number of negative legal items.")
  
    public String getNegativeLegalItems() {
    return negativeLegalItems;
  }

  public void setNegativeLegalItems(String negativeLegalItems) {
    this.negativeLegalItems = negativeLegalItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndTotalsErrorResp endTotalsErrorResp = (EndTotalsErrorResp) o;
    return Objects.equals(this.totalReportSegments, endTotalsErrorResp.totalReportSegments) &&
        Objects.equals(this.positiveTradeItems, endTotalsErrorResp.positiveTradeItems) &&
        Objects.equals(this.nonEvaluatedTradeItems, endTotalsErrorResp.nonEvaluatedTradeItems) &&
        Objects.equals(this.negativeTradeItems, endTotalsErrorResp.negativeTradeItems) &&
        Objects.equals(this.nonEvaluatedLegalItems, endTotalsErrorResp.nonEvaluatedLegalItems) &&
        Objects.equals(this.negativeLegalItems, endTotalsErrorResp.negativeLegalItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalReportSegments, positiveTradeItems, nonEvaluatedTradeItems, negativeTradeItems, nonEvaluatedLegalItems, negativeLegalItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndTotalsErrorResp {\n");
    
    sb.append("    totalReportSegments: ").append(toIndentedString(totalReportSegments)).append("\n");
    sb.append("    positiveTradeItems: ").append(toIndentedString(positiveTradeItems)).append("\n");
    sb.append("    nonEvaluatedTradeItems: ").append(toIndentedString(nonEvaluatedTradeItems)).append("\n");
    sb.append("    negativeTradeItems: ").append(toIndentedString(negativeTradeItems)).append("\n");
    sb.append("    nonEvaluatedLegalItems: ").append(toIndentedString(nonEvaluatedLegalItems)).append("\n");
    sb.append("    negativeLegalItems: ").append(toIndentedString(negativeLegalItems)).append("\n");
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
