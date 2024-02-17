package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom2 {
	
	public static WebDriver driver;
	
	
	public pom2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getCode() {
		return Code;
	}

	public void setCode(WebElement code) {
		Code = code;
	}

	public WebElement getApply() {
		return Apply;
	}

	public void setApply(WebElement apply) {
		Apply = apply;
	}

	public WebElement getOrder() {
		return Order;
	}

	public void setOrder(WebElement order) {
		Order = order;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	//public static WebDriver driver;
	
	@FindBy(xpath = "//input[@class='promoCode']")
	private WebElement Code;
	
	@FindBy(xpath = "//button[@class='promoBtn']")
	private WebElement Apply;
	
	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement Order;
	
	

}
