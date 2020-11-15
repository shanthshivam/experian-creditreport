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
 * Risk Models that are being requested. Upto 29 models can be requested.
 */
@ApiModel(description = "Risk Models that are being requested. Upto 29 models can be requested.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class RiskModelDaas   {
  @JsonProperty("modelIndicator")
  @Valid
  private List<String> modelIndicator = null;

  @JsonProperty("scorePercentile")
  private String scorePercentile = "Y";

  public RiskModelDaas modelIndicator(List<String> modelIndicator) {
    this.modelIndicator = modelIndicator;
    return this;
  }

  public RiskModelDaas addModelIndicatorItem(String modelIndicatorItem) {
    if (this.modelIndicator == null) {
      this.modelIndicator = new ArrayList<String>();
    }
    this.modelIndicator.add(modelIndicatorItem);
    return this;
  }

  /**
   * Get modelIndicator
   * @return modelIndicator
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getModelIndicator() {
    return modelIndicator;
  }

  public void setModelIndicator(List<String> modelIndicator) {
    this.modelIndicator = modelIndicator;
  }

  public RiskModelDaas scorePercentile(String scorePercentile) {
    this.scorePercentile = scorePercentile;
    return this;
  }

  /**
   * Y - Percentile data for Risk-based Pricing policies. Must be requested along with a Risk Model.
   * @return scorePercentile
  **/
  @ApiModelProperty(value = "Y - Percentile data for Risk-based Pricing policies. Must be requested along with a Risk Model.")
  
    public String getScorePercentile() {
    return scorePercentile;
  }

  public void setScorePercentile(String scorePercentile) {
    this.scorePercentile = scorePercentile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskModelDaas riskModelDaas = (RiskModelDaas) o;
    return Objects.equals(this.modelIndicator, riskModelDaas.modelIndicator) &&
        Objects.equals(this.scorePercentile, riskModelDaas.scorePercentile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelIndicator, scorePercentile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskModelDaas {\n");
    
    sb.append("    modelIndicator: ").append(toIndentedString(modelIndicator)).append("\n");
    sb.append("    scorePercentile: ").append(toIndentedString(scorePercentile)).append("\n");
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
