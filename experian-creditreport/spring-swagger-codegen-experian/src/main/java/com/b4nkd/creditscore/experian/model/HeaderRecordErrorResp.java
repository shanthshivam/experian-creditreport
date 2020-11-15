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
 * HeaderRecordErrorResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class HeaderRecordErrorResp   {
  @JsonProperty("hostid")
  private String hostid = "0";

  @JsonProperty("applicationId")
  private String applicationId = "C";

  @JsonProperty("reportDate")
  private String reportDate = "061319";

  @JsonProperty("reportTime")
  private String reportTime = "111459";

  @JsonProperty("reportType")
  private String reportType = "X";

  @JsonProperty("preamble")
  private String preamble = "TCA1";

  @JsonProperty("regionCode")
  private String regionCode = "W";

  @JsonProperty("versionNo")
  private String versionNo = "07";

  @JsonProperty("surName")
  private String surName = "SURNAME   ";

  @JsonProperty("firstName")
  private String firstName = "FIR";

  @JsonProperty("mKeywordLength")
  private String mKeywordLength = "99";

  @JsonProperty("mKeywordText")
  private String mKeywordText = "SEQ123456789012345678901234567890";

  @JsonProperty("y2kReportedDate")
  private String y2kReportedDate = "06132019";

  public HeaderRecordErrorResp hostid(String hostid) {
    this.hostid = hostid;
    return this;
  }

  /**
   * Denotes which Experian host responded to inquiry.
   * @return hostid
  **/
  @ApiModelProperty(value = "Denotes which Experian host responded to inquiry.")
  
    public String getHostid() {
    return hostid;
  }

  public void setHostid(String hostid) {
    this.hostid = hostid;
  }

  public HeaderRecordErrorResp applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * C = Credit Reporting D = Detect N = NFD
   * @return applicationId
  **/
  @ApiModelProperty(value = "C = Credit Reporting D = Detect N = NFD")
  
    public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public HeaderRecordErrorResp reportDate(String reportDate) {
    this.reportDate = reportDate;
    return this;
  }

  /**
   * Date inquiry reported to Experian. Format = MMDDYY
   * @return reportDate
  **/
  @ApiModelProperty(value = "Date inquiry reported to Experian. Format = MMDDYY")
  
    public String getReportDate() {
    return reportDate;
  }

  public void setReportDate(String reportDate) {
    this.reportDate = reportDate;
  }

  public HeaderRecordErrorResp reportTime(String reportTime) {
    this.reportTime = reportTime;
    return this;
  }

  /**
   * Time inquiry reported to Experian. Format = HHMMSS
   * @return reportTime
  **/
  @ApiModelProperty(value = "Time inquiry reported to Experian. Format = HHMMSS")
  
    public String getReportTime() {
    return reportTime;
  }

  public void setReportTime(String reportTime) {
    this.reportTime = reportTime;
  }

  public HeaderRecordErrorResp reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

  /**
   * X = ARF Format
   * @return reportType
  **/
  @ApiModelProperty(value = "X = ARF Format")
  
    public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  public HeaderRecordErrorResp preamble(String preamble) {
    this.preamble = preamble;
    return this;
  }

  /**
   * Consumer Assistance Preamble for area accessed.
   * @return preamble
  **/
  @ApiModelProperty(value = "Consumer Assistance Preamble for area accessed.")
  
    public String getPreamble() {
    return preamble;
  }

  public void setPreamble(String preamble) {
    this.preamble = preamble;
  }

  public HeaderRecordErrorResp regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  /**
   * Constant 'W'
   * @return regionCode
  **/
  @ApiModelProperty(value = "Constant 'W'")
  
    public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  public HeaderRecordErrorResp versionNo(String versionNo) {
    this.versionNo = versionNo;
    return this;
  }

  /**
   * Experian online ARF version
   * @return versionNo
  **/
  @ApiModelProperty(value = "Experian online ARF version")
  
    public String getVersionNo() {
    return versionNo;
  }

  public void setVersionNo(String versionNo) {
    this.versionNo = versionNo;
  }

  public HeaderRecordErrorResp surName(String surName) {
    this.surName = surName;
    return this;
  }

  /**
   * Left justified. Unused spaces are blank or nullfilled.
   * @return surName
  **/
  @ApiModelProperty(value = "Left justified. Unused spaces are blank or nullfilled.")
  
    public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }

  public HeaderRecordErrorResp firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Left justified. First three characters only.
   * @return firstName
  **/
  @ApiModelProperty(value = "Left justified. First three characters only.")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public HeaderRecordErrorResp mKeywordLength(String mKeywordLength) {
    this.mKeywordLength = mKeywordLength;
    return this;
  }

  /**
   * Indicates length of text.
   * @return mKeywordLength
  **/
  @ApiModelProperty(value = "Indicates length of text.")
  
    public String getMKeywordLength() {
    return mKeywordLength;
  }

  public void setMKeywordLength(String mKeywordLength) {
    this.mKeywordLength = mKeywordLength;
  }

  public HeaderRecordErrorResp mKeywordText(String mKeywordText) {
    this.mKeywordText = mKeywordText;
    return this;
  }

  /**
   * Information obtained from the M-keyword used on Inquiry. The data is returned in the same format as input.  It is used as a control number for subscribers to link this response to their inquiry.
   * @return mKeywordText
  **/
  @ApiModelProperty(value = "Information obtained from the M-keyword used on Inquiry. The data is returned in the same format as input.  It is used as a control number for subscribers to link this response to their inquiry.")
  
    public String getMKeywordText() {
    return mKeywordText;
  }

  public void setMKeywordText(String mKeywordText) {
    this.mKeywordText = mKeywordText;
  }

  public HeaderRecordErrorResp y2kReportedDate(String y2kReportedDate) {
    this.y2kReportedDate = y2kReportedDate;
    return this;
  }

  /**
   * Date of report. Format = MMDDCCYY
   * @return y2kReportedDate
  **/
  @ApiModelProperty(value = "Date of report. Format = MMDDCCYY")
  
    public String getY2kReportedDate() {
    return y2kReportedDate;
  }

  public void setY2kReportedDate(String y2kReportedDate) {
    this.y2kReportedDate = y2kReportedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderRecordErrorResp headerRecordErrorResp = (HeaderRecordErrorResp) o;
    return Objects.equals(this.hostid, headerRecordErrorResp.hostid) &&
        Objects.equals(this.applicationId, headerRecordErrorResp.applicationId) &&
        Objects.equals(this.reportDate, headerRecordErrorResp.reportDate) &&
        Objects.equals(this.reportTime, headerRecordErrorResp.reportTime) &&
        Objects.equals(this.reportType, headerRecordErrorResp.reportType) &&
        Objects.equals(this.preamble, headerRecordErrorResp.preamble) &&
        Objects.equals(this.regionCode, headerRecordErrorResp.regionCode) &&
        Objects.equals(this.versionNo, headerRecordErrorResp.versionNo) &&
        Objects.equals(this.surName, headerRecordErrorResp.surName) &&
        Objects.equals(this.firstName, headerRecordErrorResp.firstName) &&
        Objects.equals(this.mKeywordLength, headerRecordErrorResp.mKeywordLength) &&
        Objects.equals(this.mKeywordText, headerRecordErrorResp.mKeywordText) &&
        Objects.equals(this.y2kReportedDate, headerRecordErrorResp.y2kReportedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostid, applicationId, reportDate, reportTime, reportType, preamble, regionCode, versionNo, surName, firstName, mKeywordLength, mKeywordText, y2kReportedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderRecordErrorResp {\n");
    
    sb.append("    hostid: ").append(toIndentedString(hostid)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    reportTime: ").append(toIndentedString(reportTime)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    preamble: ").append(toIndentedString(preamble)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    versionNo: ").append(toIndentedString(versionNo)).append("\n");
    sb.append("    surName: ").append(toIndentedString(surName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    mKeywordLength: ").append(toIndentedString(mKeywordLength)).append("\n");
    sb.append("    mKeywordText: ").append(toIndentedString(mKeywordText)).append("\n");
    sb.append("    y2kReportedDate: ").append(toIndentedString(y2kReportedDate)).append("\n");
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
