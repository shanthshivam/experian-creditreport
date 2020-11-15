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
 * infoId3 contains additional properties or parameters needed by Decisioning to complete the request.
 */
@ApiModel(description = "infoId3 contains additional properties or parameters needed by Decisioning to complete the request.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class InfoId3   {
  @JsonProperty("item")
  @Valid
  private List<String> item = null;

  public InfoId3 item(List<String> item) {
    this.item = item;
    return this;
  }

  public InfoId3 addItemItem(String itemItem) {
    if (this.item == null) {
      this.item = new ArrayList<String>();
    }
    this.item.add(itemItem);
    return this;
  }

  /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getItem() {
    return item;
  }

  public void setItem(List<String> item) {
    this.item = item;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoId3 infoId3 = (InfoId3) o;
    return Objects.equals(this.item, infoId3.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoId3 {\n");
    
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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
