import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehoverondemowebshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("http://demowebshop.tricentis.com/");
            Actions act=new Actions(driver);
           act.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"))).build().perform();
	     act.click(driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"))).build().perform();
	     act.click(driver.findElement(By.xpath("//a[text()='Build your own cheap computer']"))).build().perform();
	act.click(driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']"))).build().perform();
	}
}