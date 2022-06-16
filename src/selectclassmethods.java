import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclassmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("http://demowebshop.tricentis.com/");
		 driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		 Thread.sleep(2000);
		// WebElement dropdown=driver.findElement(By.id("products-orderby"));
		   Select sortdropdown=new Select(driver.findElement(By.id("products-orderby")));
		  // sortdropdown.selectByVisibleText("Name: A to Z");
		  /* Select sortdropdown1=new Select(dropdown);
		   Thread.sleep(2000);
		   sortdropdown1.selectByVisibleText("Name: Z to A");
		   Select sortdropdown2=new Select(dropdown);
           sortdropdown2.selectByVisibleText("Price: Low to High");
           Select sortdropdown3=new Select(dropdown);
		   sortdropdown3.selectByVisibleText("Price: High to Low");
		   Select sortdropdown4=new Select(dropdown);
		   sortdropdown4.selectByVisibleText("Created on");*/
		  // Select sortdropdown5=new Select(dropdown);
		 //  sortdropdown5.selectByVisibleText("Position");
		   List<WebElement> optionlist=sortdropdown.getOptions();
		   for(int i=0; i<optionlist.size(); i++)
		   {
			   Select sortdropdown2=new Select(driver.findElement(By.id("products-orderby")));
			   sortdropdown2.selectByIndex(i);
		   }
		  
	}
}