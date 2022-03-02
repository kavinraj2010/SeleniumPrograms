package week3.day3;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableLearning {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//get the count of columns
		java.util.List<WebElement> findElements = driver.findElements(By.tagName("th"));
		int countColumn = findElements.size();
		System.out.println("Column count: "+countColumn);
		
		//get the  count of rows
		java.util.List<WebElement> findElements2 = driver.findElements(By.tagName("tr"));
		int rowCount = findElements2.size();
		System.out.println("Row Count: "+rowCount);
		
		//get the progress value for the given text
		String text = driver.findElement(By.xpath("//td[text()='Learn to interact using Keyboard, Actions']/following-sibling::td[1]")).getText();
		System.out.println("Progress value :"+text);
		
		//print the coumn headings
		System.out.println("Table Headings :");
		System.out.println("");
		
		for (int i = 1; i <= countColumn; i++) {
			String text2 = driver.findElement(By.xpath("//tr/th["+i+"]")).getText();	
			System.out.println(text2);
		}
		
		
		//check the vital task for the least completed progress
		
		//to create a list
		java.util.List<Integer> value=new ArrayList<Integer>();
		
		for (int j = 2; j <= rowCount; j++) {
			String vitalValue = driver.findElement(By.xpath("//table[@id='table_id']//tr["+j+"]/td[2]")).getText();
			String text1 = vitalValue.replaceAll("%", "");
			int value1 = Integer.parseInt(text1);
			value.add(value1);
		}
		
		Integer min = Collections.min(value);
		
		System.out.println("Minimum progress Value:"+min);
		
		driver.findElement(By.xpath("//tr/td[contains(text(),'"+min+"')]/following-sibling::td/input")).click();
		
	}
}
