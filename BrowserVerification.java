package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserVerification {
public static void main(String[] args) {
	//WebDriverManager is used to download the driver andd set the path automatically
	WebDriverManager.chromedriver().setup();
	//to create object for ChromeDriver class
	ChromeDriver driver=new ChromeDriver();
	//to browse the given url
	driver.get("http://leafground.com/pages/Edit.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//title
	System.out.println("Page Title:"+driver.getTitle());
	
	//to verify
	if(driver.getTitle().contains("TestLeaf - Interact with Edit Fields"))
	{
		System.out.println("Title is corect");
	}
	else
	{
		System.err.println("Title is Wrong");
	}
	
	//get current url of the page
	System.out.println("The Current Page URL is:"+driver.getCurrentUrl());
	
	//get the current page source code
	//System.out.println("Source code of the page:"+driver.getPageSource());
	
	//get attribute value
	System.out.println("The value of the attribut:"+driver.findElement(By.name("username")).getAttribute("value"));
	
	//clear the  text
	driver.findElement(By.name("username")).clear();
	
	
	
	//driver.close();
	
	
}
}
