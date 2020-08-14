package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.openqa.selenium.By;

public class EmailSentPage extends BasePage {

	public final Element emailNotification = new Element("Email Notification", By.id("content"));

}
