package com.test.petstore_api_testing_framework.testcases;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.test.petstore_api_testing_framework.helper.PetDataCreator;
import com.test.petstore_api_testing_framework.helper.Status;
import com.test.petstore_api_testing_framework.listeners.RestAssuredListener;
import com.test.petstore_api_testing_framework.pojo.PetPojo;

import com.test.petstore_api_testing_framework.setup.BaseTest;
import com.test.petstore_api_testing_framework.utilities.Properties;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

@Epic("Epic-01")
@Feature("Create Update Get Pets")
public class PetAPITestCases extends BaseTest {
	public static PetPojo pet = new PetPojo();
	public static PetDataCreator petDataCreator = new PetDataCreator();
	public static int createdPetID;
	public static String pet_status;

	@Description("Creating new pet")
	@Test(priority = 0)
	public void createpet() {
		logger.info("test execution started...");
		Response response = given().filter(new AllureRestAssured()).filter(new RestAssuredListener())
				.contentType(ContentType.JSON).body(petDataCreator.petCreationData()) // passing obj in request body
				.post(Properties.createMultiplePetEndPoint).then().assertThat().statusCode(200).extract().response();
		response.prettyPrint();
		logger.info("test execution ended...");

	}

	@Description("Updating new pet as per status")
	@Test(priority = 1)
	public void updatePet() {
		logger.info("test execution started...");
		pet.setName("New name for my pet");
		pet.setStatus(Status.pending);
		Response response = given().filter(new AllureRestAssured()).filter(new RestAssuredListener())
				.contentType(ContentType.JSON).body(pet) // passing obj in request body
				.put(Properties.updatePetStatusEndPoint).then().assertThat().statusCode(200).extract().response();
		response.prettyPrint();
		PetPojo petResponse = response.as(PetPojo.class);
		Assert.assertEquals(petResponse.getName(), pet.getName());
		Assert.assertEquals(petResponse.getStatus(), pet.getStatus());
		logger.info("test execution ended...");
	}

	@Description("Fetching all pets by given status")
	@Test(priority = 2)
	public void getPet() {
		logger.info("test execution started...");
		Response response = given().filter(new AllureRestAssured()).filter(new RestAssuredListener())
				.contentType(ContentType.JSON).queryParam("status", Status.available.toString())
				.get(Properties.getPetStatusEndPoint).then().assertThat().statusCode(200).extract().response();
		response.prettyPrint();
		logger.info("test execution ended...");

	}
}
