package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.automation.elements.HyperLink;
import org.openqa.selenium.By;

public class EntryAdPage extends BasePage {

	public final Element modelWindow = new Element("Model Window", By.id("modal"));
	public final Element modelWindowText = new Element("Model Window", By.cssSelector("div.modal-body > p"));
	public final HyperLink close = new HyperLink("Close", By.cssSelector("div.modal-footer > p"));

}
