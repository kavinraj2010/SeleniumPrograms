package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	 driver.get("http://www.leafground.com/pages/Dropdown.html");
	 driver.manage().window().maximize();
	 
	 WebElement Dropdown1=driver.findElement(By.id("dropdown1"));
	 Select index=new Select(Dropdown1);
	 index.selectByIndex(1);
	 
	 WebElement Dropdown2=driver.findElement(By.name("dropdown2"));
	 Select  index1=new Select(Dropdown2);
	 index1.selectByValue("2");
	 
	 WebElement Dropdown3=driver.findElement(By.name("dropdown3"));
	 Select text=new Select(Dropdown3);
	 text.selectByVisibleText("UFT/QTP");	 
}
}
