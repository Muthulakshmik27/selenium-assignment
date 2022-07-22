package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
        driver.navigate().to("http://www.leafground.com/pages/Link.html");
       System.out.println(driver.findElement(By.xpath("//a[contains(text(),'without clicking me')]")).getAttribute("href"));
       driver.navigate().to("http://www.leafground.com/pages/Link.html");
       driver.findElement(By.linkText("Verify am I broken?")).click();
       System.out.println(driver.findElement(By.xpath("//a[contains(text(),'How many links')]")).getAttribute("href"));
       driver.navigate().to("http://www.leafground.com/pages/Link.html");

}
}