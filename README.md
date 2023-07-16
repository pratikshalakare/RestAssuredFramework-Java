# RestAssuredFramework-Java (Swagger Petstore)

This test automation project is created for a REST API, Swagger Petstore.

## Solution Information
The solution uses Maven for build compilation & dependency management. Allure reports are used to generate clear, user-readable, and presentable reports. The project also utilizes the Java Faker library to generate random fake data wherever required.

## Test Cases for Automation

### Pet Endpoint
- Creating a new pet
- Updating pet details
- Getting pet details

### User Endpoint
- Creating a list of users
- Updating user details
- Getting user details

## Instructions to Run Swagger Petstore

1. Clone this project (https://github.com/pratikshalakare/RestAssuredFramework-Java.git)
2. Navigate to the 'PetStore-RestAssured' folder from the terminal window.
3. Run the following command: `mvn clean`
4. Run `mvn test -Dsuitfilename="./testng.xml"`
5. Run `allure serve`

## Tools/Tech Stack
- REST-assured
- Maven
- TestNG
- Allure Reports
- Java
- Eclipse
- Git
- Project Lombok plugin 
