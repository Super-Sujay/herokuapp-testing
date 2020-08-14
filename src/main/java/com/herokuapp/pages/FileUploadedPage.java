package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.openqa.selenium.By;

public class FileUploadedPage extends BasePage {

	public final Element pageHeader = new Element("Page Header", By.cssSelector(".example > h3"));
	public final Element fileName = new Element("File Name", By.id("uploaded-files"));

}
