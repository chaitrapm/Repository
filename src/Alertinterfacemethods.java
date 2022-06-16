import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertinterfacemethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.get("http://demowebshop.tricentis.com/");
          driver.findElement(By.xpath("//input[@value='Vote']")).click();
          Alert alert=driver.switchTo().alert();
          alert.accept();
          driver.close();
          
          
	}

}
