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
 * Arf
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class Arf   {
  @JsonProperty("arfResponse")
  private String arfResponse = null;

  public Arf arfResponse(String arfResponse) {
    this.arfResponse = arfResponse;
    return this;
  }

  /**
   * Raw arf returns
   * @return arfResponse
  **/
  @ApiModelProperty(value = "Raw arf returns")
  
    public String getArfResponse() {
    return arfResponse;
  }

  public void setArfResponse(String arfResponse) {
    this.arfResponse = arfResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Arf arf = (Arf) o;
    return Objects.equals(this.arfResponse, arf.arfResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arfResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Arf {\n");
    
    sb.append("    arfResponse: ").append(toIndentedString(arfResponse)).append("\n");
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
