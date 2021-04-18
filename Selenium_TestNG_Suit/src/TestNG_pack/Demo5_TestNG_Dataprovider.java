package TestNG_pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Demo5_TestNG_Dataprovider
{
	//Listeners are used to customize the reposts
		//make a listerners class and implement ItestListner in that and use @Listener annotation in this class above the classname to call it
		//we can also declare it at @suite level in .xml file when there are multiple classes
		//If running the xml file then remove the @Listeners notation from here

	WebDriver driver;
	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SanjayKushwaha\\Desktop\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test(dataProvider = "dp")
	public void f(String n, String s) throws InterruptedException
	{
		driver.findElement(By.id("txtUsername")).sendKeys(n);
		driver.findElement(By.id("txtPassword")).sendKeys(s);
		WebElement Login=driver.findElement(By.id("btnLogin"));
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { "manzoor", "manzoor" },
			new Object[] { "linda.anderson", "linda.anderson" },
		};
	}
}
