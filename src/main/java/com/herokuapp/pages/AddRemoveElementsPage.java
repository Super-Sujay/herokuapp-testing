package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;

import org.automation.base.BasePage;
import org.automation.elements.Button;

public class AddRemoveElementsPage extends BasePage {

	public Button addElement = new Button("Add Element", cssSelector(".example > button"));
	public Button delete = new Button("Delete", cssSelector("#elements > button"));

}
