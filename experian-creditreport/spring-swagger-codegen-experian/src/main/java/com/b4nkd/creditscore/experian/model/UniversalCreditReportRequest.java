package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.Addons;
import com.b4nkd.creditscore.experian.model.CustomOptions;
import com.b4nkd.creditscore.experian.model.FreezeOverride;
import com.b4nkd.creditscore.experian.model.PII;
import com.b4nkd.creditscore.experian.model.PermissiblePurpose;
import com.b4nkd.creditscore.experian.model.Requestor;
import com.b4nkd.creditscore.experian.model.Reseller;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Credit Profile Request Body
 */
@ApiModel(description = "Credit Profile Request Body")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class UniversalCreditReportRequest   {
  @JsonProperty("consumerPii")
  private PII consumerPii = null;

  @JsonProperty("requestor")
  private Requestor requestor = null;

  @JsonProperty("permissiblePurpose")
  private PermissiblePurpose permissiblePurpose = null;

  @JsonProperty("resellerInfo")
  private Reseller resellerInfo = null;

  @JsonProperty("freezeOverride")
  private FreezeOverride freezeOverride = null;

  @JsonProperty("addOns")
  private Addons addOns = null;

  @JsonProperty("customOptions")
  private CustomOptions customOptions = null;

  @JsonProperty("solutionId")
  private String solutionId = null;

  public UniversalCreditReportRequest consumerPii(PII consumerPii) {
    this.consumerPii = consumerPii;
    return this;
  }

  /**
   * Get consumerPii
   * @return consumerPii
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public PII getConsumerPii() {
    return consumerPii;
  }

  public void setConsumerPii(PII consumerPii) {
    this.consumerPii = consumerPii;
  }

  public UniversalCreditReportRequest requestor(Requestor requestor) {
    this.requestor = requestor;
    return this;
  }

  /**
   * Get requestor
   * @return requestor
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Requestor getRequestor() {
    return requestor;
  }

  public void setRequestor(Requestor requestor) {
    this.requestor = requestor;
  }

  public UniversalCreditReportRequest permissiblePurpose(PermissiblePurpose permissiblePurpose) {
    this.permissiblePurpose = permissiblePurpose;
    return this;
  }

  /**
   * Get permissiblePurpose
   * @return permissiblePurpose
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public PermissiblePurpose getPermissiblePurpose() {
    return permissiblePurpose;
  }

  public void setPermissiblePurpose(PermissiblePurpose permissiblePurpose) {
    this.permissiblePurpose = permissiblePurpose;
  }

  public UniversalCreditReportRequest resellerInfo(Reseller resellerInfo) {
    this.resellerInfo = resellerInfo;
    return this;
  }

  /**
   * Get resellerInfo
   * @return resellerInfo
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Reseller getResellerInfo() {
    return resellerInfo;
  }

  public void setResellerInfo(Reseller resellerInfo) {
    this.resellerInfo = resellerInfo;
  }

  public UniversalCreditReportRequest freezeOverride(FreezeOverride freezeOverride) {
    this.freezeOverride = freezeOverride;
    return this;
  }

  /**
   * Get freezeOverride
   * @return freezeOverride
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public FreezeOverride getFreezeOverride() {
    return freezeOverride;
  }

  public void setFreezeOverride(FreezeOverride freezeOverride) {
    this.freezeOverride = freezeOverride;
  }

  public UniversalCreditReportRequest addOns(Addons addOns) {
    this.addOns = addOns;
    return this;
  }

  /**
   * Get addOns
   * @return addOns
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Addons getAddOns() {
    return addOns;
  }

  public void setAddOns(Addons addOns) {
    this.addOns = addOns;
  }

  public UniversalCreditReportRequest customOptions(CustomOptions customOptions) {
    this.customOptions = customOptions;
    return this;
  }

  /**
   * Get customOptions
   * @return customOptions
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomOptions getCustomOptions() {
    return customOptions;
  }

  public void setCustomOptions(CustomOptions customOptions) {
    this.customOptions = customOptions;
  }

  public UniversalCreditReportRequest solutionId(String solutionId) {
    this.solutionId = solutionId;
    return this;
  }

  /**
   * Solution Id provided by Experian during the setup process. If you are setup to receive Premiers and Trended attributes, you will need to provide the solution Id in order to get back the premiers and trended attributes on the API response.
   * @return solutionId
  **/
  @ApiModelProperty(value = "Solution Id provided by Experian during the setup process. If you are setup to receive Premiers and Trended attributes, you will need to provide the solution Id in order to get back the premiers and trended attributes on the API response.")
  
    public String getSolutionId() {
    return solutionId;
  }

  public void setSolutionId(String solutionId) {
    this.solutionId = solutionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniversalCreditReportRequest universalCreditReportRequest = (UniversalCreditReportRequest) o;
    return Objects.equals(this.consumerPii, universalCreditReportRequest.consumerPii) &&
        Objects.equals(this.requestor, universalCreditReportRequest.requestor) &&
        Objects.equals(this.permissiblePurpose, universalCreditReportRequest.permissiblePurpose) &&
        Objects.equals(this.resellerInfo, universalCreditReportRequest.resellerInfo) &&
        Objects.equals(this.freezeOverride, universalCreditReportRequest.freezeOverride) &&
        Objects.equals(this.addOns, universalCreditReportRequest.addOns) &&
        Objects.equals(this.customOptions, universalCreditReportRequest.customOptions) &&
        Objects.equals(this.solutionId, universalCreditReportRequest.solutionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerPii, requestor, permissiblePurpose, resellerInfo, freezeOverride, addOns, customOptions, solutionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniversalCreditReportRequest {\n");
    
    sb.append("    consumerPii: ").append(toIndentedString(consumerPii)).append("\n");
    sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
    sb.append("    permissiblePurpose: ").append(toIndentedString(permissiblePurpose)).append("\n");
    sb.append("    resellerInfo: ").append(toIndentedString(resellerInfo)).append("\n");
    sb.append("    freezeOverride: ").append(toIndentedString(freezeOverride)).append("\n");
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    sb.append("    customOptions: ").append(toIndentedString(customOptions)).append("\n");
    sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
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
