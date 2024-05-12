package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMLoginPage {

	public WebDriver driver;

	public HRMLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	public WebElement loginbutton;

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	public WebElement forgotPassword;

	public void LoginToHRM() throws InterruptedException {
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbutton.click();
		Thread.sleep(2000);
	}

	public void verifyForgotPasswordText() {
		String actualforgot = forgotPassword.getText();
		String expectedforgot = "Forgot your password?";
		assertEquals(actualforgot, expectedforgot);

	}

}
