package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Button;
import org.automation.elements.TextBox;
import org.openqa.selenium.By;

public class FileUploaderPage extends BasePage {

	public final TextBox choseFile = new TextBox("Chose File", By.id("file-upload"));
	public final Button upload = new Button("Upload", By.id("file-submit"));

}
