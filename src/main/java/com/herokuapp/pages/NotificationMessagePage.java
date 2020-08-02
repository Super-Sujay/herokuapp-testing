package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.automation.elements.HyperLink;

public class NotificationMessagePage extends BasePage {

	public Element message = new Element("Message", id("flash"));
	public HyperLink clickHere = new HyperLink("Click here", cssSelector("p > a"));

}
