package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
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
 * Ancillary Credit Reporting Options (Client custom options if any that have been setup) that can be requested by client. Multiple options can be requested here.
 */
@ApiModel(description = "Ancillary Credit Reporting Options (Client custom options if any that have been setup) that can be requested by client. Multiple options can be requested here.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class CustomOptions   {
  @JsonProperty("optionId")
  @Valid
  private List<String> optionId = null;

  public CustomOptions optionId(List<String> optionId) {
    this.optionId = optionId;
    return this;
  }

  public CustomOptions addOptionIdItem(String optionIdItem) {
    if (this.optionId == null) {
      this.optionId = new ArrayList<String>();
    }
    this.optionId.add(optionIdItem);
    return this;
  }

  /**
   * Get optionId
   * @return optionId
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getOptionId() {
    return optionId;
  }

  public void setOptionId(List<String> optionId) {
    this.optionId = optionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomOptions customOptions = (CustomOptions) o;
    return Objects.equals(this.optionId, customOptions.optionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomOptions {\n");
    
    sb.append("    optionId: ").append(toIndentedString(optionId)).append("\n");
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
