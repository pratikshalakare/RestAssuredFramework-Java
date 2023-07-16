package com.test.petstore_api_testing_framework.setup;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.test.petstore_api_testing_framework.utilities.Properties;

import io.restassured.RestAssured;

//import com.test.petstore_api_testing_framework.setup.BaseTest;

public class BaseTest {
public static final Logger logger = LogManager.getLogger(BaseTest.class);
	
	@BeforeMethod
	public void beforeMethod() {
		//RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
		RestAssured.baseURI = Properties.baseUri;
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			Throwable t = result.getThrowable();
			StringWriter error = new StringWriter();
			t.printStackTrace(new PrintWriter(error));
			logger.info(error.toString());
		}
}
	
	
}
