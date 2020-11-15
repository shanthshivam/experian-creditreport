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
 * Consumer&#x27;s Driver License
 */
@ApiModel(description = "Consumer's Driver License")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class DriverLicense   {
  @JsonProperty("number")
  private String number = "111111";

  @JsonProperty("state")
  private String state = "CA";

  public DriverLicense number(String number) {
    this.number = number;
    return this;
  }

  /**
   * DL Number
   * @return number
  **/
  @ApiModelProperty(required = true, value = "DL Number")
      @NotNull

    public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public DriverLicense state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State in which DL was issued
   * @return state
  **/
  @ApiModelProperty(required = true, value = "State in which DL was issued")
      @NotNull

    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverLicense driverLicense = (DriverLicense) o;
    return Objects.equals(this.number, driverLicense.number) &&
        Objects.equals(this.state, driverLicense.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverLicense {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
