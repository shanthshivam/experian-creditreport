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
 * ECBSVAttributeDataCP
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class ECBSVAttributeDataCP   {
  @JsonProperty("employerIdentificationNumber")
  private String employerIdentificationNumber = "324658978";

  @JsonProperty("consentDate")
  private String consentDate = "05042020";

  @JsonProperty("consentType")
  private String consentType = "E";

  public ECBSVAttributeDataCP employerIdentificationNumber(String employerIdentificationNumber) {
    this.employerIdentificationNumber = employerIdentificationNumber;
    return this;
  }

  /**
   * Employer Identification Number
   * @return employerIdentificationNumber
  **/
  @ApiModelProperty(value = "Employer Identification Number")
  
    public String getEmployerIdentificationNumber() {
    return employerIdentificationNumber;
  }

  public void setEmployerIdentificationNumber(String employerIdentificationNumber) {
    this.employerIdentificationNumber = employerIdentificationNumber;
  }

  public ECBSVAttributeDataCP consentDate(String consentDate) {
    this.consentDate = consentDate;
    return this;
  }

  /**
   * Date of Consent
   * @return consentDate
  **/
  @ApiModelProperty(value = "Date of Consent")
  
    public String getConsentDate() {
    return consentDate;
  }

  public void setConsentDate(String consentDate) {
    this.consentDate = consentDate;
  }

  public ECBSVAttributeDataCP consentType(String consentType) {
    this.consentType = consentType;
    return this;
  }

  /**
   * Applicant Type of Consent
   * @return consentType
  **/
  @ApiModelProperty(value = "Applicant Type of Consent")
  
    public String getConsentType() {
    return consentType;
  }

  public void setConsentType(String consentType) {
    this.consentType = consentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ECBSVAttributeDataCP eCBSVAttributeDataCP = (ECBSVAttributeDataCP) o;
    return Objects.equals(this.employerIdentificationNumber, eCBSVAttributeDataCP.employerIdentificationNumber) &&
        Objects.equals(this.consentDate, eCBSVAttributeDataCP.consentDate) &&
        Objects.equals(this.consentType, eCBSVAttributeDataCP.consentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employerIdentificationNumber, consentDate, consentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ECBSVAttributeDataCP {\n");
    
    sb.append("    employerIdentificationNumber: ").append(toIndentedString(employerIdentificationNumber)).append("\n");
    sb.append("    consentDate: ").append(toIndentedString(consentDate)).append("\n");
    sb.append("    consentType: ").append(toIndentedString(consentType)).append("\n");
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
