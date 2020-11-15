package com.b4nkd.creditscore.experian.api;

import com.b4nkd.creditscore.experian.model.CreditProfileRequest;
import com.b4nkd.creditscore.experian.model.CreditProfileResponseForCP;
import com.b4nkd.creditscore.experian.model.ErrorResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;

import org.apache.commons.io.IOUtils;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")
@Controller
public class V2ApiController implements V2Api {

	private static final Logger log = LoggerFactory.getLogger(V2ApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public V2ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<CreditProfileResponseForCP> creditReports(
			@ApiParam(value = "Input Request format", required = true, allowableValues = "application/json", defaultValue = "application/json") @RequestHeader(value = "Content-Type", required = true) String contentType,
			@ApiParam(value = "Consumer's PII , Requestor Information, Addons and any custom options to be specified here.", required = true) @Valid @RequestBody CreditProfileRequest body,
			@ApiParam(value = "API client generated reference Id to uniquely identify the API request.", allowableValues = "SBMYSQL", defaultValue = "SBMYSQL") @RequestHeader(value = "clientReferenceId", required = false) String clientReferenceId,
			@ApiParam(value = "Output Response format", allowableValues = "application/json", defaultValue = "application/json") @RequestHeader(value = "Accept", required = false) String accept) {
		accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {

				//System.out.println("PRINTING INPUT REQUEST: " + body.toString());
				HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
						HttpClientBuilder.create().build());
				RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
				// RestTemplate restTemplate = new RestTemplate();

				// adding to try fixing the bad request issue

//				List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
//				messageConverters.add(new MappingJackson2HttpMessageConverter());
//				restTemplate.setMessageConverters(messageConverters);

//				final String uri = "https://sandbox-us-api.experian.com/eits/gdp/v1/request?targeturl=https://sandbox-us-api.experian.com/consumerservices/credit-profile/v2/credit-report";
				final String uri = "https://sandbox-us-api.experian.com/eits/gdp/v1/request?targeturl=https://sandbox-us-api.experian.com/consumerservices/credit-profile/v2/credit-report";

				HttpHeaders headers = new HttpHeaders();
				// headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
				headers.set("Content-Type", "application/json");
				headers.set("Accept", "application/json");
				headers.setContentType(MediaType.APPLICATION_JSON);
				//headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
				headers.set("clientReferenceId", "SBMYSQL");
				headers.add("Authorization",
						"Bearer eyJraWQiOiJESmpTMXJQQjdJODBHWjgybmNsSlZPQkF3V3B3ZTVYblNKZUdSZHdpcEY0IiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJzdWIiOiJoZWxsb0BiNG5rZC5hcHAiLCJFbWFpbCI6ImhlbGxvQGI0bmtkLmFwcCIsIkZpcnN0TmFtZSI6ImI0bmtkIiwiaXNzIjoiRVhQRVJJQU4iLCJMYXN0TmFtZSI6InRlYW0iLCJleHAiOjE2MDUzNDkwMjIsImlhdCI6MTYwNTM0NzIyMiwianRpIjoiYjQyODgxNWUtZmExNS00MTJmLWJkMTQtMzg2MzNiM2M0Mzg4In0.Cqy6sWAJ3X9N3_iCLtkIG10OICitudbGtsoco6ZIazpc6xLySmyhJ0HVO6nDnFpWXZo4dxNoPDrkOcfFqpNNsM9u2H-YU2JJnssTiFi0uZY_0i0F2gpWEjyddWY9azyGFQK3CD4yn5mssOqgMZWkKkG92rsJCP2Sxo_mpoDbkgWEBDdDEsd-8F7DxLSyL6f--cbhzFfK_2rbF_uhxa-ZOv-xVtO4ZZjyuYm1IdfC2R96_icMB2tSgpHNha96h6PH7J7iqDPGcL00drA9V08DSBoiU4Wdc3viENXkfWbwt92jOO07IGxs8VglOVazL3luRILzXe6LMWaL4oQB81C5JQ");

				InputStream iStream = new FileInputStream(
						new File("D:\\Swagger\\ExperianCreditReport\\Success_1.json"));
				String jsonText = IOUtils.toString(iStream, "UTF-8");
				InputStream iStreamInput = new FileInputStream(
						new File("D:\\Swagger\\ExperianCreditReport\\Success_1_input.json"));
				String jsonInputText = IOUtils.toString(iStreamInput, "UTF-8");
				
				// for string input as json
				HttpEntity<String> entity = new HttpEntity<String>(jsonInputText, headers);
				
				System.out.println(" at 1 ");
				//HttpEntity<CreditProfileRequest> entity = new HttpEntity<CreditProfileRequest>(body, headers);
				System.out.println(" at 2 ");
				ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.POST, entity, String.class);
				System.out.println("OUTPUT OF THE EXPERIAN RESPONSE : " + response.toString());
				ResponseEntity<CreditProfileResponseForCP> responseObject = restTemplate.exchange(uri, HttpMethod.POST,
						entity, CreditProfileResponseForCP.class);
				System.out.println(" at 3 " + response.toString());
				System.out.println(response.getStatusCode());
				//System.out.println("RESPONSE FROM EXPERIAN : " + response.toString());
				// original response
				// return response;
				// sample json response from file system
				return responseObject;
				//return new ResponseEntity<CreditProfileResponseForCP>(
				//		objectMapper.readValue(jsonText, CreditProfileResponseForCP.class), HttpStatus.CREATED);
				// return new
				// ResponseEntity<CreditProfileResponseForCP>(objectMapper.readValue("{\r\n
				// \"creditProfile\" : [ {\r\n \"addressInformation\" : [ {\r\n
				// \"timesReported\" : \"1\",\r\n \"zipCode\" : \"915021234\",\r\n \"city\" :
				// \"BURBANK\",\r\n \"firstReportedDate\" : \"06011995\",\r\n \"dwellingType\" :
				// \"dwellingType\",\r\n \"source\" : \"source\",\r\n \"streetPrefix\" : \"10655
				// N\",\r\n \"unitType\" : \"APT\",\r\n \"countyCode\" : \"123\",\r\n
				// \"lastUpdatedDate\" : \"01011998\",\r\n \"streetName\" : \"BIRCH\",\r\n
				// \"msaCode\" : \"0\",\r\n \"unitId\" : \"unitId\",\r\n \"stateCode\" :
				// \"0\",\r\n \"streetSuffix\" : \"ST\",\r\n \"censusGeoCode\" :
				// \"4567890\",\r\n \"state\" : \"CA\",\r\n \"lastReportingSubscriberCode\" :
				// \"1220855\"\r\n }, {\r\n \"timesReported\" : \"1\",\r\n \"zipCode\" :
				// \"915021234\",\r\n \"city\" : \"BURBANK\",\r\n \"firstReportedDate\" :
				// \"06011995\",\r\n \"dwellingType\" : \"dwellingType\",\r\n \"source\" :
				// \"source\",\r\n \"streetPrefix\" : \"10655 N\",\r\n \"unitType\" :
				// \"APT\",\r\n \"countyCode\" : \"123\",\r\n \"lastUpdatedDate\" :
				// \"01011998\",\r\n \"streetName\" : \"BIRCH\",\r\n \"msaCode\" : \"0\",\r\n
				// \"unitId\" : \"unitId\",\r\n \"stateCode\" : \"0\",\r\n \"streetSuffix\" :
				// \"ST\",\r\n \"censusGeoCode\" : \"4567890\",\r\n \"state\" : \"CA\",\r\n
				// \"lastReportingSubscriberCode\" : \"1220855\"\r\n } ],\r\n \"mla\" : {\r\n
				// \"messageText\" : \"messageText\",\r\n \"messageNumber\" :
				// \"messageNumber\"\r\n },\r\n \"uniqueConsumerIdentifier\" : {\r\n \"value\" :
				// \"value\",\r\n \"verificationIndicator\" : \"verificationIndicator\"\r\n
				// },\r\n \"employmentInformation\" : [ {\r\n \"zipCode\" : \"91502\",\r\n
				// \"addressFirstLine\" : \"10655 N BIRCH ST\",\r\n \"addressSecondLine\" :
				// \"WASHINGTON DC\",\r\n \"lastUpdatedDate\" : \"09011991\",\r\n \"name\" :
				// \"HARDWARE\",\r\n \"firstReportedDate\" : \"05011991\",\r\n
				// \"addressExtraLine\" : \"addressExtraLine\",\r\n \"source\" : \"8\"\r\n },
				// {\r\n \"zipCode\" : \"91502\",\r\n \"addressFirstLine\" : \"10655 N BIRCH
				// ST\",\r\n \"addressSecondLine\" : \"WASHINGTON DC\",\r\n \"lastUpdatedDate\"
				// : \"09011991\",\r\n \"name\" : \"HARDWARE\",\r\n \"firstReportedDate\" :
				// \"05011991\",\r\n \"addressExtraLine\" : \"addressExtraLine\",\r\n \"source\"
				// : \"8\"\r\n } ],\r\n \"fraudShield\" : [ {\r\n \"addressDate\" :
				// \"03011996\",\r\n \"fraudShieldIndicators\" : {\r\n \"indicator\" : [ \"5\",
				// \"5\" ]\r\n },\r\n \"dateOfDeath\" : \"03301996\",\r\n \"dateOfBirth\" :
				// \"01101951\",\r\n \"sic\" : \"sic\",\r\n \"type\" : \"1\",\r\n
				// \"ssnLastPossibleIssuanceYear\" : \"1966\",\r\n \"addressCount\" : \"1\",\r\n
				// \"socialCount\" : \"1\",\r\n \"addressErrorCode\" : \"0\",\r\n \"text\" :
				// \"text\",\r\n \"socialErrorCode\" : \"socialErrorCode\",\r\n
				// \"ssnFirstPossibleIssuanceYear\" : \"1965\",\r\n \"socialDate\" :
				// \"03011996\"\r\n }, {\r\n \"addressDate\" : \"03011996\",\r\n
				// \"fraudShieldIndicators\" : {\r\n \"indicator\" : [ \"5\", \"5\" ]\r\n },\r\n
				// \"dateOfDeath\" : \"03301996\",\r\n \"dateOfBirth\" : \"01101951\",\r\n
				// \"sic\" : \"sic\",\r\n \"type\" : \"1\",\r\n \"ssnLastPossibleIssuanceYear\"
				// : \"1966\",\r\n \"addressCount\" : \"1\",\r\n \"socialCount\" : \"1\",\r\n
				// \"addressErrorCode\" : \"0\",\r\n \"text\" : \"text\",\r\n
				// \"socialErrorCode\" : \"socialErrorCode\",\r\n
				// \"ssnFirstPossibleIssuanceYear\" : \"1965\",\r\n \"socialDate\" :
				// \"03011996\"\r\n } ],\r\n \"ofac\" : {\r\n \"messageText\" :
				// \"messageText\",\r\n \"messageNumber\" : \"messageNumber\"\r\n },\r\n
				// \"consumerIdentity\" : {\r\n \"phone\" : [ {\r\n \"number\" :
				// \"5555555555\",\r\n \"source\" : \"I\",\r\n \"type\" : \"type\"\r\n }, {\r\n
				// \"number\" : \"5555555555\",\r\n \"source\" : \"I\",\r\n \"type\" :
				// \"type\"\r\n } ],\r\n \"dob\" : {\r\n \"month\" : \"08\",\r\n \"year\" :
				// \"1990\",\r\n \"day\" : \"4\"\r\n },\r\n \"name\" : [ {\r\n \"firstName\" :
				// \"JON\",\r\n \"surname\" : \"CONSUMER\",\r\n \"secondSurname\" :
				// \"CONSUMER\",\r\n \"middleName\" : \"Q\",\r\n \"generationCode\" : \"J\",\r\n
				// \"type\" : \"A\"\r\n }, {\r\n \"firstName\" : \"JON\",\r\n \"surname\" :
				// \"CONSUMER\",\r\n \"secondSurname\" : \"CONSUMER\",\r\n \"middleName\" :
				// \"Q\",\r\n \"generationCode\" : \"J\",\r\n \"type\" : \"A\"\r\n } ]\r\n
				// },\r\n \"ssn\" : [ {\r\n \"number\" : \"123456789\",\r\n
				// \"variationIndicator\" : \"variationIndicator\",\r\n \"ssnIndicators\" :
				// \"ssnIndicators\"\r\n }, {\r\n \"number\" : \"123456789\",\r\n
				// \"variationIndicator\" : \"variationIndicator\",\r\n \"ssnIndicators\" :
				// \"ssnIndicators\"\r\n } ],\r\n \"publicRecord\" : [ {\r\n \"statusDate\" :
				// \"07011995\",\r\n \"amount\" : \"0\",\r\n \"disputeFlag\" :
				// \"disputeFlag\",\r\n \"consumerComment\" : \"consumerComment\",\r\n
				// \"courtCode\" : \"0\",\r\n \"filingDate\" : \"6201994.0\",\r\n
				// \"repaymentPercent\" : \"repaymentPercent\",\r\n \"adjustmentPercent\" :
				// \"adjustmentPercent\",\r\n \"evaluation\" : \"evaluation\",\r\n
				// \"plaintiffName\" : \"plaintiffName\",\r\n \"bookPageSequence\" :
				// \"bookPageSequence\",\r\n \"courtName\" : \"BANKRUPTCY COURT\",\r\n
				// \"referenceNumber\" : \"referenceNumber\",\r\n
				// \"bankruptcyVoluntaryIndicator\" : \"bankruptcyVoluntaryIndicator\",\r\n
				// \"bankruptcyAssetAmount\" : \"0\",\r\n \"ecoa\" : \"ecoa\",\r\n \"status\" :
				// \"status\"\r\n }, {\r\n \"statusDate\" : \"07011995\",\r\n \"amount\" :
				// \"0\",\r\n \"disputeFlag\" : \"disputeFlag\",\r\n \"consumerComment\" :
				// \"consumerComment\",\r\n \"courtCode\" : \"0\",\r\n \"filingDate\" :
				// \"6201994.0\",\r\n \"repaymentPercent\" : \"repaymentPercent\",\r\n
				// \"adjustmentPercent\" : \"adjustmentPercent\",\r\n \"evaluation\" :
				// \"evaluation\",\r\n \"plaintiffName\" : \"plaintiffName\",\r\n
				// \"bookPageSequence\" : \"bookPageSequence\",\r\n \"courtName\" : \"BANKRUPTCY
				// COURT\",\r\n \"referenceNumber\" : \"referenceNumber\",\r\n
				// \"bankruptcyVoluntaryIndicator\" : \"bankruptcyVoluntaryIndicator\",\r\n
				// \"bankruptcyAssetAmount\" : \"0\",\r\n \"ecoa\" : \"ecoa\",\r\n \"status\" :
				// \"status\"\r\n } ],\r\n \"riskModel\" : [ {\r\n \"evaluation\" :
				// \"evaluation\",\r\n \"score\" : \"0\",\r\n \"scorePercentile\" :
				// \"scorePercentile\",\r\n \"grade\" : \"grade\",\r\n \"scoreFactors\" : [
				// {\r\n \"code\" : \"code\",\r\n \"importance\" : \"importance\"\r\n }, {\r\n
				// \"code\" : \"code\",\r\n \"importance\" : \"importance\"\r\n } ],\r\n
				// \"modelIndicator\" : \"V4\"\r\n }, {\r\n \"evaluation\" : \"evaluation\",\r\n
				// \"score\" : \"0\",\r\n \"scorePercentile\" : \"scorePercentile\",\r\n
				// \"grade\" : \"grade\",\r\n \"scoreFactors\" : [ {\r\n \"code\" :
				// \"code\",\r\n \"importance\" : \"importance\"\r\n }, {\r\n \"code\" :
				// \"code\",\r\n \"importance\" : \"importance\"\r\n } ],\r\n \"modelIndicator\"
				// : \"V4\"\r\n } ],\r\n \"tradeline\" : [ {\r\n \"specialComment\" :
				// \"specialComment\",\r\n \"statusDate\" : \"statusDate\",\r\n
				// \"amount1Qualifier\" : \"amount1Qualifier\",\r\n \"consumerComment\" :
				// \"consumerComment\",\r\n \"maxDelinquencyDate\" : \"maxDelinquencyDate\",\r\n
				// \"paymentHistory\" : \"paymentHistory\",\r\n \"originalCreditorName\" :
				// \"originalCreditorName\",\r\n \"evaluation\" : \"evaluation\",\r\n
				// \"consumerDisputeFlag\" : \"consumerDisputeFlag\",\r\n \"amount2\" :
				// \"amount2\",\r\n \"terms\" : \"terms\",\r\n \"amount1\" : \"amount1\",\r\n
				// \"lastPaymentDate\" : \"lastPaymentDate\",\r\n \"enhancedPaymentData\" :
				// {\r\n \"chargeoffAmount\" : \"chargeoffAmount\",\r\n \"mortgageId\" :
				// \"mortgageId\",\r\n \"maxDelinquencyCode\" : \"maxDelinquencyCode\",\r\n
				// \"enhancedTermsFrequency\" : \"enhancedTermsFrequency\",\r\n
				// \"paymentLevelDate\" : \"paymentLevelDate\",\r\n \"ciiCode\" :
				// \"ciiCode\",\r\n \"enhancedPaymentHistory84\" :
				// \"enhancedPaymentHistory84\",\r\n \"purchasedPortfolioFromName\" :
				// \"purchasedPortfolioFromName\",\r\n \"secondaryAgencyCode\" :
				// \"secondaryAgencyCode\",\r\n \"complianceCondition\" :
				// \"complianceCondition\",\r\n \"originalCreditorClassificationCode\" :
				// \"originalCreditorClassificationCode\",\r\n \"specialPaymentAmount\" :
				// \"specialPaymentAmount\",\r\n \"enhancedAccountCondition\" :
				// \"enhancedAccountCondition\",\r\n \"highBalanceAmount\" :
				// \"highBalanceAmount\",\r\n \"secondDelinquencyDate\" :
				// \"secondDelinquencyDate\",\r\n \"enhancedPaymentStatus\" :
				// \"enhancedPaymentStatus\",\r\n \"enhancedSpecialComment\" :
				// \"enhancedSpecialComment\",\r\n \"firstDelinquencyDate\" :
				// \"firstDelinquencyDate\",\r\n \"enhancedAccountType\" :
				// \"enhancedAccountType\",\r\n \"originalLoanAmount\" :
				// \"originalLoanAmount\",\r\n \"creditLimitAmount\" :
				// \"creditLimitAmount\",\r\n \"actualPaymentAmount\" :
				// \"actualPaymentAmount\",\r\n \"enhancedTerms\" : \"enhancedTerms\",\r\n
				// \"specialPaymentCode\" : \"specialPaymentCode\",\r\n \"specialPaymentDate\" :
				// \"specialPaymentDate\",\r\n \"secondaryAgencyId\" : \"secondaryAgencyId\"\r\n
				// },\r\n \"monthlyPaymentAmount\" : \"monthlyPaymentAmount\",\r\n
				// \"revolvingOrInstallment\" : \"revolvingOrInstallment\",\r\n
				// \"monthlyPaymentType\" : \"monthlyPaymentType\",\r\n \"ecoa\" : \"ecoa\",\r\n
				// \"delinquencies90to180Days\" : \"delinquencies90to180Days\",\r\n
				// \"accountType\" : \"accountType\",\r\n \"delinquencies60Days\" :
				// \"delinquencies60Days\",\r\n \"monthsHistory\" : \"monthsHistory\",\r\n
				// \"datePaymentDue\" : \"datePaymentDue\",\r\n \"delinquencies30Days\" :
				// \"delinquencies30Days\",\r\n \"soldToName\" : \"soldToName\",\r\n
				// \"subscriberCode\" : \"subscriberCode\",\r\n \"amount2Qualifier\" :
				// \"amount2Qualifier\",\r\n \"accountNumber\" : \"1234\",\r\n \"balanceAmount\"
				// : \"balanceAmount\",\r\n \"openOrClosed\" : \"openOrClosed\",\r\n
				// \"balanceDate\" : \"balanceDate\",\r\n \"subscriberName\" :
				// \"subscriberName\",\r\n \"amountBalloonPayment\" :
				// \"amountBalloonPayment\",\r\n \"bankruptcyChapterNumber\" :
				// \"bankruptcyChapterNumber\",\r\n \"derogCounter\" : \"derogCounter\",\r\n
				// \"trendedTrades\" : [ {\r\n \"originalLoamAmountOrLimit\" :
				// \"originalLoamAmountOrLimit\",\r\n \"scheduledPaymentAmount\" :
				// \"scheduledPaymentAmount\",\r\n \"actualPaymentAmount\" :
				// \"actualPaymentAmount\",\r\n \"monthNumber\" : \"monthNumber\",\r\n
				// \"lastPaymentDate\" : \"lastPaymentDate\",\r\n \"balanceAmount\" :
				// \"balanceAmount\"\r\n }, {\r\n \"originalLoamAmountOrLimit\" :
				// \"originalLoamAmountOrLimit\",\r\n \"scheduledPaymentAmount\" :
				// \"scheduledPaymentAmount\",\r\n \"actualPaymentAmount\" :
				// \"actualPaymentAmount\",\r\n \"monthNumber\" : \"monthNumber\",\r\n
				// \"lastPaymentDate\" : \"lastPaymentDate\",\r\n \"balanceAmount\" :
				// \"balanceAmount\"\r\n } ],\r\n \"amountPastDue\" : \"amountPastDue\",\r\n
				// \"openDate\" : \"openDate\",\r\n \"kob\" : \"YC\",\r\n \"status\" :
				// \"status\"\r\n }, {\r\n \"specialComment\" : \"specialComment\",\r\n
				// \"statusDate\" : \"statusDate\",\r\n \"amount1Qualifier\" :
				// \"amount1Qualifier\",\r\n \"consumerComment\" : \"consumerComment\",\r\n
				// \"maxDelinquencyDate\" : \"maxDelinquencyDate\",\r\n \"paymentHistory\" :
				// \"paymentHistory\",\r\n \"originalCreditorName\" :
				// \"originalCreditorName\",\r\n \"evaluation\" : \"evaluation\",\r\n
				// \"consumerDisputeFlag\" : \"consumerDisputeFlag\",\r\n \"amount2\" :
				// \"amount2\",\r\n \"terms\" : \"terms\",\r\n \"amount1\" : \"amount1\",\r\n
				// \"lastPaymentDate\" : \"lastPaymentDate\",\r\n \"enhancedPaymentData\" :
				// {\r\n \"chargeoffAmount\" : \"chargeoffAmount\",\r\n \"mortgageId\" :
				// \"mortgageId\",\r\n \"maxDelinquencyCode\" : \"maxDelinquencyCode\",\r\n
				// \"enhancedTermsFrequency\" : \"enhancedTermsFrequency\",\r\n
				// \"paymentLevelDate\" : \"paymentLevelDate\",\r\n \"ciiCode\" :
				// \"ciiCode\",\r\n \"enhancedPaymentHistory84\" :
				// \"enhancedPaymentHistory84\",\r\n \"purchasedPortfolioFromName\" :
				// \"purchasedPortfolioFromName\",\r\n \"secondaryAgencyCode\" :
				// \"secondaryAgencyCode\",\r\n \"complianceCondition\" :
				// \"complianceCondition\",\r\n \"originalCreditorClassificationCode\" :
				// \"originalCreditorClassificationCode\",\r\n \"specialPaymentAmount\" :
				// \"specialPaymentAmount\",\r\n \"enhancedAccountCondition\" :
				// \"enhancedAccountCondition\",\r\n \"highBalanceAmount\" :
				// \"highBalanceAmount\",\r\n \"secondDelinquencyDate\" :
				// \"secondDelinquencyDate\",\r\n \"enhancedPaymentStatus\" :
				// \"enhancedPaymentStatus\",\r\n \"enhancedSpecialComment\" :
				// \"enhancedSpecialComment\",\r\n \"firstDelinquencyDate\" :
				// \"firstDelinquencyDate\",\r\n \"enhancedAccountType\" :
				// \"enhancedAccountType\",\r\n \"originalLoanAmount\" :
				// \"originalLoanAmount\",\r\n \"creditLimitAmount\" :
				// \"creditLimitAmount\",\r\n \"actualPaymentAmount\" :
				// \"actualPaymentAmount\",\r\n \"enhancedTerms\" : \"enhancedTerms\",\r\n
				// \"specialPaymentCode\" : \"specialPaymentCode\",\r\n \"specialPaymentDate\" :
				// \"specialPaymentDate\",\r\n \"secondaryAgencyId\" : \"secondaryAgencyId\"\r\n
				// },\r\n \"monthlyPaymentAmount\" : \"monthlyPaymentAmount\",\r\n
				// \"revolvingOrInstallment\" : \"revolvingOrInstallment\",\r\n
				// \"monthlyPaymentType\" : \"monthlyPaymentType\",\r\n \"ecoa\" : \"ecoa\",\r\n
				// \"delinquencies90to180Days\" : \"delinquencies90to180Days\",\r\n
				// \"accountType\" : \"accountType\",\r\n \"delinquencies60Days\" :
				// \"delinquencies60Days\",\r\n \"monthsHistory\" : \"monthsHistory\",\r\n
				// \"datePaymentDue\" : \"datePaymentDue\",\r\n \"delinquencies30Days\" :
				// \"delinquencies30Days\",\r\n \"soldToName\" : \"soldToName\",\r\n
				// \"subscriberCode\" : \"subscriberCode\",\r\n \"amount2Qualifier\" :
				// \"amount2Qualifier\",\r\n \"accountNumber\" : \"1234\",\r\n \"balanceAmount\"
				// : \"balanceAmount\",\r\n \"openOrClosed\" : \"openOrClosed\",\r\n
				// \"balanceDate\" : \"balanceDate\",\r\n \"subscriberName\" :
				// \"subscriberName\",\r\n \"amountBalloonPayment\" :
				// \"amountBalloonPayment\",\r\n \"bankruptcyChapterNumber\" :
				// \"bankruptcyChapterNumber\",\r\n \"derogCounter\" : \"derogCounter\",\r\n
				// \"trendedTrades\" : [ {\r\n \"originalLoamAmountOrLimit\" :
				// \"originalLoamAmountOrLimit\",\r\n \"scheduledPaymentAmount\" :
				// \"scheduledPaymentAmount\",\r\n \"actualPaymentAmount\" :
				// \"actualPaymentAmount\",\r\n \"monthNumber\" : \"monthNumber\",\r\n
				// \"lastPaymentDate\" : \"lastPaymentDate\",\r\n \"balanceAmount\" :
				// \"balanceAmount\"\r\n }, {\r\n \"originalLoamAmountOrLimit\" :
				// \"originalLoamAmountOrLimit\",\r\n \"scheduledPaymentAmount\" :
				// \"scheduledPaymentAmount\",\r\n \"actualPaymentAmount\" :
				// \"actualPaymentAmount\",\r\n \"monthNumber\" : \"monthNumber\",\r\n
				// \"lastPaymentDate\" : \"lastPaymentDate\",\r\n \"balanceAmount\" :
				// \"balanceAmount\"\r\n } ],\r\n \"amountPastDue\" : \"amountPastDue\",\r\n
				// \"openDate\" : \"openDate\",\r\n \"kob\" : \"YC\",\r\n \"status\" :
				// \"status\"\r\n } ],\r\n \"inquiry\" : [ {\r\n \"date\" : \"12051998\",\r\n
				// \"amount\" : \"amount\",\r\n \"terms\" : \"REV\",\r\n \"subscriberName\" :
				// \"BANK\",\r\n \"subscriberCode\" : \"0\",\r\n \"type\" : \"31\",\r\n \"kob\"
				// : \"DC\"\r\n }, {\r\n \"date\" : \"12051998\",\r\n \"amount\" :
				// \"amount\",\r\n \"terms\" : \"REV\",\r\n \"subscriberName\" : \"BANK\",\r\n
				// \"subscriberCode\" : \"0\",\r\n \"type\" : \"31\",\r\n \"kob\" : \"DC\"\r\n }
				// ],\r\n \"statement\" : [ {\r\n \"statementText\" : \"statementText\",\r\n
				// \"dateReported\" : \"dateReported\",\r\n \"type\" : \"type\"\r\n }, {\r\n
				// \"statementText\" : \"statementText\",\r\n \"dateReported\" :
				// \"dateReported\",\r\n \"type\" : \"type\"\r\n } ],\r\n
				// \"consumerAssistanceReferralAddress\" : {\r\n \"officeName\" :
				// \"EXPERIAN\",\r\n \"poBox\" : \"PO BOX 0000\",\r\n \"streetName\" : \"10655 N
				// BIRCH STREET\",\r\n \"phone\" : \"5555555555\",\r\n \"cityStateZip\" :
				// \"BURBANK, CA 91502\"\r\n },\r\n \"informationalMessage\" : [ {\r\n
				// \"messageText\" : \"PRODUCT OPTION NOT ALLOWED\",\r\n
				// \"messageNumberDetailed\" : \"0084\",\r\n \"messageNumber\" : \"84\"\r\n },
				// {\r\n \"messageText\" : \"PRODUCT OPTION NOT ALLOWED\",\r\n
				// \"messageNumberDetailed\" : \"0084\",\r\n \"messageNumber\" : \"84\"\r\n }
				// ],\r\n \"clarityAttributes\" : {\r\n \"secondaryApplicantClarityAttributes\"
				// : [ {\r\n \"id\" : \"123456789\",\r\n \"value\" : \"value\"\r\n }, {\r\n
				// \"id\" : \"123456789\",\r\n \"value\" : \"value\"\r\n } ],\r\n
				// \"primaryApplicantClarityAttributes\" : [ {\r\n \"id\" : \"123456789\",\r\n
				// \"value\" : \"value\"\r\n }, {\r\n \"id\" : \"123456789\",\r\n \"value\" :
				// \"value\"\r\n } ]\r\n },\r\n \"directCheck\" : [ {\r\n \"subscriberPhone\" :
				// \"BYMAILONLY\",\r\n \"subscriberName\" : \"BANK\",\r\n \"subscriberCode\" :
				// \"0\",\r\n \"subscriberState\" : \"CA\",\r\n \"subscriberCity\" : \"CA\",\r\n
				// \"subscriberAddress\" : \"10655 N BIRCH ST\",\r\n \"subscriberZipCode\" :
				// \"91502\"\r\n }, {\r\n \"subscriberPhone\" : \"BYMAILONLY\",\r\n
				// \"subscriberName\" : \"BANK\",\r\n \"subscriberCode\" : \"0\",\r\n
				// \"subscriberState\" : \"CA\",\r\n \"subscriberCity\" : \"CA\",\r\n
				// \"subscriberAddress\" : \"10655 N BIRCH ST\",\r\n \"subscriberZipCode\" :
				// \"91502\"\r\n } ],\r\n \"summaries\" : [ {\r\n \"summaryType\" :
				// \"summaryType\",\r\n \"attributes\" : [ {\r\n \"id\" : \"id\",\r\n \"value\"
				// : \"value\"\r\n }, {\r\n \"id\" : \"id\",\r\n \"value\" : \"value\"\r\n }
				// ]\r\n }, {\r\n \"summaryType\" : \"summaryType\",\r\n \"attributes\" : [
				// {\r\n \"id\" : \"id\",\r\n \"value\" : \"value\"\r\n }, {\r\n \"id\" :
				// \"id\",\r\n \"value\" : \"value\"\r\n } ]\r\n } ]\r\n }, {\r\n
				// \"addressInformation\" : [ {\r\n \"timesReported\" : \"1\",\r\n \"zipCode\" :
				// \"915021234\",\r\n \"city\" : \"BURBANK\",\r\n \"firstReportedDate\" :
				// \"06011995\",\r\n \"dwellingType\" : \"dwellingType\",\r\n \"source\" :
				// \"source\",\r\n \"streetPrefix\" : \"10655 N\",\r\n \"unitType\" :
				// \"APT\",\r\n \"countyCode\" : \"123\",\r\n \"lastUpdatedDate\" :
				// \"01011998\",\r\n \"streetName\" : \"BIRCH\",\r\n \"msaCode\" : \"0\",\r\n
				// \"unitId\" : \"unitId\",\r\n \"stateCode\" : \"0\",\r\n \"streetSuffix\" :
				// \"ST\",\r\n \"censusGeoCode\" : \"4567890\",\r\n \"state\" : \"CA\",\r\n
				// \"lastReportingSubscriberCode\" : \"1220855\"\r\n }, {\r\n \"timesReported\"
				// : \"1\",\r\n \"zipCode\" : \"915021234\",\r\n \"city\" : \"BURBANK\",\r\n
				// \"firstReportedDate\" : \"06011995\",\r\n \"dwellingType\" :
				// \"dwellingType\",\r\n \"source\" : \"source\",\r\n \"streetPrefix\" : \"10655
				// N\",\r\n \"unitType\" : \"APT\",\r\n \"countyCode\" : \"123\",\r\n
				// \"lastUpdatedDate\" : \"01011998\",\r\n \"streetName\" : \"BIRCH\",\r\n
				// \"msaCode\" : \"0\",\r\n \"unitId\" : \"unitId\",\r\n \"stateCode\" :
				// \"0\",\r\n \"streetSuffix\" : \"ST\",\r\n \"censusGeoCode\" :
				// \"4567890\",\r\n \"state\" : \"CA\",\r\n \"lastReportingSubscriberCode\" :
				// \"1220855\"\r\n } ],\r\n \"mla\" : {\r\n \"messageText\" :
				// \"messageText\",\r\n \"messageNumber\" : \"messageNumber\"\r\n },\r\n
				// \"uniqueConsumerIdentifier\" : {\r\n \"value\" : \"value\",\r\n
				// \"verificationIndicator\" : \"verificationIndicator\"\r\n },\r\n
				// \"employmentInformation\" : [ {\r\n \"zipCode\" : \"91502\",\r\n
				// \"addressFirstLine\" : \"10655 N BIRCH ST\",\r\n \"addressSecondLine\" :
				// \"WASHINGTON DC\",\r\n \"lastUpdatedDate\" : \"09011991\",\r\n \"name\" :
				// \"HARDWARE\",\r\n \"firstReportedDate\" : \"05011991\",\r\n
				// \"addressExtraLine\" : \"addressExtraLine\",\r\n \"source\" : \"8\"\r\n },
				// {\r\n \"zipCode\" : \"91502\",\r\n \"addressFirstLine\" : \"10655 N BIRCH
				// ST\",\r\n \"addressSecondLine\" : \"WASHINGTON DC\",\r\n \"lastUpdatedDate\"
				// : \"09011991\",\r\n \"name\" : \"HARDWARE\",\r\n \"firstReportedDate\" :
				// \"05011991\",\r\n \"addressExtraLine\" : \"addressExtraLine\",\r\n \"source\"
				// : \"8\"\r\n } ],\r\n \"fraudShield\" : [ {\r\n \"addressDate\" :
				// \"03011996\",\r\n \"fraudShieldIndicators\" : {\r\n \"indicator\" : [ \"5\",
				// \"5\" ]\r\n },\r\n \"dateOfDeath\" : \"03301996\",\r\n \"dateOfBirth\" :
				// \"01101951\",\r\n \"sic\" : \"sic\",\r\n \"type\" : \"1\",\r\n
				// \"ssnLastPossibleIssuanceYear\" : \"1966\",\r\n \"addressCount\" : \"1\",\r\n
				// \"socialCount\" : \"1\",\r\n \"addressErrorCode\" : \"0\",\r\n \"text\" :
				// \"text\",\r\n \"socialErrorCode\" : \"socialErrorCode\",\r\n
				// \"ssnFirstPossibleIssuanceYear\" : \"1965\",\r\n \"socialDate\" :
				// \"03011996\"\r\n }, {\r\n \"addressDate\" : \"03011996\",\r\n
				// \"fraudShieldIndicators\" : {\r\n \"indicator\" : [ \"5\", \"5\" ]\r\n },\r\n
				// \"dateOfDeath\" : \"03301996\",\r\n \"dateOfBirth\" : \"01101951\",\r\n
				// \"sic\" : \"sic\",\r\n \"type\" : \"1\",\r\n \"ssnLastPossibleIssuanceYear\"
				// : \"1966\",\r\n \"addressCount\" : \"1\",\r\n \"socialCount\" : \"1\",\r\n
				// \"addressErrorCode\" : \"0\",\r\n \"text\" : \"text\",\r\n
				// \"socialErrorCode\" : \"socialErrorCode\",\r\n
				// \"ssnFirstPossibleIssuanceYear\" : \"1965\",\r\n \"socialDate\" :
				// \"03011996\"\r\n } ],\r\n \"ofac\" : {\r\n \"messageText\" :
				// \"messageText\",\r\n \"messageNumber\" : \"messageNumber\"\r\n },\r\n
				// \"consumerIdentity\" : {\r\n \"phone\" : [ {\r\n \"number\" :
				// \"5555555555\",\r\n \"source\" : \"I\",\r\n \"type\" : \"type\"\r\n }, {\r\n
				// \"number\" : \"5555555555\",\r\n \"source\" : \"I\",\r\n \"type\" :
				// \"type\"\r\n } ],\r\n \"dob\" : {\r\n \"month\" : \"08\",\r\n \"year\" :
				// \"1990\",\r\n \"day\" : \"4\"\r\n },\r\n \"name\" : [ {\r\n \"firstName\" :
				// \"JON\",\r\n \"surname\" : \"CONSUMER\",\r\n \"secondSurname\" :
				// \"CONSUMER\",\r\n \"middleName\" : \"Q\",\r\n \"generationCode\" : \"J\",\r\n
				// \"type\" : \"A\"\r\n }, {\r\n \"firstName\" : \"JON\",\r\n \"surname\" :
				// \"CONSUMER\",\r\n \"secondSurname\" : \"CONSUMER\",\r\n \"middleName\" :
				// \"Q\",\r\n \"generationCode\" : \"J\",\r\n \"type\" : \"A\"\r\n } ]\r\n
				// },\r\n \"ssn\" : [ {\r\n \"number\" : \"123456789\",\r\n
				// \"variationIndicator\" : \"variationIndicator\",\r\n \"ssnIndicators\" :
				// \"ssnIndicators\"\r\n }, {\r\n \"number\" : \"123456789\",\r\n
				// \"variationIndicator\" : \"variationIndicator\",\r\n \"ssnIndicators\" :
				// \"ssnIndicators\"\r\n } ],\r\n \"publicRecord\" : [ {\r\n \"statusDate\" :
				// \"07011995\",\r\n \"amount\" : \"0\",\r\n \"disputeFlag\" :
				// \"disputeFlag\",\r\n \"consumerComment\" : \"consumerComment\",\r\n
				// \"courtCode\" : \"0\",\r\n \"filingDate\" : \"6201994.0\",\r\n
				// \"repaymentPercent\" : \"repaymentPercent\",\r\n \"adjustmentPercent\" :
				// \"adjustmentPercent\",\r\n \"evaluation\" : \"evaluation\",\r\n
				// \"plaintiffName\" : \"plaintiffName\",\r\n \"bookPageSequence\" :
				// \"bookPageSequence\",\r\n \"courtName\" : \"BANKRUPTCY COURT\",\r\n
				// \"referenceNumber\" : \"referenceNumber\",\r\n
				// \"bankruptcyVoluntaryIndicator\" : \"bankruptcyVoluntaryIndicator\",\r\n
				// \"bankruptcyAssetAmount\" : \"0\",\r\n \"ecoa\" : \"ecoa\",\r\n \"status\" :
				// \"status\"\r\n }, {\r\n \"statusDate\" : \"07011995\",\r\n \"amount\" :
				// \"0\",\r\n \"disputeFlag\" : \"disputeFlag\",\r\n \"consumerComment\" :
				// \"consumerComment\",\r\n \"courtCode\" : \"0\",\r\n \"filingDate\" :
				// \"6201994.0\",\r\n \"repaymentPercent\" : \"repaymentPercent\",\r\n
				// \"adjustmentPercent\" : \"adjustmentPercent\",\r\n \"evaluation\" :
				// \"evaluation\",\r\n \"plaintiffName\" : \"plaintiffName\",\r\n
				// \"bookPageSequence\" : \"bookPageSequence\",\r\n \"courtName\" : \"BANKRUPTCY
				// COURT\",\r\n \"referenceNumber\" : \"referenceNumber\",\r\n
				// \"bankruptcyVoluntaryIndicator\" : \"bankruptcyVoluntaryIndicator\",\r\n
				// \"bankruptcyAssetAmount\" : \"0\",\r\n \"ecoa\" : \"ecoa\",\r\n \"status\" :
				// \"status\"\r\n } ],\r\n \"riskModel\" : [ {\r\n \"evaluation\" :
				// \"evaluation\",\r\n \"score\" : \"0\",\r\n \"scorePercentile\" :
				// \"scorePercentile\",\r\n \"grade\" : \"grade\",\r\n \"scoreFactors\" : [
				// {\r\n \"code\" : \"code\",\r\n \"importance\" : \"importance\"\r\n }, {\r\n
				// \"code\" : \"code\",\r\n \"importance\" : \"importance\"\r\n } ],\r\n
				// \"modelIndicator\" : \"V4\"\r\n }, {\r\n \"evaluation\" : \"evaluation\",\r\n
				// \"score\" : \"0\",\r\n \"scorePercentile\" : \"scorePercentile\",\r\n
				// \"grade\" : \"grade\",\r\n \"scoreFactors\" : [ {\r\n \"code\" :
				// \"code\",\r\n \"importance\" : \"importance\"\r\n }, {\r\n \"code\" :
				// \"code\",\r\n \"importance\" : \"importance\"\r\n } ],\r\n \"modelIndicator\"
				// : \"V4\"\r\n } ],\r\n \"tradeline\" : [ {\r\n \"specialComment\" :
				// \"specialComment\",\r\n \"statusDate\" : \"statusDate\",\r\n
				// \"amount1Qualifier\" : \"amount1Qualifier\",\r\n \"consumerComment\" :
				// \"consumerComment\",\r\n \"maxDelinquencyDate\" : \"maxDelinquencyDate\",\r\n
				// \"paymentHistory\" : \"paymentHistory\",\r\n \"originalCreditorName\" :
				// \"originalCreditorName\",\r\n \"evaluation\" : \"evaluation\",\r\n
				// \"consumerDisputeFlag\" : \"consumerDisputeFlag\",\r\n \"amount2\" :
				// \"amount2\",\r\n \"terms\" : \"terms\",\r\n \"amount1\" : \"amount1\",\r\n
				// \"lastPaymentDate\" : \"lastPaymentDate\",\r\n \"enhancedPaymentData\" :
				// {\r\n \"chargeoffAmount\" : \"chargeoffAmount\",\r\n \"mortgageId\" :
				// \"mortgageId\",\r\n \"maxDelinquencyCode\" : \"maxDelinquencyCode\",\r\n
				// \"enhancedTermsFrequency\" : \"enhancedTermsFrequency\",\r\n
				// \"paymentLevelDate\" : \"paymentLevelDate\",\r\n \"ciiCode\" :
				// \"ciiCode\",\r\n \"enhancedPaymentHistory84\" :
				// \"enhancedPaymentHistory84\",\r\n \"purchasedPortfolioFromName\" :
				// \"purchasedPortfolioFromName\",\r\n \"secondaryAgencyCode\" :
				// \"secondaryAgencyCode\",\r\n \"complianceCondition\" :
				// \"complianceCondition\",\r\n \"originalCreditorClassificationCode\" :
				// \"originalCreditorClassificationCode\",\r\n \"specialPaymentAmount\" :
				// \"specialPaymentAmount\",\r\n \"enhancedAccountCondition\" :
				// \"enhancedAccountCondition\",\r\n \"highBalanceAmount\" :
				// \"highBalanceAmount\",\r\n \"secondDelinquencyDate\" :
				// \"secondDelinquencyDate\",\r\n \"enhancedPaymentStatus\" :
				// \"enhancedPaymentStatus\",\r\n \"enhancedSpecialComment\" :
				// \"enhancedSpecialComment\",\r\n \"firstDelinquencyDate\" :
				// \"firstDelinquencyDate\",\r\n \"enhancedAccountType\" :
				// \"enhancedAccountType\",\r\n \"originalLoanAmount\" :
				// \"originalLoanAmount\",\r\n \"creditLimitAmount\" :
				// \"creditLimitAmount\",\r\n \"actualPaymentAmount\" :
				// \"actualPaymentAmount\",\r\n \"enhancedTerms\" : \"enhancedTerms\",\r\n
				// \"specialPaymentCode\" : \"specialPaymentCode\",\r\n \"specialPaymentDate\" :
				// \"specialPaymentDate\",\r\n \"secondaryAgencyId\" : \"secondaryAgencyId\"\r\n
				// },\r\n \"monthlyPaymentAmount\" : \"monthlyPaymentAmount\",\r\n
				// \"revolvingOrInstallment\" : \"revolvingOrInstallment\",\r\n
				// \"monthlyPaymentType\" : \"monthlyPaymentType\",\r\n \"ecoa\" : \"ecoa\",\r\n
				// \"delinquencies90to180Days\" : \"delinquencies90to180Days\",\r\n
				// \"accountType\" : \"accountType\",\r\n \"delinquencies60Days\" :
				// \"delinquencies60Days\",\r\n \"monthsHistory\" : \"monthsHistory\",\r\n
				// \"datePaymentDue\" : \"datePaymentDue\",\r\n \"delinquencies30Days\" :
				// \"delinquencies30Days\",\r\n \"soldToName\" : \"soldToName\",\r\n
				// \"subscriberCode\" : \"subscriberCode\",\r\n \"amount2Qualifier\" :
				// \"amount2Qualifier\",\r\n \"accountNumber\" : \"1234\",\r\n \"balanceAmount\"
				// : \"balanceAmount\",\r\n \"openOrClosed\" : \"openOrClosed\",\r\n
				// \"balanceDate\" : \"balanceDate\",\r\n \"subscriberName\" :
				// \"subscriberName\",\r\n \"amountBalloonPayment\" :
				// \"amountBalloonPayment\",\r\n \"bankruptcyChapterNumber\" :
				// \"bankruptcyChapterNumber\",\r\n \"derogCounter\" : \"derogCounter\",\r\n
				// \"trendedTrades\" : [ {\r\n \"originalLoamAmountOrLimit\" :
				// \"originalLoamAmountOrLimit\",\r\n \"scheduledPaymentAmount\" :
				// \"scheduledPaymentAmount\",\r\n \"actualPaymentAmount\" :
				// \"actualPaymentAmount\",\r\n \"monthNumber\" : \"monthNumber\",\r\n
				// \"lastPaymentDate\" : \"lastPaymentDate\",\r\n \"balanceAmount\" :
				// \"balanceAmount\"\r\n }, {\r\n \"originalLoamAmountOrLimit\" :
				// \"originalLoamAmountOrLimit\",\r\n \"scheduledPaymentAmount\" :
				// \"scheduledPaymentAmount\",\r\n \"actualPaymentAmount\" :
				// \"actualPaymentAmount\",\r\n \"monthNumber\" : \"monthNumber\",\r\n
				// \"lastPaymentDate\" : \"lastPaymentDate\",\r\n \"balanceAmount\" :
				// \"balanceAmount\"\r\n } ],\r\n \"amountPastDue\" : \"amountPastDue\",\r\n
				// \"openDate\" : \"openDate\",\r\n \"kob\" : \"YC\",\r\n \"status\" :
				// \"status\"\r\n }, {\r\n \"specialComment\" : \"specialComment\",\r\n
				// \"statusDate\" : \"statusDate\",\r\n \"amount1Qualifier\" :
				// \"amount1Qualifier\",\r\n \"consumerComment\" : \"consumerComment\",\r\n
				// \"maxDelinquencyDate\" : \"maxDelinquencyDate\",\r\n \"paymentHistory\" :
				// \"paymentHistory\",\r\n \"originalCreditorName\" :
				// \"originalCreditorName\",\r\n \"evaluation\" : \"evaluation\",\r\n
				// \"consumerDisputeFlag\" : \"consumerDisputeFlag\",\r\n \"amount2\" :
				// \"amount2\",\r\n \"terms\" : \"terms\",\r\n \"amount1\" : \"amount1\",\r\n
				// \"lastPaymentDate\" : \"lastPaymentDate\",\r\n \"enhancedPaymentData\" :
				// {\r\n \"chargeoffAmount\" : \"chargeoffAmount\",\r\n \"mortgageId\" :
				// \"mortgageId\",\r\n \"maxDelinquencyCode\" : \"maxDelinquencyCode\",\r\n
				// \"enhancedTermsFrequency\" : \"enhancedTermsFrequency\",\r\n
				// \"paymentLevelDate\" : \"paymentLevelDate\",\r\n \"ciiCode\" :
				// \"ciiCode\",\r\n \"enhancedPaymentHistory84\" :
				// \"enhancedPaymentHistory84\",\r\n \"purchasedPortfolioFromName\" :
				// \"purchasedPortfolioFromName\",\r\n \"secondaryAgencyCode\" :
				// \"secondaryAgencyCode\",\r\n \"complianceCondition\" :
				// \"complianceCondition\",\r\n \"originalCreditorClassificationCode\" :
				// \"originalCreditorClassificationCode\",\r\n \"specialPaymentAmount\" :
				// \"specialPaymentAmount\",\r\n \"enhancedAccountCondition\" :
				// \"enhancedAccountCondition\",\r\n \"highBalanceAmount\" :
				// \"highBalanceAmount\",\r\n \"secondDelinquencyDate\" :
				// \"secondDelinquencyDate\",\r\n \"enhancedPaymentStatus\" :
				// \"enhancedPaymentStatus\",\r\n \"enhancedSpecialComment\" :
				// \"enhancedSpecialComment\",\r\n \"firstDelinquencyDate\" :
				// \"firstDelinquencyDate\",\r\n \"enhancedAccountType\" :
				// \"enhancedAccountType\",\r\n \"originalLoanAmount\" :
				// \"originalLoanAmount\",\r\n \"creditLimitAmount\" :
				// \"creditLimitAmount\",\r\n \"actualPaymentAmount\" :
				// \"actualPaymentAmount\",\r\n \"enhancedTerms\" : \"enhancedTerms\",\r\n
				// \"specialPaymentCode\" : \"specialPaymentCode\",\r\n \"specialPaymentDate\" :
				// \"specialPaymentDate\",\r\n \"secondaryAgencyId\" : \"secondaryAgencyId\"\r\n
				// },\r\n \"monthlyPaymentAmount\" : \"monthlyPaymentAmount\",\r\n
				// \"revolvingOrInstallment\" : \"revolvingOrInstallment\",\r\n
				// \"monthlyPaymentType\" : \"monthlyPaymentType\",\r\n \"ecoa\" : \"ecoa\",\r\n
				// \"delinquencies90to180Days\" : \"delinquencies90to180Days\",\r\n
				// \"accountType\" : \"accountType\",\r\n \"delinquencies60Days\" :
				// \"delinquencies60Days\",\r\n \"monthsHistory\" : \"monthsHistory\",\r\n
				// \"datePaymentDue\" : \"datePaymentDue\",\r\n \"delinquencies30Days\" :
				// \"delinquencies30Days\",\r\n \"soldToName\" : \"soldToName\",\r\n
				// \"subscriberCode\" : \"subscriberCode\",\r\n \"amount2Qualifier\" :
				// \"amount2Qualifier\",\r\n \"accountNumber\" : \"1234\",\r\n \"balanceAmount\"
				// : \"balanceAmount\",\r\n \"openOrClosed\" : \"openOrClosed\",\r\n
				// \"balanceDate\" : \"balanceDate\",\r\n \"subscriberName\" :
				// \"subscriberName\",\r\n \"amountBalloonPayment\" :
				// \"amountBalloonPayment\",\r\n \"bankruptcyChapterNumber\" :
				// \"bankruptcyChapterNumber\",\r\n \"derogCounter\" : \"derogCounter\",\r\n
				// \"trendedTrades\" : [ {\r\n \"originalLoamAmountOrLimit\" :
				// \"originalLoamAmountOrLimit\",\r\n \"scheduledPaymentAmount\" :
				// \"scheduledPaymentAmount\",\r\n \"actualPaymentAmount\" :
				// \"actualPaymentAmount\",\r\n \"monthNumber\" : \"monthNumber\",\r\n
				// \"lastPaymentDate\" : \"lastPaymentDate\",\r\n \"balanceAmount\" :
				// \"balanceAmount\"\r\n }, {\r\n \"originalLoamAmountOrLimit\" :
				// \"originalLoamAmountOrLimit\",\r\n \"scheduledPaymentAmount\" :
				// \"scheduledPaymentAmount\",\r\n \"actualPaymentAmount\" :
				// \"actualPaymentAmount\",\r\n \"monthNumber\" : \"monthNumber\",\r\n
				// \"lastPaymentDate\" : \"lastPaymentDate\",\r\n \"balanceAmount\" :
				// \"balanceAmount\"\r\n } ],\r\n \"amountPastDue\" : \"amountPastDue\",\r\n
				// \"openDate\" : \"openDate\",\r\n \"kob\" : \"YC\",\r\n \"status\" :
				// \"status\"\r\n } ],\r\n \"inquiry\" : [ {\r\n \"date\" : \"12051998\",\r\n
				// \"amount\" : \"amount\",\r\n \"terms\" : \"REV\",\r\n \"subscriberName\" :
				// \"BANK\",\r\n \"subscriberCode\" : \"0\",\r\n \"type\" : \"31\",\r\n \"kob\"
				// : \"DC\"\r\n }, {\r\n \"date\" : \"12051998\",\r\n \"amount\" :
				// \"amount\",\r\n \"terms\" : \"REV\",\r\n \"subscriberName\" : \"BANK\",\r\n
				// \"subscriberCode\" : \"0\",\r\n \"type\" : \"31\",\r\n \"kob\" : \"DC\"\r\n }
				// ],\r\n \"statement\" : [ {\r\n \"statementText\" : \"statementText\",\r\n
				// \"dateReported\" : \"dateReported\",\r\n \"type\" : \"type\"\r\n }, {\r\n
				// \"statementText\" : \"statementText\",\r\n \"dateReported\" :
				// \"dateReported\",\r\n \"type\" : \"type\"\r\n } ],\r\n
				// \"consumerAssistanceReferralAddress\" : {\r\n \"officeName\" :
				// \"EXPERIAN\",\r\n \"poBox\" : \"PO BOX 0000\",\r\n \"streetName\" : \"10655 N
				// BIRCH STREET\",\r\n \"phone\" : \"5555555555\",\r\n \"cityStateZip\" :
				// \"BURBANK, CA 91502\"\r\n },\r\n \"informationalMessage\" : [ {\r\n
				// \"messageText\" : \"PRODUCT OPTION NOT ALLOWED\",\r\n
				// \"messageNumberDetailed\" : \"0084\",\r\n \"messageNumber\" : \"84\"\r\n },
				// {\r\n \"messageText\" : \"PRODUCT OPTION NOT ALLOWED\",\r\n
				// \"messageNumberDetailed\" : \"0084\",\r\n \"messageNumber\" : \"84\"\r\n }
				// ],\r\n \"clarityAttributes\" : {\r\n \"secondaryApplicantClarityAttributes\"
				// : [ {\r\n \"id\" : \"123456789\",\r\n \"value\" : \"value\"\r\n }, {\r\n
				// \"id\" : \"123456789\",\r\n \"value\" : \"value\"\r\n } ],\r\n
				// \"primaryApplicantClarityAttributes\" : [ {\r\n \"id\" : \"123456789\",\r\n
				// \"value\" : \"value\"\r\n }, {\r\n \"id\" : \"123456789\",\r\n \"value\" :
				// \"value\"\r\n } ]\r\n },\r\n \"directCheck\" : [ {\r\n \"subscriberPhone\" :
				// \"BYMAILONLY\",\r\n \"subscriberName\" : \"BANK\",\r\n \"subscriberCode\" :
				// \"0\",\r\n \"subscriberState\" : \"CA\",\r\n \"subscriberCity\" : \"CA\",\r\n
				// \"subscriberAddress\" : \"10655 N BIRCH ST\",\r\n \"subscriberZipCode\" :
				// \"91502\"\r\n }, {\r\n \"subscriberPhone\" : \"BYMAILONLY\",\r\n
				// \"subscriberName\" : \"BANK\",\r\n \"subscriberCode\" : \"0\",\r\n
				// \"subscriberState\" : \"CA\",\r\n \"subscriberCity\" : \"CA\",\r\n
				// \"subscriberAddress\" : \"10655 N BIRCH ST\",\r\n \"subscriberZipCode\" :
				// \"91502\"\r\n } ],\r\n \"summaries\" : [ {\r\n \"summaryType\" :
				// \"summaryType\",\r\n \"attributes\" : [ {\r\n \"id\" : \"id\",\r\n \"value\"
				// : \"value\"\r\n }, {\r\n \"id\" : \"id\",\r\n \"value\" : \"value\"\r\n }
				// ]\r\n }, {\r\n \"summaryType\" : \"summaryType\",\r\n \"attributes\" : [
				// {\r\n \"id\" : \"id\",\r\n \"value\" : \"value\"\r\n }, {\r\n \"id\" :
				// \"id\",\r\n \"value\" : \"value\"\r\n } ]\r\n } ]\r\n } ],\r\n \"arf\" :
				// {\r\n \"arfResponse\" : \"arfResponse\"\r\n },\r\n \"tty\" : {\r\n
				// \"ttyResponse\" : \"ttyResponse\"\r\n }\r\n}",
				// CreditProfileResponseForCP.class), HttpStatus.NOT_IMPLEMENTED);

			} catch (Exception e) {
				log.error("Couldn't serialize response for content type application/json", e);
				e.printStackTrace();
				return new ResponseEntity<CreditProfileResponseForCP>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<CreditProfileResponseForCP>(HttpStatus.NOT_IMPLEMENTED);
	}

}
