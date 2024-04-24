package com.selenium.sessions;

import org.openqa.selenium.WebDriver;

public class Test {

	public static void main(String[] args) {
	
		BrowserUtil util=new BrowserUtil();
		WebDriver driver=util.launchBrowser("edge");
		util.launchURL("www.google.com/");
		

	}

}	
