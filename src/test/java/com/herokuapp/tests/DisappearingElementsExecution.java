package com.herokuapp.tests;

import static org.automation.logger.Log.info;

import java.util.Arrays;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.DisappearingElementsPage;
import com.herokuapp.pages.HomePage;

public class DisappearingElementsExecution extends BaseTest {

	@Test
	public void testDisappearingElements() {
		HomePage home = new HomePage();
		DisappearingElementsPage disappearingElements = home.disappearingElements.click(DisappearingElementsPage.class);
		for (int i = 0; i < 10; i++) {
			String[] menuItems = disappearingElements.menuItems.getTextFromAllElements();
			System.out.println("Menu Items: " + Arrays.toString(menuItems));
			info("Is Galary visible: " + Arrays.asList(menuItems).contains("Gallery"));
			disappearingElements.refreshPage();
		}
	}

}
