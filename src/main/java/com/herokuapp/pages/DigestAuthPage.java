package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;

import org.automation.base.BasePage;
import org.automation.elements.Element;

public class DigestAuthPage extends BasePage {

	public Element message = new Element("Message", cssSelector("div > p"));

	public DigestAuthPage(String username, String password) {
		openUrl("http://" + username + ":" + password + "@the-internet.herokuapp.com/digest_auth");
	}

}
