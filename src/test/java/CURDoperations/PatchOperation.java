package CURDoperations;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PatchOperation {
	@Test
	public void patchOperation() {
		JSONObject jobj=new JSONObject();
		jobj.put("title","demoApi");
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		
		.when()
		.patch("http://localhost:3000/posts/1200")
		
		.then()
		.log().all();
		
		
	}

}
