package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditButton {
	public static void main(String[] args) {
		//WebDriverManager is used to download the driver andd set the path automatically
		WebDriverManager.chromedriver().setup();
		
		//to create object for ChromeDriver class
		ChromeDriver driver=new ChromeDriver();
		
		//to browse the given url
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//position of button(x,y)
		System.out.println("The Position of the button:"+driver.findElement(By.id("position")).getLocation());
		
		//Find the color of the button
		System.out.println("The color of the button:"+driver.findElement(By.id("color")).getCssValue("background-color"));
		
		//Find the width and height of the button
		System.out.println("The width and height of the button:"+driver.findElement(By.id("size")).getSize());
		
		//to click travel to home page
				driver.findElement(By.id("home")).click();
				String title="TestLeaf - Selenium Playground";
					if(driver.getTitle().contains(title))
					{
						System.out.println("The title is correct: "+title);
					}
					else
					{
						System.err.println("The title is wrong"+driver.getTitle());
					}
	}

}