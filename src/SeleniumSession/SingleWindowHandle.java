package SeleniumSession;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar.mangalam\\Documents\\Selenium Practice\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.quora.com/");

		System.out.println(driver.getTitle());

		Thread.sleep(10000);

		driver.findElement(By.xpath("//a[contains(@class,'google_button submit_button')]")).click();

		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		Iterator<String> it = handles.iterator();

		String ParentWId = it.next();
		System.out.println("Parent Window Id is " + ParentWId);

		String ChildWId = it.next();
		System.out.println("Parent ChildW Id is " + ChildWId);
		/*
		 * WebElement NewWindow =
		 * driver.findElement(By.xpath("//button[@id='button1']"));
		 * 
		 * new WebDriverWait(driver,15).until(ExpectedConditions.elementToBeClickable(
		 * NewWindow)); NewWindow.click();
		 * //driver.findElement(By.xpath("//button[@id='button1']")).click();
		 * 
		 * Set<String> handles = driver.getWindowHandles(); System.out.println(handles);
		 */

		driver.switchTo().window(ChildWId);

		Thread.sleep(5000);
		if (driver.findElement(By.xpath("//input[@id='identifierId']")).isEnabled()) {
			System.out.println("Passed");
		}
		System.out.println(driver.getTitle());
		driver.switchTo().window(ParentWId);
		System.out.println(driver.getTitle());

	}

}
