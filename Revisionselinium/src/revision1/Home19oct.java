package revision1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

public class Home19oct {

	public static void main(String[] args) throws InterruptedException 
	{
     System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Downloads\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
     WebDriver ash = new FirefoxDriver();
    Actions ashh = new Actions(ash);
     ash.get("https://demoqa.com/automation-practice-form");
     ash.getTitle();
     System.out.println(ash.getTitle());
	ash.getCurrentUrl();
	System.out.println(ash.getCurrentUrl());
ash.navigate().refresh();
ash.findElement(By.id("firstName")).sendKeys("Ashish");
ash.findElement(By.id("lastName")).sendKeys("Battu");
ash.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[3]/div[2]/div[1]/label")).click();
ash.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("ashish123@gmail.com");
ash.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("9848374663");
 WebElement submitbutton = ash.findElement(By.xpath("//*[@id=\"submit\"]"));
  ashh.moveToElement(submitbutton).build().perform();
// JavascriptExecutor js = (JavascriptExecutor) driver;

ash.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[6]/div[2]/div/div/div[1]")).sendKeys("selinium");
ash.findElement(By.xpath("//*[@id=\"hobbies-checkbox-3\"]")).click();
ash.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("bhongir");
ash.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[10]/div[2]/div/div/div[2]/div/svg")).click();
ash.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[10]/div[3]/div/div/div[1]")).click();
Thread.sleep(3000);

	
	
	
	
ash.close();
ash.quit();	
	}

}
