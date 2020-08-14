package com.herokuapp.pages;

import static org.automation.config.DriverFactory.getDriver;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.automation.elements.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class SimpleTemplatePage extends BasePage {

	public final Elements paragraphs = new Elements("Paragraphs", By.tagName("my-paragraph"));
	public final Element firstParagraph = new Element("First Paragraph", By.cssSelector("my-paragraph > span"));
	public final Element secondParagraph = new Element("First Paragraph", By.cssSelector("my-paragraph > ul"));

	public String getFirstShadowText() {
		WebElement shadow = expandRootElement(paragraphs.getWebElements().get(0));
		return shadow.findElement(By.tagName("slot")).getText();
	}

	public String getSecondShadowText() {
		WebElement shadow = expandRootElement(paragraphs.getWebElements().get(1));
		return shadow.findElement(By.tagName("slot")).getText();
	}

	private WebElement expandRootElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		return (WebElement) js.executeScript("return arguments[0].shadowRoot", element);
	}

}
