package ai.aptipro.configfactory;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources(value = "file:src\\test\\resources\\global.properties")
public interface global extends Config {

	String url();

	String validEmailId();

	String currentPassword();

	String newPassword();

	String expectedSignInPageUrl();

	String expectedHomePageUrl();

	String expectedSignUpPageUrl();

	String state();

}
