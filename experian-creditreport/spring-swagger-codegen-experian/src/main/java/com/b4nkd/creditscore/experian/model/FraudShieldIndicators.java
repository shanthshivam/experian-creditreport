package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Fraud Shield Information for the input request.
 */
@ApiModel(description = "Fraud Shield Information for the input request.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class FraudShieldIndicators   {
  @JsonProperty("indicator")
  @Valid
  private List<String> indicator = null;

  public FraudShieldIndicators indicator(List<String> indicator) {
    this.indicator = indicator;
    return this;
  }

  public FraudShieldIndicators addIndicatorItem(String indicatorItem) {
    if (this.indicator == null) {
      this.indicator = new ArrayList<String>();
    }
    this.indicator.add(indicatorItem);
    return this;
  }

  /**
   * Fraud Shield Information for the input request.
   * @return indicator
  **/
  @ApiModelProperty(value = "Fraud Shield Information for the input request.")
  
    public List<String> getIndicator() {
    return indicator;
  }

  public void setIndicator(List<String> indicator) {
    this.indicator = indicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudShieldIndicators fraudShieldIndicators = (FraudShieldIndicators) o;
    return Objects.equals(this.indicator, fraudShieldIndicators.indicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudShieldIndicators {\n");
    
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
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
