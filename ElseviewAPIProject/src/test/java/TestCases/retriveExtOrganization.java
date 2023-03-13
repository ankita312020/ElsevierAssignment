package TestCases;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;


import Utility.payLoad;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class retriveExtOrganization {

	@Test
	public void retriveExtOrg() {

		RestAssured.baseURI = "https://api.elsevierpure.com";
		String response = given().log().all().header("Content-Type", "application/json")
				.header("api-key", "82a01f82-5904-4ddd-9bd8-66dcdde64a9b").header("accept", "application/json")
				.body(payLoad.extOrg()).when().put("ws/api/external-organizations").then().log().all().assertThat()
				.statusCode(201).extract().response().asString();

		JsonPath js = new JsonPath(response);
		String uuId = js.getString("uuid");

		System.out.println(uuId);
		given().queryParam("uuid", uuId).when().get().then().assertThat().statusCode(200).extract().response().asString();
		
	}

}
