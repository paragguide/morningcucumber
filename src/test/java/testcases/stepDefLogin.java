package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class stepDefLogin {
	public WebDriver driver;
	public LoginPage Loginpg;
	
	@Given("User launch Chrome Driver")
	public void user_launch_chrome_driver() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\browserdrivers\\chromedriver.exe") ;   	
		driver = new ChromeDriver();
		Loginpg = new LoginPage(driver);

	}

	@When("^User opens URL \"([^\"]*)\"$")
	public void user_opens_url(String url) {
		System.out.println("open "+url);
		driver.get(url);

	}

	@When("^User enters Email as \"([^\"]*)\" and password as \"([^\"]*)\"")
	public void user_enters_email_as_and_password_as(String emailadd, String password) {
		
		Loginpg.enterEmail(emailadd);
		Loginpg.enterPassword(password);

	}

	@When("click on login")
	public void click_on_login() {
		Loginpg.clickLoginbtn();
	}

	@Then("^page title should be \"([^\"]*)\"")
	public void page_title_should_be(String ExpectedTitle) {
		String ActualTitle = driver.getTitle();
		if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("ok");
		} else {
			System.out.println("not ok");
		}

	}

	@When("user click on logout link")
	public void user_click_on_logout_link() {
		Loginpg.clickLogoutbtn();

	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	}

}
