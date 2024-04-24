package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NaveenAutomationlabsTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	}
	
	@Test(priority=1)
	public void urlTest() {
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
	}
	
	@Test(priority=2)
	public void buttonTest() {
		boolean login=driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
		System.out.println(login);
	}
	
	

}
