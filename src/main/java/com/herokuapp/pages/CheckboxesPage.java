package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.CheckBox;
import static org.openqa.selenium.By.cssSelector;

public class CheckboxesPage extends BasePage {

	public CheckBox checkbox1 = new CheckBox("Checkbox 1", cssSelector("input:nth-of-type(1)"));
	public CheckBox checkbox2 = new CheckBox("Checkbox 2", cssSelector("input:nth-of-type(2)"));

}
