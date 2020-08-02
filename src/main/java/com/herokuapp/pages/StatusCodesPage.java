package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;

import org.automation.base.BasePage;
import org.automation.elements.HyperLink;

public class StatusCodesPage extends BasePage {

	public HyperLink code200 = new HyperLink("Status Code 200", cssSelector("li:nth-child(1) > a"));
	public HyperLink code301 = new HyperLink("Status Code 301", cssSelector("li:nth-child(2) > a"));
	public HyperLink code404 = new HyperLink("Status Code 404", cssSelector("li:nth-child(3) > a"));
	public HyperLink code500 = new HyperLink("Status Code 500", cssSelector("li:nth-child(4) > a"));

}
