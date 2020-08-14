package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.HyperLink;
import org.openqa.selenium.By;

public class ShiftingContentPage extends BasePage {

	public final HyperLink menuElement = new HyperLink("Menu Element", By.cssSelector("div.example > a:nth-of-type(1)"));
	public final HyperLink anImage = new HyperLink("An image", By.cssSelector("div.example > a:nth-of-type(2)"));
	public final HyperLink list = new HyperLink("List", By.cssSelector("div.example > a:nth-of-type(3)"));

}
