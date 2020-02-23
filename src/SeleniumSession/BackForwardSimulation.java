package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForwardSimulation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar.mangalam\\Documents\\Selenium Practice\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

 driver.get("https://www.google.com");
System.out.println(driver.getTitle());

driver.navigate().to("https://www.facebook.com");
System.out.println(driver.getTitle());


driver.navigate().back();  // move browser back

Thread.sleep(4000);
System.out.println(driver.getTitle());

Thread.sleep(4000);

driver.navigate().forward();
System.out.println(driver.getTitle());

Thread.sleep(2000);


driver.navigate().refresh();
System.out.println(driver.getTitle());

	}

}
