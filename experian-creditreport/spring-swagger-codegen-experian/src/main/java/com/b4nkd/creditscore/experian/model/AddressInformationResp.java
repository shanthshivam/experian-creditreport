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
 * Best Consumer Addresses
 */
@ApiModel(description = "Best Consumer Addresses")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class AddressInformationResp   {
  @JsonProperty("censusGeoCode")
  private String censusGeoCode = "4567890";

  @JsonProperty("city")
  private String city = "BURBANK";

  @JsonProperty("countyCode")
  private String countyCode = "123";

  @JsonProperty("dwellingType")
  private String dwellingType = null;

  @JsonProperty("firstReportedDate")
  private String firstReportedDate = "06011995";

  @JsonProperty("lastReportingSubscriberCode")
  private String lastReportingSubscriberCode = "1220855";

  @JsonProperty("lastUpdatedDate")
  private String lastUpdatedDate = "01011998";

  @JsonProperty("msaCode")
  private String msaCode = "0";

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("state")
  private String state = "CA";

  @JsonProperty("stateCode")
  private String stateCode = "0";

  @JsonProperty("streetName")
  private String streetName = "BIRCH";

  @JsonProperty("streetPrefix")
  private String streetPrefix = "10655 N";

  @JsonProperty("streetSuffix")
  private String streetSuffix = "ST";

  @JsonProperty("timesReported")
  private String timesReported = "1";

  @JsonProperty("unitId")
  private String unitId = "";

  @JsonProperty("unitType")
  private String unitType = "APT";

  @JsonProperty("zipCode")
  private String zipCode = "915021234";

  public AddressInformationResp censusGeoCode(String censusGeoCode) {
    this.censusGeoCode = censusGeoCode;
    return this;
  }

  /**
   * Address range that includes the address and the census geography the address is within
   * @return censusGeoCode
  **/
  @ApiModelProperty(value = "Address range that includes the address and the census geography the address is within")
  
    public String getCensusGeoCode() {
    return censusGeoCode;
  }

  public void setCensusGeoCode(String censusGeoCode) {
    this.censusGeoCode = censusGeoCode;
  }

  public AddressInformationResp city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City for the address.
   * @return city
  **/
  @ApiModelProperty(value = "City for the address.")
  
    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressInformationResp countyCode(String countyCode) {
    this.countyCode = countyCode;
    return this;
  }

  /**
   * County Code
   * @return countyCode
  **/
  @ApiModelProperty(value = "County Code")
  
    public String getCountyCode() {
    return countyCode;
  }

  public void setCountyCode(String countyCode) {
    this.countyCode = countyCode;
  }

  public AddressInformationResp dwellingType(String dwellingType) {
    this.dwellingType = dwellingType;
    return this;
  }

  /**
   * Structural Characteristic/Dwelling Configuration
   * @return dwellingType
  **/
  @ApiModelProperty(value = "Structural Characteristic/Dwelling Configuration")
  
    public String getDwellingType() {
    return dwellingType;
  }

  public void setDwellingType(String dwellingType) {
    this.dwellingType = dwellingType;
  }

  public AddressInformationResp firstReportedDate(String firstReportedDate) {
    this.firstReportedDate = firstReportedDate;
    return this;
  }

  /**
   * Date address first reported. Format = MMDDCCYY 
   * @return firstReportedDate
  **/
  @ApiModelProperty(value = "Date address first reported. Format = MMDDCCYY ")
  
    public String getFirstReportedDate() {
    return firstReportedDate;
  }

  public void setFirstReportedDate(String firstReportedDate) {
    this.firstReportedDate = firstReportedDate;
  }

  public AddressInformationResp lastReportingSubscriberCode(String lastReportingSubscriberCode) {
    this.lastReportingSubscriberCode = lastReportingSubscriberCode;
    return this;
  }

  /**
   * Last Subscriber reporting this address. May be blanks.
   * @return lastReportingSubscriberCode
  **/
  @ApiModelProperty(value = "Last Subscriber reporting this address. May be blanks.")
  
    public String getLastReportingSubscriberCode() {
    return lastReportingSubscriberCode;
  }

  public void setLastReportingSubscriberCode(String lastReportingSubscriberCode) {
    this.lastReportingSubscriberCode = lastReportingSubscriberCode;
  }

  public AddressInformationResp lastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

  /**
   * Date address last updated. Format = MMDDCCYY 
   * @return lastUpdatedDate
  **/
  @ApiModelProperty(value = "Date address last updated. Format = MMDDCCYY ")
  
    public String getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public AddressInformationResp msaCode(String msaCode) {
    this.msaCode = msaCode;
    return this;
  }

  /**
   * Metropolitan Statistical Area Code when DemographicsAll or DemographicsGeoCode is requested.
   * @return msaCode
  **/
  @ApiModelProperty(value = "Metropolitan Statistical Area Code when DemographicsAll or DemographicsGeoCode is requested.")
  
    public String getMsaCode() {
    return msaCode;
  }

  public void setMsaCode(String msaCode) {
    this.msaCode = msaCode;
  }

  public AddressInformationResp source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Source of Address
   * @return source
  **/
  @ApiModelProperty(value = "Source of Address")
  
    public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public AddressInformationResp state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Valid two-letter US state code or Canadian province. 
   * @return state
  **/
  @ApiModelProperty(value = "Valid two-letter US state code or Canadian province. ")
  
    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AddressInformationResp stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

  /**
   * State Geo Code when demographics = 1 or 2.
   * @return stateCode
  **/
  @ApiModelProperty(value = "State Geo Code when demographics = 1 or 2.")
  
    public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public AddressInformationResp streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Full street name. 
   * @return streetName
  **/
  @ApiModelProperty(value = "Full street name. ")
  
    public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public AddressInformationResp streetPrefix(String streetPrefix) {
    this.streetPrefix = streetPrefix;
    return this;
  }

  /**
   * Data that precedes the street name like house number and directional.
   * @return streetPrefix
  **/
  @ApiModelProperty(value = "Data that precedes the street name like house number and directional.")
  
    public String getStreetPrefix() {
    return streetPrefix;
  }

  public void setStreetPrefix(String streetPrefix) {
    this.streetPrefix = streetPrefix;
  }

  public AddressInformationResp streetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
    return this;
  }

  /**
   * Street name type like ST, LN.
   * @return streetSuffix
  **/
  @ApiModelProperty(value = "Street name type like ST, LN.")
  
    public String getStreetSuffix() {
    return streetSuffix;
  }

  public void setStreetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
  }

  public AddressInformationResp timesReported(String timesReported) {
    this.timesReported = timesReported;
    return this;
  }

  /**
   * Number of times the Address was reported to Experian.
   * @return timesReported
  **/
  @ApiModelProperty(value = "Number of times the Address was reported to Experian.")
  
    public String getTimesReported() {
    return timesReported;
  }

  public void setTimesReported(String timesReported) {
    this.timesReported = timesReported;
  }

  public AddressInformationResp unitId(String unitId) {
    this.unitId = unitId;
    return this;
  }

  /**
   * Unit Identifier for Apartment.
   * @return unitId
  **/
  @ApiModelProperty(value = "Unit Identifier for Apartment.")
  
    public String getUnitId() {
    return unitId;
  }

  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }

  public AddressInformationResp unitType(String unitType) {
    this.unitType = unitType;
    return this;
  }

  /**
   * Words such as apartment, suite, etc. 
   * @return unitType
  **/
  @ApiModelProperty(value = "Words such as apartment, suite, etc. ")
  
    public String getUnitType() {
    return unitType;
  }

  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }

  public AddressInformationResp zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * ZIP Code.
   * @return zipCode
  **/
  @ApiModelProperty(value = "ZIP Code.")
  
    public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressInformationResp addressInformationResp = (AddressInformationResp) o;
    return Objects.equals(this.censusGeoCode, addressInformationResp.censusGeoCode) &&
        Objects.equals(this.city, addressInformationResp.city) &&
        Objects.equals(this.countyCode, addressInformationResp.countyCode) &&
        Objects.equals(this.dwellingType, addressInformationResp.dwellingType) &&
        Objects.equals(this.firstReportedDate, addressInformationResp.firstReportedDate) &&
        Objects.equals(this.lastReportingSubscriberCode, addressInformationResp.lastReportingSubscriberCode) &&
        Objects.equals(this.lastUpdatedDate, addressInformationResp.lastUpdatedDate) &&
        Objects.equals(this.msaCode, addressInformationResp.msaCode) &&
        Objects.equals(this.source, addressInformationResp.source) &&
        Objects.equals(this.state, addressInformationResp.state) &&
        Objects.equals(this.stateCode, addressInformationResp.stateCode) &&
        Objects.equals(this.streetName, addressInformationResp.streetName) &&
        Objects.equals(this.streetPrefix, addressInformationResp.streetPrefix) &&
        Objects.equals(this.streetSuffix, addressInformationResp.streetSuffix) &&
        Objects.equals(this.timesReported, addressInformationResp.timesReported) &&
        Objects.equals(this.unitId, addressInformationResp.unitId) &&
        Objects.equals(this.unitType, addressInformationResp.unitType) &&
        Objects.equals(this.zipCode, addressInformationResp.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(censusGeoCode, city, countyCode, dwellingType, firstReportedDate, lastReportingSubscriberCode, lastUpdatedDate, msaCode, source, state, stateCode, streetName, streetPrefix, streetSuffix, timesReported, unitId, unitType, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressInformationResp {\n");
    
    sb.append("    censusGeoCode: ").append(toIndentedString(censusGeoCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countyCode: ").append(toIndentedString(countyCode)).append("\n");
    sb.append("    dwellingType: ").append(toIndentedString(dwellingType)).append("\n");
    sb.append("    firstReportedDate: ").append(toIndentedString(firstReportedDate)).append("\n");
    sb.append("    lastReportingSubscriberCode: ").append(toIndentedString(lastReportingSubscriberCode)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    msaCode: ").append(toIndentedString(msaCode)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetPrefix: ").append(toIndentedString(streetPrefix)).append("\n");
    sb.append("    streetSuffix: ").append(toIndentedString(streetSuffix)).append("\n");
    sb.append("    timesReported: ").append(toIndentedString(timesReported)).append("\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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
