package SeleniumSession;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapinSelenium {
	
	public static String getUsername(String role)
	{
		String credential =getCredentialMap().get(role);
		return credential.split(":")[0];
	}
	public static String getpwd(String role)
	{
		String credential =getCredentialMap().get(role);
		return credential.split(":")[1];
	}
	
	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar.mangalam\\Documents\\Selenium Practice\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://ui.cogmento.com/");
		Thread.sleep(5000);

		WebElement Username = driver.findElement(By.xpath("//input[@placeholder='E-mail address']"));
		WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		WebElement LoginButton = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		
		//String Logincredential = getCredentialMap().get("firstuser");
		Username.sendKeys(getUsername("firstuser"));
		pwd.sendKeys(getpwd("firstuser"));
		LoginButton.click();
		System.out.println(driver.getTitle());

	}

	public static HashMap<String, String> getCredentialMap() {
		HashMap<String, String> userMap = new HashMap<String, String>();

		userMap.put("firstuser", "kmrmnglm@gmail.com:Gurgaon246");
		return userMap;

	}
	
	
	

}
