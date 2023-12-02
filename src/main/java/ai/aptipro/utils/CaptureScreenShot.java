package ai.aptipro.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ai.aptipro.driver.DriverManager;

public final class CaptureScreenShot {
	
	private CaptureScreenShot() {
		
	}
	
	public static String captureScreenShotInBase64() {
		return ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
	}
	

}
