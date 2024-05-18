package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.HRMHomePage;
import Pages.HRMLoginPage;
import Pages.HRMMyinfoPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class verifyMyInfoPageRegression_Test extends BaseTest {

	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 0, description = "updatePersonalInfo")
	@Description("Test Description : updatePersonalInfo")
	@Story("updatePersonalInfo")
	@Step("updatePersonalInfo_Test01")
	public void updatePersonalInfo_Test01() throws InterruptedException, IOException {
		HRMLoginPage lg = new HRMLoginPage(driver);
		lg.LoginToHRM();
		Thread.sleep(1000);

		HRMHomePage hp = new HRMHomePage(driver);
		hp.clickMyinfo();
		Thread.sleep(1000);

		HRMMyinfoPage ip = new HRMMyinfoPage(driver);
		ip.UpdateMyInfo();
		Thread.sleep(1000);

		System.out.println("updatePersonalInfo_Test01 = Passed");

	}

	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 0, description = "verifyMyinfoPanel")
	@Description("Test Description : verifyMyinfoPanel")
	@Story("verifyMyinfoPanel")
	@Step("verifyMyinfoPanel_Test02")
	public void verifyMyinfoPanel_Test02() throws InterruptedException {
		HRMLoginPage lg = new HRMLoginPage(driver);
		lg.LoginToHRM();
		Thread.sleep(1000);

		HRMHomePage hp = new HRMHomePage(driver);
		hp.clickMyinfo();
		Thread.sleep(1000);

		HRMMyinfoPage ip = new HRMMyinfoPage(driver);
		ip.verifymyInfoPanel();

		System.out.println("verifyMyinfoPanel_Test02 = Passed");

	}

}
