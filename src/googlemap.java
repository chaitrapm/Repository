import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.google.co.in/maps");
 driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
 driver.findElement(By.xpath("//input[@aria-controls='sbsg51']")).sendKeys("Banglore");
 driver.findElement(By.xpath("//input[@aria-controls='sbsg51']/../../..//button[@aria-label='Search']")).click();
	}

}
