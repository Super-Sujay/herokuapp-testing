package com.herokuapp.pages;

import static org.openqa.selenium.By.tagName;

import org.automation.base.BasePage;
import org.automation.elements.Table;

public class ChallengingDomPage extends BasePage {

	public Table myTable = new Table("My table", tagName("table"));

}
