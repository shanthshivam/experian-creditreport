package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.AddonsSummaries;
import com.b4nkd.creditscore.experian.model.ClarityAccountData;
import com.b4nkd.creditscore.experian.model.ConsumerIdentifierCheckOptions;
import com.b4nkd.creditscore.experian.model.CreditScoreNoticeDataDaas;
import com.b4nkd.creditscore.experian.model.RiskModelDaas;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Add on products that can be requested. Each add on is billable. These are optional parameters and can be omitted if not needed.
 */
@ApiModel(description = "Add on products that can be requested. Each add on is billable. These are optional parameters and can be omitted if not needed.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class AddonsDaas   {
  @JsonProperty("directCheck")
  private String directCheck = "Y";

  @JsonProperty("demographics")
  private String demographics = null;

  @JsonProperty("clarityEarlyRiskScore")
  private String clarityEarlyRiskScore = "Y";

  @JsonProperty("clarityData")
  private ClarityAccountData clarityData = null;

  @JsonProperty("creditScoreNotice")
  private String creditScoreNotice = "Y";

  @JsonProperty("creditScoreNoticeData")
  private CreditScoreNoticeDataDaas creditScoreNoticeData = null;

  @JsonProperty("riskModels")
  private RiskModelDaas riskModels = null;

  @JsonProperty("summaries")
  private AddonsSummaries summaries = null;

  @JsonProperty("fraudShield")
  private String fraudShield = "Y";

  @JsonProperty("mla")
  private String mla = "Y";

  @JsonProperty("ofacmsg")
  private String ofacmsg = "Y";

  @JsonProperty("consumerIdentCheck")
  private ConsumerIdentifierCheckOptions consumerIdentCheck = null;

  @JsonProperty("joint")
  private String joint = "N";

  @JsonProperty("paymentHistory84")
  private String paymentHistory84 = "Y";

  @JsonProperty("outputType")
  private String outputType = "JSON";

  @JsonProperty("taxRefundLoan")
  private String taxRefundLoan = null;

  public AddonsDaas directCheck(String directCheck) {
    this.directCheck = directCheck;
    return this;
  }

  /**
   * Send back subscriber information on the credit profile. When set to Y indicates that subscriber and court names, addresses, and phone numbers who have reported data on the consumer's profile will be sent back on the response.
   * @return directCheck
  **/
  @ApiModelProperty(value = "Send back subscriber information on the credit profile. When set to Y indicates that subscriber and court names, addresses, and phone numbers who have reported data on the consumer's profile will be sent back on the response.")
  
    public String getDirectCheck() {
    return directCheck;
  }

  public void setDirectCheck(String directCheck) {
    this.directCheck = directCheck;
  }

  public AddonsDaas demographics(String demographics) {
    this.demographics = demographics;
    return this;
  }

  /**
   * Indicates the type of demographic data that should be returned back.
   * @return demographics
  **/
  @ApiModelProperty(value = "Indicates the type of demographic data that should be returned back.")
  
    public String getDemographics() {
    return demographics;
  }

  public void setDemographics(String demographics) {
    this.demographics = demographics;
  }

  public AddonsDaas clarityEarlyRiskScore(String clarityEarlyRiskScore) {
    this.clarityEarlyRiskScore = clarityEarlyRiskScore;
    return this;
  }

  /**
   * Y.  Returns Clarity's 90 day Clear Early Risk Score (CERS) which predict the risk of a consumer going 90 days past due in first 12 months of a traditional bureau trade. This can be omitted if Clarity Early Risk Score is not needed.
   * @return clarityEarlyRiskScore
  **/
  @ApiModelProperty(value = "Y.  Returns Clarity's 90 day Clear Early Risk Score (CERS) which predict the risk of a consumer going 90 days past due in first 12 months of a traditional bureau trade. This can be omitted if Clarity Early Risk Score is not needed.")
  
    public String getClarityEarlyRiskScore() {
    return clarityEarlyRiskScore;
  }

  public void setClarityEarlyRiskScore(String clarityEarlyRiskScore) {
    this.clarityEarlyRiskScore = clarityEarlyRiskScore;
  }

  public AddonsDaas clarityData(ClarityAccountData clarityData) {
    this.clarityData = clarityData;
    return this;
  }

  /**
   * Get clarityData
   * @return clarityData
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ClarityAccountData getClarityData() {
    return clarityData;
  }

  public void setClarityData(ClarityAccountData clarityData) {
    this.clarityData = clarityData;
  }

  public AddonsDaas creditScoreNotice(String creditScoreNotice) {
    this.creditScoreNotice = creditScoreNotice;
    return this;
  }

  /**
   * Y.  It makes 'creditScoreNoticeData' a mandatory element.
   * @return creditScoreNotice
  **/
  @ApiModelProperty(value = "Y.  It makes 'creditScoreNoticeData' a mandatory element.")
  
    public String getCreditScoreNotice() {
    return creditScoreNotice;
  }

  public void setCreditScoreNotice(String creditScoreNotice) {
    this.creditScoreNotice = creditScoreNotice;
  }

  public AddonsDaas creditScoreNoticeData(CreditScoreNoticeDataDaas creditScoreNoticeData) {
    this.creditScoreNoticeData = creditScoreNoticeData;
    return this;
  }

  /**
   * Get creditScoreNoticeData
   * @return creditScoreNoticeData
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CreditScoreNoticeDataDaas getCreditScoreNoticeData() {
    return creditScoreNoticeData;
  }

  public void setCreditScoreNoticeData(CreditScoreNoticeDataDaas creditScoreNoticeData) {
    this.creditScoreNoticeData = creditScoreNoticeData;
  }

  public AddonsDaas riskModels(RiskModelDaas riskModels) {
    this.riskModels = riskModels;
    return this;
  }

  /**
   * Get riskModels
   * @return riskModels
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public RiskModelDaas getRiskModels() {
    return riskModels;
  }

  public void setRiskModels(RiskModelDaas riskModels) {
    this.riskModels = riskModels;
  }

  public AddonsDaas summaries(AddonsSummaries summaries) {
    this.summaries = summaries;
    return this;
  }

  /**
   * Get summaries
   * @return summaries
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AddonsSummaries getSummaries() {
    return summaries;
  }

  public void setSummaries(AddonsSummaries summaries) {
    this.summaries = summaries;
  }

  public AddonsDaas fraudShield(String fraudShield) {
    this.fraudShield = fraudShield;
    return this;
  }

  /**
   * Y - Fraud Shield Product Option will be output
   * @return fraudShield
  **/
  @ApiModelProperty(value = "Y - Fraud Shield Product Option will be output")
  
    public String getFraudShield() {
    return fraudShield;
  }

  public void setFraudShield(String fraudShield) {
    this.fraudShield = fraudShield;
  }

  public AddonsDaas mla(String mla) {
    this.mla = mla;
    return this;
  }

  /**
   * Y - Trigger a screening process of taking the consumer data from an inquiry to match against the Dept of Defense MLA lists. Message codes 1203-1207 could be returned. Permissible Purpose with valid YOB required for getting this option.
   * @return mla
  **/
  @ApiModelProperty(value = "Y - Trigger a screening process of taking the consumer data from an inquiry to match against the Dept of Defense MLA lists. Message codes 1203-1207 could be returned. Permissible Purpose with valid YOB required for getting this option.")
  
    public String getMla() {
    return mla;
  }

  public void setMla(String mla) {
    this.mla = mla;
  }

  public AddonsDaas ofacmsg(String ofacmsg) {
    this.ofacmsg = ofacmsg;
    return this;
  }

  /**
   * Y- Trigger a screening process of taking the consumer data from an inquiry to match against the OFAC (Office of Foreign Asset Control) and PLC (Palestinian Legislative Council) lists. A message 1202 NAME DOES NOT MATCH OFAC/PLC LIST will be printed on credit profile if the consumer is not found on either OFAC or PLC list. A message 1200 NAME MATCHES OFAC/PLC LIST will be printed on credit profile if the consumer is found on either OFAC or PLC list.
   * @return ofacmsg
  **/
  @ApiModelProperty(value = "Y- Trigger a screening process of taking the consumer data from an inquiry to match against the OFAC (Office of Foreign Asset Control) and PLC (Palestinian Legislative Council) lists. A message 1202 NAME DOES NOT MATCH OFAC/PLC LIST will be printed on credit profile if the consumer is not found on either OFAC or PLC list. A message 1200 NAME MATCHES OFAC/PLC LIST will be printed on credit profile if the consumer is found on either OFAC or PLC list.")
  
    public String getOfacmsg() {
    return ofacmsg;
  }

  public void setOfacmsg(String ofacmsg) {
    this.ofacmsg = ofacmsg;
  }

  public AddonsDaas consumerIdentCheck(ConsumerIdentifierCheckOptions consumerIdentCheck) {
    this.consumerIdentCheck = consumerIdentCheck;
    return this;
  }

  /**
   * Get consumerIdentCheck
   * @return consumerIdentCheck
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerIdentifierCheckOptions getConsumerIdentCheck() {
    return consumerIdentCheck;
  }

  public void setConsumerIdentCheck(ConsumerIdentifierCheckOptions consumerIdentCheck) {
    this.consumerIdentCheck = consumerIdentCheck;
  }

  public AddonsDaas joint(String joint) {
    this.joint = joint;
    return this;
  }

  /**
   * If specified as Y it means that the client is requesting a joint credit report. This is used to request the Dual or Joint Report. Two separate credit reports are returned?one on the primary applicant and one on the secondary applicant. The joint applicant should have the same current address as the primary applicant. Include as much information on the joint applicant as possible, including the surname if it is different from the primary applicant. If NOt specified or N it means that a joint report is NOT being requested.
   * @return joint
  **/
  @ApiModelProperty(value = "If specified as Y it means that the client is requesting a joint credit report. This is used to request the Dual or Joint Report. Two separate credit reports are returned?one on the primary applicant and one on the secondary applicant. The joint applicant should have the same current address as the primary applicant. Include as much information on the joint applicant as possible, including the surname if it is different from the primary applicant. If NOt specified or N it means that a joint report is NOT being requested.")
  
    public String getJoint() {
    return joint;
  }

  public void setJoint(String joint) {
    this.joint = joint;
  }

  public AddonsDaas paymentHistory84(String paymentHistory84) {
    this.paymentHistory84 = paymentHistory84;
    return this;
  }

  /**
   * Y.  84 month payment history is requested instead of the 25 month history. This can be omitted if 84 month history is not needed
   * @return paymentHistory84
  **/
  @ApiModelProperty(value = "Y.  84 month payment history is requested instead of the 25 month history. This can be omitted if 84 month history is not needed")
  
    public String getPaymentHistory84() {
    return paymentHistory84;
  }

  public void setPaymentHistory84(String paymentHistory84) {
    this.paymentHistory84 = paymentHistory84;
  }

  public AddonsDaas outputType(String outputType) {
    this.outputType = outputType;
    return this;
  }

  /**
   * ENUM JSON,ARF,COMBO If JSON is type, API coverts the output from DaaS to JSON tags and discards the output from DaaS If ARF is type, API creates a JSON wrapper with a single data tag that              contains the DaaS output. If COMBO is type, API converts the output from DaaS (excluding the 700              segments) into JSON and also inserts the DaaS output into a single data             tag.
   * @return outputType
  **/
  @ApiModelProperty(value = "ENUM JSON,ARF,COMBO If JSON is type, API coverts the output from DaaS to JSON tags and discards the output from DaaS If ARF is type, API creates a JSON wrapper with a single data tag that              contains the DaaS output. If COMBO is type, API converts the output from DaaS (excluding the 700              segments) into JSON and also inserts the DaaS output into a single data             tag.")
  
    public String getOutputType() {
    return outputType;
  }

  public void setOutputType(String outputType) {
    this.outputType = outputType;
  }

  public AddonsDaas taxRefundLoan(String taxRefundLoan) {
    this.taxRefundLoan = taxRefundLoan;
    return this;
  }

  /**
   * Y will be displayed    in the indicator field; if no inquiry is found for a tax refund loan inquiry from January 1 through October 17, an N will be displayed in the indicator field.                  
   * @return taxRefundLoan
  **/
  @ApiModelProperty(value = "Y will be displayed    in the indicator field; if no inquiry is found for a tax refund loan inquiry from January 1 through October 17, an N will be displayed in the indicator field.                  ")
  
    public String getTaxRefundLoan() {
    return taxRefundLoan;
  }

  public void setTaxRefundLoan(String taxRefundLoan) {
    this.taxRefundLoan = taxRefundLoan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddonsDaas addonsDaas = (AddonsDaas) o;
    return Objects.equals(this.directCheck, addonsDaas.directCheck) &&
        Objects.equals(this.demographics, addonsDaas.demographics) &&
        Objects.equals(this.clarityEarlyRiskScore, addonsDaas.clarityEarlyRiskScore) &&
        Objects.equals(this.clarityData, addonsDaas.clarityData) &&
        Objects.equals(this.creditScoreNotice, addonsDaas.creditScoreNotice) &&
        Objects.equals(this.creditScoreNoticeData, addonsDaas.creditScoreNoticeData) &&
        Objects.equals(this.riskModels, addonsDaas.riskModels) &&
        Objects.equals(this.summaries, addonsDaas.summaries) &&
        Objects.equals(this.fraudShield, addonsDaas.fraudShield) &&
        Objects.equals(this.mla, addonsDaas.mla) &&
        Objects.equals(this.ofacmsg, addonsDaas.ofacmsg) &&
        Objects.equals(this.consumerIdentCheck, addonsDaas.consumerIdentCheck) &&
        Objects.equals(this.joint, addonsDaas.joint) &&
        Objects.equals(this.paymentHistory84, addonsDaas.paymentHistory84) &&
        Objects.equals(this.outputType, addonsDaas.outputType) &&
        Objects.equals(this.taxRefundLoan, addonsDaas.taxRefundLoan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directCheck, demographics, clarityEarlyRiskScore, clarityData, creditScoreNotice, creditScoreNoticeData, riskModels, summaries, fraudShield, mla, ofacmsg, consumerIdentCheck, joint, paymentHistory84, outputType, taxRefundLoan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddonsDaas {\n");
    
    sb.append("    directCheck: ").append(toIndentedString(directCheck)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    clarityEarlyRiskScore: ").append(toIndentedString(clarityEarlyRiskScore)).append("\n");
    sb.append("    clarityData: ").append(toIndentedString(clarityData)).append("\n");
    sb.append("    creditScoreNotice: ").append(toIndentedString(creditScoreNotice)).append("\n");
    sb.append("    creditScoreNoticeData: ").append(toIndentedString(creditScoreNoticeData)).append("\n");
    sb.append("    riskModels: ").append(toIndentedString(riskModels)).append("\n");
    sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
    sb.append("    fraudShield: ").append(toIndentedString(fraudShield)).append("\n");
    sb.append("    mla: ").append(toIndentedString(mla)).append("\n");
    sb.append("    ofacmsg: ").append(toIndentedString(ofacmsg)).append("\n");
    sb.append("    consumerIdentCheck: ").append(toIndentedString(consumerIdentCheck)).append("\n");
    sb.append("    joint: ").append(toIndentedString(joint)).append("\n");
    sb.append("    paymentHistory84: ").append(toIndentedString(paymentHistory84)).append("\n");
    sb.append("    outputType: ").append(toIndentedString(outputType)).append("\n");
    sb.append("    taxRefundLoan: ").append(toIndentedString(taxRefundLoan)).append("\n");
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
