import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Chromebrowserlunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
    driver.manage().window().maximize();
    //driver.get("http://demowebshop.tricentis.com/");
    driver.navigate().to("http://demowebshop.tricentis.com/"); 
    WebElement link=driver.findElement(By.tagName("a"));
    link.click();
   // driver.navigate().refresh();
    //driver.navigate().back();
    //driver.navigate().forward();
    //driver.close();
    //driver.quit();
   // WebElement register_link=driver.findElement(By.className("ico-register"));
   // register_link.click();
	}

}
