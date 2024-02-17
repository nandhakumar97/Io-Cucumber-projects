package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement Email;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Login;

	public Pom2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLogin() {
		return Login;
	}

	public void setLogin(WebElement login) {
		Login = login;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

}
