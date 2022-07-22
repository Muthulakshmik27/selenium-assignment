package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFacebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     //   driver.findElement(By.xpath("//button[@id='Create New Account']")).click(); 
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name=\'firstname\']")).sendKeys("muthulakshmi");
		driver.findElement(By.xpath("//input[@name=\'lastname\']")).sendKeys("Krishnan");
        driver.findElement(By.xpath("//input[@name=\'reg_email__\']")).sendKeys("muthulakshmikrishnan27@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("muthulakshmikrishnan27@gmail.com");
        driver.findElement(By.xpath("//input[@name=\'reg_passwd__\']")).sendKeys("abcd@123");
	  //handle the dropdown
        
        WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

        Select date1 = new Select(date);
        Select month1 = new Select(month);
        Select year1 = new Select(year);

        date1.selectByIndex(26);
        month1.selectByValue("5");
        year1.selectByValue("1998");
        
        WebElement radiogender = driver.findElement(By.xpath("//label[text()='Female']"));
        radiogender.click();
        
     //   driver.findElement(By.xpath("//input[@type=\"radio\" and value=\"1\"]"));
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
            LoginFacebook lb=new LoginFacebook();
            System.out.println(lb);
}
}