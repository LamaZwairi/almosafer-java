package almosafer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcasesforalmmosafer {
	String url = "https://global.almosafer.com/en";
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void setup() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get(url);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/button[1]")).click();

	}

	@Test(priority = 1)
	public void testthelanguage() {
		String websitelanguage = driver.findElement(By.tagName("html")).getAttribute("lang");
		Assert.assertEquals(websitelanguage, "en", "this is to test the language");
		System.out.println(websitelanguage);

	}

	@Test(priority = 2)
	public void testthecurrency() {
		String websitecurrency = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button")).getText();
		Assert.assertEquals(websitecurrency, "SAR", "this is to test the currency");
System.out.println(websitecurrency);
	}

	@AfterTest

	public void posttest() {
	}

}
