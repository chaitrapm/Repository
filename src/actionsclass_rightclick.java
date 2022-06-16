import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsclass_rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		 Actions act=new Actions(driver);
		// act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).build().perform();
		 act.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).build().perform();
	}

}