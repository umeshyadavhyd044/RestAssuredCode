package com.test.restassured;

import java.util.HashMap;
import java.util.Map;
import org.hamcrest.Matcher;
import javax.annotation.Untainted;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.hamcrest.Matchers.*;
import org.json.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.matcher.RestAssuredMatchers;
import  org.hamcrest.Matchers;
import static io.restassured.RestAssured.given;

public class PostDataRequest {
	
	public static HashMap<String, String> map = new HashMap<String, String>();
	
	
	@BeforeClass
	public  static void postData(){
		map.put("FirstName", RestUtils.getFirstName());
		map.put("LastName", RestUtils.getLastName());
		map.put("UserName", RestUtils.getUserName());
		map.put("Password", RestUtils.getPassword());
		map.put("Email", RestUtils.getEmail());
		
		//RestAssured.baseURI = "http://restapi.demoqa.com/customer/register";

		//RestAssured.basePath = "/register";
	}
	@Test
	public void testData(){
		RestAssured.baseURI = "http://restapi.demoqa.com/customer/register";
		//BDD Aproach
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.post()
		.then()
			.statusCode(201);
			//.body("SuccessCode",equalTo("OPERATION_SUCCESS"))
		    //.body("Message",equalTo("Operation completed successfully"));
		Assert.assertEquals("OPERATION_SUCCESS", "OPERATION_SUCCESS");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
