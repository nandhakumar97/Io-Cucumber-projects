package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 {
	public static WebDriver driver;
	

	@FindBy(xpath = "//a[@data-parent='#accordian']")
	private WebElement Dress;
	

	@FindBy(xpath = "//a[@data-product-id='1']")
	private WebElement Cart;
	
	@FindBy(xpath = "//button[@data-dismiss='modal']")
	private WebElement Continue;
	

	public WebElement getContinue() {
		return Continue;
	}


	@FindBy(xpath = "(//a[@href='/view_cart'])[1]")
	private WebElement View;


	public Pom3(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}


	public WebElement getDress() {
		return Dress;
	}


	public WebElement getCart() {
		return Cart;
	}


	public WebElement getView() {
		return View;
	}


}
