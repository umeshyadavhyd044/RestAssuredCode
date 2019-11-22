package restassured;


import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class RestAssuredGetWeather {
	
	@Test
	public void getWeatherResponse(){
		//This is weather url we can get from online 
		//http://openweathermap.org/
	//int codeStatus = RestAssured.given().auth().preemptive().basic("umesh", "umesh").when().get("").getStatusCode();
		Response res = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		
		int code = res.getStatusCode();
		
		System.out.println("Validating Response Body : "+res.getBody());
	
		//System.out.println("Validating Header Body : "+res.getHeaders());
		System.out.println("Status code is : "   +code);
		//System.out.println("Status code is : "   +codeStatus);
		System.out.println("Response Body is =>----  " + res.asString());

		Assert.assertEquals(code, 200);
		
		
	}
	
	@Test
	public void getWeatherBodyresponse(){
		
		//Response res = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		Response res = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		
		//http://dummy.restapiexample.com/api/v1/employees
		String data = res.asString();
		System.out.println("Data is" +data);
		System.out.println("response time is : "+res.getTime());
		//Here checking content type json/xml
		System.out.println("Content type is "+ res.contentType());
		System.out.println("Body type is "+ res.headers());
		
		
	}
	
	@Test
	public void invalidResponseCode(){
		
		Response res = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		
		int code = res.getStatusCode();
		String data = res.asString();
		//Here test case will fail it expecting 200 but giving here 404
		Assert.assertEquals(code, 404);
		
	}
	
}
