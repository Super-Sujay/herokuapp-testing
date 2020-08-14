package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Alert;
import org.automation.elements.Button;
import org.automation.elements.Element;
import org.openqa.selenium.By;

public class JavaScripAlertsPage extends BasePage {

	public final Alert javaScript = new Alert("Java Script");
	public final Button jsAlert = new Button("Click for JS Alert", By.cssSelector("li:nth-child(1) > button"));
	public final Button jsConfirm = new Button("Click for JS Confirm", By.cssSelector("li:nth-child(2) > button"));
	public final Button jsPrompt = new Button("Click for JS Prompt", By.cssSelector("li:nth-child(3) > button"));
	public final Element result = new Element("Result", By.id("result"));

}
