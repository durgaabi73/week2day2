package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceforWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.get("https://qeagle-dev-ed.my.salesforce.com/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
        
        driver.findElement(By.id("password")).sendKeys("Leaf@1234");
        
        driver.findElement(By.id("Login")).click();
        Thread.sleep(3000);
        
      driver.findElement(By.className("slds-icon-waffle")).click();
      
        
        
        
        
        
        	
        
       
        
     
        
    
        
        
        
              
        

	}

}
