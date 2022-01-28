package com.herokuapp.tests;

import static org.testng.Assert.assertEquals;
import static java.lang.Integer.parseInt;

import java.util.List;
import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.ChallengingDomPage;
import com.herokuapp.pages.HomePage;

public class ChallengingDomExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testChallengingDom(Map<String, String> data) {
		HomePage home = new HomePage();
		ChallengingDomPage challengingDom = home.challengingDom.click(ChallengingDomPage.class);
		List<String> tableHeaders = challengingDom.myTable.getTableHeaders();
		List<String> tableData = challengingDom.myTable.getTableData();
		for (String header : tableHeaders) {
			System.out.print(header + "\t\t");			
		}
		for (int i = 0; i < tableData.size(); i++) {
			if (i % tableHeaders.size() == 0) {
				System.out.println();				
			}
			System.out.print(tableData.get(i) + "\t");
		}
		System.out.println();
		String[] row = data.get("Row").split(";");
		String[] header = data.get("Header").split(";");
		String[] column = data.get("Column").split(";");
		String luvaret5Sit = challengingDom.myTable.getTableData(row[0], header[0]);
		assertEquals(luvaret5Sit, data.get("Assertion1"), "Incorrect table data");
		String diceret8 = challengingDom.myTable.getTableData(parseInt(row[1]), header[1]);
		assertEquals(diceret8, data.get("Assertion2"), "Incorrect table data");
		String row3column5 = challengingDom.myTable.getTableData(parseInt(row[2]), parseInt(column[0]));
		assertEquals(row3column5, data.get("Assertion3"), "Incorrect table data");
		String row5column8 = challengingDom.myTable.getTableData(parseInt(row[3]), parseInt(column[1]));
		assertEquals(row5column8, data.get("Assertion4"), "Condition check failed");
	}

}
