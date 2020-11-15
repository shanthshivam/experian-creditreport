package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.Dob;
import com.b4nkd.creditscore.experian.model.DriverLicense;
import com.b4nkd.creditscore.experian.model.Employment;
import com.b4nkd.creditscore.experian.model.Phone;
import com.b4nkd.creditscore.experian.model.SAName;
import com.b4nkd.creditscore.experian.model.Ssn;
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
 * Secondary Credit Applicant Information
 */
@ApiModel(description = "Secondary Credit Applicant Information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class SecondaryApplicant   {
  @JsonProperty("name")
  private SAName name = null;

  @JsonProperty("dob")
  private Dob dob = null;

  @JsonProperty("ssn")
  private Ssn ssn = null;

  @JsonProperty("driverslicense")
  private DriverLicense driverslicense = null;

  @JsonProperty("phone")
  @Valid
  private List<Phone> phone = null;

  @JsonProperty("employment")
  private Employment employment = null;

  public SecondaryApplicant name(SAName name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SAName getName() {
    return name;
  }

  public void setName(SAName name) {
    this.name = name;
  }

  public SecondaryApplicant dob(Dob dob) {
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

  public SecondaryApplicant ssn(Ssn ssn) {
    this.ssn = ssn;
    return this;
  }

  /**
   * Get ssn
   * @return ssn
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Ssn getSsn() {
    return ssn;
  }

  public void setSsn(Ssn ssn) {
    this.ssn = ssn;
  }

  public SecondaryApplicant driverslicense(DriverLicense driverslicense) {
    this.driverslicense = driverslicense;
    return this;
  }

  /**
   * Get driverslicense
   * @return driverslicense
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public DriverLicense getDriverslicense() {
    return driverslicense;
  }

  public void setDriverslicense(DriverLicense driverslicense) {
    this.driverslicense = driverslicense;
  }

  public SecondaryApplicant phone(List<Phone> phone) {
    this.phone = phone;
    return this;
  }

  public SecondaryApplicant addPhoneItem(Phone phoneItem) {
    if (this.phone == null) {
      this.phone = new ArrayList<Phone>();
    }
    this.phone.add(phoneItem);
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<Phone> getPhone() {
    return phone;
  }

  public void setPhone(List<Phone> phone) {
    this.phone = phone;
  }

  public SecondaryApplicant employment(Employment employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Employment getEmployment() {
    return employment;
  }

  public void setEmployment(Employment employment) {
    this.employment = employment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecondaryApplicant secondaryApplicant = (SecondaryApplicant) o;
    return Objects.equals(this.name, secondaryApplicant.name) &&
        Objects.equals(this.dob, secondaryApplicant.dob) &&
        Objects.equals(this.ssn, secondaryApplicant.ssn) &&
        Objects.equals(this.driverslicense, secondaryApplicant.driverslicense) &&
        Objects.equals(this.phone, secondaryApplicant.phone) &&
        Objects.equals(this.employment, secondaryApplicant.employment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dob, ssn, driverslicense, phone, employment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondaryApplicant {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    driverslicense: ").append(toIndentedString(driverslicense)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
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
