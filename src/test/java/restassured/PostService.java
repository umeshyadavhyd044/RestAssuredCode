package restassured;

import org.json.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostService {

	
	@Test
	public void postserviceop(){
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "umesh"); 
		requestParams.put("age", "23");
		requestParams.put("gender", "m");
		requestParams.put("location", "hyderabad");
		requestParams.put("state", "telengana");
		requestParams.put("income", "10000");
		requestParams.put("maritalStatus", "f");
		
		request.body(requestParams.toString());
		Response response = request.post("http://localhost:8585/person"); 
		int StatusCode = response.getStatusCode(); 
		System.out.println("Status code : " + StatusCode);       
		System.out.println("Response body: " + response.body().asString()); //Get Response Body
		}
	
	
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	