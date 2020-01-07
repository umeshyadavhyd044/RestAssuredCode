package restassured;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class PathParamExample {
	
	@Test
	public void retriveSpecificEmployee(){
		
		//String id = "24947";
		String id = "30";
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employees/";
		//localhost:8585/person
		RestAssured.baseURI = "http://localhost:8585/getPerson?type=income&value=4444";
		Response response = null;
		try{
			response = RestAssured.given()
									.pathParam("id", id)
									.when()
									.get("/{id}");
									
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Tesponse" +response.asString());
		System.out.println("Status Code " +response.statusCode());
		System.out.println("Does response contains employee salary:  " +response.asString().contains("employee_salary"));
		Assert.assertEquals(200, response.getStatusCode());
		
		
	}

}
