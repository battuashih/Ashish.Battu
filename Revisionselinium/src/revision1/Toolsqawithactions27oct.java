package revision1;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Toolsqawithactions27oct {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver ash = new ChromeDriver();
Actions ashh = new Actions(ash);
JavascriptExecutor js = (JavascriptExecutor) ash;
ash.get("https://demoqa.com/automation-practice-form");
ash.manage().window().maximize();
WebElement fname = ash.findElement(By.id("firstName"));
ashh.click(fname).keyDown(fname,Keys.SHIFT).sendKeys(fname,"ashish").keyUp(fname,Keys.SHIFT).build().perform();
WebElement lname = ash.findElement(By.id("lastName"));
ashh.click(lname).keyDown(lname,Keys.SHIFT).sendKeys(lname,"battu").keyUp(lname,Keys.SHIFT).build().perform();
WebElement mail = ash.findElement(By.id("userEmail"));
ashh.sendKeys(mail, "batuu@gmail.com").build().perform();
WebElement gender = ash.findElement(By.xpath("//*[text()='Male']"));
WebElement mbl = ash.findElement(By.id("userNumber"));
ashh.click(gender).sendKeys(mbl, "9848374663").build().perform();

Thread.sleep(2000);
WebElement sub = ash.findElement(By.id("subjectsInput"));
WebElement currentAddress = ash.findElement(By.id("currentAddress"));
ashh.moveToElement(currentAddress).click(sub).sendKeys(sub,"English").sendKeys(Keys.TAB).build().perform();
WebElement music = ash.findElement(By.xpath("//label[text()='Music']"));
ashh.click(music).build().perform();
//Thread.sleep(5000);
WebElement curad = ash.findElement(By.id("currentAddress"));
WebElement subm = ash.findElement(By.id("submit"));
ashh.moveToElement(subm).sendKeys(curad,"Bhongir Telangaana").build().perform();
ashh.pause(2000).build().perform();
js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
WebElement state = ash.findElement(By.id("state"));
ashh.sendKeys(state,"NCR").sendKeys(Keys.TAB).build().perform();
WebElement city = ash.findElement(By.id("city"));
ashh.sendKeys(city,"Delhi").sendKeys(Keys.TAB).build().perform();
ashh.pause(2000).build().perform();
WebElement submt = ash.findElement(By.id("submit"));
ashh.click(submt).build().perform();
ashh.pause(8000).build().perform();






		
		
ash.close();
ash.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
