import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithabsoulte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver(); 
driver.get("http://demowebshop.tricentis.com/");
driver.findElement(By.xpath("//a[@class='ico-login']")).click();
driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("chaitra@gmail.com");
driver.findElement(By.xpath("//input[@class='password']")).sendKeys("as");
driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
