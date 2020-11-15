package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.PrimaryApplicantClarityAttributesCP;
import com.b4nkd.creditscore.experian.model.SecondaryApplicantClarityAttributesCP;
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
 * Consumer&#x27;s clarity attrubutes.
 */
@ApiModel(description = "Consumer's clarity attrubutes.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class ClarityAttributesCP   {
  @JsonProperty("primaryApplicantClarityAttributes")
  @Valid
  private List<PrimaryApplicantClarityAttributesCP> primaryApplicantClarityAttributes = null;

  @JsonProperty("secondaryApplicantClarityAttributes")
  @Valid
  private List<SecondaryApplicantClarityAttributesCP> secondaryApplicantClarityAttributes = null;

  public ClarityAttributesCP primaryApplicantClarityAttributes(List<PrimaryApplicantClarityAttributesCP> primaryApplicantClarityAttributes) {
    this.primaryApplicantClarityAttributes = primaryApplicantClarityAttributes;
    return this;
  }

  public ClarityAttributesCP addPrimaryApplicantClarityAttributesItem(PrimaryApplicantClarityAttributesCP primaryApplicantClarityAttributesItem) {
    if (this.primaryApplicantClarityAttributes == null) {
      this.primaryApplicantClarityAttributes = new ArrayList<PrimaryApplicantClarityAttributesCP>();
    }
    this.primaryApplicantClarityAttributes.add(primaryApplicantClarityAttributesItem);
    return this;
  }

  /**
   * Clarity Attributes for Primary Applicant
   * @return primaryApplicantClarityAttributes
  **/
  @ApiModelProperty(value = "Clarity Attributes for Primary Applicant")
      @Valid
    public List<PrimaryApplicantClarityAttributesCP> getPrimaryApplicantClarityAttributes() {
    return primaryApplicantClarityAttributes;
  }

  public void setPrimaryApplicantClarityAttributes(List<PrimaryApplicantClarityAttributesCP> primaryApplicantClarityAttributes) {
    this.primaryApplicantClarityAttributes = primaryApplicantClarityAttributes;
  }

  public ClarityAttributesCP secondaryApplicantClarityAttributes(List<SecondaryApplicantClarityAttributesCP> secondaryApplicantClarityAttributes) {
    this.secondaryApplicantClarityAttributes = secondaryApplicantClarityAttributes;
    return this;
  }

  public ClarityAttributesCP addSecondaryApplicantClarityAttributesItem(SecondaryApplicantClarityAttributesCP secondaryApplicantClarityAttributesItem) {
    if (this.secondaryApplicantClarityAttributes == null) {
      this.secondaryApplicantClarityAttributes = new ArrayList<SecondaryApplicantClarityAttributesCP>();
    }
    this.secondaryApplicantClarityAttributes.add(secondaryApplicantClarityAttributesItem);
    return this;
  }

  /**
   * Clarity Attributes for Secondary Applicant
   * @return secondaryApplicantClarityAttributes
  **/
  @ApiModelProperty(value = "Clarity Attributes for Secondary Applicant")
      @Valid
    public List<SecondaryApplicantClarityAttributesCP> getSecondaryApplicantClarityAttributes() {
    return secondaryApplicantClarityAttributes;
  }

  public void setSecondaryApplicantClarityAttributes(List<SecondaryApplicantClarityAttributesCP> secondaryApplicantClarityAttributes) {
    this.secondaryApplicantClarityAttributes = secondaryApplicantClarityAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClarityAttributesCP clarityAttributesCP = (ClarityAttributesCP) o;
    return Objects.equals(this.primaryApplicantClarityAttributes, clarityAttributesCP.primaryApplicantClarityAttributes) &&
        Objects.equals(this.secondaryApplicantClarityAttributes, clarityAttributesCP.secondaryApplicantClarityAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryApplicantClarityAttributes, secondaryApplicantClarityAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClarityAttributesCP {\n");
    
    sb.append("    primaryApplicantClarityAttributes: ").append(toIndentedString(primaryApplicantClarityAttributes)).append("\n");
    sb.append("    secondaryApplicantClarityAttributes: ").append(toIndentedString(secondaryApplicantClarityAttributes)).append("\n");
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
