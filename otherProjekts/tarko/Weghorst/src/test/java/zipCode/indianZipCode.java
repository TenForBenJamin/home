package zipCode;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import objectRepo.parama;
import burnley.DycheBall;

public class indianZipCode  extends parama
{
	@Test
	public void hardCodeZip ()
	{
		String Zip="620001,in";
		String lines="80";
//		@Parameters({"siu"})
		//2b1fd2d7f77ccf1b7de9b441571b39b8"
		RestAssured.baseURI ="https://api.openweathermap.org";
		String jagah =
		given().log().all().
		queryParam("zip", Zip).
		queryParam("appid", apiKey).
		queryParam("lang", "de").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println("/n");
		System.out.println("\n");
		JsonPath js = new JsonPath(jagah);
		String dt = js.getString("dt");
		int ddt=Integer.parseInt(dt);
		System.out.println("Raw date is   " + dt);
		//java.util.Date time = new java.util.Date(dt);
		java.util.Date time=new java.util.Date((long)ddt*1000);
		System.out.println(" beutified date is  " + time);
		String asliJagah=js.getString("name");
		System.out.println("extracted place for  ZipCode " +Zip +" is " +asliJagah);
		//double count = js.getInt("main.temp");
		System.out.println("in");
		System.out.println("\n");
		String coundry = js.getString("sys.country");
		String rlat = js.getString("coord.lat");
		String rlon = js.getString("coord.lon");
		System.out.println("                                the  Nation of    " +coundry + "\r\n");
		double count = js.getDouble("main.temp");
		String mainTemp = js.getString("main.temp");
		System.out.println("\n");
		System.out.println("                                currentTemp   "+count + "\r\n");
//		
		
	}
	@Test
	public void zipUSOklahama ()
	{
		
		String lines="80";
//		@Parameters({"siu"})
		//2b1fd2d7f77ccf1b7de9b441571b39b8"
		RestAssured.baseURI ="https://api.openweathermap.org";
		String jagah =
		given().log().all().
		queryParam("zip", zipUSTulsa).
		queryParam("appid", apiKey).
		queryParam("lang", "de").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println("/n");
		System.out.println("\n");
		JsonPath js = new JsonPath(jagah);
		DycheBall sd = new DycheBall();
		sd.coordsExtractor(jagah);
//		
		
	}
	
	@Test
	public void zipDENrw ()
	{
		
		String zip=f95;
//		@Parameters({"siu"})
		//2b1fd2d7f77ccf1b7de9b441571b39b8"
		RestAssured.baseURI ="https://api.openweathermap.org";
		String jagah =
		given().log().all().
		queryParam("zip", zip).
		queryParam("appid", apiKey).
		queryParam("lang", "de").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().assertThat().statusCode(200).extract().response().asString();
		System.out.println("\n");
		JsonPath js = new JsonPath(jagah);
		DycheBall sd = new DycheBall();
		sd.coordsExtractor(jagah);
		
	}
	
	
	@Test
	public void inwalahidApiKey401 ()
	{
		String Zip="620001,in";
		String lines="80";
//		@Parameters({"siu"})
		//2b1fd2d7f77ccf1b7de9b441571b39b8"
		RestAssured.baseURI ="https://api.openweathermap.org";
		String jagah =
		given().log().all().
		queryParam("zip", Zip).
		queryParam("appid", apiKey_wrong).
		queryParam("lang", "de").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().assertThat().statusCode(401).extract().response().asString();
	}
	
	@Parameters({"siu"})
	@Test
	public void sameCityAPI (String siu)
	{
		RestAssured.baseURI ="https://api.openweathermap.org";
		String jagah =given().log().all().
		queryParam("q", siu).
		queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8")
		.queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().assertThat().statusCode(200).extract().response().asString();
		System.out.println("\n");
		JsonPath js = new JsonPath(jagah);
		DycheBall sd = new DycheBall();
		sd.coordsExtractor(jagah);
	}
	@Parameters({"siu"})
	@Test
	public void responseBodyvalidator (String siu)
	{
		RestAssured.baseURI ="https://api.openweathermap.org";
		given().log().all().
		queryParam("q", siu).
		queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8")
		.queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().assertThat()
		.statusCode(200).
		body("base", equalTo("station"));
		
//		JsonPath js = new JsonPath(jagah);
//		DycheBall sd = new DycheBall();
//		sd.coordsExtractor(jagah);
	}
	
	@Parameters({"siu"})
	@Test
	public void resBodyBase(String siu) 
	{
		
		String s =
				given().log().all().
				queryParam("q", siu).
				queryParam("appid", apiKey).
				queryParam("lang", "de").queryParam("units", "metric").
				when().get("data/2.5/weather").
				then().assertThat().statusCode(200).extract().response().asString();		
		DycheBall sd = new DycheBall();
		String b=sd.baseEx(s);
		
				//assertEquals(b, "stations");
				System.out.println(b);
	}
	
	
	
	public void latLoner ()
	{
		String ilat="49";
		String lines="80";
//		@Parameters({"siu"})
		double latt=Double.parseDouble(ilat);
		RestAssured.baseURI ="https://api.openweathermap.org";
		String jagah =
		given().log().all().
		queryParam("lat", latt).queryParam("lon", lines).
		queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").
		queryParam("lang", "de").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println("/n");
		System.out.println("\n");
		JsonPath js = new JsonPath(jagah);
		String dt = js.getString("dt");
		int ddt=Integer.parseInt(dt);
		System.out.println("Raw date is   " + dt);
		//java.util.Date time = new java.util.Date(dt);
		java.util.Date time=new java.util.Date((long)ddt*1000);
		System.out.println(" beutified date is  " + time);
		String asliJagah=js.getString("name");
		System.out.println("extracted place for  latitude " +latt +"  and longitude  " +lines +" is " +asliJagah);
		//double count = js.getInt("main.temp");
		System.out.println("in");
		System.out.println("\n");
		String coundry = js.getString("sys.country");
		String rlat = js.getString("coord.lat");
		String rlon = js.getString("coord.lon");
		System.out.println("                                the  Nation of    " +coundry + "\r\n");
		double count = js.getDouble("main.temp");
		String mainTemp = js.getString("main.temp");
		System.out.println("\n");

	}

	
	
	
}
