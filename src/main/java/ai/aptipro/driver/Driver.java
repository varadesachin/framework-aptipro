package ai.aptipro.driver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static void initDriver() {
		WebDriver driver = new ChromeDriver();
		DriverManager.setDriver(driver);
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().get("");
	}

	public static void closeDriver() {

		DriverManager.getDriver().close();
	}

}
