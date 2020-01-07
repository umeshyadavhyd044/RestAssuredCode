package restassured;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostService {

	
	@Test
	public void postserviceop() throws JSONException{
		RestAssured.authentication = RestAssured.basic("admin", "password");
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "umesh"); 
		requestParams.put("age", "12");
		requestParams.put("gender", "m");
		requestParams.put("location", "kolk");
		requestParams.put("state", "telengana");
		requestParams.put("income", "10000");
		requestParams.put("maritalStatus", "f");
		
		request.body(requestParams.toString());
		Response response = request.post("http://localhost:8585/person"); 
		int statusCode = response.getStatusCode(); 
		System.out.println("Status code : " + statusCode);       
		System.out.println("Response body: " + response.body().asString()); //Get Response Body
		}
	
	
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	