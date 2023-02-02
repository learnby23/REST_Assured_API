package mthods.rest.api;

import org.testng.annotations.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetMethod {
	
	@Test(priority=4, groups ="GET", invocationCount = 2)
	public void getRequest1() {
		
		given()
		.when()
			.get("https://reqres.in/api/users/2")
		.then()
		.statusCode(200);
	}
	@Test(priority=3, groups ="GET")
	public void getRequest2() {
		
		given()
		.when()
			.get("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.log().headers();
	}
	@Test(priority=2)
	public void getRequest3() {
		
		given()
		.when()
			.get("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.log().cookies();
	}
	@Test(priority=1, dependsOnMethods = "getRequest3")
	public void getRequest4() {
		
		given()
		.when()
			.get("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.log().all();
	}
}
