package ai.aptipro.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	private static ThreadLocal<WebDriver> thread = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return thread.get();
	}

	public static void setDriver(WebDriver driverref) {
		thread.set(driverref);
	}
}
