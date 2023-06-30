package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("durga");
		driver.findElement(By.name("lastname")).sendKeys("abi");
		driver.findElement(By.name("reg_email__")).sendKeys("9585175855");
		driver.findElement(By.id("password_step_input")).sendKeys("durga06");
		
		WebElement date= driver.findElement(By.id("day"));
		Select drop1= new Select(date);
		drop1.selectByIndex(5);
		
		WebElement month = driver.findElement(By.id("month"));
		Select drop2= new Select (month);
		drop2.selectByIndex(6);
		
		WebElement year = driver.findElement(By.id("year"));
		Select drop3= new Select(year);
		drop3.selectByValue("1998");
		
		driver.findElement(By.className("_58mt")).click();
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	


