package TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;


import static io.restassured.RestAssured.*;

import Utility.payLoad;

public class createExtOrganization {

	@Test

	public void createExtOrg() {
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://api.elsevierpure.com")
				.addHeader("api-key", "82a01f82-5904-4ddd-9bd8-66dcdde64a9b")
				.addHeader("Content-Type", "application/json").addHeader("accept", "application/json")
				.setContentType(ContentType.JSON).build();

		RequestSpecification res = given().spec(req).body(payLoad.extOrg());

		ResponseSpecification resspec = new ResponseSpecBuilder().expectStatusCode(201)
				.expectContentType(ContentType.JSON).build();

		Response response = res.when().log().all().put("ws/api/external-organizations").then().spec(resspec).extract()
				.response();
		// Assert the status code
		Assert.assertEquals(201, response.getStatusCode());

		String responseString = response.asString();
		System.out.println(responseString);

	}




}
