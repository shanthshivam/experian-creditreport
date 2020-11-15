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
 * Present when \&quot;mla\&quot; is requested on input or via subcode and is allowed for the subcode.
 */
@ApiModel(description = "Present when \"mla\" is requested on input or via subcode and is allowed for the subcode.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class MlaResp   {
  @JsonProperty("messageNumber")
  private String messageNumber = "";

  @JsonProperty("messageText")
  private String messageText = "";

  public MlaResp messageNumber(String messageNumber) {
    this.messageNumber = messageNumber;
    return this;
  }

  /**
   * Message Number for mla.
   * @return messageNumber
  **/
  @ApiModelProperty(value = "Message Number for mla.")
  
    public String getMessageNumber() {
    return messageNumber;
  }

  public void setMessageNumber(String messageNumber) {
    this.messageNumber = messageNumber;
  }

  public MlaResp messageText(String messageText) {
    this.messageText = messageText;
    return this;
  }

  /**
   * Message Text matching message number is output in this element. 
   * @return messageText
  **/
  @ApiModelProperty(value = "Message Text matching message number is output in this element. ")
  
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
    MlaResp mlaResp = (MlaResp) o;
    return Objects.equals(this.messageNumber, mlaResp.messageNumber) &&
        Objects.equals(this.messageText, mlaResp.messageText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageNumber, messageText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MlaResp {\n");
    
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
