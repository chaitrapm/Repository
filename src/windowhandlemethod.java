import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		String windowhl=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Set<String> windowhds=driver.getWindowHandles();
		for(String s:windowhds)
		{
			if(!(s.equals(windowhl)))
			{
				driver.switchTo().window(s);
				driver.close();
			}
			/*else
			{
				driver.switchTo().window(s);
			}*/
		}
	}

}
