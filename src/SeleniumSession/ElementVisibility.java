package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar.mangalam\\Documents\\Selenium Practice\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");

		// isdisplayed

		boolean b1 = driver.findElement(By.xpath("//a[@title='Go to Facebook home']")).isDisplayed();
		System.out.println(b1);

		// isenabled
		boolean b2 = driver.findElement(By.name("websubmit")).isEnabled();
		System.out.println(b2);

		// isselected

		boolean b3 = driver.findElement(By.xpath("//input[@id='u_0_15']")).isSelected();
		System.out.println(b3);

	}

}
