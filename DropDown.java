package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement dd1=driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select drop1=new Select(dd1);
		drop1.selectByIndex(1);
		
		WebElement dd2=driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select drop2=new Select(dd2);
		drop2.selectByVisibleText("Appium");
		
		WebElement dd3=driver.findElement(By.xpath("//select[@name='dropdown3']"));
		Select drop3=new Select(dd3);
		drop3.selectByValue("3");
}
}