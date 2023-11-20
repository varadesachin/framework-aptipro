package ai.aptipro.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.aptipro.driver.DriverManager;
import ai.aptipro.pages.LandingPage;
import ai.aptipro.pages.SignInPage;

public class SignInPageTests extends BaseTest {

	LandingPage landingPage = new LandingPage();
	SignInPage signInPage = new SignInPage();

	@Test
	public void loginWithValidCredentials() throws InterruptedException {
		landingPage.clickOnSignInButton().login("warade.sachin03@gmail.com", "Test@005");
		// signinpage.login("warade.sachin03@gmail.com", "Test@005");
		Thread.sleep(4000);
		String actualURL = DriverManager.getDriver().getCurrentUrl();
		Assert.assertEquals(actualURL, "http://dev.aptipro.ai/scenarios/Quantitative");
	}

	@Test
	public void loginWithInvalidCredentials() {
		landingPage.clickOnSignInButton().login("warade.sachin0@gmail.com", "Test@005");
		Assert.assertTrue(signInPage.errorMessageOnInvalidSignIn().isDisplayed());
	}

	@Test
	public void clickOnForgotPasswordButton() {
		signInPage.clickOnForgotPasswordButton();
		String actualURL = DriverManager.getDriver().getCurrentUrl();
		Assert.assertEquals(actualURL, "http://dev.aptipro.ai/forgotpassword");
	}
}
