package restassured;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RetriveSpecificDetails {
	
	
	@Test
	 public void retrieveSpecificEmployeeBasedOnId() {
	 
	
		RestAssured.baseURI = "https://reqres.in/api/users/4";
	 
	  Response response = null;
	 
	  try {
	   response = RestAssured.given()
	    .when()
	    .get();
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
	 
	  System.out.println("Response :" + response.asString());
	  System.out.println("Status Code :" + response.getStatusCode());
	 
	 
	 
	  assertEquals(200, response.getStatusCode());
	 }
	}
	 
