package com.herokuapp.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.JavaScripAlertsPage;

public class JavaScripAlertsExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testJavaScripAlerts(Map<String, String> data) {
		HomePage home = new HomePage();
		JavaScripAlertsPage javaScripAlerts = home.javaScriptAlerts.click(JavaScripAlertsPage.class);
		javaScripAlerts.jsAlert.click();
		assertTrue(javaScripAlerts.javaScript.isPresent(), "Alert is not present");
		assertEquals(javaScripAlerts.javaScript.getText(), data.get("Assertion1"), "Incorrect alert text");
		javaScripAlerts.javaScript.accept();
		assertEquals(javaScripAlerts.result.getText(), data.get("Assertion2"), "Incorrect result message");
		javaScripAlerts.jsConfirm.click();
		assertTrue(javaScripAlerts.javaScript.isPresent(), "Alert is not present");
		assertEquals(javaScripAlerts.javaScript.getText(), data.get("Assertion3"), "Incorrect alert text");
		javaScripAlerts.javaScript.dismiss();
		assertEquals(javaScripAlerts.result.getText(), data.get("Assertion4"), "Incorrect result message");
		javaScripAlerts.jsPrompt.click();
		assertTrue(javaScripAlerts.javaScript.isPresent(), "Alert is not present");
		assertEquals(javaScripAlerts.javaScript.getText(), data.get("Assertion5"), "Incorrect alert text");
		javaScripAlerts.javaScript.enterText(data.get("Text"));
		javaScripAlerts.javaScript.accept();
		assertEquals(javaScripAlerts.result.getText(), "You entered: " + data.get("Text"), "Incorrect result message");
	}

}
