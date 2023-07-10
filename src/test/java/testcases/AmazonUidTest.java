package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonUidTest 
{
	public static WebDriver driver = null;
	public static WebElement pwd = null;
	
	@Given("i open browser {string}")
	public void i_open_browser(String string) 
	{
		if(string.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\browserdrivers\\chromedriver.exe") ;   	
		driver = new ChromeDriver(); 
		}
		else if(string.equals("firefox"))
		{
			
		}
		}
	
	@Given("i open url {string}")
	public void i_open_url(String string) 
	{
	    driver.navigate().to(string);
	    driver.manage().window().maximize();
	}
	@When("i click on signin")
	public void i_click_on_signin() 
	{
	    driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
	}
	@When("i enter userid {string}")
	public void i_enter_userid(String string) 
	{
	    driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(string);
	}
	@When("click submit")
	public void click_submit() 
	{
	    driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	}
	@Then("password textbox must come")
	public void password_textbox_must_come() 
	{
	     pwd = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
	}


}
