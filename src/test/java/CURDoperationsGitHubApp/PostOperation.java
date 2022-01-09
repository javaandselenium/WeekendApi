package CURDoperationsGitHubApp;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostOperation {
@Test
public void postoperation() {
	JSONObject jobj=new JSONObject();
	jobj.put("name","WeekendAPi");
	jobj.put("description","demo repo");
	
	given()
	.contentType(ContentType.JSON)
	.body(jobj)
	.auth().oauth2("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")
	
	.when()
	.post("https://api.github.com/user/repos")
	
	.then()
	.log().all();
	
	
}
}
