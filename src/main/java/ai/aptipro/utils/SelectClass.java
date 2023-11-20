package ai.aptipro.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void selectfromDropDown(WebElement element, String value) {
		Select slt = new Select(element);
		slt.selectByValue(value);
	}

}
