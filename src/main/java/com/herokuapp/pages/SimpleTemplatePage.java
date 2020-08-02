package com.herokuapp.pages;

import static org.automation.config.DriverFactory.getDriver;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.tagName;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.automation.elements.Elements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class SimpleTemplatePage extends BasePage {

	public Elements paragraphs = new Elements("Paragraphs", tagName("my-paragraph"));
	public Element firstParagraph = new Element("First Paragraph", cssSelector("my-paragraph > span"));
	public Element secondParagraph = new Element("First Paragraph", cssSelector("my-paragraph > ul"));

	public String getFirstShadowText() {
		WebElement shadow = expandRootElement(paragraphs.getWebElements().get(0));
		return shadow.findElement(tagName("slot")).getText();
	}

	public String getSecondShadowText() {
		WebElement shadow = expandRootElement(paragraphs.getWebElements().get(1));
		return shadow.findElement(tagName("slot")).getText();
	}

	private WebElement expandRootElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		return (WebElement) js.executeScript("return arguments[0].shadowRoot", element);
	}

}
