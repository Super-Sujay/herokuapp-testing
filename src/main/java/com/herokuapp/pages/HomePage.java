package com.herokuapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.HyperLink;
import org.automation.utilities.Configuration;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

	public final HyperLink abTesting = new HyperLink("A/B Testing", By.cssSelector("li:nth-child(1) > a"));
	public final HyperLink addRemoveElements = new HyperLink("Add/Remove Elements", By.cssSelector("li:nth-child(2) > a"));
	public final HyperLink basicAuth = new HyperLink("Basic Auth (user and pass: admin)", By.cssSelector("li:nth-child(3) > a"));
	public final HyperLink brokenImages = new HyperLink("Broken Images", By.cssSelector("li:nth-child(4) > a"));
	public final HyperLink challengingDom = new HyperLink("Challenging DOM", By.cssSelector("li:nth-child(5) > a"));
	public final HyperLink checkBoxes = new HyperLink("Checkboxes", By.cssSelector("li:nth-child(6) > a"));
	public final HyperLink contextMenu = new HyperLink("Context Menu", By.cssSelector("li:nth-child(7) > a"));
	public final HyperLink digestAuthentication = new HyperLink("Digest Authentication", By.cssSelector("li:nth-child(8) > a"));
	public final HyperLink disappearingElements = new HyperLink("Disappearing Elements", By.cssSelector("li:nth-child(9) > a"));
	public final HyperLink dragAndDrop = new HyperLink("Drag and Drop", By.cssSelector("li:nth-child(10) > a"));
	public final HyperLink dropdown = new HyperLink("Dropdown", By.cssSelector("li:nth-child(11) > a"));
	public final HyperLink dynamicContent = new HyperLink("Dynamic Content", By.cssSelector("li:nth-child(12) > a"));
	public final HyperLink dynamicControls = new HyperLink("Dynamic Controls", By.cssSelector("li:nth-child(13) > a"));
	public final HyperLink dynamicLoading = new HyperLink("Dynamic Loading", By.cssSelector("li:nth-child(14) > a"));
	public final HyperLink entryAd = new HyperLink("Entry Ad", By.cssSelector("li:nth-child(15) > a"));
	public final HyperLink exitIntent = new HyperLink("Exit Intent", By.cssSelector("li:nth-child(16) > a"));
	public final HyperLink fileDownload = new HyperLink("File Download", By.cssSelector("li:nth-child(17) > a"));
	public final HyperLink fileUpload = new HyperLink("File Upload", By.cssSelector("li:nth-child(18) > a"));
	public final HyperLink floatingMenu = new HyperLink("Floating Menu", By.cssSelector("li:nth-child(19) > a"));
	public final HyperLink forgotPassword = new HyperLink("Forgot Password", By.cssSelector("li:nth-child(20) > a"));
	public final HyperLink formAuthentication = new HyperLink("Form Authentication", By.cssSelector("li:nth-child(21) > a"));
	public final HyperLink frames = new HyperLink("Frames", By.cssSelector("li:nth-child(22) > a"));
	public final HyperLink geolocation = new HyperLink("Geolocation", By.cssSelector("li:nth-child(23) > a"));
	public final HyperLink horizontalSlider = new HyperLink("Horizontal Slider", By.cssSelector("li:nth-child(24) > a"));
	public final HyperLink hovers = new HyperLink("Hovers", By.cssSelector("li:nth-child(25) > a"));
	public final HyperLink infiniteScroll = new HyperLink("Infinite Scroll", By.cssSelector("li:nth-child(26) > a"));
	public final HyperLink inputs = new HyperLink("Inputs", By.cssSelector("li:nth-child(27) > a"));
	public final HyperLink jqueryUiMenus = new HyperLink("JQuery UI Menus", By.cssSelector("li:nth-child(28) > a"));
	public final HyperLink javaScriptAlerts = new HyperLink("JavaScript Alerts", By.cssSelector("li:nth-child(29) > a"));
	public final HyperLink javaScriptOnloadEventError = new HyperLink("JavaScript onload event error", By.cssSelector("li:nth-child(30) > a"));
	public final HyperLink keyPresses = new HyperLink("Key Presses", By.cssSelector("li:nth-child(31) > a"));
	public final HyperLink largeDeepDom = new HyperLink("Large & Deep DOM", By.cssSelector("li:nth-child(32) > a"));
	public final HyperLink multipleWindows = new HyperLink("Multiple Windows", By.cssSelector("li:nth-child(33) > a"));
	public final HyperLink nestedFrames = new HyperLink("Nested Frames", By.cssSelector("li:nth-child(34) > a"));
	public final HyperLink notificationMessages = new HyperLink("Notification Messages", By.cssSelector("li:nth-child(35) > a"));
	public final HyperLink redirectLink = new HyperLink("Redirect Link", By.cssSelector("li:nth-child(36) > a"));
	public final HyperLink secureFileDownload = new HyperLink("Secure File Download", By.cssSelector("li:nth-child(37) > a"));
	public final HyperLink shadowDom = new HyperLink("Shadow DOM", By.cssSelector("li:nth-child(38) > a"));
	public final HyperLink shiftingContent = new HyperLink("Shifting Content", By.cssSelector("li:nth-child(39) > a"));
	public final HyperLink slowResources = new HyperLink("Slow Resources", By.cssSelector("li:nth-child(40) > a"));
	public final HyperLink sortableDataTables = new HyperLink("Sortable Data Tables", By.cssSelector("li:nth-child(41) > a"));
	public final HyperLink statusCodes = new HyperLink("Status Codes", By.cssSelector("li:nth-child(42) > a"));
	public final HyperLink typos = new HyperLink("Typos", By.cssSelector("li:nth-child(43) > a"));
	public final HyperLink wysiwygEditor = new HyperLink("WYSIWYG Editor", By.cssSelector("li:nth-child(44) > a"));

	public HomePage() {
		openUrl(Configuration.get("url"));
	}

}
