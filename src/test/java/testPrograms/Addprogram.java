package testPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Addprogram 
{
	@Test
	public static void methodOne()
	{
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krupa\\eclipse-workspace\\javaprograms\\Driversfolder\\chromedriver.exe");
		//	WebDriver driver= new ChromeDriver();

		//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Krupa\\eclipse-workspace\\javaprograms\\Driversfolder\\geckodriver.exe");
		//		WebDriver driver= new FirefoxDriver();

		System.setProperty("webdriver.ie.driver", "C:\\Users\\Krupa\\eclipse-workspace\\javaprograms\\Driversfolder\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("https://www.google.com/");
	}
}
