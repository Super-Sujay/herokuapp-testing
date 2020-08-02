package com.herokuapp.tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.DynamicControlsPage;
import com.herokuapp.pages.HomePage;

public class DynamicControlsExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testDynamicControls(Map<String, String> data) {
		HomePage home = new HomePage();
		DynamicControlsPage dynamicControls = home.dynamicControls.click(DynamicControlsPage.class);
		assertTrue(dynamicControls.aCheckbox.isVisible(), "Checkbox is not visible");
		assertFalse(dynamicControls.aCheckbox.isChecked(), "Checkbox is checked");
		dynamicControls.addRemove.click();
		assertTrue(dynamicControls.aCheckbox.isInvisible(), "Checkbox is visible");
		dynamicControls.addRemove.click();
		dynamicControls.aCheckbox.check();
		assertTrue(dynamicControls.aCheckbox.isChecked(), "Checkbox is not checked");
		assertTrue(dynamicControls.text.isDisabled(), "Text box is not disabled");
		dynamicControls.enableDisable.click();
		assertTrue(dynamicControls.text.isEnabled(), "Text box is not enabled");
		dynamicControls.text.enterText(data.get("Text"));
		dynamicControls.enableDisable.click();
		assertTrue(dynamicControls.text.isDisabled(), "Text box is not disabled");
	}

}
