package CURDoperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetOperation {
	@Test
	public void getOperation() {
	Response resp = RestAssured.get("http://localhost:3000/posts");
		System.out.println(resp.asString());
	}

}
