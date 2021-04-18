
package TestNG_pack;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo6_TestNG_enableTest {

	//to run only failed test cases---execute testNG-failed xml file.-----------------------------------------------
	@Test (enabled=false)   //this TC will not be be executed(skipped)....if other method depends on this method,error will be produced while execution as this method becomes non-existant
	public void TC0() {
		System.out.println("TC0");
	}

	@Test (enabled=true)   //this TC will be executed but fails
	public void TC1() {
		String exp="sanjay";
		String act="kushwaha";
		Assert.assertEquals(exp, act);
		System.out.println("TC1");
	}

	@Test(dependsOnMethods="TC1" , alwaysRun=true, invocationCount=4)  //This method depends on TC1 but still is executed because "alwaysRun=true"
	public void TC2() {
		String exp="sanjay";
		String act="sanjay";
		Assert.assertEquals(exp, act);
		System.out.println("TC2");
	}

	@Test(dependsOnMethods="TC2")  //this method is executed but fails
	public void TC3() {
		String exp="sanjay1";
		String act="sanjay123";
		Assert.assertEquals(exp, act);
		System.out.println("TC3");
	}

	@Test(dependsOnMethods="TC2") //This method is executed and passes
	public void TC4() {
		System.out.println("TC4");
		int[] arr1 = { 55, 77, 99, 11 };
		int[] arr2 = new int[4];
		arr1 = arr2;
		System.out.println("array value at index 4= "+arr1[3]);

	}
}
