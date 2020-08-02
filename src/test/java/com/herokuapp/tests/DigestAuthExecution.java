package com.herokuapp.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.DigestAuthPage;

public class DigestAuthExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testDigestAuth1(Map<String, String> data) {
		DigestAuthPage DigestAuth = new DigestAuthPage(data.get("Username"), data.get("Password"));
		assertEquals(DigestAuth.message.getText(), data.get("Assertion1"), "You dont have proper credentials");
	}

	@Test(dataProvider = "ExcelDataProvider")
	public void testDigestAuth2(Map<String, String> data) {
		DigestAuthPage DigestAuth = new DigestAuthPage(data.get("Username"), data.get("Password"));
		assertTrue(DigestAuth.message.isInvisible(), "Logged in using invalid credentials");
	}

}
