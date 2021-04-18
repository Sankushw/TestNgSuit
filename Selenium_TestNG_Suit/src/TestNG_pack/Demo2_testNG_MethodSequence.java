package TestNG_pack;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo2_testNG_MethodSequence {
	
	//First, the methods without priority are executed as by default they have 0 priority, after that prioritized methods run
	//for unprioritized methods, the methods run alphabetically
	//when 2 methods have same priority than they are executed alphabetically
	
	
	@BeforeClass
	public void BC()
	{  System.out.println("This class executes only once before class starts"); }
	
	@Test (priority=0) //  all other unprioritized methods also have 0 priority, hence execution takes alphabetically
	public void E()
	{System.out.println("E methods"); }
	
	@Test (priority=-1)
	public void A()
	{System.out.println("A methods"); }

	@Test (priority=4)
	public void B()
	{System.out.println("B methods"); }

	@Test (priority=9)
	public void C()
	{System.out.println("C methods"); }

	@Test
	public void F()
	{System.out.println("F methods"); }
	
	@Test
	public void G()
	{System.out.println("G methods"); }

	@BeforeMethod
	public void beforeMethod()
	{System.out.println("before methods"); }

	@AfterMethod
	public void afterMethod()
	{System.out.println("after methods"); }
	
	@AfterClass
	public void AC()
	{  System.out.println("This class executes only once after class ends"); }
	
}
