package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	WebDriver ldriver;
	public static final String x = "Logout";
	public LoginPage(WebDriver rDriver) 
	{
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy (id = "Email")
	WebElement email;
	
	@FindBy (id = "Password")
	WebElement Password;
	
	@FindBy (xpath = "//html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	WebElement loginbtn;
	
	@FindBy (linkText = x)
	WebElement logout;
	
	public void enterEmail(String emailadd) {
		
		email.clear();
		email.sendKeys(emailadd);
	}
	
	public void enterPassword(String pwd) {
		Password.clear();
		Password.sendKeys(pwd);
	}
	
	public void clickLoginbtn() {
		loginbtn.click();
	}
	public void clickLogoutbtn() {
		logout.click();
	}
	
}
