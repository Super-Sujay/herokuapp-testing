package com.herokuapp.tests;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.DragDropPage;
import com.herokuapp.pages.HomePage;

public class DragDropExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testDragDrop(Map<String, String> data) {
		HomePage home = new HomePage();
		DragDropPage dragDrop = home.dragAndDrop.click(DragDropPage.class);
		assertEquals(dragDrop.boxA.getText(), data.get("Assertion1"), "Incorrect box A");
		assertEquals(dragDrop.boxB.getText(), data.get("Assertion2"), "Incorrect box B");
		dragDrop.boxA.dragToUsingJs(dragDrop.boxB);
		assertEquals(dragDrop.boxA.getText(), data.get("Assertion3"), "Incorrect box A");
		assertEquals(dragDrop.boxB.getText(), data.get("Assertion4"), "Incorrect box B");
	}

}
