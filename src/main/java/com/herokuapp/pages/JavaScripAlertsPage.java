package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

import org.automation.base.BasePage;
import org.automation.elements.Alert;
import org.automation.elements.Button;
import org.automation.elements.Element;

public class JavaScripAlertsPage extends BasePage {

	public Alert javaScript = new Alert("Java Script");
	public Button jsAlert = new Button("Click for JS Alert", cssSelector("li:nth-child(1) > button"));
	public Button jsConfirm = new Button("Click for JS Confirm", cssSelector("li:nth-child(2) > button"));
	public Button jsPrompt = new Button("Click for JS Prompt", cssSelector("li:nth-child(3) > button"));
	public Element result = new Element("Result", id("result"));

}
