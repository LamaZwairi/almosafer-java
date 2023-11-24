import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases extends Parameters{
	

	
	@BeforeTest
	public void setup () throws InterruptedException {
		
		driver.get(website);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	
	@Test()
	public void Logintest(){

		Login();
		add("Fleece","Onesie","Light");
		
	}
}
