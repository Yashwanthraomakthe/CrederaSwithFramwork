package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HRMHomePage {

	public WebDriver driver;

	public HRMHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/*
	 * // @FindAll( value = { @FindBy(xpath = //
	 * "//div[@class='orangehrm-quick-launch-heading']/p") }) // WebElement
	 * allquicklaunch;
	 * 
	 * @FindBy(xpath = "//div[@class='orangehrm-quick-launch-heading']/p")
	 * WebElement allquicklaunch;
	 * 
	 * public void verifyquickLaunchOptions() throws InterruptedException { //
	 * System.out.println(allquicklaunch.getText());
	 * 
	 * System.out.println(allquicklaunch.getSize());
	 * 
	 * }
	 */

	@FindBy(xpath = "//span[normalize-space()='My Info']")
	static WebElement myInfo;

	By quicklaunch = By.xpath("//div[@class='orangehrm-quick-launch-heading']//p");

	public void getquickLaunchLinks() {
		// List<WebElement> OfQuickLaunchURL = driver.findElements(quicklaunch);
		ArrayList expectedList = new ArrayList();
		expectedList.add("Assign Leave");
		expectedList.add("Leave List");
		expectedList.add("Timesheets");
		expectedList.add("Apply Leave");
		expectedList.add("My Leave");
		expectedList.add("My Timesheet");

		List<WebElement> OfQuickLaunchURL = driver
				.findElements(By.xpath("//div[@class='orangehrm-quick-launch-heading']//p"));
		int noOfOptions = OfQuickLaunchURL.size();
		System.out.println(noOfOptions);
		ArrayList actualList = new ArrayList();
		for (WebElement quickLink : OfQuickLaunchURL) {
			actualList.add(quickLink.getText());
		}

		Assert.assertEquals(actualList, expectedList);
		
		
	}
	
	public void clickMyinfo() throws InterruptedException {
		myInfo.click();
		Thread.sleep(2000);
	}
	
	

}
