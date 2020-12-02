package testPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Addprogram 
{
	static WebDriver driver;
	@Test
	public static void launchingBrowser()
	{
		String browser="chrome";
		//CHROME BROWSER
		if(browser=="chrome") {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krupa\\eclipse-workspace\\javaprograms\\Driversfolder\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		//FIREFOX BROWSER
		if(browser=="firefox") {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Krupa\\eclipse-workspace\\javaprograms\\Driversfolder\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		//INTERNET EXPLORER BROWSER
		if(browser=="ie") {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Krupa\\eclipse-workspace\\javaprograms\\Driversfolder\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		driver.get("https://www.google.com/");
		driver.close();
	}
}
