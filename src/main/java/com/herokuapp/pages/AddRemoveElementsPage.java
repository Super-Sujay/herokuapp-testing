package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Button;
import org.openqa.selenium.By;

public class AddRemoveElementsPage extends BasePage {

	public final Button addElement = new Button("Add Element", By.cssSelector(".example > button"));
	public final Button delete = new Button("Delete", By.cssSelector("#elements > button"));

}
