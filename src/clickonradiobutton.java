import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickonradiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("http://demowebshop.tricentis.com/");
		 driver.findElement(By.xpath("//input[@value='1']")).click();
		 driver.findElement(By.xpath("//input[@value='2']")).click();
		 driver.findElement(By.xpath("//input[@value='3']")).click();
		 driver.findElement(By.xpath("//input[@value='4']")).click();
	}

}
