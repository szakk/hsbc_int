import io.restassured.RestAssured;
import io.restassured.authentication.FormAuthConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;

public class HSBC {
	
//	//gists/:gist_id/comments
	@BeforeClass
	public void setup() {
		RequestSpecification request = RestAssured.given();
		request.param("body", "test test test");
		
	}
//	b8801fc6f606e96f28ee6a4f5e3f9ba307d27ac7 
	//e0d654d505b0412bacf599731fa63ecd
	@Test
	public void listCommentsTests() {
		given()
		.param("access_token", "b8801fc6f606e96f28ee6a4f5e3f9ba307d27ac7")
		.param("body", "nice body")
		.when().patch("https://api.github.com/gists/e0d654d505b0412bacf599731fa63ecd/comments/2381971")
		.then()
		.statusCode(200);
		
	}
	
//	@Test
//	public void editExistingCommentTests() {
//		given().when().get("https://api.github.com/gists/e0d654d505b0412bacf599731fa63ecd/comments")
//		.then()
//		.statusCode(200)
//		.and()
//		.body("author_association[0]", equalTo("OWNER"))
//		.and()
//		.body("id[0]", equalTo(2381971))
//		.body("user[0].login", equalTo("szakk"));
//	}
	
	

}
