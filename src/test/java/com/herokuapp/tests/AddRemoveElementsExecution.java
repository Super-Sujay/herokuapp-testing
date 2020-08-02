package com.herokuapp.tests;

import static org.testng.Assert.assertTrue;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.AddRemoveElementsPage;
import com.herokuapp.pages.HomePage;

public class AddRemoveElementsExecution extends BaseTest {

	@Test
	public void testAddRemoveElements() {
		HomePage home = new HomePage();
		AddRemoveElementsPage addRemoveElements = home.addRemoveElements.click(AddRemoveElementsPage.class);
		addRemoveElements.addElement.click();
		assertTrue(addRemoveElements.delete.isVisible(), "Delete Button did not appear");
		addRemoveElements.delete.click();
		assertTrue(addRemoveElements.delete.isInvisible(), "Delete Button did not disappear");
	}

}
