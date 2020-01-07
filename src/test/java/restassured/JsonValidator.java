package restassured;

import org.hamcrest.Matcher;
import org.junit.Test;

import io.restassured.RestAssured;

public class JsonValidator {
	
	@Test
    public void testJsonSchema() {
 
        RestAssured.given()
            .when()
            .get("https://jsonplaceholder.typicode.com/comments?postId=1")
            .then()
            .assertThat()
            .body(matchesJsonSchemaInClasspath("JsonSchemaFile.json"));
 
    }

	private Matcher<?> matchesJsonSchemaInClasspath(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
