package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

import org.automation.base.BasePage;
import org.automation.elements.Button;
import org.automation.elements.Element;

public class SecureAreaPage extends BasePage {

	public Element message = new Element("Message", id("flash"));
	public Button logout = new Button("Logout", cssSelector("a > i"));

}
