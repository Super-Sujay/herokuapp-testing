package com.herokuapp.pages;

import static org.openqa.selenium.By.id;

import org.automation.base.BasePage;
import org.automation.elements.Button;
import org.automation.elements.TextBox;

public class FileUploaderPage extends BasePage {

	public TextBox choseFile = new TextBox("Chose File", id("file-upload"));
	public Button upload = new Button("Upload", id("file-submit"));

}
