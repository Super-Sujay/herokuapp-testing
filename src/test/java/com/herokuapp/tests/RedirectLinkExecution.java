package com.herokuapp.tests;

import static java.lang.Integer.parseInt;
import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.RedirectionPage;
import com.herokuapp.pages.StatusCodesPage;

public class RedirectLinkExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testRedirectLink(Map<String, String> data) {
		HomePage home = new HomePage();
		RedirectionPage redirection = home.redirectLink.click(RedirectionPage.class);
		StatusCodesPage statusCodes = redirection.redirect.click(StatusCodesPage.class);
		assertEquals(statusCodes.code200.httpStatus(), parseInt(data.get("Assertion1")), "Incorrect status code");
		// assertEquals(statusCodes.code301.httpStatus(), parseInt(data.get("Assertion2")), "Incorrect status code");
		assertEquals(statusCodes.code404.httpStatus(), parseInt(data.get("Assertion3")), "Incorrect status code");
		assertEquals(statusCodes.code500.httpStatus(), parseInt(data.get("Assertion4")), "Incorrect status code");
	}

}
