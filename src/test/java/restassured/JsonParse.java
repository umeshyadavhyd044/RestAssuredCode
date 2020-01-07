package restassured;

import java.util.List;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class JsonParse {
	
	
	@Test
    public void testJsonParsing() {
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        Response response = null;

        try {
            response = RestAssured.given()
                .when()
                .get("/employees");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Response :" + response.asString());
        System.out.println("Status Code :" + response.getStatusCode());


        //Creation of JsonPath object
        JsonPath jsonPathValidator = response.jsonPath();

        //1. To print the list of id from the response
        System.out.println("ID : \n" + jsonPathValidator.get("id"));


        //2. Count Number of Records(Employees) in the Response
       // List < String > jsonResponseRoot = jsonPathValidator.getList("$");
       // System.out.println("Number of Employees : " + jsonResponseRoot.size());


        //3. Get the list of all the employee names
        List < String > allEmployeeNames = jsonPathValidator.getList("employee_name");
        System.out.println("\n Here is the names of all the employees :\n");
        for (String i: allEmployeeNames) {
            System.out.println(i);
        }

        //4. To Get the list of ages of all the employees
        String employeeAge = jsonPathValidator.getString("employee_age");
        System.out.println(employeeAge);


        //5. To get the name of the sixth employee in the list using 2 ways:
        //1. 
        String sixthEmployeeName = jsonPathValidator.getString("employee_name[5]");
        System.out.println(sixthEmployeeName);
        //2.
        System.out.println(allEmployeeNames.get(5));


        //6. To validate if the 10th employee salary is greater than 100
        if (Integer.parseInt(jsonPathValidator.getString("employee_salary[9]")) > 100) {
            System.out.println("True - 10th employee salary is " + jsonPathValidator.getString("employee_salary[9]") + " which is greater than 100");
        } else {
            System.out.println("False - 10th employee salary is " + jsonPathValidator.getString("employee_salary[9]") + " which is lesser than 100");
        }
	}

}
