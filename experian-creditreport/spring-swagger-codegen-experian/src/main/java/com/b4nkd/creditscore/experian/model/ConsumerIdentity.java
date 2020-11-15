package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.ConsumerIdentityName;
import com.b4nkd.creditscore.experian.model.ConsumerIdentityPhone;
import com.b4nkd.creditscore.experian.model.Dob;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsumerIdentity
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class ConsumerIdentity   {
  @JsonProperty("dob")
  private Dob dob = null;

  @JsonProperty("name")
  private ConsumerIdentityName name = null;

  @JsonProperty("phone")
  private ConsumerIdentityPhone phone = null;

  public ConsumerIdentity dob(Dob dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Dob getDob() {
    return dob;
  }

  public void setDob(Dob dob) {
    this.dob = dob;
  }

  public ConsumerIdentity name(ConsumerIdentityName name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerIdentityName getName() {
    return name;
  }

  public void setName(ConsumerIdentityName name) {
    this.name = name;
  }

  public ConsumerIdentity phone(ConsumerIdentityPhone phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerIdentityPhone getPhone() {
    return phone;
  }

  public void setPhone(ConsumerIdentityPhone phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerIdentity consumerIdentity = (ConsumerIdentity) o;
    return Objects.equals(this.dob, consumerIdentity.dob) &&
        Objects.equals(this.name, consumerIdentity.name) &&
        Objects.equals(this.phone, consumerIdentity.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dob, name, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerIdentity {\n");
    
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
