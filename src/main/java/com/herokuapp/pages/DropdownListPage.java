package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.DropDown;
import org.openqa.selenium.By;

public class DropdownListPage extends BasePage {

	public final DropDown option = new DropDown("Option", By.id("dropdown"));

}
