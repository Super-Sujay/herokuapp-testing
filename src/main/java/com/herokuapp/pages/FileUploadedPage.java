package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

import org.automation.base.BasePage;
import org.automation.elements.Element;

public class FileUploadedPage extends BasePage {

	public Element pageHeader = new Element("Page Header", cssSelector(".example > h3"));
	public Element fileName = new Element("File Name", id("uploaded-files"));

}
