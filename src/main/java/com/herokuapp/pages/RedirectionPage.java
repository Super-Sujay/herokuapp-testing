package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.HyperLink;
import org.openqa.selenium.By;

public class RedirectionPage extends BasePage {

	public final HyperLink redirect = new HyperLink("Re-direct", By.id("redirect"));

}
