import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCase {
	
	String myname="ahmad";
	
	WebDriver driver=new ChromeDriver();
	
	
	@BeforeTest
	public void PreTesting() {
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
//System.out.println(myname + "hello I'm from pre");		
		
	}
	



@Test()
public void searchforlinkedin() {
	System.out.println(myname + "I'm from test");		
driver.findElement(By.id("APjFqb")).sendKeys("linkedin"+ Keys.ENTER);


}


@AfterTest
public void PostTesting() {
	
	System.out.println(myname + "from post");		

	
}
}
