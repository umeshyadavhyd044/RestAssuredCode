package restassured;

import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FindGetResponse {
	
	static Logger logger = Logger.getLogger(FindGetResponse.class.getName());
	
		@Test
		public void getResponse(){
			
			// Create a supplier<String> method 
	        Supplier<String> StrSupplier 
	            = () -> new String("Logger messages"); 
	  
	        // log messages using 
	     
	        logger.log(Level.SEVERE, 
	                   StrSupplier); 
			
			
			Response response = RestAssured.given().header("Authorization", "SSWS 00uFZ6cW9fDk2sS6b2SVp0zi8FCsbgcAXh-oCYnWD4")
												.header("User-Agent", "PostmanRuntime/7.19.0")
												.header("Accept", "*/*")
												.header("Cache-Control", "no-cache")
												.header("Postman-Token", "8ad14a65-eb4e-4193-ac9b-b43da2b4b758")
												.header("Host", "abs-qai.oktapreview.com")
												.header("Accept-Encoding", "gzip, deflate")
												.header("Cookie", "JSESSIONID=B3801F136059E3D9A3D8D0707D413DC4")
												.header("Connection", "keep-alive")
												.cookies("JSESSIONID", "3819012D7468300E856B03043C94B436")
												//To log all request parameter/Request URI/Query Param itc
												.log()
												.all()
												// .body()//Log only the request body
												//.headers() //Log only the request headers
												//.method() //Log only the request method
												
												
												.when().get("https://abs-qai.oktapreview.com/api/v1/users/nisum@gmail.com");
												
			
			
			int responseCode = response.getStatusCode();
			
			System.out.println("Validating Header Body : "+response.getHeaders());
			System.out.println("Status code is : "   +responseCode);
			System.out.println("Response Body is =>----  " + response.asString());
			
			System.out.println("Content type is "+ response.contentType());
			
				
			
		}

}
