package ai.aptipro.tests;

import org.testng.annotations.Test;

import ai.aptipro.configfactory.AccessProperties;
import ai.aptipro.pages.LandingPage;

public class HomePageTests extends BaseTest {

	LandingPage landingPage = new LandingPage();

	@Test
	public void logoutFlowCheck() {
		landingPage.clickOnSignInButton()
				.login(AccessProperties.getProperty().validEmailId(), AccessProperties.getProperty().currentPassword())
				.logout();

	}

}
