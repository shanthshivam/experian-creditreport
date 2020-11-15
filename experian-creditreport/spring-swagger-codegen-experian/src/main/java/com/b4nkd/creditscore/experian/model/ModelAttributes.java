package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.ModelAttributesResp0;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ModelAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class ModelAttributes   {
  @JsonProperty("message")
  private String message = "";

  @JsonProperty("modelAttributes")
  private ModelAttributesResp0 modelAttributes = null;

  public ModelAttributes message(String message) {
    this.message = message;
    return this;
  }

  /**
   * 00=attribute data present.  90=attribute data not present.
   * @return message
  **/
  @ApiModelProperty(value = "00=attribute data present.  90=attribute data not present.")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ModelAttributes modelAttributes(ModelAttributesResp0 modelAttributes) {
    this.modelAttributes = modelAttributes;
    return this;
  }

  /**
   * Get modelAttributes
   * @return modelAttributes
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ModelAttributesResp0 getModelAttributes() {
    return modelAttributes;
  }

  public void setModelAttributes(ModelAttributesResp0 modelAttributes) {
    this.modelAttributes = modelAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAttributes modelAttributes = (ModelAttributes) o;
    return Objects.equals(this.message, modelAttributes.message) &&
        Objects.equals(this.modelAttributes, modelAttributes.modelAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, modelAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAttributes {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modelAttributes: ").append(toIndentedString(modelAttributes)).append("\n");
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
