package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.AddonsSummaries;
import com.b4nkd.creditscore.experian.model.ConsumerIdentifierCheckOptions;
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


public class AddonsDaasPremier   {
  @JsonProperty("directCheck")
  private String directCheck = "Y";

  @JsonProperty("demographics")
  private String demographics = null;

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

  public AddonsDaasPremier directCheck(String directCheck) {
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

  public AddonsDaasPremier demographics(String demographics) {
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

  public AddonsDaasPremier riskModels(RiskModelDaas riskModels) {
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

  public AddonsDaasPremier summaries(AddonsSummaries summaries) {
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

  public AddonsDaasPremier fraudShield(String fraudShield) {
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

  public AddonsDaasPremier mla(String mla) {
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

  public AddonsDaasPremier ofacmsg(String ofacmsg) {
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

  public AddonsDaasPremier consumerIdentCheck(ConsumerIdentifierCheckOptions consumerIdentCheck) {
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

  public AddonsDaasPremier joint(String joint) {
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

  public AddonsDaasPremier paymentHistory84(String paymentHistory84) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddonsDaasPremier addonsDaasPremier = (AddonsDaasPremier) o;
    return Objects.equals(this.directCheck, addonsDaasPremier.directCheck) &&
        Objects.equals(this.demographics, addonsDaasPremier.demographics) &&
        Objects.equals(this.riskModels, addonsDaasPremier.riskModels) &&
        Objects.equals(this.summaries, addonsDaasPremier.summaries) &&
        Objects.equals(this.fraudShield, addonsDaasPremier.fraudShield) &&
        Objects.equals(this.mla, addonsDaasPremier.mla) &&
        Objects.equals(this.ofacmsg, addonsDaasPremier.ofacmsg) &&
        Objects.equals(this.consumerIdentCheck, addonsDaasPremier.consumerIdentCheck) &&
        Objects.equals(this.joint, addonsDaasPremier.joint) &&
        Objects.equals(this.paymentHistory84, addonsDaasPremier.paymentHistory84);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directCheck, demographics, riskModels, summaries, fraudShield, mla, ofacmsg, consumerIdentCheck, joint, paymentHistory84);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddonsDaasPremier {\n");
    
    sb.append("    directCheck: ").append(toIndentedString(directCheck)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    riskModels: ").append(toIndentedString(riskModels)).append("\n");
    sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
    sb.append("    fraudShield: ").append(toIndentedString(fraudShield)).append("\n");
    sb.append("    mla: ").append(toIndentedString(mla)).append("\n");
    sb.append("    ofacmsg: ").append(toIndentedString(ofacmsg)).append("\n");
    sb.append("    consumerIdentCheck: ").append(toIndentedString(consumerIdentCheck)).append("\n");
    sb.append("    joint: ").append(toIndentedString(joint)).append("\n");
    sb.append("    paymentHistory84: ").append(toIndentedString(paymentHistory84)).append("\n");
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
