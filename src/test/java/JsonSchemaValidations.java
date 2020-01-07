import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JsonSchemaValidations {
	
    @Test
    public void apiServerTest() throws IOException, ParseException{
	
    File payload = new File("C:\\Users\\uyadav\\Desktop\\jFile\\schemaFile1.json");
    	
    Response res = RestAssured.given().when().log().all().contentType("application/json").body(payload).get("https://jsonplaceholder.typicode.com/posts/1");
    		
            System.out.println(res.getStatusCode());
            Assert.assertEquals(res.getStatusCode(), 200);
            
            res.asString();
            
            JSONParser parser = new JSONParser();
            
            Object object = parser.parse(new FileReader(
            "C:\\Users\\uyadav\\Desktop\\jFile\\schemaFile1.json"));
            System.out.println("object value is ::"+object.toString());
            System.out.println("Response Body is =>----  " + res.asString());
    		System.out.println("Preety----"+res.prettyPeek());
    			
    }
}