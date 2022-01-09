package biya;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class traore {
	
	
	
	
	@Parameters({"siu"})
	@Test
	public void sameCityAPI (String siu)
	{
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("q", siu).queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200);
	}
	
	@Parameters({"siu"})
	@Test
	public void sameCityAPI_US (String siu)
	{
		siu=siu +",US";
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("q", siu).queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200);
	}
	
	@Parameters({"siu"})
	@Test
	public void sameCityAPI_UK (String siu)
	{
		siu=siu +",UK";
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("q", siu).queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200);
	}
	
	@Parameters({"siu"})
	@Test
	public void sameCityAPI_AU (String siu)
	{
		siu=siu +",AU";
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("q", siu).queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200);
	}
	
	@Parameters({"siu"})
	@Test
	public void sameCityAPI_NZ (String siu)
	{
		siu=siu +",AU";
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("q", siu).queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200);
	}
	
	@Parameters({"siu"})
	@Test
	public void sameCityAPI_CA (String siu)
	{
		siu=siu +",CA";
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("q", siu).queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200);
	}
	
	@Parameters({"siu"})
	@Test
	public void sameCityAPI_ZA (String siu)
	{
		siu=siu +",ZA";
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("q", siu).queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200);
	}
	
	@Parameters({"siu"})
	@Test
	public void sameCityAPI_IN (String siu)
	{
		siu=siu +",IN";
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("q", siu).queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200);
	}
	
	@Parameters({"siu"})
	@Test
	public void sameCityAPI_SL (String siu)
	{
		siu=siu +",SL";
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("q", siu).queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200);
	}
	
	@Parameters({"siu"})
	@Test
	public void sameCityAPI_PK (String siu)
	{
		siu=siu +",PK";
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("q", siu).queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200);
	}
	
	@Parameters({"siu"})
	@Test
	public void sameCityAPI_BD (String siu)
	{
		siu=siu +",BD";
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("q", siu).queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().log().all().assertThat().statusCode(200);
	}

}
