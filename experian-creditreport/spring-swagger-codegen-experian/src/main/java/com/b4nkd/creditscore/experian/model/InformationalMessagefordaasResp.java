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
 * InformationalMessagefordaasResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class InformationalMessagefordaasResp   {
  @JsonProperty("messageNumber")
  private String messageNumber = "84";

  @JsonProperty("messageText")
  private String messageText = "PRODUCT OPTION NOT ALLOWED";

  public InformationalMessagefordaasResp messageNumber(String messageNumber) {
    this.messageNumber = messageNumber;
    return this;
  }

  /**
   * Contains the two digit Message Code.
   * @return messageNumber
  **/
  @ApiModelProperty(value = "Contains the two digit Message Code.")
  
    public String getMessageNumber() {
    return messageNumber;
  }

  public void setMessageNumber(String messageNumber) {
    this.messageNumber = messageNumber;
  }

  public InformationalMessagefordaasResp messageText(String messageText) {
    this.messageText = messageText;
    return this;
  }

  /**
   * The message customized Message Text area.
   * @return messageText
  **/
  @ApiModelProperty(value = "The message customized Message Text area.")
  
    public String getMessageText() {
    return messageText;
  }

  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InformationalMessagefordaasResp informationalMessagefordaasResp = (InformationalMessagefordaasResp) o;
    return Objects.equals(this.messageNumber, informationalMessagefordaasResp.messageNumber) &&
        Objects.equals(this.messageText, informationalMessagefordaasResp.messageText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageNumber, messageText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformationalMessagefordaasResp {\n");
    
    sb.append("    messageNumber: ").append(toIndentedString(messageNumber)).append("\n");
    sb.append("    messageText: ").append(toIndentedString(messageText)).append("\n");
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
