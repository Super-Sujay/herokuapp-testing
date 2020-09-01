package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Button;
import org.automation.elements.TextBox;
import org.openqa.selenium.By;

public class IFramePage extends BasePage {

	public final Button bold = new Button("Bold", By.cssSelector("div[aria-label='Bold']"));
	public final Button italic = new Button("Italic", By.cssSelector("div[aria-label='Italic']"));
	public final TextBox content = new TextBox("Content", By.id("tinymce"));

	public void switchToMainFrame() {
		super.switchToDefaultContent("Main Frame");
	}

	public void switchToContentFrame() {
		super.switchToFrame("Content", "mce_0_ifr");
	}

}
