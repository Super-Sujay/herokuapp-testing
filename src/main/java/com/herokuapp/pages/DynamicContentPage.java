package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;

import org.automation.base.BasePage;
import org.automation.elements.Elements;
import org.automation.elements.HyperLink;

public class DynamicContentPage extends BasePage {

	public HyperLink clickHere = new HyperLink("Click Here", cssSelector("p > a"));
	public Elements dynamicText = new Elements("Dynamic Text", cssSelector("#content.large-10 .large-10"));

}
