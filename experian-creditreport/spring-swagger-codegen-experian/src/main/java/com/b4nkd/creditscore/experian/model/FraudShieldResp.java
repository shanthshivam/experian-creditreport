package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.FraudShieldIndicators;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FraudShieldResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class FraudShieldResp   {
  @JsonProperty("addressCount")
  private String addressCount = "1";

  @JsonProperty("addressDate")
  private String addressDate = "03011996";

  @JsonProperty("addressErrorCode")
  private String addressErrorCode = "0";

  @JsonProperty("dateOfBirth")
  private String dateOfBirth = "01101951";

  @JsonProperty("dateOfDeath")
  private String dateOfDeath = "03301996";

  @JsonProperty("fraudShieldIndicators")
  private FraudShieldIndicators fraudShieldIndicators = null;

  @JsonProperty("sic")
  private String sic = null;

  @JsonProperty("socialCount")
  private String socialCount = "1";

  @JsonProperty("socialDate")
  private String socialDate = "03011996";

  @JsonProperty("socialErrorCode")
  private String socialErrorCode = null;

  @JsonProperty("ssnFirstPossibleIssuanceYear")
  private String ssnFirstPossibleIssuanceYear = "1965";

  @JsonProperty("ssnLastPossibleIssuanceYear")
  private String ssnLastPossibleIssuanceYear = "1966";

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("type")
  private String type = "1";

  public FraudShieldResp addressCount(String addressCount) {
    this.addressCount = addressCount;
    return this;
  }

  /**
   * Number of times the address was used in the last 90-120 days
   * @return addressCount
  **/
  @ApiModelProperty(value = "Number of times the address was used in the last 90-120 days")
  
    public String getAddressCount() {
    return addressCount;
  }

  public void setAddressCount(String addressCount) {
    this.addressCount = addressCount;
  }

  public FraudShieldResp addressDate(String addressDate) {
    this.addressDate = addressDate;
    return this;
  }

  /**
   * Format = MMDDCCYY. Date when address counter accumulation started. 
   * @return addressDate
  **/
  @ApiModelProperty(value = "Format = MMDDCCYY. Date when address counter accumulation started. ")
  
    public String getAddressDate() {
    return addressDate;
  }

  public void setAddressDate(String addressDate) {
    this.addressDate = addressDate;
  }

  public FraudShieldResp addressErrorCode(String addressErrorCode) {
    this.addressErrorCode = addressErrorCode;
    return this;
  }

  /**
   * Address Error Code if applicable.
   * @return addressErrorCode
  **/
  @ApiModelProperty(value = "Address Error Code if applicable.")
  
    public String getAddressErrorCode() {
    return addressErrorCode;
  }

  public void setAddressErrorCode(String addressErrorCode) {
    this.addressErrorCode = addressErrorCode;
  }

  public FraudShieldResp dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Format = MMDDCCYY
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "Format = MMDDCCYY")
  
    public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public FraudShieldResp dateOfDeath(String dateOfDeath) {
    this.dateOfDeath = dateOfDeath;
    return this;
  }

  /**
   * Format = MMDDCCYY
   * @return dateOfDeath
  **/
  @ApiModelProperty(value = "Format = MMDDCCYY")
  
    public String getDateOfDeath() {
    return dateOfDeath;
  }

  public void setDateOfDeath(String dateOfDeath) {
    this.dateOfDeath = dateOfDeath;
  }

  public FraudShieldResp fraudShieldIndicators(FraudShieldIndicators fraudShieldIndicators) {
    this.fraudShieldIndicators = fraudShieldIndicators;
    return this;
  }

  /**
   * Get fraudShieldIndicators
   * @return fraudShieldIndicators
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public FraudShieldIndicators getFraudShieldIndicators() {
    return fraudShieldIndicators;
  }

  public void setFraudShieldIndicators(FraudShieldIndicators fraudShieldIndicators) {
    this.fraudShieldIndicators = fraudShieldIndicators;
  }

  public FraudShieldResp sic(String sic) {
    this.sic = sic;
    return this;
  }

  /**
   * Group Identifiers if applicable.
   * @return sic
  **/
  @ApiModelProperty(value = "Group Identifiers if applicable.")
  
    public String getSic() {
    return sic;
  }

  public void setSic(String sic) {
    this.sic = sic;
  }

  public FraudShieldResp socialCount(String socialCount) {
    this.socialCount = socialCount;
    return this;
  }

  /**
   * Number of times the social was used in the last 90-120 days.
   * @return socialCount
  **/
  @ApiModelProperty(value = "Number of times the social was used in the last 90-120 days.")
  
    public String getSocialCount() {
    return socialCount;
  }

  public void setSocialCount(String socialCount) {
    this.socialCount = socialCount;
  }

  public FraudShieldResp socialDate(String socialDate) {
    this.socialDate = socialDate;
    return this;
  }

  /**
   * Date posted when social counter accumulation started. Format = MMDDCCYY.
   * @return socialDate
  **/
  @ApiModelProperty(value = "Date posted when social counter accumulation started. Format = MMDDCCYY.")
  
    public String getSocialDate() {
    return socialDate;
  }

  public void setSocialDate(String socialDate) {
    this.socialDate = socialDate;
  }

  public FraudShieldResp socialErrorCode(String socialErrorCode) {
    this.socialErrorCode = socialErrorCode;
    return this;
  }

  /**
   * Social error code if applicable.
   * @return socialErrorCode
  **/
  @ApiModelProperty(value = "Social error code if applicable.")
  
    public String getSocialErrorCode() {
    return socialErrorCode;
  }

  public void setSocialErrorCode(String socialErrorCode) {
    this.socialErrorCode = socialErrorCode;
  }

  public FraudShieldResp ssnFirstPossibleIssuanceYear(String ssnFirstPossibleIssuanceYear) {
    this.ssnFirstPossibleIssuanceYear = ssnFirstPossibleIssuanceYear;
    return this;
  }

  /**
   * First year possible for SSN issuance (YYYY).
   * @return ssnFirstPossibleIssuanceYear
  **/
  @ApiModelProperty(value = "First year possible for SSN issuance (YYYY).")
  
    public String getSsnFirstPossibleIssuanceYear() {
    return ssnFirstPossibleIssuanceYear;
  }

  public void setSsnFirstPossibleIssuanceYear(String ssnFirstPossibleIssuanceYear) {
    this.ssnFirstPossibleIssuanceYear = ssnFirstPossibleIssuanceYear;
  }

  public FraudShieldResp ssnLastPossibleIssuanceYear(String ssnLastPossibleIssuanceYear) {
    this.ssnLastPossibleIssuanceYear = ssnLastPossibleIssuanceYear;
    return this;
  }

  /**
   * Last year possible for SSN issuance (YYYY).
   * @return ssnLastPossibleIssuanceYear
  **/
  @ApiModelProperty(value = "Last year possible for SSN issuance (YYYY).")
  
    public String getSsnLastPossibleIssuanceYear() {
    return ssnLastPossibleIssuanceYear;
  }

  public void setSsnLastPossibleIssuanceYear(String ssnLastPossibleIssuanceYear) {
    this.ssnLastPossibleIssuanceYear = ssnLastPossibleIssuanceYear;
  }

  public FraudShieldResp text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Shield message.
   * @return text
  **/
  @ApiModelProperty(value = "Shield message.")
  
    public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public FraudShieldResp type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Fraud Shield Record Type
   * @return type
  **/
  @ApiModelProperty(value = "Fraud Shield Record Type")
  
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
    FraudShieldResp fraudShieldResp = (FraudShieldResp) o;
    return Objects.equals(this.addressCount, fraudShieldResp.addressCount) &&
        Objects.equals(this.addressDate, fraudShieldResp.addressDate) &&
        Objects.equals(this.addressErrorCode, fraudShieldResp.addressErrorCode) &&
        Objects.equals(this.dateOfBirth, fraudShieldResp.dateOfBirth) &&
        Objects.equals(this.dateOfDeath, fraudShieldResp.dateOfDeath) &&
        Objects.equals(this.fraudShieldIndicators, fraudShieldResp.fraudShieldIndicators) &&
        Objects.equals(this.sic, fraudShieldResp.sic) &&
        Objects.equals(this.socialCount, fraudShieldResp.socialCount) &&
        Objects.equals(this.socialDate, fraudShieldResp.socialDate) &&
        Objects.equals(this.socialErrorCode, fraudShieldResp.socialErrorCode) &&
        Objects.equals(this.ssnFirstPossibleIssuanceYear, fraudShieldResp.ssnFirstPossibleIssuanceYear) &&
        Objects.equals(this.ssnLastPossibleIssuanceYear, fraudShieldResp.ssnLastPossibleIssuanceYear) &&
        Objects.equals(this.text, fraudShieldResp.text) &&
        Objects.equals(this.type, fraudShieldResp.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressCount, addressDate, addressErrorCode, dateOfBirth, dateOfDeath, fraudShieldIndicators, sic, socialCount, socialDate, socialErrorCode, ssnFirstPossibleIssuanceYear, ssnLastPossibleIssuanceYear, text, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudShieldResp {\n");
    
    sb.append("    addressCount: ").append(toIndentedString(addressCount)).append("\n");
    sb.append("    addressDate: ").append(toIndentedString(addressDate)).append("\n");
    sb.append("    addressErrorCode: ").append(toIndentedString(addressErrorCode)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    dateOfDeath: ").append(toIndentedString(dateOfDeath)).append("\n");
    sb.append("    fraudShieldIndicators: ").append(toIndentedString(fraudShieldIndicators)).append("\n");
    sb.append("    sic: ").append(toIndentedString(sic)).append("\n");
    sb.append("    socialCount: ").append(toIndentedString(socialCount)).append("\n");
    sb.append("    socialDate: ").append(toIndentedString(socialDate)).append("\n");
    sb.append("    socialErrorCode: ").append(toIndentedString(socialErrorCode)).append("\n");
    sb.append("    ssnFirstPossibleIssuanceYear: ").append(toIndentedString(ssnFirstPossibleIssuanceYear)).append("\n");
    sb.append("    ssnLastPossibleIssuanceYear: ").append(toIndentedString(ssnLastPossibleIssuanceYear)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
