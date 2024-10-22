package Package123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class AssertionTest {
	WebDriver driver;
	
	@Test
	public void assertTest() {
		 driver=new EdgeDriver();
		driver.get("https://www.selenium.dev/");
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.selenium.dev/";
		Assert.assertEquals(actualUrl, expectedUrl);
		Boolean downloadTextStatus=driver.findElement(By.xpath("//span[text()='Downloads']")).isDisplayed();
		Assert.assertTrue(downloadTextStatus);
			
	}
	
	@Test
	public void assertTest1() {
	driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.selenium.d";
		Assert.assertEquals(actualUrl, expectedUrl);
		Boolean downloadTextStatus=driver.findElement(By.xpath("//span[text()='Downloads']")).isDisplayed();
		Assert.assertTrue(downloadTextStatus);
			
	}

}
