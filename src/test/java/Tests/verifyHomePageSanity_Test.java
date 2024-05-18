package Tests;

import org.testng.annotations.Test;

import Pages.HRMHomePage;
import Pages.HRMLoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class verifyHomePageSanity_Test extends BaseTest{
	
	
	@Step("VerifyqucikLaunchOptions_Test01")
	@Severity(SeverityLevel.NORMAL)
    @Test(priority = 0, description = "VerifyqucikLaunchOptions")
    @Description("Test Description : VerifyqucikLaunchOptions")
    @Story("VerifyqucikLaunchOptions")
	public void VerifyqucikLaunchOptions_Test01() throws InterruptedException {
		HRMLoginPage lg = new HRMLoginPage(driver);
		lg.LoginToHRM();
		
		
		HRMHomePage hp = new HRMHomePage(driver);
		Thread.sleep(2000);
		hp.getquickLaunchLinks();
		
		System.out.println("VerifyqucikLaunchOptions_Test01 = Passed");

	}

}
