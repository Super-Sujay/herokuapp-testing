package com.herokuapp.pages;

import static org.openqa.selenium.By.cssSelector;

import org.automation.base.BasePage;
import org.automation.elements.HyperLink;

public class HomePage extends BasePage {

	public HyperLink abTesting = new HyperLink("A/B Testing", cssSelector("li:nth-child(1) > a"));
	public HyperLink addRemoveElements = new HyperLink("Add/Remove Elements", cssSelector("li:nth-child(2) > a"));
	public HyperLink basicAuth = new HyperLink("Basic Auth (user and pass: admin)", cssSelector("li:nth-child(3) > a"));
	public HyperLink brokenImages = new HyperLink("Broken Images", cssSelector("li:nth-child(4) > a"));
	public HyperLink challengingDom = new HyperLink("Challenging DOM", cssSelector("li:nth-child(5) > a"));
	public HyperLink checkBoxes = new HyperLink("Checkboxes", cssSelector("li:nth-child(6) > a"));
	public HyperLink contextMenu = new HyperLink("Context Menu", cssSelector("li:nth-child(7) > a"));
	public HyperLink digestAuthentication = new HyperLink("Digest Authentication", cssSelector("li:nth-child(8) > a"));
	public HyperLink disappearingElements = new HyperLink("Disappearing Elements", cssSelector("li:nth-child(9) > a"));
	public HyperLink dragAndDrop = new HyperLink("Drag and Drop", cssSelector("li:nth-child(10) > a"));
	public HyperLink dropdown = new HyperLink("Dropdown", cssSelector("li:nth-child(11) > a"));
	public HyperLink dynamicContent = new HyperLink("Dynamic Content", cssSelector("li:nth-child(12) > a"));
	public HyperLink dynamicControls = new HyperLink("Dynamic Controls", cssSelector("li:nth-child(13) > a"));
	public HyperLink dynamicLoading = new HyperLink("Dynamic Loading", cssSelector("li:nth-child(14) > a"));
	public HyperLink entryAd = new HyperLink("Entry Ad", cssSelector("li:nth-child(15) > a"));
	public HyperLink exitIntent = new HyperLink("Exit Intent", cssSelector("li:nth-child(16) > a"));
	public HyperLink fileDownload = new HyperLink("File Download", cssSelector("li:nth-child(17) > a"));
	public HyperLink fileUpload = new HyperLink("File Upload", cssSelector("li:nth-child(18) > a"));
	public HyperLink floatingMenu = new HyperLink("Floating Menu", cssSelector("li:nth-child(19) > a"));
	public HyperLink forgotPassword = new HyperLink("Forgot Password", cssSelector("li:nth-child(20) > a"));
	public HyperLink formAuthentication = new HyperLink("Form Authentication", cssSelector("li:nth-child(21) > a"));
	public HyperLink frames = new HyperLink("Frames", cssSelector("li:nth-child(22) > a"));
	public HyperLink geolocation = new HyperLink("Geolocation", cssSelector("li:nth-child(23) > a"));
	public HyperLink horizontalSlider = new HyperLink("Horizontal Slider", cssSelector("li:nth-child(24) > a"));
	public HyperLink hovers = new HyperLink("Hovers", cssSelector("li:nth-child(25) > a"));
	public HyperLink infiniteScroll = new HyperLink("Infinite Scroll", cssSelector("li:nth-child(26) > a"));
	public HyperLink inputs = new HyperLink("Inputs", cssSelector("li:nth-child(27) > a"));
	public HyperLink jqueryUiMenus = new HyperLink("JQuery UI Menus", cssSelector("li:nth-child(28) > a"));
	public HyperLink javaScriptAlerts = new HyperLink("JavaScript Alerts", cssSelector("li:nth-child(29) > a"));
	public HyperLink javaScriptOnloadEventError = new HyperLink("JavaScript onload event error", cssSelector("li:nth-child(30) > a"));
	public HyperLink keyPresses = new HyperLink("Key Presses", cssSelector("li:nth-child(31) > a"));
	public HyperLink largeDeepDom = new HyperLink("Large & Deep DOM", cssSelector("li:nth-child(32) > a"));
	public HyperLink multipleWindows = new HyperLink("Multiple Windows", cssSelector("li:nth-child(33) > a"));
	public HyperLink nestedFrames = new HyperLink("Nested Frames", cssSelector("li:nth-child(34) > a"));
	public HyperLink notificationMessages = new HyperLink("Notification Messages", cssSelector("li:nth-child(35) > a"));
	public HyperLink redirectLink = new HyperLink("Redirect Link", cssSelector("li:nth-child(36) > a"));
	public HyperLink secureFileDownload = new HyperLink("Secure File Download", cssSelector("li:nth-child(37) > a"));
	public HyperLink shadowDom = new HyperLink("Shadow DOM", cssSelector("li:nth-child(38) > a"));
	public HyperLink shiftingContent = new HyperLink("Shifting Content", cssSelector("li:nth-child(39) > a"));
	public HyperLink slowResources = new HyperLink("Slow Resources", cssSelector("li:nth-child(40) > a"));
	public HyperLink sortableDataTables = new HyperLink("Sortable Data Tables", cssSelector("li:nth-child(41) > a"));
	public HyperLink statusCodes = new HyperLink("Status Codes", cssSelector("li:nth-child(42) > a"));
	public HyperLink typos = new HyperLink("Typos", cssSelector("li:nth-child(43) > a"));
	public HyperLink wysiwygEditor = new HyperLink("WYSIWYG Editor", cssSelector("li:nth-child(44) > a"));

	public HomePage() {
		openUrl("http://the-internet.herokuapp.com/");
	}

}
