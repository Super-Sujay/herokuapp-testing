package com.herokuapp.tests;

import static org.testng.Assert.assertTrue;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.DynamicLoadingExample1Page;
import com.herokuapp.pages.DynamicLoadingExample2Page;
import com.herokuapp.pages.DynamicLoadingPage;
import com.herokuapp.pages.HomePage;

public class DynamicLoadingExecution extends BaseTest {

	@Test
	public void testDynamicLoading1() {
		HomePage home = new HomePage();
		DynamicLoadingPage dynamicLoading = home.dynamicLoading.click(DynamicLoadingPage.class);
		DynamicLoadingExample1Page dynamicLoadingExample1 = dynamicLoading.example1.click(DynamicLoadingExample1Page.class);
		assertTrue(dynamicLoadingExample1.finishText.isInvisible(), "Finish text is visible");
		dynamicLoadingExample1.start.click();
		assertTrue(dynamicLoadingExample1.finishText.isVisible(), "Finish text is not visible");
	}

	@Test
	public void testDynamicLoading2() {
		HomePage home = new HomePage();
		DynamicLoadingPage dynamicLoading = home.dynamicLoading.click(DynamicLoadingPage.class);
		DynamicLoadingExample2Page dynamicLoadingExample2 = dynamicLoading.example2.click(DynamicLoadingExample2Page.class);
		assertTrue(dynamicLoadingExample2.finishText.isInvisible(), "Finish text is visible");
		dynamicLoadingExample2.start.click();
		assertTrue(dynamicLoadingExample2.finishText.isVisible(), "Finish text is not visible");
	}

}
