package com.herokuapp.pages;

import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;

import org.automation.base.BasePage;
import org.automation.elements.Button;
import org.automation.elements.Element;
import org.automation.elements.TextBox;

public class LoginPage extends BasePage {

	public TextBox username = new TextBox("Username", id("username"));
	public TextBox password = new TextBox("Password", id("password"));
	public Button loginButton = new Button("Login", className("radius"));
	public Element message = new Element("Message", id("flash"));

}
