package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom5 {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//textarea[@class='form-control']")
	private WebElement Commant;
	
	@FindBy(xpath = "//a[@href='/payment']")
	private WebElement Payment;

	public Pom5(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getCommant() {
		return Commant;
	}

	public WebElement getPayment() {
		return Payment;
	}
	
	

}
