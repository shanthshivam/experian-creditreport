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
 * SsnResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class SsnResp   {
  @JsonProperty("number")
  private String number = "123456789";

  @JsonProperty("ssnIndicators")
  private String ssnIndicators = null;

  @JsonProperty("variationIndicator")
  private String variationIndicator = null;

  public SsnResp number(String number) {
    this.number = number;
    return this;
  }

  /**
   * SSN(s) present for the consumer. 
   * @return number
  **/
  @ApiModelProperty(value = "SSN(s) present for the consumer. ")
  
    public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public SsnResp ssnIndicators(String ssnIndicators) {
    this.ssnIndicators = ssnIndicators;
    return this;
  }

  /**
   * Indicates how the SSN in the response matched to the inquiry SSN, digit by digit.
   * @return ssnIndicators
  **/
  @ApiModelProperty(value = "Indicates how the SSN in the response matched to the inquiry SSN, digit by digit.")
  
    public String getSsnIndicators() {
    return ssnIndicators;
  }

  public void setSsnIndicators(String ssnIndicators) {
    this.ssnIndicators = ssnIndicators;
  }

  public SsnResp variationIndicator(String variationIndicator) {
    this.variationIndicator = variationIndicator;
    return this;
  }

  /**
   * Indicates if SSN is different than input. 
   * @return variationIndicator
  **/
  @ApiModelProperty(value = "Indicates if SSN is different than input. ")
  
    public String getVariationIndicator() {
    return variationIndicator;
  }

  public void setVariationIndicator(String variationIndicator) {
    this.variationIndicator = variationIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsnResp ssnResp = (SsnResp) o;
    return Objects.equals(this.number, ssnResp.number) &&
        Objects.equals(this.ssnIndicators, ssnResp.ssnIndicators) &&
        Objects.equals(this.variationIndicator, ssnResp.variationIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, ssnIndicators, variationIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsnResp {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    ssnIndicators: ").append(toIndentedString(ssnIndicators)).append("\n");
    sb.append("    variationIndicator: ").append(toIndentedString(variationIndicator)).append("\n");
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
