package Package123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	WebDriver driver;
	
	
	@DataProvider(name="dataprovidename")
	public Object[][]  dataProviderMethod(){
		Object[][] data= {{"username1","password1"},{"username2","password2"},{"username3","password3"}};
		return data;
		
		
	}
	
	
	@DataProvider(name="browserTest")
	public Object[][]  dataProviderMethod1(){
		Object[][] data= {{"firefox","https://www.selenium.dev/"},{"edge","https://www.facebook.com/login/"}};
		return data;
		
		
	}
	
	
	
	
	
	
	@Test(dataProvider = "dataprovidename")
	public void checkData(String user,String pass) {
		System.out.println(user+":   "+pass);
//		WebDriver driver=new  EdgeDriver();
//		driver.get("https://www.selenium.dev/");
		
	}
	
	
	@Test(dataProvider = "browserTest")
	public void launch(String brow,String url) {
		if(brow.equals("firefox")) {
			driver=new  FirefoxDriver();
			driver.get(url);
			
		}
		else if(brow.equals("edge")) {
			driver=new  EdgeDriver();
			driver.get(url);
		}
	}

}
