package TestNG_pack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo7_TestNG_Groups {
	
	//Listeners are used to customize the reposts
		//make a listerners class and implement ItestListner in that and use @Listener annotation in this class above the classname to call it
		//we can also declare it at @suite level in .xml file when there are multiple classes
		//If running the xml file then remove the @Listeners notation from here

	@Test(groups={"smoke"},priority=2)
	public void A() {
		System.out.println("smoke test2");
	}

	@Test(groups={"smoke"},priority=1)
	public void B() {
		
		System.out.println("smoke test1");
	}

	@Test(groups={"regression"},priority=1)
	public void C() {
	
		System.out.println("regression test1");
	}
	@Test(groups={"regression"},priority=2)
	public void D() {
		
		System.out.println("regression test2");
	}
	}

