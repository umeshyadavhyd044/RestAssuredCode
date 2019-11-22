package restassured;

import org.junit.Test;

import io.restassured.RestAssured;

public class BasicAuthentication {
	@Test
	public void baseAuth(){
		
		int code = RestAssured.given()
				.auth()
				.preemptive()
				.basic("ToolsQA","TestPassword")
				.get("http://restapi.demoqa.com/authentication/CheckForAuthentication")
				.getStatusCode();
		System.out.println("Authentication code is :" +code);
	}
	
}
