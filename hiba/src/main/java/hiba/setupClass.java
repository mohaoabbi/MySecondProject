package hiba;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class setupClass {
	
	static WebDriver driver;
	static String url, browser;
	
	public setupClass(WebDriver driver, String browser, String url) throws IOException {
		
		this.driver = driver;
		this.url = url;
		this.browser = browser;
		
		openBrowser(driver,  browser, url );
		
		
	}
	
	
	public static  WebDriver openBrowser(WebDriver driver, String browser, String url ) throws IOException {
		
		Properties ppt = new Properties();
		File file = new File(System.getProperty("user.dir")+"\\configuration.properties");
		FileInputStream files = new FileInputStream(file);
		ppt.load(files);
	    url = ppt.getProperty("URL");
		browser = ppt.getProperty("browser");
		if(browser.equalsIgnoreCase("firefox")) {
			driver =  new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
		
			}
	
	if(browser.equalsIgnoreCase("edge")) {
		driver =  new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	
		}
	if(browser.equalsIgnoreCase("ie")) {
		driver =  new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get(url);
	
		}
	if(browser.equalsIgnoreCase("chrome")) {
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	
		}
		return driver;
	}
	
	
	

}
