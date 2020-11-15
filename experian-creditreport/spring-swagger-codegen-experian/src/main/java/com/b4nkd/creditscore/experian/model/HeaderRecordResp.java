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
 * HeaderRecordResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class HeaderRecordResp   {
  @JsonProperty("reportDate")
  private String reportDate = "061319";

  @JsonProperty("reportTime")
  private String reportTime = "112259";

  @JsonProperty("preamble")
  private String preamble = "TCA1";

  @JsonProperty("versionNo")
  private String versionNo = "07";

  @JsonProperty("mKeywordLength")
  private String mKeywordLength = "99";

  @JsonProperty("mKeywordText")
  private String mKeywordText = "SEQ123456789012345678901234567890";

  @JsonProperty("y2kReportedDate")
  private String y2kReportedDate = "06112019";

  @JsonProperty("inquiringSubcode")
  private String inquiringSubcode = "";

  @JsonProperty("reportCode")
  private String reportCode = "";

  @JsonProperty("applicationCode")
  private String applicationCode = "";

  public HeaderRecordResp reportDate(String reportDate) {
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

  public HeaderRecordResp reportTime(String reportTime) {
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

  public HeaderRecordResp preamble(String preamble) {
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

  public HeaderRecordResp versionNo(String versionNo) {
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

  public HeaderRecordResp mKeywordLength(String mKeywordLength) {
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

  public HeaderRecordResp mKeywordText(String mKeywordText) {
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

  public HeaderRecordResp y2kReportedDate(String y2kReportedDate) {
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

  public HeaderRecordResp inquiringSubcode(String inquiringSubcode) {
    this.inquiringSubcode = inquiringSubcode;
    return this;
  }

  /**
   * Subcode from Inquiry
   * @return inquiringSubcode
  **/
  @ApiModelProperty(value = "Subcode from Inquiry")
  
    public String getInquiringSubcode() {
    return inquiringSubcode;
  }

  public void setInquiringSubcode(String inquiringSubcode) {
    this.inquiringSubcode = inquiringSubcode;
  }

  public HeaderRecordResp reportCode(String reportCode) {
    this.reportCode = reportCode;
    return this;
  }

  /**
   * Type of report. C = Credit Profile K = Checkpoint Report
   * @return reportCode
  **/
  @ApiModelProperty(value = "Type of report. C = Credit Profile K = Checkpoint Report")
  
    public String getReportCode() {
    return reportCode;
  }

  public void setReportCode(String reportCode) {
    this.reportCode = reportCode;
  }

  public HeaderRecordResp applicationCode(String applicationCode) {
    this.applicationCode = applicationCode;
    return this;
  }

  /**
   * Reserved for future use
   * @return applicationCode
  **/
  @ApiModelProperty(value = "Reserved for future use")
  
    public String getApplicationCode() {
    return applicationCode;
  }

  public void setApplicationCode(String applicationCode) {
    this.applicationCode = applicationCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderRecordResp headerRecordResp = (HeaderRecordResp) o;
    return Objects.equals(this.reportDate, headerRecordResp.reportDate) &&
        Objects.equals(this.reportTime, headerRecordResp.reportTime) &&
        Objects.equals(this.preamble, headerRecordResp.preamble) &&
        Objects.equals(this.versionNo, headerRecordResp.versionNo) &&
        Objects.equals(this.mKeywordLength, headerRecordResp.mKeywordLength) &&
        Objects.equals(this.mKeywordText, headerRecordResp.mKeywordText) &&
        Objects.equals(this.y2kReportedDate, headerRecordResp.y2kReportedDate) &&
        Objects.equals(this.inquiringSubcode, headerRecordResp.inquiringSubcode) &&
        Objects.equals(this.reportCode, headerRecordResp.reportCode) &&
        Objects.equals(this.applicationCode, headerRecordResp.applicationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportDate, reportTime, preamble, versionNo, mKeywordLength, mKeywordText, y2kReportedDate, inquiringSubcode, reportCode, applicationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderRecordResp {\n");
    
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    reportTime: ").append(toIndentedString(reportTime)).append("\n");
    sb.append("    preamble: ").append(toIndentedString(preamble)).append("\n");
    sb.append("    versionNo: ").append(toIndentedString(versionNo)).append("\n");
    sb.append("    mKeywordLength: ").append(toIndentedString(mKeywordLength)).append("\n");
    sb.append("    mKeywordText: ").append(toIndentedString(mKeywordText)).append("\n");
    sb.append("    y2kReportedDate: ").append(toIndentedString(y2kReportedDate)).append("\n");
    sb.append("    inquiringSubcode: ").append(toIndentedString(inquiringSubcode)).append("\n");
    sb.append("    reportCode: ").append(toIndentedString(reportCode)).append("\n");
    sb.append("    applicationCode: ").append(toIndentedString(applicationCode)).append("\n");
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
