import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("http://demowebshop.tricentis.com/");
		WebElement el=driver.findElement(By.xpath("//a[@class='ico-register']"));
		System.out.println(el.getAttribute("class"));
	   System.out.println(el.getCssValue("font-size"));
	   System.out.println(el.getSize());
	    System.out.println(el.getLocation());
		System.out.println(el.getRect());
		System.out.println(el.isEnabled());
		System.out.println(el.isSelected());
		System.out.println(el.isDisplayed());
		System.out.println(el.getTagName());
		System.out.println(el.getText());
	  	driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("computer");
	  	 WebElement ele= driver.findElement(By.xpath("//input[@value='Search']"));
		    ele.submit();
	    driver.findElement(By.xpath("//input[@value='Search store']")).clear();
	   // el.click();
       // List<WebElement> ele=driver.findElements(By.xpath("//input[@value='Search store']"));
	   
	}
}
