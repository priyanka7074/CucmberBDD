//package stepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import junit.framework.Assert;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepDefinition {
//	
//	WebDriver driver;
//	
//	@Given("^user is already on login page$")
//	public void user_already_on_login_page() {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
//	    driver = new ChromeDriver();
//	    driver.get("https://www.crmpro.com/index.html");
//		
//	}
//	
//	
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.",title);
//	}
//	
//	
//	
//	//Reg Exp: Either of them are ok
//	 //1. \"([^\"]*)\"
//	 //2. \"(.*)\"
//
//	 @Then("^user enters \"(.*)\" and \"(.*)\"$") //Data Driven without and with Examples keyword
//	 public void user_enters_username_and_password(String username, String password){
//		driver.findElement(By.name("username")).sendKeys(username);
// 	    driver.findElement(By.name("password")).sendKeys(password);
//	}
//	 
//	 
//	
//	@Then("^user clicks on Login button$")
//	public void user_clicks_on_Login_button(){
//		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", loginBtn);
//	   
//	}
//	
//	
//	
//	@Then("^user is on Home Page$")
//	public void user_is_on_Home_Page(){
//	    String title = driver.getTitle();
//	    System.out.println("Home page title is: "+title);
//	    Assert.assertEquals("CRMPRO", title);
//	}
//	
//	
//	
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page(){
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//	    
//	}
//	
//	
//	
//	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	public void user_enters_contact_details(String firstname, String lastname, String position) {
//		 driver.findElement(By.id("first_name")).sendKeys(firstname);
//		 driver.findElement(By.id("surname")).sendKeys(lastname);
//		 driver.findElement(By.id("company_position")).sendKeys(position);
//		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();	
//	}
//	
//	
//	
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}
//
//}
