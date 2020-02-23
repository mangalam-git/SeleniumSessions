package SeleniumSession;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar.mangalam\\Documents\\Selenium Practice\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_1");
		Thread.sleep(5000);
		
	//List<WebElement> list =	driver.findElements(By.xpath("//button[contains(@class,'btn btn-warning dropdown-toggle')]//div//a"));
		
		driver.findElement(By.xpath("//button[@id='btnDropdownDemo']")).click();
		
	 List<WebElement> list =  driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu show')]//a"));
	 
	 System.out.println(list.size());
	 
	 for (int i=0;i<list.size();i++)
	 {
	    list.get(i).getText();
	    System.out.println(list.get(i).getText());
	    if (list.get(i).getText().equalsIgnoreCase("Bootstrap 4"))
	    		{
	    	        if (list.get(i).isSelected())
	    	        {
	    	        	list.get(i).click();
	    	        }
	    	        else
	    	        	System.out.println("Button is not enabled");
	    		}
	    break;
	 }

	}

}
