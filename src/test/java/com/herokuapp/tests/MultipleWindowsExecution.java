package com.herokuapp.tests;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.NewWindowPage;
import com.herokuapp.pages.OpeningNewWindowPage;

public class MultipleWindowsExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testMultipleWindows(Map<String, String> data) {
		HomePage home = new HomePage();
		OpeningNewWindowPage openingNewWindow = home.multipleWindows.click(OpeningNewWindowPage.class);
		NewWindowPage newWindow = openingNewWindow.clickHere.click(NewWindowPage.class);
		openingNewWindow.switchToNewWindow();
		assertEquals(newWindow.pageHeading.getText(), data.get("Assertion1"), "Incorrect Window");
		openingNewWindow.switchToThisWindow();
		assertEquals(openingNewWindow.pageHeading.getText(), data.get("Assertion2"), "Incorrect Window");
		newWindow.switchToThisWindow();
		assertEquals(newWindow.pageHeading.getText(), data.get("Assertion3"), "Incorrect Window");
		openingNewWindow.switchToThisWindow();
		assertEquals(openingNewWindow.pageHeading.getText(), data.get("Assertion4"), "Incorrect Window");
		newWindow.switchToThisWindow1();
		assertEquals(newWindow.pageHeading.getText(), data.get("Assertion5"), "Incorrect Window");
		newWindow.closeWindow();
	}

}
