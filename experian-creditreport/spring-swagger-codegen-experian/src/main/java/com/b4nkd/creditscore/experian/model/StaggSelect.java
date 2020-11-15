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
 * Present when staggSelect is requested on Input.
 */
@ApiModel(description = "Present when staggSelect is requested on Input.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class StaggSelect   {
  @JsonProperty("message")
  private String message = "0";

  @JsonProperty("attribute")
  @Valid
  private List<AttributeResp> attribute = null;

  public StaggSelect message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message Number that indicates whether Stagg Attributes V1.2B are avaiable for the consumer.
   * @return message
  **/
  @ApiModelProperty(value = "Message Number that indicates whether Stagg Attributes V1.2B are avaiable for the consumer.")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public StaggSelect attribute(List<AttributeResp> attribute) {
    this.attribute = attribute;
    return this;
  }

  public StaggSelect addAttributeItem(AttributeResp attributeItem) {
    if (this.attribute == null) {
      this.attribute = new ArrayList<AttributeResp>();
    }
    this.attribute.add(attributeItem);
    return this;
  }

  /**
   * Stagg Attribute Information
   * @return attribute
  **/
  @ApiModelProperty(value = "Stagg Attribute Information")
      @Valid
    public List<AttributeResp> getAttribute() {
    return attribute;
  }

  public void setAttribute(List<AttributeResp> attribute) {
    this.attribute = attribute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaggSelect staggSelect = (StaggSelect) o;
    return Objects.equals(this.message, staggSelect.message) &&
        Objects.equals(this.attribute, staggSelect.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, attribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaggSelect {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
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
