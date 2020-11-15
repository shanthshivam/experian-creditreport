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
 * Score Factor
 */
@ApiModel(description = "Score Factor")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class ScoreFactor   {
  @JsonProperty("importance")
  private String importance = null;

  @JsonProperty("code")
  private String code = null;

  public ScoreFactor importance(String importance) {
    this.importance = importance;
    return this;
  }

  /**
   * The importance of this score factor code
   * @return importance
  **/
  @ApiModelProperty(value = "The importance of this score factor code")
  
    public String getImportance() {
    return importance;
  }

  public void setImportance(String importance) {
    this.importance = importance;
  }

  public ScoreFactor code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Score Factor Code
   * @return code
  **/
  @ApiModelProperty(value = "Score Factor Code")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreFactor scoreFactor = (ScoreFactor) o;
    return Objects.equals(this.importance, scoreFactor.importance) &&
        Objects.equals(this.code, scoreFactor.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importance, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreFactor {\n");
    
    sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
