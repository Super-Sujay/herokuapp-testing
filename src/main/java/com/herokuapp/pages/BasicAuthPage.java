package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Alert;
import org.automation.elements.Element;
import org.openqa.selenium.By;

public class BasicAuthPage extends BasePage {

	public final Alert signIn = new Alert("Sign In");
	public final Element message = new Element("Message", By.cssSelector("div > p"));

	public BasicAuthPage(String username, String password) {
		super.openUrl("http://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");
	}

}
