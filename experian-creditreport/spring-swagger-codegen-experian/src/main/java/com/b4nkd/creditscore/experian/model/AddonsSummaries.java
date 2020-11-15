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
 * Details of what summaries are requested in output like profile summary or auto summary
 */
@ApiModel(description = "Details of what summaries are requested in output like profile summary or auto summary")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class AddonsSummaries   {
  @JsonProperty("summaryType")
  @Valid
  private List<String> summaryType = null;

  public AddonsSummaries summaryType(List<String> summaryType) {
    this.summaryType = summaryType;
    return this;
  }

  public AddonsSummaries addSummaryTypeItem(String summaryTypeItem) {
    if (this.summaryType == null) {
      this.summaryType = new ArrayList<String>();
    }
    this.summaryType.add(summaryTypeItem);
    return this;
  }

  /**
   * Get summaryType
   * @return summaryType
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getSummaryType() {
    return summaryType;
  }

  public void setSummaryType(List<String> summaryType) {
    this.summaryType = summaryType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddonsSummaries addonsSummaries = (AddonsSummaries) o;
    return Objects.equals(this.summaryType, addonsSummaries.summaryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summaryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddonsSummaries {\n");
    
    sb.append("    summaryType: ").append(toIndentedString(summaryType)).append("\n");
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
