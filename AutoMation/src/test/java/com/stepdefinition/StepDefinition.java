package com.stepdefinition;

import java.util.List;

import com.baseclass.BaseClass;
import com.pom.Pom1;
import com.pom.Pom2;
import com.pom.Pom3;
import com.pom.Pom4;
import com.pom.Pom5;
import com.pom.Pom6;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	Pom1 a = new Pom1(driver);
	Pom2 b = new Pom2(driver);
	Pom3 c = new Pom3(driver);
	Pom4 d = new Pom4(driver);
	Pom5 e = new Pom5(driver);
	Pom6 f = new Pom6(driver);
	
	@Given("User Launch the Url")
	public void user_launch_the_url() {
		getUrl("https://automationexercise.com/");
	    
	}

	@When("User click the Sign up button")
	public void user_click_the_sign_up_button() {
		a.getLogin().click();
	   
	}

	@Then("Next Page Shwon")
	public void next_page_shwon() {
	   
	}
	
	@When("User enter the Email id")
	public void user_enter_the_email_id() {
		b.getEmail().sendKeys("nandhakumar91473@gmail.com");
	    
	}

	@When("User enter the password")
	public void user_enter_the_password() {
		b.getPassword().sendKeys("9345866702");
	    
	}

	@When("User click the login  button")
	public void user_click_the_login_button() throws InterruptedException {
		b.getLogin().click();
		Thread.sleep(2000);	    
	}

	@Then("Next Page2 Shown")
	public void next_page2_shown() throws InterruptedException {
		Thread.sleep(2000);
	    	}


	@When("User the Women dress")
	public void user_the_women_dress() throws InterruptedException {
		c.getDress().click();	
		Thread.sleep(2000);
	}

	@When("User Click the Add to CArt button")
	public void user_click_the_add_to_c_art_button() throws InterruptedException {
		c.getCart().click();
		Thread.sleep(2000);
	    
	}
	
	@When("user click The Continure")
	public void user_click_the_continure() {
	    c.getContinue().click();
	}


	@When("User click View to Cart button")
	public void user_click_view_to_cart_button() throws InterruptedException {
		c.getView().click();
		Thread.sleep(2000);
	    
	}

	@When("Next Page3 Shwon")
	public void next_page3_shwon() {
	    
	}

	@When("User click the Proceed To Checkout")
	public void user_click_the_proceed_to_checkout() {
		d.getCheckout().click();
	    
	}

	@Then("Next Page4 Shown")
	public void next_page4_shown() throws InterruptedException {
		Thread.sleep(2000);
	    
	}

	@When("User enter Command")
	public void user_enter_command() throws InterruptedException {
		e.getCommant().sendKeys("Welcome home");
		Thread.sleep(2000);
		
	    	}

	@When("User click the order button")
	public void user_click_the_order_button() {
		e.getPayment().click();
	   
	}

	@Then("Next page5 shown")
	public void next_page5_shown() {
	    
	}


@When("User fill ent details")
public void user_fill_ent_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	List<List<String>> li = dataTable.asLists();
	Thread.sleep(2000);
	f.getName().sendKeys(li.get(0).get(0));
	Thread.sleep(2000);
	f.getCdnumber().sendKeys(li.get(0).get(1));
	Thread.sleep(2000);
	f.getCvc().sendKeys(li.get(0).get(2));
	Thread.sleep(2000);
	f.getMonth().sendKeys(li.get(0).get(3));
	Thread.sleep(2000);
	f.getYear().sendKeys(li.get(0).get(4));
	Thread.sleep(2000);
	
	
	
    
}

@When("User confirm Button")
public void user_confirm_button() {
	f.getConfirm().click();
    
}






}
