package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
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
        //click create lead
        driver.findElement(By.linkText("Create Lead")).click();
        //Enter the company name
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Muthu");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lakshmi");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Muthu");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Non IT to IT");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Testleaf is a good institute");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("muthulakshmikrishnan27@gmail.com");
 
      //handle the dropdown
        WebElement web = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
       //ctrl+2+l findElement returns WebElement
       Select drop1=new Select(web);
       //Select By visible text
      //drop1.selectByVisibleText("Conference");
       //Select By value
      // drop1.selectByValue("LEAD_DIRECTMAIL");
       //Select by index
       drop1.selectByVisibleText("New York");
       driver.findElement(By.name("submitButton"));
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.className("subMenuButton")).click();
        driver.findElement(By.id("createLeadForm_companyName")).clear();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Edtech Platform");
        driver.findElement(By.id("createLeadForm_firstName")).clear();
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("");
        driver.findElement(By.name("submitButton"));
        String title1=driver.getTitle();
		System.out.println(title1);
        


	}
}
