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
 * UniqueConsumerIdentifier
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class UniqueConsumerIdentifier   {
  @JsonProperty("value")
  private String value = null;

  @JsonProperty("verificationIndicator")
  private String verificationIndicator = null;

  public UniqueConsumerIdentifier value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Present when UniqueConsumerIdentifier is requested on input. This is unique for a company and a consumer.
   * @return value
  **/
  @ApiModelProperty(value = "Present when UniqueConsumerIdentifier is requested on input. This is unique for a company and a consumer.")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public UniqueConsumerIdentifier verificationIndicator(String verificationIndicator) {
    this.verificationIndicator = verificationIndicator;
    return this;
  }

  /**
   * Verification result When ConsumerIdentifier verification is requested on input.
   * @return verificationIndicator
  **/
  @ApiModelProperty(value = "Verification result When ConsumerIdentifier verification is requested on input.")
  
    public String getVerificationIndicator() {
    return verificationIndicator;
  }

  public void setVerificationIndicator(String verificationIndicator) {
    this.verificationIndicator = verificationIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniqueConsumerIdentifier uniqueConsumerIdentifier = (UniqueConsumerIdentifier) o;
    return Objects.equals(this.value, uniqueConsumerIdentifier.value) &&
        Objects.equals(this.verificationIndicator, uniqueConsumerIdentifier.verificationIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, verificationIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniqueConsumerIdentifier {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    verificationIndicator: ").append(toIndentedString(verificationIndicator)).append("\n");
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
