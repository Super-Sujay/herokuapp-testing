package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.automation.elements.Image;
import org.openqa.selenium.By;

public class HoversPage extends BasePage {

	public final Image profile1 = new Image("Profile 1", By.cssSelector("div.figure:nth-of-type(1) > img"));
	public final Image profile2 = new Image("Profile 2", By.cssSelector("div.figure:nth-of-type(2) > img"));
	public final Image profile3 = new Image("Profile 3", By.cssSelector("div.figure:nth-of-type(3) > img"));
	public final Element profile1Name = new Element("Profile 1 Name", By.cssSelector("div.figure:nth-of-type(1) h5"));
	public final Element profile2Name = new Element("Profile 2 Name", By.cssSelector("div.figure:nth-of-type(2) h5"));
	public final Element profile3Name = new Element("Profile 3 Name", By.cssSelector("div.figure:nth-of-type(3) h5"));

}
