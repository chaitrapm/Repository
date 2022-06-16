import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class workingwithtcforcss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
   driver.get("demowebshop.tricentis.com/");
  /* driver.findElement(By.className("input[type='text']")).sendKeys("computer");
   driver.findElement(By.cssSelector("input[value='Search']")).click();
   try
   {
	   if(driver.findElement(By.cssSelector("a[title='Build your own cheap computer']")).isDisplayed())
   {
   System.out.println("computer is displayed");
	}
   }
   catch(NoSuchElementfoundexception e)
   {
	   System.out.println("TC is fail");
   }*/
	}
}


