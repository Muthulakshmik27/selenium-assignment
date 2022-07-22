package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click button to travel home page
		driver.findElement(By.xpath("//button[@id='home']")).click();
		//Find position of button (x,y)
		System.out.println(driver.findElement(By.xpath("//button[@id='position']")).getLocation());
		//Find button color
		System.out.println(driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color"));
		//Find the height and width
		System.out.println(driver.findElement(By.xpath("//button[@id='size']")).getSize());
}
}