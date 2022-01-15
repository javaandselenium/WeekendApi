package parameterization;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class Test2 {
	@Test
	public void test2() {
		given()
		.param("q","demo")
		.param("order","asc")
		
		.when()
		.get("https://api.github.com/search/users")
		
		.then()
		.log().all();
		
		
	}}
