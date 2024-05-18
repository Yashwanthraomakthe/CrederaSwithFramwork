package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readtestData {

	static FileReader reader;
	static Properties props = new Properties();	

	public static String getURL() throws IOException {
		reader = new FileReader("F:\\OnlineClasses\\SwitchExam\\PersonalProject\\TestData.properties");
		props.load(reader);
		return props.getProperty("URL");

	}

	public static String getFirstName() throws IOException {
		return props.getProperty("firstName");

	}

	public static String getEmployeeID() throws IOException {
		return props.getProperty("employeeID");

	}

	public static String getOrderID() throws IOException {
		return props.getProperty("orderID");

	}
}
