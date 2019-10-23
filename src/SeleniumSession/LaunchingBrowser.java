package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {


	

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar.mangalam\\Documents\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.geko.driver","C:\\Users\\kumar.mangalam\\Documents\\Selenium Practice\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
	
		
		
		
		driver.get("https://www.google.com");
		
		String Title = driver.getTitle() ;
        System.out.println(Title);
        
        if (Title.equals("Google"))
        	System.out.println("Validation is passed");
        else 
        {
        	System.out.println("Test Case Failed");
        }
        	
        
        driver.close(); 
	}

}
