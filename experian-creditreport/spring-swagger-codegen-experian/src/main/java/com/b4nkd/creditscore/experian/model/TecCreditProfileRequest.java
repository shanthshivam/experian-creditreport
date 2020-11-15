package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.CustomOptions;
import com.b4nkd.creditscore.experian.model.FreezeOverride;
import com.b4nkd.creditscore.experian.model.PII;
import com.b4nkd.creditscore.experian.model.PermissiblePurpose;
import com.b4nkd.creditscore.experian.model.Requestor;
import com.b4nkd.creditscore.experian.model.Reseller;
import com.b4nkd.creditscore.experian.model.TecAddons;
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


public class TecCreditProfileRequest   {
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
  private TecAddons addOns = null;

  @JsonProperty("customOptions")
  private CustomOptions customOptions = null;

  public TecCreditProfileRequest consumerPii(PII consumerPii) {
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

  public TecCreditProfileRequest requestor(Requestor requestor) {
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

  public TecCreditProfileRequest permissiblePurpose(PermissiblePurpose permissiblePurpose) {
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

  public TecCreditProfileRequest resellerInfo(Reseller resellerInfo) {
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

  public TecCreditProfileRequest freezeOverride(FreezeOverride freezeOverride) {
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

  public TecCreditProfileRequest addOns(TecAddons addOns) {
    this.addOns = addOns;
    return this;
  }

  /**
   * Get addOns
   * @return addOns
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TecAddons getAddOns() {
    return addOns;
  }

  public void setAddOns(TecAddons addOns) {
    this.addOns = addOns;
  }

  public TecCreditProfileRequest customOptions(CustomOptions customOptions) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TecCreditProfileRequest tecCreditProfileRequest = (TecCreditProfileRequest) o;
    return Objects.equals(this.consumerPii, tecCreditProfileRequest.consumerPii) &&
        Objects.equals(this.requestor, tecCreditProfileRequest.requestor) &&
        Objects.equals(this.permissiblePurpose, tecCreditProfileRequest.permissiblePurpose) &&
        Objects.equals(this.resellerInfo, tecCreditProfileRequest.resellerInfo) &&
        Objects.equals(this.freezeOverride, tecCreditProfileRequest.freezeOverride) &&
        Objects.equals(this.addOns, tecCreditProfileRequest.addOns) &&
        Objects.equals(this.customOptions, tecCreditProfileRequest.customOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerPii, requestor, permissiblePurpose, resellerInfo, freezeOverride, addOns, customOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TecCreditProfileRequest {\n");
    
    sb.append("    consumerPii: ").append(toIndentedString(consumerPii)).append("\n");
    sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
    sb.append("    permissiblePurpose: ").append(toIndentedString(permissiblePurpose)).append("\n");
    sb.append("    resellerInfo: ").append(toIndentedString(resellerInfo)).append("\n");
    sb.append("    freezeOverride: ").append(toIndentedString(freezeOverride)).append("\n");
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    sb.append("    customOptions: ").append(toIndentedString(customOptions)).append("\n");
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
