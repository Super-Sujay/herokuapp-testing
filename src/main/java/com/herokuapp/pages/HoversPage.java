package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;

import org.automation.base.BasePage;
import org.automation.elements.Element;
import org.automation.elements.Image;

public class HoversPage extends BasePage {

	public Image profile1 = new Image("Profile 1", cssSelector("div.figure:nth-of-type(1) > img"));
	public Image profile2 = new Image("Profile 2", cssSelector("div.figure:nth-of-type(2) > img"));
	public Image profile3 = new Image("Profile 3", cssSelector("div.figure:nth-of-type(3) > img"));
	public Element profile1Name = new Element("Profile 1 Name", cssSelector("div.figure:nth-of-type(1) h5"));
	public Element profile2Name = new Element("Profile 2 Name", cssSelector("div.figure:nth-of-type(2) h5"));
	public Element profile3Name = new Element("Profile 3 Name", cssSelector("div.figure:nth-of-type(3) h5"));

}
