package SeleniumSession;

import org.openqa.selenium.By;
import org.testng.annotations.*;

//import TestNG.ChromeDriver;
//import TestNG.WebDriver;

public class TestNGPractice {
org.openqa.selenium.WebDriver driver;
	
	
	@BeforeMethod
	public void BeforeMethod() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar.mangalam\\Documents\\Selenium Practice\\chromedriver\\chromedriver.exe");

		 driver = new org.openqa.selenium.chrome.ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://google.com/");
		Thread.sleep(5000);
	}
	
	@Test
	public void Test ()
	{
		
		System.out.println(driver.getTitle());
		
	}
	@Test
	public void Test1 ()
	{
		boolean b = driver.getTitle().equalsIgnoreCase("Google");
	}
	
	@Test
	public void Test3 ()
	{
		boolean b= driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
	}
	@AfterMethod
    public void AfterMethod()
{
	driver.quit();
}
	

}
