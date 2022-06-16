import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
		 JavascriptExecutor executor=(JavascriptExecutor)driver;
		 executor.executeScript("Window.scrollBy(0,1000);");
		// executor.executeScript("Window.scrollBy(0,-1000);");
	}

}
