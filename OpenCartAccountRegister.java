package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartAccountRegister {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("input-username")).sendKeys("Kavinraj2014");
		driver.findElement(By.id("input-firstname")).sendKeys("Kavinraj");
		driver.findElement(By.id("input-lastname")).sendKeys("S");
		driver.findElement(By.id("input-email")).sendKeys("kavinraj89444@gmail.com");
		WebElement dropDown1 = driver.findElement(By.id("input-country"));
		Select country=new Select(dropDown1);
		country.selectByVisibleText("India");
		driver.findElement(By.id("input-password")).sendKeys("Kavinraj1234");
		
		driver.close();
	}
}
