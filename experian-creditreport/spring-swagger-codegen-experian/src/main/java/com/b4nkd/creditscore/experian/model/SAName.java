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
 * Consumer&#x27;s Name
 */
@ApiModel(description = "Consumer's Name")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class SAName   {
  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("firstName")
  private String firstName = "JON";

  @JsonProperty("middleName")
  private String middleName = "Q";

  @JsonProperty("generationCode")
  private String generationCode = null;

  public SAName lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The full applicant's surname is required. If the surname contains two surnames, then split the surnames with a hyphen (e.g., Smith-Jones). The surname can also be input with an apostrophe (e.g., O'Brien), although apostrophe usage is limited to the letters D, L, and O.
   * @return lastName
  **/
  @ApiModelProperty(value = "The full applicant's surname is required. If the surname contains two surnames, then split the surnames with a hyphen (e.g., Smith-Jones). The surname can also be input with an apostrophe (e.g., O'Brien), although apostrophe usage is limited to the letters D, L, and O.")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public SAName firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The full first name is required. The minimum entry is the first name initial. Blanks and special characters (except dash) are not allowed. Compound names should contain a dash (e.g., Billy-Bob).
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "The full first name is required. The minimum entry is the first name initial. Blanks and special characters (except dash) are not allowed. Compound names should contain a dash (e.g., Billy-Bob).")
      @NotNull

    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public SAName middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * The full middle name should be entered when available. A middle initial is acceptable. Blanks and special characters are not allowed. Omit if the middle name is not available.
   * @return middleName
  **/
  @ApiModelProperty(value = "The full middle name should be entered when available. A middle initial is acceptable. Blanks and special characters are not allowed. Omit if the middle name is not available.")
  
    public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public SAName generationCode(String generationCode) {
    this.generationCode = generationCode;
    return this;
  }

  /**
   * Generation Code
   * @return generationCode
  **/
  @ApiModelProperty(value = "Generation Code")
  
    public String getGenerationCode() {
    return generationCode;
  }

  public void setGenerationCode(String generationCode) {
    this.generationCode = generationCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SAName saName = (SAName) o;
    return Objects.equals(this.lastName, saName.lastName) &&
        Objects.equals(this.firstName, saName.firstName) &&
        Objects.equals(this.middleName, saName.middleName) &&
        Objects.equals(this.generationCode, saName.generationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastName, firstName, middleName, generationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAName {\n");
    
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    generationCode: ").append(toIndentedString(generationCode)).append("\n");
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
