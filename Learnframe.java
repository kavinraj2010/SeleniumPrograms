package week3.day5;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnframe {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.xpath("//button"));
		button1.click();
		String name = button1.getText();
		System.out.println(name);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement button2 = driver.findElement(By.xpath("//button[@id='Click1']"));
		button2.click();
		String name1 = button2.getText();
		System.out.println(name1);
		driver.switchTo().defaultContent();
		
		java.util.List<WebElement> count = driver.findElements(By.tagName("iframe"));
		int frameCount = count.size();
		System.out.println("Number of Frame Tag is : "+frameCount);
		
		
		File source=driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./Images/LeafFrame.png");
		FileUtils.copyFile(source, des);
		
	}
}
