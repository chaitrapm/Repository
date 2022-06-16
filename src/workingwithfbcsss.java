import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithfbcsss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.findElement(By.className()]")).click();
      Thread.sleep(2000);
      driver.findElement(By.cssSelector("input[name'firstname']")).sendKeys("cha");
      driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("pm");
      driver.findElement(By.cssSelector("input[type='text']")).sendKeys("9900880408");
      driver.findElement(By.cssSelector("input[type='password']")).sendKeys("asd");
      driver.findElement(By.cssSelector("button[type='submit]")).click();
	}

}
