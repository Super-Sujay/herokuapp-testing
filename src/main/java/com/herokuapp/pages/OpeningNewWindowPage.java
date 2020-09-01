package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.automation.elements.HyperLink;
import org.openqa.selenium.By;

public class OpeningNewWindowPage extends BasePage {

	public final Element pageHeading = new Element("Page Heading", By.tagName("h3"));
	public final HyperLink clickHere = new HyperLink("Click here", By.cssSelector("div.example > a"));

	public void switchToNewWindow() {
		super.switchToWindow("New Window");
	}

	public void switchToThisWindow() {
		super.switchToWindowContainingTitle("Opening a new window", "The Internet");
	}

}
