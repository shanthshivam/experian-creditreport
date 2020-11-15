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
 * Consumer&#x27;s Credit Score Notice to get the credit score data under 700 segment.
 */
@ApiModel(description = "Consumer's Credit Score Notice to get the credit score data under 700 segment.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class CreditScoreNoticeDataDaas   {
  @JsonProperty("noticeType")
  private String noticeType = null;

  @JsonProperty("riskModelIndicator")
  private String riskModelIndicator = null;

  public CreditScoreNoticeDataDaas noticeType(String noticeType) {
    this.noticeType = noticeType;
    return this;
  }

  /**
   * Credit Score Notice Type - Values can be GENERIC or MORTGAGE
   * @return noticeType
  **/
  @ApiModelProperty(value = "Credit Score Notice Type - Values can be GENERIC or MORTGAGE")
  
    public String getNoticeType() {
    return noticeType;
  }

  public void setNoticeType(String noticeType) {
    this.noticeType = noticeType;
  }

  public CreditScoreNoticeDataDaas riskModelIndicator(String riskModelIndicator) {
    this.riskModelIndicator = riskModelIndicator;
    return this;
  }

  /**
   * Alpha Numeric field
   * @return riskModelIndicator
  **/
  @ApiModelProperty(value = "Alpha Numeric field")
  
    public String getRiskModelIndicator() {
    return riskModelIndicator;
  }

  public void setRiskModelIndicator(String riskModelIndicator) {
    this.riskModelIndicator = riskModelIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditScoreNoticeDataDaas creditScoreNoticeDataDaas = (CreditScoreNoticeDataDaas) o;
    return Objects.equals(this.noticeType, creditScoreNoticeDataDaas.noticeType) &&
        Objects.equals(this.riskModelIndicator, creditScoreNoticeDataDaas.riskModelIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noticeType, riskModelIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditScoreNoticeDataDaas {\n");
    
    sb.append("    noticeType: ").append(toIndentedString(noticeType)).append("\n");
    sb.append("    riskModelIndicator: ").append(toIndentedString(riskModelIndicator)).append("\n");
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
