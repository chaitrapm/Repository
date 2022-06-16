import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class workingwithtext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("http://demowebshop.tricentis.com/");
         List<WebElement> l=driver.findElements(By.tagName("a"));
         for(WebElement wb:l)
         {
        	 System.out.println(wb.getText());
         }
	}
}


