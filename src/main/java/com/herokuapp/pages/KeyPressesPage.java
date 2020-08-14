package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.automation.elements.TextBox;
import org.openqa.selenium.By;

public class KeyPressesPage extends BasePage {

	public final TextBox target = new TextBox("Target", By.id("target"));
	public final Element result = new Element("Result", By.id("result"));

}
