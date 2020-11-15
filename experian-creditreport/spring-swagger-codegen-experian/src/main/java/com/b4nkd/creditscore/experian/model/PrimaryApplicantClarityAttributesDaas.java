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
 * PrimaryApplicantClarityAttributesDaas
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class PrimaryApplicantClarityAttributesDaas   {
  @JsonProperty("id")
  private String id = "123456789";

  @JsonProperty("value")
  private String value = null;

  public PrimaryApplicantClarityAttributesDaas id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Indicates the value of clarity attributes
   * @return id
  **/
  @ApiModelProperty(value = "Indicates the value of clarity attributes")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PrimaryApplicantClarityAttributesDaas value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Indicates the value of clarity attributes         
   * @return value
  **/
  @ApiModelProperty(value = "Indicates the value of clarity attributes         ")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrimaryApplicantClarityAttributesDaas primaryApplicantClarityAttributesDaas = (PrimaryApplicantClarityAttributesDaas) o;
    return Objects.equals(this.id, primaryApplicantClarityAttributesDaas.id) &&
        Objects.equals(this.value, primaryApplicantClarityAttributesDaas.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrimaryApplicantClarityAttributesDaas {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
