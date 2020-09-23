package SeleniumSession;


import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar.mangalam\\Documents\\My Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(5000);

		List<WebElement> vegeList = driver.findElements(By.xpath("//div[@class='products']/div/h4"));
		System.out.println(vegeList.size());
		int i = 0;
		// String [] itemNeeded= {"Cucumber - 1 Kg","Brocolli - 1 Kg"};
		ArrayList<String> itemNeeded = new ArrayList<String>();
		itemNeeded.add("Cucumber - 1 Kg");
		itemNeeded.add("Brocolli - 1 Kg");
		while (i < vegeList.size()) {
			if (itemNeeded.contains(vegeList.get(i).getText())) {
				

				driver.findElements(By.xpath("//div[@class='product']//div[2]//a[2]")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
			}
			i++;
		}

		System.out.println(driver.getTitle());

		Thread.sleep(10000);
		// driver.close();

	}

}
