package TestNG_pack;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo9_Grid {
	WebDriver driver;
	@Test
	public void f() throws MalformedURLException
	{	  
		/*code to configure and run  hub-->
	  java -jar selenium-server-standalone-3.141.59.jar -role hub
		 */

		/*code to register nodes on hubcmd-->
	  java -Dwebdriver.gecko.driver="C:\Users\IBM_ADMIN\Desktop\Selenium\Selenium standalone jar\geckodriver-v0.24.0-win64\geckodriver.exe"
	  -jar selenium-server-standalone-3.141.59.jar  -role webdriver
	  -hub http://192.168.43.129:4444/grid/register
	  -port 5566 */
	
		DesiredCapabilities capabilities=new DesiredCapabilities().firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL("http://9.193.10.95:4444/wd/hub"), capabilities);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();


	}
}
