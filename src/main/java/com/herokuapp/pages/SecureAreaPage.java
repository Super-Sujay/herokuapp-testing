package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Button;
import org.automation.elements.Element;
import org.openqa.selenium.By;

public class SecureAreaPage extends BasePage {

	public final Element message = new Element("Message", By.id("flash"));
	public final Button logout = new Button("Logout", By.cssSelector("a > i"));

}
