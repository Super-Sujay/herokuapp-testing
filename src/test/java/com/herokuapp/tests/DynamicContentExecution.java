package com.herokuapp.tests;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.DynamicContentPage;
import com.herokuapp.pages.HomePage;

public class DynamicContentExecution extends BaseTest {

	@Test
	public void testDynamicContent() {
		HomePage home = new HomePage();
		DynamicContentPage dynamicContent = home.dynamicContent.click(DynamicContentPage.class);
		String[] allText = dynamicContent.dynamicText.getTextFromAllElements();
		for (String text : allText) System.out.println(text);
		dynamicContent = dynamicContent.clickHere.click(DynamicContentPage.class);
		allText = dynamicContent.dynamicText.getTextFromAllElements();
		for (String text : allText) System.out.println(text);
	}

}
