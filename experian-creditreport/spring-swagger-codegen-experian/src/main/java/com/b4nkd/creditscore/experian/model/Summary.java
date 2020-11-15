package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.AttributeResp;
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
 * Summary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class Summary   {
  @JsonProperty("summaryType")
  private String summaryType = null;

  @JsonProperty("attributes")
  @Valid
  private List<AttributeResp> attributes = null;

  public Summary summaryType(String summaryType) {
    this.summaryType = summaryType;
    return this;
  }

  /**
   * Summary Type
   * @return summaryType
  **/
  @ApiModelProperty(value = "Summary Type")
  
    public String getSummaryType() {
    return summaryType;
  }

  public void setSummaryType(String summaryType) {
    this.summaryType = summaryType;
  }

  public Summary attributes(List<AttributeResp> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Summary addAttributesItem(AttributeResp attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<AttributeResp>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Summary Attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "Summary Attributes")
      @Valid
    public List<AttributeResp> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<AttributeResp> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Summary summary = (Summary) o;
    return Objects.equals(this.summaryType, summary.summaryType) &&
        Objects.equals(this.attributes, summary.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summaryType, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Summary {\n");
    
    sb.append("    summaryType: ").append(toIndentedString(summaryType)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
