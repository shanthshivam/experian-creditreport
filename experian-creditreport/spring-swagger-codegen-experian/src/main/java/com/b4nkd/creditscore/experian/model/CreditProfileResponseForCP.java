package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.Arf;
import com.b4nkd.creditscore.experian.model.CreditProfileRespForCP;
import com.b4nkd.creditscore.experian.model.TtyResponse;
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
 * CreditProfileResponseForCP
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class CreditProfileResponseForCP   {
  @JsonProperty("creditProfile")
  @Valid
  private List<CreditProfileRespForCP> creditProfile = null;

  @JsonProperty("arf")
  private Arf arf = null;

  @JsonProperty("tty")
  private TtyResponse tty = null;

  public CreditProfileResponseForCP creditProfile(List<CreditProfileRespForCP> creditProfile) {
    this.creditProfile = creditProfile;
    return this;
  }

  public CreditProfileResponseForCP addCreditProfileItem(CreditProfileRespForCP creditProfileItem) {
    if (this.creditProfile == null) {
      this.creditProfile = new ArrayList<CreditProfileRespForCP>();
    }
    this.creditProfile.add(creditProfileItem);
    return this;
  }

  /**
   * Credit Profile Response
   * @return creditProfile
  **/
  @ApiModelProperty(value = "Credit Profile Response")
      @Valid
    public List<CreditProfileRespForCP> getCreditProfile() {
    return creditProfile;
  }

  public void setCreditProfile(List<CreditProfileRespForCP> creditProfile) {
    this.creditProfile = creditProfile;
  }

  public CreditProfileResponseForCP arf(Arf arf) {
    this.arf = arf;
    return this;
  }

  /**
   * Get arf
   * @return arf
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Arf getArf() {
    return arf;
  }

  public void setArf(Arf arf) {
    this.arf = arf;
  }

  public CreditProfileResponseForCP tty(TtyResponse tty) {
    this.tty = tty;
    return this;
  }

  /**
   * Get tty
   * @return tty
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TtyResponse getTty() {
    return tty;
  }

  public void setTty(TtyResponse tty) {
    this.tty = tty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditProfileResponseForCP creditProfileResponseForCP = (CreditProfileResponseForCP) o;
    return Objects.equals(this.creditProfile, creditProfileResponseForCP.creditProfile) &&
        Objects.equals(this.arf, creditProfileResponseForCP.arf) &&
        Objects.equals(this.tty, creditProfileResponseForCP.tty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditProfile, arf, tty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditProfileResponseForCP {\n");
    
    sb.append("    creditProfile: ").append(toIndentedString(creditProfile)).append("\n");
    sb.append("    arf: ").append(toIndentedString(arf)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
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
