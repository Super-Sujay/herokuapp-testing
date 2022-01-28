package com.herokuapp.tests;

import static java.lang.Integer.parseInt;
import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.DataTablesPage;
import com.herokuapp.pages.HomePage;

public class SortableDataTablesExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testSortableDataTables(Map<String, String> data) {
		HomePage home = new HomePage();
		DataTablesPage dataTables = home.sortableDataTables.click(DataTablesPage.class);
		List<String> tableHeaders = dataTables.example1.getTableHeaders();
		List<String> tableData = dataTables.example1.getTableData();
		for (String header : tableHeaders) {
			System.out.print(header + "\t\t");			
		}
		for (int i = 0; i < tableData.size(); i++) {
			if (i % tableHeaders.size() == 0) {
				System.out.println();				
			}
			System.out.print(tableData.get(i) + "\t\t");
		}
		System.out.println();
		tableHeaders = dataTables.example2.getTableHeaders();
		tableData = dataTables.example2.getTableData();
		for (String header : tableHeaders) {
			System.out.print(header + "\t\t");			
		}
		for (int i = 0; i < tableData.size(); i++) {
			if (i % tableHeaders.size() == 0) {
				System.out.println();				
			}
			System.out.print(tableData.get(i) + "\t\t");
		}
		System.out.println();
		String[] row = data.get("Row").split(";");
		String[] header = data.get("Header").split(";");
		String email3 = dataTables.example1.getTableData(parseInt(row[0]), header[0]);
		assertEquals(email3, "jdoe@hotmail.com", "Incorrect email");
		String webSiteConway = dataTables.example1.getTableData(row[1], header[1]);
		assertEquals(webSiteConway, "http://www.timconway.com", "Incorrect web site");
	}

}
