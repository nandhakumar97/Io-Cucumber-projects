package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	

	public static WebDriver browser(String browser)  {
		WebDriverManager.edgedriver().setup();
		
		
if(browser.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver","C:\\Users\\Prasanth\\eclipse-workspace\\SeleniumWorld\\driver\\msedgedriver.exe");
			
			 driver = new EdgeDriver();
		
			
			driver.manage().window().maximize();
			
	}
else if(browser.equalsIgnoreCase("chrome")) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasanth\\eclipse-workspace\\SeleniumWorld\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
return driver;
		
}
	public static void getUrl(String url) {
		
		driver.get(url);
	}
	public static void getTittle() {
		
		 String title = driver.getTitle();
		 System.out.println(title);
	}
	
	
	
	}




