package ai.aptipro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ai.aptipro.driver.DriverManager;
import ai.aptipro.utils.Actions;
import ai.aptipro.utils.SelectClass;

public class MyAccountPage {

	private static final By securityButton = By.xpath("//*[text()='Security']");
	private static final By myAccountLink = By.xpath("//*[@class='my-account']");
	private static final By changePasswordButton = By.xpath("//*[@class='main']//a");
	private static final By currentPasswordField = By.xpath("//*[@formcontrolname='oldPassword']");
	private static final By newPasswordField = By.xpath("//*[@formcontrolname='newPassword']");
	private static final By confirmNewPasswordField = By.xpath("//*[@formcontrolname='verifyNewPassword']");
	private static final By saveChangesButton = By.xpath("//*[text()=' Save Changes ']");
	private static final By editButton = By.xpath("//*[text()=' Edit ']");
	private static final By yesButtonOnAlertAfterEditing = By.xpath("(//*[@class='dialog-btn btn-yes'])[2]");
	private static final By stateDropDown = By.xpath("//*[@id='state']");
	private static final By yesButtonOnAlertBeforeEditing = By.xpath("(//*[@class='dialog-btn btn-yes'])[1]");

	public MyAccountPage clickOnsecurityButton() {
		Actions.click(securityButton);
		return this;
	}

	public MyAccountPage clickOnchangePasswordButton() {
		Actions.click(changePasswordButton);
		return this;
	}

	public MyAccountPage entercurrentPassword(String currPassword) {

		Actions.sendKeys(currPassword, currentPasswordField);
		return this;
	}

	public MyAccountPage enterNewPassword(String newPassword) {
		Actions.sendKeys(newPassword, newPasswordField);
		return this;
	}

	public MyAccountPage enterConfirmNewPasswordField(String ConfirmPassword) {
		Actions.sendKeys(ConfirmPassword, confirmNewPasswordField);
		return this;
	}

	public MyAccountPage clickSaveChangesButton() throws InterruptedException {
		Thread.sleep(2000);
		Actions.click(saveChangesButton);
		return this;
	}

	public MyAccountPage clickOnEditButton() throws InterruptedException {

		Actions.click(editButton);
		Thread.sleep(2000);
		Actions.click(yesButtonOnAlertBeforeEditing);
		Thread.sleep(2000);
		return this;
	}

	public void clickYesButtonOnAlert() throws InterruptedException {
		Thread.sleep(4000);

		// Actions.click(yesButtonOnAlert);
		WebElement yesButton = DriverManager.getDriver().findElement(yesButtonOnAlertAfterEditing);
		Actions.JSclick(yesButton);
		Thread.sleep(4000);

	}

	public MyAccountPage selectstate(String StateName) throws InterruptedException {
		WebElement dropDownState = DriverManager.getDriver().findElement(stateDropDown);
		Thread.sleep(4000);
		SelectClass.selectfromDropDown(dropDownState, StateName);
		return this;
	}

}
