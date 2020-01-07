package restassured;

import static org.testng.Assert.assertNotNull;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.JSONException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostCall {
	Logger logger = Logger.getLogger(PostCall.class.getName());
	
	@Test
	public void createRequest() throws IOException, ParseException, JSONException{
		
		// Create a supplier<String> method 
        Supplier<String> StrSupplier 
            = () -> new String("Logger messages"); 
  
        // log messages using 
        // log(Level level, Supplier<String> msgSupplier) 
        logger.log(Level.SEVERE, 
                   StrSupplier); 
        
      //Used to provide basic authentication
      RestAssured.authentication =    RestAssured.basic("admin", "password");
        
       JSONParser parser = new JSONParser();
        
        Object object = parser.parse(new FileReader(
        "C:\\Users\\uyadav\\java_learning\\restassured\\jsonFileInput\\jsonRequest.json"));
        
       System.out.println("object value is ::"+object.toString());
       			
       File payload = new File("C:.\\jsonFileInput\\jsonRequest.json");
       
       Response res = RestAssured.given().when().log().all().contentType("application/json").body(payload).post("http://localhost:8585/person");
        
        int statusCode = res.getStatusCode();
		System.out.println("statusCode is :"+statusCode);
		System.out.println("StatusLine is :"+res.getStatusLine());
		System.out.println("time is :"+res.getTime());
		System.out.println("Response Body is =>----  " + res.asString());
		System.out.println("Preety----"+res.prettyPeek());
		Assert.assertNotNull(statusCode);
		
	}
	}
	

