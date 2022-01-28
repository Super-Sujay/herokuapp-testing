package com.herokuapp.tests;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.HoversPage;

public class HoversExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testHovers(Map<String, String> data) {
		HomePage home = new HomePage();
		HoversPage hovers = home.hovers.click(HoversPage.class);
		hovers.profile1.moveMousePointer();
		assertEquals(hovers.profile1Name.getText(), data.get("Assertion1"), "Incorrect Profile Name");
		hovers.profile2.moveMousePointer();
		assertEquals(hovers.profile2Name.getText(), data.get("Assertion2"), "Incorrect Profile Name");
		hovers.profile3.moveMousePointer();
		assertEquals(hovers.profile3Name.getText(), data.get("Assertion3"), "Incorrect Profile Name");
	}

}
