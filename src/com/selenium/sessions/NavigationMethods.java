package com.selenium.sessions;

import org.openqa.selenium.WebDriver;

public class NavigationMethods {

	public static void main(String[] args) {
		
		
		BrowserUtil util = new BrowserUtil();
		
		WebDriver driver=util.launchBrowser("edge");
		
		System.out.println(driver);
		util.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title=util.getTitle();
		System.out.println(title);
		
		String url=util.getURL();
		System.out.println(url);
		
		util.closeBrowser();
	}
	
	
}
