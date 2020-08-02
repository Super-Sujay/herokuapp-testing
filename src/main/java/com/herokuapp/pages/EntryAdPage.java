package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.automation.elements.HyperLink;

public class EntryAdPage extends BasePage {

	public Element modelWindow = new Element("Model Window", id("modal"));
	public Element modelWindowText = new Element("Model Window", cssSelector("div.modal-body > p"));
	public HyperLink close = new HyperLink("Close", cssSelector("div.modal-footer > p"));

}
