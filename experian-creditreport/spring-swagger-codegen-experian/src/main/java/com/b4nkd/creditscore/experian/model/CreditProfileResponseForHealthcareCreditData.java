package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.CreditProfileRespForHealthcareCreditData;
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
 * CreditProfileResponseForHealthcareCreditData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class CreditProfileResponseForHealthcareCreditData   {
  @JsonProperty("creditProfile")
  @Valid
  private List<CreditProfileRespForHealthcareCreditData> creditProfile = null;

  public CreditProfileResponseForHealthcareCreditData creditProfile(List<CreditProfileRespForHealthcareCreditData> creditProfile) {
    this.creditProfile = creditProfile;
    return this;
  }

  public CreditProfileResponseForHealthcareCreditData addCreditProfileItem(CreditProfileRespForHealthcareCreditData creditProfileItem) {
    if (this.creditProfile == null) {
      this.creditProfile = new ArrayList<CreditProfileRespForHealthcareCreditData>();
    }
    this.creditProfile.add(creditProfileItem);
    return this;
  }

  /**
   * Healthcare Credit Profile Response
   * @return creditProfile
  **/
  @ApiModelProperty(value = "Healthcare Credit Profile Response")
      @Valid
    public List<CreditProfileRespForHealthcareCreditData> getCreditProfile() {
    return creditProfile;
  }

  public void setCreditProfile(List<CreditProfileRespForHealthcareCreditData> creditProfile) {
    this.creditProfile = creditProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditProfileResponseForHealthcareCreditData creditProfileResponseForHealthcareCreditData = (CreditProfileResponseForHealthcareCreditData) o;
    return Objects.equals(this.creditProfile, creditProfileResponseForHealthcareCreditData.creditProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditProfileResponseForHealthcareCreditData {\n");
    
    sb.append("    creditProfile: ").append(toIndentedString(creditProfile)).append("\n");
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
