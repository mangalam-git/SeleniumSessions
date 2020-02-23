package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar.mangalam\\Documents\\Selenium Practice\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);

		driver.switchTo().frame(0); // switching frame via frame index

		Actions action = new Actions(driver);

		if (driver.findElement(By.xpath("//div[@id='draggable']")).isDisplayed()) {

			WebElement pick = driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));

			action.dragAndDrop(pick, drop).release().build().perform();
			System.out.println("Drag and Drop Validation Passed");

		}

		else {
			Thread.sleep(10000);
			driver.close();
		}

		/*
		 * WebElement pick = driver.findElement(By.xpath("//div[@id='draggable']"));
		 * WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		 * 
		 * action.clickAndHold(pick).moveToElement(drop).release().build().perform();
		 * System.out.println("Drag and Drop Validation Passed");
		 */
	}
}
