package burnley;

import io.restassured.path.json.JsonPath;

public class DycheBall 
{
 public static String coordsExtractor(String s) 
 {
	 
	 System.out.println(" inside DycheBall  ");
	 JsonPath js = new JsonPath(s);
		String dt = js.getString("dt");
		int ddt=Integer.parseInt(dt);
		System.out.println("Raw date is   " + dt);
		//java.util.Date time = new java.util.Date(dt);
		java.util.Date time=new java.util.Date((long)ddt*1000);
		System.out.println(" beutified date is  " + time);
		
		String asliJagah=js.getString("name");
		System.out.println("extracted place for  ZipCode  is                  " +asliJagah);
		//double count = js.getInt("main.temp");
		System.out.println("in");
		System.out.println("\n");
		String coundry = js.getString("sys.country");
		String rlat = js.getString("coord.lat");
		String rlon = js.getString("coord.lon");
		String weatherCode = js.getString("weather[0].id");
		System.out.println("                               weatherCode is    " +weatherCode + "\r\n");
		System.out.println("                               Latitude is    " +rlat + "\r\n");
		System.out.println("                               Longitude  is    " +rlon + "\r\n");
		System.out.println("                                the  Nation of    " +coundry + "\r\n");
		double count = js.getDouble("main.temp");
		String mainTemp = js.getString("main.temp");
		System.out.println("\n");
		System.out.println("                                currentTemp   "+count + "\r\n");
	 
	 return null;
 }
 
 public static String baseEx(String s) 
 {
	 
	 System.out.println(" inside baseExtractor  ");
	 JsonPath js = new JsonPath(s);
		String dt = js.getString("dt");
		int ddt=Integer.parseInt(dt);
//		System.out.println("Raw date is   " + dt);
//		//java.util.Date time = new java.util.Date(dt);
//		java.util.Date time=new java.util.Date((long)ddt*1000);
//		System.out.println(" beutified date is  " + time);
//		
//		String asliJagah=js.getString("name");
//		System.out.println("extracted place for  ZipCode  is " +asliJagah);
//		//double count = js.getInt("main.temp");
//		System.out.println("in");
//		System.out.println("\n");
		String baseVal = js.getString("base");
//		String rlat = js.getString("coord.lat");
//		String rlon = js.getString("coord.lon");
//		System.out.println("                                the  Nation of    " +coundry + "\r\n");
//		double count = js.getDouble("main.temp");
//		String mainTemp = js.getString("main.temp");
//		System.out.println("\n");
		System.out.println("                                baseVal    "+baseVal + "\r\n");
	 
	 return baseVal;
	 
	 
 }
}
