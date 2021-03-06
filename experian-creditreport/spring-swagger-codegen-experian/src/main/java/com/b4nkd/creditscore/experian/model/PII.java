package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.PrimaryApplicant;
import com.b4nkd.creditscore.experian.model.SecondaryApplicant;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Personally Identifiable Information
 */
@ApiModel(description = "Personally Identifiable Information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class PII   {
  @JsonProperty("primaryApplicant")
  private PrimaryApplicant primaryApplicant = null;

  @JsonProperty("secondaryApplicant")
  private SecondaryApplicant secondaryApplicant = null;

  public PII primaryApplicant(PrimaryApplicant primaryApplicant) {
    this.primaryApplicant = primaryApplicant;
    return this;
  }

  /**
   * Get primaryApplicant
   * @return primaryApplicant
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public PrimaryApplicant getPrimaryApplicant() {
    return primaryApplicant;
  }

  public void setPrimaryApplicant(PrimaryApplicant primaryApplicant) {
    this.primaryApplicant = primaryApplicant;
  }

  public PII secondaryApplicant(SecondaryApplicant secondaryApplicant) {
    this.secondaryApplicant = secondaryApplicant;
    return this;
  }

  /**
   * Get secondaryApplicant
   * @return secondaryApplicant
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SecondaryApplicant getSecondaryApplicant() {
    return secondaryApplicant;
  }

  public void setSecondaryApplicant(SecondaryApplicant secondaryApplicant) {
    this.secondaryApplicant = secondaryApplicant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PII PII = (PII) o;
    return Objects.equals(this.primaryApplicant, PII.primaryApplicant) &&
        Objects.equals(this.secondaryApplicant, PII.secondaryApplicant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryApplicant, secondaryApplicant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PII {\n");
    
    sb.append("    primaryApplicant: ").append(toIndentedString(primaryApplicant)).append("\n");
    sb.append("    secondaryApplicant: ").append(toIndentedString(secondaryApplicant)).append("\n");
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
