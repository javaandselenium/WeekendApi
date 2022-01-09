package CURDoperations;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Getoperations1 {
	@Test
	public void getoperation() {
		
		when()
		.get("http://localhost:3000/posts")
		
		.then()
		.log().all();
		
		
		
	}

}
