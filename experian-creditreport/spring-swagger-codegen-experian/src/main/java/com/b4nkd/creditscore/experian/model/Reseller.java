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
 * If the API requestor is a reseller submitting a credit inquiry to Experian, additional information should be provided.
 */
@ApiModel(description = "If the API requestor is a reseller submitting a credit inquiry to Experian, additional information should be provided.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class Reseller   {
  @JsonProperty("endUserName")
  private String endUserName = "ENDUSER";

  public Reseller endUserName(String endUserName) {
    this.endUserName = endUserName;
    return this;
  }

  /**
   * End User Identification. Resellers of credit reports must enter the name of the end user upto 30 characters.
   * @return endUserName
  **/
  @ApiModelProperty(required = true, value = "End User Identification. Resellers of credit reports must enter the name of the end user upto 30 characters.")
      @NotNull

    public String getEndUserName() {
    return endUserName;
  }

  public void setEndUserName(String endUserName) {
    this.endUserName = endUserName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reseller reseller = (Reseller) o;
    return Objects.equals(this.endUserName, reseller.endUserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endUserName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reseller {\n");
    
    sb.append("    endUserName: ").append(toIndentedString(endUserName)).append("\n");
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
