package com.herokuapp.tests;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.ContextMenuPage;
import com.herokuapp.pages.HomePage;

public class ContextMenuExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testContextMenu(Map<String, String> data) {
		HomePage home = new HomePage();
		ContextMenuPage contextMenu = home.contextMenu.click(ContextMenuPage.class);
		contextMenu.box.rightClick();
		assertEquals(contextMenu.contextAlert.getText(), data.get("Assertion1"), "Incorrect context alert text");
		contextMenu.contextAlert.accept();
	}

}
