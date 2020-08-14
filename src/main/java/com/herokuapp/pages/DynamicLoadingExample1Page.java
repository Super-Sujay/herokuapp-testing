package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Button;
import org.automation.elements.Element;
import org.openqa.selenium.By;

public class DynamicLoadingExample1Page extends BasePage {

	public final Button start = new Button("Start", By.tagName("button"));
	public final Element finishText = new Element("Finish Text", By.id("finish"));

}
