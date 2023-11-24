package MyTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyClass {
	
	ChromeDriver driver=new ChromeDriver();
			
	@BeforeTest
	public void MySetup() {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		
		
	}
	
	@Test()
public void Login()

{
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.name("password")).sendKeys("secret_sauce");

driver.findElement(By.id("login-button")).click();


}
	@AfterTest
	
	public void PostTrsting() {
		
		
		
	}
}
