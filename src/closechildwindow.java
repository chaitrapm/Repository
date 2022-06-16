import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closechildwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		String Demowindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(2000);
		Set<String> Facebookwindow=driver.getWindowHandles();
		for(String s: Facebookwindow)
		{
			if(!(s.equals(Demowindow)))
			{
				driver.switchTo().window(s);
				driver.close();
			}
	}

}
}
