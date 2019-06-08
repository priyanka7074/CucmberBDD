package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefinition {
	
	@Before //cucumber hook
	public void setUP(){
		System.out.println("launch Chrome");
		System.out.println("Enter URL for Free CRM APP");
	}
	
	@After
	public void tearDown(){
		System.out.println("close the browser");
	}

	@Given("^user is on deals page$")
	public void user_is_on_deals_page() throws Throwable {
	    System.out.println("User is on deal page");
	}

	@When("^user fills the deals form$")
	public void user_fills_the_deals_form() throws Throwable {
		System.out.println("Create a deal");
	}

	@Then("^deal is created$")
	public void deal_is_created() throws Throwable {
		System.out.println("Deal is created");
	}
	
	@Given("^user is on contact page$")
	public void user_is_on_contact_page() throws Throwable {
		System.out.println("user is on contact page");
	
	}
	
	@When("^user fills the contact form$")
	public void user_fills_the_contact_form() throws Throwable {
		System.out.println("create a contact");
	}
	
	@Then("^contact is created$")
	public void contact_is_created() throws Throwable {
		System.out.println("contact is created");
	}
	
	
	@Given("^user is on mail page$")
	public void user_is_on_mail_page() throws Throwable {
		System.out.println("user is on mail pahge");
	}
	
	@When("^user fills the mail form$")
	public void user_fills_the_mail_form() throws Throwable {
		System.out.println("create a mail");
	}
	
	@Then("^mail is created$")
	public void mail_is_created() throws Throwable {
		System.out.println("mail is created");
	}	

	
}
