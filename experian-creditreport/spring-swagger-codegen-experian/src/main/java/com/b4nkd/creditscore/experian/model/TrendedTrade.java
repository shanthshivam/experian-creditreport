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
 * Trended Data
 */
@ApiModel(description = "Trended Data")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class TrendedTrade   {
  @JsonProperty("monthNumber")
  private String monthNumber = null;

  @JsonProperty("balanceAmount")
  private String balanceAmount = null;

  @JsonProperty("originalLoamAmountOrLimit")
  private String originalLoamAmountOrLimit = null;

  @JsonProperty("scheduledPaymentAmount")
  private String scheduledPaymentAmount = null;

  @JsonProperty("actualPaymentAmount")
  private String actualPaymentAmount = null;

  @JsonProperty("lastPaymentDate")
  private String lastPaymentDate = null;

  public TrendedTrade monthNumber(String monthNumber) {
    this.monthNumber = monthNumber;
    return this;
  }

  /**
   * The month for which this data applies. For example 0 means it is for the inquiry month, 1 means it is for the a month before the inquiry month and so on.
   * @return monthNumber
  **/
  @ApiModelProperty(value = "The month for which this data applies. For example 0 means it is for the inquiry month, 1 means it is for the a month before the inquiry month and so on.")
  
    public String getMonthNumber() {
    return monthNumber;
  }

  public void setMonthNumber(String monthNumber) {
    this.monthNumber = monthNumber;
  }

  public TrendedTrade balanceAmount(String balanceAmount) {
    this.balanceAmount = balanceAmount;
    return this;
  }

  /**
   * Balance Amount
   * @return balanceAmount
  **/
  @ApiModelProperty(value = "Balance Amount")
  
    public String getBalanceAmount() {
    return balanceAmount;
  }

  public void setBalanceAmount(String balanceAmount) {
    this.balanceAmount = balanceAmount;
  }

  public TrendedTrade originalLoamAmountOrLimit(String originalLoamAmountOrLimit) {
    this.originalLoamAmountOrLimit = originalLoamAmountOrLimit;
    return this;
  }

  /**
   * Original Loan Amount or Limit
   * @return originalLoamAmountOrLimit
  **/
  @ApiModelProperty(value = "Original Loan Amount or Limit")
  
    public String getOriginalLoamAmountOrLimit() {
    return originalLoamAmountOrLimit;
  }

  public void setOriginalLoamAmountOrLimit(String originalLoamAmountOrLimit) {
    this.originalLoamAmountOrLimit = originalLoamAmountOrLimit;
  }

  public TrendedTrade scheduledPaymentAmount(String scheduledPaymentAmount) {
    this.scheduledPaymentAmount = scheduledPaymentAmount;
    return this;
  }

  /**
   * Scheduled Payment Amount
   * @return scheduledPaymentAmount
  **/
  @ApiModelProperty(value = "Scheduled Payment Amount")
  
    public String getScheduledPaymentAmount() {
    return scheduledPaymentAmount;
  }

  public void setScheduledPaymentAmount(String scheduledPaymentAmount) {
    this.scheduledPaymentAmount = scheduledPaymentAmount;
  }

  public TrendedTrade actualPaymentAmount(String actualPaymentAmount) {
    this.actualPaymentAmount = actualPaymentAmount;
    return this;
  }

  /**
   * Actual Payment Amount
   * @return actualPaymentAmount
  **/
  @ApiModelProperty(value = "Actual Payment Amount")
  
    public String getActualPaymentAmount() {
    return actualPaymentAmount;
  }

  public void setActualPaymentAmount(String actualPaymentAmount) {
    this.actualPaymentAmount = actualPaymentAmount;
  }

  public TrendedTrade lastPaymentDate(String lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
    return this;
  }

  /**
   * Last Payment Date
   * @return lastPaymentDate
  **/
  @ApiModelProperty(value = "Last Payment Date")
  
    public String getLastPaymentDate() {
    return lastPaymentDate;
  }

  public void setLastPaymentDate(String lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendedTrade trendedTrade = (TrendedTrade) o;
    return Objects.equals(this.monthNumber, trendedTrade.monthNumber) &&
        Objects.equals(this.balanceAmount, trendedTrade.balanceAmount) &&
        Objects.equals(this.originalLoamAmountOrLimit, trendedTrade.originalLoamAmountOrLimit) &&
        Objects.equals(this.scheduledPaymentAmount, trendedTrade.scheduledPaymentAmount) &&
        Objects.equals(this.actualPaymentAmount, trendedTrade.actualPaymentAmount) &&
        Objects.equals(this.lastPaymentDate, trendedTrade.lastPaymentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monthNumber, balanceAmount, originalLoamAmountOrLimit, scheduledPaymentAmount, actualPaymentAmount, lastPaymentDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendedTrade {\n");
    
    sb.append("    monthNumber: ").append(toIndentedString(monthNumber)).append("\n");
    sb.append("    balanceAmount: ").append(toIndentedString(balanceAmount)).append("\n");
    sb.append("    originalLoamAmountOrLimit: ").append(toIndentedString(originalLoamAmountOrLimit)).append("\n");
    sb.append("    scheduledPaymentAmount: ").append(toIndentedString(scheduledPaymentAmount)).append("\n");
    sb.append("    actualPaymentAmount: ").append(toIndentedString(actualPaymentAmount)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
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
