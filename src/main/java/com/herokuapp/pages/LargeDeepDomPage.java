package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Table;
import static org.openqa.selenium.By.id;

public class LargeDeepDomPage extends BasePage {

	public Table large = new Table("Large", id("large-table"));

}
