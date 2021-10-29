package revision1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames19oct {

	public static void main(String[] args) throws InterruptedException 
	{
    System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Downloads\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
   // WebDriver ash = new ChromeDriver();
    WebDriver fire = new FirefoxDriver();
    fire.get("http://demo.automationtesting.in/Frames.html");
    Thread.sleep(2000);
	fire.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Ashish.Battu");
	Thread.sleep(5000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	fire.close();
	fire.quit();
	
	
	}

}
