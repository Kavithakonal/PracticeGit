package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;


@RunWith(Cucumber.class)
public class StepDefinations {

	
	WebDriver driver;
	
	 @Given("^User is on Netbanking landing page$")
	public void user_is_on_Netbanking_landing_page(){
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumRelated\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com/");
		System.out.println("URL entered sucessfully");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		System.out.println("browser launched sucessfully");
		System.out.println("entered Url sucessfully");
		
	}
	 
	 @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys(strArg1);
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(strArg2);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		 System.out.println("implementation is done2");
	}
	 @Then("^error message displayed is \"([^\"]*)\"$")
	    public void error_message_displayed_is_something(String strArg1) throws Throwable {
		Assert.assertTrue(strArg1,driver.findElement(By.xpath("//div[contains(text(),'Invalid email or password.')]")).isDisplayed());
		 
	 }
	 
	 
	@And("^cards displayed like \"([^\"]*)\"$")
	    public void cards_displayed_like_something(String strArg1) throws Throwable {
		 Assert.assertEquals(strArg1, driver.findElement(By.xpath("//div[contains(text(),'Invalid email or password.')]")).getText());	
		System.out.println(driver.switchTo().alert().getText());
}}
