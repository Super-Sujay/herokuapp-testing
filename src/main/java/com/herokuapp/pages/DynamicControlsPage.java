package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Button;
import org.automation.elements.CheckBox;
import org.automation.elements.TextBox;
import org.openqa.selenium.By;

public class DynamicControlsPage extends BasePage {

	public final CheckBox aCheckbox = new CheckBox("A checkbox", By.cssSelector("#checkbox-example input"));
	public final Button addRemove = new Button("Add/Remove", By.cssSelector("button[onclick='swapCheckbox()']"));
	public final Button enableDisable = new Button("Enable/Disable", By.cssSelector("button[onclick='swapInput()']"));
	public final TextBox text = new TextBox("Text", By.cssSelector("form#input-example input"));

}
