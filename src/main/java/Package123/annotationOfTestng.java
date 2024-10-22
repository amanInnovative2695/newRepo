package Package123;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotationOfTestng {
	
	


@Test()
public void methodBeforeTest() {
	System.out.println("beforeTest");
}


@BeforeClass
public void methodBeforeClass() {
	System.out.println("beforeclass");
}

@Test
public void methodBeforeSuite1() {
	System.out.println("test");
}

@AfterMethod
public void methodaftermethod() {
	System.out.println("aftermethod");
}


@BeforeSuite
public void methodBeforeSuite() {
	System.out.println("beforesuite");
}





}
