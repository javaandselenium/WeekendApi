package jacksonSeralization;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateRepro {
@Test
public void tc1() {
	PostOperation p=new PostOperation("demoqwerty5","demo repro");
	
	given()
	.contentType(ContentType.JSON)
	.body(p)
	.auth().oauth2("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")
	
	.when()
	.post("https://api.github.com/user/repos")
	
	.then().log().all();
	
}
}
