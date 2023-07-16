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

## # REST Assured - Swagger Petstore - OpenAPI 3.0

This test automation project is created for a REST API, Swagger Petstore - OpenAPI 3.0. The tests are implemented using Rest Assured & can be used for learning purpose also as ready framework to quickly get started with automation project.
	
Solution information
----------------------
The project is supposed to automate the proposed test cases (listed in below section) using REST assured with a modular framework which allows us to scale & maintain with ease.
The solution uses Maven for build compilation & dependency management. Allure reports to generate clear, user readable & presentable reports. Uses java faker library to generate random fake data wherever required.
	
Proposed Test cases for Automation:
----------------------
**Pet Endpoint**
- Creating a new pet
- Fetch all pets by statuses
- Finding pet by given id
- updating pet by given id
- updating pet by form data

**Store Endpoint**
- Fetch the inventory status
- Place a new order
- Fetch the given order by ID
- Delete an newly created order

**User Endpoint**
- Fetch user details by username
- Create a new user
- Log the user into the system
- Log out the current active session	
	
Instructions to run Swagger Petstore - OpenAPI 3.0 locally:
----------------------
- Clone this project (https://github.com/swagger-api/swagger-petstore)
- Follow instructions from the project's readme file

Setup Instructions (Macbook)
----------------------

1. Download and install intelliJ (https://www.jetbrains.com/idea/download/#section=mac)
2. Clone this repo (Make sure you are on Master branch):
```
https://github.com/ShoaibShaikh-SSH/Shoaib-Shaikh.git
```
3. Import cloned repo in step 3 as Java project in Eclipse:
	- File->Import->Project from existing sources 
	- Choose `FirstIteration->PetStore-RestAssured` folder
4. Install Maven. Run following command in terminal -> ```brew install maven``` (Pre requisite: brew should be present in the system)
5. Install Allure. Run following command in terminal -> ```brew install allure```
	
Run Automated Tests from IntelliJ / Terminal
----------------------
1. Navigate to 'PetStore-RestAssured' folder from terminal window
2. Run following command -> ``` mvn clean test```

Reporting - Allure reports
----------------------
1. From 'PetStore-RestAssured' folder, navigate to 'target' folder from terminal
2. Run following command -> ```allure serve allure-results```
3. An Allure report will open in browser with the last run report.

Tools/Tech stack
----------------------
- REST-assured
- Maven
- Junit5
- Allure Reports
- Java
- IntelliJ
- Git

Plan for enhancement
----------------------
- Making allure report emailable
