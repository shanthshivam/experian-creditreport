package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.Address;
import com.b4nkd.creditscore.experian.model.Dob;
import com.b4nkd.creditscore.experian.model.DriverLicense;
import com.b4nkd.creditscore.experian.model.Employment;
import com.b4nkd.creditscore.experian.model.PAName;
import com.b4nkd.creditscore.experian.model.Phone;
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
 * Primary Credit Applicant Information
 */
@ApiModel(description = "Primary Credit Applicant Information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class PrimaryApplicant   {
  @JsonProperty("name")
  private PAName name = null;

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

  @JsonProperty("currentAddress")
  private Address currentAddress = null;

  @JsonProperty("previousAddress")
  @Valid
  private List<Address> previousAddress = null;

  public PrimaryApplicant name(PAName name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public PAName getName() {
    return name;
  }

  public void setName(PAName name) {
    this.name = name;
  }

  public PrimaryApplicant dob(Dob dob) {
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

  public PrimaryApplicant ssn(Ssn ssn) {
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

  public PrimaryApplicant driverslicense(DriverLicense driverslicense) {
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

  public PrimaryApplicant phone(List<Phone> phone) {
    this.phone = phone;
    return this;
  }

  public PrimaryApplicant addPhoneItem(Phone phoneItem) {
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

  public PrimaryApplicant employment(Employment employment) {
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

  public PrimaryApplicant currentAddress(Address currentAddress) {
    this.currentAddress = currentAddress;
    return this;
  }

  /**
   * Get currentAddress
   * @return currentAddress
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Address getCurrentAddress() {
    return currentAddress;
  }

  public void setCurrentAddress(Address currentAddress) {
    this.currentAddress = currentAddress;
  }

  public PrimaryApplicant previousAddress(List<Address> previousAddress) {
    this.previousAddress = previousAddress;
    return this;
  }

  public PrimaryApplicant addPreviousAddressItem(Address previousAddressItem) {
    if (this.previousAddress == null) {
      this.previousAddress = new ArrayList<Address>();
    }
    this.previousAddress.add(previousAddressItem);
    return this;
  }

  /**
   * Get previousAddress
   * @return previousAddress
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<Address> getPreviousAddress() {
    return previousAddress;
  }

  public void setPreviousAddress(List<Address> previousAddress) {
    this.previousAddress = previousAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrimaryApplicant primaryApplicant = (PrimaryApplicant) o;
    return Objects.equals(this.name, primaryApplicant.name) &&
        Objects.equals(this.dob, primaryApplicant.dob) &&
        Objects.equals(this.ssn, primaryApplicant.ssn) &&
        Objects.equals(this.driverslicense, primaryApplicant.driverslicense) &&
        Objects.equals(this.phone, primaryApplicant.phone) &&
        Objects.equals(this.employment, primaryApplicant.employment) &&
        Objects.equals(this.currentAddress, primaryApplicant.currentAddress) &&
        Objects.equals(this.previousAddress, primaryApplicant.previousAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dob, ssn, driverslicense, phone, employment, currentAddress, previousAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrimaryApplicant {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    driverslicense: ").append(toIndentedString(driverslicense)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    currentAddress: ").append(toIndentedString(currentAddress)).append("\n");
    sb.append("    previousAddress: ").append(toIndentedString(previousAddress)).append("\n");
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
