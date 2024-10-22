package Package123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertTest {
	@Test
	public void assertTest() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.selenium.dev/");
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.selenium.d";
		SoftAssert as=new SoftAssert(); 
		Assert.assertEquals(actualUrl, expectedUrl);
		Boolean downloadTextStatus=driver.findElement(By.xpath("//span[text()='Downloads']")).isDisplayed();
		
		as.assertTrue(downloadTextStatus);
		System.out.println(downloadTextStatus);
		as.assertAll();
			
	}
}
