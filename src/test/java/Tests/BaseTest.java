package Tests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Utilities.readtestData;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;

public class BaseTest {

	public WebDriver driver;

	@BeforeMethod
	// @Parameters("BrowserName")
	@Step("Start the application")
	public void setup() throws InterruptedException, IOException {

		/*
		 * System.out.println("Parameter value is " + browserName);
		 * 
		 * WebDriver driver = null; if (browserName.contains("Chrome")) {
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); } else
		 * if (browserName.contains("Edge")) { WebDriverManager.edgedriver().setup();
		 * driver = new EdgeDriver(); }
		 */

		driver = new ChromeDriver();

		driver.get(readtestData.getURL());
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@AfterMethod
	@Step("Stop the application")
	public void tearDown() {
		driver.quit();
	}

}
