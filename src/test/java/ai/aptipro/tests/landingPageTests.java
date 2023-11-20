package ai.aptipro.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.aptipro.configfactory.AccessProperties;
import ai.aptipro.driver.DriverManager;
import ai.aptipro.pages.LandingPage;

public class landingPageTests extends BaseTest {
	LandingPage landingPage = new LandingPage();

	@Test
	public void clickOnSignInButton() {
		landingPage.clickOnSignInButton();
		String actualUrl = DriverManager.getDriver().getCurrentUrl();
		Assert.assertEquals(actualUrl, AccessProperties.getProperty().expectedSignInPageUrl());

	}

	@Test
	public void clickonGetStartedButton() {
		landingPage.clickOnGetStartedButton();
		String actualUrl = DriverManager.getDriver().getCurrentUrl();
		Assert.assertEquals(actualUrl, AccessProperties.getProperty().expectedHomePageUrl());
	}

	@Test
	public void clickOnSignUpButton() {
		landingPage.clickOnSignUpButton();
		String actualUrl = DriverManager.getDriver().getCurrentUrl();
		Assert.assertEquals(actualUrl, AccessProperties.getProperty().expectedSignUpPageUrl());
	}

}
