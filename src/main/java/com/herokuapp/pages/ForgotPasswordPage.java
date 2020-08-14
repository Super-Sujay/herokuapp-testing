package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Button;
import org.automation.elements.TextBox;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends BasePage {

	public final TextBox email = new TextBox("E-mail", By.id("email"));
	public final Button retrievePassword = new Button("Retrieve Password", By.id("form_submit"));

}
