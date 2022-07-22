package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to select one checkbox
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        //to confirm selenium is tick or not
        System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'])[6]")).isSelected());
}
}