import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetresponseDemo {
	
	@Test
	public void findCityWheather(){
	Response response = RestAssured.given().header("contentType", "application/json")
			
			//To log all request parameter/Request URI/Query Param itc
			.log()
			//.all()
			// .body()//Log only the request body
			//.headers() //Log only the request headers
			.method() //Log only the request method
			
			
			.when().get("http://restapi.demoqa.com/utilities/weather/city/hyderabad");
		

	int responseCode = response.getStatusCode();
	
	
	System.out.println("Validating Header Body : "+response.getHeaders());
	System.out.println("Status code is : "   +responseCode);
	System.out.println("Response Body is =>----  " + response.asString());

	System.out.println("Content type is "+ response.contentType());

}

	
	}
