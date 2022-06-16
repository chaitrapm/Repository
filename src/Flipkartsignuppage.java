import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartsignuppage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("chaitrapmdvg12@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("chaitra99");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		//driver.findElement(By.xpath("//label[@class='_1fqY3P']")).sendKeys("9900880408");
		//driver.findElement(By.xpath("//input[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		
	}

}
