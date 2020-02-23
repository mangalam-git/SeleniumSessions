package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestion {

	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar.mangalam\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 
	 driver.manage().window().maximize();

	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	  
	        driver.get("https://www.makemytrip.com/");
		    Thread.sleep(5000);
		    WebElement fromCity= driver.findElement(By.xpath("//input[@id='fromCity']"));
		    fromCity.click();
		    fromCity.sendKeys("MUM");
		    Thread.sleep(4000);
		    fromCity.sendKeys(Keys.ARROW_DOWN);
		    fromCity.sendKeys(Keys.ENTER);
		    
		    WebElement toCity= driver.findElement(By.xpath("//input[@id='toCity']"));
		    toCity.click();
		    toCity.sendKeys("PAT");
		    Thread.sleep(4000);
		    toCity.sendKeys(Keys.ARROW_DOWN);
		    toCity.sendKeys(Keys.ENTER);
		    
		    String Ttile= driver.getTitle();
		    System.out.println(Ttile);
	}

}
