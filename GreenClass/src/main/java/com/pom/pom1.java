package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@placeholder='Search for Vegetables and Fruits']")
	private WebElement searchVegtables;
	
	
	@FindBy(xpath = "//button[@class='search-button']")
	private WebElement  Icon;
	
	
	@FindBy(xpath ="//button[text()='ADD TO CART']")
	private WebElement  addToCart;
	
	
	@FindBy(xpath = "//img[@alt='Cart']")
	private WebElement Cart;
	
	@FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']")
	private WebElement Checkout;
	
	
	public pom1(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}


	public WebElement getSearchVegtables() {
		return searchVegtables;
	}


	public WebElement getIcon() {
		return Icon;
	}


	public WebElement getAddToCart() {
		return addToCart;
	}


	public WebElement getCart() {
		return Cart;
	}


	public WebElement getCheckout() {
		return Checkout;
	}

}


