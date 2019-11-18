package restassured;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class GetRestAssuredApp {
	final static String GET_ROOT_URI = "http://dummy.restapiexample.com/api/v1/employees";
               
		@Test
		public void getTests() {
			RequestSpecification requestSpecification = RestAssured.given();
			Response response = requestSpecification.get(GET_ROOT_URI);
			System.out.println(response.asString());
			List<String> res=response.body().jsonPath().getList("employee_name");
			
			for(int i=0;i<res.size();i++) {
				assertEquals("Anjan B Prakash", res.get(0));
				assertEquals("TESTk", res.get(1));
				
				
			}
			assertEquals("TESTk", res.get(97549));
			
			//assertEquals("User6", response.body().jsonPath().get("employee_name"));
			//assertEquals("35274", response.body().jsonPath().get("employee_salary"));
		}
	}