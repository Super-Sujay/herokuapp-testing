package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Table;
import org.openqa.selenium.By;

public class ChallengingDomPage extends BasePage {

	public final Table myTable = new Table("My table", By.tagName("table"));

}
