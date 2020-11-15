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
 * ConnectCheckGen3InquiryDataResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class ConnectCheckGen3InquiryDataResp   {
  @JsonProperty("subCode")
  private String subCode = null;

  @JsonProperty("inquiryDate")
  private String inquiryDate = null;

  @JsonProperty("inquiryType")
  private String inquiryType = null;

  @JsonProperty("inquiryTerms")
  private String inquiryTerms = null;

  @JsonProperty("inquiryAmount")
  private String inquiryAmount = null;

  @JsonProperty("accountNumberLen")
  private String accountNumberLen = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  public ConnectCheckGen3InquiryDataResp subCode(String subCode) {
    this.subCode = subCode;
    return this;
  }

  /**
   * Inquiry Subscriber Code.
   * @return subCode
  **/
  @ApiModelProperty(value = "Inquiry Subscriber Code.")
  
    public String getSubCode() {
    return subCode;
  }

  public void setSubCode(String subCode) {
    this.subCode = subCode;
  }

  public ConnectCheckGen3InquiryDataResp inquiryDate(String inquiryDate) {
    this.inquiryDate = inquiryDate;
    return this;
  }

  /**
   * Inquiry Date.
   * @return inquiryDate
  **/
  @ApiModelProperty(value = "Inquiry Date.")
  
    public String getInquiryDate() {
    return inquiryDate;
  }

  public void setInquiryDate(String inquiryDate) {
    this.inquiryDate = inquiryDate;
  }

  public ConnectCheckGen3InquiryDataResp inquiryType(String inquiryType) {
    this.inquiryType = inquiryType;
    return this;
  }

  /**
   * Inquiry Type.
   * @return inquiryType
  **/
  @ApiModelProperty(value = "Inquiry Type.")
  
    public String getInquiryType() {
    return inquiryType;
  }

  public void setInquiryType(String inquiryType) {
    this.inquiryType = inquiryType;
  }

  public ConnectCheckGen3InquiryDataResp inquiryTerms(String inquiryTerms) {
    this.inquiryTerms = inquiryTerms;
    return this;
  }

  /**
   * Inquiry Terms.
   * @return inquiryTerms
  **/
  @ApiModelProperty(value = "Inquiry Terms.")
  
    public String getInquiryTerms() {
    return inquiryTerms;
  }

  public void setInquiryTerms(String inquiryTerms) {
    this.inquiryTerms = inquiryTerms;
  }

  public ConnectCheckGen3InquiryDataResp inquiryAmount(String inquiryAmount) {
    this.inquiryAmount = inquiryAmount;
    return this;
  }

  /**
   * Inquiry Amount.
   * @return inquiryAmount
  **/
  @ApiModelProperty(value = "Inquiry Amount.")
  
    public String getInquiryAmount() {
    return inquiryAmount;
  }

  public void setInquiryAmount(String inquiryAmount) {
    this.inquiryAmount = inquiryAmount;
  }

  public ConnectCheckGen3InquiryDataResp accountNumberLen(String accountNumberLen) {
    this.accountNumberLen = accountNumberLen;
    return this;
  }

  /**
   * Account Number Length.
   * @return accountNumberLen
  **/
  @ApiModelProperty(value = "Account Number Length.")
  
    public String getAccountNumberLen() {
    return accountNumberLen;
  }

  public void setAccountNumberLen(String accountNumberLen) {
    this.accountNumberLen = accountNumberLen;
  }

  public ConnectCheckGen3InquiryDataResp accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Account Number.
   * @return accountNumber
  **/
  @ApiModelProperty(value = "Account Number.")
  
    public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectCheckGen3InquiryDataResp connectCheckGen3InquiryDataResp = (ConnectCheckGen3InquiryDataResp) o;
    return Objects.equals(this.subCode, connectCheckGen3InquiryDataResp.subCode) &&
        Objects.equals(this.inquiryDate, connectCheckGen3InquiryDataResp.inquiryDate) &&
        Objects.equals(this.inquiryType, connectCheckGen3InquiryDataResp.inquiryType) &&
        Objects.equals(this.inquiryTerms, connectCheckGen3InquiryDataResp.inquiryTerms) &&
        Objects.equals(this.inquiryAmount, connectCheckGen3InquiryDataResp.inquiryAmount) &&
        Objects.equals(this.accountNumberLen, connectCheckGen3InquiryDataResp.accountNumberLen) &&
        Objects.equals(this.accountNumber, connectCheckGen3InquiryDataResp.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subCode, inquiryDate, inquiryType, inquiryTerms, inquiryAmount, accountNumberLen, accountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectCheckGen3InquiryDataResp {\n");
    
    sb.append("    subCode: ").append(toIndentedString(subCode)).append("\n");
    sb.append("    inquiryDate: ").append(toIndentedString(inquiryDate)).append("\n");
    sb.append("    inquiryType: ").append(toIndentedString(inquiryType)).append("\n");
    sb.append("    inquiryTerms: ").append(toIndentedString(inquiryTerms)).append("\n");
    sb.append("    inquiryAmount: ").append(toIndentedString(inquiryAmount)).append("\n");
    sb.append("    accountNumberLen: ").append(toIndentedString(accountNumberLen)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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
