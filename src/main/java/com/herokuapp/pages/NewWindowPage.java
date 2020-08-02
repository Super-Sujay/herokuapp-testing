package com.herokuapp.pages;

import static org.openqa.selenium.By.tagName;
import static org.automation.config.DriverFactory.getDriver;

import org.automation.base.BasePage;
import org.automation.elements.Element;

public class NewWindowPage extends BasePage {

	public Element pageHeading = new Element("Page Heading", tagName("h3"));

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
