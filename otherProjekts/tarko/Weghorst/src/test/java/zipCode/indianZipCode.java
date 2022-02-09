package zipCode;

import static io.restassured.RestAssured.given;

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
		
		String lines=zipDENrw;
//		@Parameters({"siu"})
		//2b1fd2d7f77ccf1b7de9b441571b39b8"
		RestAssured.baseURI ="https://api.openweathermap.org";
		String jagah =
		given().log().all().
		queryParam("zip", zipDEBodersee).
		queryParam("appid", apiKey).
		queryParam("lang", "de").queryParam("units", "metric").
		when().get("data/2.5/weather").
		then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println("/n");
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

	
	
	
	
	public void jenkinerStrasse ()
	{
		
		//Xls_Reader r= new Xls_Reader("H:\\vsos\\TenForBen.github.io\\EdisonLogs\\weather.xlsx");
		//int gw=gameweek;	
		String snj ="lonMan";
		System.out.println("SheetUsed - " +snj);	
		//int  LR =  r.getLastRwoNum(snj);
		//System.out.println("The last row by method  " + LR);
		//int LRs=LR+1;
		//System.out.println("The last row count is LRs " + LRs);
		String place ="almaty";
		System.out.println("Coords are            ~       " + place);
		String[] latestPoints = place.split(" ");
		//String fp=latestPoints[2];
		String slat=latestPoints[2];
		String slon=latestPoints[5];
		System.out.println("slat " +slat +" slon "   + slon);
		Double intslat =Double.parseDouble(slat);
		//intslat=intslat+1;
		Double intslon =Double.parseDouble(slon);
		intslon=intslon+1;
		String StringSlat=String.valueOf(intslat);
		String StringSlon=String.valueOf(intslon);
		//latLoner(StringSlon,StringSlat);
		
		
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
