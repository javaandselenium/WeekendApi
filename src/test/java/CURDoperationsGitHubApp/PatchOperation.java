package CURDoperationsGitHubApp;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PatchOperation {
	@Test
	public void postOpertaion() {
		JSONObject jobj=new JSONObject();
		jobj.put("private",false);
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.auth().oauth2("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")
		
		.when()
		.patch("https://api.github.com/repos/javaandselenium/weekendApi")
		
		.then().log().all();
		
		
	}

}
