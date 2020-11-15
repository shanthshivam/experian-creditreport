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
 * Consumer&#x27;s Address
 */
@ApiModel(description = "Consumer's Address")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class Address   {
  @JsonProperty("line1")
  private String line1 = "10655 N BIRCH ST";

  @JsonProperty("line2")
  private String line2 = " ";

  @JsonProperty("city")
  private String city = "BURBANK";

  @JsonProperty("state")
  private String state = "CA";

  @JsonProperty("zipCode")
  private String zipCode = "915021234";

  public Address line1(String line1) {
    this.line1 = line1;
    return this;
  }

  /**
   * Address Line 1
   * @return line1
  **/
  @ApiModelProperty(required = true, value = "Address Line 1")
      @NotNull

    public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public Address line2(String line2) {
    this.line2 = line2;
    return this;
  }

  /**
   * Address Line 2
   * @return line2
  **/
  @ApiModelProperty(value = "Address Line 2")
  
    public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City
   * @return city
  **/
  @ApiModelProperty(value = "City")
  
    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State
   * @return state
  **/
  @ApiModelProperty(value = "State")
  
    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * ZIP Code
   * @return zipCode
  **/
  @ApiModelProperty(required = true, value = "ZIP Code")
      @NotNull

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
    Address address = (Address) o;
    return Objects.equals(this.line1, address.line1) &&
        Objects.equals(this.line2, address.line2) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.zipCode, address.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line1, line2, city, state, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
