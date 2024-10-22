package Package123;
import org.testng.Assert;
import org.testng.annotations.Test;

public class priorityOgTestNG {
	
	
	
	@Test(dependsOnMethods = {"launch","login"})
	public void  homepageverification() {
		System.out.println("homepage");
		
	}
	
	@Test()
	public void launch() {
		System.out.println("launch");
	}
	
	
	@Test(dependsOnMethods = {"launch"})
	public void login() {
		System.out.println("login");
		Assert.fail();
	}
	
	
	
	
	
	@Test()
	public void d() {
		System.out.println("d");
	}

}
