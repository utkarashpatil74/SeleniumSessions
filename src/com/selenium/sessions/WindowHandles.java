package com.selenium.sessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//click on green blinking link
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> wh=driver.getWindowHandles();
		
		Iterator<String> it=wh.iterator();
		
		String parent=it.next();
		String child=it.next();
		
		driver.switchTo().window(child);
		
		
		
		

	}

}
