package mthods.rest.api;

import org.testng.annotations.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DeleteMethod {
	@Test
	public void deleteRequest() {

		given()
		.when()
			.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204)
		.log().all();
	}
}
