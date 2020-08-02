package com.herokuapp.tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.BrokenImagesPage;
import com.herokuapp.pages.HomePage;

public class BrokenImagesExecution extends BaseTest {

	@Test
	public void testBrokenImages() {
		HomePage home = new HomePage();
		BrokenImagesPage brokenImages = home.brokenImages.click(BrokenImagesPage.class);
		assertFalse(brokenImages.profile1.isAvailable(), "Profile 1 image is available");
		assertFalse(brokenImages.profile2.isAvailable(), "Profile 2 image is available");
		assertTrue(brokenImages.profile3.isAvailable(), "Profile 3 image is not available");
	}

}
