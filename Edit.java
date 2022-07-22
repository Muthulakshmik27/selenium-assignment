package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter your email address
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("muthulakshmikrishnan27@gmail.com");	
		//Append a text and press keyboard tab
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("append",Keys.TAB);
		//Get default text entered
		System.out.println(driver.findElement(By.xpath("//input[@name='username']")).isDisplayed());		
		//clear the text
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		//Confirm that edit field is disabled
		System.out.println(driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled());
		
} 
}