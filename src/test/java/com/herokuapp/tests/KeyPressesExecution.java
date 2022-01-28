package com.herokuapp.tests;

import static org.testng.Assert.assertEquals;
import static java.lang.String.valueOf;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.KeyPressesPage;

public class KeyPressesExecution extends BaseTest {

	@Test
	public void testKeyPresses() {
		HomePage home = new HomePage();
		KeyPressesPage keyPresses = home.keyPresses.click(KeyPressesPage.class);
		for (char alphabet = 65; alphabet <= 90; alphabet++) {
			keyPresses.target.enterText(valueOf(alphabet));
			assertEquals(keyPresses.result.getText(), "You entered: " + alphabet);
		}
	}

}
