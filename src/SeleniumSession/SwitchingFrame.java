package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingFrame {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar.mangalam\\Documents\\Selenium Practice\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 driver.get("http://demo.guru99.com/test/guru99home/");
		
		 driver.switchTo().frame("a077aa5e");
		 
		 driver.findElement(By.xpath("//html//body//a//img")).click();
		 
		 driver.switchTo().parentFrame();
		 Thread.sleep(5000);
		 if ( driver.findElement(By.xpath("//div[@class='rt-logo-block']//a//img")).isDisplayed())
		 {
			 System.out.println("Pass");
		 }

	}

}
