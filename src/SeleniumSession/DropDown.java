package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void selectfromdropDown(WebElement element, String value)  // we can only use select obj when we have select tag
	{
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public static void deselectfromdropDown(WebElement element, String value)
	{
		Select select = new Select(element);
		select.deselectByVisibleText(value);
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar.mangalam\\Documents\\Selenium Practice\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		

		/*
		 * Select select = new Select(day); select.selectByVisibleText("3");
		 * 
		 * Select select1 = new Select(month); select1.selectByVisibleText("Sept");
		 * 
		 * Select select2 = new Select(year); select2.selectByVisibleText("1995");
		 */
		selectfromdropDown(day,"3");
		selectfromdropDown(month,"Sept");
		selectfromdropDown(year,"1995");
		
		System.out.println("Deselecting all the values");
		/* Deselect function can only be used if we have multiple select option in a drop down
		 * deselectfromdropDown(day,"3"); deselectfromdropDown(month,"Sept");
		 * deselectfromdropDown(year,"1995");
		 */
		
		

	}
	
	

}
