package ai.aptipro.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import ai.aptipro.driver.Driver;

public class BaseTest {

	@BeforeMethod
	public void setUp() {
		Driver.initDriver();
	}

	@AfterMethod
	public void closeDown() {
		Driver.closeDriver();
	}

}
