package revision1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentredbusgoogle {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
 WebDriver ash = new ChromeDriver();
 ash.get("https://www.redbus.com/");
 ash.manage().window().maximize();
 ash.findElement(By.id("src")).sendKeys("Hyd");
 Thread.sleep(3000);
 ash.findElement(By.xpath("//*[@*='selected']")).click();
 ash.findElement(By.id("dest")).sendKeys("vis");
 Thread.sleep(3000);
 ash.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/span")).click();
 ash.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[1]")).click();
 Thread.sleep(2000);
 ash.findElement(By.xpath("//*[@id=\"search\"]/div/div[4]/i")).click();
 
		
		
		
		
		
	Thread.sleep(5000);	
	ash.close();
	ash.quit();
		
		
		
	}

}
