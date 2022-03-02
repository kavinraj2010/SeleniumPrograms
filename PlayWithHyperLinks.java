package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithHyperLinks {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		//check go to home page
		driver.findElement(By.partialLinkText("Go to Home Page")).click();
		if(driver.getTitle().contains("TestLeaf - Selenium Playground"))
		{
			System.out.println("Testcase Pass the title is:"+driver.getTitle());
		}
		else
		{
			System.err.println("Testcase Fail");
		}
		
		driver.get("http://leafground.com/pages/Link.html");
		
		//get the page url
		System.out.println(driver.findElement(By.partialLinkText("Find where am")).getAttribute("href"));
		
		//
	}
}
