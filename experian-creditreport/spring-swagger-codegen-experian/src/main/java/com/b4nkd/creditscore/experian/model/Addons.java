package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.AddonsSummaries;
import com.b4nkd.creditscore.experian.model.ClarityAccountDataCP;
import com.b4nkd.creditscore.experian.model.ConsumerIdentifierCheckOptions;
import com.b4nkd.creditscore.experian.model.ECBSVAttributeDataCP;
import com.b4nkd.creditscore.experian.model.RentBureauAccountData;
import com.b4nkd.creditscore.experian.model.RiskModel;
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


public class Addons   {
  @JsonProperty("directCheck")
  private String directCheck = "Y";

  @JsonProperty("demographics")
  private String demographics = null;

  @JsonProperty("extendedViewScore")
  private String extendedViewScore = null;

  @JsonProperty("clarityEarlyRiskScore")
  private String clarityEarlyRiskScore = "Y";

  @JsonProperty("clarityAttributes")
  private String clarityAttributes = "Y";

  @JsonProperty("clarityData")
  private ClarityAccountDataCP clarityData = null;

  @JsonProperty("eCBSV")
  private String eCBSV = "Y";

  @JsonProperty("eCBSVData")
  private ECBSVAttributeDataCP eCBSVData = null;

  @JsonProperty("renterRiskScore")
  private String renterRiskScore = "Y";

  @JsonProperty("rentBureauData")
  private RentBureauAccountData rentBureauData = null;

  @JsonProperty("riskModels")
  private RiskModel riskModels = null;

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

  @JsonProperty("syntheticId")
  private String syntheticId = null;

  @JsonProperty("taxRefundLoan")
  private String taxRefundLoan = null;

  @JsonProperty("guaranteeId")
  private String guaranteeId = null;

  @JsonProperty("trendedData")
  private String trendedData = null;

  @JsonProperty("outputType")
  private String outputType = null;

