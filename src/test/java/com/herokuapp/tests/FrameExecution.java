package com.herokuapp.tests;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.automation.base.BaseTest;
import org.testng.annotations.Test;

import com.herokuapp.pages.FramesPage;
import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.IFramePage;
import com.herokuapp.pages.NestedFramesPage;

public class FrameExecution extends BaseTest {

	@Test(dataProvider = "ExcelDataProvider")
	public void testFrame1(Map<String, String> data) {
		HomePage home = new HomePage();
		FramesPage frames = home.frames.click(FramesPage.class);
		NestedFramesPage nestedFrames = frames.nestedFrames.click(NestedFramesPage.class);
		nestedFrames.switchToTopFrame();
		nestedFrames.switchToTopLeftFrame();
		assertEquals(nestedFrames.frameText.getText(), data.get("Assertion1"), "Incorrect Frame");
		nestedFrames.switchToMainFrame();
		nestedFrames.switchToBottomFrame();
		assertEquals(nestedFrames.frameText.getText(), data.get("Assertion2"), "Incorrect Frame");
	}

	@Test(dataProvider = "ExcelDataProvider")
	public void testFrame2(Map<String, String> data) {
		HomePage home = new HomePage();
		FramesPage frames = home.frames.click(FramesPage.class);
		IFramePage iFrame = frames.iFrame.click(IFramePage.class);
		iFrame.switchToContentFrame();
		iFrame.content.enterText(data.get("Text"));
		assertEquals(iFrame.content.getText(), data.get("Text"), "Incorrect content");
	}

}
