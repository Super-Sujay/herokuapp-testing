package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Elements;
import org.automation.elements.HyperLink;
import org.openqa.selenium.By;

public class DynamicContentPage extends BasePage {

	public final HyperLink clickHere = new HyperLink("Click Here", By.cssSelector("p > a"));
	public final Elements dynamicText = new Elements("Dynamic Text", By.cssSelector("#content.large-10 .large-10"));

}
