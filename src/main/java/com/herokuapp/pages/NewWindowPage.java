package com.herokuapp.pages;

import static org.automation.config.DriverFactory.getDriver;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.openqa.selenium.By;

public class NewWindowPage extends BasePage {

	public final Element pageHeading = new Element("Page Heading", By.tagName("h3"));

	public void closeWindow() {
		getDriver().close();
		this.switchToParentWindow();
	}

	public void switchToParentWindow() {
		super.switchToParentWindow("Opening a new window");
	}

	public void switchToThisWindow() {
		super.switchToWindowContainingTitle("New Window", "New Window");
	}

	public void switchToThisWindow1() {
		super.switchToWindowContainingUrlText("New Window", "http://the-internet.herokuapp.com/windows/new");
	}

}
