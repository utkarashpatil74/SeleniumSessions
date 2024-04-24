package com.selenium.sessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	
	WebDriver driver;
	public WebDriver launchBrowser(String browser) {
		
		System.out.println("Browser is: "+browser);
		
		switch (browser.toLowerCase().trim())
		{
		case "chrome": {
			driver=new ChromeDriver();
			break;
			
		}
		case "edge": {
			driver=new EdgeDriver();
			break;
		}
		
		case "firefox": {
			driver=new FirefoxDriver();
			break;
		}
		default:
			System.out.println("Invalid browser name...enter a correct browser");
			throw new BrowserException("Invalid browser provided");
		}
		return driver;
		
	}

	public void launchURL(String url) {
		
		if(url==null) {
			throw new BrowserException("Enter the valid URL....");
		}
		 if(url.indexOf("http")==0) {
			driver.get(url);
			
		}
		else
		{
			throw new BrowserException("Http/s is not available in the URL provided");
		}
	}
	
public void launchURL(URL url) {
		
		if(url==null) {
			throw new BrowserException("Enter the valid URL....");
		}
		
		String url1=String.valueOf(url);
		 if(url1.indexOf("http")==0) {
			driver.get(url1);
			
		}
		else
		{
			throw new BrowserException("Http/s is not available in the URL provided");
		}
	}

public String getTitle() {
	return driver.getTitle();
}

public String getURL() {
	return driver.getCurrentUrl();
}

public void closeBrowser() {
	driver.close();
}
}
