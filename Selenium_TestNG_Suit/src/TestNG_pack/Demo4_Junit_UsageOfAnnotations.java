package TestNG_pack;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demo4_Junit_UsageOfAnnotations {

	WebDriver driver;

	//In JUnit if  @before (configurations) fails, it still executes @after and if any @test method is failed, it still executes other @test methods...
	//but in TestNG if @BeforeTest (configurations) fails it doesnot execute any other method.
	
	@Before
	public void BT()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SanjayKushwaha\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("opened google");
	}

	@Test
	public void Testcase1()
	{
		String ExpTitle= driver.getTitle();
		String actualTitle="sanjay	";
		Assert.assertEquals(ExpTitle, actualTitle);
		System.out.println("compared title in tc1");
	}

	@Test
	public void Testcase2()
	{
		String ExpTitle= driver.getTitle();
		String actualTitle="Google";
		Assert.assertEquals(ExpTitle, actualTitle);
		System.out.println("compared title in tc2");
	}

	@After
	public void AT()
	{
		driver.close();
		System.out.println("closed browser");
	}

}
