package Package123;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class groupByMethods {
	
	
	
	@Test(groups= {"sanity"})
	public void test1() {
		System.out.println("sanity method");
	}
	
	
	@Test(groups = {"regression"})
	public void test2() {
		System.out.println("regtression");
	}
	
	@Test(groups = {"regression","sanity"})
	public void test3() {
		System.out.println("staging and regression");
	}
	
	@Test(groups = {"functional"})
	public void test4() {
		System.out.println("functional");
	}

}
