package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.AddressInformationResp;
import com.b4nkd.creditscore.experian.model.ConsumerAssistanceReferralAddress;
import com.b4nkd.creditscore.experian.model.ConsumerIdentity;
import com.b4nkd.creditscore.experian.model.DirectCheck;
import com.b4nkd.creditscore.experian.model.EmploymentInformation;
import com.b4nkd.creditscore.experian.model.FraudShield;
import com.b4nkd.creditscore.experian.model.InformationalMessage;
import com.b4nkd.creditscore.experian.model.Inquiry;
import com.b4nkd.creditscore.experian.model.MlaResp;
import com.b4nkd.creditscore.experian.model.OfacResp;
import com.b4nkd.creditscore.experian.model.PublicRecord;
import com.b4nkd.creditscore.experian.model.RiskModel;
import com.b4nkd.creditscore.experian.model.Ssn;
import com.b4nkd.creditscore.experian.model.Statement;
import com.b4nkd.creditscore.experian.model.Summaries;
import com.b4nkd.creditscore.experian.model.Trendedtradeline;
import com.b4nkd.creditscore.experian.model.UniqueConsumerIdentifier;
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
 * CreditProfileResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class CreditProfileResp   {
  @JsonProperty("addressInformation")
  @Valid
  private List<AddressInformationResp> addressInformation = null;

  @JsonProperty("consumerAssistanceReferralAddress")
  private ConsumerAssistanceReferralAddress consumerAssistanceReferralAddress = null;

  @JsonProperty("consumerIdentity")
  private ConsumerIdentity consumerIdentity = null;

  @JsonProperty("directCheck")
  private DirectCheck directCheck = null;

  @JsonProperty("employmentInformation")
  private EmploymentInformation employmentInformation = null;

  @JsonProperty("fraudShield")
  private FraudShield fraudShield = null;

  @JsonProperty("informationalMessage")
  private InformationalMessage informationalMessage = null;

  @JsonProperty("inquiry")
  private Inquiry inquiry = null;

  @JsonProperty("mla")
  private MlaResp mla = null;

  @JsonProperty("ofac")
  private OfacResp ofac = null;

  @JsonProperty("summaries")
  private Summaries summaries = null;

  @JsonProperty("publicRecord")
  private PublicRecord publicRecord = null;

  @JsonProperty("riskModel")
  private RiskModel riskModel = null;

  @JsonProperty("ssn")
  private Ssn ssn = null;

  @JsonProperty("statement")
  private Statement statement = null;

  @JsonProperty("tradeline")
  private Trendedtradeline tradeline = null;

  @JsonProperty("uniqueConsumerIdentifier")
  private UniqueConsumerIdentifier uniqueConsumerIdentifier = null;

  public CreditProfileResp addressInformation(List<AddressInformationResp> addressInformation) {
    this.addressInformation = addressInformation;
    return this;
  }

  public CreditProfileResp addAddressInformationItem(AddressInformationResp addressInformationItem) {
    if (this.addressInformation == null) {
      this.addressInformation = new ArrayList<AddressInformationResp>();
    }
    this.addressInformation.add(addressInformationItem);
    return this;
  }

  /**
   * Best Consumer Addresses
   * @return addressInformation
  **/
  @ApiModelProperty(value = "Best Consumer Addresses")
      @Valid
    public List<AddressInformationResp> getAddressInformation() {
    return addressInformation;
  }

  public void setAddressInformation(List<AddressInformationResp> addressInformation) {
    this.addressInformation = addressInformation;
  }

  public CreditProfileResp consumerAssistanceReferralAddress(ConsumerAssistanceReferralAddress consumerAssistanceReferralAddress) {
    this.consumerAssistanceReferralAddress = consumerAssistanceReferralAddress;
    return this;
  }

  /**
   * Get consumerAssistanceReferralAddress
   * @return consumerAssistanceReferralAddress
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerAssistanceReferralAddress getConsumerAssistanceReferralAddress() {
    return consumerAssistanceReferralAddress;
  }

  public void setConsumerAssistanceReferralAddress(ConsumerAssistanceReferralAddress consumerAssistanceReferralAddress) {
    this.consumerAssistanceReferralAddress = consumerAssistanceReferralAddress;
  }

  public CreditProfileResp consumerIdentity(ConsumerIdentity consumerIdentity) {
    this.consumerIdentity = consumerIdentity;
    return this;
  }

  /**
   * Get consumerIdentity
   * @return consumerIdentity
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerIdentity getConsumerIdentity() {
    return consumerIdentity;
  }

  public void setConsumerIdentity(ConsumerIdentity consumerIdentity) {
    this.consumerIdentity = consumerIdentity;
  }

  public CreditProfileResp directCheck(DirectCheck directCheck) {
    this.directCheck = directCheck;
    return this;
  }

  /**
   * Get directCheck
   * @return directCheck
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public DirectCheck getDirectCheck() {
    return directCheck;
  }

  public void setDirectCheck(DirectCheck directCheck) {
    this.directCheck = directCheck;
  }

  public CreditProfileResp employmentInformation(EmploymentInformation employmentInformation) {
    this.employmentInformation = employmentInformation;
    return this;
  }

  /**
   * Get employmentInformation
   * @return employmentInformation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public EmploymentInformation getEmploymentInformation() {
    return employmentInformation;
  }

  public void setEmploymentInformation(EmploymentInformation employmentInformation) {
    this.employmentInformation = employmentInformation;
  }

  public CreditProfileResp fraudShield(FraudShield fraudShield) {
    this.fraudShield = fraudShield;
    return this;
  }

  /**
   * Get fraudShield
   * @return fraudShield
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public FraudShield getFraudShield() {
    return fraudShield;
  }

  public void setFraudShield(FraudShield fraudShield) {
    this.fraudShield = fraudShield;
  }

  public CreditProfileResp informationalMessage(InformationalMessage informationalMessage) {
    this.informationalMessage = informationalMessage;
    return this;
  }

  /**
   * Get informationalMessage
   * @return informationalMessage
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public InformationalMessage getInformationalMessage() {
    return informationalMessage;
  }

  public void setInformationalMessage(InformationalMessage informationalMessage) {
    this.informationalMessage = informationalMessage;
  }

  public CreditProfileResp inquiry(Inquiry inquiry) {
    this.inquiry = inquiry;
    return this;
  }

  /**
   * Get inquiry
   * @return inquiry
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Inquiry getInquiry() {
    return inquiry;
  }

  public void setInquiry(Inquiry inquiry) {
    this.inquiry = inquiry;
  }

  public CreditProfileResp mla(MlaResp mla) {
    this.mla = mla;
    return this;
  }

  /**
   * Get mla
   * @return mla
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MlaResp getMla() {
    return mla;
  }

  public void setMla(MlaResp mla) {
    this.mla = mla;
  }

  public CreditProfileResp ofac(OfacResp ofac) {
    this.ofac = ofac;
    return this;
  }

  /**
   * Get ofac
   * @return ofac
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OfacResp getOfac() {
    return ofac;
  }

  public void setOfac(OfacResp ofac) {
    this.ofac = ofac;
  }

  public CreditProfileResp summaries(Summaries summaries) {
    this.summaries = summaries;
    return this;
  }

  /**
   * Get summaries
   * @return summaries
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Summaries getSummaries() {
    return summaries;
  }

  public void setSummaries(Summaries summaries) {
    this.summaries = summaries;
  }

  public CreditProfileResp publicRecord(PublicRecord publicRecord) {
    this.publicRecord = publicRecord;
    return this;
  }

  /**
   * Get publicRecord
   * @return publicRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public PublicRecord getPublicRecord() {
    return publicRecord;
  }

  public void setPublicRecord(PublicRecord publicRecord) {
    this.publicRecord = publicRecord;
  }

  public CreditProfileResp riskModel(RiskModel riskModel) {
    this.riskModel = riskModel;
    return this;
  }

  /**
   * Get riskModel
   * @return riskModel
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public RiskModel getRiskModel() {
    return riskModel;
  }

  public void setRiskModel(RiskModel riskModel) {
    this.riskModel = riskModel;
  }

  public CreditProfileResp ssn(Ssn ssn) {
    this.ssn = ssn;
    return this;
  }

  /**
   * Get ssn
   * @return ssn
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Ssn getSsn() {
    return ssn;
  }

  public void setSsn(Ssn ssn) {
    this.ssn = ssn;
  }

  public CreditProfileResp statement(Statement statement) {
    this.statement = statement;
    return this;
  }

  /**
   * Get statement
   * @return statement
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Statement getStatement() {
    return statement;
  }

  public void setStatement(Statement statement) {
    this.statement = statement;
  }

  public CreditProfileResp tradeline(Trendedtradeline tradeline) {
    this.tradeline = tradeline;
    return this;
  }

  /**
   * Get tradeline
   * @return tradeline
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Trendedtradeline getTradeline() {
    return tradeline;
  }

  public void setTradeline(Trendedtradeline tradeline) {
    this.tradeline = tradeline;
  }

  public CreditProfileResp uniqueConsumerIdentifier(UniqueConsumerIdentifier uniqueConsumerIdentifier) {
    this.uniqueConsumerIdentifier = uniqueConsumerIdentifier;
    return this;
  }

  /**
   * Get uniqueConsumerIdentifier
   * @return uniqueConsumerIdentifier
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UniqueConsumerIdentifier getUniqueConsumerIdentifier() {
    return uniqueConsumerIdentifier;
  }

  public void setUniqueConsumerIdentifier(UniqueConsumerIdentifier uniqueConsumerIdentifier) {
    this.uniqueConsumerIdentifier = uniqueConsumerIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditProfileResp creditProfileResp = (CreditProfileResp) o;
    return Objects.equals(this.addressInformation, creditProfileResp.addressInformation) &&
        Objects.equals(this.consumerAssistanceReferralAddress, creditProfileResp.consumerAssistanceReferralAddress) &&
        Objects.equals(this.consumerIdentity, creditProfileResp.consumerIdentity) &&
        Objects.equals(this.directCheck, creditProfileResp.directCheck) &&
        Objects.equals(this.employmentInformation, creditProfileResp.employmentInformation) &&
        Objects.equals(this.fraudShield, creditProfileResp.fraudShield) &&
        Objects.equals(this.informationalMessage, creditProfileResp.informationalMessage) &&
        Objects.equals(this.inquiry, creditProfileResp.inquiry) &&
        Objects.equals(this.mla, creditProfileResp.mla) &&
        Objects.equals(this.ofac, creditProfileResp.ofac) &&
        Objects.equals(this.summaries, creditProfileResp.summaries) &&
        Objects.equals(this.publicRecord, creditProfileResp.publicRecord) &&
        Objects.equals(this.riskModel, creditProfileResp.riskModel) &&
        Objects.equals(this.ssn, creditProfileResp.ssn) &&
        Objects.equals(this.statement, creditProfileResp.statement) &&
        Objects.equals(this.tradeline, creditProfileResp.tradeline) &&
        Objects.equals(this.uniqueConsumerIdentifier, creditProfileResp.uniqueConsumerIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressInformation, consumerAssistanceReferralAddress, consumerIdentity, directCheck, employmentInformation, fraudShield, informationalMessage, inquiry, mla, ofac, summaries, publicRecord, riskModel, ssn, statement, tradeline, uniqueConsumerIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditProfileResp {\n");
    
    sb.append("    addressInformation: ").append(toIndentedString(addressInformation)).append("\n");
    sb.append("    consumerAssistanceReferralAddress: ").append(toIndentedString(consumerAssistanceReferralAddress)).append("\n");
    sb.append("    consumerIdentity: ").append(toIndentedString(consumerIdentity)).append("\n");
    sb.append("    directCheck: ").append(toIndentedString(directCheck)).append("\n");
    sb.append("    employmentInformation: ").append(toIndentedString(employmentInformation)).append("\n");
    sb.append("    fraudShield: ").append(toIndentedString(fraudShield)).append("\n");
    sb.append("    informationalMessage: ").append(toIndentedString(informationalMessage)).append("\n");
    sb.append("    inquiry: ").append(toIndentedString(inquiry)).append("\n");
    sb.append("    mla: ").append(toIndentedString(mla)).append("\n");
    sb.append("    ofac: ").append(toIndentedString(ofac)).append("\n");
    sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
    sb.append("    publicRecord: ").append(toIndentedString(publicRecord)).append("\n");
    sb.append("    riskModel: ").append(toIndentedString(riskModel)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
    sb.append("    tradeline: ").append(toIndentedString(tradeline)).append("\n");
    sb.append("    uniqueConsumerIdentifier: ").append(toIndentedString(uniqueConsumerIdentifier)).append("\n");
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
