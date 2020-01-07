import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.http.HttpStatus;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class jsonValidation {
	
	@Test
	public void jsonSchemaValidate() throws FileNotFoundException, IOException, ParseException{
		
		JSONParser parser = new JSONParser();
        
        Object object = parser.parse(new FileReader(
        "C:\\Users\\uyadav\\Desktop\\jFile\\schemaFile1.json"));
        System.out.println("object value is ::"+object.toString());
			
        File payload = new File("C:\\Users\\uyadav\\Desktop\\jFile\\schemaFile1.json");
        System.out.println("value is--"+payload );
        
		RestAssured restassured = (RestAssured) RestAssured.given()
				.accept(ContentType.JSON)
				.when()
				.get("https://jsonplaceholder.typicode.com/posts/1")
				.then()
				.assertThat()
				
				//.log().all()  // Log all request specification details including parameters, headers and body
				//.log().params()  // Log only the parameters of the request
				//.log().body() // Log only the request body
				.log().headers()  // Log only the request headers
				//.log().cookies()  // Log only the request cookies
				//.log().method()  // Log only the request method
				//.log().path()  // Log only the request path
				
				
				//.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("C:\\Users\\uyadav\\Desktop\\jFile.json"))
				//.statusCode((HttpStatus.SC_OK));
				.statusCode(200);
				System.out.println("Response Body is =>----  " + restassured.toString());
			
		
	}

}
