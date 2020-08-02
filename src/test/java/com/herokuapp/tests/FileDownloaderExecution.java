package com.herokuapp.tests;

import static java.lang.Integer.parseInt;
import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.FileDownloaderPage;
import com.herokuapp.pages.HomePage;

public class FileDownloaderExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testFileDownloader(Map<String, String> data) {
		HomePage home = new HomePage();
		FileDownloaderPage fileDownloader = home.fileDownload.click(FileDownloaderPage.class);
		assertEquals(fileDownloader.fileLink1.httpStatus(), parseInt(data.get("Assertion1")), "Incorrect HTTP status of the link");
	}

}
