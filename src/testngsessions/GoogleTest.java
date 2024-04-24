
	
	package testngsessions;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

	public class GoogleTest {
		
		WebDriver driver;
		
		@BeforeTest
		public void setup() {
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			
		}

		@Test(priority = 1)
		public void titleTest() {
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Google", "title is not matched");
		}

		@Test(priority = 2)
		public void imageTest() {
			boolean flag = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
			// Assert.assertEquals(flag, true);
			Assert.assertTrue(flag);
		}

		@Ignore
		@Test(priority = 3)
		public void urlTest() {
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Assert.assertTrue(url.contains("google"));
		}

	}


