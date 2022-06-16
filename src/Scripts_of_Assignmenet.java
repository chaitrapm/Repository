import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scripts_of_Assignmenet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("phones");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'Infinix HOT 12 Play (Daylight Green, 64 GB)')]")).click();//phone
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();//cart
        driver.findElement(By.xpath("//div[@class='KK-o3G']")).click();//cart page
        driver.findElement(By.xpath("//button[@class='_23FHuj'][2]")).click();//qty
       // driver.findElement(By.xpath("//span[@class='_2-ut7f _1WpvJ7']")).getText();
	}

}