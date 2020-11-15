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
 * EmploymentInformationResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class EmploymentInformationResp   {
  @JsonProperty("addressExtraLine")
  private String addressExtraLine = null;

  @JsonProperty("addressFirstLine")
  private String addressFirstLine = "10655 N BIRCH ST";

  @JsonProperty("addressSecondLine")
  private String addressSecondLine = "WASHINGTON DC";

  @JsonProperty("firstReportedDate")
  private String firstReportedDate = "05011991";

  @JsonProperty("lastUpdatedDate")
  private String lastUpdatedDate = "09011991";

  @JsonProperty("name")
  private String name = "HARDWARE";

  @JsonProperty("source")
  private String source = "8";

  @JsonProperty("zipCode")
  private String zipCode = "91502";

  public EmploymentInformationResp addressExtraLine(String addressExtraLine) {
    this.addressExtraLine = addressExtraLine;
    return this;
  }

  /**
   * Extra line of employer's address
   * @return addressExtraLine
  **/
  @ApiModelProperty(value = "Extra line of employer's address")
  
    public String getAddressExtraLine() {
    return addressExtraLine;
  }

  public void setAddressExtraLine(String addressExtraLine) {
    this.addressExtraLine = addressExtraLine;
  }

  public EmploymentInformationResp addressFirstLine(String addressFirstLine) {
    this.addressFirstLine = addressFirstLine;
    return this;
  }

  /**
   * 1st line of employer's address
   * @return addressFirstLine
  **/
  @ApiModelProperty(value = "1st line of employer's address")
  
    public String getAddressFirstLine() {
    return addressFirstLine;
  }

  public void setAddressFirstLine(String addressFirstLine) {
    this.addressFirstLine = addressFirstLine;
  }

  public EmploymentInformationResp addressSecondLine(String addressSecondLine) {
    this.addressSecondLine = addressSecondLine;
    return this;
  }

  /**
   * 2nd line of employer's address
   * @return addressSecondLine
  **/
  @ApiModelProperty(value = "2nd line of employer's address")
  
    public String getAddressSecondLine() {
    return addressSecondLine;
  }

  public void setAddressSecondLine(String addressSecondLine) {
    this.addressSecondLine = addressSecondLine;
  }

  public EmploymentInformationResp firstReportedDate(String firstReportedDate) {
    this.firstReportedDate = firstReportedDate;
    return this;
  }

  /**
   * Date employment first reported. Format = MMDDCCYY 
   * @return firstReportedDate
  **/
  @ApiModelProperty(value = "Date employment first reported. Format = MMDDCCYY ")
  
    public String getFirstReportedDate() {
    return firstReportedDate;
  }

  public void setFirstReportedDate(String firstReportedDate) {
    this.firstReportedDate = firstReportedDate;
  }

  public EmploymentInformationResp lastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

  /**
   * Date employment last updated. Format = MMDDCCYY.
   * @return lastUpdatedDate
  **/
  @ApiModelProperty(value = "Date employment last updated. Format = MMDDCCYY.")
  
    public String getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public EmploymentInformationResp name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Employer's Name.
   * @return name
  **/
  @ApiModelProperty(value = "Employer's Name.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EmploymentInformationResp source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Source of Employment
   * @return source
  **/
  @ApiModelProperty(value = "Source of Employment")
  
    public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public EmploymentInformationResp zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * ZIP code of employer. 
   * @return zipCode
  **/
  @ApiModelProperty(value = "ZIP code of employer. ")
  
    public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmploymentInformationResp employmentInformationResp = (EmploymentInformationResp) o;
    return Objects.equals(this.addressExtraLine, employmentInformationResp.addressExtraLine) &&
        Objects.equals(this.addressFirstLine, employmentInformationResp.addressFirstLine) &&
        Objects.equals(this.addressSecondLine, employmentInformationResp.addressSecondLine) &&
        Objects.equals(this.firstReportedDate, employmentInformationResp.firstReportedDate) &&
        Objects.equals(this.lastUpdatedDate, employmentInformationResp.lastUpdatedDate) &&
        Objects.equals(this.name, employmentInformationResp.name) &&
        Objects.equals(this.source, employmentInformationResp.source) &&
        Objects.equals(this.zipCode, employmentInformationResp.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressExtraLine, addressFirstLine, addressSecondLine, firstReportedDate, lastUpdatedDate, name, source, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentInformationResp {\n");
    
    sb.append("    addressExtraLine: ").append(toIndentedString(addressExtraLine)).append("\n");
    sb.append("    addressFirstLine: ").append(toIndentedString(addressFirstLine)).append("\n");
    sb.append("    addressSecondLine: ").append(toIndentedString(addressSecondLine)).append("\n");
    sb.append("    firstReportedDate: ").append(toIndentedString(firstReportedDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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
