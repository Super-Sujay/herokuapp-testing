package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Button;
import org.automation.elements.Element;
import org.automation.elements.TextBox;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

	public final TextBox username = new TextBox("Username", By.id("username"));
	public final TextBox password = new TextBox("Password", By.id("password"));
	public final Button loginButton = new Button("Login", By.className("radius"));
	public final Element message = new Element("Message", By.id("flash"));

}
