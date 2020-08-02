package com.herokuapp.tests;

import static java.lang.Integer.parseInt;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.SecureFileDownloaderPage;

public class SecureFileDownloaderExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testSecureFileDownloader1(Map<String, String> data) {
		SecureFileDownloaderPage secureFileDownloader = new SecureFileDownloaderPage(data.get("Username"), data.get("Password"));
		assertTrue(secureFileDownloader.pageHeader.isVisible(), "Unable to login with correct credentials");
		assertEquals(secureFileDownloader.fileLink1.httpStatus(), parseInt(data.get("Assertion1")), "Incorrect status");
	}

	@Test(dataProvider = "ExcelDataProvider")
	public void testSecureFileDownloader2(Map<String, String> data) {
		SecureFileDownloaderPage secureFileDownloader = new SecureFileDownloaderPage(data.get("Username"), data.get("Password"));
		assertTrue(secureFileDownloader.pageHeader.isInvisible(), "Logged in with incorrect credentials");
	}

}
