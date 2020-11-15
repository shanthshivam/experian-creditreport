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
 * ConsumerAssistanceReferralAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class ConsumerAssistanceReferralAddress   {
  @JsonProperty("cityStateZip")
  private String cityStateZip = "BURBANK, CA 91502";

  @JsonProperty("officeName")
  private String officeName = "EXPERIAN";

  @JsonProperty("phone")
  private String phone = "5555555555";

  @JsonProperty("poBox")
  private String poBox = "PO BOX 0000";

  @JsonProperty("streetName")
  private String streetName = "10655 N BIRCH STREET";

  public ConsumerAssistanceReferralAddress cityStateZip(String cityStateZip) {
    this.cityStateZip = cityStateZip;
    return this;
  }

  /**
   * CRS City, State, ZIP.
   * @return cityStateZip
  **/
  @ApiModelProperty(value = "CRS City, State, ZIP.")
  
    public String getCityStateZip() {
    return cityStateZip;
  }

  public void setCityStateZip(String cityStateZip) {
    this.cityStateZip = cityStateZip;
  }

  public ConsumerAssistanceReferralAddress officeName(String officeName) {
    this.officeName = officeName;
    return this;
  }

  /**
   * Name of CRS Office
   * @return officeName
  **/
  @ApiModelProperty(value = "Name of CRS Office")
  
    public String getOfficeName() {
    return officeName;
  }

  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }

  public ConsumerAssistanceReferralAddress phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * CRS Phone Number
   * @return phone
  **/
  @ApiModelProperty(value = "CRS Phone Number")
  
    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public ConsumerAssistanceReferralAddress poBox(String poBox) {
    this.poBox = poBox;
    return this;
  }

  /**
   * CRS PO Box Address
   * @return poBox
  **/
  @ApiModelProperty(value = "CRS PO Box Address")
  
    public String getPoBox() {
    return poBox;
  }

  public void setPoBox(String poBox) {
    this.poBox = poBox;
  }

  public ConsumerAssistanceReferralAddress streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * CRS Street
   * @return streetName
  **/
  @ApiModelProperty(value = "CRS Street")
  
    public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerAssistanceReferralAddress consumerAssistanceReferralAddress = (ConsumerAssistanceReferralAddress) o;
    return Objects.equals(this.cityStateZip, consumerAssistanceReferralAddress.cityStateZip) &&
        Objects.equals(this.officeName, consumerAssistanceReferralAddress.officeName) &&
        Objects.equals(this.phone, consumerAssistanceReferralAddress.phone) &&
        Objects.equals(this.poBox, consumerAssistanceReferralAddress.poBox) &&
        Objects.equals(this.streetName, consumerAssistanceReferralAddress.streetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityStateZip, officeName, phone, poBox, streetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerAssistanceReferralAddress {\n");
    
    sb.append("    cityStateZip: ").append(toIndentedString(cityStateZip)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    poBox: ").append(toIndentedString(poBox)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
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
