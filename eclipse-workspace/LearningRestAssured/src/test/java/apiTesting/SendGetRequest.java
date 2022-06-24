package apiTesting;

//import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matcher.*;

public class SendGetRequest {

	public static void main(String[] args) {
		

	//Response res=given().auth().basic("sk_test_4eC39HqLyjWDarjtT1zdp7dc", "").get("https://api.stripe.com/v1/customers");
	
	//res.prettyPrint();
	
	Response res1=get("https://dhaatri.info/api/category_sub_grp/mens/2");
	
	System.out.println("Status Code is : "+res1.statusCode());//Printing Status Code
	System.out.println("-------------------------");
	res1.prettyPrint();
	System.out.println("-------------------------");
	
	System.out.println("Session ID is : "+res1.sessionId());
	
	
	
	}

}
