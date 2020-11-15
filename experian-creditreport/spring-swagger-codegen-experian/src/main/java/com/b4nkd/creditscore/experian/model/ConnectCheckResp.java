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
 * ConnectCheckResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class ConnectCheckResp   {
  @JsonProperty("inputType")
  private String inputType = "S";

  @JsonProperty("iDMatchCondition")
  private String iDMatchCondition = "B";

  @JsonProperty("creditClassCode")
  private String creditClassCode = null;

  @JsonProperty("highRiskAddressAlert")
  private String highRiskAddressAlert = " ";

  @JsonProperty("addlNameAddrMatchConditionC")
  private String addlNameAddrMatchConditionC = " ";

  @JsonProperty("addlNameAddrMatchConditionD")
  private String addlNameAddrMatchConditionD = " ";

  @JsonProperty("addlNameAddrMatchConditionE")
  private String addlNameAddrMatchConditionE = " ";

  @JsonProperty("score")
  private String score = "X";

  @JsonProperty("fullCreditReportDesc")
  private String fullCreditReportDesc = " ";

  @JsonProperty("publicRecordAlertBankruptcy")
  private String publicRecordAlertBankruptcy = " ";

  @JsonProperty("publicRecordAlertJudgment")
  private String publicRecordAlertJudgment = " ";

  @JsonProperty("publicRecordAlertTaxLien")
  private String publicRecordAlertTaxLien = " ";

  @JsonProperty("publicRecordAlertBankruptcyDismissed")
  private String publicRecordAlertBankruptcyDismissed = " ";

  @JsonProperty("publicRecordAlertJudgmentSatisfied")
  private String publicRecordAlertJudgmentSatisfied = " ";

  @JsonProperty("publicRecordAlertTaxLienReleased")
  private String publicRecordAlertTaxLienReleased = " ";

  @JsonProperty("lengthOriginalInputName")
  private String lengthOriginalInputName = " ";

  @JsonProperty("originalInputNameText")
  private String originalInputNameText = " ";

  @JsonProperty("lengthofSalesMessage")
  private String lengthofSalesMessage = " ";

  @JsonProperty("customerSalesMessage")
  private String customerSalesMessage = " ";

  public ConnectCheckResp inputType(String inputType) {
    this.inputType = inputType;
    return this;
  }

  /**
   * Inquiry data elements.
   * @return inputType
  **/
  @ApiModelProperty(value = "Inquiry data elements.")
  
    public String getInputType() {
    return inputType;
  }

  public void setInputType(String inputType) {
    this.inputType = inputType;
  }

  public ConnectCheckResp iDMatchCondition(String iDMatchCondition) {
    this.iDMatchCondition = iDMatchCondition;
    return this;
  }

  /**
   * ID Verification Result Code.
   * @return iDMatchCondition
  **/
  @ApiModelProperty(value = "ID Verification Result Code.")
  
    public String getIDMatchCondition() {
    return iDMatchCondition;
  }

  public void setIDMatchCondition(String iDMatchCondition) {
    this.iDMatchCondition = iDMatchCondition;
  }

  public ConnectCheckResp creditClassCode(String creditClassCode) {
    this.creditClassCode = creditClassCode;
    return this;
  }

  /**
   * Credit Classification as specified by customer.
   * @return creditClassCode
  **/
  @ApiModelProperty(value = "Credit Classification as specified by customer.")
  
    public String getCreditClassCode() {
    return creditClassCode;
  }

  public void setCreditClassCode(String creditClassCode) {
    this.creditClassCode = creditClassCode;
  }

  public ConnectCheckResp highRiskAddressAlert(String highRiskAddressAlert) {
    this.highRiskAddressAlert = highRiskAddressAlert;
    return this;
  }

  /**
   * Present Option Indicator.
   * @return highRiskAddressAlert
  **/
  @ApiModelProperty(value = "Present Option Indicator.")
  
    public String getHighRiskAddressAlert() {
    return highRiskAddressAlert;
  }

  public void setHighRiskAddressAlert(String highRiskAddressAlert) {
    this.highRiskAddressAlert = highRiskAddressAlert;
  }

  public ConnectCheckResp addlNameAddrMatchConditionC(String addlNameAddrMatchConditionC) {
    this.addlNameAddrMatchConditionC = addlNameAddrMatchConditionC;
    return this;
  }

  /**
   * Preset Option Indicator. Requested for additional names and addresses associated with input SSN.
   * @return addlNameAddrMatchConditionC
  **/
  @ApiModelProperty(value = "Preset Option Indicator. Requested for additional names and addresses associated with input SSN.")
  
    public String getAddlNameAddrMatchConditionC() {
    return addlNameAddrMatchConditionC;
  }

  public void setAddlNameAddrMatchConditionC(String addlNameAddrMatchConditionC) {
    this.addlNameAddrMatchConditionC = addlNameAddrMatchConditionC;
  }

  public ConnectCheckResp addlNameAddrMatchConditionD(String addlNameAddrMatchConditionD) {
    this.addlNameAddrMatchConditionD = addlNameAddrMatchConditionD;
    return this;
  }

  /**
   * Preset Option Indicator. Requested for additional names and addresses associated with input SSN.
   * @return addlNameAddrMatchConditionD
  **/
  @ApiModelProperty(value = "Preset Option Indicator. Requested for additional names and addresses associated with input SSN.")
  
    public String getAddlNameAddrMatchConditionD() {
    return addlNameAddrMatchConditionD;
  }

  public void setAddlNameAddrMatchConditionD(String addlNameAddrMatchConditionD) {
    this.addlNameAddrMatchConditionD = addlNameAddrMatchConditionD;
  }

  public ConnectCheckResp addlNameAddrMatchConditionE(String addlNameAddrMatchConditionE) {
    this.addlNameAddrMatchConditionE = addlNameAddrMatchConditionE;
    return this;
  }

  /**
   * Preset Option Indicator. Requested for additional names and addresses associated with input SSN.
   * @return addlNameAddrMatchConditionE
  **/
  @ApiModelProperty(value = "Preset Option Indicator. Requested for additional names and addresses associated with input SSN.")
  
    public String getAddlNameAddrMatchConditionE() {
    return addlNameAddrMatchConditionE;
  }

  public void setAddlNameAddrMatchConditionE(String addlNameAddrMatchConditionE) {
    this.addlNameAddrMatchConditionE = addlNameAddrMatchConditionE;
  }

  public ConnectCheckResp score(String score) {
    this.score = score;
    return this;
  }

  /**
   * Score.
   * @return score
  **/
  @ApiModelProperty(value = "Score.")
  
    public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public ConnectCheckResp fullCreditReportDesc(String fullCreditReportDesc) {
    this.fullCreditReportDesc = fullCreditReportDesc;
    return this;
  }

  /**
   * Full Credit Report Description.
   * @return fullCreditReportDesc
  **/
  @ApiModelProperty(value = "Full Credit Report Description.")
  
    public String getFullCreditReportDesc() {
    return fullCreditReportDesc;
  }

  public void setFullCreditReportDesc(String fullCreditReportDesc) {
    this.fullCreditReportDesc = fullCreditReportDesc;
  }

  public ConnectCheckResp publicRecordAlertBankruptcy(String publicRecordAlertBankruptcy) {
    this.publicRecordAlertBankruptcy = publicRecordAlertBankruptcy;
    return this;
  }

  /**
   * Public Record Alert  Bankruptcy.
   * @return publicRecordAlertBankruptcy
  **/
  @ApiModelProperty(value = "Public Record Alert  Bankruptcy.")
  
    public String getPublicRecordAlertBankruptcy() {
    return publicRecordAlertBankruptcy;
  }

  public void setPublicRecordAlertBankruptcy(String publicRecordAlertBankruptcy) {
    this.publicRecordAlertBankruptcy = publicRecordAlertBankruptcy;
  }

  public ConnectCheckResp publicRecordAlertJudgment(String publicRecordAlertJudgment) {
    this.publicRecordAlertJudgment = publicRecordAlertJudgment;
    return this;
  }

  /**
   * Public Record Alert  Judgment.
   * @return publicRecordAlertJudgment
  **/
  @ApiModelProperty(value = "Public Record Alert  Judgment.")
  
    public String getPublicRecordAlertJudgment() {
    return publicRecordAlertJudgment;
  }

  public void setPublicRecordAlertJudgment(String publicRecordAlertJudgment) {
    this.publicRecordAlertJudgment = publicRecordAlertJudgment;
  }

  public ConnectCheckResp publicRecordAlertTaxLien(String publicRecordAlertTaxLien) {
    this.publicRecordAlertTaxLien = publicRecordAlertTaxLien;
    return this;
  }

  /**
   * Public Record Alert - Tax Lien.
   * @return publicRecordAlertTaxLien
  **/
  @ApiModelProperty(value = "Public Record Alert - Tax Lien.")
  
    public String getPublicRecordAlertTaxLien() {
    return publicRecordAlertTaxLien;
  }

  public void setPublicRecordAlertTaxLien(String publicRecordAlertTaxLien) {
    this.publicRecordAlertTaxLien = publicRecordAlertTaxLien;
  }

  public ConnectCheckResp publicRecordAlertBankruptcyDismissed(String publicRecordAlertBankruptcyDismissed) {
    this.publicRecordAlertBankruptcyDismissed = publicRecordAlertBankruptcyDismissed;
    return this;
  }

  /**
   * Public Record Alert  Bankruptcy (dismissed or discharged).
   * @return publicRecordAlertBankruptcyDismissed
  **/
  @ApiModelProperty(value = "Public Record Alert  Bankruptcy (dismissed or discharged).")
  
    public String getPublicRecordAlertBankruptcyDismissed() {
    return publicRecordAlertBankruptcyDismissed;
  }

  public void setPublicRecordAlertBankruptcyDismissed(String publicRecordAlertBankruptcyDismissed) {
    this.publicRecordAlertBankruptcyDismissed = publicRecordAlertBankruptcyDismissed;
  }

  public ConnectCheckResp publicRecordAlertJudgmentSatisfied(String publicRecordAlertJudgmentSatisfied) {
    this.publicRecordAlertJudgmentSatisfied = publicRecordAlertJudgmentSatisfied;
    return this;
  }

  /**
   * Public Record Alert  Judgment (satisfied or vacated).
   * @return publicRecordAlertJudgmentSatisfied
  **/
  @ApiModelProperty(value = "Public Record Alert  Judgment (satisfied or vacated).")
  
    public String getPublicRecordAlertJudgmentSatisfied() {
    return publicRecordAlertJudgmentSatisfied;
  }

  public void setPublicRecordAlertJudgmentSatisfied(String publicRecordAlertJudgmentSatisfied) {
    this.publicRecordAlertJudgmentSatisfied = publicRecordAlertJudgmentSatisfied;
  }

  public ConnectCheckResp publicRecordAlertTaxLienReleased(String publicRecordAlertTaxLienReleased) {
    this.publicRecordAlertTaxLienReleased = publicRecordAlertTaxLienReleased;
    return this;
  }

  /**
   * Public Record Alert  Tax Lien (released).
   * @return publicRecordAlertTaxLienReleased
  **/
  @ApiModelProperty(value = "Public Record Alert  Tax Lien (released).")
  
    public String getPublicRecordAlertTaxLienReleased() {
    return publicRecordAlertTaxLienReleased;
  }

  public void setPublicRecordAlertTaxLienReleased(String publicRecordAlertTaxLienReleased) {
    this.publicRecordAlertTaxLienReleased = publicRecordAlertTaxLienReleased;
  }

  public ConnectCheckResp lengthOriginalInputName(String lengthOriginalInputName) {
    this.lengthOriginalInputName = lengthOriginalInputName;
    return this;
  }

  /**
   * Length of Original Input Name.
   * @return lengthOriginalInputName
  **/
  @ApiModelProperty(value = "Length of Original Input Name.")
  
    public String getLengthOriginalInputName() {
    return lengthOriginalInputName;
  }

  public void setLengthOriginalInputName(String lengthOriginalInputName) {
    this.lengthOriginalInputName = lengthOriginalInputName;
  }

  public ConnectCheckResp originalInputNameText(String originalInputNameText) {
    this.originalInputNameText = originalInputNameText;
    return this;
  }

  /**
   * Original Input Name Text.
   * @return originalInputNameText
  **/
  @ApiModelProperty(value = "Original Input Name Text.")
  
    public String getOriginalInputNameText() {
    return originalInputNameText;
  }

  public void setOriginalInputNameText(String originalInputNameText) {
    this.originalInputNameText = originalInputNameText;
  }

  public ConnectCheckResp lengthofSalesMessage(String lengthofSalesMessage) {
    this.lengthofSalesMessage = lengthofSalesMessage;
    return this;
  }

  /**
   * Original Input Name Text.
   * @return lengthofSalesMessage
  **/
  @ApiModelProperty(value = "Original Input Name Text.")
  
    public String getLengthofSalesMessage() {
    return lengthofSalesMessage;
  }

  public void setLengthofSalesMessage(String lengthofSalesMessage) {
    this.lengthofSalesMessage = lengthofSalesMessage;
  }

  public ConnectCheckResp customerSalesMessage(String customerSalesMessage) {
    this.customerSalesMessage = customerSalesMessage;
    return this;
  }

  /**
   * Customer/Sales Message.
   * @return customerSalesMessage
  **/
  @ApiModelProperty(value = "Customer/Sales Message.")
  
    public String getCustomerSalesMessage() {
    return customerSalesMessage;
  }

  public void setCustomerSalesMessage(String customerSalesMessage) {
    this.customerSalesMessage = customerSalesMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectCheckResp connectCheckResp = (ConnectCheckResp) o;
    return Objects.equals(this.inputType, connectCheckResp.inputType) &&
        Objects.equals(this.iDMatchCondition, connectCheckResp.iDMatchCondition) &&
        Objects.equals(this.creditClassCode, connectCheckResp.creditClassCode) &&
        Objects.equals(this.highRiskAddressAlert, connectCheckResp.highRiskAddressAlert) &&
        Objects.equals(this.addlNameAddrMatchConditionC, connectCheckResp.addlNameAddrMatchConditionC) &&
        Objects.equals(this.addlNameAddrMatchConditionD, connectCheckResp.addlNameAddrMatchConditionD) &&
        Objects.equals(this.addlNameAddrMatchConditionE, connectCheckResp.addlNameAddrMatchConditionE) &&
        Objects.equals(this.score, connectCheckResp.score) &&
        Objects.equals(this.fullCreditReportDesc, connectCheckResp.fullCreditReportDesc) &&
        Objects.equals(this.publicRecordAlertBankruptcy, connectCheckResp.publicRecordAlertBankruptcy) &&
        Objects.equals(this.publicRecordAlertJudgment, connectCheckResp.publicRecordAlertJudgment) &&
        Objects.equals(this.publicRecordAlertTaxLien, connectCheckResp.publicRecordAlertTaxLien) &&
        Objects.equals(this.publicRecordAlertBankruptcyDismissed, connectCheckResp.publicRecordAlertBankruptcyDismissed) &&
        Objects.equals(this.publicRecordAlertJudgmentSatisfied, connectCheckResp.publicRecordAlertJudgmentSatisfied) &&
        Objects.equals(this.publicRecordAlertTaxLienReleased, connectCheckResp.publicRecordAlertTaxLienReleased) &&
        Objects.equals(this.lengthOriginalInputName, connectCheckResp.lengthOriginalInputName) &&
        Objects.equals(this.originalInputNameText, connectCheckResp.originalInputNameText) &&
        Objects.equals(this.lengthofSalesMessage, connectCheckResp.lengthofSalesMessage) &&
        Objects.equals(this.customerSalesMessage, connectCheckResp.customerSalesMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputType, iDMatchCondition, creditClassCode, highRiskAddressAlert, addlNameAddrMatchConditionC, addlNameAddrMatchConditionD, addlNameAddrMatchConditionE, score, fullCreditReportDesc, publicRecordAlertBankruptcy, publicRecordAlertJudgment, publicRecordAlertTaxLien, publicRecordAlertBankruptcyDismissed, publicRecordAlertJudgmentSatisfied, publicRecordAlertTaxLienReleased, lengthOriginalInputName, originalInputNameText, lengthofSalesMessage, customerSalesMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectCheckResp {\n");
    
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
    sb.append("    iDMatchCondition: ").append(toIndentedString(iDMatchCondition)).append("\n");
    sb.append("    creditClassCode: ").append(toIndentedString(creditClassCode)).append("\n");
    sb.append("    highRiskAddressAlert: ").append(toIndentedString(highRiskAddressAlert)).append("\n");
    sb.append("    addlNameAddrMatchConditionC: ").append(toIndentedString(addlNameAddrMatchConditionC)).append("\n");
    sb.append("    addlNameAddrMatchConditionD: ").append(toIndentedString(addlNameAddrMatchConditionD)).append("\n");
    sb.append("    addlNameAddrMatchConditionE: ").append(toIndentedString(addlNameAddrMatchConditionE)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    fullCreditReportDesc: ").append(toIndentedString(fullCreditReportDesc)).append("\n");
    sb.append("    publicRecordAlertBankruptcy: ").append(toIndentedString(publicRecordAlertBankruptcy)).append("\n");
    sb.append("    publicRecordAlertJudgment: ").append(toIndentedString(publicRecordAlertJudgment)).append("\n");
    sb.append("    publicRecordAlertTaxLien: ").append(toIndentedString(publicRecordAlertTaxLien)).append("\n");
    sb.append("    publicRecordAlertBankruptcyDismissed: ").append(toIndentedString(publicRecordAlertBankruptcyDismissed)).append("\n");
    sb.append("    publicRecordAlertJudgmentSatisfied: ").append(toIndentedString(publicRecordAlertJudgmentSatisfied)).append("\n");
    sb.append("    publicRecordAlertTaxLienReleased: ").append(toIndentedString(publicRecordAlertTaxLienReleased)).append("\n");
    sb.append("    lengthOriginalInputName: ").append(toIndentedString(lengthOriginalInputName)).append("\n");
    sb.append("    originalInputNameText: ").append(toIndentedString(originalInputNameText)).append("\n");
    sb.append("    lengthofSalesMessage: ").append(toIndentedString(lengthofSalesMessage)).append("\n");
    sb.append("    customerSalesMessage: ").append(toIndentedString(customerSalesMessage)).append("\n");
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
