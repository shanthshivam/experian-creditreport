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
 * TtyResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class TtyResponse   {
  @JsonProperty("ttyResponse")
  private String ttyResponse = null;

  public TtyResponse ttyResponse(String ttyResponse) {
    this.ttyResponse = ttyResponse;
    return this;
  }

  /**
   * TTY response returns
   * @return ttyResponse
  **/
  @ApiModelProperty(value = "TTY response returns")
  
    public String getTtyResponse() {
    return ttyResponse;
  }

  public void setTtyResponse(String ttyResponse) {
    this.ttyResponse = ttyResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TtyResponse ttyResponse = (TtyResponse) o;
    return Objects.equals(this.ttyResponse, ttyResponse.ttyResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ttyResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TtyResponse {\n");
    
    sb.append("    ttyResponse: ").append(toIndentedString(ttyResponse)).append("\n");
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
