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
 * ClarityAccountDataCP
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class ClarityAccountDataCP   {
  @JsonProperty("clarityGroupId")
  private String clarityGroupId = "";

  @JsonProperty("clarityAccountId")
  private String clarityAccountId = "";

  @JsonProperty("clarityLocationId")
  private String clarityLocationId = "";

  @JsonProperty("clarityControlFileName")
  private String clarityControlFileName = "";

  @JsonProperty("clarityControlFileVersion")
  private String clarityControlFileVersion = "";

  public ClarityAccountDataCP clarityGroupId(String clarityGroupId) {
    this.clarityGroupId = clarityGroupId;
    return this;
  }

  /**
   * Clarity Group ID
   * @return clarityGroupId
  **/
  @ApiModelProperty(value = "Clarity Group ID")
  
    public String getClarityGroupId() {
    return clarityGroupId;
  }

  public void setClarityGroupId(String clarityGroupId) {
    this.clarityGroupId = clarityGroupId;
  }

  public ClarityAccountDataCP clarityAccountId(String clarityAccountId) {
    this.clarityAccountId = clarityAccountId;
    return this;
  }

  /**
   * Clarity Account ID
   * @return clarityAccountId
  **/
  @ApiModelProperty(value = "Clarity Account ID")
  
    public String getClarityAccountId() {
    return clarityAccountId;
  }

  public void setClarityAccountId(String clarityAccountId) {
    this.clarityAccountId = clarityAccountId;
  }

  public ClarityAccountDataCP clarityLocationId(String clarityLocationId) {
    this.clarityLocationId = clarityLocationId;
    return this;
  }

  /**
   * Clarity Location ID
   * @return clarityLocationId
  **/
  @ApiModelProperty(value = "Clarity Location ID")
  
    public String getClarityLocationId() {
    return clarityLocationId;
  }

  public void setClarityLocationId(String clarityLocationId) {
    this.clarityLocationId = clarityLocationId;
  }

  public ClarityAccountDataCP clarityControlFileName(String clarityControlFileName) {
    this.clarityControlFileName = clarityControlFileName;
    return this;
  }

  /**
   * Clarity Control File Name
   * @return clarityControlFileName
  **/
  @ApiModelProperty(value = "Clarity Control File Name")
  
    public String getClarityControlFileName() {
    return clarityControlFileName;
  }

  public void setClarityControlFileName(String clarityControlFileName) {
    this.clarityControlFileName = clarityControlFileName;
  }

  public ClarityAccountDataCP clarityControlFileVersion(String clarityControlFileVersion) {
    this.clarityControlFileVersion = clarityControlFileVersion;
    return this;
  }

  /**
   * Clarity Control File Version
   * @return clarityControlFileVersion
  **/
  @ApiModelProperty(value = "Clarity Control File Version")
  
    public String getClarityControlFileVersion() {
    return clarityControlFileVersion;
  }

  public void setClarityControlFileVersion(String clarityControlFileVersion) {
    this.clarityControlFileVersion = clarityControlFileVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClarityAccountDataCP clarityAccountDataCP = (ClarityAccountDataCP) o;
    return Objects.equals(this.clarityGroupId, clarityAccountDataCP.clarityGroupId) &&
        Objects.equals(this.clarityAccountId, clarityAccountDataCP.clarityAccountId) &&
        Objects.equals(this.clarityLocationId, clarityAccountDataCP.clarityLocationId) &&
        Objects.equals(this.clarityControlFileName, clarityAccountDataCP.clarityControlFileName) &&
        Objects.equals(this.clarityControlFileVersion, clarityAccountDataCP.clarityControlFileVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clarityGroupId, clarityAccountId, clarityLocationId, clarityControlFileName, clarityControlFileVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClarityAccountDataCP {\n");
    
    sb.append("    clarityGroupId: ").append(toIndentedString(clarityGroupId)).append("\n");
    sb.append("    clarityAccountId: ").append(toIndentedString(clarityAccountId)).append("\n");
    sb.append("    clarityLocationId: ").append(toIndentedString(clarityLocationId)).append("\n");
    sb.append("    clarityControlFileName: ").append(toIndentedString(clarityControlFileName)).append("\n");
    sb.append("    clarityControlFileVersion: ").append(toIndentedString(clarityControlFileVersion)).append("\n");
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
