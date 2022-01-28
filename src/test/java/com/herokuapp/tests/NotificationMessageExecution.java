package com.herokuapp.tests;

import static org.testng.Assert.assertTrue;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.NotificationMessagePage;

public class NotificationMessageExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testNotificationMessage(Map<String, String> data) {
		HomePage home = new HomePage();
		NotificationMessagePage notificationMessage = home.notificationMessages.click(NotificationMessagePage.class);
		for (int i = 0; i < 10; i++) {
			String message = notificationMessage.message.getText().split("\\n")[0];
			assertTrue(data.values().contains(message), "Incorrect message");
			notificationMessage = notificationMessage.clickHere.click(NotificationMessagePage.class);
		}
	}

}
