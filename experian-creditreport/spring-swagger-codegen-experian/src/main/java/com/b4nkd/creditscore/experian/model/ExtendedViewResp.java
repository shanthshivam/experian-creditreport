package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.AttributeResp;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Present when Extended View attributes are requested.
 */
@ApiModel(description = "Present when Extended View attributes are requested.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class ExtendedViewResp   {
  /**
   * This indicates what type of attributes are being returned
   */
  public enum CategoryCdEnum {
    _0("0"),
    
    _1("1"),
    
    _2("2");

    private String value;

    CategoryCdEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CategoryCdEnum fromValue(String text) {
      for (CategoryCdEnum b : CategoryCdEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("categoryCd")
  private CategoryCdEnum categoryCd = CategoryCdEnum._0;

  @JsonProperty("categoryTxt")
  private String categoryTxt = null;

  @JsonProperty("attribute")
  @Valid
  private List<AttributeResp> attribute = null;

  public ExtendedViewResp categoryCd(CategoryCdEnum categoryCd) {
    this.categoryCd = categoryCd;
    return this;
  }

  /**
   * This indicates what type of attributes are being returned
   * @return categoryCd
  **/
  @ApiModelProperty(value = "This indicates what type of attributes are being returned")
  
    public CategoryCdEnum getCategoryCd() {
    return categoryCd;
  }

  public void setCategoryCd(CategoryCdEnum categoryCd) {
    this.categoryCd = categoryCd;
  }

  public ExtendedViewResp categoryTxt(String categoryTxt) {
    this.categoryTxt = categoryTxt;
    return this;
  }

  /**
   * This explains the category of Extended View attributes It could be \"Experian Premier Attributes\" or \"Lexis Nexis Attributes\"
   * @return categoryTxt
  **/
  @ApiModelProperty(value = "This explains the category of Extended View attributes It could be \"Experian Premier Attributes\" or \"Lexis Nexis Attributes\"")
  
    public String getCategoryTxt() {
    return categoryTxt;
  }

  public void setCategoryTxt(String categoryTxt) {
    this.categoryTxt = categoryTxt;
  }

  public ExtendedViewResp attribute(List<AttributeResp> attribute) {
    this.attribute = attribute;
    return this;
  }

  public ExtendedViewResp addAttributeItem(AttributeResp attributeItem) {
    if (this.attribute == null) {
      this.attribute = new ArrayList<AttributeResp>();
    }
    this.attribute.add(attributeItem);
    return this;
  }

  /**
   * EV Attribute Information
   * @return attribute
  **/
  @ApiModelProperty(value = "EV Attribute Information")
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
    ExtendedViewResp extendedViewResp = (ExtendedViewResp) o;
    return Objects.equals(this.categoryCd, extendedViewResp.categoryCd) &&
        Objects.equals(this.categoryTxt, extendedViewResp.categoryTxt) &&
        Objects.equals(this.attribute, extendedViewResp.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryCd, categoryTxt, attribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedViewResp {\n");
    
    sb.append("    categoryCd: ").append(toIndentedString(categoryCd)).append("\n");
    sb.append("    categoryTxt: ").append(toIndentedString(categoryTxt)).append("\n");
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
