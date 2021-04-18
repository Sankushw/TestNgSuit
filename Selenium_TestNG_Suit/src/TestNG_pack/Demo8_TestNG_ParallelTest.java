package TestNG_pack;

import java.sql.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.beust.jcommander.Parameter;

public class Demo8_TestNG_ParallelTest {

	WebDriver driver;
	@Parameters("mybrowser")
	@BeforeTest
	public void BT1(String mybrowser) throws InterruptedException
	{
		if (mybrowser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SanjayKushwaha\\Desktop\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(mybrowser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\SanjayKushwaha\\Desktop\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}
	@Parameters("mybrowser")
	@Test
	public void AT(String mybrowser) throws InterruptedException
	{
		driver.get("https://www.google.com");
		Thread.sleep(12000);
		driver.navigate().refresh();
		System.out.println(driver.getTitle());

		if (mybrowser.equalsIgnoreCase("chrome")) System.out.println("my favourite browser chrome");
		else if(mybrowser.equalsIgnoreCase("firefox"))  System.out.println("decent browser firefox");	
	}
	@AfterTest
	public void AT()
	{driver.quit();  }
}

