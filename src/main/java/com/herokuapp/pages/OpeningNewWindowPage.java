package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.tagName;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.automation.elements.HyperLink;

public class OpeningNewWindowPage extends BasePage {

	public Element pageHeading = new Element("Page Heading", tagName("h3"));
	public HyperLink clickHere = new HyperLink("Click here", cssSelector("div.example > a"));

	public void switchToNewWindow() {
		switchToWindow("New Window");
	}

	public void switchToThisWindow() {
		switchToWindowContainingTitle("Opening a new window", "The Internet");
	}

}
