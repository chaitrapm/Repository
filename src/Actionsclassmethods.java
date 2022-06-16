import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclassmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://www.myntra.com/");
		 Actions act=new Actions(driver);
		 act.moveToElement(driver.findElement(By.xpath("//a[@data-group='men']"))).build().perform();
		 act.click(driver.findElement(By.xpath("//a[@data-reactid='31']"))).build().perform();
	}

}
