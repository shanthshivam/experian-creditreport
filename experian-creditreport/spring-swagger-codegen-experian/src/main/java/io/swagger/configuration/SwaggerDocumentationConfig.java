package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T21:15:39.351011500Z[Europe/London]")
@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Credit Profile")
            .description("<p>Experian's Credit Profile Report gives you accurate, current and complete information you need to:</p> <ul> <li>Perform&nbsp;<strong>Credit Profile</strong>&nbsp;checks,<strong>&nbsp;Automotive</strong>&nbsp;Credit checks,&nbsp;<strong>Health Care</strong>&nbsp;Credit checks,&nbsp;<strong>Employment Insight</strong>&nbsp;credit checks,&nbsp;<strong>Telecom-Electric-Cable (TEC)</strong>&nbsp;Credit checks, and&nbsp;<strong>Connect Check&nbsp;</strong>Credit Checks</li> <li><strong>Extended Score Only</strong>,&nbsp;<strong>Extended View Attributes Only</strong>, and&nbsp;<strong>Extended View Attributes+ Score</strong>&nbsp;products offer clients credit reports for customers who have very little to thin credit history.&nbsp;</li> </ul> <p><strong>Credit Profile&nbsp;</strong>Credit Check<strong>:&nbsp;</strong></p> <p>The Credit Profile report is a composite history of a consumer's credit and identification information. It is the most comprehensive credit decision making tool used in the industry today, providing timely and in-depth credit information that allows faster, more accurate, and cost-effective decisions.&nbsp;&nbsp;<a name=\"_Hlk4168254\"></a></p> <p><strong>Automotive Credit Profile&nbsp;</strong>Credit Check<strong>:&nbsp;</strong></p> <p>The Automotive Profile Summary is geared toward helping automotive lenders’ and dealers’ credit decisions. This feature is available on Experian’s Credit Profile and provides a fast at-a-glance analysis of a consumer’s automotive finance history.</p> <p><strong>Employment Insight&nbsp;</strong>Credit Check<strong>:&nbsp;</strong></p> <p>Employment Insight, a slightly modified version of the Experian Credit Profile report, contains consumer identification, employment history, and credit information used to substantiate information during the hiring or promotion process. Experian developed Employment Insight to help employers make informed hiring decisions.</p> <p><strong>Health Care Credit Profile&nbsp;</strong>Credit Check<strong>:&nbsp;</strong></p> <p>The Healthcare Profile is a credit profile report designed specifically for the healthcare industry. It consists of a standard credit report in which includes Healthcare Summary segment.</p> <p><strong>Telecom-Electric-Cable (TEC)&nbsp;</strong>Credit Check:</p> <p>TEC Connect is designed to evaluate consumer risk within the telecommunications, energy and cable (TEC) space. An empirically-driven, statistically sound risk prediction model, TEC Connect leverages a consumer’s actual service payment history, predicting the likelihood of serious delinquent/derogatory behavior over the next 12 months. TEC Connect has been optimized to outperform all other methods in terms of both identifying – and acquiring – the most profitable customers available.</p> <p><strong>Connect Check</strong>&nbsp;Credit Check:</p> <p><font size=\"2\">Connect Check is a custom verification process designed specifically to assist the utility, telecommunication and cable industries detect fraud and minimize risk exposure at the time of a service request.&nbsp;&nbsp;</font>The utility, telecommunications and cable industries can make immediate service decisions;manage existing bad debt;minimize future risk exposure and maintain &amp; continuously improve customer service levels.</p> <p><strong>Extended View&nbsp;</strong>Credit Check<strong>:&nbsp;</strong></p> <p>Extended View can be requested as a score only, a score with attributes or attributes only. When attributes are part of the desired configuration, the client will receive both a Premier Attributes and public record set of attributes. Depending on whether the client requests the attributes by themselves or in addition to the score, a different list of Premier Attributes will be delivered.</p> <p>&nbsp;</p> <p><strong>Add-ons</strong>&nbsp;to&nbsp;<strong>Credit Report</strong>:</p> <ul> <li>Clear View Attributes - Offers visibility into this expanded set of data to help lenders create a more complete assessment of a consumer’s creditworthiness, improving decision making and inform strategic planning.</li> <li>Direct Check - Information service that provides subscriber name, address and telephone number</li> <li>Demographics - Provides 3 best telephone numbers and types and geo code</li> <li>Scores (allows for multiple scores) - Utilizes predictive technology to analyze a consumer's credit data to forecast a consumer's future risk or purchase behavior</li> <li>Score Percentile - Percentile that indicates who a consumer ranks amongst all other U.S. consumers</li> <li>Profile Summary - Snapshot of consumer's debt, monthly obligations and payment history</li> <li>Fraud Shield - Predictive indicators to identify specific high-risk characteristics</li> <li>Military Lending Act (MLA) - Indicator identifying a consumer's military status</li> <li>Office of Foreign Assets Control (OFAC) - Indicator identifying foreign nationals that our clients are prohibited from doing business with</li> <li>Clear Early Risk Score (CERS) - Score that predicts early delinquency by blending traditional credit bureau data and FCRA-regulated Alternative Financial Services data</li> <li>Synthetic Fraud Risk Level Indicator - Helps a lender identify potential synthetic identities at the time of underwriting to isolate applicants for additional ID verification.</li> <li>Tax Refund Loan Inquiry Indicator - Helps lenders identify potentially fraudulent activity prior to granting a tax refund loan.</li> </ul>")
            .license("")
            .licenseUrl("http://unlicense.org")
            .termsOfServiceUrl("")
            .version("OpenAPI3.2.0.41")
            .contact(new Contact("","", ""))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("com.b4nkd.creditscore.experian.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

}
