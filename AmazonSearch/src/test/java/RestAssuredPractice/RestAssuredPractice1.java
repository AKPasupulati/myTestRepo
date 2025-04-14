package RestAssuredPractice;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class RestAssuredPractice1 {
	@Test
	public void method1() {
		given()
		.when()
		.get("https://bookstore.toolsqa.com/BookStore/v1/Books")
		.then()
		.statusCode(200);
	}
}
