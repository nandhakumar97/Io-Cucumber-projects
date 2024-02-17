package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.pom.Pom3;
import com.pom.pom1;
import com.pom.pom2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	pom1 p= new pom1(driver);
	pom2 a = new pom2(driver);
	Pom3 b = new Pom3(driver);
	
	@Given("User Launch the url")
	public void user_launch_the_url() throws InterruptedException {
		//browser("chrome");
		getUrl("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

	@When("User Serach the Vegtable")
	public void user_serach_the_vegtable() throws InterruptedException {
		p.getSearchVegtables().sendKeys("Cucumber");
		Thread.sleep(2000);
}
	
	

	@When("user Click the Serach icon")
	public void user_click_the_serach_icon() throws InterruptedException {
		p.getIcon().click();
		
		Thread.sleep(2000);
		
	}
	@When("User Click the add to cart button")
	public void user_click_the_add_to_cart_button() throws InterruptedException {		p.getAddToCart().click();
		
		Thread.sleep(2000);
		
//		
}

	@When("user Click the items")
	public void user_click_the_items() {
		p.getCart().click();
		
	}

	@When("user Click the Proceed to Checkout")
	public void user_click_the_proceed_to_checkout() throws InterruptedException {
	Thread.sleep(2000);
		
		p.getCheckout().click();
	}

	@Then("next page Shown")
 public void next_page_shown() throws InterruptedException {
	Thread.sleep(2000);
		//getTittle();
}
	
	@When("User enter promo code")
	public void user_enter_promo_code() throws InterruptedException {
		a.getCode().sendKeys("12345");
	    Thread.sleep(2000);
	}

	@When("User Click the apply button")
	public void user_click_the_apply_button() throws InterruptedException {
		a.getApply().click();
	   Thread.sleep(2000);
		
		
	}	
	@When("User Click the Place Order")
	public void user_click_the_place_order() throws InterruptedException {
	    a.getOrder().click();

	   Thread.sleep(2000);
		    
}
	
	@Then("Next Page Shown")
	public void next_page_shown1() {
	    
	}


	@When("User Select the Country")
	public void user_select_the_country() throws InterruptedException {
		Select s = new Select(b.getCountry());
		s.selectByValue("India");
	    Thread.sleep(2000);
	}

	@When("User Click the Agree button")
	public void user_click_the_agree_button() throws InterruptedException {
		b.getAgree().click();
	Thread.sleep(2000);
	    	}

	@When("User Click the Proceed")
	public void user_click_the_proceed() {
		b.getProceed().click();
		
	  }

}