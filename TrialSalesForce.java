package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrialSalesForce {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("UserFirstName")).sendKeys("Kavinraj");
		driver.findElement(By.name("UserLastName")).sendKeys("S");
		driver.findElement(By.name("UserEmail")).sendKeys("kavinraj89444@gmail.com");
		WebElement dropDown1 = driver.findElement(By.name("UserTitle"));
		Select jobTitle=new Select(dropDown1);
		jobTitle.selectByVisibleText("Developer / Software Engineer / Analyst");
		driver.findElement(By.name("CompanyName")).sendKeys("Wipro Management");
		WebElement dropDown2 = driver.findElement(By.name("CompanyEmployees"));
		Select employees=new Select(dropDown2);
		employees.selectByValue("250");
		driver.findElement(By.name("UserPhone")).sendKeys("9080829503");
		driver.findElement(By.className("checkbox-ui")).click();
		
	}
}
