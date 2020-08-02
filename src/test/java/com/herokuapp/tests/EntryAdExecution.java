package com.herokuapp.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.EntryAdPage;
import com.herokuapp.pages.HomePage;

public class EntryAdExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testEntryAd(Map<String, String> data) {
		HomePage home = new HomePage();
		EntryAdPage entryAd = home.entryAd.click(EntryAdPage.class);
		assertEquals(entryAd.modelWindowText.getText(), data.get("Text"), "Incorrect model window text");
		entryAd.close.click();
		assertTrue(entryAd.modelWindow.isInvisible(), "Model window is still visible");
	}

}
