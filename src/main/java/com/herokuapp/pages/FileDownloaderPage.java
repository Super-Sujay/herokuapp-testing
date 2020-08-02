package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.HyperLink;
import static org.openqa.selenium.By.cssSelector;

public class FileDownloaderPage extends BasePage {

	public HyperLink fileLink1 = new HyperLink("File Link 1", cssSelector(".example > a:nth-of-type(1)"));

}
