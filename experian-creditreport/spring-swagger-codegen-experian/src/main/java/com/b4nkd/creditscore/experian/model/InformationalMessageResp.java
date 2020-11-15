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
 * InformationalMessageResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class InformationalMessageResp   {
  @JsonProperty("messageNumber")
  private String messageNumber = "84";

  @JsonProperty("messageNumberDetailed")
  private String messageNumberDetailed = "0084";

  @JsonProperty("messageText")
  private String messageText = "PRODUCT OPTION NOT ALLOWED";

  public InformationalMessageResp messageNumber(String messageNumber) {
    this.messageNumber = messageNumber;
    return this;
  }

  /**
   * Contains the last two digits for the message.
   * @return messageNumber
  **/
  @ApiModelProperty(value = "Contains the last two digits for the message.")
  
    public String getMessageNumber() {
    return messageNumber;
  }

  public void setMessageNumber(String messageNumber) {
    this.messageNumber = messageNumber;
  }

  public InformationalMessageResp messageNumberDetailed(String messageNumberDetailed) {
    this.messageNumberDetailed = messageNumberDetailed;
    return this;
  }

  /**
   * The Full Four Digit Number for the message.
   * @return messageNumberDetailed
  **/
  @ApiModelProperty(value = "The Full Four Digit Number for the message.")
  
    public String getMessageNumberDetailed() {
    return messageNumberDetailed;
  }

  public void setMessageNumberDetailed(String messageNumberDetailed) {
    this.messageNumberDetailed = messageNumberDetailed;
  }

  public InformationalMessageResp messageText(String messageText) {
    this.messageText = messageText;
    return this;
  }

  /**
   * The message text for the corresponding message number.
   * @return messageText
  **/
  @ApiModelProperty(value = "The message text for the corresponding message number.")
  
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
    InformationalMessageResp informationalMessageResp = (InformationalMessageResp) o;
    return Objects.equals(this.messageNumber, informationalMessageResp.messageNumber) &&
        Objects.equals(this.messageNumberDetailed, informationalMessageResp.messageNumberDetailed) &&
        Objects.equals(this.messageText, informationalMessageResp.messageText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageNumber, messageNumberDetailed, messageText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformationalMessageResp {\n");
    
    sb.append("    messageNumber: ").append(toIndentedString(messageNumber)).append("\n");
    sb.append("    messageNumberDetailed: ").append(toIndentedString(messageNumberDetailed)).append("\n");
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
