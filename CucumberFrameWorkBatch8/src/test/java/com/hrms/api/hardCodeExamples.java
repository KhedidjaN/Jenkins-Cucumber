package com.hrms.api;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.Argument;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

//give()
//when()
//then()


public class hardCodeExamples {
    String baseURI = RestAssured.baseURI = "http://3.237.189.167/syntaxapi/api";
    String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MTQ1MTc4MTksImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYxNDU2MTAxOSwidXNlcklkIjoiMjYzNSJ9.VlcrT6RtFJgV7wfnDgqhx-wn9h4W0PB8qv7gkH9JSwg";

    @Test
    public void sampleTest() {
        //preparing request to get one employee
        RequestSpecification preparingGetOneEmployeeRequest = given().header("Authorization", token)
                .header("Content-type", "Application/json")
                .queryParam("employee_id", "14896A");
        //sending the request to the endpoint
        Response getOneEmployeeResponse = preparingGetOneEmployeeRequest.when().get("/getOneEmployee.php");
        //print the response
        //System.out.println(getOneEmployeeResponse.asString());
        getOneEmployeeResponse.prettyPrint();
        //Assert that status code is 200
        getOneEmployeeResponse.then().assertThat().statusCode(200);

    }

    @Test
    public void aPostCreatEmployee(){

        //preparing create an employee Request
        RequestSpecification createEmployeeRequest=given().header("Authorization", token)
                .header("Content-type", "Application/json").body("{\"emp_firstname\": \"Yasmine\",\n" +
                "  \"emp_lastname\": \"Amadri\",\n" +
                "  \"emp_middle_name\": \"Anne\",\n" +
                "  \"emp_gender\": \"F\",\n" +
                "  \"emp_birthday\": \"2000-02-23\",\n" +
                "  \"emp_job_title\": \"IT Analyst\",\n" +
                "  \"emp_status\": \"Employee\"}");

        //Making a Post call to create Employee

        Response createEmployeeResponse=createEmployeeRequest.when().post("/createEmployee.php");
        //Printing the Employee ID
        createEmployeeResponse.prettyPrint();
        //Assert that status code is 201
        createEmployeeResponse.then().assertThat().statusCode(201);
        //JsonPath r=createEmployeeResponse.jsonPath();
        //r.prettyPrint();
        // Get Employee_ID
        String employeeID=createEmployeeResponse.jsonPath().getString("Employee[0].employee_id");
        //print EmployeeID
        System.out.println(employeeID);
        //Assert that message contains Entry Created
        createEmployeeResponse.then().assertThat().body("Message",equalTo("Entry Created"));
        // assert that employee id is 16920A
        createEmployeeResponse.then().assertThat().body("Employee[0].emp_firstname",equalTo("Yasmine"));


    }
   @Test
    public void getCreateEmployee(){
        RequestSpecification getCreateEmployee=given().header("Authorization", token)
                .header("Content-type", "Application/json").queryParam("employee_id","16920A");
         Response getEmployeeresponse=getCreateEmployee.get("/getOneEmployee.php");
        // getEmployeeresponse.prettyPrint();
       String empID=getEmployeeresponse.body().jsonPath().getString("employee[0].employee_id");
// we are checking if the empId is equal to the one mentioned in string
       boolean verifyEmployeeID=empID.equalsIgnoreCase("16920A");
       System.out.println( verifyEmployeeID);
       Assert.assertTrue(verifyEmployeeID);

       //getEmployeeresponse.then().assertThat().body("employee[0].employee_id",equalTo("16920A"));


   }

}