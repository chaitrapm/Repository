import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class workingwithlocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./Driver.geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("");
		driver.findElement(By.className("username")).sendKeys("chaitra");
		driver.findElement(By.className("password")).sendKeys("chaitra");
		driver.findElement(By.className("checkbox")).click();
		driver.findElement(By.name("b")).click();
		driver.findElement(By.className("button")).click();		
	}

}
