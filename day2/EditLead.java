package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("durga");
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).click();
		
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[@class='submitbutton']")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Infosis");

		
		driver.findElement(By.xpath("//input[@name='submitbutton']")).click();
		
		System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
		
		driver.close();
		
		
		
		
		
	
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	
		
		
	
		
		

	}

}
