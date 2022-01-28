package com.herokuapp.tests;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.EmailSentPage;
import com.herokuapp.pages.ForgotPasswordPage;
import com.herokuapp.pages.HomePage;

public class ForgotPasswordExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider", groups = "Ignore")
	public void testForgotPassword(Map<String, String> data) {
		HomePage home = new HomePage();
		ForgotPasswordPage forgotPassword = home.forgotPassword.click(ForgotPasswordPage.class);
		forgotPassword.email.enterText(data.get("Text"));
		EmailSentPage emailSent = forgotPassword.retrievePassword.click(EmailSentPage.class);
		assertEquals(emailSent.emailNotification.getText(), data.get("Assertion1"), "Email is not sent");
	}

}
