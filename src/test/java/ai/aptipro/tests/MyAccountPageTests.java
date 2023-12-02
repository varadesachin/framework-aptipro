package ai.aptipro.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.aptipro.configfactory.AccessProperties;
import ai.aptipro.driver.DriverManager;
import ai.aptipro.pages.LandingPage;
import ai.aptipro.pages.MyAccountPage;

public class MyAccountPageTests extends BaseTest {

	LandingPage landingPage = new LandingPage();
	MyAccountPage myAccountPage = new MyAccountPage();

	@Test
	public void changePasswordFlowCheck() throws InterruptedException {
		
		landingPage.clickOnSignInButton()
				.login(AccessProperties.getProperty().validEmailId(), AccessProperties.getProperty().currentPassword())
				.clickOnMyAccountButton();
		
		myAccountPage.clickOnsecurityButton()
				.clickOnchangePasswordButton()
				.entercurrentPassword(AccessProperties.getProperty().currentPassword())
				.enterNewPassword(AccessProperties.getProperty().newPassword())
				.enterConfirmNewPasswordField(AccessProperties.getProperty().newPassword()).clickSaveChangesButton();
		
		Thread.sleep(5000);
		String actualUrl = DriverManager.getDriver().getCurrentUrl();
		Assert.assertEquals(actualUrl, "http://dev.aptipro.ai/");
	}

	@Test
	public void changeState() throws InterruptedException {
		landingPage.clickOnSignInButton()
				.login(AccessProperties.getProperty().validEmailId(), AccessProperties.getProperty().currentPassword())
				.clickOnMyAccountButton();
		myAccountPage.clickOnEditButton()
				.selectstate(AccessProperties.getProperty().state())
				.clickSaveChangesButton()
				.clickYesButtonOnAlert();
	}

}
