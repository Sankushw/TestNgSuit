package TestNG_pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1_TestNG_AnnotSeq2 {
	@BeforeClass
	public void BC2()
	{  System.out.println("This class executes only once before TestNG_class2 starts"); }

	@Test
	public void A2()
	{System.out.println("method 2"); }

	@BeforeMethod
	public void beforeMethod()
	{System.out.println("before method2"); }

	@AfterMethod
	public void afterMethod()
	{System.out.println("after method2"); }

	@AfterClass
	public void AC2()
	{  System.out.println("This class executes only once after TestNG_class2 ends"); }

	@AfterTest
	public void AT2()
	{System.out.println("Executed only once at the end (including 1 or more classes)of test execution");	}
	
	@AfterSuite
	public void BS1()
	{System.out.println("Executed only once after test suit");	}

}
