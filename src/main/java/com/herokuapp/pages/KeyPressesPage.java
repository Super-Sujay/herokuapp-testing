package com.herokuapp.pages;

import static org.openqa.selenium.By.id;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.automation.elements.TextBox;

public class KeyPressesPage extends BasePage {

	public TextBox target = new TextBox("Target", id("target"));
	public Element result = new Element("Result", id("result"));

}
