package com.freecrm.cucumber.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;

public class AddNewUserStepDefinition {
	WebDriver driver;
	
	///new comment added
	
//	@Given("User is already on Loginorhome Page")
//	public void user_is_already_on_Loginorhome_Page() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\sbandari\\Downloads\\chromedriver.exe");
//		driver = new ChromeDriver(); 
//		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	    driver.manage().window().maximize();
//		//Actions action = new Actions(driver);
//		
////		WebElement Rightclick = driver.findElement(By.name("loginform"));
////		action.contextClick(Rightclick).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//	}
//
//	@When("Title of Login Page is LoginOpensource")
//	public void title_of_Login_Page_is_LoginOpensource() {
//		String Title = driver.getTitle();
//		System.out.println(Title);
//		Assert.assertEquals("Log In ‹ opensourcecms — WordPress", Title);
//		
//	}
//
//	@And("User Enters Usernameoremail and Password")
//	public void user_Enters_Usernameoremail_and_Password(DataTable credentials) {
//		driver.findElement(By.id("user_login")).sendKeys(credentials.cell(0,0));
//		driver.findElement(By.id("user_pass")).sendKeys(credentials.cell(0, 1));
//	}
//
//	@Then("User Clicks on Login Button of WordPressPage")
//	public void user_Clicks_on_Login_Button_of_WordPressPage() {
//	 driver.findElement(By.id("wp-submit")).click();
//	 String Titled = driver.getTitle();
//	 System.out.println(Titled);
//	 driver.quit();
//	}

	@Given("User logged with {string} and {string}")
	public void user_Logged_with_id_password(String username,String password) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sbandari\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();	    
		String Titled = driver.getTitle();
		System.out.println("DashBoard Title"+Titled);
		Assert.assertEquals("Dashboard ‹ opensourcecms — WordPress",Titled);
	}        

	@When("Clicked on Users")
	public void clicked_on_Users() {
	    driver.findElement(By.cssSelector("a[href='users.php'] .wp-menu-name")).click();
	}

	@When("Clicks on AddUser")
	public void clicks_on_AddUser() {
		driver.findElement(By.cssSelector("a[href='user-new.php']")).click();
	}

	@When("NewUserPage Form is displayed")
	public void newuserpage_Form_is_displayed(DataTable newusers) throws InterruptedException {
	String addNewUser= driver.findElement(By.id("add-new-user")).getText();
	Assert.assertEquals(addNewUser,"Add New User");
driver.findElement(By.id("user_login")).sendKeys(newusers.cell(0, 0));
driver.findElement(By.id("email")).sendKeys(newusers.cell(0, 1));
driver.findElement(By.id("first_name")).sendKeys(newusers.cell(0, 2));
driver.findElement(By.id("last_name")).sendKeys(newusers.cell(0, 3));
driver.findElement(By.id("url")).sendKeys(newusers.cell(0, 4));
driver.findElement(By.cssSelector(".wp-generate-pw")).click();
Thread.sleep(5000);
WebElement role = driver.findElement(By.id("role"));
Select crole = new Select(role);
crole.selectByVisibleText("Contributor");
WebElement Create = driver.findElement(By.id("createusersub"));
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView(true);", Create);
Create.click();


	}

	@Then("NewUseriscreated")

	public void newuseriscreated() {
		String Successmsg = driver.findElement(By.cssSelector("[id='message'] p")).getText();
				Assert.assertEquals("New user created. Edit user",Successmsg);
	              
	}

}
