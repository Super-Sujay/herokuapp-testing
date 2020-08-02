package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;

import org.automation.base.BasePage;
import org.automation.elements.HyperLink;

public class DynamicLoadingPage extends BasePage {

	public HyperLink example1 = new HyperLink("Example 1", cssSelector("a[href='/dynamic_loading/1']"));
	public HyperLink example2 = new HyperLink("Example 2", cssSelector("a[href='/dynamic_loading/2']"));

}
