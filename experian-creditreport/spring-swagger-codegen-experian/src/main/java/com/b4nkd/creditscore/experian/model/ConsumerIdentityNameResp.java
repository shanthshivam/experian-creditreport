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
 * ConsumerIdentityNameResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class ConsumerIdentityNameResp   {
  @JsonProperty("firstName")
  private String firstName = "JON";

  @JsonProperty("generationCode")
  private String generationCode = "J";

  @JsonProperty("middleName")
  private String middleName = "Q";

  @JsonProperty("secondSurname")
  private String secondSurname = "CONSUMER";

  @JsonProperty("surname")
  private String surname = "CONSUMER";

  @JsonProperty("type")
  private String type = "A";

  public ConsumerIdentityNameResp firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Consumer's Full First Name.
   * @return firstName
  **/
  @ApiModelProperty(value = "Consumer's Full First Name.")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ConsumerIdentityNameResp generationCode(String generationCode) {
    this.generationCode = generationCode;
    return this;
  }

  /**
   * Generation Code if applicable.
   * @return generationCode
  **/
  @ApiModelProperty(value = "Generation Code if applicable.")
  
    public String getGenerationCode() {
    return generationCode;
  }

  public void setGenerationCode(String generationCode) {
    this.generationCode = generationCode;
  }

  public ConsumerIdentityNameResp middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Consumer's Full Middle Name or Middle Initial
   * @return middleName
  **/
  @ApiModelProperty(value = "Consumer's Full Middle Name or Middle Initial")
  
    public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public ConsumerIdentityNameResp secondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
    return this;
  }

  /**
   * Second half of the surname for dual surnames.
   * @return secondSurname
  **/
  @ApiModelProperty(value = "Second half of the surname for dual surnames.")
  
    public String getSecondSurname() {
    return secondSurname;
  }

  public void setSecondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
  }

  public ConsumerIdentityNameResp surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Consumer's last name. 
   * @return surname
  **/
  @ApiModelProperty(value = "Consumer's last name. ")
  
    public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public ConsumerIdentityNameResp type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Name Type
   * @return type
  **/
  @ApiModelProperty(value = "Name Type")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerIdentityNameResp consumerIdentityNameResp = (ConsumerIdentityNameResp) o;
    return Objects.equals(this.firstName, consumerIdentityNameResp.firstName) &&
        Objects.equals(this.generationCode, consumerIdentityNameResp.generationCode) &&
        Objects.equals(this.middleName, consumerIdentityNameResp.middleName) &&
        Objects.equals(this.secondSurname, consumerIdentityNameResp.secondSurname) &&
        Objects.equals(this.surname, consumerIdentityNameResp.surname) &&
        Objects.equals(this.type, consumerIdentityNameResp.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, generationCode, middleName, secondSurname, surname, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerIdentityNameResp {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    generationCode: ").append(toIndentedString(generationCode)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    secondSurname: ").append(toIndentedString(secondSurname)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
