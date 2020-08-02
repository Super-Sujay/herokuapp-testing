package com.herokuapp.pages;

import static org.openqa.selenium.By.name;
import static org.openqa.selenium.By.tagName;

import org.automation.base.BasePage;
import org.automation.elements.Element;

public class NestedFramesPage extends BasePage {

	public Element topFrame = new Element("Top Frame", name("frame-top"));
	public Element topLeftFrame = new Element("Top Left Frame", name("frame-left"));
	public Element topMiddleFrame = new Element("Top Middle Frame", name("frame-middle"));
	public Element topRightFrame = new Element("Top Frame", name("frame-right"));
	public Element bottomFrame = new Element("Top Frame", name("frame-bottom"));
	public Element frameText = new Element("Frame Text", tagName("body"));

	public void switchToTopFrame() {
		switchToFrame(topFrame);
	}

	public void switchToTopLeftFrame() {
		switchToFrame(topLeftFrame);
	}

	public void switchToBottomFrame() {
		switchToFrame("Bottom Frame", "frame-bottom");
	}

	public void switchToMainFrame() {
		switchToDefaultContent("Main Frame");
	}

}
