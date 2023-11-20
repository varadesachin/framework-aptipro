package ai.aptipro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ai.aptipro.driver.DriverManager;
import ai.aptipro.utils.Actions;

public class HomePage {

	private static final By myAccountLink = By.xpath("//*[@class='my-account']");
	private static final By logoutButton = By.xpath("//*[text()='Logout']");
	private static final By yesButtonOnLogoutAlert = By.xpath("//*[text()='Yes']");
	private static final By noButtonOnLogoutAlert = By.xpath("//*[text()='No']");

	public HomePage clickOnMyAccountButton() {
		WebElement myAccountlinkHeader = DriverManager.getDriver().findElement(myAccountLink);
		Actions.JSclick(myAccountlinkHeader);
		return this;

	}

	public HomePage clickOnLogoutButton() {
		Actions.click(logoutButton);
		return this;
	}

	public void clickOnYesButtonOnLogoutAlert() {
		Actions.click(yesButtonOnLogoutAlert);
	}

	public LandingPage logout() {

		clickOnMyAccountButton().clickOnLogoutButton().clickOnYesButtonOnLogoutAlert();
		return new LandingPage();
	}
}
