package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.CheckBox;
import org.openqa.selenium.By;

public class CheckboxesPage extends BasePage {

	public final CheckBox checkbox1 = new CheckBox("Checkbox 1", By.cssSelector("input:nth-of-type(1)"));
	public final CheckBox checkbox2 = new CheckBox("Checkbox 2", By.cssSelector("input:nth-of-type(2)"));

}
