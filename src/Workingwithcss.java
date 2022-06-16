import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Workingwithcss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("http://demowebshop.tricentis.com/");
		  String username="cha";
		  Srting password="df";
		  driver.findElement(By.cssSelector("input[class='username']")).sendKeys(username);
		  driver.findElement(By.cssSelector("input[class='username']")).sendKeys(password);
		  driver.findElement(By.cssSelector("input[class='checkbox']")).click();
		  driver.findElement(By.cssSelector("input[name='b']")).click();
		  driver.findElement(By.cssSelector("Password")).sendKeys("cha557");
		
	

}
