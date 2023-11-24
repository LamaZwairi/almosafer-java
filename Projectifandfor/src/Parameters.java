import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameters {
	
	static WebDriver driver=new ChromeDriver();
	
	static String website="https://www.saucedemo.com/";
	static String username="standard_user";
	static String Password="secret_sauce";
	
	static void Login() {
		
		WebElement usernameInput=driver.findElement(By.id("user-name"));
		WebElement passwordInput=driver.findElement(By.id("password"));
		WebElement LoginButton=driver.findElement(By.id("login-button"));

		usernameInput.sendKeys(username);
		passwordInput.sendKeys(Password);
		LoginButton.click();
		
		
	}
	 static void add(String ...items) {
		 
		  List<WebElement> addtocart=driver.findElements(By.className("btn"));
		  List<WebElement> Productnames=driver.findElements(By.className("inventory_item_name"));
			
		  
		  for(int i=0;i<Productnames.size();i++) {
			  String Productname= Productnames.get(i).getText();
			  System.out.print(Productname);
			  if(containitemname( Productname,items)) {		  
			  addtocart.get(i).click();}
		  }}
			  
			  private static boolean containitemname(String str,String...subString) {
			  }
			  
			  //to add one item and skip the other
			  
			//for(int i=0;i<addtocart.size();i++) {
				//if(i%2==0) {
					
				//addtocart.get(i).click();
				//}
				//continue;//for(int i=0;i<addtocart.size();i++) {
				//if(i%2==0) {
				
				//addtocart.get(i).click();
				//}
				//continue;
		  }
			}
	 }
	
	


