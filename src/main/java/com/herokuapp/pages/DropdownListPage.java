package com.herokuapp.pages;

import static org.openqa.selenium.By.id;

import org.automation.base.BasePage;
import org.automation.elements.DropDown;

public class DropdownListPage extends BasePage {

	public DropDown option = new DropDown("Option", id("dropdown"));

}
