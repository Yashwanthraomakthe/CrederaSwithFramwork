package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readtestData {

	public static String getURL() throws IOException {
		FileReader reader = new FileReader("F:\\OnlineClasses\\SwitchExam\\PersonalProject\\TestData.properties");
		Properties props = new Properties();
		props = new Properties();
		props.load(reader);
		return props.getProperty("URL");

	}

	public static String getFirstName() throws IOException {
		FileReader reader = new FileReader("F:\\OnlineClasses\\SwitchExam\\PersonalProject\\TestData.properties");
		Properties props = new Properties();
		props = new Properties();
		props.load(reader);
		return props.getProperty("firstName");

	}

	public static String getEmployeeID() throws IOException {
		FileReader reader = new FileReader("F:\\OnlineClasses\\SwitchExam\\PersonalProject\\TestData.properties");
		Properties props = new Properties();
		props = new Properties();
		props.load(reader);
		return props.getProperty("employeeID");

	}

	public static String getOrderID() throws IOException {
		FileReader reader = new FileReader("F:\\OnlineClasses\\SwitchExam\\PersonalProject\\TestData.properties");
		Properties props = new Properties();
		props = new Properties();
		props.load(reader);
		return props.getProperty("orderID");

	}
}