  public Addons directCheck(String directCheck) {
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

  public Addons demographics(String demographics) {
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

  public Addons extendedViewScore(String extendedViewScore) {
    this.extendedViewScore = extendedViewScore;
    return this;
  }

  /**
   * extendedViewScore \"type\": \"string\", \"pattern\": \"^[A-Z]{0,1}$\", \"enum\": [\"Y\", \"N\",\"\"]
   * @return extendedViewScore
  **/
  @ApiModelProperty(value = "extendedViewScore \"type\": \"string\", \"pattern\": \"^[A-Z]{0,1}$\", \"enum\": [\"Y\", \"N\",\"\"]")
  
    public String getExtendedViewScore() {
    return extendedViewScore;
  }

  public void setExtendedViewScore(String extendedViewScore) {
    this.extendedViewScore = extendedViewScore;
  }

  public Addons clarityEarlyRiskScore(String clarityEarlyRiskScore) {
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

  public Addons clarityAttributes(String clarityAttributes) {
    this.clarityAttributes = clarityAttributes;
    return this;
  }

  /**
   * Y - Calls the Clarity attributes service and Billing service along with existing flow. If clarityEarlyRiskScore is 'Y', the first name, last name, current address, ssn and fields under clarityData become mandatory in the request.    
   * @return clarityAttributes
  **/
  @ApiModelProperty(value = "Y - Calls the Clarity attributes service and Billing service along with existing flow. If clarityEarlyRiskScore is 'Y', the first name, last name, current address, ssn and fields under clarityData become mandatory in the request.    ")
  
    public String getClarityAttributes() {
    return clarityAttributes;
  }

  public void setClarityAttributes(String clarityAttributes) {
    this.clarityAttributes = clarityAttributes;
  }

  public Addons clarityData(ClarityAccountDataCP clarityData) {
    this.clarityData = clarityData;
    return this;
  }

  /**
   * Get clarityData
   * @return clarityData
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ClarityAccountDataCP getClarityData() {
    return clarityData;
  }

  public void setClarityData(ClarityAccountDataCP clarityData) {
    this.clarityData = clarityData;
  }

  public Addons eCBSV(String eCBSV) {
    this.eCBSV = eCBSV;
    return this;
  }

  /**
   * Y - Makes these fields mandatory - first name, last name, current address and ssn, dob elements of primary applicant  along with employer identification number, primary applicant date of consent and primary applicant signature type elements of eCBSVData.
   * @return eCBSV
  **/
  @ApiModelProperty(value = "Y - Makes these fields mandatory - first name, last name, current address and ssn, dob elements of primary applicant  along with employer identification number, primary applicant date of consent and primary applicant signature type elements of eCBSVData.")
  
    public String getECBSV() {
    return eCBSV;
  }

  public void setECBSV(String eCBSV) {
    this.eCBSV = eCBSV;
  }

  public Addons eCBSVData(ECBSVAttributeDataCP eCBSVData) {
    this.eCBSVData = eCBSVData;
    return this;
  }

  /**
   * Get eCBSVData
   * @return eCBSVData
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ECBSVAttributeDataCP getECBSVData() {
    return eCBSVData;
  }

  public void setECBSVData(ECBSVAttributeDataCP eCBSVData) {
    this.eCBSVData = eCBSVData;
  }

  public Addons renterRiskScore(String renterRiskScore) {
    this.renterRiskScore = renterRiskScore;
    return this;
  }

  /**
   * Y.  Returns the rent Bureau's 90 day Rent Risk Score which predict the risk of a renter going 90 days past due in first 12 months of a rental lease. This can be omitted if Renter Risk Score is not needed.
   * @return renterRiskScore
  **/
  @ApiModelProperty(value = "Y.  Returns the rent Bureau's 90 day Rent Risk Score which predict the risk of a renter going 90 days past due in first 12 months of a rental lease. This can be omitted if Renter Risk Score is not needed.")
  
    public String getRenterRiskScore() {
    return renterRiskScore;
  }

  public void setRenterRiskScore(String renterRiskScore) {
    this.renterRiskScore = renterRiskScore;
  }

  public Addons rentBureauData(RentBureauAccountData rentBureauData) {
    this.rentBureauData = rentBureauData;
    return this;
  }

  /**
   * Get rentBureauData
   * @return rentBureauData
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public RentBureauAccountData getRentBureauData() {
    return rentBureauData;
  }

  public void setRentBureauData(RentBureauAccountData rentBureauData) {
    this.rentBureauData = rentBureauData;
  }

  public Addons riskModels(RiskModel riskModels) {
    this.riskModels = riskModels;
    return this;
  }

  /**
   * Get riskModels
   * @return riskModels
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public RiskModel getRiskModels() {
    return riskModels;
  }

  public void setRiskModels(RiskModel riskModels) {
    this.riskModels = riskModels;
  }

  public Addons summaries(AddonsSummaries summaries) {
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

  public Addons fraudShield(String fraudShield) {
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

  public Addons mla(String mla) {
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

  public Addons ofacmsg(String ofacmsg) {
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

  public Addons consumerIdentCheck(ConsumerIdentifierCheckOptions consumerIdentCheck) {
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

  public Addons joint(String joint) {
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

  public Addons paymentHistory84(String paymentHistory84) {
    this.paymentHistory84 = paymentHistory84;
    return this;
  }

  /**
   * Y.  84 month payment history is requested instead of the 25 month history. This can be omitted if 84 month history is not needed.
   * @return paymentHistory84
  **/
  @ApiModelProperty(value = "Y.  84 month payment history is requested instead of the 25 month history. This can be omitted if 84 month history is not needed.")
  
    public String getPaymentHistory84() {
    return paymentHistory84;
  }

  public void setPaymentHistory84(String paymentHistory84) {
    this.paymentHistory84 = paymentHistory84;
  }

  public Addons syntheticId(String syntheticId) {
    this.syntheticId = syntheticId;
    return this;
  }

  /**
   * SYNTHETIC IDENTITY RISK INDICATOR (NOT FOR ADVERSE ACTION): HIGH/MEDIUM/LOW The high, medium, low will be dynamic values and only one will appear
   * @return syntheticId
  **/
  @ApiModelProperty(value = "SYNTHETIC IDENTITY RISK INDICATOR (NOT FOR ADVERSE ACTION): HIGH/MEDIUM/LOW The high, medium, low will be dynamic values and only one will appear")
  
    public String getSyntheticId() {
    return syntheticId;
  }

  public void setSyntheticId(String syntheticId) {
    this.syntheticId = syntheticId;
  }

  public Addons taxRefundLoan(String taxRefundLoan) {
    this.taxRefundLoan = taxRefundLoan;
    return this;
  }

  /**
   * Y will be displayed    in the indicator field; if no inquiry is found for a tax refund loan inquiry from January 1 through October 17, an N will be displayed in the indicator field.          
   * @return taxRefundLoan
  **/
  @ApiModelProperty(value = "Y will be displayed    in the indicator field; if no inquiry is found for a tax refund loan inquiry from January 1 through October 17, an N will be displayed in the indicator field.          ")
  
    public String getTaxRefundLoan() {
    return taxRefundLoan;
  }

  public void setTaxRefundLoan(String taxRefundLoan) {
    this.taxRefundLoan = taxRefundLoan;
  }

  public Addons guaranteeId(String guaranteeId) {
    this.guaranteeId = guaranteeId;
    return this;
  }

  /**
   * Y will be displayed    in the indicator field; Guaranteed ID (GID) is a new product for subscribed financial institutions. Using machine learning models to assess the overall credit health of a consumer, Experian will guarantee three types of credit types for an approved consumer.credit card, revolving credit, and check card.
   * @return guaranteeId
  **/
  @ApiModelProperty(value = "Y will be displayed    in the indicator field; Guaranteed ID (GID) is a new product for subscribed financial institutions. Using machine learning models to assess the overall credit health of a consumer, Experian will guarantee three types of credit types for an approved consumer.credit card, revolving credit, and check card.")
  
    public String getGuaranteeId() {
    return guaranteeId;
  }

  public void setGuaranteeId(String guaranteeId) {
    this.guaranteeId = guaranteeId;
  }

  public Addons trendedData(String trendedData) {
    this.trendedData = trendedData;
    return this;
  }

  /**
   * Tranded trades has included.          
   * @return trendedData
  **/
  @ApiModelProperty(value = "Tranded trades has included.          ")
  
    public String getTrendedData() {
    return trendedData;
  }

  public void setTrendedData(String trendedData) {
    this.trendedData = trendedData;
  }

  public Addons outputType(String outputType) {
    this.outputType = outputType;
    return this;
  }

  /**
   * outputType.                    
   * @return outputType
  **/
  @ApiModelProperty(value = "outputType.                    ")
  
    public String getOutputType() {
    return outputType;
  }

  public void setOutputType(String outputType) {
    this.outputType = outputType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Addons addons = (Addons) o;
    return Objects.equals(this.directCheck, addons.directCheck) &&
        Objects.equals(this.demographics, addons.demographics) &&
        Objects.equals(this.extendedViewScore, addons.extendedViewScore) &&
        Objects.equals(this.clarityEarlyRiskScore, addons.clarityEarlyRiskScore) &&
        Objects.equals(this.clarityAttributes, addons.clarityAttributes) &&
        Objects.equals(this.clarityData, addons.clarityData) &&
        Objects.equals(this.eCBSV, addons.eCBSV) &&
        Objects.equals(this.eCBSVData, addons.eCBSVData) &&
        Objects.equals(this.renterRiskScore, addons.renterRiskScore) &&
        Objects.equals(this.rentBureauData, addons.rentBureauData) &&
        Objects.equals(this.riskModels, addons.riskModels) &&
        Objects.equals(this.summaries, addons.summaries) &&
        Objects.equals(this.fraudShield, addons.fraudShield) &&
        Objects.equals(this.mla, addons.mla) &&
        Objects.equals(this.ofacmsg, addons.ofacmsg) &&
        Objects.equals(this.consumerIdentCheck, addons.consumerIdentCheck) &&
        Objects.equals(this.joint, addons.joint) &&
        Objects.equals(this.paymentHistory84, addons.paymentHistory84) &&
        Objects.equals(this.syntheticId, addons.syntheticId) &&
        Objects.equals(this.taxRefundLoan, addons.taxRefundLoan) &&
        Objects.equals(this.guaranteeId, addons.guaranteeId) &&
        Objects.equals(this.trendedData, addons.trendedData) &&
        Objects.equals(this.outputType, addons.outputType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directCheck, demographics, extendedViewScore, clarityEarlyRiskScore, clarityAttributes, clarityData, eCBSV, eCBSVData, renterRiskScore, rentBureauData, riskModels, summaries, fraudShield, mla, ofacmsg, consumerIdentCheck, joint, paymentHistory84, syntheticId, taxRefundLoan, guaranteeId, trendedData, outputType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Addons {\n");
    
    sb.append("    directCheck: ").append(toIndentedString(directCheck)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    extendedViewScore: ").append(toIndentedString(extendedViewScore)).append("\n");
    sb.append("    clarityEarlyRiskScore: ").append(toIndentedString(clarityEarlyRiskScore)).append("\n");
    sb.append("    clarityAttributes: ").append(toIndentedString(clarityAttributes)).append("\n");
    sb.append("    clarityData: ").append(toIndentedString(clarityData)).append("\n");
    sb.append("    eCBSV: ").append(toIndentedString(eCBSV)).append("\n");
    sb.append("    eCBSVData: ").append(toIndentedString(eCBSVData)).append("\n");
    sb.append("    renterRiskScore: ").append(toIndentedString(renterRiskScore)).append("\n");
    sb.append("    rentBureauData: ").append(toIndentedString(rentBureauData)).append("\n");
    sb.append("    riskModels: ").append(toIndentedString(riskModels)).append("\n");
    sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
    sb.append("    fraudShield: ").append(toIndentedString(fraudShield)).append("\n");
    sb.append("    mla: ").append(toIndentedString(mla)).append("\n");
    sb.append("    ofacmsg: ").append(toIndentedString(ofacmsg)).append("\n");
    sb.append("    consumerIdentCheck: ").append(toIndentedString(consumerIdentCheck)).append("\n");
    sb.append("    joint: ").append(toIndentedString(joint)).append("\n");
    sb.append("    paymentHistory84: ").append(toIndentedString(paymentHistory84)).append("\n");
    sb.append("    syntheticId: ").append(toIndentedString(syntheticId)).append("\n");
    sb.append("    taxRefundLoan: ").append(toIndentedString(taxRefundLoan)).append("\n");
    sb.append("    guaranteeId: ").append(toIndentedString(guaranteeId)).append("\n");
    sb.append("    trendedData: ").append(toIndentedString(trendedData)).append("\n");
    sb.append("    outputType: ").append(toIndentedString(outputType)).append("\n");
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
