package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4 {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[@class='btn btn-default check_out']")
	private WebElement Checkout;

	public Pom4(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getCheckout() {
		return Checkout;
	}

}
