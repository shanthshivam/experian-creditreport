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
 * DirectCheckResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class DirectCheckResp   {
  @JsonProperty("subscriberAddress")
  private String subscriberAddress = "10655 N BIRCH ST";

  @JsonProperty("subscriberCity")
  private String subscriberCity = "CA";

  @JsonProperty("subscriberCode")
  private String subscriberCode = "0";

  @JsonProperty("subscriberName")
  private String subscriberName = "BANK";

  @JsonProperty("subscriberPhone")
  private String subscriberPhone = "BYMAILONLY";

  @JsonProperty("subscriberState")
  private String subscriberState = "CA";

  @JsonProperty("subscriberZipCode")
  private String subscriberZipCode = "91502";

  public DirectCheckResp subscriberAddress(String subscriberAddress) {
    this.subscriberAddress = subscriberAddress;
    return this;
  }

  /**
   * Subscriber's Address
   * @return subscriberAddress
  **/
  @ApiModelProperty(value = "Subscriber's Address")
  
    public String getSubscriberAddress() {
    return subscriberAddress;
  }

  public void setSubscriberAddress(String subscriberAddress) {
    this.subscriberAddress = subscriberAddress;
  }

  public DirectCheckResp subscriberCity(String subscriberCity) {
    this.subscriberCity = subscriberCity;
    return this;
  }

  /**
   * Subscriber's City
   * @return subscriberCity
  **/
  @ApiModelProperty(value = "Subscriber's City")
  
    public String getSubscriberCity() {
    return subscriberCity;
  }

  public void setSubscriberCity(String subscriberCity) {
    this.subscriberCity = subscriberCity;
  }

  public DirectCheckResp subscriberCode(String subscriberCode) {
    this.subscriberCode = subscriberCode;
    return this;
  }

  /**
   * Experian assigned number.
   * @return subscriberCode
  **/
  @ApiModelProperty(value = "Experian assigned number.")
  
    public String getSubscriberCode() {
    return subscriberCode;
  }

  public void setSubscriberCode(String subscriberCode) {
    this.subscriberCode = subscriberCode;
  }

  public DirectCheckResp subscriberName(String subscriberName) {
    this.subscriberName = subscriberName;
    return this;
  }

  /**
   * Name of subscriber
   * @return subscriberName
  **/
  @ApiModelProperty(value = "Name of subscriber")
  
    public String getSubscriberName() {
    return subscriberName;
  }

  public void setSubscriberName(String subscriberName) {
    this.subscriberName = subscriberName;
  }

  public DirectCheckResp subscriberPhone(String subscriberPhone) {
    this.subscriberPhone = subscriberPhone;
    return this;
  }

  /**
   * Telephone number of subscriber or \"BYMAILONLY\"
   * @return subscriberPhone
  **/
  @ApiModelProperty(value = "Telephone number of subscriber or \"BYMAILONLY\"")
  
    public String getSubscriberPhone() {
    return subscriberPhone;
  }

  public void setSubscriberPhone(String subscriberPhone) {
    this.subscriberPhone = subscriberPhone;
  }

  public DirectCheckResp subscriberState(String subscriberState) {
    this.subscriberState = subscriberState;
    return this;
  }

  /**
   * Two-digit state code.
   * @return subscriberState
  **/
  @ApiModelProperty(value = "Two-digit state code.")
  
    public String getSubscriberState() {
    return subscriberState;
  }

  public void setSubscriberState(String subscriberState) {
    this.subscriberState = subscriberState;
  }

  public DirectCheckResp subscriberZipCode(String subscriberZipCode) {
    this.subscriberZipCode = subscriberZipCode;
    return this;
  }

  /**
   * Subscriber's Zip Code.
   * @return subscriberZipCode
  **/
  @ApiModelProperty(value = "Subscriber's Zip Code.")
  
    public String getSubscriberZipCode() {
    return subscriberZipCode;
  }

  public void setSubscriberZipCode(String subscriberZipCode) {
    this.subscriberZipCode = subscriberZipCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectCheckResp directCheckResp = (DirectCheckResp) o;
    return Objects.equals(this.subscriberAddress, directCheckResp.subscriberAddress) &&
        Objects.equals(this.subscriberCity, directCheckResp.subscriberCity) &&
        Objects.equals(this.subscriberCode, directCheckResp.subscriberCode) &&
        Objects.equals(this.subscriberName, directCheckResp.subscriberName) &&
        Objects.equals(this.subscriberPhone, directCheckResp.subscriberPhone) &&
        Objects.equals(this.subscriberState, directCheckResp.subscriberState) &&
        Objects.equals(this.subscriberZipCode, directCheckResp.subscriberZipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriberAddress, subscriberCity, subscriberCode, subscriberName, subscriberPhone, subscriberState, subscriberZipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectCheckResp {\n");
    
    sb.append("    subscriberAddress: ").append(toIndentedString(subscriberAddress)).append("\n");
    sb.append("    subscriberCity: ").append(toIndentedString(subscriberCity)).append("\n");
    sb.append("    subscriberCode: ").append(toIndentedString(subscriberCode)).append("\n");
    sb.append("    subscriberName: ").append(toIndentedString(subscriberName)).append("\n");
    sb.append("    subscriberPhone: ").append(toIndentedString(subscriberPhone)).append("\n");
    sb.append("    subscriberState: ").append(toIndentedString(subscriberState)).append("\n");
    sb.append("    subscriberZipCode: ").append(toIndentedString(subscriberZipCode)).append("\n");
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
