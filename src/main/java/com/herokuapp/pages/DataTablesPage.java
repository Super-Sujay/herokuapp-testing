package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Table;
import static org.openqa.selenium.By.id;

public class DataTablesPage extends BasePage {

	public Table example1 = new Table("Example 1", id("table1"));
	public Table example2 = new Table("Example 1", id("table1"));

}
