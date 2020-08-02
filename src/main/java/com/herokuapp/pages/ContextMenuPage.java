package com.herokuapp.pages;

import static org.openqa.selenium.By.id;

import org.automation.base.BasePage;
import org.automation.elements.Alert;
import org.automation.elements.Element;

public class ContextMenuPage extends BasePage {

	public Element box = new Element("Box", id("hot-spot"));
	public Alert contextAlert = new Alert("Context");

}
