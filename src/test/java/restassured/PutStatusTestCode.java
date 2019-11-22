package restassured;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutStatusTestCode {
	
	


		  @BeforeClass
		  public void setBaseUri () {

		    RestAssured.baseURI = "https://localhost:3000";
		  }


		@Test
		  public void updateUsingPut () {
		    
		    Posts post = new Posts();
		    post.setName("Umesh");
		    post.setLocation("hyd");
		    post.setSalary("4444");
		    
		 //   given().body (post)
		  //  .when ()
		   // .contentType (ContentType.JSON)
		   // .put ("/posts/3");

		  }

}
