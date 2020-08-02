package com.herokuapp.tests;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.LargeDeepDomPage;

public class LargeDeepDomExecution extends BaseTest {

	@Test
	public void testLargeDeepDom() {
		HomePage home = new HomePage();
		LargeDeepDomPage largeDeepDom = home.largeDeepDom.click(LargeDeepDomPage.class);
		List<String> headers = largeDeepDom.large.getTableHeaders();
		List<String> data = largeDeepDom.large.getTableData();
		for (String header : headers)
			System.out.print(header + "\t");
		for (int i = 0; i < data.size(); i++) {
			if (i % headers.size() == 0)
				System.out.println();
			System.out.print(data.get(i) + "\t");
		}
		System.out.println();
		assertEquals(largeDeepDom.large.getTableData("10.1", "23"), "10.23", "Incorrect table data");
		assertEquals(largeDeepDom.large.getTableData(1, 23), "1.23", "Incorrect table data");
		assertEquals(largeDeepDom.large.getTableData(1, 1), "1.1", "Incorrect table data");
		
	}

}
