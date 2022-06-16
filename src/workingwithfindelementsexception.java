import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithfindelementsexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("http://demowebshop.tricentis.com/");
	      List<WebElement> le=driver.findElements(By.xpath("//a[text()='Facebook']"));
	     // le.contains("face");
         for(WebElement web:le)
         {
        	 System.out.println(le.contains("face"));
         }
	}

}
