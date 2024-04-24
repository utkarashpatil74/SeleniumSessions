package com.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil br =new BrowserUtil();
		WebDriver driver=br.launchBrowser("edge");
		br.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId=By.id("input-email");
		By password=By.id("input-password");
		
		By loginButton=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]");
		
		
		ElementUtils eu =new ElementUtils(driver);
		
		eu.doSendKeys(emailId, "automation1708231070993@Opencart.com");
		eu.doSendKeys(password, "utkarsh@123");
		eu.doClick(loginButton);
		
		String currentUrl=br.getURL();
		System.out.println(currentUrl);
		
		
		
		
	}

}
