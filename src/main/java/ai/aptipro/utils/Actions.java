package ai.aptipro.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import ai.aptipro.driver.DriverManager;

public class Actions {

	public static void JSclick(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", element);
	}

	public static void click(By element) {
		DriverManager.getDriver().findElement(element).click();
	}

	public static void sendKeys(String value, By element) {

		DriverManager.getDriver().findElement(element).sendKeys(value);

	}

}
