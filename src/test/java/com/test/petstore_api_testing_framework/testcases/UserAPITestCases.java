package com.test.petstore_api_testing_framework.testcases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

import com.test.petstore_api_testing_framework.helper.UserDataCreator;
import com.test.petstore_api_testing_framework.listeners.RestAssuredListener;
import com.test.petstore_api_testing_framework.pojo.UserPojo;
import com.test.petstore_api_testing_framework.setup.BaseTest;
import com.test.petstore_api_testing_framework.utilities.Properties;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

import io.qameta.allure.restassured.AllureRestAssured;

import io.restassured.http.ContentType;

@Epic("Epic-02")
@Feature("Create Update Get Users")
public class UserAPITestCases extends BaseTest {

	public static List<UserPojo> listOfUser;
	String username = "";

	@Test(description = "Creating list of users", priority = 0)
	public void createListOfUser() {
		logger.info("test execution started...");
		UserDataCreator us = new UserDataCreator();
		listOfUser = us.createUser(5);
		Response response = // RestAssured
				given().filter(new AllureRestAssured()).filter(new RestAssuredListener()).contentType(ContentType.JSON)
						.log().all().body(listOfUser) // passing obj in request body
						.post(Properties.createMultipleUserEndPoint).then().assertThat().statusCode(200).extract()
						.response();
		response.prettyPrint();
		Assert.assertEquals(200, response.getStatusCode());
		logger.info("test execution ended...");

	}

	@Description("Upadating users data")
	@Test(dependsOnMethods = "createListOfUser", priority = 1)
	public void updateUserDetail() {
		logger.info("test execution started...");
		UserDataCreator us = new UserDataCreator();
		UserPojo user = us.DataForUSerCreation();
		username = user.getUsername();
		Response response = given().filter(new AllureRestAssured()).filter(new RestAssuredListener())
				.header("Content-Type", "application/json").contentType(ContentType.JSON).log().all().body(user) 																									
				.put(String.format("/user/%s", listOfUser.get(0).getUsername())); // updating request
		response.prettyPrint();
		response.then().statusCode(200);
		Assert.assertEquals(200, response.getStatusCode());
		logger.info("test execution ended...");

	}

	@Description("Fetching Users data")
	@Test(dependsOnMethods = "updateUserDetail", priority = 2)
	public void getUserDetail() {
		System.out.println(username);
		logger.info("test execution started...");
		Response response = given().filter(new AllureRestAssured()).filter(new RestAssuredListener()) 
				.header("Content-Type", "application/json").contentType(ContentType.JSON).log().all()
				.get(String.format("/user/%s", username)); 
		response.prettyPrint();
		Assert.assertEquals(200, response.getStatusCode());
		logger.info("test execution ended...");
	}
}
