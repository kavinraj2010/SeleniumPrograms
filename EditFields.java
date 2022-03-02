package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {
public static void main(String[] args) {
	//WebDriverManager is used to download the driver andd set the path automatically
			WebDriverManager.chromedriver().setup();
			
			//to create object for ChromeDriver class
			ChromeDriver driver=new ChromeDriver();
			
			//to browse the given URL
			driver.get("http://leafground.com/pages/Edit.html");
			
			//to maximize the window size
			driver.manage().window().maximize();
			
			//to wait one performance for given seconds before that finish it will move to next
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			//enter email id
			driver.findElement(By.id("email")).sendKeys("kavinraj89444@gmail.com");
			 
			//Append  a text and press keys.TAB
			driver.findElement(By.xpath("//input[@value='Append ']")).clear();
			driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Kavinraj",Keys.TAB);
			
			//Get the default text
			System.out.println("The default text is:"+driver.findElement(By.name("username")).getAttribute("value"));
			
			//clear the text
			driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
			
			//check the input field is disabled or not
			System.out.println("Print false if the textbox is disabled:"+driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled());
			
			
}
}
