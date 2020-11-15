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
 * RentBureauAccountDataConnect
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class RentBureauAccountDataConnect   {
  @JsonProperty("primaryApplRentBureauFreezePin")
  private String primaryApplRentBureauFreezePin = "";

  public RentBureauAccountDataConnect primaryApplRentBureauFreezePin(String primaryApplRentBureauFreezePin) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RentBureauAccountDataConnect rentBureauAccountDataConnect = (RentBureauAccountDataConnect) o;
    return Objects.equals(this.primaryApplRentBureauFreezePin, rentBureauAccountDataConnect.primaryApplRentBureauFreezePin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryApplRentBureauFreezePin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RentBureauAccountDataConnect {\n");
    
    sb.append("    primaryApplRentBureauFreezePin: ").append(toIndentedString(primaryApplRentBureauFreezePin)).append("\n");
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
