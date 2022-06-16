	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class workingwithvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
  WebDriver driver=new FirefoxDriver();
  driver.manage().window().maximize();
  driver.get("http://demowebshop.tricentis.com/");
  String title=driver.getTitle();
  if(title.contains("demo")){
	  System.out.println("demo app is open");
  }
  driver.findElement(By.className("ico-register")).click();
  String regtitle=driver.getCurrentUrl();
  if(regtitle.contains("register")){
	  System.out.println("register page is open");
  }
  driver.findElement(By.id("gender-female")).click();
  driver.findElement(By.id("FirstName")).sendKeys("cjkc");
  driver.findElement(By.id("LastName")).sendKeys("rgp");
  driver.findElement(By.id("Email")).sendKeys("ccesdfty@testyantra.com");
  driver.findElement(By.id("Password")).sendKeys("cha557");
  driver.findElement(By.id("ConfirmPassword")).sendKeys("cha557");
  driver.findElement(By.id("register-button")).click();
 if(driver.findElement(By.className("ico-logout")).isDisplayed()){
	 System.out.println("user is registered");
 }
  
	}

	
}
