package com.tata.lon.loan_service;

import io.cucumber.core.options.Constants;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.platform.suite.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@SelectClasspathResource("features")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "com.tata.lon.loan_service")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value = "pretty")
//@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value = "usage")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value = "html:target/cucumber-reports.html")
public class CucumberConfigurationTest {
}
