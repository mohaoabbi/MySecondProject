package hiba;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home extends setupClass{
	
	public Home(WebDriver driver) throws IOException{
		
		super(driver, browser, url);
	}
	
	

public static void main(String[] args) throws IOException, InterruptedException {
	Home obj = new Home(driver);
	
	driver.findElement(By.id("homeval")).sendKeys("500000");
		
	}
}
