import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithaddtocart {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@class='button-1 cart-button']")).click();
		driver.findElement(By.xpath("//span[@class='close']")).click();
		driver.findElement(By.xpath("//span[@class='cart-qt']")).click();
	}

}
