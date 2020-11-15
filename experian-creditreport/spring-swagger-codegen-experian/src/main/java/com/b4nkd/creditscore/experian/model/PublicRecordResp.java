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
 * PublicRecordResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class PublicRecordResp   {
  @JsonProperty("adjustmentPercent")
  private String adjustmentPercent = null;

  @JsonProperty("amount")
  private String amount = "0";

  @JsonProperty("bankruptcyAssetAmount")
  private String bankruptcyAssetAmount = "0";

  @JsonProperty("bankruptcyVoluntaryIndicator")
  private String bankruptcyVoluntaryIndicator = null;

  @JsonProperty("bookPageSequence")
  private String bookPageSequence = null;

  @JsonProperty("consumerComment")
  private String consumerComment = null;

  @JsonProperty("courtCode")
  private String courtCode = "0";

  @JsonProperty("courtName")
  private String courtName = "BANKRUPTCY COURT";

  @JsonProperty("disputeFlag")
  private String disputeFlag = null;

  @JsonProperty("ecoa")
  private String ecoa = null;

  @JsonProperty("evaluation")
  private String evaluation = null;

  @JsonProperty("filingDate")
  private String filingDate = "6201994.0";

  @JsonProperty("plaintiffName")
  private String plaintiffName = null;

  @JsonProperty("referenceNumber")
  private String referenceNumber = null;

  @JsonProperty("repaymentPercent")
  private String repaymentPercent = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusDate")
  private String statusDate = "07011995";

  public PublicRecordResp adjustmentPercent(String adjustmentPercent) {
    this.adjustmentPercent = adjustmentPercent;
    return this;
  }

  /**
   * For BK Chapter 13 Only.
   * @return adjustmentPercent
  **/
  @ApiModelProperty(value = "For BK Chapter 13 Only.")
  
    public String getAdjustmentPercent() {
    return adjustmentPercent;
  }

  public void setAdjustmentPercent(String adjustmentPercent) {
    this.adjustmentPercent = adjustmentPercent;
  }

  public PublicRecordResp amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Full rounded dollar amount or rounded amount.
   * @return amount
  **/
  @ApiModelProperty(value = "Full rounded dollar amount or rounded amount.")
  
    public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public PublicRecordResp bankruptcyAssetAmount(String bankruptcyAssetAmount) {
    this.bankruptcyAssetAmount = bankruptcyAssetAmount;
    return this;
  }

  /**
   * Full dollar amount for Bankruptcies. 
   * @return bankruptcyAssetAmount
  **/
  @ApiModelProperty(value = "Full dollar amount for Bankruptcies. ")
  
    public String getBankruptcyAssetAmount() {
    return bankruptcyAssetAmount;
  }

  public void setBankruptcyAssetAmount(String bankruptcyAssetAmount) {
    this.bankruptcyAssetAmount = bankruptcyAssetAmount;
  }

  public PublicRecordResp bankruptcyVoluntaryIndicator(String bankruptcyVoluntaryIndicator) {
    this.bankruptcyVoluntaryIndicator = bankruptcyVoluntaryIndicator;
    return this;
  }

  /**
   * Bankruptcy Voluntary Indicator
   * @return bankruptcyVoluntaryIndicator
  **/
  @ApiModelProperty(value = "Bankruptcy Voluntary Indicator")
  
    public String getBankruptcyVoluntaryIndicator() {
    return bankruptcyVoluntaryIndicator;
  }

  public void setBankruptcyVoluntaryIndicator(String bankruptcyVoluntaryIndicator) {
    this.bankruptcyVoluntaryIndicator = bankruptcyVoluntaryIndicator;
  }

  public PublicRecordResp bookPageSequence(String bookPageSequence) {
    this.bookPageSequence = bookPageSequence;
    return this;
  }

  /**
   * Book, page and sequence number.
   * @return bookPageSequence
  **/
  @ApiModelProperty(value = "Book, page and sequence number.")
  
    public String getBookPageSequence() {
    return bookPageSequence;
  }

  public void setBookPageSequence(String bookPageSequence) {
    this.bookPageSequence = bookPageSequence;
  }

  public PublicRecordResp consumerComment(String consumerComment) {
    this.consumerComment = consumerComment;
    return this;
  }

  /**
   * Public Record Comment Text (Free Form).
   * @return consumerComment
  **/
  @ApiModelProperty(value = "Public Record Comment Text (Free Form).")
  
    public String getConsumerComment() {
    return consumerComment;
  }

  public void setConsumerComment(String consumerComment) {
    this.consumerComment = consumerComment;
  }

  public PublicRecordResp courtCode(String courtCode) {
    this.courtCode = courtCode;
    return this;
  }

  /**
   * Seven-digit code unique to each court.
   * @return courtCode
  **/
  @ApiModelProperty(value = "Seven-digit code unique to each court.")
  
    public String getCourtCode() {
    return courtCode;
  }

  public void setCourtCode(String courtCode) {
    this.courtCode = courtCode;
  }

  public PublicRecordResp courtName(String courtName) {
    this.courtName = courtName;
    return this;
  }

  /**
   * Court name
   * @return courtName
  **/
  @ApiModelProperty(value = "Court name")
  
    public String getCourtName() {
    return courtName;
  }

  public void setCourtName(String courtName) {
    this.courtName = courtName;
  }

  public PublicRecordResp disputeFlag(String disputeFlag) {
    this.disputeFlag = disputeFlag;
    return this;
  }

  /**
   * Indicates a dispute.
   * @return disputeFlag
  **/
  @ApiModelProperty(value = "Indicates a dispute.")
  
    public String getDisputeFlag() {
    return disputeFlag;
  }

  public void setDisputeFlag(String disputeFlag) {
    this.disputeFlag = disputeFlag;
  }

  public PublicRecordResp ecoa(String ecoa) {
    this.ecoa = ecoa;
    return this;
  }

  /**
   * Get ecoa
   * @return ecoa
  **/
  @ApiModelProperty(value = "")
  
    public String getEcoa() {
    return ecoa;
  }

  public void setEcoa(String ecoa) {
    this.ecoa = ecoa;
  }

  public PublicRecordResp evaluation(String evaluation) {
    this.evaluation = evaluation;
    return this;
  }

  /**
   * N (constant) = negative
   * @return evaluation
  **/
  @ApiModelProperty(value = "N (constant) = negative")
  
    public String getEvaluation() {
    return evaluation;
  }

  public void setEvaluation(String evaluation) {
    this.evaluation = evaluation;
  }

  public PublicRecordResp filingDate(String filingDate) {
    this.filingDate = filingDate;
    return this;
  }

  /**
   * Original filing date Format = MMDDCCYY.
   * @return filingDate
  **/
  @ApiModelProperty(value = "Original filing date Format = MMDDCCYY.")
  
    public String getFilingDate() {
    return filingDate;
  }

  public void setFilingDate(String filingDate) {
    this.filingDate = filingDate;
  }

  public PublicRecordResp plaintiffName(String plaintiffName) {
    this.plaintiffName = plaintiffName;
    return this;
  }

  /**
   * Plaintiff Name
   * @return plaintiffName
  **/
  @ApiModelProperty(value = "Plaintiff Name")
  
    public String getPlaintiffName() {
    return plaintiffName;
  }

  public void setPlaintiffName(String plaintiffName) {
    this.plaintiffName = plaintiffName;
  }

  public PublicRecordResp referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * Contains docket number or certificate ID.
   * @return referenceNumber
  **/
  @ApiModelProperty(value = "Contains docket number or certificate ID.")
  
    public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public PublicRecordResp repaymentPercent(String repaymentPercent) {
    this.repaymentPercent = repaymentPercent;
    return this;
  }

  /**
   * For BK Chapter 13 Only
   * @return repaymentPercent
  **/
  @ApiModelProperty(value = "For BK Chapter 13 Only")
  
    public String getRepaymentPercent() {
    return repaymentPercent;
  }

  public void setRepaymentPercent(String repaymentPercent) {
    this.repaymentPercent = repaymentPercent;
  }

  public PublicRecordResp status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Public Record Status Codes.
   * @return status
  **/
  @ApiModelProperty(value = "Public Record Status Codes.")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PublicRecordResp statusDate(String statusDate) {
    this.statusDate = statusDate;
    return this;
  }

  /**
   * Date of court action associated with status. Format = MMDDCCYY. 
   * @return statusDate
  **/
  @ApiModelProperty(value = "Date of court action associated with status. Format = MMDDCCYY. ")
  
    public String getStatusDate() {
    return statusDate;
  }

  public void setStatusDate(String statusDate) {
    this.statusDate = statusDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicRecordResp publicRecordResp = (PublicRecordResp) o;
    return Objects.equals(this.adjustmentPercent, publicRecordResp.adjustmentPercent) &&
        Objects.equals(this.amount, publicRecordResp.amount) &&
        Objects.equals(this.bankruptcyAssetAmount, publicRecordResp.bankruptcyAssetAmount) &&
        Objects.equals(this.bankruptcyVoluntaryIndicator, publicRecordResp.bankruptcyVoluntaryIndicator) &&
        Objects.equals(this.bookPageSequence, publicRecordResp.bookPageSequence) &&
        Objects.equals(this.consumerComment, publicRecordResp.consumerComment) &&
        Objects.equals(this.courtCode, publicRecordResp.courtCode) &&
        Objects.equals(this.courtName, publicRecordResp.courtName) &&
        Objects.equals(this.disputeFlag, publicRecordResp.disputeFlag) &&
        Objects.equals(this.ecoa, publicRecordResp.ecoa) &&
        Objects.equals(this.evaluation, publicRecordResp.evaluation) &&
        Objects.equals(this.filingDate, publicRecordResp.filingDate) &&
        Objects.equals(this.plaintiffName, publicRecordResp.plaintiffName) &&
        Objects.equals(this.referenceNumber, publicRecordResp.referenceNumber) &&
        Objects.equals(this.repaymentPercent, publicRecordResp.repaymentPercent) &&
        Objects.equals(this.status, publicRecordResp.status) &&
        Objects.equals(this.statusDate, publicRecordResp.statusDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustmentPercent, amount, bankruptcyAssetAmount, bankruptcyVoluntaryIndicator, bookPageSequence, consumerComment, courtCode, courtName, disputeFlag, ecoa, evaluation, filingDate, plaintiffName, referenceNumber, repaymentPercent, status, statusDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicRecordResp {\n");
    
    sb.append("    adjustmentPercent: ").append(toIndentedString(adjustmentPercent)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bankruptcyAssetAmount: ").append(toIndentedString(bankruptcyAssetAmount)).append("\n");
    sb.append("    bankruptcyVoluntaryIndicator: ").append(toIndentedString(bankruptcyVoluntaryIndicator)).append("\n");
    sb.append("    bookPageSequence: ").append(toIndentedString(bookPageSequence)).append("\n");
    sb.append("    consumerComment: ").append(toIndentedString(consumerComment)).append("\n");
    sb.append("    courtCode: ").append(toIndentedString(courtCode)).append("\n");
    sb.append("    courtName: ").append(toIndentedString(courtName)).append("\n");
    sb.append("    disputeFlag: ").append(toIndentedString(disputeFlag)).append("\n");
    sb.append("    ecoa: ").append(toIndentedString(ecoa)).append("\n");
    sb.append("    evaluation: ").append(toIndentedString(evaluation)).append("\n");
    sb.append("    filingDate: ").append(toIndentedString(filingDate)).append("\n");
    sb.append("    plaintiffName: ").append(toIndentedString(plaintiffName)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    repaymentPercent: ").append(toIndentedString(repaymentPercent)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDate: ").append(toIndentedString(statusDate)).append("\n");
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
