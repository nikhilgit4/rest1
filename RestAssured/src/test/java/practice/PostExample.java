package practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PostExample {

@Test
public void test1(){
	
	RequestSpecification request = RestAssured.given();
	
	request.header("Content-Type","application/json");
	
	JSONObject json = new JSONObject();
	
	json.put("id", "2");
	json.put("title", "selenium wewbdriver");
	json.put("author", "Learn Automation");
	
	request.body(json.toJSONString());
	
	Response response = request.post("http://localhost:3000/posts");
	
	int statusCode = response.getStatusCode();
	
	System.out.println(statusCode);
	
	
}
}
