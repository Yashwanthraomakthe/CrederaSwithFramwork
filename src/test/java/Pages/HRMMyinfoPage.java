package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.readtestData;

public class HRMMyinfoPage {

	public WebDriver driver;

	public HRMMyinfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstName;

	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement employeeID;

	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement orderID;

	By myInfoPanelEntry = By.xpath("//div[@class='orangehrm-tabs']//div//a");

	public void UpdateMyInfo() throws InterruptedException, IOException {
		firstName.sendKeys(readtestData.getFirstName());
		employeeID.sendKeys(readtestData.getEmployeeID());
		orderID.sendKeys(readtestData.getOrderID());

	}

	public void verifymyInfoPanel() {
		List<WebElement> entries = driver.findElements(myInfoPanelEntry);
		for (WebElement entry : entries) {
			System.out.println(entry.getText());
		}
	}

}
