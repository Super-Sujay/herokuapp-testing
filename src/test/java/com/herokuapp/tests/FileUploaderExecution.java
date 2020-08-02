package com.herokuapp.tests;

import static java.lang.System.getProperty;
import static java.io.File.separator;
import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.FileUploadedPage;
import com.herokuapp.pages.FileUploaderPage;
import com.herokuapp.pages.HomePage;

public class FileUploaderExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testFileUploader(Map<String, String> data) {
		HomePage home = new HomePage();
		FileUploaderPage fileUploader = home.fileUpload.click(FileUploaderPage.class);
		String filePath = getProperty("user.dir") + separator + "src" + separator + "test" + separator + "resources" + separator + data.get("File Name");
		fileUploader.choseFile.enterText(filePath);
		FileUploadedPage fileUploaded = fileUploader.upload.click(FileUploadedPage.class);
		assertEquals(fileUploaded.pageHeader.getText(), data.get("Assertion1"), "File did not upload");
		assertEquals(fileUploaded.fileName.getText(), data.get("File Name"), "Incorrect file uploaded");
	}

}
