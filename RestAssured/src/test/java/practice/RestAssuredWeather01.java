package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Method;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredWeather01 {

@Test
public void getWeatherData(){
	
	RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	
	RequestSpecification httpRequest = RestAssured.given();
	
	Response response = httpRequest.request(Method.GET, "/London");
	
	String responseBody = response.asString();
	
	Assert.assertEquals(responseBody.contains("London"), true,"TestPass");
	
	int statusCode = response.getStatusCode();
	
	Assert.assertEquals(200, statusCode);
}

}
