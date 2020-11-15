package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.AddonsEVS;
import com.b4nkd.creditscore.experian.model.CustomOptions;
import com.b4nkd.creditscore.experian.model.FreezeOverride;
import com.b4nkd.creditscore.experian.model.PII;
import com.b4nkd.creditscore.experian.model.PermissiblePurpose;
import com.b4nkd.creditscore.experian.model.Requestor;
import com.b4nkd.creditscore.experian.model.Reseller;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Extended View Request Body
 */
@ApiModel(description = "Extended View Request Body")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class ExtendedViewRequest   {
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
  private AddonsEVS addOns = null;

  @JsonProperty("customOptions")
  private CustomOptions customOptions = null;

  /**
   * What is the definition of thin file for the client? 4 = less than 5 trades (default) 3 = less than 4 trades 2 = less than 3 trades 1 = less than 2 trades 0 = no trades
   */
  public enum ThinFileIndicatorEnum {
    _4("4"),
    
    _3("3"),
    
    _2("2"),
    
    _1("1"),
    
    _0("0");

    private String value;

    ThinFileIndicatorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ThinFileIndicatorEnum fromValue(String text) {
      for (ThinFileIndicatorEnum b : ThinFileIndicatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("thinFileIndicator")
  private ThinFileIndicatorEnum thinFileIndicator = ThinFileIndicatorEnum._4;

  public ExtendedViewRequest consumerPii(PII consumerPii) {
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

  public ExtendedViewRequest requestor(Requestor requestor) {
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

  public ExtendedViewRequest permissiblePurpose(PermissiblePurpose permissiblePurpose) {
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

  public ExtendedViewRequest resellerInfo(Reseller resellerInfo) {
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

  public ExtendedViewRequest freezeOverride(FreezeOverride freezeOverride) {
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

  public ExtendedViewRequest addOns(AddonsEVS addOns) {
    this.addOns = addOns;
    return this;
  }

  /**
   * Get addOns
   * @return addOns
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AddonsEVS getAddOns() {
    return addOns;
  }

  public void setAddOns(AddonsEVS addOns) {
    this.addOns = addOns;
  }

  public ExtendedViewRequest customOptions(CustomOptions customOptions) {
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

  public ExtendedViewRequest thinFileIndicator(ThinFileIndicatorEnum thinFileIndicator) {
    this.thinFileIndicator = thinFileIndicator;
    return this;
  }

  /**
   * What is the definition of thin file for the client? 4 = less than 5 trades (default) 3 = less than 4 trades 2 = less than 3 trades 1 = less than 2 trades 0 = no trades
   * @return thinFileIndicator
  **/
  @ApiModelProperty(value = "What is the definition of thin file for the client? 4 = less than 5 trades (default) 3 = less than 4 trades 2 = less than 3 trades 1 = less than 2 trades 0 = no trades")
  
    public ThinFileIndicatorEnum getThinFileIndicator() {
    return thinFileIndicator;
  }

  public void setThinFileIndicator(ThinFileIndicatorEnum thinFileIndicator) {
    this.thinFileIndicator = thinFileIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedViewRequest extendedViewRequest = (ExtendedViewRequest) o;
    return Objects.equals(this.consumerPii, extendedViewRequest.consumerPii) &&
        Objects.equals(this.requestor, extendedViewRequest.requestor) &&
        Objects.equals(this.permissiblePurpose, extendedViewRequest.permissiblePurpose) &&
        Objects.equals(this.resellerInfo, extendedViewRequest.resellerInfo) &&
        Objects.equals(this.freezeOverride, extendedViewRequest.freezeOverride) &&
        Objects.equals(this.addOns, extendedViewRequest.addOns) &&
        Objects.equals(this.customOptions, extendedViewRequest.customOptions) &&
        Objects.equals(this.thinFileIndicator, extendedViewRequest.thinFileIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerPii, requestor, permissiblePurpose, resellerInfo, freezeOverride, addOns, customOptions, thinFileIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedViewRequest {\n");
    
    sb.append("    consumerPii: ").append(toIndentedString(consumerPii)).append("\n");
    sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
    sb.append("    permissiblePurpose: ").append(toIndentedString(permissiblePurpose)).append("\n");
    sb.append("    resellerInfo: ").append(toIndentedString(resellerInfo)).append("\n");
    sb.append("    freezeOverride: ").append(toIndentedString(freezeOverride)).append("\n");
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    sb.append("    customOptions: ").append(toIndentedString(customOptions)).append("\n");
    sb.append("    thinFileIndicator: ").append(toIndentedString(thinFileIndicator)).append("\n");
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
