package TestNG_pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1_TestNG_AnnotSeq1 {

	@BeforeSuite
	public void BS1()
	{System.out.println("Executed only once before test suit");	}

	@BeforeTest
	public void BT1()
	{System.out.println("Executed only once before the test(including 1 or more classes)start executing");	}

	@BeforeClass
	public void BC1()
	{  System.out.println("This class executes only once before TestNG_class1 starts"); }

	@Test
	public void A1()
	{System.out.println("method 1"); }

	@BeforeMethod
	public void beforeMethod()
	{System.out.println("before method1"); }

	@AfterMethod
	public void afterMethod()
	{System.out.println("after method1"); }

	@AfterClass
	public void AC1()
	{  System.out.println("This class executes only once after TestNG_class1 ends"); }


}
