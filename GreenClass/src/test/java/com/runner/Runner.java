package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Prasanth\\eclipse-workspace\\GreenClass\\src\\test\\java\\com\\feature\\GreenKart.feature" ,
glue = "com.stepdefinition",
plugin = {"pretty" , "html:target/cucumber.html" , "json:target/cucumber.json" }
,monochrome = true,
dryRun = false)


public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void startTheProgram() {
		
	//	driver=(WebDriver) BaseClass.browser("chrome");
		driver=BaseClass.browser("chrome");
	}

}
