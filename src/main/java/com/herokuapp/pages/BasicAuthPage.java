package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;

import org.automation.base.BasePage;
import org.automation.elements.Alert;
import org.automation.elements.Element;

public class BasicAuthPage extends BasePage {

	public Alert signIn = new Alert("Sign In");
	public Element message = new Element("Message", cssSelector("div > p"));

	public BasicAuthPage(String username, String password) {
		openUrl("http://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");
	}

}
