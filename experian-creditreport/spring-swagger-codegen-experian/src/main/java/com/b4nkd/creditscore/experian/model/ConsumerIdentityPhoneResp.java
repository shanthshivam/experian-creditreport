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
 * ConsumerIdentityPhoneResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class ConsumerIdentityPhoneResp   {
  @JsonProperty("number")
  private String number = "5555555555";

  @JsonProperty("source")
  private String source = "I";

  @JsonProperty("type")
  private String type = "";

  public ConsumerIdentityPhoneResp number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Consumer Phone Number. 
   * @return number
  **/
  @ApiModelProperty(value = "Consumer Phone Number. ")
  
    public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public ConsumerIdentityPhoneResp source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Phone Source.
   * @return source
  **/
  @ApiModelProperty(value = "Phone Source.")
  
    public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ConsumerIdentityPhoneResp type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Phone number type
   * @return type
  **/
  @ApiModelProperty(value = "Phone number type")
  
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
    ConsumerIdentityPhoneResp consumerIdentityPhoneResp = (ConsumerIdentityPhoneResp) o;
    return Objects.equals(this.number, consumerIdentityPhoneResp.number) &&
        Objects.equals(this.source, consumerIdentityPhoneResp.source) &&
        Objects.equals(this.type, consumerIdentityPhoneResp.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, source, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerIdentityPhoneResp {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
