package practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutExample {

	@Test
	public void test1(){
		
		RequestSpecification request = RestAssured.given();
		
		request.header("Content-Type","application/json");
		
		JSONObject json = new JSONObject();
		
		json.put("id", "2");
		json.put("title", "selenium wewbdriver");
		json.put("author", "Learn Automation Testing");
		
		request.body(json.toJSONString());
		
		Response response = request.put("http://localhost:3000/posts/2");
		
		int statusCode = response.getStatusCode();
		
		System.out.println(statusCode);
		
		
	}
}
