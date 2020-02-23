package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar.mangalam\\Documents\\Selenium Practice\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement firstname = driver.findElement(By.name("firstname"));

		driver.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS); // implict wait can be over ridden.
		WebElement lastnsame = driver.findElement(By.name("reg_email__"));
		WebElement Login = driver.findElement(By.xpath("//input[@value='Log In']"));
		sendKeys(driver, email, 5, "kmrmnglm@gmail.com");
		sendKeys(driver, firstname, 5, "xyz");
		sendKeys(driver, lastnsame, 5, "abc");
		click(driver, Login, 5);

		Thread.sleep(5000);
		driver.close();

	}

	public static void sendKeys(WebDriver driver, WebElement element, int Timeout, String value) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	public static void click(WebDriver driver, WebElement element, int Timeout) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
