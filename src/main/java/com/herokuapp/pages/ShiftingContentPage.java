package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;

import org.automation.base.BasePage;
import org.automation.elements.HyperLink;

public class ShiftingContentPage extends BasePage {

	public HyperLink menuElement = new HyperLink("Menu Element", cssSelector("div.example > a:nth-of-type(1)"));
	public HyperLink anImage = new HyperLink("An image", cssSelector("div.example > a:nth-of-type(2)"));
	public HyperLink list = new HyperLink("List", cssSelector("div.example > a:nth-of-type(3)"));

}
