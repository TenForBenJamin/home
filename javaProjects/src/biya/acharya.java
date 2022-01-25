package biya;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
public class acharya {

	@Test
	public void alag ()
	{
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("q", "erfurt").queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200);
	}
	
	@Test
	public void negativeTesting404 ()
	{
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("q", "farid").queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(404);
	}
	
	@Parameters({"a"})
	@Test
	public void weatherWithMetrics (String a)
	{
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("q", a).queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200);
	}
	
	@Test
	public void Metrics_zip ()
	{
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("zip", "110010,IN").queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200);
	}
	@Test
	public void Metrics_coords ()
	{
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("lat", "12").queryParam("lon", "79").queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200);
	}
	
	@Test
	public void Metrics_locId ()
	{
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("id", "617094").queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200);
	}
	
	
	@Parameters({"lines"})
	@Test
	public void coordsLines (String lines)
	{
		
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("lat", "12").queryParam("lon", lines).queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200);
	}
	
	@Parameters({"lines"})
	@Test
	public void coordsLinesLoops (String lines)
	{
		int latt=15;
		RestAssured.baseURI ="https://api.openweathermap.org";
		String jagah =
		given().log().all().
		queryParam("lat", latt).queryParam("lon", lines).queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = new JsonPath(jagah);
		String asliJagah=js.getString("name");
		
		System.out.println("extracted place for  latitude " +latt +"  and longitude  " +lines +"is " +asliJagah);
	}
	
	
}
