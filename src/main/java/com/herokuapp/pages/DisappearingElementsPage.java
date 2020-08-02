package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.HyperLink;
import static org.openqa.selenium.By.cssSelector;

public class DisappearingElementsPage extends BasePage {

	public HyperLink home = new HyperLink("Home", cssSelector("li:nth-child(1) > a"));
	public HyperLink about = new HyperLink("About", cssSelector("li:nth-child(2) > a"));
	public HyperLink contactUs = new HyperLink("Contact Us", cssSelector("li:nth-child(3) > a"));
	public HyperLink portfolio = new HyperLink("Portfolio", cssSelector("li:nth-child(4) > a"));
	public HyperLink gallery = new HyperLink("Gallery", cssSelector("li:nth-child(5) > a"));

	public void refreshPage() {
		super.refreshPage();
	}

}
