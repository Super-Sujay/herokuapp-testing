package com.herokuapp.pages;

import static org.openqa.selenium.By.id;

import org.automation.base.BasePage;
import org.automation.elements.Element;

public class EmailSentPage extends BasePage {

	public Element emailNotification = new Element("Email Notification", id("content"));

}
