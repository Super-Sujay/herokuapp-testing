package com.herokuapp.tests;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.SimpleTemplatePage;

public class ShadowDomExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider", groups = "Ignore")
	public void testShadowDom(Map<String, String> data) {
		HomePage home = new HomePage();
		SimpleTemplatePage simpleTemplate = home.shadowDom.click(SimpleTemplatePage.class);
		assertEquals(simpleTemplate.firstParagraph.getText(), data.get("Assertion1"), "Incorrect first paragraph text");
		assertEquals(simpleTemplate.getFirstShadowText(), data.get("Assertion2"), "Incorrect first shadow text");
		assertEquals(simpleTemplate.getSecondShadowText(), data.get("Assertion3"), "Incorrect second shadow text");
	}

}
