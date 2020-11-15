package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.EnhancedPaymentData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TradelineRespAuto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class TradelineRespAuto   {
  @JsonProperty("accountNumber")
  private String accountNumber = "1234";

  @JsonProperty("accountType")
  private String accountType = null;

  @JsonProperty("amount1")
  private String amount1 = null;

  @JsonProperty("amount1Qualifier")
  private String amount1Qualifier = null;

  @JsonProperty("amount2")
  private String amount2 = null;

  @JsonProperty("amount2Qualifier")
  private String amount2Qualifier = null;

  @JsonProperty("amountBalloonPayment")
  private String amountBalloonPayment = null;

  @JsonProperty("amountPastDue")
  private String amountPastDue = null;

  @JsonProperty("balanceAmount")
  private String balanceAmount = null;

  @JsonProperty("balanceDate")
  private String balanceDate = null;

  @JsonProperty("bankruptcyChapterNumber")
  private String bankruptcyChapterNumber = null;

  @JsonProperty("consumerComment")
  private String consumerComment = null;

  @JsonProperty("consumerDisputeFlag")
  private String consumerDisputeFlag = null;

  @JsonProperty("datePaymentDue")
  private String datePaymentDue = null;

  @JsonProperty("delinquencies30Days")
  private String delinquencies30Days = null;

  @JsonProperty("delinquencies60Days")
  private String delinquencies60Days = null;

  @JsonProperty("delinquencies90to180Days")
  private String delinquencies90to180Days = null;

  @JsonProperty("derogCounter")
  private String derogCounter = null;

  @JsonProperty("ecoa")
  private String ecoa = null;

  @JsonProperty("enhancedPaymentData")
  private EnhancedPaymentData enhancedPaymentData = null;

  @JsonProperty("evaluation")
  private String evaluation = null;

  @JsonProperty("kob")
  private String kob = "YC";

  @JsonProperty("lastPaymentDate")
  private String lastPaymentDate = null;

  @JsonProperty("maxDelinquencyDate")
  private String maxDelinquencyDate = null;

  @JsonProperty("monthlyPaymentAmount")
  private String monthlyPaymentAmount = null;

  @JsonProperty("monthlyPaymentType")
  private String monthlyPaymentType = null;

  @JsonProperty("monthsHistory")
  private String monthsHistory = null;

  @JsonProperty("openDate")
  private String openDate = null;

  @JsonProperty("openOrClosed")
  private String openOrClosed = null;

  @JsonProperty("originalCreditorName")
  private String originalCreditorName = null;

  @JsonProperty("paymentHistory")
  private String paymentHistory = null;

  @JsonProperty("revolvingOrInstallment")
  private String revolvingOrInstallment = null;

  @JsonProperty("soldToName")
  private String soldToName = null;

  @JsonProperty("specialComment")
  private String specialComment = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusDate")
  private String statusDate = null;

  @JsonProperty("subscriberCode")
  private String subscriberCode = null;

  @JsonProperty("subscriberName")
  private String subscriberName = null;

  @JsonProperty("terms")
  private String terms = null;

  public TradelineRespAuto accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Account Number upto 40 characters.
   * @return accountNumber
  **/
  @ApiModelProperty(value = "Account Number upto 40 characters.")
  
    public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public TradelineRespAuto accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Indicates Type of Account.
   * @return accountType
  **/
  @ApiModelProperty(value = "Indicates Type of Account.")
  
    public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public TradelineRespAuto amount1(String amount1) {
    this.amount1 = amount1;
    return this;
  }

  /**
   * Full dollar amount.
   * @return amount1
  **/
  @ApiModelProperty(value = "Full dollar amount.")
  
    public String getAmount1() {
    return amount1;
  }

  public void setAmount1(String amount1) {
    this.amount1 = amount1;
  }

  public TradelineRespAuto amount1Qualifier(String amount1Qualifier) {
    this.amount1Qualifier = amount1Qualifier;
    return this;
  }

  /**
   * Amount Type.
   * @return amount1Qualifier
  **/
  @ApiModelProperty(value = "Amount Type.")
  
    public String getAmount1Qualifier() {
    return amount1Qualifier;
  }

  public void setAmount1Qualifier(String amount1Qualifier) {
    this.amount1Qualifier = amount1Qualifier;
  }

  public TradelineRespAuto amount2(String amount2) {
    this.amount2 = amount2;
    return this;
  }

  /**
   * Full dollar amount.
   * @return amount2
  **/
  @ApiModelProperty(value = "Full dollar amount.")
  
    public String getAmount2() {
    return amount2;
  }

  public void setAmount2(String amount2) {
    this.amount2 = amount2;
  }

  public TradelineRespAuto amount2Qualifier(String amount2Qualifier) {
    this.amount2Qualifier = amount2Qualifier;
    return this;
  }

  /**
   * Amount Type.
   * @return amount2Qualifier
  **/
  @ApiModelProperty(value = "Amount Type.")
  
    public String getAmount2Qualifier() {
    return amount2Qualifier;
  }

  public void setAmount2Qualifier(String amount2Qualifier) {
    this.amount2Qualifier = amount2Qualifier;
  }

  public TradelineRespAuto amountBalloonPayment(String amountBalloonPayment) {
    this.amountBalloonPayment = amountBalloonPayment;
    return this;
  }

  /**
   * Full dollar amount
   * @return amountBalloonPayment
  **/
  @ApiModelProperty(value = "Full dollar amount")
  
    public String getAmountBalloonPayment() {
    return amountBalloonPayment;
  }

  public void setAmountBalloonPayment(String amountBalloonPayment) {
    this.amountBalloonPayment = amountBalloonPayment;
  }

  public TradelineRespAuto amountPastDue(String amountPastDue) {
    this.amountPastDue = amountPastDue;
    return this;
  }

  /**
   * Full dollar amount
   * @return amountPastDue
  **/
  @ApiModelProperty(value = "Full dollar amount")
  
    public String getAmountPastDue() {
    return amountPastDue;
  }

  public void setAmountPastDue(String amountPastDue) {
    this.amountPastDue = amountPastDue;
  }

  public TradelineRespAuto balanceAmount(String balanceAmount) {
    this.balanceAmount = balanceAmount;
    return this;
  }

  /**
   * Full dollar amount
   * @return balanceAmount
  **/
  @ApiModelProperty(value = "Full dollar amount")
  
    public String getBalanceAmount() {
    return balanceAmount;
  }

  public void setBalanceAmount(String balanceAmount) {
    this.balanceAmount = balanceAmount;
  }

  public TradelineRespAuto balanceDate(String balanceDate) {
    this.balanceDate = balanceDate;
    return this;
  }

  /**
   * Date account was last updated. Format = MMDDCCYY.
   * @return balanceDate
  **/
  @ApiModelProperty(value = "Date account was last updated. Format = MMDDCCYY.")
  
    public String getBalanceDate() {
    return balanceDate;
  }

  public void setBalanceDate(String balanceDate) {
    this.balanceDate = balanceDate;
  }

  public TradelineRespAuto bankruptcyChapterNumber(String bankruptcyChapterNumber) {
    this.bankruptcyChapterNumber = bankruptcyChapterNumber;
    return this;
  }

  /**
   * Bankruptcy Chapter Number.
   * @return bankruptcyChapterNumber
  **/
  @ApiModelProperty(value = "Bankruptcy Chapter Number.")
  
    public String getBankruptcyChapterNumber() {
    return bankruptcyChapterNumber;
  }

  public void setBankruptcyChapterNumber(String bankruptcyChapterNumber) {
    this.bankruptcyChapterNumber = bankruptcyChapterNumber;
  }

  public TradelineRespAuto consumerComment(String consumerComment) {
    this.consumerComment = consumerComment;
    return this;
  }

  /**
   * Free Form Text from consumer.
   * @return consumerComment
  **/
  @ApiModelProperty(value = "Free Form Text from consumer.")
  
    public String getConsumerComment() {
    return consumerComment;
  }

  public void setConsumerComment(String consumerComment) {
    this.consumerComment = consumerComment;
  }

  public TradelineRespAuto consumerDisputeFlag(String consumerDisputeFlag) {
    this.consumerDisputeFlag = consumerDisputeFlag;
    return this;
  }

  /**
   * Indicates if trade is disputed by consumer.
   * @return consumerDisputeFlag
  **/
  @ApiModelProperty(value = "Indicates if trade is disputed by consumer.")
  
    public String getConsumerDisputeFlag() {
    return consumerDisputeFlag;
  }

  public void setConsumerDisputeFlag(String consumerDisputeFlag) {
    this.consumerDisputeFlag = consumerDisputeFlag;
  }

  public TradelineRespAuto datePaymentDue(String datePaymentDue) {
    this.datePaymentDue = datePaymentDue;
    return this;
  }

  /**
   * Date balloon payment due. Format = MMDDCCYY.
   * @return datePaymentDue
  **/
  @ApiModelProperty(value = "Date balloon payment due. Format = MMDDCCYY.")
  
    public String getDatePaymentDue() {
    return datePaymentDue;
  }

  public void setDatePaymentDue(String datePaymentDue) {
    this.datePaymentDue = datePaymentDue;
  }

  public TradelineRespAuto delinquencies30Days(String delinquencies30Days) {
    this.delinquencies30Days = delinquencies30Days;
    return this;
  }

  /**
   * 30 to 59 day delinquencies
   * @return delinquencies30Days
  **/
  @ApiModelProperty(value = "30 to 59 day delinquencies")
  
    public String getDelinquencies30Days() {
    return delinquencies30Days;
  }

  public void setDelinquencies30Days(String delinquencies30Days) {
    this.delinquencies30Days = delinquencies30Days;
  }

  public TradelineRespAuto delinquencies60Days(String delinquencies60Days) {
    this.delinquencies60Days = delinquencies60Days;
    return this;
  }

  /**
   * 60 to 89 day delinquencies
   * @return delinquencies60Days
  **/
  @ApiModelProperty(value = "60 to 89 day delinquencies")
  
    public String getDelinquencies60Days() {
    return delinquencies60Days;
  }

  public void setDelinquencies60Days(String delinquencies60Days) {
    this.delinquencies60Days = delinquencies60Days;
  }

  public TradelineRespAuto delinquencies90to180Days(String delinquencies90to180Days) {
    this.delinquencies90to180Days = delinquencies90to180Days;
    return this;
  }

  /**
   * 90 to 180 day delinquencies
   * @return delinquencies90to180Days
  **/
  @ApiModelProperty(value = "90 to 180 day delinquencies")
  
    public String getDelinquencies90to180Days() {
    return delinquencies90to180Days;
  }

  public void setDelinquencies90to180Days(String delinquencies90to180Days) {
    this.delinquencies90to180Days = delinquencies90to180Days;
  }

  public TradelineRespAuto derogCounter(String derogCounter) {
    this.derogCounter = derogCounter;
    return this;
  }

  /**
   * Indicates the number of months the account has been reported as seriously derogatory.
   * @return derogCounter
  **/
  @ApiModelProperty(value = "Indicates the number of months the account has been reported as seriously derogatory.")
  
    public String getDerogCounter() {
    return derogCounter;
  }

  public void setDerogCounter(String derogCounter) {
    this.derogCounter = derogCounter;
  }

  public TradelineRespAuto ecoa(String ecoa) {
    this.ecoa = ecoa;
    return this;
  }

  /**
   * Attribute code.
   * @return ecoa
  **/
  @ApiModelProperty(value = "Attribute code.")
  
    public String getEcoa() {
    return ecoa;
  }

  public void setEcoa(String ecoa) {
    this.ecoa = ecoa;
  }

  public TradelineRespAuto enhancedPaymentData(EnhancedPaymentData enhancedPaymentData) {
    this.enhancedPaymentData = enhancedPaymentData;
    return this;
  }

  /**
   * Get enhancedPaymentData
   * @return enhancedPaymentData
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public EnhancedPaymentData getEnhancedPaymentData() {
    return enhancedPaymentData;
  }

  public void setEnhancedPaymentData(EnhancedPaymentData enhancedPaymentData) {
    this.enhancedPaymentData = enhancedPaymentData;
  }

  public TradelineRespAuto evaluation(String evaluation) {
    this.evaluation = evaluation;
    return this;
  }

  /**
   * Indicates if additional review is required.
   * @return evaluation
  **/
  @ApiModelProperty(value = "Indicates if additional review is required.")
  
    public String getEvaluation() {
    return evaluation;
  }

  public void setEvaluation(String evaluation) {
    this.evaluation = evaluation;
  }

  public TradelineRespAuto kob(String kob) {
    this.kob = kob;
    return this;
  }

  /**
   * Kind of business code of subscriber
   * @return kob
  **/
  @ApiModelProperty(value = "Kind of business code of subscriber")
  
    public String getKob() {
    return kob;
  }

  public void setKob(String kob) {
    this.kob = kob;
  }

  public TradelineRespAuto lastPaymentDate(String lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
    return this;
  }

  /**
   * Date of last payment. Format = MMDDCCYY.
   * @return lastPaymentDate
  **/
  @ApiModelProperty(value = "Date of last payment. Format = MMDDCCYY.")
  
    public String getLastPaymentDate() {
    return lastPaymentDate;
  }

  public void setLastPaymentDate(String lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
  }

  public TradelineRespAuto maxDelinquencyDate(String maxDelinquencyDate) {
    this.maxDelinquencyDate = maxDelinquencyDate;
    return this;
  }

  /**
   * Date of worst payment code beyond the monthly payment profile. Format = (MMDDCCYY)
   * @return maxDelinquencyDate
  **/
  @ApiModelProperty(value = "Date of worst payment code beyond the monthly payment profile. Format = (MMDDCCYY)")
  
    public String getMaxDelinquencyDate() {
    return maxDelinquencyDate;
  }

  public void setMaxDelinquencyDate(String maxDelinquencyDate) {
    this.maxDelinquencyDate = maxDelinquencyDate;
  }

  public TradelineRespAuto monthlyPaymentAmount(String monthlyPaymentAmount) {
    this.monthlyPaymentAmount = monthlyPaymentAmount;
    return this;
  }

  /**
   * Full dollar amount.
   * @return monthlyPaymentAmount
  **/
  @ApiModelProperty(value = "Full dollar amount.")
  
    public String getMonthlyPaymentAmount() {
    return monthlyPaymentAmount;
  }

  public void setMonthlyPaymentAmount(String monthlyPaymentAmount) {
    this.monthlyPaymentAmount = monthlyPaymentAmount;
  }

  public TradelineRespAuto monthlyPaymentType(String monthlyPaymentType) {
    this.monthlyPaymentType = monthlyPaymentType;
    return this;
  }

  /**
   * Get monthlyPaymentType
   * @return monthlyPaymentType
  **/
  @ApiModelProperty(value = "")
  
    public String getMonthlyPaymentType() {
    return monthlyPaymentType;
  }

  public void setMonthlyPaymentType(String monthlyPaymentType) {
    this.monthlyPaymentType = monthlyPaymentType;
  }

  public TradelineRespAuto monthsHistory(String monthsHistory) {
    this.monthsHistory = monthsHistory;
    return this;
  }

  /**
   * Number of Months Reviewed
   * @return monthsHistory
  **/
  @ApiModelProperty(value = "Number of Months Reviewed")
  
    public String getMonthsHistory() {
    return monthsHistory;
  }

  public void setMonthsHistory(String monthsHistory) {
    this.monthsHistory = monthsHistory;
  }

  public TradelineRespAuto openDate(String openDate) {
    this.openDate = openDate;
    return this;
  }

  /**
   * Date account opened. Format = MMDDCCYY. 
   * @return openDate
  **/
  @ApiModelProperty(value = "Date account opened. Format = MMDDCCYY. ")
  
    public String getOpenDate() {
    return openDate;
  }

  public void setOpenDate(String openDate) {
    this.openDate = openDate;
  }

  public TradelineRespAuto openOrClosed(String openOrClosed) {
    this.openOrClosed = openOrClosed;
    return this;
  }

  /**
   * Indicates if trade is Open or Closed
   * @return openOrClosed
  **/
  @ApiModelProperty(value = "Indicates if trade is Open or Closed")
  
    public String getOpenOrClosed() {
    return openOrClosed;
  }

  public void setOpenOrClosed(String openOrClosed) {
    this.openOrClosed = openOrClosed;
  }

  public TradelineRespAuto originalCreditorName(String originalCreditorName) {
    this.originalCreditorName = originalCreditorName;
    return this;
  }

  /**
   * Name of original creditor if a collection account.
   * @return originalCreditorName
  **/
  @ApiModelProperty(value = "Name of original creditor if a collection account.")
  
    public String getOriginalCreditorName() {
    return originalCreditorName;
  }

  public void setOriginalCreditorName(String originalCreditorName) {
    this.originalCreditorName = originalCreditorName;
  }

  public TradelineRespAuto paymentHistory(String paymentHistory) {
    this.paymentHistory = paymentHistory;
    return this;
  }

  /**
   * 84 Month payment history when requested on input. Otherwise 25 month payment history.
   * @return paymentHistory
  **/
  @ApiModelProperty(value = "84 Month payment history when requested on input. Otherwise 25 month payment history.")
  
    public String getPaymentHistory() {
    return paymentHistory;
  }

  public void setPaymentHistory(String paymentHistory) {
    this.paymentHistory = paymentHistory;
  }

  public TradelineRespAuto revolvingOrInstallment(String revolvingOrInstallment) {
    this.revolvingOrInstallment = revolvingOrInstallment;
    return this;
  }

  /**
   * Get revolvingOrInstallment
   * @return revolvingOrInstallment
  **/
  @ApiModelProperty(value = "")
  
    public String getRevolvingOrInstallment() {
    return revolvingOrInstallment;
  }

  public void setRevolvingOrInstallment(String revolvingOrInstallment) {
    this.revolvingOrInstallment = revolvingOrInstallment;
  }

  public TradelineRespAuto soldToName(String soldToName) {
    this.soldToName = soldToName;
    return this;
  }

  /**
   * Name of the creditor to whom the account was sold.
   * @return soldToName
  **/
  @ApiModelProperty(value = "Name of the creditor to whom the account was sold.")
  
    public String getSoldToName() {
    return soldToName;
  }

  public void setSoldToName(String soldToName) {
    this.soldToName = soldToName;
  }

  public TradelineRespAuto specialComment(String specialComment) {
    this.specialComment = specialComment;
    return this;
  }

  /**
   * Special Comments.
   * @return specialComment
  **/
  @ApiModelProperty(value = "Special Comments.")
  
    public String getSpecialComment() {
    return specialComment;
  }

  public void setSpecialComment(String specialComment) {
    this.specialComment = specialComment;
  }

  public TradelineRespAuto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Account Condition/Payment Status Codes.
   * @return status
  **/
  @ApiModelProperty(value = "Account Condition/Payment Status Codes.")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TradelineRespAuto statusDate(String statusDate) {
    this.statusDate = statusDate;
    return this;
  }

  /**
   * Account Status Date. Format = MMDDCCYY.
   * @return statusDate
  **/
  @ApiModelProperty(value = "Account Status Date. Format = MMDDCCYY.")
  
    public String getStatusDate() {
    return statusDate;
  }

  public void setStatusDate(String statusDate) {
    this.statusDate = statusDate;
  }

  public TradelineRespAuto subscriberCode(String subscriberCode) {
    this.subscriberCode = subscriberCode;
    return this;
  }

  /**
   * Subscriber number that reported tradeline.
   * @return subscriberCode
  **/
  @ApiModelProperty(value = "Subscriber number that reported tradeline.")
  
    public String getSubscriberCode() {
    return subscriberCode;
  }

  public void setSubscriberCode(String subscriberCode) {
    this.subscriberCode = subscriberCode;
  }

  public TradelineRespAuto subscriberName(String subscriberName) {
    this.subscriberName = subscriberName;
    return this;
  }

  /**
   * Name of Subscriber
   * @return subscriberName
  **/
  @ApiModelProperty(value = "Name of Subscriber")
  
    public String getSubscriberName() {
    return subscriberName;
  }

  public void setSubscriberName(String subscriberName) {
    this.subscriberName = subscriberName;
  }

  public TradelineRespAuto terms(String terms) {
    this.terms = terms;
    return this;
  }

  /**
   * Payment terms for the Account.
   * @return terms
  **/
  @ApiModelProperty(value = "Payment terms for the Account.")
  
    public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradelineRespAuto tradelineRespAuto = (TradelineRespAuto) o;
    return Objects.equals(this.accountNumber, tradelineRespAuto.accountNumber) &&
        Objects.equals(this.accountType, tradelineRespAuto.accountType) &&
        Objects.equals(this.amount1, tradelineRespAuto.amount1) &&
        Objects.equals(this.amount1Qualifier, tradelineRespAuto.amount1Qualifier) &&
        Objects.equals(this.amount2, tradelineRespAuto.amount2) &&
        Objects.equals(this.amount2Qualifier, tradelineRespAuto.amount2Qualifier) &&
        Objects.equals(this.amountBalloonPayment, tradelineRespAuto.amountBalloonPayment) &&
        Objects.equals(this.amountPastDue, tradelineRespAuto.amountPastDue) &&
        Objects.equals(this.balanceAmount, tradelineRespAuto.balanceAmount) &&
        Objects.equals(this.balanceDate, tradelineRespAuto.balanceDate) &&
        Objects.equals(this.bankruptcyChapterNumber, tradelineRespAuto.bankruptcyChapterNumber) &&
        Objects.equals(this.consumerComment, tradelineRespAuto.consumerComment) &&
        Objects.equals(this.consumerDisputeFlag, tradelineRespAuto.consumerDisputeFlag) &&
        Objects.equals(this.datePaymentDue, tradelineRespAuto.datePaymentDue) &&
        Objects.equals(this.delinquencies30Days, tradelineRespAuto.delinquencies30Days) &&
        Objects.equals(this.delinquencies60Days, tradelineRespAuto.delinquencies60Days) &&
        Objects.equals(this.delinquencies90to180Days, tradelineRespAuto.delinquencies90to180Days) &&
        Objects.equals(this.derogCounter, tradelineRespAuto.derogCounter) &&
        Objects.equals(this.ecoa, tradelineRespAuto.ecoa) &&
        Objects.equals(this.enhancedPaymentData, tradelineRespAuto.enhancedPaymentData) &&
        Objects.equals(this.evaluation, tradelineRespAuto.evaluation) &&
        Objects.equals(this.kob, tradelineRespAuto.kob) &&
        Objects.equals(this.lastPaymentDate, tradelineRespAuto.lastPaymentDate) &&
        Objects.equals(this.maxDelinquencyDate, tradelineRespAuto.maxDelinquencyDate) &&
        Objects.equals(this.monthlyPaymentAmount, tradelineRespAuto.monthlyPaymentAmount) &&
        Objects.equals(this.monthlyPaymentType, tradelineRespAuto.monthlyPaymentType) &&
        Objects.equals(this.monthsHistory, tradelineRespAuto.monthsHistory) &&
        Objects.equals(this.openDate, tradelineRespAuto.openDate) &&
        Objects.equals(this.openOrClosed, tradelineRespAuto.openOrClosed) &&
        Objects.equals(this.originalCreditorName, tradelineRespAuto.originalCreditorName) &&
        Objects.equals(this.paymentHistory, tradelineRespAuto.paymentHistory) &&
        Objects.equals(this.revolvingOrInstallment, tradelineRespAuto.revolvingOrInstallment) &&
        Objects.equals(this.soldToName, tradelineRespAuto.soldToName) &&
        Objects.equals(this.specialComment, tradelineRespAuto.specialComment) &&
        Objects.equals(this.status, tradelineRespAuto.status) &&
        Objects.equals(this.statusDate, tradelineRespAuto.statusDate) &&
        Objects.equals(this.subscriberCode, tradelineRespAuto.subscriberCode) &&
        Objects.equals(this.subscriberName, tradelineRespAuto.subscriberName) &&
        Objects.equals(this.terms, tradelineRespAuto.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountType, amount1, amount1Qualifier, amount2, amount2Qualifier, amountBalloonPayment, amountPastDue, balanceAmount, balanceDate, bankruptcyChapterNumber, consumerComment, consumerDisputeFlag, datePaymentDue, delinquencies30Days, delinquencies60Days, delinquencies90to180Days, derogCounter, ecoa, enhancedPaymentData, evaluation, kob, lastPaymentDate, maxDelinquencyDate, monthlyPaymentAmount, monthlyPaymentType, monthsHistory, openDate, openOrClosed, originalCreditorName, paymentHistory, revolvingOrInstallment, soldToName, specialComment, status, statusDate, subscriberCode, subscriberName, terms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradelineRespAuto {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    amount1: ").append(toIndentedString(amount1)).append("\n");
    sb.append("    amount1Qualifier: ").append(toIndentedString(amount1Qualifier)).append("\n");
    sb.append("    amount2: ").append(toIndentedString(amount2)).append("\n");
    sb.append("    amount2Qualifier: ").append(toIndentedString(amount2Qualifier)).append("\n");
    sb.append("    amountBalloonPayment: ").append(toIndentedString(amountBalloonPayment)).append("\n");
    sb.append("    amountPastDue: ").append(toIndentedString(amountPastDue)).append("\n");
    sb.append("    balanceAmount: ").append(toIndentedString(balanceAmount)).append("\n");
    sb.append("    balanceDate: ").append(toIndentedString(balanceDate)).append("\n");
    sb.append("    bankruptcyChapterNumber: ").append(toIndentedString(bankruptcyChapterNumber)).append("\n");
    sb.append("    consumerComment: ").append(toIndentedString(consumerComment)).append("\n");
    sb.append("    consumerDisputeFlag: ").append(toIndentedString(consumerDisputeFlag)).append("\n");
    sb.append("    datePaymentDue: ").append(toIndentedString(datePaymentDue)).append("\n");
    sb.append("    delinquencies30Days: ").append(toIndentedString(delinquencies30Days)).append("\n");
    sb.append("    delinquencies60Days: ").append(toIndentedString(delinquencies60Days)).append("\n");
    sb.append("    delinquencies90to180Days: ").append(toIndentedString(delinquencies90to180Days)).append("\n");
    sb.append("    derogCounter: ").append(toIndentedString(derogCounter)).append("\n");
    sb.append("    ecoa: ").append(toIndentedString(ecoa)).append("\n");
    sb.append("    enhancedPaymentData: ").append(toIndentedString(enhancedPaymentData)).append("\n");
    sb.append("    evaluation: ").append(toIndentedString(evaluation)).append("\n");
    sb.append("    kob: ").append(toIndentedString(kob)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
    sb.append("    maxDelinquencyDate: ").append(toIndentedString(maxDelinquencyDate)).append("\n");
    sb.append("    monthlyPaymentAmount: ").append(toIndentedString(monthlyPaymentAmount)).append("\n");
    sb.append("    monthlyPaymentType: ").append(toIndentedString(monthlyPaymentType)).append("\n");
    sb.append("    monthsHistory: ").append(toIndentedString(monthsHistory)).append("\n");
    sb.append("    openDate: ").append(toIndentedString(openDate)).append("\n");
    sb.append("    openOrClosed: ").append(toIndentedString(openOrClosed)).append("\n");
    sb.append("    originalCreditorName: ").append(toIndentedString(originalCreditorName)).append("\n");
    sb.append("    paymentHistory: ").append(toIndentedString(paymentHistory)).append("\n");
    sb.append("    revolvingOrInstallment: ").append(toIndentedString(revolvingOrInstallment)).append("\n");
    sb.append("    soldToName: ").append(toIndentedString(soldToName)).append("\n");
    sb.append("    specialComment: ").append(toIndentedString(specialComment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDate: ").append(toIndentedString(statusDate)).append("\n");
    sb.append("    subscriberCode: ").append(toIndentedString(subscriberCode)).append("\n");
    sb.append("    subscriberName: ").append(toIndentedString(subscriberName)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
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
