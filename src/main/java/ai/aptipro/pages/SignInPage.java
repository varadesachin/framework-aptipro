package ai.aptipro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ai.aptipro.driver.DriverManager;
import ai.aptipro.utils.Actions;

public class SignInPage {
	private static final By emailPhoneInputField = By.xpath("//*[@name='emailorphone']");
	private static final By passwordField = By.xpath("//*[@name='password']");
	private static final By continueButton = By.xpath("//*[text()='Continue']");
	private static final By forgotPasswordButton = By.xpath("//*[text()='Forgot password?']");
	private static final By errorMessageOnInvalidSignIn = By.xpath("//*[text()='User not found']");

	public HomePage login(String Email, String Password) {
		Actions.sendKeys(Email, emailPhoneInputField);
		Actions.sendKeys(Password, passwordField);
		Actions.click(continueButton);
		return new HomePage();
	}

	public void clickOnForgotPasswordButton() {
		WebElement forgotpassbutton = DriverManager.getDriver().findElement(forgotPasswordButton);
		Actions.JSclick(forgotpassbutton);
	}

	public WebElement errorMessageOnInvalidSignIn() {
		return DriverManager.getDriver().findElement(errorMessageOnInvalidSignIn);
	}

}