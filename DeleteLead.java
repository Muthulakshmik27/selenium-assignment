package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("demosalesmanager");
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class=\"decorativeSubmit\"]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	//click the lead button
    driver.findElement(By.xpath("//a[text()='Leads']")).click();
    driver.findElement(By.linkText("Find Leads")).click();
    driver.findElement(By.xpath("//span[text()='Phone']")).click();
    driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8056100692");
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    driver.findElement(By.xpath("//a[text()='14087']")).click();
    driver.findElement(By.xpath("//a[text()='Delete']")).click();
    driver.findElement(By.linkText("Find Leads")).click();
    driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys("14087");
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    String title=driver.getTitle();
    System.out.println(title);
    


}
}
