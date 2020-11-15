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
 * EndTotalsResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class EndTotalsResp   {
  @JsonProperty("totalSegments")
  private String totalSegments = "20";

  @JsonProperty("totalLength")
  private String totalLength = "5000";

  public EndTotalsResp totalSegments(String totalSegments) {
    this.totalSegments = totalSegments;
    return this;
  }

  /**
   * Total number of segments in report.
   * @return totalSegments
  **/
  @ApiModelProperty(value = "Total number of segments in report.")
  
    public String getTotalSegments() {
    return totalSegments;
  }

  public void setTotalSegments(String totalSegments) {
    this.totalSegments = totalSegments;
  }

  public EndTotalsResp totalLength(String totalLength) {
    this.totalLength = totalLength;
    return this;
  }

  /**
   * Length of report in bytes.
   * @return totalLength
  **/
  @ApiModelProperty(value = "Length of report in bytes.")
  
    public String getTotalLength() {
    return totalLength;
  }

  public void setTotalLength(String totalLength) {
    this.totalLength = totalLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndTotalsResp endTotalsResp = (EndTotalsResp) o;
    return Objects.equals(this.totalSegments, endTotalsResp.totalSegments) &&
        Objects.equals(this.totalLength, endTotalsResp.totalLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalSegments, totalLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndTotalsResp {\n");
    
    sb.append("    totalSegments: ").append(toIndentedString(totalSegments)).append("\n");
    sb.append("    totalLength: ").append(toIndentedString(totalLength)).append("\n");
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
