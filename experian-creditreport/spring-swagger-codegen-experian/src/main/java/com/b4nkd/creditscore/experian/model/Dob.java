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
 * Dob
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class Dob   {
  @JsonProperty("day")
  private String day = "4";

  @JsonProperty("month")
  private String month = "08";

  @JsonProperty("year")
  private String year = "1990";

  public Dob day(String day) {
    this.day = day;
    return this;
  }

  /**
   * When available it will be output in DD format.
   * @return day
  **/
  @ApiModelProperty(value = "When available it will be output in DD format.")
  
    public String getDay() {
    return day;
  }

  public void setDay(String day) {
    this.day = day;
  }

  public Dob month(String month) {
    this.month = month;
    return this;
  }

  /**
   * When available it will be output in MM format.
   * @return month
  **/
  @ApiModelProperty(value = "When available it will be output in MM format.")
  
    public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public Dob year(String year) {
    this.year = year;
    return this;
  }

  /**
   * When available it will be output in CCYY format.
   * @return year
  **/
  @ApiModelProperty(value = "When available it will be output in CCYY format.")
  
    public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dob dob = (Dob) o;
    return Objects.equals(this.day, dob.day) &&
        Objects.equals(this.month, dob.month) &&
        Objects.equals(this.year, dob.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, month, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dob {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
