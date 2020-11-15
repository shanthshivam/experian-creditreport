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
 * RentBureauAccountData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class RentBureauAccountData   {
  @JsonProperty("primaryApplRentBureauFreezePin")
  private String primaryApplRentBureauFreezePin = "";

  @JsonProperty("secondaryApplRentBureauFreezePin")
  private String secondaryApplRentBureauFreezePin = "";

  public RentBureauAccountData primaryApplRentBureauFreezePin(String primaryApplRentBureauFreezePin) {
    this.primaryApplRentBureauFreezePin = primaryApplRentBureauFreezePin;
    return this;
  }

  /**
   * Rent Bureau Freeze PIN of the primary applicant
   * @return primaryApplRentBureauFreezePin
  **/
  @ApiModelProperty(value = "Rent Bureau Freeze PIN of the primary applicant")
  
    public String getPrimaryApplRentBureauFreezePin() {
    return primaryApplRentBureauFreezePin;
  }

  public void setPrimaryApplRentBureauFreezePin(String primaryApplRentBureauFreezePin) {
    this.primaryApplRentBureauFreezePin = primaryApplRentBureauFreezePin;
  }

  public RentBureauAccountData secondaryApplRentBureauFreezePin(String secondaryApplRentBureauFreezePin) {
    this.secondaryApplRentBureauFreezePin = secondaryApplRentBureauFreezePin;
    return this;
  }

  /**
   * Rent Bureau Freeze PIN of the secondary/spouse or joint applicant
   * @return secondaryApplRentBureauFreezePin
  **/
  @ApiModelProperty(value = "Rent Bureau Freeze PIN of the secondary/spouse or joint applicant")
  
    public String getSecondaryApplRentBureauFreezePin() {
    return secondaryApplRentBureauFreezePin;
  }

  public void setSecondaryApplRentBureauFreezePin(String secondaryApplRentBureauFreezePin) {
    this.secondaryApplRentBureauFreezePin = secondaryApplRentBureauFreezePin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RentBureauAccountData rentBureauAccountData = (RentBureauAccountData) o;
    return Objects.equals(this.primaryApplRentBureauFreezePin, rentBureauAccountData.primaryApplRentBureauFreezePin) &&
        Objects.equals(this.secondaryApplRentBureauFreezePin, rentBureauAccountData.secondaryApplRentBureauFreezePin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryApplRentBureauFreezePin, secondaryApplRentBureauFreezePin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RentBureauAccountData {\n");
    
    sb.append("    primaryApplRentBureauFreezePin: ").append(toIndentedString(primaryApplRentBureauFreezePin)).append("\n");
    sb.append("    secondaryApplRentBureauFreezePin: ").append(toIndentedString(secondaryApplRentBureauFreezePin)).append("\n");
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
