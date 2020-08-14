package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.HyperLink;
import org.openqa.selenium.By;

public class FileDownloaderPage extends BasePage {

	public final HyperLink fileLink1 = new HyperLink("File Link 1", By.cssSelector(".example > a:nth-of-type(1)"));

}
