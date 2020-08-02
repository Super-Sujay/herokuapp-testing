package com.herokuapp.pages;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.tagName;

import org.automation.base.BasePage;
import org.automation.elements.Button;
import org.automation.elements.Element;

public class DynamicLoadingExample1Page extends BasePage {

	public Button start = new Button("Start", tagName("button"));
	public Element finishText = new Element("Finish Text", id("finish"));

}
