package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public WebDriver driver;

	public void initialize(String url , String browser) {
		switch (browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			break;
		case "FF":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(url);
			break;
		}
	}

	@BeforeMethod
	public void setUp() {		
		initialize("https://www.google.com" , "Chrome");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
