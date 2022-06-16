import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Workingwithid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.get("http://demowebshop.tricentis.com/");
       driver.manage().window().maximize();
       driver.findElement(By.className("ico-register")).click();
       driver.findElement(By.id("gender-female")).click();
       driver.findElement(By.id("FirstName")).sendKeys("chaitra");
       driver.findElement(By.id("LastName")).sendKeys("pm");
       driver.findElement(By.id("Email")).sendKeys("chaitra@testyantra.com");
       driver.findElement(By.id("Password")).sendKeys("chaitra");
       driver.findElement(By.id("ConfirmPassword")).sendKeys("chaitra");
       driver.findElement(By.id("register-button")).click();
       driver.close();
	}
	
}


