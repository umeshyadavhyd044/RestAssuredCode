import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PUTOpration {
	
	/*public static Map map = new HashMap();
	
	@BeforeTest
	public void putData(){
		
		map.put("userid", "2");
		map.put("id", "19");
		map.put("title", "this is project debug.com");
		map.put("body", "i am testing REST api with REST-Assured and sending a PUT request.");
		
		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
		RestAssured.basePath = "/posts/";
	}*/

	@Test
	public void testData(){
		Response response = (Response) RestAssured.given();
		 Map<String,String> map = new HashMap<String,String>();
		map.put("userid", "2");
		map.put("id", "19");
		map.put("title", "this is project debug.com");
		map.put("body", "i am testing REST api with REST-Assured and sending a PUT request.");
		
		/*RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
		RestAssured.basePath = "/posts/";
		Response response = (Response) RestAssured.given()
				.contentType("application/json")
				.body(map)
				.when()
				.put("/100")
				.then()
				.statusCode(200);
				//.body("title", equalTo("this is projectdebug.com"));	
*/	
		response.body();
		Response res = ((RestAssured) response).put("http://localhost:8585/person"); 
		int statusCode = response.getStatusCode(); 
		System.out.println("Status code : " + statusCode);       
		System.out.println("Response body: " + response.body().asString()); //Get Response Body
		}
	
	
}
