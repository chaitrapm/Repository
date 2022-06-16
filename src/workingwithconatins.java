import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class workingwithconatins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("http://demowebshop.tricentis.com/");
		 driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		 WebElement el=driver.findElement(By.)
				 System.out.println(el.