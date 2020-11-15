package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.AddressInformationResp;
import com.b4nkd.creditscore.experian.model.ClarityAttributesDaas;
import com.b4nkd.creditscore.experian.model.ConnectCheck;
import com.b4nkd.creditscore.experian.model.ConnectCheckGen3InquiryData;
import com.b4nkd.creditscore.experian.model.ConnectCheckGen3TradeLine;
import com.b4nkd.creditscore.experian.model.ConsumerAssistanceReferralAddress;
import com.b4nkd.creditscore.experian.model.ConsumerIdentity;
import com.b4nkd.creditscore.experian.model.CustomAttributes;
import com.b4nkd.creditscore.experian.model.DirectCheck;
import com.b4nkd.creditscore.experian.model.EmploymentInformation;
import com.b4nkd.creditscore.experian.model.EndTotals;
import com.b4nkd.creditscore.experian.model.ExtendedView;
import com.b4nkd.creditscore.experian.model.FraudShield;
import com.b4nkd.creditscore.experian.model.HeaderRecord;
import com.b4nkd.creditscore.experian.model.InformationalMessagefordaas;
import com.b4nkd.creditscore.experian.model.Inquiry;
import com.b4nkd.creditscore.experian.model.MlaResp;
import com.b4nkd.creditscore.experian.model.ModelAttributes;
import com.b4nkd.creditscore.experian.model.OfacResp;
import com.b4nkd.creditscore.experian.model.PremierAttribute;
import com.b4nkd.creditscore.experian.model.PublicRecord;
import com.b4nkd.creditscore.experian.model.RiskModel;
import com.b4nkd.creditscore.experian.model.Ssn;
import com.b4nkd.creditscore.experian.model.Statement;
import com.b4nkd.creditscore.experian.model.Summaries;
import com.b4nkd.creditscore.experian.model.Tradeline;
import com.b4nkd.creditscore.experian.model.TrendView;
import com.b4nkd.creditscore.experian.model.TrendedAttribute;
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
 * CreditProfileRespFordaasData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class CreditProfileRespFordaasData   {
  @JsonProperty("headerRecord")
  private HeaderRecord headerRecord = null;

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
  private InformationalMessagefordaas informationalMessage = null;

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
  private Tradeline tradeline = null;

  @JsonProperty("uniqueConsumerIdentifier")
  private UniqueConsumerIdentifier uniqueConsumerIdentifier = null;

  @JsonProperty("extendedViewAttributes")
  private ExtendedView extendedViewAttributes = null;

  @JsonProperty("premierAttributes")
  private PremierAttribute premierAttributes = null;

  @JsonProperty("trendedAttributes")
  private TrendedAttribute trendedAttributes = null;

  @JsonProperty("trendView")
  private TrendView trendView = null;

  @JsonProperty("staggAttributes")
  private ModelAttributes staggAttributes = null;

  @JsonProperty("modelAttributes")
  private ModelAttributes modelAttributes = null;

  @JsonProperty("customAttributes")
  private CustomAttributes customAttributes = null;

  @JsonProperty("connectCheck")
  private ConnectCheck connectCheck = null;

  @JsonProperty("connectCheckGen3InquiryData")
  private ConnectCheckGen3InquiryData connectCheckGen3InquiryData = null;

  @JsonProperty("connectCheckGen3TradeLine")
  private ConnectCheckGen3TradeLine connectCheckGen3TradeLine = null;

  @JsonProperty("clarityAttributes")
  private ClarityAttributesDaas clarityAttributes = null;

  @JsonProperty("endTotals")
  private EndTotals endTotals = null;

  public CreditProfileRespFordaasData headerRecord(HeaderRecord headerRecord) {
    this.headerRecord = headerRecord;
    return this;
  }

  /**
   * Get headerRecord
   * @return headerRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public HeaderRecord getHeaderRecord() {
    return headerRecord;
  }

  public void setHeaderRecord(HeaderRecord headerRecord) {
    this.headerRecord = headerRecord;
  }

  public CreditProfileRespFordaasData addressInformation(List<AddressInformationResp> addressInformation) {
    this.addressInformation = addressInformation;
    return this;
  }

  public CreditProfileRespFordaasData addAddressInformationItem(AddressInformationResp addressInformationItem) {
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

  public CreditProfileRespFordaasData consumerAssistanceReferralAddress(ConsumerAssistanceReferralAddress consumerAssistanceReferralAddress) {
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

  public CreditProfileRespFordaasData consumerIdentity(ConsumerIdentity consumerIdentity) {
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

  public CreditProfileRespFordaasData directCheck(DirectCheck directCheck) {
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

  public CreditProfileRespFordaasData employmentInformation(EmploymentInformation employmentInformation) {
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

  public CreditProfileRespFordaasData fraudShield(FraudShield fraudShield) {
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

  public CreditProfileRespFordaasData informationalMessage(InformationalMessagefordaas informationalMessage) {
    this.informationalMessage = informationalMessage;
    return this;
  }

  /**
   * Get informationalMessage
   * @return informationalMessage
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public InformationalMessagefordaas getInformationalMessage() {
    return informationalMessage;
  }

  public void setInformationalMessage(InformationalMessagefordaas informationalMessage) {
    this.informationalMessage = informationalMessage;
  }

  public CreditProfileRespFordaasData inquiry(Inquiry inquiry) {
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

  public CreditProfileRespFordaasData mla(MlaResp mla) {
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

  public CreditProfileRespFordaasData ofac(OfacResp ofac) {
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

  public CreditProfileRespFordaasData summaries(Summaries summaries) {
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

  public CreditProfileRespFordaasData publicRecord(PublicRecord publicRecord) {
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

  public CreditProfileRespFordaasData riskModel(RiskModel riskModel) {
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

  public CreditProfileRespFordaasData ssn(Ssn ssn) {
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

  public CreditProfileRespFordaasData statement(Statement statement) {
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

  public CreditProfileRespFordaasData tradeline(Tradeline tradeline) {
    this.tradeline = tradeline;
    return this;
  }

  /**
   * Get tradeline
   * @return tradeline
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Tradeline getTradeline() {
    return tradeline;
  }

  public void setTradeline(Tradeline tradeline) {
    this.tradeline = tradeline;
  }

  public CreditProfileRespFordaasData uniqueConsumerIdentifier(UniqueConsumerIdentifier uniqueConsumerIdentifier) {
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

  public CreditProfileRespFordaasData extendedViewAttributes(ExtendedView extendedViewAttributes) {
    this.extendedViewAttributes = extendedViewAttributes;
    return this;
  }

  /**
   * Get extendedViewAttributes
   * @return extendedViewAttributes
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ExtendedView getExtendedViewAttributes() {
    return extendedViewAttributes;
  }

  public void setExtendedViewAttributes(ExtendedView extendedViewAttributes) {
    this.extendedViewAttributes = extendedViewAttributes;
  }

  public CreditProfileRespFordaasData premierAttributes(PremierAttribute premierAttributes) {
    this.premierAttributes = premierAttributes;
    return this;
  }

  /**
   * Get premierAttributes
   * @return premierAttributes
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public PremierAttribute getPremierAttributes() {
    return premierAttributes;
  }

  public void setPremierAttributes(PremierAttribute premierAttributes) {
    this.premierAttributes = premierAttributes;
  }

  public CreditProfileRespFordaasData trendedAttributes(TrendedAttribute trendedAttributes) {
    this.trendedAttributes = trendedAttributes;
    return this;
  }

  /**
   * Get trendedAttributes
   * @return trendedAttributes
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TrendedAttribute getTrendedAttributes() {
    return trendedAttributes;
  }

  public void setTrendedAttributes(TrendedAttribute trendedAttributes) {
    this.trendedAttributes = trendedAttributes;
  }

  public CreditProfileRespFordaasData trendView(TrendView trendView) {
    this.trendView = trendView;
    return this;
  }

  /**
   * Get trendView
   * @return trendView
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TrendView getTrendView() {
    return trendView;
  }

  public void setTrendView(TrendView trendView) {
    this.trendView = trendView;
  }

  public CreditProfileRespFordaasData staggAttributes(ModelAttributes staggAttributes) {
    this.staggAttributes = staggAttributes;
    return this;
  }

  /**
   * Get staggAttributes
   * @return staggAttributes
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ModelAttributes getStaggAttributes() {
    return staggAttributes;
  }

  public void setStaggAttributes(ModelAttributes staggAttributes) {
    this.staggAttributes = staggAttributes;
  }

  public CreditProfileRespFordaasData modelAttributes(ModelAttributes modelAttributes) {
    this.modelAttributes = modelAttributes;
    return this;
  }

  /**
   * Get modelAttributes
   * @return modelAttributes
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ModelAttributes getModelAttributes() {
    return modelAttributes;
  }

  public void setModelAttributes(ModelAttributes modelAttributes) {
    this.modelAttributes = modelAttributes;
  }

  public CreditProfileRespFordaasData customAttributes(CustomAttributes customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

  /**
   * Get customAttributes
   * @return customAttributes
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomAttributes getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(CustomAttributes customAttributes) {
    this.customAttributes = customAttributes;
  }

  public CreditProfileRespFordaasData connectCheck(ConnectCheck connectCheck) {
    this.connectCheck = connectCheck;
    return this;
  }

  /**
   * Get connectCheck
   * @return connectCheck
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConnectCheck getConnectCheck() {
    return connectCheck;
  }

  public void setConnectCheck(ConnectCheck connectCheck) {
    this.connectCheck = connectCheck;
  }

  public CreditProfileRespFordaasData connectCheckGen3InquiryData(ConnectCheckGen3InquiryData connectCheckGen3InquiryData) {
    this.connectCheckGen3InquiryData = connectCheckGen3InquiryData;
    return this;
  }

  /**
   * Get connectCheckGen3InquiryData
   * @return connectCheckGen3InquiryData
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConnectCheckGen3InquiryData getConnectCheckGen3InquiryData() {
    return connectCheckGen3InquiryData;
  }

  public void setConnectCheckGen3InquiryData(ConnectCheckGen3InquiryData connectCheckGen3InquiryData) {
    this.connectCheckGen3InquiryData = connectCheckGen3InquiryData;
  }

  public CreditProfileRespFordaasData connectCheckGen3TradeLine(ConnectCheckGen3TradeLine connectCheckGen3TradeLine) {
    this.connectCheckGen3TradeLine = connectCheckGen3TradeLine;
    return this;
  }

  /**
   * Get connectCheckGen3TradeLine
   * @return connectCheckGen3TradeLine
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConnectCheckGen3TradeLine getConnectCheckGen3TradeLine() {
    return connectCheckGen3TradeLine;
  }

  public void setConnectCheckGen3TradeLine(ConnectCheckGen3TradeLine connectCheckGen3TradeLine) {
    this.connectCheckGen3TradeLine = connectCheckGen3TradeLine;
  }

  public CreditProfileRespFordaasData clarityAttributes(ClarityAttributesDaas clarityAttributes) {
    this.clarityAttributes = clarityAttributes;
    return this;
  }

  /**
   * Get clarityAttributes
   * @return clarityAttributes
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ClarityAttributesDaas getClarityAttributes() {
    return clarityAttributes;
  }

  public void setClarityAttributes(ClarityAttributesDaas clarityAttributes) {
    this.clarityAttributes = clarityAttributes;
  }

  public CreditProfileRespFordaasData endTotals(EndTotals endTotals) {
    this.endTotals = endTotals;
    return this;
  }

  /**
   * Get endTotals
   * @return endTotals
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public EndTotals getEndTotals() {
    return endTotals;
  }

  public void setEndTotals(EndTotals endTotals) {
    this.endTotals = endTotals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditProfileRespFordaasData creditProfileRespFordaasData = (CreditProfileRespFordaasData) o;
    return Objects.equals(this.headerRecord, creditProfileRespFordaasData.headerRecord) &&
        Objects.equals(this.addressInformation, creditProfileRespFordaasData.addressInformation) &&
        Objects.equals(this.consumerAssistanceReferralAddress, creditProfileRespFordaasData.consumerAssistanceReferralAddress) &&
        Objects.equals(this.consumerIdentity, creditProfileRespFordaasData.consumerIdentity) &&
        Objects.equals(this.directCheck, creditProfileRespFordaasData.directCheck) &&
        Objects.equals(this.employmentInformation, creditProfileRespFordaasData.employmentInformation) &&
        Objects.equals(this.fraudShield, creditProfileRespFordaasData.fraudShield) &&
        Objects.equals(this.informationalMessage, creditProfileRespFordaasData.informationalMessage) &&
        Objects.equals(this.inquiry, creditProfileRespFordaasData.inquiry) &&
        Objects.equals(this.mla, creditProfileRespFordaasData.mla) &&
        Objects.equals(this.ofac, creditProfileRespFordaasData.ofac) &&
        Objects.equals(this.summaries, creditProfileRespFordaasData.summaries) &&
        Objects.equals(this.publicRecord, creditProfileRespFordaasData.publicRecord) &&
        Objects.equals(this.riskModel, creditProfileRespFordaasData.riskModel) &&
        Objects.equals(this.ssn, creditProfileRespFordaasData.ssn) &&
        Objects.equals(this.statement, creditProfileRespFordaasData.statement) &&
        Objects.equals(this.tradeline, creditProfileRespFordaasData.tradeline) &&
        Objects.equals(this.uniqueConsumerIdentifier, creditProfileRespFordaasData.uniqueConsumerIdentifier) &&
        Objects.equals(this.extendedViewAttributes, creditProfileRespFordaasData.extendedViewAttributes) &&
        Objects.equals(this.premierAttributes, creditProfileRespFordaasData.premierAttributes) &&
        Objects.equals(this.trendedAttributes, creditProfileRespFordaasData.trendedAttributes) &&
        Objects.equals(this.trendView, creditProfileRespFordaasData.trendView) &&
        Objects.equals(this.staggAttributes, creditProfileRespFordaasData.staggAttributes) &&
        Objects.equals(this.modelAttributes, creditProfileRespFordaasData.modelAttributes) &&
        Objects.equals(this.customAttributes, creditProfileRespFordaasData.customAttributes) &&
        Objects.equals(this.connectCheck, creditProfileRespFordaasData.connectCheck) &&
        Objects.equals(this.connectCheckGen3InquiryData, creditProfileRespFordaasData.connectCheckGen3InquiryData) &&
        Objects.equals(this.connectCheckGen3TradeLine, creditProfileRespFordaasData.connectCheckGen3TradeLine) &&
        Objects.equals(this.clarityAttributes, creditProfileRespFordaasData.clarityAttributes) &&
        Objects.equals(this.endTotals, creditProfileRespFordaasData.endTotals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerRecord, addressInformation, consumerAssistanceReferralAddress, consumerIdentity, directCheck, employmentInformation, fraudShield, informationalMessage, inquiry, mla, ofac, summaries, publicRecord, riskModel, ssn, statement, tradeline, uniqueConsumerIdentifier, extendedViewAttributes, premierAttributes, trendedAttributes, trendView, staggAttributes, modelAttributes, customAttributes, connectCheck, connectCheckGen3InquiryData, connectCheckGen3TradeLine, clarityAttributes, endTotals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditProfileRespFordaasData {\n");
    
    sb.append("    headerRecord: ").append(toIndentedString(headerRecord)).append("\n");
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
    sb.append("    extendedViewAttributes: ").append(toIndentedString(extendedViewAttributes)).append("\n");
    sb.append("    premierAttributes: ").append(toIndentedString(premierAttributes)).append("\n");
    sb.append("    trendedAttributes: ").append(toIndentedString(trendedAttributes)).append("\n");
    sb.append("    trendView: ").append(toIndentedString(trendView)).append("\n");
    sb.append("    staggAttributes: ").append(toIndentedString(staggAttributes)).append("\n");
    sb.append("    modelAttributes: ").append(toIndentedString(modelAttributes)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    connectCheck: ").append(toIndentedString(connectCheck)).append("\n");
    sb.append("    connectCheckGen3InquiryData: ").append(toIndentedString(connectCheckGen3InquiryData)).append("\n");
    sb.append("    connectCheckGen3TradeLine: ").append(toIndentedString(connectCheckGen3TradeLine)).append("\n");
    sb.append("    clarityAttributes: ").append(toIndentedString(clarityAttributes)).append("\n");
    sb.append("    endTotals: ").append(toIndentedString(endTotals)).append("\n");
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
