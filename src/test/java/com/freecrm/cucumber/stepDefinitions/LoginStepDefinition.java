
  package com.freecrm.cucumber.stepDefinitions;
  
  import java.util.concurrent.TimeUnit;
  
  import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import
  org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
  cucumber.api.java.en.When;
  import org.junit.Assert;
  
  
  public class LoginStepDefinition { WebDriver driver;
  
	/*
	 * @Given("User is already on Login Page") public void
	 * user_already_on_login_Page(){ System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\sbandari\\Downloads\\chromedriver.exe"); driver = new
	 * ChromeDriver(); driver.get("https://www.freecrm.com");
	 * driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 * driver.manage().window().maximize();
	 * 
	 * }
	 * 
	 * @When("Title of Login Page is Free CRM") public void
	 * title_of_login_page_is_freeCRM() { String Title = driver.getTitle();
	 * System.out.println(Title);
	 * Assert.assertEquals("#1 Free CRM software in the Cloud FreeCRM", Title); }
	 * 
	 * //@Then("User Enters Username and Password") //public void
	 * user_Enters_Username_and_Password() { //
	 * driver.findElement(By.cssSelector(".btn-primary")).click(); //
	 * driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abcdef");
	 * // driver.findElement(By.cssSelector("input[name='password']")).sendKeys(
	 * "asaddef");
	 * 	 * 
	 * @Then("User Enters \"([^\"]*)\" and \"([^\"]*)\"$") public void
	 * user_Enters_Username_and_Password(String Username, String Password) {
	 * driver.findElement(By.cssSelector(".btn-primary")).click();
	 * driver.findElement(By.cssSelector("input[name='email']")).sendKeys(Username);
	 * driver.findElement(By.cssSelector("input[name='password']")).sendKeys(
	 * Password);
	 * 
	 * }
	 * 
	 * @Then("User Clicks on Login Button") public void
	 * user_Clicks_on_Login_Button() {
	 * driver.findElement(By.cssSelector(".submit")).click(); }
	 * 
	 * @Then("Login Error Message is Displayed") public void
	 * Login_Error_Message_is_Displayed() { String ErrorMsg =
	 * driver.findElement(By.cssSelector(".negative")).getText();
	 * System.out.println(ErrorMsg); }
	 * 
	 * @Then("Close the Browser") public void Close_the_Browser() { driver.quit();
	 * 
	 * }
	 */ 

@Given("User is already on Login Page")
public void user_is_already_on_Login_Page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sbandari\\Downloads\\chromedriver.exe"); 
	driver = new ChromeDriver(); 
	driver.get("https://www.freecrm.com");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();

	}
  

@When("Title of Login Page is Free CRM")
public void title_of_Login_Page_is_Free_CRM() {

	 String Title = driver.getTitle();
	 System.out.println(Title);
	 Assert.assertEquals("#1 Free CRM software in the Cloud FreeCRM", Title);
	 }
//\"([^\"]*)\" and \"([^\"]*)\"$"

@When("User Enters \"([^\"]*)\" and \"([^\"]*)\"$") 
		public void user_Enters_Username_and_Password(String Username, String Password) 
{ 
		driver.findElement(By.cssSelector(".btn-primary")).click();
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys(Username); 
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(Password);
  }

@When("User Clicks on Login Button")
public void user_Clicks_on_Login_Button() {
	driver.findElement(By.cssSelector(".submit")).click();
}

@Then("Login Error Message is Displayed")
public void login_Error_Message_is_Displayed() {
	String ErrorMsg = driver.findElement(By.cssSelector(".negative")).getText();
	System.out.println(ErrorMsg);
	driver.quit();
}
}


 
  
  



