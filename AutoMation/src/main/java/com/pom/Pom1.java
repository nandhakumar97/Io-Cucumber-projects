package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement Login;

	public Pom1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLogin() {
		return Login;
	}
	
	

}
