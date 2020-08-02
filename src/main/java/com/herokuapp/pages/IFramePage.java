package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

import org.automation.base.BasePage;
import org.automation.elements.Button;
import org.automation.elements.TextBox;

public class IFramePage extends BasePage {

	public Button bold = new Button("Bold", cssSelector("div[aria-label='Bold']"));
	public Button italic = new Button("Italic", cssSelector("div[aria-label='Italic']"));
	public TextBox content = new TextBox("Content", id("tinymce"));

	public void switchToMainFrame() {
		switchToDefaultContent("Main Frame");
	}

	public void switchToContentFrame() {
		switchToFrame("Content", "mce_0_ifr");
	}

}
