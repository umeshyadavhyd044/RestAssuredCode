package restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class QueryParamDemo {
	//@Test
	@Test(priority=1,description = "verifying the arrureTest")
	@Severity(SeverityLevel.NORMAL)
	@Description("test case desscription")
	@Story("12345")
	public void testQueryGenderParam(){
		//providing authentication
		 RestAssured.authentication = RestAssured.basic("admin", "password");
		 Response res = (Response) RestAssured
				.given().
						queryParam("type", "gender").
						queryParam("value", "m").
				when()
						.contentType("application/json")
						.get("http://localhost:8585/getPerson");
		
		//System.out.println("response body is "+res);
		
		
		int statusCode = res.getStatusCode();
			System.out.println("statusCode is :"+statusCode);
			System.out.println("StatusLine is :"+res.getStatusLine());
			System.out.println("time is :"+res.getTime());
			System.out.println("Response Body is  " + res.asString());
			System.out.println("Preety----"+res.prettyPeek());
			Assert.assertNotNull(statusCode);
			
	}
	
	@Test
	public  void testSalaryParam(){
		
	
		//providing authentication
		 RestAssured.authentication = RestAssured.basic("admin", "password");
		 Response res = (Response) RestAssured
				.given().
						queryParam("type", "income").
						queryParam("value", 550).
				when()
						.contentType("application/json")
						.get("http://localhost:8585/getPerson");
		 int statusCode = res.getStatusCode();
		 	System.out.println("statusCode is :"+statusCode);
		 	System.out.println("Response Body is>>>>>> =>----  " + res.asString());
		 	System.out.println("Preety----"+res.prettyPeek());
}
	
	@Test
	public  void testStateParam(){
		
	
		//providing authentication
		 RestAssured.authentication = RestAssured.basic("admin", "password");
		 Response res = (Response) RestAssured
				.given().
						queryParam("type", "state").
						queryParam("value", "Tel").
				when()
						.contentType("application/json")
						.get("http://localhost:8585/getPerson");
		 				
		 int statusCode = res.getStatusCode();
		 	System.out.println("statusCode is :"+statusCode);
		 	System.out.println("Response Body is>>>>>> =>----  " + res.asString());
		 	System.out.println("Preety----"+res.prettyPeek());
	
	}	 
	
	@Test
	public  void testLocationParam(){
		
	
		//providing authentication
		 RestAssured.authentication = RestAssured.basic("admin", "password");
		 Response res = (Response) RestAssured
				.given().
						queryParam("type", "location").
						queryParam("value", "hyderabad").
				 when()
						.contentType("application/json")
						.get("http://localhost:8585/getPerson");
		 int statusCode = res.getStatusCode();
		 	System.out.println("statusCode is :"+statusCode);
		 	System.out.println("Response Body is>>>>>> =>----  " + res.asString());
		 	System.out.println("Preety----"+res.prettyPeek());
	}	 

}