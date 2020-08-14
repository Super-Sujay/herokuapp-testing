package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Elements;
import org.automation.elements.HyperLink;
import org.openqa.selenium.By;

public class DisappearingElementsPage extends BasePage {

	public final Elements menuItems = new Elements("Menu Items", By.cssSelector("li > a"));
	public final HyperLink home = new HyperLink("Home", By.cssSelector("li:nth-child(1) > a"));
	public final HyperLink about = new HyperLink("About", By.cssSelector("li:nth-child(2) > a"));
	public final HyperLink contactUs = new HyperLink("Contact Us", By.cssSelector("li:nth-child(3) > a"));
	public final HyperLink portfolio = new HyperLink("Portfolio", By.cssSelector("li:nth-child(4) > a"));
	public final HyperLink gallery = new HyperLink("Gallery", By.cssSelector("li:nth-child(5) > a"));

	public void refreshPage() {
		super.refreshPage();
	}

}
