package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSalesForce {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//div[@data-name='Sales']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Opportunities']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		String Name="Salesforce Automation by kavinraj";
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input[@name='Name']")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("2/19/2022");
		driver.findElement(By.xpath("//div//span[text()='--None--']")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String opportunityName = driver.findElement(By.xpath("//h1//lightning-formatted-text[@slot='primaryField']")).getText();
		if(Name.equalsIgnoreCase(opportunityName))
		{
			System.out.println("Testcase pass the opportunity name is:"+opportunityName);
		}
		else
		{
			System.out.println("Testcase fail Opportunity Name is:"+opportunityName);
		}		
	}
}
/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@123");
driver.findElement(By.xpath("//input[@id='Login']")).click();
driver.findElement(By.xpath("//span[text()='App Launcher']/parent::div")).click();
driver.findElement(By.xpath("//button[text()='View All']")).click();
driver.findElement(By.xpath("//div[@data-name='Sales']")).click();
//Thread.sleep(2000);
driver.findElement(By.xpath("//a[@title='Opportunities']//..")).click();
driver.findElement(By.xpath("//a[@title='New']")).click();
driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("'Salesforce Automation Gopinath");*/