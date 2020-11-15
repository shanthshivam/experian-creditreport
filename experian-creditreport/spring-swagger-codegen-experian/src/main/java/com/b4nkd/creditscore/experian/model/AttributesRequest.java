package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.AddonsDaas;
import com.b4nkd.creditscore.experian.model.CustomOptions;
import com.b4nkd.creditscore.experian.model.FreezeOverride;
import com.b4nkd.creditscore.experian.model.InfoId1;
import com.b4nkd.creditscore.experian.model.InfoId2;
import com.b4nkd.creditscore.experian.model.InfoId3;
import com.b4nkd.creditscore.experian.model.InfoId4;
import com.b4nkd.creditscore.experian.model.InfoId5;
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


public class AttributesRequest   {
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
  private AddonsDaas addOns = null;

  @JsonProperty("customOptions")
  private CustomOptions customOptions = null;

  @JsonProperty("solutionId")
  private String solutionId = null;

  @JsonProperty("verifyId")
  private String verifyId = null;

  @JsonProperty("daasReferenceId")
  private String daasReferenceId = null;

  @JsonProperty("infoId1")
  private InfoId1 infoId1 = null;

  @JsonProperty("infoId2")
  private InfoId2 infoId2 = null;

  @JsonProperty("infoId3")
  private InfoId3 infoId3 = null;

  @JsonProperty("infoId4")
  private InfoId4 infoId4 = null;

  @JsonProperty("infoId5")
  private InfoId5 infoId5 = null;

