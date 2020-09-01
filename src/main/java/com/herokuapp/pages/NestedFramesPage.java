package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.openqa.selenium.By;

public class NestedFramesPage extends BasePage {

	public final Element topFrame = new Element("Top Frame", By.name("frame-top"));
	public final Element topLeftFrame = new Element("Top Left Frame", By.name("frame-left"));
	public final Element topMiddleFrame = new Element("Top Middle Frame", By.name("frame-middle"));
	public final Element topRightFrame = new Element("Top Frame", By.name("frame-right"));
	public final Element bottomFrame = new Element("Top Frame", By.name("frame-bottom"));
	public final Element frameText = new Element("Frame Text", By.tagName("body"));

	public void switchToTopFrame() {
		super.switchToFrame(topFrame);
	}

	public void switchToTopLeftFrame() {
		super.switchToFrame(topLeftFrame);
	}

	public void switchToBottomFrame() {
		super.switchToFrame("Bottom Frame", "frame-bottom");
	}

	public void switchToMainFrame() {
		super.switchToDefaultContent("Main Frame");
	}

}
