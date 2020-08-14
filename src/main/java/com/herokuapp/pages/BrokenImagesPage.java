package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Image;
import org.openqa.selenium.By;

public class BrokenImagesPage extends BasePage {

	public final Image profile1 = new Image("Profile 1", By.cssSelector("img:nth-child(2)"));
	public final Image profile2 = new Image("Profile 2", By.cssSelector("img:nth-child(3)"));
	public final Image profile3 = new Image("Profile 3", By.cssSelector("img:nth-child(4)"));

}
