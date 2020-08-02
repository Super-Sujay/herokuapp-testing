package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.tagName;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.automation.elements.HyperLink;

public class SecureFileDownloaderPage extends BasePage {

	public Element pageHeader = new Element("Page Header", tagName("h3"));
	public HyperLink fileLink1 = new HyperLink("File Link 1", cssSelector(".example > a:nth-of-type(1)"));

	public SecureFileDownloaderPage(String username, String password) {
		openUrl("http://" + username + ":" + password + "@the-internet.herokuapp.com/download_secure");
	}

}
