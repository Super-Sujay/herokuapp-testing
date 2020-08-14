package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Alert;
import org.automation.elements.Element;
import org.openqa.selenium.By;

public class ContextMenuPage extends BasePage {

	public final Element box = new Element("Box", By.id("hot-spot"));
	public final Alert contextAlert = new Alert("Context");

}
