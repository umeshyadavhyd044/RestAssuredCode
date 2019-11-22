package restassured;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteService {
	
	@Test
	public void deleteService(){
		//final String DELETE_ROOT_URI = "http://dummy.restapiexample.com/api/v1/employees";

		 int id = 98340;
		 
		/*// RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employees";
		 RequestSpecification request = RestAssured.given(); 
		 
		 // Add a header stating the Request body is a JSON
		 request.header("Content-Type", "application/json"); 
		 
		       // Delete the request and check the response
		 Response response = request.delete("/delete/"+ id);
		 Response res = RestAssured.delete("http://dummy.restapiexample.com/api/v1/employees");
		 
		 int statusCode = response.getStatusCode();
		 System.out.println(response.asString());
		 Assert.assertEquals(statusCode, 200);
		 
		 String jsonString =response.asString();
		 Assert.assertEquals(jsonString.contains("successfully! deleted Records"), true);
		 }*/
		
		/* RequestSpecification requestSpecification = RestAssured.given();
			Response response = requestSpecification.delete(DELETE_ROOT_URI + "/" + 98108);
			System.out.println("DELETE Response\n" + response.asString());
			String returnResponse = response.body().jsonPath().getString("success");
			Assert.assertEquals(200, response.getStatusCode());
			//Assert.assertEquals(response.body().jsonPath().get("success.text"), "successfully! deleted Records");
			Assert.assertNotNull(response.body().toString());
			*/
			//---
		 RequestSpecification request = RestAssured.given();
			
			Response response = request.delete("https://jsonplaceholder.typicode.com/posts/2"); 
			int StatusCode = response.getStatusCode(); 
			System.out.println("Status code : " + StatusCode);       
			System.out.println("Response body: " + response.body().asString()); //Get Response Body
			
			
	}
		 
	}
	


