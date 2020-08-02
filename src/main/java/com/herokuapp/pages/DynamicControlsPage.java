package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;

import org.automation.base.BasePage;
import org.automation.elements.Button;
import org.automation.elements.CheckBox;
import org.automation.elements.TextBox;

public class DynamicControlsPage extends BasePage {

	public CheckBox aCheckbox = new CheckBox("A checkbox", cssSelector("#checkbox-example input"));
	public Button addRemove = new Button("Add/Remove", cssSelector("button[onclick='swapCheckbox()']"));
	public Button enableDisable = new Button("Enable/Disable", cssSelector("button[onclick='swapInput()']"));
	public TextBox text = new TextBox("Text", cssSelector("form#input-example input"));

}
