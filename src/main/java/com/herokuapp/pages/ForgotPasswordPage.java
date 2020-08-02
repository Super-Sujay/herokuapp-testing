package com.herokuapp.pages;

import static org.openqa.selenium.By.id;

import org.automation.base.BasePage;
import org.automation.elements.Button;
import org.automation.elements.TextBox;

public class ForgotPasswordPage extends BasePage {

	public TextBox email = new TextBox("E-mail", id("email"));
	public Button retrievePassword = new Button("Retrieve Password", id("form_submit"));

}
