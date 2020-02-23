package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar.mangalam\\Documents\\Selenium Practice\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				" /html[1]/body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[4]/button[1]"))
				.click();
		//driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/a[1]")).click();
		
		
		  //WebElement Datetest = driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']"));
		 
		
        
        //String Xpath = "/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[i]/td[k]/a[1]";
		Thread.sleep(4000);
        
		
		  //final int DIW = 7;
		  
		  for (int row=3;row<=5;row++) { 
			  for (int coln=1;coln<=7;coln++) {
				 // System.out.println("row="+row+" and col = " + coln);
				  WebElement SomeDay1= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr["+row+"]/td[" +coln+ "]/a[1]"));
				  System.out.println(SomeDay1.getText());
		                 if (SomeDay1.getText().contains("20"))
		                 { 
		                	 System.out.println(SomeDay1.getText());
		                	 SomeDay1.click();
		                	 
		                 }
		                 
		 }
		  
		 }
		
        
        System.out.println("ABC");

	}

}
