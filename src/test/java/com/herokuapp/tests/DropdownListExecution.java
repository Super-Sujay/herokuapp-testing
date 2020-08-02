package com.herokuapp.tests;

import static java.lang.Integer.parseInt;
import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.DropdownListPage;
import com.herokuapp.pages.HomePage;

public class DropdownListExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testDropdownList(Map<String, String> data) {
		HomePage home = new HomePage();
		DropdownListPage dropdownList = home.dropdown.click(DropdownListPage.class);
		assertEquals(dropdownList.option.getNumberOfOptions(), parseInt(data.get("Assertion1")), "Incorrect number of options");
		String[] dropdownOptions = data.get("Dropdown Options").split(";");
		assertEquals(dropdownList.option.getAllOptions(), dropdownOptions, "Incorrect dropdown options");
		dropdownList.option.selectByIndex(parseInt(data.get("Dropdown Index")));
		assertEquals(dropdownList.option.getSelectedOption(), data.get("Assertion2"), "Incorrect option selected from dropdown");
		dropdownList.option.selectByValue(data.get("Dropdown Value"));
		assertEquals(dropdownList.option.getSelectedOption(), data.get("Assertion3"), "Incorrect option selected from dropdown");
		dropdownList.option.selectByVisibleText(data.get("Dropdown Visible Text"));
		assertEquals(dropdownList.option.getSelectedOption(), data.get("Assertion4"), "Incorrect option selected from dropdown");
	}

}
