package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Table;
import org.openqa.selenium.By;

public class DataTablesPage extends BasePage {

	public final Table example1 = new Table("Example 1", By.id("table1"));
	public final Table example2 = new Table("Example 1", By.id("table1"));

}
