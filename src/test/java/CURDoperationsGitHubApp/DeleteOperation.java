package CURDoperationsGitHubApp;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class DeleteOperation {
@Test
public void deeteOperation() {
	
	given()
	.auth().oauth2("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")
	
	.when()
	.delete("https://api.github.com/repos/javaandselenium/WeekendApi")
	
	.then().log().all();
}
}
