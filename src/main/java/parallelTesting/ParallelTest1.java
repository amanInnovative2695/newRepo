package parallelTesting;

import java.time.LocalTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest1 {
	WebDriver driver;
	
	@Test
	public void launch() throws InterruptedException {
		
		LocalTime lt=LocalTime.now();
		System.out.println("aman print"+lt);
		
		System.out.println("nautiyal print"+lt);
		
		System.out.println("nautiyal print    567678"+lt);
		System.out.println("nautiyal print    5676789"+lt);
//		driver=new EdgeDriver();
//		driver.get("https://www.selenium.dev/");
//		Thread.sleep(3000);
//		WebElement download=driver.findElement(By.xpath("//span[text()='Downloads']"));
//		Assert.assertTrue(download.isDisplayed());
	}
	
	@Test
	public void title() throws InterruptedException {
		LocalTime lt=LocalTime.now();
		System.out.println(" titlenautiyal print    567678"+lt);
		System.out.println("titlenautiyal print    5676798"+lt);
		System.out.println("titlenautiyal print    56767899"+lt);
//		driver=new EdgeDriver();
//		driver.get("https://www.selenium.dev/");
//		Thread.sleep(3000);
//		String actualUrl=driver.getCurrentUrl();
//		Assert.assertTrue(actualUrl.equals("https://www.selenium.dev/"));
	}
	
	
//	@AfterMethod
//	public void tearDown() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.close();
//	}

}
