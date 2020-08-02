package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;

import org.automation.base.BasePage;
import org.automation.elements.Image;

public class BrokenImagesPage extends BasePage {

	public Image profile1 = new Image("Profile 1", cssSelector("img:nth-child(2)"));
	public Image profile2 = new Image("Profile 2", cssSelector("img:nth-child(3)"));
	public Image profile3 = new Image("Profile 3", cssSelector("img:nth-child(4)"));

}
