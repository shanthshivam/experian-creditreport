package com.b4nkd.creditscore.experian.model;

import java.util.Objects;
import com.b4nkd.creditscore.experian.model.RiskModelResp;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Risk Models present when requested via input or subscriber code.
 */
@ApiModel(description = "Risk Models present when requested via input or subscriber code.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")

public class RiskModel {
	@JsonProperty("modelIndicator")
	@Valid
	private List<String> modelIndicator = null;

	@JsonProperty("scorePercentile")
	private String scorePercentile = null;

	public List<String> getModelIndicator() {
		return modelIndicator;
	}

	public void setModelIndicator(List<String> modelIndicator) {
		this.modelIndicator = modelIndicator;
	}

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
		RiskModel riskModel = (RiskModel) o;
	    return Objects.equals(this.modelIndicator, riskModel.modelIndicator) &&
	        Objects.equals(this.scorePercentile, riskModel.scorePercentile);
	}

	@Override
	public int hashCode() {
		return Objects.hash(modelIndicator,scorePercentile);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RiskModel {\n");
		sb.append("    modelIndicator: ").append(toIndentedString(modelIndicator)).append("\n");
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
