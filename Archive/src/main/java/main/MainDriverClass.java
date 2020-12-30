package main;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class MainDriverClass {
	
	
	
	WebDriver driver;
	
	
	@BeforeClass
	@Parameters(value = {"url" , "browserName"})
	public void initilizeBrwoser(String url, String browserName ) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Selenium Jar\\chromedriver.exe");
		driver=new ChromeDriver();		
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public WebDriver getDriver() {
		return driver;
	}



	public void setDriver(WebDriver driver) {
		this.driver = (RemoteWebDriver) driver;
	}
	
	@AfterClass
	public void closeBrowser() {
		getDriver().quit();
	}



	
	
	

}
