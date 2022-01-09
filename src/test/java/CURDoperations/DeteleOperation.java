package CURDoperations;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class DeteleOperation {
@Test
public void deleteOperation() {
	
	when()
	.delete("http://localhost:3000/posts/1200")
	
	.then()
	.log().all();
	
}
}
