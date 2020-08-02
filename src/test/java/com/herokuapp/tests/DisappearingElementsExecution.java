package com.herokuapp.tests;

import static org.automation.logger.Log.info;
import static org.testng.Assert.assertTrue;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.DisappearingElementsPage;
import com.herokuapp.pages.HomePage;

public class DisappearingElementsExecution extends BaseTest {

	@Test
	public void testDisappearingElements() {
		HomePage home = new HomePage();
		DisappearingElementsPage disappearingElements = home.disappearingElements.click(DisappearingElementsPage.class);
		assertTrue(disappearingElements.home.isVisible(), "Home link is visible");
		assertTrue(disappearingElements.about.isVisible(), "About link is visible");
		assertTrue(disappearingElements.contactUs.isVisible(), "Contact Us link is visible");
		assertTrue(disappearingElements.portfolio.isVisible(), "Portfolio link is visible");
		info("Is Galary visible: " + disappearingElements.gallery.isVisible());
	}

}
