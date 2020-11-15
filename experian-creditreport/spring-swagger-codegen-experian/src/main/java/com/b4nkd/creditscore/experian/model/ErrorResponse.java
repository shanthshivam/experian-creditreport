package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.EndTotalsError;
import com.b4nkd.creditscore.experian.model.Error;
import com.b4nkd.creditscore.experian.model.HeaderRecordError;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class ErrorResponse   {
  @JsonProperty("headerRecordError")
  private HeaderRecordError headerRecordError = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("endTotalsError")
  private EndTotalsError endTotalsError = null;

  public ErrorResponse headerRecordError(HeaderRecordError headerRecordError) {
    this.headerRecordError = headerRecordError;
    return this;
  }

  /**
   * Get headerRecordError
   * @return headerRecordError
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public HeaderRecordError getHeaderRecordError() {
    return headerRecordError;
  }

  public void setHeaderRecordError(HeaderRecordError headerRecordError) {
    this.headerRecordError = headerRecordError;
  }

  public ErrorResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorResponse addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Error>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public ErrorResponse endTotalsError(EndTotalsError endTotalsError) {
    this.endTotalsError = endTotalsError;
    return this;
  }

  /**
   * Get endTotalsError
   * @return endTotalsError
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public EndTotalsError getEndTotalsError() {
    return endTotalsError;
  }

  public void setEndTotalsError(EndTotalsError endTotalsError) {
    this.endTotalsError = endTotalsError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.headerRecordError, errorResponse.headerRecordError) &&
        Objects.equals(this.errors, errorResponse.errors) &&
        Objects.equals(this.endTotalsError, errorResponse.endTotalsError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerRecordError, errors, endTotalsError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    headerRecordError: ").append(toIndentedString(headerRecordError)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    endTotalsError: ").append(toIndentedString(endTotalsError)).append("\n");
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
