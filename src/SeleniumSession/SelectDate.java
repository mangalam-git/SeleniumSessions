package SeleniumSession;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectDate {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar.mangalam\\Documents\\Selenium Practice\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demos.telerik.com/kendo-ui/datetimepicker/index");
		
		WebElement MoveLeft = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-prev')]"));
		WebElement MoveRight= driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-next')]"));
		WebElement Middle = driver.findElement(By.xpath("//a[@class='k-link k-nav-fast']"));
		WebElement TimePicker = driver.findElement(By.xpath("//span[@class='k-link k-link-time']"));
		
		String dateTime= "9/3/2019 2:00 AM";
		String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");
		
		int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2])- Calendar.getInstance().get(Calendar.YEAR);
		
		if (yearDiff!=0)
		{
			if (yearDiff>0)
			{
				for (int i=0;i<=yearDiff;i++)
				{
					MoveRight.click();
				}
				
			}
				if (yearDiff<0)
				{
					for (int i=0;i>=yearDiff;i--)
					{
						MoveLeft.click();
					}
				
				 }
		}
		
		
		
		
		
		
		Actions action = new Actions(driver);
		
		
		
		
		

	}

}
