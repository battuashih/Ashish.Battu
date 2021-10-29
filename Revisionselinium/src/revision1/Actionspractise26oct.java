package revision1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionspractise26oct {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver ash = new ChromeDriver();
Actions battu = new Actions(ash);
ash.get("https://demoqa.com/automation-practice-form");
ash.manage().window().maximize();
WebElement fname = ash.findElement(By.id("firstName"));
battu.click(fname).keyDown(fname,Keys.SHIFT).sendKeys(fname,"ashish").keyUp(fname,Keys.SHIFT).build().perform();
WebElement lastbtn = ash.findElement(By.id("lastName"));
battu.moveToElement(lastbtn).build().perform();
WebElement subject = ash.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
battu.click(subject).build().perform();
WebElement dob = ash.findElement(By.id("dateOfBirthInput"));
battu.doubleClick(dob).build().perform();
WebElement chose = ash.findElement(By.id("uploadPicture"));
battu.contextClick(chose).build().perform();
WebElement hold = ash.findElement(By.xpath("//*[@id=\"text-10\"]/div/div[1]/a/img"));
battu.clickAndHold(hold).build().perform();
      //WebElement hold = ash.findElement(By.xpath("//*[@id=\"text-10\"]/div/div[1]/a/img"));
      //battu.release(hold).build().perform();
WebElement off = ash.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[3]"));
battu.moveToElement(off).build().perform();
battu.click(lastbtn).pause(Duration.ofSeconds(5)).build().perform();
battu.click().pause(5000).click().build().perform();
//
//ash.get("https://demoqa.com/droppable");
//ash.manage().window().maximize();
//Point p = ash.findElement(By.xpath("//*[@id='droppable']")).getLocation();
//System.out.println(p);
//WebElement drag = ash.findElement(By.xpath("//*[@id='draggable']"));
//battu.dragAndDropBy(drag, 250,50).build().perform();
//battu.pause(5000).build().perform();
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	ash.close();
ash.quit();	
	}

}
