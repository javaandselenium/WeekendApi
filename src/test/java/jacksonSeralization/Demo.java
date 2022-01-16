package jacksonSeralization;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Demo {
@Test
public void tc1() {
	HashMap<String,Object>map=new HashMap<String, Object>();
	map.put("name","demo90876123");
	map.put("description","demorepo90");
	
	given()
	.contentType(ContentType.JSON)
	.body(map)
	.auth().oauth2("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")
	
	.when()
	.post("https://api.github.com/user/repos")
	
	.then().log().all();
	
}
}
