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
 * ModelAttributesResp1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class ModelAttributesResp1   {
  @JsonProperty("modelTypeIndicator")
  private String modelTypeIndicator = "";

  @JsonProperty("variableName")
  private String variableName = "";

  @JsonProperty("signofAttribute")
  private String signofAttribute = "";

  @JsonProperty("attributeValue")
  private String attributeValue = "";

  public ModelAttributesResp1 modelTypeIndicator(String modelTypeIndicator) {
    this.modelTypeIndicator = modelTypeIndicator;
    return this;
  }

  /**
   * Model Type Indicator.
   * @return modelTypeIndicator
  **/
  @ApiModelProperty(value = "Model Type Indicator.")
  
    public String getModelTypeIndicator() {
    return modelTypeIndicator;
  }

  public void setModelTypeIndicator(String modelTypeIndicator) {
    this.modelTypeIndicator = modelTypeIndicator;
  }

  public ModelAttributesResp1 variableName(String variableName) {
    this.variableName = variableName;
    return this;
  }

  /**
   * Mapped/Translated Variable Name.
   * @return variableName
  **/
  @ApiModelProperty(value = "Mapped/Translated Variable Name.")
  
    public String getVariableName() {
    return variableName;
  }

  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }

  public ModelAttributesResp1 signofAttribute(String signofAttribute) {
    this.signofAttribute = signofAttribute;
    return this;
  }

  /**
   * Model Sign of Attribute.
   * @return signofAttribute
  **/
  @ApiModelProperty(value = "Model Sign of Attribute.")
  
    public String getSignofAttribute() {
    return signofAttribute;
  }

  public void setSignofAttribute(String signofAttribute) {
    this.signofAttribute = signofAttribute;
  }

  public ModelAttributesResp1 attributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

  /**
   * Model attribute value data.
   * @return attributeValue
  **/
  @ApiModelProperty(value = "Model attribute value data.")
  
    public String getAttributeValue() {
    return attributeValue;
  }

  public void setAttributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAttributesResp1 modelAttributesResp1 = (ModelAttributesResp1) o;
    return Objects.equals(this.modelTypeIndicator, modelAttributesResp1.modelTypeIndicator) &&
        Objects.equals(this.variableName, modelAttributesResp1.variableName) &&
        Objects.equals(this.signofAttribute, modelAttributesResp1.signofAttribute) &&
        Objects.equals(this.attributeValue, modelAttributesResp1.attributeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelTypeIndicator, variableName, signofAttribute, attributeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAttributesResp1 {\n");
    
    sb.append("    modelTypeIndicator: ").append(toIndentedString(modelTypeIndicator)).append("\n");
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    signofAttribute: ").append(toIndentedString(signofAttribute)).append("\n");
    sb.append("    attributeValue: ").append(toIndentedString(attributeValue)).append("\n");
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
