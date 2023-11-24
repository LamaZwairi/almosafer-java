import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class classtwo {
	
	WebDriver driver=new ChromeDriver();
	
	@BeforeTest
		
		
public void mysetup() {
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().window().maximize();
	
	}
	@Test()
	
	public void firsttestcase() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("#login-button")).click();
		List<WebElement> addtocart=driver.findElements(By.className("btn"));
		
		for(int i=0;i<addtocart.size();i++) {
			
			addtocart.get(i).click();
		}
		
		
		
	}

	
	
	
	@AfterTest
	
	public void Posttesting() {}

	
	

}
