package Package123;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	@Test(dataProvider = "dataName",dataProviderClass = dataProviderClass.class)
	public void dataTest(String email,String pass) {
		System.out.println(email+":"+pass);
		
		
	}
	
	

}
