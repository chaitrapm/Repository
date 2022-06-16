import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class workingwithlinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.navigate().to("http://demowebshop.tricentis.com/");
driver.findElement(By.linkText("shopping")).click();
driver.findElement(By.partialLinkText("BOOK")).click();
	}

}
