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
 * StatementResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class StatementResp   {
  @JsonProperty("dateReported")
  private String dateReported = null;

  @JsonProperty("statementText")
  private String statementText = null;

  @JsonProperty("type")
  private String type = null;

  public StatementResp dateReported(String dateReported) {
    this.dateReported = dateReported;
    return this;
  }

  /**
   * Date reported. Format = MMDDCCYY
   * @return dateReported
  **/
  @ApiModelProperty(value = "Date reported. Format = MMDDCCYY")
  
    public String getDateReported() {
    return dateReported;
  }

  public void setDateReported(String dateReported) {
    this.dateReported = dateReported;
  }

  public StatementResp statementText(String statementText) {
    this.statementText = statementText;
    return this;
  }

  /**
   * Consumer Statement Text. 
   * @return statementText
  **/
  @ApiModelProperty(value = "Consumer Statement Text. ")
  
    public String getStatementText() {
    return statementText;
  }

  public void setStatementText(String statementText) {
    this.statementText = statementText;
  }

  public StatementResp type(String type) {
    this.type = type;
    return this;
  }

  /**
   * 2 character statement type. 
   * @return type
  **/
  @ApiModelProperty(value = "2 character statement type. ")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatementResp statementResp = (StatementResp) o;
    return Objects.equals(this.dateReported, statementResp.dateReported) &&
        Objects.equals(this.statementText, statementResp.statementText) &&
        Objects.equals(this.type, statementResp.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateReported, statementText, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementResp {\n");
    
    sb.append("    dateReported: ").append(toIndentedString(dateReported)).append("\n");
    sb.append("    statementText: ").append(toIndentedString(statementText)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
