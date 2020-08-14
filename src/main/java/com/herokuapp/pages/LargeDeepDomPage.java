package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Table;
import org.openqa.selenium.By;

public class LargeDeepDomPage extends BasePage {

	public final Table large = new Table("Large", By.id("large-table"));

}
