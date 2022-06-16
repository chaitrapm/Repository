import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class selectclassgetoptionmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("http://demowebshop.tricentis.com/");
		 driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		 Thread.sleep(2000);
		 WebElement dropdown=driver.findElement(By.id("products-orderby"));
		 Select sortdropdown=new Select(dropdown);
		// sortdropdown.selectByValue("http://demowebshop.tricentis.com/books?orderby=5");
		 List<WebElement> options=sortdropdown.getOptions();
		 for(WebElement wbb:options){
			 
			 System.out.println(wbb.getText());
		 }
	}
}


