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
 * Information on the API requestor
 */
@ApiModel(description = "Information on the API requestor")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class Requestor   {
  @JsonProperty("subscriberCode")
  private String subscriberCode = "5991764";

  public Requestor subscriberCode(String subscriberCode) {
    this.subscriberCode = subscriberCode;
    return this;
  }

  /**
   * Subscriber Number assigned by Experian
   * @return subscriberCode
  **/
  @ApiModelProperty(required = true, value = "Subscriber Number assigned by Experian")
      @NotNull

    public String getSubscriberCode() {
    return subscriberCode;
  }

  public void setSubscriberCode(String subscriberCode) {
    this.subscriberCode = subscriberCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Requestor requestor = (Requestor) o;
    return Objects.equals(this.subscriberCode, requestor.subscriberCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriberCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Requestor {\n");
    
    sb.append("    subscriberCode: ").append(toIndentedString(subscriberCode)).append("\n");
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
