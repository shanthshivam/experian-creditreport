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
 * EnhancedPaymentData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class EnhancedPaymentData   {
  @JsonProperty("actualPaymentAmount")
  private String actualPaymentAmount = null;

  @JsonProperty("chargeoffAmount")
  private String chargeoffAmount = null;

  @JsonProperty("ciiCode")
  private String ciiCode = null;

  @JsonProperty("complianceCondition")
  private String complianceCondition = null;

  @JsonProperty("creditLimitAmount")
  private String creditLimitAmount = null;

  @JsonProperty("enhancedAccountCondition")
  private String enhancedAccountCondition = null;

  @JsonProperty("enhancedAccountType")
  private String enhancedAccountType = null;

  @JsonProperty("enhancedPaymentHistory84")
  private String enhancedPaymentHistory84 = null;

  @JsonProperty("enhancedPaymentStatus")
  private String enhancedPaymentStatus = null;

  @JsonProperty("enhancedSpecialComment")
  private String enhancedSpecialComment = null;

  @JsonProperty("enhancedTerms")
  private String enhancedTerms = null;

  @JsonProperty("enhancedTermsFrequency")
  private String enhancedTermsFrequency = null;

  @JsonProperty("firstDelinquencyDate")
  private String firstDelinquencyDate = null;

  @JsonProperty("highBalanceAmount")
  private String highBalanceAmount = null;

  @JsonProperty("maxDelinquencyCode")
  private String maxDelinquencyCode = null;

  @JsonProperty("mortgageId")
  private String mortgageId = null;

  @JsonProperty("originalCreditorClassificationCode")
  private String originalCreditorClassificationCode = null;

  @JsonProperty("originalLoanAmount")
  private String originalLoanAmount = null;

  @JsonProperty("paymentLevelDate")
  private String paymentLevelDate = null;

  @JsonProperty("purchasedPortfolioFromName")
  private String purchasedPortfolioFromName = null;

  @JsonProperty("secondDelinquencyDate")
  private String secondDelinquencyDate = null;

  @JsonProperty("secondaryAgencyCode")
  private String secondaryAgencyCode = null;

  @JsonProperty("secondaryAgencyId")
  private String secondaryAgencyId = null;

  @JsonProperty("specialPaymentAmount")
  private String specialPaymentAmount = null;

  @JsonProperty("specialPaymentCode")
  private String specialPaymentCode = null;

  @JsonProperty("specialPaymentDate")
  private String specialPaymentDate = null;

  public EnhancedPaymentData actualPaymentAmount(String actualPaymentAmount) {
    this.actualPaymentAmount = actualPaymentAmount;
    return this;
  }

  /**
   * Full dollar amount.
   * @return actualPaymentAmount
  **/
  @ApiModelProperty(value = "Full dollar amount.")
  
    public String getActualPaymentAmount() {
    return actualPaymentAmount;
  }

  public void setActualPaymentAmount(String actualPaymentAmount) {
    this.actualPaymentAmount = actualPaymentAmount;
  }

  public EnhancedPaymentData chargeoffAmount(String chargeoffAmount) {
    this.chargeoffAmount = chargeoffAmount;
    return this;
  }

  /**
   * Full dollar amount.
   * @return chargeoffAmount
  **/
  @ApiModelProperty(value = "Full dollar amount.")
  
    public String getChargeoffAmount() {
    return chargeoffAmount;
  }

  public void setChargeoffAmount(String chargeoffAmount) {
    this.chargeoffAmount = chargeoffAmount;
  }

  public EnhancedPaymentData ciiCode(String ciiCode) {
    this.ciiCode = ciiCode;
    return this;
  }

  /**
   * Consumer Information Indicator.
   * @return ciiCode
  **/
  @ApiModelProperty(value = "Consumer Information Indicator.")
  
    public String getCiiCode() {
    return ciiCode;
  }

  public void setCiiCode(String ciiCode) {
    this.ciiCode = ciiCode;
  }

  public EnhancedPaymentData complianceCondition(String complianceCondition) {
    this.complianceCondition = complianceCondition;
    return this;
  }

  /**
   * Compliance Conditon Code.
   * @return complianceCondition
  **/
  @ApiModelProperty(value = "Compliance Conditon Code.")
  
    public String getComplianceCondition() {
    return complianceCondition;
  }

  public void setComplianceCondition(String complianceCondition) {
    this.complianceCondition = complianceCondition;
  }

  public EnhancedPaymentData creditLimitAmount(String creditLimitAmount) {
    this.creditLimitAmount = creditLimitAmount;
    return this;
  }

  /**
   * Full dollar amount.
   * @return creditLimitAmount
  **/
  @ApiModelProperty(value = "Full dollar amount.")
  
    public String getCreditLimitAmount() {
    return creditLimitAmount;
  }

  public void setCreditLimitAmount(String creditLimitAmount) {
    this.creditLimitAmount = creditLimitAmount;
  }

  public EnhancedPaymentData enhancedAccountCondition(String enhancedAccountCondition) {
    this.enhancedAccountCondition = enhancedAccountCondition;
    return this;
  }

  /**
   * Account Condition Code. Codes. 
   * @return enhancedAccountCondition
  **/
  @ApiModelProperty(value = "Account Condition Code. Codes. ")
  
    public String getEnhancedAccountCondition() {
    return enhancedAccountCondition;
  }

  public void setEnhancedAccountCondition(String enhancedAccountCondition) {
    this.enhancedAccountCondition = enhancedAccountCondition;
  }

  public EnhancedPaymentData enhancedAccountType(String enhancedAccountType) {
    this.enhancedAccountType = enhancedAccountType;
    return this;
  }

  /**
   * Indicates Type of Account.
   * @return enhancedAccountType
  **/
  @ApiModelProperty(value = "Indicates Type of Account.")
  
    public String getEnhancedAccountType() {
    return enhancedAccountType;
  }

  public void setEnhancedAccountType(String enhancedAccountType) {
    this.enhancedAccountType = enhancedAccountType;
  }

  public EnhancedPaymentData enhancedPaymentHistory84(String enhancedPaymentHistory84) {
    this.enhancedPaymentHistory84 = enhancedPaymentHistory84;
    return this;
  }

  /**
   * 84 Month enhanced payment history. 
   * @return enhancedPaymentHistory84
  **/
  @ApiModelProperty(value = "84 Month enhanced payment history. ")
  
    public String getEnhancedPaymentHistory84() {
    return enhancedPaymentHistory84;
  }

  public void setEnhancedPaymentHistory84(String enhancedPaymentHistory84) {
    this.enhancedPaymentHistory84 = enhancedPaymentHistory84;
  }

  public EnhancedPaymentData enhancedPaymentStatus(String enhancedPaymentStatus) {
    this.enhancedPaymentStatus = enhancedPaymentStatus;
    return this;
  }

  /**
   * Payment Status Codes.
   * @return enhancedPaymentStatus
  **/
  @ApiModelProperty(value = "Payment Status Codes.")
  
    public String getEnhancedPaymentStatus() {
    return enhancedPaymentStatus;
  }

  public void setEnhancedPaymentStatus(String enhancedPaymentStatus) {
    this.enhancedPaymentStatus = enhancedPaymentStatus;
  }

  public EnhancedPaymentData enhancedSpecialComment(String enhancedSpecialComment) {
    this.enhancedSpecialComment = enhancedSpecialComment;
    return this;
  }

  /**
   * Special Comments.
   * @return enhancedSpecialComment
  **/
  @ApiModelProperty(value = "Special Comments.")
  
    public String getEnhancedSpecialComment() {
    return enhancedSpecialComment;
  }

  public void setEnhancedSpecialComment(String enhancedSpecialComment) {
    this.enhancedSpecialComment = enhancedSpecialComment;
  }

  public EnhancedPaymentData enhancedTerms(String enhancedTerms) {
    this.enhancedTerms = enhancedTerms;
    return this;
  }

  /**
   * Payment Terms.
   * @return enhancedTerms
  **/
  @ApiModelProperty(value = "Payment Terms.")
  
    public String getEnhancedTerms() {
    return enhancedTerms;
  }

  public void setEnhancedTerms(String enhancedTerms) {
    this.enhancedTerms = enhancedTerms;
  }

  public EnhancedPaymentData enhancedTermsFrequency(String enhancedTermsFrequency) {
    this.enhancedTermsFrequency = enhancedTermsFrequency;
    return this;
  }

  /**
   * Frequency for Payments Due.
   * @return enhancedTermsFrequency
  **/
  @ApiModelProperty(value = "Frequency for Payments Due.")
  
    public String getEnhancedTermsFrequency() {
    return enhancedTermsFrequency;
  }

  public void setEnhancedTermsFrequency(String enhancedTermsFrequency) {
    this.enhancedTermsFrequency = enhancedTermsFrequency;
  }

  public EnhancedPaymentData firstDelinquencyDate(String firstDelinquencyDate) {
    this.firstDelinquencyDate = firstDelinquencyDate;
    return this;
  }

  /**
   * Most Recent Delinquency Date (MMDDCCYY)
   * @return firstDelinquencyDate
  **/
  @ApiModelProperty(value = "Most Recent Delinquency Date (MMDDCCYY)")
  
    public String getFirstDelinquencyDate() {
    return firstDelinquencyDate;
  }

  public void setFirstDelinquencyDate(String firstDelinquencyDate) {
    this.firstDelinquencyDate = firstDelinquencyDate;
  }

  public EnhancedPaymentData highBalanceAmount(String highBalanceAmount) {
    this.highBalanceAmount = highBalanceAmount;
    return this;
  }

  /**
   * Full dollar amount.
   * @return highBalanceAmount
  **/
  @ApiModelProperty(value = "Full dollar amount.")
  
    public String getHighBalanceAmount() {
    return highBalanceAmount;
  }

  public void setHighBalanceAmount(String highBalanceAmount) {
    this.highBalanceAmount = highBalanceAmount;
  }

  public EnhancedPaymentData maxDelinquencyCode(String maxDelinquencyCode) {
    this.maxDelinquencyCode = maxDelinquencyCode;
    return this;
  }

  /**
   * Highest payment code for maximum delinquency date
   * @return maxDelinquencyCode
  **/
  @ApiModelProperty(value = "Highest payment code for maximum delinquency date")
  
    public String getMaxDelinquencyCode() {
    return maxDelinquencyCode;
  }

  public void setMaxDelinquencyCode(String maxDelinquencyCode) {
    this.maxDelinquencyCode = maxDelinquencyCode;
  }

  public EnhancedPaymentData mortgageId(String mortgageId) {
    this.mortgageId = mortgageId;
    return this;
  }

  /**
   * Mortgage ID.
   * @return mortgageId
  **/
  @ApiModelProperty(value = "Mortgage ID.")
  
    public String getMortgageId() {
    return mortgageId;
  }

  public void setMortgageId(String mortgageId) {
    this.mortgageId = mortgageId;
  }

  public EnhancedPaymentData originalCreditorClassificationCode(String originalCreditorClassificationCode) {
    this.originalCreditorClassificationCode = originalCreditorClassificationCode;
    return this;
  }

  /**
   * General type of business of the Original Creditor. 
   * @return originalCreditorClassificationCode
  **/
  @ApiModelProperty(value = "General type of business of the Original Creditor. ")
  
    public String getOriginalCreditorClassificationCode() {
    return originalCreditorClassificationCode;
  }

  public void setOriginalCreditorClassificationCode(String originalCreditorClassificationCode) {
    this.originalCreditorClassificationCode = originalCreditorClassificationCode;
  }

  public EnhancedPaymentData originalLoanAmount(String originalLoanAmount) {
    this.originalLoanAmount = originalLoanAmount;
    return this;
  }

  /**
   * Full dollar amount.
   * @return originalLoanAmount
  **/
  @ApiModelProperty(value = "Full dollar amount.")
  
    public String getOriginalLoanAmount() {
    return originalLoanAmount;
  }

  public void setOriginalLoanAmount(String originalLoanAmount) {
    this.originalLoanAmount = originalLoanAmount;
  }

  public EnhancedPaymentData paymentLevelDate(String paymentLevelDate) {
    this.paymentLevelDate = paymentLevelDate;
    return this;
  }

  /**
   * Date the account first reached present status level. Format = MMDDCCYY.
   * @return paymentLevelDate
  **/
  @ApiModelProperty(value = "Date the account first reached present status level. Format = MMDDCCYY.")
  
    public String getPaymentLevelDate() {
    return paymentLevelDate;
  }

  public void setPaymentLevelDate(String paymentLevelDate) {
    this.paymentLevelDate = paymentLevelDate;
  }

  public EnhancedPaymentData purchasedPortfolioFromName(String purchasedPortfolioFromName) {
    this.purchasedPortfolioFromName = purchasedPortfolioFromName;
    return this;
  }

  /**
   * Purchased Portfolio Name.
   * @return purchasedPortfolioFromName
  **/
  @ApiModelProperty(value = "Purchased Portfolio Name.")
  
    public String getPurchasedPortfolioFromName() {
    return purchasedPortfolioFromName;
  }

  public void setPurchasedPortfolioFromName(String purchasedPortfolioFromName) {
    this.purchasedPortfolioFromName = purchasedPortfolioFromName;
  }

  public EnhancedPaymentData secondDelinquencyDate(String secondDelinquencyDate) {
    this.secondDelinquencyDate = secondDelinquencyDate;
    return this;
  }

  /**
   * Second Most Recent Delinquency Date(MMDDCCYY)
   * @return secondDelinquencyDate
  **/
  @ApiModelProperty(value = "Second Most Recent Delinquency Date(MMDDCCYY)")
  
    public String getSecondDelinquencyDate() {
    return secondDelinquencyDate;
  }

  public void setSecondDelinquencyDate(String secondDelinquencyDate) {
    this.secondDelinquencyDate = secondDelinquencyDate;
  }

  public EnhancedPaymentData secondaryAgencyCode(String secondaryAgencyCode) {
    this.secondaryAgencyCode = secondaryAgencyCode;
    return this;
  }

  /**
   * Secondary Agency Code.
   * @return secondaryAgencyCode
  **/
  @ApiModelProperty(value = "Secondary Agency Code.")
  
    public String getSecondaryAgencyCode() {
    return secondaryAgencyCode;
  }

  public void setSecondaryAgencyCode(String secondaryAgencyCode) {
    this.secondaryAgencyCode = secondaryAgencyCode;
  }

  public EnhancedPaymentData secondaryAgencyId(String secondaryAgencyId) {
    this.secondaryAgencyId = secondaryAgencyId;
    return this;
  }

  /**
   * Secondary Agency Id
   * @return secondaryAgencyId
  **/
  @ApiModelProperty(value = "Secondary Agency Id")
  
    public String getSecondaryAgencyId() {
    return secondaryAgencyId;
  }

  public void setSecondaryAgencyId(String secondaryAgencyId) {
    this.secondaryAgencyId = secondaryAgencyId;
  }

  public EnhancedPaymentData specialPaymentAmount(String specialPaymentAmount) {
    this.specialPaymentAmount = specialPaymentAmount;
    return this;
  }

  /**
   * Full dollar amount
   * @return specialPaymentAmount
  **/
  @ApiModelProperty(value = "Full dollar amount")
  
    public String getSpecialPaymentAmount() {
    return specialPaymentAmount;
  }

  public void setSpecialPaymentAmount(String specialPaymentAmount) {
    this.specialPaymentAmount = specialPaymentAmount;
  }

  public EnhancedPaymentData specialPaymentCode(String specialPaymentCode) {
    this.specialPaymentCode = specialPaymentCode;
    return this;
  }

  /**
   * Additional Information about the Payment Amount.
   * @return specialPaymentCode
  **/
  @ApiModelProperty(value = "Additional Information about the Payment Amount.")
  
    public String getSpecialPaymentCode() {
    return specialPaymentCode;
  }

  public void setSpecialPaymentCode(String specialPaymentCode) {
    this.specialPaymentCode = specialPaymentCode;
  }

  public EnhancedPaymentData specialPaymentDate(String specialPaymentDate) {
    this.specialPaymentDate = specialPaymentDate;
    return this;
  }

  /**
   * Special Payment Date Format = MMDDCCYY.
   * @return specialPaymentDate
  **/
  @ApiModelProperty(value = "Special Payment Date Format = MMDDCCYY.")
  
    public String getSpecialPaymentDate() {
    return specialPaymentDate;
  }

  public void setSpecialPaymentDate(String specialPaymentDate) {
    this.specialPaymentDate = specialPaymentDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnhancedPaymentData enhancedPaymentData = (EnhancedPaymentData) o;
    return Objects.equals(this.actualPaymentAmount, enhancedPaymentData.actualPaymentAmount) &&
        Objects.equals(this.chargeoffAmount, enhancedPaymentData.chargeoffAmount) &&
        Objects.equals(this.ciiCode, enhancedPaymentData.ciiCode) &&
        Objects.equals(this.complianceCondition, enhancedPaymentData.complianceCondition) &&
        Objects.equals(this.creditLimitAmount, enhancedPaymentData.creditLimitAmount) &&
        Objects.equals(this.enhancedAccountCondition, enhancedPaymentData.enhancedAccountCondition) &&
        Objects.equals(this.enhancedAccountType, enhancedPaymentData.enhancedAccountType) &&
        Objects.equals(this.enhancedPaymentHistory84, enhancedPaymentData.enhancedPaymentHistory84) &&
        Objects.equals(this.enhancedPaymentStatus, enhancedPaymentData.enhancedPaymentStatus) &&
        Objects.equals(this.enhancedSpecialComment, enhancedPaymentData.enhancedSpecialComment) &&
        Objects.equals(this.enhancedTerms, enhancedPaymentData.enhancedTerms) &&
        Objects.equals(this.enhancedTermsFrequency, enhancedPaymentData.enhancedTermsFrequency) &&
        Objects.equals(this.firstDelinquencyDate, enhancedPaymentData.firstDelinquencyDate) &&
        Objects.equals(this.highBalanceAmount, enhancedPaymentData.highBalanceAmount) &&
        Objects.equals(this.maxDelinquencyCode, enhancedPaymentData.maxDelinquencyCode) &&
        Objects.equals(this.mortgageId, enhancedPaymentData.mortgageId) &&
        Objects.equals(this.originalCreditorClassificationCode, enhancedPaymentData.originalCreditorClassificationCode) &&
        Objects.equals(this.originalLoanAmount, enhancedPaymentData.originalLoanAmount) &&
        Objects.equals(this.paymentLevelDate, enhancedPaymentData.paymentLevelDate) &&
        Objects.equals(this.purchasedPortfolioFromName, enhancedPaymentData.purchasedPortfolioFromName) &&
        Objects.equals(this.secondDelinquencyDate, enhancedPaymentData.secondDelinquencyDate) &&
        Objects.equals(this.secondaryAgencyCode, enhancedPaymentData.secondaryAgencyCode) &&
        Objects.equals(this.secondaryAgencyId, enhancedPaymentData.secondaryAgencyId) &&
        Objects.equals(this.specialPaymentAmount, enhancedPaymentData.specialPaymentAmount) &&
        Objects.equals(this.specialPaymentCode, enhancedPaymentData.specialPaymentCode) &&
        Objects.equals(this.specialPaymentDate, enhancedPaymentData.specialPaymentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualPaymentAmount, chargeoffAmount, ciiCode, complianceCondition, creditLimitAmount, enhancedAccountCondition, enhancedAccountType, enhancedPaymentHistory84, enhancedPaymentStatus, enhancedSpecialComment, enhancedTerms, enhancedTermsFrequency, firstDelinquencyDate, highBalanceAmount, maxDelinquencyCode, mortgageId, originalCreditorClassificationCode, originalLoanAmount, paymentLevelDate, purchasedPortfolioFromName, secondDelinquencyDate, secondaryAgencyCode, secondaryAgencyId, specialPaymentAmount, specialPaymentCode, specialPaymentDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnhancedPaymentData {\n");
    
    sb.append("    actualPaymentAmount: ").append(toIndentedString(actualPaymentAmount)).append("\n");
    sb.append("    chargeoffAmount: ").append(toIndentedString(chargeoffAmount)).append("\n");
    sb.append("    ciiCode: ").append(toIndentedString(ciiCode)).append("\n");
    sb.append("    complianceCondition: ").append(toIndentedString(complianceCondition)).append("\n");
    sb.append("    creditLimitAmount: ").append(toIndentedString(creditLimitAmount)).append("\n");
    sb.append("    enhancedAccountCondition: ").append(toIndentedString(enhancedAccountCondition)).append("\n");
    sb.append("    enhancedAccountType: ").append(toIndentedString(enhancedAccountType)).append("\n");
    sb.append("    enhancedPaymentHistory84: ").append(toIndentedString(enhancedPaymentHistory84)).append("\n");
    sb.append("    enhancedPaymentStatus: ").append(toIndentedString(enhancedPaymentStatus)).append("\n");
    sb.append("    enhancedSpecialComment: ").append(toIndentedString(enhancedSpecialComment)).append("\n");
    sb.append("    enhancedTerms: ").append(toIndentedString(enhancedTerms)).append("\n");
    sb.append("    enhancedTermsFrequency: ").append(toIndentedString(enhancedTermsFrequency)).append("\n");
    sb.append("    firstDelinquencyDate: ").append(toIndentedString(firstDelinquencyDate)).append("\n");
    sb.append("    highBalanceAmount: ").append(toIndentedString(highBalanceAmount)).append("\n");
    sb.append("    maxDelinquencyCode: ").append(toIndentedString(maxDelinquencyCode)).append("\n");
    sb.append("    mortgageId: ").append(toIndentedString(mortgageId)).append("\n");
    sb.append("    originalCreditorClassificationCode: ").append(toIndentedString(originalCreditorClassificationCode)).append("\n");
    sb.append("    originalLoanAmount: ").append(toIndentedString(originalLoanAmount)).append("\n");
    sb.append("    paymentLevelDate: ").append(toIndentedString(paymentLevelDate)).append("\n");
    sb.append("    purchasedPortfolioFromName: ").append(toIndentedString(purchasedPortfolioFromName)).append("\n");
    sb.append("    secondDelinquencyDate: ").append(toIndentedString(secondDelinquencyDate)).append("\n");
    sb.append("    secondaryAgencyCode: ").append(toIndentedString(secondaryAgencyCode)).append("\n");
    sb.append("    secondaryAgencyId: ").append(toIndentedString(secondaryAgencyId)).append("\n");
    sb.append("    specialPaymentAmount: ").append(toIndentedString(specialPaymentAmount)).append("\n");
    sb.append("    specialPaymentCode: ").append(toIndentedString(specialPaymentCode)).append("\n");
    sb.append("    specialPaymentDate: ").append(toIndentedString(specialPaymentDate)).append("\n");
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
