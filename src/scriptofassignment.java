import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scriptofassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
      
        driver.get("https://www.flipkart.com/");
        String flip=driver.getWindowHandle();
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi note 10 pro 128 gb, 6 gb ram");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       Thread.sleep(2000);
       Set<String> am=driver.getWindowHandles();
       for(String s:am)
       {
         if(!s.equals(flip)){
        	 driver.switchTo().window(s);
         }
       }
     String price= driver.findElement(By.xpath("(//div[contains(text(),'₹15,999')])[1]")).getText();
     System.out.println(price);
       driver.get("https://www.amazon.in/");
       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi note 10 pro 128 gb, 6 gb ram");
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       String print1= driver.findElement(By.xpath("(//span[contains(text(),'15,999')])[1]")).getText();
       System.out.println(print1);
       }
}
      
       
        //driver.findElement(By.xpath(""))*/