  public AttributesRequest consumerPii(PII consumerPii) {
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

  public AttributesRequest requestor(Requestor requestor) {
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

  public AttributesRequest permissiblePurpose(PermissiblePurpose permissiblePurpose) {
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

  public AttributesRequest resellerInfo(Reseller resellerInfo) {
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

  public AttributesRequest freezeOverride(FreezeOverride freezeOverride) {
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

  public AttributesRequest addOns(AddonsDaas addOns) {
    this.addOns = addOns;
    return this;
  }

  /**
   * Get addOns
   * @return addOns
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AddonsDaas getAddOns() {
    return addOns;
  }

  public void setAddOns(AddonsDaas addOns) {
    this.addOns = addOns;
  }

  public AttributesRequest customOptions(CustomOptions customOptions) {
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

  public AttributesRequest solutionId(String solutionId) {
    this.solutionId = solutionId;
    return this;
  }

  /**
   * SolutionId provided by Experian during the setup process used for the RR- keyword.  Tells DaaS system how to route to the correct processing environment, which will process your request.
   * @return solutionId
  **/
  @ApiModelProperty(required = true, value = "SolutionId provided by Experian during the setup process used for the RR- keyword.  Tells DaaS system how to route to the correct processing environment, which will process your request.")
      @NotNull

    public String getSolutionId() {
    return solutionId;
  }

  public void setSolutionId(String solutionId) {
    this.solutionId = solutionId;
  }

  public AttributesRequest verifyId(String verifyId) {
    this.verifyId = verifyId;
    return this;
  }

  /**
   * verifyId provided by Experian during the setup process used for the verify- keyword.  Tells DaaS system how to format the response.
   * @return verifyId
  **/
  @ApiModelProperty(value = "verifyId provided by Experian during the setup process used for the verify- keyword.  Tells DaaS system how to format the response.")
  
    public String getVerifyId() {
    return verifyId;
  }

  public void setVerifyId(String verifyId) {
    this.verifyId = verifyId;
  }

  public AttributesRequest daasReferenceId(String daasReferenceId) {
    this.daasReferenceId = daasReferenceId;
    return this;
  }

  /**
   * daasReferenceId provided by Experian during the setup process used for m- keyword.  Tells DaaS system which DaaS Products you are requesting.
   * @return daasReferenceId
  **/
  @ApiModelProperty(value = "daasReferenceId provided by Experian during the setup process used for m- keyword.  Tells DaaS system which DaaS Products you are requesting.")
  
    public String getDaasReferenceId() {
    return daasReferenceId;
  }

  public void setDaasReferenceId(String daasReferenceId) {
    this.daasReferenceId = daasReferenceId;
  }

  public AttributesRequest infoId1(InfoId1 infoId1) {
    this.infoId1 = infoId1;
    return this;
  }

  /**
   * Get infoId1
   * @return infoId1
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public InfoId1 getInfoId1() {
    return infoId1;
  }

  public void setInfoId1(InfoId1 infoId1) {
    this.infoId1 = infoId1;
  }

  public AttributesRequest infoId2(InfoId2 infoId2) {
    this.infoId2 = infoId2;
    return this;
  }

  /**
   * Get infoId2
   * @return infoId2
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public InfoId2 getInfoId2() {
    return infoId2;
  }

  public void setInfoId2(InfoId2 infoId2) {
    this.infoId2 = infoId2;
  }

  public AttributesRequest infoId3(InfoId3 infoId3) {
    this.infoId3 = infoId3;
    return this;
  }

  /**
   * Get infoId3
   * @return infoId3
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public InfoId3 getInfoId3() {
    return infoId3;
  }

  public void setInfoId3(InfoId3 infoId3) {
    this.infoId3 = infoId3;
  }

  public AttributesRequest infoId4(InfoId4 infoId4) {
    this.infoId4 = infoId4;
    return this;
  }

  /**
   * Get infoId4
   * @return infoId4
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public InfoId4 getInfoId4() {
    return infoId4;
  }

  public void setInfoId4(InfoId4 infoId4) {
    this.infoId4 = infoId4;
  }

  public AttributesRequest infoId5(InfoId5 infoId5) {
    this.infoId5 = infoId5;
    return this;
  }

  /**
   * Get infoId5
   * @return infoId5
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public InfoId5 getInfoId5() {
    return infoId5;
  }

  public void setInfoId5(InfoId5 infoId5) {
    this.infoId5 = infoId5;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributesRequest attributesRequest = (AttributesRequest) o;
    return Objects.equals(this.consumerPii, attributesRequest.consumerPii) &&
        Objects.equals(this.requestor, attributesRequest.requestor) &&
        Objects.equals(this.permissiblePurpose, attributesRequest.permissiblePurpose) &&
        Objects.equals(this.resellerInfo, attributesRequest.resellerInfo) &&
        Objects.equals(this.freezeOverride, attributesRequest.freezeOverride) &&
        Objects.equals(this.addOns, attributesRequest.addOns) &&
        Objects.equals(this.customOptions, attributesRequest.customOptions) &&
        Objects.equals(this.solutionId, attributesRequest.solutionId) &&
        Objects.equals(this.verifyId, attributesRequest.verifyId) &&
        Objects.equals(this.daasReferenceId, attributesRequest.daasReferenceId) &&
        Objects.equals(this.infoId1, attributesRequest.infoId1) &&
        Objects.equals(this.infoId2, attributesRequest.infoId2) &&
        Objects.equals(this.infoId3, attributesRequest.infoId3) &&
        Objects.equals(this.infoId4, attributesRequest.infoId4) &&
        Objects.equals(this.infoId5, attributesRequest.infoId5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerPii, requestor, permissiblePurpose, resellerInfo, freezeOverride, addOns, customOptions, solutionId, verifyId, daasReferenceId, infoId1, infoId2, infoId3, infoId4, infoId5);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributesRequest {\n");
    
    sb.append("    consumerPii: ").append(toIndentedString(consumerPii)).append("\n");
    sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
    sb.append("    permissiblePurpose: ").append(toIndentedString(permissiblePurpose)).append("\n");
    sb.append("    resellerInfo: ").append(toIndentedString(resellerInfo)).append("\n");
    sb.append("    freezeOverride: ").append(toIndentedString(freezeOverride)).append("\n");
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    sb.append("    customOptions: ").append(toIndentedString(customOptions)).append("\n");
    sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
    sb.append("    verifyId: ").append(toIndentedString(verifyId)).append("\n");
    sb.append("    daasReferenceId: ").append(toIndentedString(daasReferenceId)).append("\n");
    sb.append("    infoId1: ").append(toIndentedString(infoId1)).append("\n");
    sb.append("    infoId2: ").append(toIndentedString(infoId2)).append("\n");
    sb.append("    infoId3: ").append(toIndentedString(infoId3)).append("\n");
    sb.append("    infoId4: ").append(toIndentedString(infoId4)).append("\n");
    sb.append("    infoId5: ").append(toIndentedString(infoId5)).append("\n");
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
