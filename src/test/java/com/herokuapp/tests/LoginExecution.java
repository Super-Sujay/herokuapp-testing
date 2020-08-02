package com.herokuapp.tests;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.LoginPage;
import com.herokuapp.pages.SecureAreaPage;

public class LoginExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testLogin1(Map<String, String> data) {
		HomePage home = new HomePage();
		LoginPage login = home.formAuthentication.click(LoginPage.class);
		login.username.enterText(data.get("Username"));
		login.password.enterText(data.get("Password"));
		SecureAreaPage secureArea = login.loginButton.click(SecureAreaPage.class);
		String message = secureArea.message.getText().split("\\n")[0];
		assertEquals(message, data.get("Assertion1"), "Login failed");
		login = secureArea.logout.click(LoginPage.class);
		message = login.message.getText().split("\\n")[0];
		assertEquals(message, data.get("Assertion2"), "Logout failed");
	}

	@Test(dataProvider = "ExcelDataProvider")
	public void testLogin2(Map<String, String> data) {
		HomePage home = new HomePage();
		LoginPage login = home.formAuthentication.click(LoginPage.class);
		login.username.enterText(data.get("Username"));
		login.password.enterText(data.get("Password"));
		login = login.loginButton.click(LoginPage.class);
		String message = login.message.getText().split("\\n")[0];
		assertEquals(message, data.get("Assertion1"), "Login passed with incorrect credentials");
	}

}
