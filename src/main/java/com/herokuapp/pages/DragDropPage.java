package com.herokuapp.pages;

import static org.openqa.selenium.By.id;

import org.automation.base.BasePage;
import org.automation.elements.Element;

public class DragDropPage extends BasePage {

	public Element boxA = new Element("Box A", id("column-a"));
	public Element boxB = new Element("Box B", id("column-b"));

}
