import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clcikonpracticepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	       driver.findElement(By.xpath("//button[text()='Open Window']")).click();
	      // driver.findElement(By.xpath("//div[@style='position: absolute; inset: 0px; box-shadow: rgba(0, 0, 0, 0) 0px 0px 0px inset;']")).click();
	       driver.findElement(By.xpath("//span[text()='Register']")).click();
	      driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("chaitra");
	       driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("chaitrapmdvg222gmail.com");
	       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("chai123");
	       driver.findElement(By.xpath("//input[@name='commit']")).click();
	       String Demowindow=driver.getWindowHandle();
			driver.findElement(By.xpath("http://www.qaclickacademy.com")).click();
			Set<String> Facebookwindow=driver.getWindowHandles();
			for(String s: Facebookwindow)
			{
				if(!(s.equals(Demowindow)))
				{
					driver.switchTo().window(s);
					driver.close();
				}
	}
			driver.findElement(By.xpath("//a[@id='opentab']")).click();

}
}