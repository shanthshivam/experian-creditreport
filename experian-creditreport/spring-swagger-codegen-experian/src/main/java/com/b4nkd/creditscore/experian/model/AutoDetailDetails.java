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
 * AutoDetailDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class AutoDetailDetails   {
  @JsonProperty("autoDetailItemNumber")
  private String autoDetailItemNumber = null;

  @JsonProperty("autoDetailFinancedAmount")
  private String autoDetailFinancedAmount = null;

  @JsonProperty("autoDetailMonthlyPaymentAmount")
  private String autoDetailMonthlyPaymentAmount = null;

  @JsonProperty("autoDetailTerm")
  private String autoDetailTerm = null;

  @JsonProperty("autoDetailNumberofMonthsRemaining")
  private String autoDetailNumberofMonthsRemaining = null;

  @JsonProperty("autoDetailStatusText")
  private String autoDetailStatusText = null;

  public AutoDetailDetails autoDetailItemNumber(String autoDetailItemNumber) {
    this.autoDetailItemNumber = autoDetailItemNumber;
    return this;
  }

  /**
   * Auto Detail Item Number from 1 to a Maximum of 100.
   * @return autoDetailItemNumber
  **/
  @ApiModelProperty(value = "Auto Detail Item Number from 1 to a Maximum of 100.")
  
    public String getAutoDetailItemNumber() {
    return autoDetailItemNumber;
  }

  public void setAutoDetailItemNumber(String autoDetailItemNumber) {
    this.autoDetailItemNumber = autoDetailItemNumber;
  }

  public AutoDetailDetails autoDetailFinancedAmount(String autoDetailFinancedAmount) {
    this.autoDetailFinancedAmount = autoDetailFinancedAmount;
    return this;
  }

  /**
   * Auto Detail Financed Amount.
   * @return autoDetailFinancedAmount
  **/
  @ApiModelProperty(value = "Auto Detail Financed Amount.")
  
    public String getAutoDetailFinancedAmount() {
    return autoDetailFinancedAmount;
  }

  public void setAutoDetailFinancedAmount(String autoDetailFinancedAmount) {
    this.autoDetailFinancedAmount = autoDetailFinancedAmount;
  }

  public AutoDetailDetails autoDetailMonthlyPaymentAmount(String autoDetailMonthlyPaymentAmount) {
    this.autoDetailMonthlyPaymentAmount = autoDetailMonthlyPaymentAmount;
    return this;
  }

  /**
   * Auto Detail Monthly Payment Amount.
   * @return autoDetailMonthlyPaymentAmount
  **/
  @ApiModelProperty(value = "Auto Detail Monthly Payment Amount.")
  
    public String getAutoDetailMonthlyPaymentAmount() {
    return autoDetailMonthlyPaymentAmount;
  }

  public void setAutoDetailMonthlyPaymentAmount(String autoDetailMonthlyPaymentAmount) {
    this.autoDetailMonthlyPaymentAmount = autoDetailMonthlyPaymentAmount;
  }

  public AutoDetailDetails autoDetailTerm(String autoDetailTerm) {
    this.autoDetailTerm = autoDetailTerm;
    return this;
  }

  /**
   * Auto Detail Term in Months.
   * @return autoDetailTerm
  **/
  @ApiModelProperty(value = "Auto Detail Term in Months.")
  
    public String getAutoDetailTerm() {
    return autoDetailTerm;
  }

  public void setAutoDetailTerm(String autoDetailTerm) {
    this.autoDetailTerm = autoDetailTerm;
  }

  public AutoDetailDetails autoDetailNumberofMonthsRemaining(String autoDetailNumberofMonthsRemaining) {
    this.autoDetailNumberofMonthsRemaining = autoDetailNumberofMonthsRemaining;
    return this;
  }

  /**
   * Auto Detail Number of Months Remaining in the Loan or Lease.
   * @return autoDetailNumberofMonthsRemaining
  **/
  @ApiModelProperty(value = "Auto Detail Number of Months Remaining in the Loan or Lease.")
  
    public String getAutoDetailNumberofMonthsRemaining() {
    return autoDetailNumberofMonthsRemaining;
  }

  public void setAutoDetailNumberofMonthsRemaining(String autoDetailNumberofMonthsRemaining) {
    this.autoDetailNumberofMonthsRemaining = autoDetailNumberofMonthsRemaining;
  }

  public AutoDetailDetails autoDetailStatusText(String autoDetailStatusText) {
    this.autoDetailStatusText = autoDetailStatusText;
    return this;
  }

  /**
   * Auto Detail Status Text of the Loan or Lease.
   * @return autoDetailStatusText
  **/
  @ApiModelProperty(value = "Auto Detail Status Text of the Loan or Lease.")
  
    public String getAutoDetailStatusText() {
    return autoDetailStatusText;
  }

  public void setAutoDetailStatusText(String autoDetailStatusText) {
    this.autoDetailStatusText = autoDetailStatusText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoDetailDetails autoDetailDetails = (AutoDetailDetails) o;
    return Objects.equals(this.autoDetailItemNumber, autoDetailDetails.autoDetailItemNumber) &&
        Objects.equals(this.autoDetailFinancedAmount, autoDetailDetails.autoDetailFinancedAmount) &&
        Objects.equals(this.autoDetailMonthlyPaymentAmount, autoDetailDetails.autoDetailMonthlyPaymentAmount) &&
        Objects.equals(this.autoDetailTerm, autoDetailDetails.autoDetailTerm) &&
        Objects.equals(this.autoDetailNumberofMonthsRemaining, autoDetailDetails.autoDetailNumberofMonthsRemaining) &&
        Objects.equals(this.autoDetailStatusText, autoDetailDetails.autoDetailStatusText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoDetailItemNumber, autoDetailFinancedAmount, autoDetailMonthlyPaymentAmount, autoDetailTerm, autoDetailNumberofMonthsRemaining, autoDetailStatusText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoDetailDetails {\n");
    
    sb.append("    autoDetailItemNumber: ").append(toIndentedString(autoDetailItemNumber)).append("\n");
    sb.append("    autoDetailFinancedAmount: ").append(toIndentedString(autoDetailFinancedAmount)).append("\n");
    sb.append("    autoDetailMonthlyPaymentAmount: ").append(toIndentedString(autoDetailMonthlyPaymentAmount)).append("\n");
    sb.append("    autoDetailTerm: ").append(toIndentedString(autoDetailTerm)).append("\n");
    sb.append("    autoDetailNumberofMonthsRemaining: ").append(toIndentedString(autoDetailNumberofMonthsRemaining)).append("\n");
    sb.append("    autoDetailStatusText: ").append(toIndentedString(autoDetailStatusText)).append("\n");
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
