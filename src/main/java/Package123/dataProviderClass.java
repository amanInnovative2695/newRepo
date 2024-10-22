package Package123;

import org.testng.annotations.DataProvider;

public class dataProviderClass {
	
	@DataProvider(name="dataName")
	public Object[][] getData(){
		
		Object[][] data= {{"abc@gmail.com","abc"},{"abcd@gmail.com","abcd"},{"abcde@gmail.com","abcde"}};
		return data;
		
	}

}
