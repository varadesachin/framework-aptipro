package ai.aptipro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ai.aptipro.driver.DriverManager;
import ai.aptipro.utils.Actions;

public class LandingPage {

	private static final By signInButton = By.xpath("//*[text()=' Sign In ']");
	private static final By getStartedButton = By.xpath("//*[text()=' Get Started ']");
	private static final By signUpButton = By.xpath("//*[text()=' Sign Up ']");

	public SignInPage clickOnSignInButton() {

		Actions.click(signInButton);
		// DriverManager.getDriver().findElement(signInButton).click();
		return new SignInPage();
	}

	public LandingPage clickOnGetStartedButton() {

		Actions.click(getStartedButton);
		// DriverManager.getDriver().findElement(getStartedButton).click();
		return this;
	}

	public LandingPage clickOnSignUpButton() {

		WebElement signUpButton2 = DriverManager.getDriver().findElement(signUpButton);
		Actions.JSclick(signUpButton2);
		// DriverManager.getDriver().findElement(signUpButton).click();
		return this;
	}

}