package com.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtils {
	
	private WebDriver driver;
	
	
	public By getBy(String locatorType, String value) {
		
		By locator =null;
		switch (locatorType.toLowerCase().trim()) {
		case "id":
			locator=By.id(value);
			break;
		case "name":
			locator=By.name(value);
			break;
	

		default:
			break;
		}
		return locator;
	}
	
	public ElementUtils(WebDriver driver) {
		
		this.driver=driver;
	}
	public WebElement getElement(By elementValue) {
		
		return driver.findElement(elementValue);
		
	}
	
public WebElement getElement(String locatorType, String value) {
		
		return driver.findElement(getBy(locatorType, value));
		
	}

public void doSendKeys(By elementValue, String keys) {
	
	 getElement(elementValue).sendKeys(keys);
}

public void doSendKeys(String locatorType, String value, String keys) {
	
	 getElement(locatorType,value).sendKeys(keys);
}

public void doClick(By elementValue) {
	
	getElement(elementValue).click();
	
}

public void doClick(String locatorType, String value) {

	getElement(locatorType,value).click();
}

public String doGetElementText(By elementValue) {
	
	return getElement(elementValue).getText();
}

public String doGetElementText(String locatorType, String value) {
	
	return getElement(locatorType,value).getText();
}

private void throwException(String value) {
	throw new MyElementException(value+"---Value cannot be null");
}

public void doSelectByValue(By locator, String value) {
	
	if(value==null|| value.length()==0) {
		throwException(value);
	}
	else {
	
	WebElement countryDd=getElement(locator);
	Select sd=new Select(countryDd);
	sd.selectByValue(value);
}

}

public void doSelectByIndex(By locator,int index) throws InterruptedException {
	
	WebElement countryDd=getElement(locator);
	Select sd=new Select(countryDd);
	sd.selectByIndex(index);
	
}

public void doSelectByText(By locator, String text) {
	
	if(text==null|| text.length()==0) {
		throwException(text);
	}
	else {
	
	WebElement countryDd=getElement(locator);
	Select sd=new Select(countryDd);
	sd.selectByValue(text);
}
}
}
