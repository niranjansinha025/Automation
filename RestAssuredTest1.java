package Testing1;

import org.testng.annotations.Test;

import com.github.scribejava.core.model.Response;

import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;

public class RestAssuredTest1 {
	/*
	given()
	content type, set cookies, add auth, add param, set header info etc
	when()
	get, post, put, delete
	then()
	validate status code, extract response, extract header cookies & Response body
	*/
	@Test (priority=1)
	public void getHttpRequest()
	{
		given ()
		
		.when ()
		.get("https://seregtracqa.secureyes.net/api/auth/getKey")
		
		.then ()
		.statusCode(200)
		//.body("page", equalTo(2))
		//.log().body()
		.log().all();
		
	}
	
//	@Test 
//	public void getHttpRequest2() throws IOException
//	{
//		RestAssured.baseURI = "https://regtracdemo.secureyes.net";
//		RequestSpecification httpRequest = RestAssured.given();
//		Response response = (Response) httpRequest.get("/login");
//		String body = response.getBody();
//        System.out.println("Response Body is: " + body.toString());
//	}

}
