package parameterization;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class Test1 {
	@Test
	public void test2() {
		given()
		.queryParam("q","demo")
		.queryParam("order","asc")
		
		.when()
		.get("https://api.github.com/search/users")
		
		.then()
		.log().all();
		
		
	}

}
