package PackageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestOne {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().version("95.0.4638.54").setup();
		WebDriver driver = new ChromeDriver();	
		WebDriverManager.firefoxdriver().setup();
		WebDriver fox = new FirefoxDriver();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
			

	}

}
