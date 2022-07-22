package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {    
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
        //click Leads
        driver.findElement(By.linkText("Leads")).click();
        //click find leads
        driver.findElement(By.linkText("Find Leads")).click();
        //Enter firstname
        driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Lakshmi");
        //click find leads button
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        driver.findElement(By.xpath("//a[text()='10901']")).click();
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
        driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Edtech Platform");
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        String title=driver.getTitle();
        System.out.println(title);
        driver.close();  
 
      
	}
}
