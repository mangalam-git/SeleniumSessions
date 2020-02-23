package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar.mangalam\\Documents\\Selenium Practice\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//li[@id='header-addons']//a[@id='highlight-addons']")))
				.build().perform();
		Thread.sleep(4000);

		WebElement HotMeals = driver.findElement(By.xpath("//a[contains(text(),'Hot Meals')]"));
		action.moveToElement(HotMeals).contextClick().build().perform();  //contextclick is used to perform right click operation on webelement

		Thread.sleep(10000);
		driver.close();

	}

}
