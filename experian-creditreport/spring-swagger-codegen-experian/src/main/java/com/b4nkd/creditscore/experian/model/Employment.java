package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.Address;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Consumer&#x27;s Employment Details
 */
@ApiModel(description = "Consumer's Employment Details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class Employment   {
  @JsonProperty("employerName")
  private String employerName = "HARDWARE STORE";

  @JsonProperty("employerAddress")
  private Address employerAddress = null;

  public Employment employerName(String employerName) {
    this.employerName = employerName;
    return this;
  }

  /**
   * Employer's Name
   * @return employerName
  **/
  @ApiModelProperty(required = true, value = "Employer's Name")
      @NotNull

    public String getEmployerName() {
    return employerName;
  }

  public void setEmployerName(String employerName) {
    this.employerName = employerName;
  }

  public Employment employerAddress(Address employerAddress) {
    this.employerAddress = employerAddress;
    return this;
  }

  /**
   * Get employerAddress
   * @return employerAddress
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Address getEmployerAddress() {
    return employerAddress;
  }

  public void setEmployerAddress(Address employerAddress) {
    this.employerAddress = employerAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employment employment = (Employment) o;
    return Objects.equals(this.employerName, employment.employerName) &&
        Objects.equals(this.employerAddress, employment.employerAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employerName, employerAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employment {\n");
    
    sb.append("    employerName: ").append(toIndentedString(employerName)).append("\n");
    sb.append("    employerAddress: ").append(toIndentedString(employerAddress)).append("\n");
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
