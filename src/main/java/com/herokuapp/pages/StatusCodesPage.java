package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.HyperLink;
import org.openqa.selenium.By;

public class StatusCodesPage extends BasePage {

	public final HyperLink code200 = new HyperLink("Status Code 200", By.cssSelector("li:nth-child(1) > a"));
	public final HyperLink code301 = new HyperLink("Status Code 301", By.cssSelector("li:nth-child(2) > a"));
	public final HyperLink code404 = new HyperLink("Status Code 404", By.cssSelector("li:nth-child(3) > a"));
	public final HyperLink code500 = new HyperLink("Status Code 500", By.cssSelector("li:nth-child(4) > a"));

}
