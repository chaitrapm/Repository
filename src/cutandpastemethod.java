import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cutandpastemethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/");
       WebElement el=driver.findElement(By.xpath("//input[@id='email']"));
       el.sendKeys("chaitra");
      // Actions act=new Actions(driver);
       el.sendKeys(Keys.CONTROL+"a");
       Thread.sleep(2000);
       el.sendKeys(Keys.CONTROL+"c");
       Thread.sleep(2000);
       el.sendKeys(Keys.CONTROL+"x");
       WebElement ele=driver.findElement(By.xpath("//input[@id='pass']"));
       Thread.sleep(2000);
       ele.sendKeys(Keys.CONTROL+"v");
       
	}

}
/*");
ele.sendKeys(Keys.CONTROL+"a");
Thread.sleep(2000);
ele.sendKeys(Keys.BACK_SPACE);*/