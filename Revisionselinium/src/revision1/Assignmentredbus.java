package revision1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignmentredbus {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Downloads\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
WebDriver ash = new FirefoxDriver();
Actions ashh = new Actions(ash);
ash.get("https://www.redbus.com/");
ash.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Hyderabad");
ash.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys("vizag");
Thread.sleep(5000);
ash.findElement(By.id("onward_cal")).click();		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
ash.close();
ash.quit();
		
		
		
		
		
	}

}
