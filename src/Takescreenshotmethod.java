import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshotmethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://easemytrip.com/");
		WebElement popup=driver.findElement(By.xpath("//div[contains(text(),'questions')]"));
		if(popup.isDisplayed()){
			File Tem=popup.getScreenshotAs(OutputType.FILE);
			File d=new File("./screenshots/Temp.png");
			FileHandler.copy(Tem, d);
			//FileUtils.copyFile(Tem, d);
		}
	}

}
