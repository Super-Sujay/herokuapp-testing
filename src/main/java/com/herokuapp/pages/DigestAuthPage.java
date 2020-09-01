package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.openqa.selenium.By;

public class DigestAuthPage extends BasePage {

	public final Element message = new Element("Message", By.cssSelector("div > p"));

	public DigestAuthPage(String username, String password) {
		super.openUrl("http://" + username + ":" + password + "@the-internet.herokuapp.com/digest_auth");
	}

}
