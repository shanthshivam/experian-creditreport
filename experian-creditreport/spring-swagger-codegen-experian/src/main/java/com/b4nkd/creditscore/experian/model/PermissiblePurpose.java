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
 * Specifies information on why this credit inquiry is being submitted This is used to denote the purpose type, terms, and amount.
 */
@ApiModel(description = "Specifies information on why this credit inquiry is being submitted This is used to denote the purpose type, terms, and amount.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class PermissiblePurpose   {
  @JsonProperty("type")
  private String type = "18";

  @JsonProperty("terms")
  private String terms = "8";

  @JsonProperty("abbreviatedAmount")
  private String abbreviatedAmount = "100";

  public PermissiblePurpose type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Permissible Purpose Type Code. 2 digits containing the account type code only.
   * @return type
  **/
  @ApiModelProperty(value = "Permissible Purpose Type Code. 2 digits containing the account type code only.")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PermissiblePurpose terms(String terms) {
    this.terms = terms;
    return this;
  }

  /**
   * The Terms must be 3 digits. If unknown             , substitute three periods. Mortgage loans use terms expressed in YEARS. Revolving accounts use terms expressed as either \"001\" to indicate a monthly payment plan or \"010\" to indicate a revolving account. All other type codes have terms that are expressed in MONTHS
   * @return terms
  **/
  @ApiModelProperty(value = "The Terms must be 3 digits. If unknown             , substitute three periods. Mortgage loans use terms expressed in YEARS. Revolving accounts use terms expressed as either \"001\" to indicate a monthly payment plan or \"010\" to indicate a revolving account. All other type codes have terms that are expressed in MONTHS")
  
    public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  public PermissiblePurpose abbreviatedAmount(String abbreviatedAmount) {
    this.abbreviatedAmount = abbreviatedAmount;
    return this;
  }

  /**
   * Input the amount of the account. Must             be 3 digits. If unknown, substitute              three periods. Mortgage loans have amounts expressed in THOUSANDS.             For example, a $100,000 VA mortgage              for 30 years would be entered as \"100\". Under 1000; enter 000. All other type accounts are expressed in HUNDREDS. For example, a $15,000 auto loan would be entered as \"150\". Under 100; input 000.
   * @return abbreviatedAmount
  **/
  @ApiModelProperty(value = "Input the amount of the account. Must             be 3 digits. If unknown, substitute              three periods. Mortgage loans have amounts expressed in THOUSANDS.             For example, a $100,000 VA mortgage              for 30 years would be entered as \"100\". Under 1000; enter 000. All other type accounts are expressed in HUNDREDS. For example, a $15,000 auto loan would be entered as \"150\". Under 100; input 000.")
  
    public String getAbbreviatedAmount() {
    return abbreviatedAmount;
  }

  public void setAbbreviatedAmount(String abbreviatedAmount) {
    this.abbreviatedAmount = abbreviatedAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissiblePurpose permissiblePurpose = (PermissiblePurpose) o;
    return Objects.equals(this.type, permissiblePurpose.type) &&
        Objects.equals(this.terms, permissiblePurpose.terms) &&
        Objects.equals(this.abbreviatedAmount, permissiblePurpose.abbreviatedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, terms, abbreviatedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissiblePurpose {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    abbreviatedAmount: ").append(toIndentedString(abbreviatedAmount)).append("\n");
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
