package testcases;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonPwdTest //extends AmazonUidTest
{
	@Given("userid is valid")
	public void userid_is_valid() 
	{
	    if(AmazonUidTest.pwd != null)
	    {
	    	System.out.println("user id is valid");
	    }
	}
	@When("i enter password {string}")
	public void i_enter_password(String string) 
	{
	   AmazonUidTest.pwd.sendKeys(string);
	   AmazonUidTest.driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
	}
	@Then("Login should fail")
	public void login_should_fail() 
	{
	  String msg =  AmazonUidTest.driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")).getText();
	System.out.println(msg);
	}



}
