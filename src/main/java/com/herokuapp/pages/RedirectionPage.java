package com.herokuapp.pages;

import static org.openqa.selenium.By.id;

import org.automation.base.BasePage;
import org.automation.elements.HyperLink;

public class RedirectionPage extends BasePage {

	public HyperLink redirect = new HyperLink("Re-direct", id("redirect"));

}
