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
 * ConnectCheckGen3TradeLineResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class ConnectCheckGen3TradeLineResp   {
  @JsonProperty("subCode")
  private String subCode = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("accountTypeCode")
  private String accountTypeCode = null;

  @JsonProperty("specialComment")
  private String specialComment = null;

  @JsonProperty("balanceAmount")
  private String balanceAmount = null;

  @JsonProperty("balanceDate")
  private String balanceDate = null;

  @JsonProperty("accountNumberLen")
  private String accountNumberLen = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  public ConnectCheckGen3TradeLineResp subCode(String subCode) {
    this.subCode = subCode;
    return this;
  }

  /**
   * Trade Subscriber Code.
   * @return subCode
  **/
  @ApiModelProperty(value = "Trade Subscriber Code.")
  
    public String getSubCode() {
    return subCode;
  }

  public void setSubCode(String subCode) {
    this.subCode = subCode;
  }

  public ConnectCheckGen3TradeLineResp statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Trade Status Code.
   * @return statusCode
  **/
  @ApiModelProperty(value = "Trade Status Code.")
  
    public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public ConnectCheckGen3TradeLineResp accountTypeCode(String accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
    return this;
  }

  /**
   * Trade Type.
   * @return accountTypeCode
  **/
  @ApiModelProperty(value = "Trade Type.")
  
    public String getAccountTypeCode() {
    return accountTypeCode;
  }

  public void setAccountTypeCode(String accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
  }

  public ConnectCheckGen3TradeLineResp specialComment(String specialComment) {
    this.specialComment = specialComment;
    return this;
  }

  /**
   * Trade Special Comment.
   * @return specialComment
  **/
  @ApiModelProperty(value = "Trade Special Comment.")
  
    public String getSpecialComment() {
    return specialComment;
  }

  public void setSpecialComment(String specialComment) {
    this.specialComment = specialComment;
  }

  public ConnectCheckGen3TradeLineResp balanceAmount(String balanceAmount) {
    this.balanceAmount = balanceAmount;
    return this;
  }

  /**
   * Balance Amount.
   * @return balanceAmount
  **/
  @ApiModelProperty(value = "Balance Amount.")
  
    public String getBalanceAmount() {
    return balanceAmount;
  }

  public void setBalanceAmount(String balanceAmount) {
    this.balanceAmount = balanceAmount;
  }

  public ConnectCheckGen3TradeLineResp balanceDate(String balanceDate) {
    this.balanceDate = balanceDate;
    return this;
  }

  /**
   * Balance Date.
   * @return balanceDate
  **/
  @ApiModelProperty(value = "Balance Date.")
  
    public String getBalanceDate() {
    return balanceDate;
  }

  public void setBalanceDate(String balanceDate) {
    this.balanceDate = balanceDate;
  }

  public ConnectCheckGen3TradeLineResp accountNumberLen(String accountNumberLen) {
    this.accountNumberLen = accountNumberLen;
    return this;
  }

  /**
   * Trade Account Number Length.
   * @return accountNumberLen
  **/
  @ApiModelProperty(value = "Trade Account Number Length.")
  
    public String getAccountNumberLen() {
    return accountNumberLen;
  }

  public void setAccountNumberLen(String accountNumberLen) {
    this.accountNumberLen = accountNumberLen;
  }

  public ConnectCheckGen3TradeLineResp accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Trade Account Number Length.
   * @return accountNumber
  **/
  @ApiModelProperty(value = "Trade Account Number Length.")
  
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
    ConnectCheckGen3TradeLineResp connectCheckGen3TradeLineResp = (ConnectCheckGen3TradeLineResp) o;
    return Objects.equals(this.subCode, connectCheckGen3TradeLineResp.subCode) &&
        Objects.equals(this.statusCode, connectCheckGen3TradeLineResp.statusCode) &&
        Objects.equals(this.accountTypeCode, connectCheckGen3TradeLineResp.accountTypeCode) &&
        Objects.equals(this.specialComment, connectCheckGen3TradeLineResp.specialComment) &&
        Objects.equals(this.balanceAmount, connectCheckGen3TradeLineResp.balanceAmount) &&
        Objects.equals(this.balanceDate, connectCheckGen3TradeLineResp.balanceDate) &&
        Objects.equals(this.accountNumberLen, connectCheckGen3TradeLineResp.accountNumberLen) &&
        Objects.equals(this.accountNumber, connectCheckGen3TradeLineResp.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subCode, statusCode, accountTypeCode, specialComment, balanceAmount, balanceDate, accountNumberLen, accountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectCheckGen3TradeLineResp {\n");
    
    sb.append("    subCode: ").append(toIndentedString(subCode)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    accountTypeCode: ").append(toIndentedString(accountTypeCode)).append("\n");
    sb.append("    specialComment: ").append(toIndentedString(specialComment)).append("\n");
    sb.append("    balanceAmount: ").append(toIndentedString(balanceAmount)).append("\n");
    sb.append("    balanceDate: ").append(toIndentedString(balanceDate)).append("\n");
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
