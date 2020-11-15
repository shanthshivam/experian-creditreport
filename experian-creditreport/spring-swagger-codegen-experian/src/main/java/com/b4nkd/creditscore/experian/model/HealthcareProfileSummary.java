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
 * HealthcareProfileSummary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class HealthcareProfileSummary   {
  @JsonProperty("openRevolvingCount")
  private String openRevolvingCount = null;

  @JsonProperty("openRevolvingBalance")
  private String openRevolvingBalance = null;

  @JsonProperty("openRevolvingCreditLimits")
  private String openRevolvingCreditLimits = null;

  @JsonProperty("openInstallmentCount")
  private String openInstallmentCount = null;

  @JsonProperty("openInstallmentBalanceAmount")
  private String openInstallmentBalanceAmount = null;

  @JsonProperty("openInstallmentMonthlyPaymentAmount")
  private String openInstallmentMonthlyPaymentAmount = null;

  @JsonProperty("unpaidCollectionsCount")
  private String unpaidCollectionsCount = null;

  @JsonProperty("unpaidCollectionsAmount")
  private String unpaidCollectionsAmount = null;

  @JsonProperty("bankruptciesFiledCount")
  private String bankruptciesFiledCount = null;

  @JsonProperty("bankruptciesFiledAmount")
  private String bankruptciesFiledAmount = null;

  @JsonProperty("bankruptciesDischargedCount")
  private String bankruptciesDischargedCount = null;

  @JsonProperty("bankruptciesDischargedAmount")
  private String bankruptciesDischargedAmount = null;

  @JsonProperty("bankruptciesDismissedCount")
  private String bankruptciesDismissedCount = null;

  @JsonProperty("bankruptciesDismissedAmount")
  private String bankruptciesDismissedAmount = null;

  @JsonProperty("liensCount")
  private String liensCount = null;

  @JsonProperty("liensAmount")
  private String liensAmount = null;

  @JsonProperty("liensReleasedCount")
  private String liensReleasedCount = null;

  @JsonProperty("liensReleasedAmount")
  private String liensReleasedAmount = null;

  @JsonProperty("judgments")
  private String judgments = null;

  @JsonProperty("judgmentsAmount")
  private String judgmentsAmount = null;

  @JsonProperty("judgmentsSatisfiedCount")
  private String judgmentsSatisfiedCount = null;

  @JsonProperty("judgmentsSatisfiedAmount")
  private String judgmentsSatisfiedAmount = null;

  @JsonProperty("judgmentsVacatedCount")
  private String judgmentsVacatedCount = null;

  @JsonProperty("judgmentsVacatedAmount")
  private String judgmentsVacatedAmount = null;

  @JsonProperty("inquiriesCountLast30Days")
  private String inquiriesCountLast30Days = null;

  @JsonProperty("inquiriesCountLastTwoYears")
  private String inquiriesCountLastTwoYears = null;

  @JsonProperty("inquiriesAmount")
  private String inquiriesAmount = null;

  public HealthcareProfileSummary openRevolvingCount(String openRevolvingCount) {
    this.openRevolvingCount = openRevolvingCount;
    return this;
  }

  /**
   * Number of open revolving accounts on the profile
   * @return openRevolvingCount
  **/
  @ApiModelProperty(value = "Number of open revolving accounts on the profile")
  
    public String getOpenRevolvingCount() {
    return openRevolvingCount;
  }

  public void setOpenRevolvingCount(String openRevolvingCount) {
    this.openRevolvingCount = openRevolvingCount;
  }

  public HealthcareProfileSummary openRevolvingBalance(String openRevolvingBalance) {
    this.openRevolvingBalance = openRevolvingBalance;
    return this;
  }

  /**
   * Total dollar amount of open revolving tradelines. If not present on profile, this field is empty.
   * @return openRevolvingBalance
  **/
  @ApiModelProperty(value = "Total dollar amount of open revolving tradelines. If not present on profile, this field is empty.")
  
    public String getOpenRevolvingBalance() {
    return openRevolvingBalance;
  }

  public void setOpenRevolvingBalance(String openRevolvingBalance) {
    this.openRevolvingBalance = openRevolvingBalance;
  }

  public HealthcareProfileSummary openRevolvingCreditLimits(String openRevolvingCreditLimits) {
    this.openRevolvingCreditLimits = openRevolvingCreditLimits;
    return this;
  }

  /**
   * Total dollar amount of open revolving credit limits. If not present on profile, this field is empty.
   * @return openRevolvingCreditLimits
  **/
  @ApiModelProperty(value = "Total dollar amount of open revolving credit limits. If not present on profile, this field is empty.")
  
    public String getOpenRevolvingCreditLimits() {
    return openRevolvingCreditLimits;
  }

  public void setOpenRevolvingCreditLimits(String openRevolvingCreditLimits) {
    this.openRevolvingCreditLimits = openRevolvingCreditLimits;
  }

  public HealthcareProfileSummary openInstallmentCount(String openInstallmentCount) {
    this.openInstallmentCount = openInstallmentCount;
    return this;
  }

  /**
   * Number of open installment accounts on the profile
   * @return openInstallmentCount
  **/
  @ApiModelProperty(value = "Number of open installment accounts on the profile")
  
    public String getOpenInstallmentCount() {
    return openInstallmentCount;
  }

  public void setOpenInstallmentCount(String openInstallmentCount) {
    this.openInstallmentCount = openInstallmentCount;
  }

  public HealthcareProfileSummary openInstallmentBalanceAmount(String openInstallmentBalanceAmount) {
    this.openInstallmentBalanceAmount = openInstallmentBalanceAmount;
    return this;
  }

  /**
   * Total balance amount of open installment loans. If not present on profile, this field is empty
   * @return openInstallmentBalanceAmount
  **/
  @ApiModelProperty(value = "Total balance amount of open installment loans. If not present on profile, this field is empty")
  
    public String getOpenInstallmentBalanceAmount() {
    return openInstallmentBalanceAmount;
  }

  public void setOpenInstallmentBalanceAmount(String openInstallmentBalanceAmount) {
    this.openInstallmentBalanceAmount = openInstallmentBalanceAmount;
  }

  public HealthcareProfileSummary openInstallmentMonthlyPaymentAmount(String openInstallmentMonthlyPaymentAmount) {
    this.openInstallmentMonthlyPaymentAmount = openInstallmentMonthlyPaymentAmount;
    return this;
  }

  /**
   * Total open installment monthly payment amount. If not present on profile, this field is empty
   * @return openInstallmentMonthlyPaymentAmount
  **/
  @ApiModelProperty(value = "Total open installment monthly payment amount. If not present on profile, this field is empty")
  
    public String getOpenInstallmentMonthlyPaymentAmount() {
    return openInstallmentMonthlyPaymentAmount;
  }

  public void setOpenInstallmentMonthlyPaymentAmount(String openInstallmentMonthlyPaymentAmount) {
    this.openInstallmentMonthlyPaymentAmount = openInstallmentMonthlyPaymentAmount;
  }

  public HealthcareProfileSummary unpaidCollectionsCount(String unpaidCollectionsCount) {
    this.unpaidCollectionsCount = unpaidCollectionsCount;
    return this;
  }

  /**
   * Number of unpaid collections account on the profile
   * @return unpaidCollectionsCount
  **/
  @ApiModelProperty(value = "Number of unpaid collections account on the profile")
  
    public String getUnpaidCollectionsCount() {
    return unpaidCollectionsCount;
  }

  public void setUnpaidCollectionsCount(String unpaidCollectionsCount) {
    this.unpaidCollectionsCount = unpaidCollectionsCount;
  }

  public HealthcareProfileSummary unpaidCollectionsAmount(String unpaidCollectionsAmount) {
    this.unpaidCollectionsAmount = unpaidCollectionsAmount;
    return this;
  }

  /**
   * Total dollar amount of unpaid collections. If not present on profile, this field is empty
   * @return unpaidCollectionsAmount
  **/
  @ApiModelProperty(value = "Total dollar amount of unpaid collections. If not present on profile, this field is empty")
  
    public String getUnpaidCollectionsAmount() {
    return unpaidCollectionsAmount;
  }

  public void setUnpaidCollectionsAmount(String unpaidCollectionsAmount) {
    this.unpaidCollectionsAmount = unpaidCollectionsAmount;
  }

  public HealthcareProfileSummary bankruptciesFiledCount(String bankruptciesFiledCount) {
    this.bankruptciesFiledCount = bankruptciesFiledCount;
    return this;
  }

  /**
   * Number of bankruptcies filed public records
   * @return bankruptciesFiledCount
  **/
  @ApiModelProperty(value = "Number of bankruptcies filed public records")
  
    public String getBankruptciesFiledCount() {
    return bankruptciesFiledCount;
  }

  public void setBankruptciesFiledCount(String bankruptciesFiledCount) {
    this.bankruptciesFiledCount = bankruptciesFiledCount;
  }

  public HealthcareProfileSummary bankruptciesFiledAmount(String bankruptciesFiledAmount) {
    this.bankruptciesFiledAmount = bankruptciesFiledAmount;
    return this;
  }

  /**
   * Total dollar liability amount of bankruptcies filed. If not present on profile then this field is empty
   * @return bankruptciesFiledAmount
  **/
  @ApiModelProperty(value = "Total dollar liability amount of bankruptcies filed. If not present on profile then this field is empty")
  
    public String getBankruptciesFiledAmount() {
    return bankruptciesFiledAmount;
  }

  public void setBankruptciesFiledAmount(String bankruptciesFiledAmount) {
    this.bankruptciesFiledAmount = bankruptciesFiledAmount;
  }

  public HealthcareProfileSummary bankruptciesDischargedCount(String bankruptciesDischargedCount) {
    this.bankruptciesDischargedCount = bankruptciesDischargedCount;
    return this;
  }

  /**
   * Number of bankruptcies discharged public records
   * @return bankruptciesDischargedCount
  **/
  @ApiModelProperty(value = "Number of bankruptcies discharged public records")
  
    public String getBankruptciesDischargedCount() {
    return bankruptciesDischargedCount;
  }

  public void setBankruptciesDischargedCount(String bankruptciesDischargedCount) {
    this.bankruptciesDischargedCount = bankruptciesDischargedCount;
  }

  public HealthcareProfileSummary bankruptciesDischargedAmount(String bankruptciesDischargedAmount) {
    this.bankruptciesDischargedAmount = bankruptciesDischargedAmount;
    return this;
  }

  /**
   * Total dollar liability amount of bankruptcies discharged. If not present on profile then this field is empty
   * @return bankruptciesDischargedAmount
  **/
  @ApiModelProperty(value = "Total dollar liability amount of bankruptcies discharged. If not present on profile then this field is empty")
  
    public String getBankruptciesDischargedAmount() {
    return bankruptciesDischargedAmount;
  }

  public void setBankruptciesDischargedAmount(String bankruptciesDischargedAmount) {
    this.bankruptciesDischargedAmount = bankruptciesDischargedAmount;
  }

  public HealthcareProfileSummary bankruptciesDismissedCount(String bankruptciesDismissedCount) {
    this.bankruptciesDismissedCount = bankruptciesDismissedCount;
    return this;
  }

  /**
   * Number of bankruptcies dismissed public records
   * @return bankruptciesDismissedCount
  **/
  @ApiModelProperty(value = "Number of bankruptcies dismissed public records")
  
    public String getBankruptciesDismissedCount() {
    return bankruptciesDismissedCount;
  }

  public void setBankruptciesDismissedCount(String bankruptciesDismissedCount) {
    this.bankruptciesDismissedCount = bankruptciesDismissedCount;
  }

  public HealthcareProfileSummary bankruptciesDismissedAmount(String bankruptciesDismissedAmount) {
    this.bankruptciesDismissedAmount = bankruptciesDismissedAmount;
    return this;
  }

  /**
   * Total dollar liability amount of bankruptcies dismissed. If not present on profile then this field is empty
   * @return bankruptciesDismissedAmount
  **/
  @ApiModelProperty(value = "Total dollar liability amount of bankruptcies dismissed. If not present on profile then this field is empty")
  
    public String getBankruptciesDismissedAmount() {
    return bankruptciesDismissedAmount;
  }

  public void setBankruptciesDismissedAmount(String bankruptciesDismissedAmount) {
    this.bankruptciesDismissedAmount = bankruptciesDismissedAmount;
  }

  public HealthcareProfileSummary liensCount(String liensCount) {
    this.liensCount = liensCount;
    return this;
  }

  /**
   * Number of liens
   * @return liensCount
  **/
  @ApiModelProperty(value = "Number of liens")
  
    public String getLiensCount() {
    return liensCount;
  }

  public void setLiensCount(String liensCount) {
    this.liensCount = liensCount;
  }

  public HealthcareProfileSummary liensAmount(String liensAmount) {
    this.liensAmount = liensAmount;
    return this;
  }

  /**
   * Total dollar amount of liens. If not present on profile then this field is empty
   * @return liensAmount
  **/
  @ApiModelProperty(value = "Total dollar amount of liens. If not present on profile then this field is empty")
  
    public String getLiensAmount() {
    return liensAmount;
  }

  public void setLiensAmount(String liensAmount) {
    this.liensAmount = liensAmount;
  }

  public HealthcareProfileSummary liensReleasedCount(String liensReleasedCount) {
    this.liensReleasedCount = liensReleasedCount;
    return this;
  }

  /**
   * Number of liens released
   * @return liensReleasedCount
  **/
  @ApiModelProperty(value = "Number of liens released")
  
    public String getLiensReleasedCount() {
    return liensReleasedCount;
  }

  public void setLiensReleasedCount(String liensReleasedCount) {
    this.liensReleasedCount = liensReleasedCount;
  }

  public HealthcareProfileSummary liensReleasedAmount(String liensReleasedAmount) {
    this.liensReleasedAmount = liensReleasedAmount;
    return this;
  }

  /**
   * Total dollar amount of liens released. If not present on profile then this field is empty
   * @return liensReleasedAmount
  **/
  @ApiModelProperty(value = "Total dollar amount of liens released. If not present on profile then this field is empty")
  
    public String getLiensReleasedAmount() {
    return liensReleasedAmount;
  }

  public void setLiensReleasedAmount(String liensReleasedAmount) {
    this.liensReleasedAmount = liensReleasedAmount;
  }

  public HealthcareProfileSummary judgments(String judgments) {
    this.judgments = judgments;
    return this;
  }

  /**
   * Number of judgments
   * @return judgments
  **/
  @ApiModelProperty(value = "Number of judgments")
  
    public String getJudgments() {
    return judgments;
  }

  public void setJudgments(String judgments) {
    this.judgments = judgments;
  }

  public HealthcareProfileSummary judgmentsAmount(String judgmentsAmount) {
    this.judgmentsAmount = judgmentsAmount;
    return this;
  }

  /**
   * Total dollar amount of judgments. If not present on profile then this field is empty
   * @return judgmentsAmount
  **/
  @ApiModelProperty(value = "Total dollar amount of judgments. If not present on profile then this field is empty")
  
    public String getJudgmentsAmount() {
    return judgmentsAmount;
  }

  public void setJudgmentsAmount(String judgmentsAmount) {
    this.judgmentsAmount = judgmentsAmount;
  }

  public HealthcareProfileSummary judgmentsSatisfiedCount(String judgmentsSatisfiedCount) {
    this.judgmentsSatisfiedCount = judgmentsSatisfiedCount;
    return this;
  }

  /**
   * Number of judgments satisfied
   * @return judgmentsSatisfiedCount
  **/
  @ApiModelProperty(value = "Number of judgments satisfied")
  
    public String getJudgmentsSatisfiedCount() {
    return judgmentsSatisfiedCount;
  }

  public void setJudgmentsSatisfiedCount(String judgmentsSatisfiedCount) {
    this.judgmentsSatisfiedCount = judgmentsSatisfiedCount;
  }

  public HealthcareProfileSummary judgmentsSatisfiedAmount(String judgmentsSatisfiedAmount) {
    this.judgmentsSatisfiedAmount = judgmentsSatisfiedAmount;
    return this;
  }

  /**
   * Total dollar amount of judgments satisfied. If not present on profile then this field is empty
   * @return judgmentsSatisfiedAmount
  **/
  @ApiModelProperty(value = "Total dollar amount of judgments satisfied. If not present on profile then this field is empty")
  
    public String getJudgmentsSatisfiedAmount() {
    return judgmentsSatisfiedAmount;
  }

  public void setJudgmentsSatisfiedAmount(String judgmentsSatisfiedAmount) {
    this.judgmentsSatisfiedAmount = judgmentsSatisfiedAmount;
  }

  public HealthcareProfileSummary judgmentsVacatedCount(String judgmentsVacatedCount) {
    this.judgmentsVacatedCount = judgmentsVacatedCount;
    return this;
  }

  /**
   * Number of judgments vacated
   * @return judgmentsVacatedCount
  **/
  @ApiModelProperty(value = "Number of judgments vacated")
  
    public String getJudgmentsVacatedCount() {
    return judgmentsVacatedCount;
  }

  public void setJudgmentsVacatedCount(String judgmentsVacatedCount) {
    this.judgmentsVacatedCount = judgmentsVacatedCount;
  }

  public HealthcareProfileSummary judgmentsVacatedAmount(String judgmentsVacatedAmount) {
    this.judgmentsVacatedAmount = judgmentsVacatedAmount;
    return this;
  }

  /**
   * Total dollar amount of judgments vacated. If not present on profile then this field is empty
   * @return judgmentsVacatedAmount
  **/
  @ApiModelProperty(value = "Total dollar amount of judgments vacated. If not present on profile then this field is empty")
  
    public String getJudgmentsVacatedAmount() {
    return judgmentsVacatedAmount;
  }

  public void setJudgmentsVacatedAmount(String judgmentsVacatedAmount) {
    this.judgmentsVacatedAmount = judgmentsVacatedAmount;
  }

  public HealthcareProfileSummary inquiriesCountLast30Days(String inquiriesCountLast30Days) {
    this.inquiriesCountLast30Days = inquiriesCountLast30Days;
    return this;
  }

  /**
   * Number of inquiries in last 30 days
   * @return inquiriesCountLast30Days
  **/
  @ApiModelProperty(value = "Number of inquiries in last 30 days")
  
    public String getInquiriesCountLast30Days() {
    return inquiriesCountLast30Days;
  }

  public void setInquiriesCountLast30Days(String inquiriesCountLast30Days) {
    this.inquiriesCountLast30Days = inquiriesCountLast30Days;
  }

  public HealthcareProfileSummary inquiriesCountLastTwoYears(String inquiriesCountLastTwoYears) {
    this.inquiriesCountLastTwoYears = inquiriesCountLastTwoYears;
    return this;
  }

  /**
   * Number of inquiries in last two years
   * @return inquiriesCountLastTwoYears
  **/
  @ApiModelProperty(value = "Number of inquiries in last two years")
  
    public String getInquiriesCountLastTwoYears() {
    return inquiriesCountLastTwoYears;
  }

  public void setInquiriesCountLastTwoYears(String inquiriesCountLastTwoYears) {
    this.inquiriesCountLastTwoYears = inquiriesCountLastTwoYears;
  }

  public HealthcareProfileSummary inquiriesAmount(String inquiriesAmount) {
    this.inquiriesAmount = inquiriesAmount;
    return this;
  }

  /**
   * Total dollar amount of inquiries in past two years. If not present on profile then this field is empty
   * @return inquiriesAmount
  **/
  @ApiModelProperty(value = "Total dollar amount of inquiries in past two years. If not present on profile then this field is empty")
  
    public String getInquiriesAmount() {
    return inquiriesAmount;
  }

  public void setInquiriesAmount(String inquiriesAmount) {
    this.inquiriesAmount = inquiriesAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthcareProfileSummary healthcareProfileSummary = (HealthcareProfileSummary) o;
    return Objects.equals(this.openRevolvingCount, healthcareProfileSummary.openRevolvingCount) &&
        Objects.equals(this.openRevolvingBalance, healthcareProfileSummary.openRevolvingBalance) &&
        Objects.equals(this.openRevolvingCreditLimits, healthcareProfileSummary.openRevolvingCreditLimits) &&
        Objects.equals(this.openInstallmentCount, healthcareProfileSummary.openInstallmentCount) &&
        Objects.equals(this.openInstallmentBalanceAmount, healthcareProfileSummary.openInstallmentBalanceAmount) &&
        Objects.equals(this.openInstallmentMonthlyPaymentAmount, healthcareProfileSummary.openInstallmentMonthlyPaymentAmount) &&
        Objects.equals(this.unpaidCollectionsCount, healthcareProfileSummary.unpaidCollectionsCount) &&
        Objects.equals(this.unpaidCollectionsAmount, healthcareProfileSummary.unpaidCollectionsAmount) &&
        Objects.equals(this.bankruptciesFiledCount, healthcareProfileSummary.bankruptciesFiledCount) &&
        Objects.equals(this.bankruptciesFiledAmount, healthcareProfileSummary.bankruptciesFiledAmount) &&
        Objects.equals(this.bankruptciesDischargedCount, healthcareProfileSummary.bankruptciesDischargedCount) &&
        Objects.equals(this.bankruptciesDischargedAmount, healthcareProfileSummary.bankruptciesDischargedAmount) &&
        Objects.equals(this.bankruptciesDismissedCount, healthcareProfileSummary.bankruptciesDismissedCount) &&
        Objects.equals(this.bankruptciesDismissedAmount, healthcareProfileSummary.bankruptciesDismissedAmount) &&
        Objects.equals(this.liensCount, healthcareProfileSummary.liensCount) &&
        Objects.equals(this.liensAmount, healthcareProfileSummary.liensAmount) &&
        Objects.equals(this.liensReleasedCount, healthcareProfileSummary.liensReleasedCount) &&
        Objects.equals(this.liensReleasedAmount, healthcareProfileSummary.liensReleasedAmount) &&
        Objects.equals(this.judgments, healthcareProfileSummary.judgments) &&
        Objects.equals(this.judgmentsAmount, healthcareProfileSummary.judgmentsAmount) &&
        Objects.equals(this.judgmentsSatisfiedCount, healthcareProfileSummary.judgmentsSatisfiedCount) &&
        Objects.equals(this.judgmentsSatisfiedAmount, healthcareProfileSummary.judgmentsSatisfiedAmount) &&
        Objects.equals(this.judgmentsVacatedCount, healthcareProfileSummary.judgmentsVacatedCount) &&
        Objects.equals(this.judgmentsVacatedAmount, healthcareProfileSummary.judgmentsVacatedAmount) &&
        Objects.equals(this.inquiriesCountLast30Days, healthcareProfileSummary.inquiriesCountLast30Days) &&
        Objects.equals(this.inquiriesCountLastTwoYears, healthcareProfileSummary.inquiriesCountLastTwoYears) &&
        Objects.equals(this.inquiriesAmount, healthcareProfileSummary.inquiriesAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openRevolvingCount, openRevolvingBalance, openRevolvingCreditLimits, openInstallmentCount, openInstallmentBalanceAmount, openInstallmentMonthlyPaymentAmount, unpaidCollectionsCount, unpaidCollectionsAmount, bankruptciesFiledCount, bankruptciesFiledAmount, bankruptciesDischargedCount, bankruptciesDischargedAmount, bankruptciesDismissedCount, bankruptciesDismissedAmount, liensCount, liensAmount, liensReleasedCount, liensReleasedAmount, judgments, judgmentsAmount, judgmentsSatisfiedCount, judgmentsSatisfiedAmount, judgmentsVacatedCount, judgmentsVacatedAmount, inquiriesCountLast30Days, inquiriesCountLastTwoYears, inquiriesAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthcareProfileSummary {\n");
    
    sb.append("    openRevolvingCount: ").append(toIndentedString(openRevolvingCount)).append("\n");
    sb.append("    openRevolvingBalance: ").append(toIndentedString(openRevolvingBalance)).append("\n");
    sb.append("    openRevolvingCreditLimits: ").append(toIndentedString(openRevolvingCreditLimits)).append("\n");
    sb.append("    openInstallmentCount: ").append(toIndentedString(openInstallmentCount)).append("\n");
    sb.append("    openInstallmentBalanceAmount: ").append(toIndentedString(openInstallmentBalanceAmount)).append("\n");
    sb.append("    openInstallmentMonthlyPaymentAmount: ").append(toIndentedString(openInstallmentMonthlyPaymentAmount)).append("\n");
    sb.append("    unpaidCollectionsCount: ").append(toIndentedString(unpaidCollectionsCount)).append("\n");
    sb.append("    unpaidCollectionsAmount: ").append(toIndentedString(unpaidCollectionsAmount)).append("\n");
    sb.append("    bankruptciesFiledCount: ").append(toIndentedString(bankruptciesFiledCount)).append("\n");
    sb.append("    bankruptciesFiledAmount: ").append(toIndentedString(bankruptciesFiledAmount)).append("\n");
    sb.append("    bankruptciesDischargedCount: ").append(toIndentedString(bankruptciesDischargedCount)).append("\n");
    sb.append("    bankruptciesDischargedAmount: ").append(toIndentedString(bankruptciesDischargedAmount)).append("\n");
    sb.append("    bankruptciesDismissedCount: ").append(toIndentedString(bankruptciesDismissedCount)).append("\n");
    sb.append("    bankruptciesDismissedAmount: ").append(toIndentedString(bankruptciesDismissedAmount)).append("\n");
    sb.append("    liensCount: ").append(toIndentedString(liensCount)).append("\n");
    sb.append("    liensAmount: ").append(toIndentedString(liensAmount)).append("\n");
    sb.append("    liensReleasedCount: ").append(toIndentedString(liensReleasedCount)).append("\n");
    sb.append("    liensReleasedAmount: ").append(toIndentedString(liensReleasedAmount)).append("\n");
    sb.append("    judgments: ").append(toIndentedString(judgments)).append("\n");
    sb.append("    judgmentsAmount: ").append(toIndentedString(judgmentsAmount)).append("\n");
    sb.append("    judgmentsSatisfiedCount: ").append(toIndentedString(judgmentsSatisfiedCount)).append("\n");
    sb.append("    judgmentsSatisfiedAmount: ").append(toIndentedString(judgmentsSatisfiedAmount)).append("\n");
    sb.append("    judgmentsVacatedCount: ").append(toIndentedString(judgmentsVacatedCount)).append("\n");
    sb.append("    judgmentsVacatedAmount: ").append(toIndentedString(judgmentsVacatedAmount)).append("\n");
    sb.append("    inquiriesCountLast30Days: ").append(toIndentedString(inquiriesCountLast30Days)).append("\n");
    sb.append("    inquiriesCountLastTwoYears: ").append(toIndentedString(inquiriesCountLastTwoYears)).append("\n");
    sb.append("    inquiriesAmount: ").append(toIndentedString(inquiriesAmount)).append("\n");
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
