package TestNG_pack;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Demo3_TestNG_UsageOfAnnotations {
	WebDriver driver;

	//In JUnit if @before (configurations) fails, it still executes @after and if any @test method is failed, it still executes other @test methods...
	//but in TestNG if @BeforeTest (configurations) fails it doesnot execute any other method.

	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SanjayKushwaha\\Desktop\\Selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.Google.com/");
		System.out.println("opened Google");
	}

	@Test
	public void test()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="Google";
		Assert.assertEquals(expectedtitle, actualtitle);
		System.out.println("Compared the title");
	}

	@AfterTest
	public void afterTest()
	{
		driver.close();
		System.out.println("Closed browser");
	}

}
