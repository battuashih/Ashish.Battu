package revision1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javapractise24october {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver ash = new ChromeDriver();
JavascriptExecutor ashh = (JavascriptExecutor) ash;
ashh.executeScript("window.location='https://demoqa.com/automation-practice-form'");
ash.manage().window().maximize();
String title = ashh.executeScript("return document.title").toString();
System.out.println(title);
String domain = ashh.executeScript("return document.domain").toString();
System.out.println(domain);
String url = ashh.executeScript("return document.URL").toString();
System.out.println(url);
String name = ashh.executeScript("return document.getElementById('userName-label').innerText").toString();
System.out.println(name);
String arg1 = ashh.executeScript("return document.getElementById('firstName').getAttribute('placeholder')").toString();      
System.out.println(arg1);
ashh.executeScript("document.getElementById('firstName').click();");
ashh.executeScript("document.getElementById('firstName').value='ashish'");
ashh.executeScript("window.scrollTo(0,700)");                                            
//ashh.executeScript("window.scrollTo(700,0)");                                                horizontal scroll
ashh.executeScript("window.scrollTo(0,document.body.scrollHeight)");
Thread.sleep(3000);
ashh.executeScript("window.scrollTo(document.body.scrollHeight,0)");
String h = ashh.executeScript("return window.innerHeight").toString();
System.out.println(h);
String w = ashh.executeScript("return window.innerWidth").toString();
System.out.println(w);
WebElement web = ash.findElement(By.id("firstName"));
ashh.executeScript("arguments[0].style.borderColor='red'",web); 
Thread.sleep(3000);
WebElement btn = ash.findElement(By.id("submit"));
ashh.executeScript("arguments[0].scrollIntoView(true);",btn);
//ashh.executeScript("alert(hello);");                                                                alert creation
ashh.executeScript("history.go(0)");
Thread.sleep(5000);



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	ash.close();
	ash.quit();
	}

}
