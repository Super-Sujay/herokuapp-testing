package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.automation.elements.HyperLink;
import org.openqa.selenium.By;

public class NotificationMessagePage extends BasePage {

	public final Element message = new Element("Message", By.id("flash"));
	public final HyperLink clickHere = new HyperLink("Click here", By.cssSelector("p > a"));

}
