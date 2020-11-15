package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.AutoDetailDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AutomotiveProfileSummary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class AutomotiveProfileSummary   {
  @JsonProperty("totalOpenAutoLoanBalance")
  private String totalOpenAutoLoanBalance = null;

  @JsonProperty("totalOpenAutoLoanMonthlyPayment")
  private String totalOpenAutoLoanMonthlyPayment = null;

  @JsonProperty("totalNumberAllAutoLoans")
  private String totalNumberAllAutoLoans = null;

  @JsonProperty("totalNumberOpenAutoLoans")
  private String totalNumberOpenAutoLoans = null;

  @JsonProperty("totalNumber30DayDelinquencies")
  private String totalNumber30DayDelinquencies = null;

  @JsonProperty("totalNumber60DayDelinquencies")
  private String totalNumber60DayDelinquencies = null;

  @JsonProperty("totalNumber90DayDelinquencies")
  private String totalNumber90DayDelinquencies = null;

  @JsonProperty("worstDelinquency")
  private String worstDelinquency = null;

  @JsonProperty("worstDelinquencyDate")
  private String worstDelinquencyDate = null;

  @JsonProperty("autoDetail")
  @Valid
  private List<AutoDetailDetails> autoDetail = null;

  public AutomotiveProfileSummary totalOpenAutoLoanBalance(String totalOpenAutoLoanBalance) {
    this.totalOpenAutoLoanBalance = totalOpenAutoLoanBalance;
    return this;
  }

  /**
   * Total Balances of All Open Auto Loans and Leases.
   * @return totalOpenAutoLoanBalance
  **/
  @ApiModelProperty(value = "Total Balances of All Open Auto Loans and Leases.")
  
    public String getTotalOpenAutoLoanBalance() {
    return totalOpenAutoLoanBalance;
  }

  public void setTotalOpenAutoLoanBalance(String totalOpenAutoLoanBalance) {
    this.totalOpenAutoLoanBalance = totalOpenAutoLoanBalance;
  }

  public AutomotiveProfileSummary totalOpenAutoLoanMonthlyPayment(String totalOpenAutoLoanMonthlyPayment) {
    this.totalOpenAutoLoanMonthlyPayment = totalOpenAutoLoanMonthlyPayment;
    return this;
  }

  /**
   * Total Monthly Payments of All Open Auto Loans and Leases.
   * @return totalOpenAutoLoanMonthlyPayment
  **/
  @ApiModelProperty(value = "Total Monthly Payments of All Open Auto Loans and Leases.")
  
    public String getTotalOpenAutoLoanMonthlyPayment() {
    return totalOpenAutoLoanMonthlyPayment;
  }

  public void setTotalOpenAutoLoanMonthlyPayment(String totalOpenAutoLoanMonthlyPayment) {
    this.totalOpenAutoLoanMonthlyPayment = totalOpenAutoLoanMonthlyPayment;
  }

  public AutomotiveProfileSummary totalNumberAllAutoLoans(String totalNumberAllAutoLoans) {
    this.totalNumberAllAutoLoans = totalNumberAllAutoLoans;
    return this;
  }

  /**
   * Total Number of All Auto Loans and Leases.
   * @return totalNumberAllAutoLoans
  **/
  @ApiModelProperty(value = "Total Number of All Auto Loans and Leases.")
  
    public String getTotalNumberAllAutoLoans() {
    return totalNumberAllAutoLoans;
  }

  public void setTotalNumberAllAutoLoans(String totalNumberAllAutoLoans) {
    this.totalNumberAllAutoLoans = totalNumberAllAutoLoans;
  }

  public AutomotiveProfileSummary totalNumberOpenAutoLoans(String totalNumberOpenAutoLoans) {
    this.totalNumberOpenAutoLoans = totalNumberOpenAutoLoans;
    return this;
  }

  /**
   * Total Number of All Open Auto Loans and Leases.
   * @return totalNumberOpenAutoLoans
  **/
  @ApiModelProperty(value = "Total Number of All Open Auto Loans and Leases.")
  
    public String getTotalNumberOpenAutoLoans() {
    return totalNumberOpenAutoLoans;
  }

  public void setTotalNumberOpenAutoLoans(String totalNumberOpenAutoLoans) {
    this.totalNumberOpenAutoLoans = totalNumberOpenAutoLoans;
  }

  public AutomotiveProfileSummary totalNumber30DayDelinquencies(String totalNumber30DayDelinquencies) {
    this.totalNumber30DayDelinquencies = totalNumber30DayDelinquencies;
    return this;
  }

  /**
   * Total Number of 30 Day Delinquencies for All Auto Loans and Leases.
   * @return totalNumber30DayDelinquencies
  **/
  @ApiModelProperty(value = "Total Number of 30 Day Delinquencies for All Auto Loans and Leases.")
  
    public String getTotalNumber30DayDelinquencies() {
    return totalNumber30DayDelinquencies;
  }

  public void setTotalNumber30DayDelinquencies(String totalNumber30DayDelinquencies) {
    this.totalNumber30DayDelinquencies = totalNumber30DayDelinquencies;
  }

  public AutomotiveProfileSummary totalNumber60DayDelinquencies(String totalNumber60DayDelinquencies) {
    this.totalNumber60DayDelinquencies = totalNumber60DayDelinquencies;
    return this;
  }

  /**
   * Total Number of 60 Day Delinquencies for All Auto Loans and Leases.
   * @return totalNumber60DayDelinquencies
  **/
  @ApiModelProperty(value = "Total Number of 60 Day Delinquencies for All Auto Loans and Leases.")
  
    public String getTotalNumber60DayDelinquencies() {
    return totalNumber60DayDelinquencies;
  }

  public void setTotalNumber60DayDelinquencies(String totalNumber60DayDelinquencies) {
    this.totalNumber60DayDelinquencies = totalNumber60DayDelinquencies;
  }

  public AutomotiveProfileSummary totalNumber90DayDelinquencies(String totalNumber90DayDelinquencies) {
    this.totalNumber90DayDelinquencies = totalNumber90DayDelinquencies;
    return this;
  }

  /**
   * Total Number of 90 Day Delinquencies for All Auto Loans and Leases.
   * @return totalNumber90DayDelinquencies
  **/
  @ApiModelProperty(value = "Total Number of 90 Day Delinquencies for All Auto Loans and Leases.")
  
    public String getTotalNumber90DayDelinquencies() {
    return totalNumber90DayDelinquencies;
  }

  public void setTotalNumber90DayDelinquencies(String totalNumber90DayDelinquencies) {
    this.totalNumber90DayDelinquencies = totalNumber90DayDelinquencies;
  }

  public AutomotiveProfileSummary worstDelinquency(String worstDelinquency) {
    this.worstDelinquency = worstDelinquency;
    return this;
  }

  /**
   * Worst Delinquency of All the Auto Loans and Leases.
   * @return worstDelinquency
  **/
  @ApiModelProperty(value = "Worst Delinquency of All the Auto Loans and Leases.")
  
    public String getWorstDelinquency() {
    return worstDelinquency;
  }

  public void setWorstDelinquency(String worstDelinquency) {
    this.worstDelinquency = worstDelinquency;
  }

  public AutomotiveProfileSummary worstDelinquencyDate(String worstDelinquencyDate) {
    this.worstDelinquencyDate = worstDelinquencyDate;
    return this;
  }

  /**
   * Worst Delinquency Date of All the Auto Loans and Leases. Format = MMDDCCYY.
   * @return worstDelinquencyDate
  **/
  @ApiModelProperty(value = "Worst Delinquency Date of All the Auto Loans and Leases. Format = MMDDCCYY.")
  
    public String getWorstDelinquencyDate() {
    return worstDelinquencyDate;
  }

  public void setWorstDelinquencyDate(String worstDelinquencyDate) {
    this.worstDelinquencyDate = worstDelinquencyDate;
  }

  public AutomotiveProfileSummary autoDetail(List<AutoDetailDetails> autoDetail) {
    this.autoDetail = autoDetail;
    return this;
  }

  public AutomotiveProfileSummary addAutoDetailItem(AutoDetailDetails autoDetailItem) {
    if (this.autoDetail == null) {
      this.autoDetail = new ArrayList<AutoDetailDetails>();
    }
    this.autoDetail.add(autoDetailItem);
    return this;
  }

  /**
   * Get autoDetail
   * @return autoDetail
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<AutoDetailDetails> getAutoDetail() {
    return autoDetail;
  }

  public void setAutoDetail(List<AutoDetailDetails> autoDetail) {
    this.autoDetail = autoDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomotiveProfileSummary automotiveProfileSummary = (AutomotiveProfileSummary) o;
    return Objects.equals(this.totalOpenAutoLoanBalance, automotiveProfileSummary.totalOpenAutoLoanBalance) &&
        Objects.equals(this.totalOpenAutoLoanMonthlyPayment, automotiveProfileSummary.totalOpenAutoLoanMonthlyPayment) &&
        Objects.equals(this.totalNumberAllAutoLoans, automotiveProfileSummary.totalNumberAllAutoLoans) &&
        Objects.equals(this.totalNumberOpenAutoLoans, automotiveProfileSummary.totalNumberOpenAutoLoans) &&
        Objects.equals(this.totalNumber30DayDelinquencies, automotiveProfileSummary.totalNumber30DayDelinquencies) &&
        Objects.equals(this.totalNumber60DayDelinquencies, automotiveProfileSummary.totalNumber60DayDelinquencies) &&
        Objects.equals(this.totalNumber90DayDelinquencies, automotiveProfileSummary.totalNumber90DayDelinquencies) &&
        Objects.equals(this.worstDelinquency, automotiveProfileSummary.worstDelinquency) &&
        Objects.equals(this.worstDelinquencyDate, automotiveProfileSummary.worstDelinquencyDate) &&
        Objects.equals(this.autoDetail, automotiveProfileSummary.autoDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalOpenAutoLoanBalance, totalOpenAutoLoanMonthlyPayment, totalNumberAllAutoLoans, totalNumberOpenAutoLoans, totalNumber30DayDelinquencies, totalNumber60DayDelinquencies, totalNumber90DayDelinquencies, worstDelinquency, worstDelinquencyDate, autoDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomotiveProfileSummary {\n");
    
    sb.append("    totalOpenAutoLoanBalance: ").append(toIndentedString(totalOpenAutoLoanBalance)).append("\n");
    sb.append("    totalOpenAutoLoanMonthlyPayment: ").append(toIndentedString(totalOpenAutoLoanMonthlyPayment)).append("\n");
    sb.append("    totalNumberAllAutoLoans: ").append(toIndentedString(totalNumberAllAutoLoans)).append("\n");
    sb.append("    totalNumberOpenAutoLoans: ").append(toIndentedString(totalNumberOpenAutoLoans)).append("\n");
    sb.append("    totalNumber30DayDelinquencies: ").append(toIndentedString(totalNumber30DayDelinquencies)).append("\n");
    sb.append("    totalNumber60DayDelinquencies: ").append(toIndentedString(totalNumber60DayDelinquencies)).append("\n");
    sb.append("    totalNumber90DayDelinquencies: ").append(toIndentedString(totalNumber90DayDelinquencies)).append("\n");
    sb.append("    worstDelinquency: ").append(toIndentedString(worstDelinquency)).append("\n");
    sb.append("    worstDelinquencyDate: ").append(toIndentedString(worstDelinquencyDate)).append("\n");
    sb.append("    autoDetail: ").append(toIndentedString(autoDetail)).append("\n");
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
