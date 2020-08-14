package com.herokuapp.pages;

import static org.automation.config.DriverFactory.getDriver;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.openqa.selenium.By;

public class NewWindowPage extends BasePage {

	public final Element pageHeading = new Element("Page Heading", By.tagName("h3"));

	public void closeWindow() {
		getDriver().close();
		switchToParentWindow();
	}

	public void switchToParentWindow() {
		switchToParentWindow("Opening a new window");
	}

	public void switchToThisWindow() {
		switchToWindowContainingTitle("New Window", "New Window");
	}

	public void switchToThisWindow1() {
		switchToWindowContainingUrlText("New Window", "http://the-internet.herokuapp.com/windows/new");
	}

}
