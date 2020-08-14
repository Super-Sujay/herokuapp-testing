package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.openqa.selenium.By;

public class DragDropPage extends BasePage {

	public final Element boxA = new Element("Box A", By.id("column-a"));
	public final Element boxB = new Element("Box B", By.id("column-b"));

}
