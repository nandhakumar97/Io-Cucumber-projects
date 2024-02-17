package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom6 {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement Name;
	
	@FindBy(xpath = "//input[@name='card_number']")
	private WebElement Cdnumber;
	
	@FindBy(xpath = "//input[@name='cvc']")
	private WebElement Cvc;
	
	@FindBy(xpath = "//input[@name='expiry_month']")
	private WebElement Month;
	
	@FindBy(xpath = "//input[@name='expiry_year']")
	private WebElement year;
	
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement Confirm;

	public Pom6(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getName() {
		return Name;
	}

	public WebElement getCdnumber() {
		return Cdnumber;
	}

	public WebElement getCvc() {
		return Cvc;
	}

	public WebElement getMonth() {
		return Month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getConfirm() {
		return Confirm;
	}

}
