package com.selenium.sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TotalImages {
	
	

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> ls=driver.findElements(By.tagName("img"));
		
		System.out.println(ls.size());
		
		for(WebElement e:ls) {
			
			
			System.out.println(e.getAttribute("src"));
		}
	}

}
