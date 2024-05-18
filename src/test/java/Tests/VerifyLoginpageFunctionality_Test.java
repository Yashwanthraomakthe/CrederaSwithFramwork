package Tests;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import Pages.HRMLoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class VerifyLoginpageFunctionality_Test extends BaseTest {

	

	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 0, description = "VerifyLogintoHRM")	
	@Description("Test Description : VerifyLogintoHRM")
	@Story("VerifyLogintoHRM")
	@Step("VerifyLogintoHRM_Test01")
	public void VerifyLogintoHRM_Test01() throws InterruptedException {
		HRMLoginPage lg = new HRMLoginPage(driver);
		lg.LoginToHRM();

		System.out.println("VerifyLogintoHRM_Test01 = Passed");

	}

	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 0, description = "Verifyforgotpassword")
	@Description("Test Description : Verifyforgotpassword")
	@Story("Verifyforgotpassword")
	@Step("Verifyforgotpassword_Test02")
	public void Verifyforgotpassword_Test02() throws InterruptedException {
		HRMLoginPage lg = new HRMLoginPage(driver);
		lg.verifyForgotPasswordText();

		System.out.println("Verifyforgotpassword_Test02 = Passed");

	}

}
