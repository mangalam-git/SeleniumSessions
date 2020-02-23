package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar.mangalam\\Documents\\Selenium Practice\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);

		WebElement Go = driver.findElement(By.xpath("//input[@type='submit']"));
		Go.click();
		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		if (alert.getText().equals("Please enter a valid user name")) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");
		}
		alert.accept();

		Thread.sleep(10000);
		driver.close();

	}

}
