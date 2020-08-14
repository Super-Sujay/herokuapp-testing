package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.HyperLink;
import org.openqa.selenium.By;

public class DynamicLoadingPage extends BasePage {

	public final HyperLink example1 = new HyperLink("Example 1", By.cssSelector("a[href='/dynamic_loading/1']"));
	public final HyperLink example2 = new HyperLink("Example 2", By.cssSelector("a[href='/dynamic_loading/2']"));

}
