package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.ScoreFactor;
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
 * RiskModelRespHealth
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")


public class RiskModelRespHealth   {
  @JsonProperty("evaluation")
  private String evaluation = null;

  @JsonProperty("grade")
  private String grade = "";

  @JsonProperty("modelIndicator")
  private String modelIndicator = "V4";

  @JsonProperty("score")
  private String score = "0";

  @JsonProperty("scoreFactors")
  @Valid
  private List<ScoreFactor> scoreFactors = null;

  @JsonProperty("scorePercentile")
  private String scorePercentile = null;

  public RiskModelRespHealth evaluation(String evaluation) {
    this.evaluation = evaluation;
    return this;
  }

  /**
   * Sign of risk score.
   * @return evaluation
  **/
  @ApiModelProperty(value = "Sign of risk score.")
  
    public String getEvaluation() {
    return evaluation;
  }

  public void setEvaluation(String evaluation) {
    this.evaluation = evaluation;
  }

  public RiskModelRespHealth grade(String grade) {
    this.grade = grade;
    return this;
  }

  /**
   * Indicates grade.
   * @return grade
  **/
  @ApiModelProperty(value = "Indicates grade.")
  
    public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public RiskModelRespHealth modelIndicator(String modelIndicator) {
    this.modelIndicator = modelIndicator;
    return this;
  }

  /**
   * Indicates which model is being returned.
   * @return modelIndicator
  **/
  @ApiModelProperty(value = "Indicates which model is being returned.")
  
    public String getModelIndicator() {
    return modelIndicator;
  }

  public void setModelIndicator(String modelIndicator) {
    this.modelIndicator = modelIndicator;
  }

  public RiskModelRespHealth score(String score) {
    this.score = score;
    return this;
  }

  /**
   * Present when RiskModels is requested on input or via subcode. 4 character score for the model requested.
   * @return score
  **/
  @ApiModelProperty(value = "Present when RiskModels is requested on input or via subcode. 4 character score for the model requested.")
  
    public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public RiskModelRespHealth scoreFactors(List<ScoreFactor> scoreFactors) {
    this.scoreFactors = scoreFactors;
    return this;
  }

  public RiskModelRespHealth addScoreFactorsItem(ScoreFactor scoreFactorsItem) {
    if (this.scoreFactors == null) {
      this.scoreFactors = new ArrayList<ScoreFactor>();
    }
    this.scoreFactors.add(scoreFactorsItem);
    return this;
  }

  /**
   * Score Factor Codes (Upto 5 items can be returned)
   * @return scoreFactors
  **/
  @ApiModelProperty(value = "Score Factor Codes (Upto 5 items can be returned)")
      @Valid
    public List<ScoreFactor> getScoreFactors() {
    return scoreFactors;
  }

  public void setScoreFactors(List<ScoreFactor> scoreFactors) {
    this.scoreFactors = scoreFactors;
  }

  public RiskModelRespHealth scorePercentile(String scorePercentile) {
    this.scorePercentile = scorePercentile;
    return this;
  }

  /**
   * Present when ScorePercentile is requested on input and is available for a score. Nation Score Percentile.          
   * @return scorePercentile
  **/
  @ApiModelProperty(value = "Present when ScorePercentile is requested on input and is available for a score. Nation Score Percentile.          ")
  
    public String getScorePercentile() {
    return scorePercentile;
  }

  public void setScorePercentile(String scorePercentile) {
    this.scorePercentile = scorePercentile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskModelRespHealth riskModelRespHealth = (RiskModelRespHealth) o;
    return Objects.equals(this.evaluation, riskModelRespHealth.evaluation) &&
        Objects.equals(this.grade, riskModelRespHealth.grade) &&
        Objects.equals(this.modelIndicator, riskModelRespHealth.modelIndicator) &&
        Objects.equals(this.score, riskModelRespHealth.score) &&
        Objects.equals(this.scoreFactors, riskModelRespHealth.scoreFactors) &&
        Objects.equals(this.scorePercentile, riskModelRespHealth.scorePercentile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluation, grade, modelIndicator, score, scoreFactors, scorePercentile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskModelRespHealth {\n");
    
    sb.append("    evaluation: ").append(toIndentedString(evaluation)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    modelIndicator: ").append(toIndentedString(modelIndicator)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    scoreFactors: ").append(toIndentedString(scoreFactors)).append("\n");
    sb.append("    scorePercentile: ").append(toIndentedString(scorePercentile)).append("\n");
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
