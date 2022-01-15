package validation;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Test1 {
	@Test
	public void tc1() {
		when()
		.get("https://api.github.com/repos/javaandselenium/wasa2")
		
		.then()
		.log().all()
		
		.assertThat().header("Content-Type","application/json; charset=utf-8")
		.assertThat().header("X-Frame-Options","deny");
		

	
	
	}
}