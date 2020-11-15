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
 * If a consumer&#x27;s profile is frozen, then consumer can get a password using which a lender can override the freeze and get credit data. This parameter is provided when consumer has provided the lender with the password to override his profile freeze.
 */
@ApiModel(description = "If a consumer's profile is frozen, then consumer can get a password using which a lender can override the freeze and get credit data. This parameter is provided when consumer has provided the lender with the password to override his profile freeze.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class FreezeOverrideConnect   {
  @JsonProperty("primaryApplFreezeOverrideCode")
  private String primaryApplFreezeOverrideCode = null;

  public FreezeOverrideConnect primaryApplFreezeOverrideCode(String primaryApplFreezeOverrideCode) {
    this.primaryApplFreezeOverrideCode = primaryApplFreezeOverrideCode;
    return this;
  }

  /**
   * This is the freeze override code for the primary applicant Used when a consumer has authorized the client to access his or her frozen file and has provided the client with his or her pass code. This passcode is to be provided to Experian so that Experian can override the freeze and return credit data for the consumer back to the client.
   * @return primaryApplFreezeOverrideCode
  **/
  @ApiModelProperty(value = "This is the freeze override code for the primary applicant Used when a consumer has authorized the client to access his or her frozen file and has provided the client with his or her pass code. This passcode is to be provided to Experian so that Experian can override the freeze and return credit data for the consumer back to the client.")
  
    public String getPrimaryApplFreezeOverrideCode() {
    return primaryApplFreezeOverrideCode;
  }

  public void setPrimaryApplFreezeOverrideCode(String primaryApplFreezeOverrideCode) {
    this.primaryApplFreezeOverrideCode = primaryApplFreezeOverrideCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreezeOverrideConnect freezeOverrideConnect = (FreezeOverrideConnect) o;
    return Objects.equals(this.primaryApplFreezeOverrideCode, freezeOverrideConnect.primaryApplFreezeOverrideCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryApplFreezeOverrideCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreezeOverrideConnect {\n");
    
    sb.append("    primaryApplFreezeOverrideCode: ").append(toIndentedString(primaryApplFreezeOverrideCode)).append("\n");
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
