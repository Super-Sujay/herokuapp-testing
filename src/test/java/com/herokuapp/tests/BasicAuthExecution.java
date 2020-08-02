package com.herokuapp.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.BasicAuthPage;

public class BasicAuthExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testBasicAuth1(Map<String, String> data) {
		BasicAuthPage basicAuth = new BasicAuthPage(data.get("Username"), data.get("Password"));
		assertEquals(basicAuth.message.getText(), data.get("Assertion1"), "You dont have proper credentials");
	}

	@Test(dataProvider = "ExcelDataProvider")
	public void testBasicAuth2(Map<String, String> data) {
		BasicAuthPage basicAuth = new BasicAuthPage(data.get("Username"), data.get("Password"));
		assertTrue(basicAuth.message.isInvisible(), "Logged in using invalid credentials");
	}

}
