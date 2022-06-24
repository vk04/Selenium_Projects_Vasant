package apiTesting;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class GetRequestUsingBasicAUth {

	public static void main(String[] args) {

		String apiKey = "sk_test_51KOBZiSAEuSNwElRSYiCmLQJlf9IRDtQERdxs0bBsIRfRfkSETSB8LN2otj8ClwygPAvdsfyCbpS5yR01g0TtKWv00mXfre9hs";

		// Response res = given().auth().basic(apiKey,
		// "").post("https://api.stripe.com/v1/customers");

		Response res1 = given().auth().basic(apiKey, "").get("https://api.stripe.com/v1/customers");

		// Retrieve only 3 customers by using Param
		Response res2 = given().params("limit", 3).auth().basic(apiKey, "").get("https://api.stripe.com/v1/customers");

		// res.prettyPrint();

		System.out.println("------------------------------------------");

		// res1.prettyPrint();
		res2.prettyPrint();
		System.out.println("Status Code is : " + res2.statusCode());
	}

}
