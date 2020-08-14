package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.automation.elements.HyperLink;
import org.openqa.selenium.By;

public class SecureFileDownloaderPage extends BasePage {

	public final Element pageHeader = new Element("Page Header", By.tagName("h3"));
	public final HyperLink fileLink1 = new HyperLink("File Link 1", By.cssSelector(".example > a:nth-of-type(1)"));

	public SecureFileDownloaderPage(String username, String password) {
		openUrl("http://" + username + ":" + password + "@the-internet.herokuapp.com/download_secure");
	}

}
