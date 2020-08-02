package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;

import org.automation.base.BasePage;
import org.automation.elements.HyperLink;

public class FramesPage extends BasePage {

	public HyperLink nestedFrames = new HyperLink("Nested Frames", cssSelector("a[href='/nested_frames']"));
	public HyperLink iFrame = new HyperLink("iFrame", cssSelector("a[href='/iframe']"));

}
