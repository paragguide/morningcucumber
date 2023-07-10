package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch 
{
	public WebElement e = null;
	public WebDriver driver = null;
	
	@Given("^I went to (.*)")
	public void I_went_to(String url)
	{
     System.setProperty("webdriver.chrome.driver", "D:\\browserdrivers\\chromedriver.exe") ;   	
		
	  driver = new ChromeDriver();
	
		System.out.println(url);
		driver.navigate().to(url);
	}
	
	@When("^I search the (.*)")
	public void I_search_the(String keyword)
	{
		System.out.println(keyword);
		e= driver.findElement(By.xpath("//*[@name='q']"));
		e.sendKeys(keyword);
	}
	
	@Then("result must come")
	public void result_must_come()
	{
		if(e != null)
		{
		System.out.println(" sucsess");
		}
		else
		{
			System.out.println("fail");
		}
		//driver.quit();
	}
	

}
