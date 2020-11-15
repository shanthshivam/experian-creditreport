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
 * Output a 17 byte unique consumer identifier for requestor and/or verify an input 17 byte unique consumer identifier.
 */
@ApiModel(description = "Output a 17 byte unique consumer identifier for requestor and/or verify an input 17 byte unique consumer identifier.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class ConsumerIdentifierCheckOptions   {
  @JsonProperty("getUniqueConsumerIdentifier")
  private String getUniqueConsumerIdentifier = "Y";

  @JsonProperty("verifyPrimaryConsumerIdentifier")
  private String verifyPrimaryConsumerIdentifier = "Y";

  @JsonProperty("verifySecondaryConsumerIdentifier")
  private String verifySecondaryConsumerIdentifier = "Y";

  public ConsumerIdentifierCheckOptions getUniqueConsumerIdentifier(String getUniqueConsumerIdentifier) {
    this.getUniqueConsumerIdentifier = getUniqueConsumerIdentifier;
    return this;
  }

  /**
   * Y -17 byte unique consumer identifier on output.
   * @return getUniqueConsumerIdentifier
  **/
  @ApiModelProperty(value = "Y -17 byte unique consumer identifier on output.")
  
    public String getGetUniqueConsumerIdentifier() {
    return getUniqueConsumerIdentifier;
  }

  public void setGetUniqueConsumerIdentifier(String getUniqueConsumerIdentifier) {
    this.getUniqueConsumerIdentifier = getUniqueConsumerIdentifier;
  }

  public ConsumerIdentifierCheckOptions verifyPrimaryConsumerIdentifier(String verifyPrimaryConsumerIdentifier) {
    this.verifyPrimaryConsumerIdentifier = verifyPrimaryConsumerIdentifier;
    return this;
  }

  /**
   * Y - 17 byte unique consumer identifier output for Primary Applicant.
   * @return verifyPrimaryConsumerIdentifier
  **/
  @ApiModelProperty(value = "Y - 17 byte unique consumer identifier output for Primary Applicant.")
  
    public String getVerifyPrimaryConsumerIdentifier() {
    return verifyPrimaryConsumerIdentifier;
  }

  public void setVerifyPrimaryConsumerIdentifier(String verifyPrimaryConsumerIdentifier) {
    this.verifyPrimaryConsumerIdentifier = verifyPrimaryConsumerIdentifier;
  }

  public ConsumerIdentifierCheckOptions verifySecondaryConsumerIdentifier(String verifySecondaryConsumerIdentifier) {
    this.verifySecondaryConsumerIdentifier = verifySecondaryConsumerIdentifier;
    return this;
  }

  /**
   * Y - 17 byte unique consumer identifier output for Secondary Applicant.
   * @return verifySecondaryConsumerIdentifier
  **/
  @ApiModelProperty(value = "Y - 17 byte unique consumer identifier output for Secondary Applicant.")
  
    public String getVerifySecondaryConsumerIdentifier() {
    return verifySecondaryConsumerIdentifier;
  }

  public void setVerifySecondaryConsumerIdentifier(String verifySecondaryConsumerIdentifier) {
    this.verifySecondaryConsumerIdentifier = verifySecondaryConsumerIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerIdentifierCheckOptions consumerIdentifierCheckOptions = (ConsumerIdentifierCheckOptions) o;
    return Objects.equals(this.getUniqueConsumerIdentifier, consumerIdentifierCheckOptions.getUniqueConsumerIdentifier) &&
        Objects.equals(this.verifyPrimaryConsumerIdentifier, consumerIdentifierCheckOptions.verifyPrimaryConsumerIdentifier) &&
        Objects.equals(this.verifySecondaryConsumerIdentifier, consumerIdentifierCheckOptions.verifySecondaryConsumerIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getUniqueConsumerIdentifier, verifyPrimaryConsumerIdentifier, verifySecondaryConsumerIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerIdentifierCheckOptions {\n");
    
    sb.append("    getUniqueConsumerIdentifier: ").append(toIndentedString(getUniqueConsumerIdentifier)).append("\n");
    sb.append("    verifyPrimaryConsumerIdentifier: ").append(toIndentedString(verifyPrimaryConsumerIdentifier)).append("\n");
    sb.append("    verifySecondaryConsumerIdentifier: ").append(toIndentedString(verifySecondaryConsumerIdentifier)).append("\n");
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
