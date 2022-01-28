package com.herokuapp.tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.CheckboxesPage;
import com.herokuapp.pages.HomePage;

public class CheckboxesExecution extends BaseTest {

	@Test
	public void testCheckboxes() {
		HomePage home = new HomePage();
		CheckboxesPage checkboxes = home.checkBoxes.click(CheckboxesPage.class);
		assertFalse(checkboxes.checkbox1.isChecked(), "Checkbox 1 is checked");
		assertTrue(checkboxes.checkbox2.isChecked(), "Checkbox2 is not checked");
		checkboxes.checkbox1.check();
		checkboxes.checkbox2.check();
		assertTrue(checkboxes.checkbox1.isChecked(), "Checkbox1 is not checked");
		assertTrue(checkboxes.checkbox2.isChecked(), "Checkbox2 is not checked");
		checkboxes.checkbox1.uncheck();
		checkboxes.checkbox2.uncheck();
		assertFalse(checkboxes.checkbox1.isChecked(), "Checkbox1 is checked");
		assertFalse(checkboxes.checkbox2.isChecked(), "Checkbox2 is checked");
		checkboxes.checkbox1.check();
		assertTrue(checkboxes.checkbox1.isChecked(), "Checkbox1 is not checked");
		assertFalse(checkboxes.checkbox2.isChecked(), "Checkbox2 is checked");
	}

}
