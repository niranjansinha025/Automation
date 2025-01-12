package Testing1;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.scribejava.core.model.Response;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.util.ArrayList;

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
		//given().when().get("https://api.coindesk.com/v1/bpi/currentprice.json").then().log().all();
		String USD_Code = given().when().get("https://api.coindesk.com/v1/bpi/currentprice.json").then().extract().jsonPath().getString("bpi.USD.code");
		System.out.println("USD Code is : "+USD_Code);
		String GBP_Code = given().when().get("https://api.coindesk.com/v1/bpi/currentprice.json").then().extract().jsonPath().getString("bpi.GBP.code");
		System.out.println("GBP Code is : "+GBP_Code);
		String EUR_Code = given().when().get("https://api.coindesk.com/v1/bpi/currentprice.json").then().extract().jsonPath().getString("bpi.EUR.code");
		System.out.println("EUR Code is : "+EUR_Code);
		String GBP_Description = given().when().get("https://api.coindesk.com/v1/bpi/currentprice.json").then().extract().jsonPath().getString("bpi.GBP.description");
		System.out.println("EUR Code is : "+GBP_Description);
		 SoftAssert verify = new SoftAssert();     
	     verify.assertEquals(GBP_Description, "British Pound Sterling");
	     System.out.println("Actual and expected value for GBP_Description is matching");
		//String nestedValue = jsonPath.get("bpi.USD.code");
//		String res = given().when().get("https://api.coindesk.com/v1/bpi/currentprice.json").body().asString();
//		String element = JsonPath.read(res, jsonRoot);
//		ArrayList<Object> listElements = JsonPath  read(res, "$[0].bpi[*].code");
//		System.out.println("list are " +listElements);
		
		//.assertThat().statusCode(200)
		//.body("code", Matchers.equalTo("USD"));
//		 given()
//		.when()
//		.get("https://api.coindesk.com/v1/bpi/currentprice.json")
//		.then()
		//.statusCode(200)
		//.body("code", equalTo(USD));
		//.log().body()
		//.log().all();
		// JSONObject responseObject = new org.json.JSONObject(response.body().asString());
//			JSONObject object1 = body.getJSONObject("bpi");

			//input details
//		      RequestSpecification h = RestAssured.given();
//		    //get response
//		      Response r = h.get("https://api.coindesk.com/v1/bpi/currentprice.json");
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
