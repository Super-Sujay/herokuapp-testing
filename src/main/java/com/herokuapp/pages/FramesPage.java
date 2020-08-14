package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.HyperLink;
import org.openqa.selenium.By;

public class FramesPage extends BasePage {

	public final HyperLink nestedFrames = new HyperLink("Nested Frames", By.cssSelector("a[href='/nested_frames']"));
	public final HyperLink iFrame = new HyperLink("iFrame", By.cssSelector("a[href='/iframe']"));

}
