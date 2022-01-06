package afcon;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cameroon {

	@Test
	public void SeBasicWeatherApp() throws InterruptedException 
	{
		System.out.println("-------------Test2-----------------this test is to test input value with City,countryCode------------------------------------------------");
		//frameworktest fwt = new frameworktest();
		System.setProperty("webdriver.chrome.driver","C:\\Mava\\chromedriver.exe"); // declaring the chrome driver locatoion
		WebDriver driver= new ChromeDriver();// initializing chrome driver
		//driver.manage().deleteAllCookies(); // deleting all cookies
		driver.manage().window().maximize();		// maximizing the window
		String place = "St. John's";
		String searchParam=place +" coordinates";		// earlier param
		String uri= "https://tenforben.github.io/FPL/vannilaWeatherApp/index.html";
		System.out.println("URL formed -" +uri);
		driver.get(uri);
		String brooks =place;
		String searchReq =brooks;
		System.out.println("Place is  " + brooks);
		WebElement searchBarr=driver.findElement(By.id("searchUser"));
		searchBarr.sendKeys(searchReq);		
		WebElement sambi = driver.findElement(By.id("submit"));
		 sambi.click();
		 Thread.sleep(2000);
		 
		 
		 try {
			 WebElement  coords= driver.findElement(By.id("xPat"));
			 //document.getElementById("cuwt").innerText
			 WebElement  searchResonse= driver.findElement(By.id("cuwt"));
			 WebElement  CountryC= driver.findElement(By.id("landen"));
			 String string_CC = CountryC.getText(); 
			 String searchRes = searchResonse.getText(); 		
			 String loc = coords.getText(); 	
			String searchResult= searchRes +" " + loc +" " + string_CC;
			System.out.println("CUrrent temperature  updated in excel  ");		
			String receivedValue=searchResult;

			String[] result = receivedValue.split(" ");
			String SR =result[0];
			System.out.println("weather "+" is " + SR +" degrees ");
			String Coords =result[1];//location
			String nation =result[2]; // country codeq
			System.out.println("location is " + Coords +" Lat/Longitude ");
			//fwt.quitbrowser(driver);
			driver.quit();
			 
		 }
		 catch(Exception e)
		 {
			 System.out.println("exceptions are available");
		 }
		//String searchR= driver.findElement(By.xpath("/html/body/div[3]/div/div/p[1]")).getText() ;
		
	}
	
	@Parameters({"a"})
	@Test
	public void WeatherAppParameterized(String a) throws InterruptedException 
		{
			System.out.println("------------Test3------------------this test is to test input value with City,countryCode------------------------------------------------");
			//frameworktest fwt = new frameworktest();
			System.setProperty("webdriver.chrome.driver","C:\\Mava\\chromedriver.exe"); // declaring the chrome driver locatoion
			WebDriver driver= new ChromeDriver();// initializing chrome driver
			//driver.manage().deleteAllCookies(); // deleting all cookies
			driver.manage().window().maximize();		// maximizing the window
			String place = a;
			String searchParam=place +" coordinates";		// earlier param
			String uri= "https://tenforben.github.io/FPL/vannilaWeatherApp/index.html";
			System.out.println("URL formed -" +uri);
			driver.get(uri);
			String brooks =place;
			String searchReq =brooks;
			System.out.println("Place is  " + brooks);
			WebElement searchBarr=driver.findElement(By.id("searchUser"));
			searchBarr.sendKeys(searchReq);		
			WebElement sambi = driver.findElement(By.id("submit"));
			 sambi.click();
			 Thread.sleep(2000);
			//String searchR= driver.findElement(By.xpath("/html/body/div[3]/div/div/p[1]")).getText() ;
			 try {
				 WebElement  coords= driver.findElement(By.id("xPat"));
				 //document.getElementById("cuwt").innerText
				 WebElement  searchResonse= driver.findElement(By.id("cuwt"));
				 WebElement  CountryC= driver.findElement(By.id("landen"));
				 String string_CC = CountryC.getText(); 
				 String searchRes = searchResonse.getText(); 		
				 String loc = coords.getText(); 	
				String searchResult= searchRes +" " + loc +" " + string_CC;
				System.out.println("CUrrent temperature  updated in excel  ");		
				String receivedValue=searchResult;

				String[] result = receivedValue.split(" ");
				String SR =result[0];
				System.out.println("weather "+" is " + SR +" degrees ");
				String Coords =result[1];//location
				String nation =result[2]; // country codeq
				System.out.println("location is " + Coords +" Lat/Longitude ");
				//fwt.quitbrowser(driver);
				driver.quit();
				 
			 }
			 catch(Exception e)
			 {
				 System.out.println("exceptions are available");
				 
				 driver.quit();
				 Assert.assertEquals("tum", "ko");
				 // cd C:/\git/\homie/\home

			 }
		}
	
	
	
}
