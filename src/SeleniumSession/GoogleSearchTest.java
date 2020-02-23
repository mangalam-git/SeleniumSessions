package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar.mangalam\\Documents\\Selenium Practice\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

 driver.get("https://www.google.com");
System.out.println(driver.getTitle());

driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");

List<WebElement> searchlist = driver.findElements(By.xpath("//ul[@class='erkvQe']//*[contains(text(),'testing')]"));////ul[@role='listbox']//li//span
System.out.println(searchlist.size());

for (int i=0;i<searchlist.size();i++ )
{
	System.out.println(searchlist.get(i).getText());
	if (searchlist.get(i).getText().contains("testing"))
	{
			System.out.println("Validation Passed");
			break;
	}
		     
			
}

	}

}
