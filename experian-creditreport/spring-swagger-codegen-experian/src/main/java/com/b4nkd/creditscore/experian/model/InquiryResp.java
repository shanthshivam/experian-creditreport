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
 * InquiryResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class InquiryResp   {
  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("date")
  private String date = "12051998";

  @JsonProperty("kob")
  private String kob = "DC";

  @JsonProperty("subscriberCode")
  private String subscriberCode = "0";

  @JsonProperty("subscriberName")
  private String subscriberName = "BANK";

  @JsonProperty("terms")
  private String terms = "REV";

  @JsonProperty("type")
  private String type = "31";

  public InquiryResp amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Full dollar amount.
   * @return amount
  **/
  @ApiModelProperty(value = "Full dollar amount.")
  
    public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public InquiryResp date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Date of inquiry. MMDDCCYY
   * @return date
  **/
  @ApiModelProperty(value = "Date of inquiry. MMDDCCYY")
  
    public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public InquiryResp kob(String kob) {
    this.kob = kob;
    return this;
  }

  /**
   * Kind of Business Codes.
   * @return kob
  **/
  @ApiModelProperty(value = "Kind of Business Codes.")
  
    public String getKob() {
    return kob;
  }

  public void setKob(String kob) {
    this.kob = kob;
  }

  public InquiryResp subscriberCode(String subscriberCode) {
    this.subscriberCode = subscriberCode;
    return this;
  }

  /**
   * Subscriber Code of inquiring creditor.
   * @return subscriberCode
  **/
  @ApiModelProperty(value = "Subscriber Code of inquiring creditor.")
  
    public String getSubscriberCode() {
    return subscriberCode;
  }

  public void setSubscriberCode(String subscriberCode) {
    this.subscriberCode = subscriberCode;
  }

  public InquiryResp subscriberName(String subscriberName) {
    this.subscriberName = subscriberName;
    return this;
  }

  /**
   * Subscriber Name of inquirying creditor.
   * @return subscriberName
  **/
  @ApiModelProperty(value = "Subscriber Name of inquirying creditor.")
  
    public String getSubscriberName() {
    return subscriberName;
  }

  public void setSubscriberName(String subscriberName) {
    this.subscriberName = subscriberName;
  }

  public InquiryResp terms(String terms) {
    this.terms = terms;
    return this;
  }

  /**
   * Terms Reported.
   * @return terms
  **/
  @ApiModelProperty(value = "Terms Reported.")
  
    public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  public InquiryResp type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Permissible Purpose Reason for the inquiry. 
   * @return type
  **/
  @ApiModelProperty(value = "Permissible Purpose Reason for the inquiry. ")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InquiryResp inquiryResp = (InquiryResp) o;
    return Objects.equals(this.amount, inquiryResp.amount) &&
        Objects.equals(this.date, inquiryResp.date) &&
        Objects.equals(this.kob, inquiryResp.kob) &&
        Objects.equals(this.subscriberCode, inquiryResp.subscriberCode) &&
        Objects.equals(this.subscriberName, inquiryResp.subscriberName) &&
        Objects.equals(this.terms, inquiryResp.terms) &&
        Objects.equals(this.type, inquiryResp.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, date, kob, subscriberCode, subscriberName, terms, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InquiryResp {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    kob: ").append(toIndentedString(kob)).append("\n");
    sb.append("    subscriberCode: ").append(toIndentedString(subscriberCode)).append("\n");
    sb.append("    subscriberName: ").append(toIndentedString(subscriberName)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
